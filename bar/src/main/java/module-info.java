import com.example.jpms.version.VersionedModules;

@VersionedModules(modules = {"baz:3.1"})
module bar {
    exports com.example.module.bar;
    requires baz.base;
}
