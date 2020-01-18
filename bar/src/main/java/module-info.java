import com.github.rosti_il.jpms.VersionedModules;

@VersionedModules(modules = {"baz:3.1", "pagaz:3.2"})
module bar {
    exports com.example.module.bar;
    requires baz.base;
    requires pagaz.base;
}
