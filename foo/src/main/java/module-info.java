import com.github.rosti_il.jpms.VersionedModules;

@VersionedModules(modules = {"baz:2.1"})
module foo {
    exports com.example.module.foo;
    requires baz.base;
}
