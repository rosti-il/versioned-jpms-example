package com.example.module.baz.base;

import java.lang.module.ModuleFinder;
import java.nio.file.Paths;
import java.util.ServiceLoader;
import java.util.Set;

public class BazProvider {
    public static Baz getBaz(String from, String module) {
        var finder = ModuleFinder.of(Paths.get(from));
        var parent = ModuleLayer.boot();
        var cf = parent.configuration().resolve(finder, ModuleFinder.of(), Set.of(module));
        var layer = parent.defineModulesWithOneLoader(cf, ClassLoader.getSystemClassLoader());
        var services = ServiceLoader.load(layer, Baz.class);
        return services.findFirst().get();
    }
}
