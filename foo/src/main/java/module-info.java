import com.example.jpms.version.VersionedModules;

@VersionedModules(modules = {"baz:2.1"})
module foo {
    exports com.example.module.foo;
    requires baz.base;
}
