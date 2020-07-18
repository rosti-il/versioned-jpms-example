package com.github.rosti_il.jpms;

import java.lang.module.ModuleFinder;
import java.nio.file.Paths;
import java.util.ServiceLoader;
import java.util.Set;

/**
 * @author Rostislav Krasny
 * */
public class VersionedModuleProvider {

    public static <T extends VersionedService> T getService(Class<T> serviceClass) {
        var callerClass = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE).getCallerClass();
        var callerModule = callerClass.getModule();
        var versionedDependencyModules = callerModule.getAnnotation(Dependencies.class);

        if (versionedDependencyModules != null) {
            var callerModuleLayer = callerModule.getLayer();

            for (var moduleDef : versionedDependencyModules.modules()) {
                var moduleArtifactPath = Paths.get(moduleDef.name() + '-' + moduleDef.version() + ".jar");
                var moduleConfig = callerModuleLayer.configuration().resolve(ModuleFinder.of(moduleArtifactPath), ModuleFinder.of(), Set.of(moduleDef.name()));
                var moduleLayer = callerModuleLayer.defineModulesWithOneLoader(moduleConfig, ClassLoader.getSystemClassLoader());
                var moduleVersionedServices = ServiceLoader.load(moduleLayer, VersionedService.class);

                var service = moduleVersionedServices.findFirst();
                if (service.filter(serviceClass::isInstance).isPresent()) {
                    return (T) service.get();
                }
            }
        }

        throw new RuntimeException("module not found");
    }
}
