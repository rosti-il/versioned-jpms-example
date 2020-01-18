package com.github.rosti_il.jpms;

import java.lang.module.ModuleFinder;
import java.nio.file.Paths;
import java.util.ServiceLoader;
import java.util.Set;

public class VersionedModuleProvider {

    public static <T extends VersionedService> T getService(Class<T> clazz) {
        var callerClass = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE).getCallerClass();
        var callerModule = callerClass.getModule();
        var parent = callerModule.getLayer();
        var versionedModules = callerModule.getAnnotation(VersionedModules.class);

        if (versionedModules != null) {
            for (String moduleDef : versionedModules.modules()) {
                var delimiterIdx = moduleDef.indexOf(':');
                var module = moduleDef.substring(0, delimiterIdx);
                var from = Paths.get(module + '-' + moduleDef.substring(delimiterIdx + 1) + ".jar");
                var cf = parent.configuration().resolve(ModuleFinder.of(from), ModuleFinder.of(), Set.of(module));
                var layer = parent.defineModulesWithOneLoader(cf, ClassLoader.getSystemClassLoader());
                var services = ServiceLoader.load(layer, VersionedService.class);

                VersionedService service = services.findFirst().get();
                if (!clazz.isInstance(service)) {
                    continue;
                }

                return (T) service;
            }
        }

        throw new RuntimeException("module not found");
    }
}
