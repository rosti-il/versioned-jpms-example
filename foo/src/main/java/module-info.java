import com.github.rosti_il.jpms.VersionedModules;

@VersionedModules(modules = {"baz:2.1", "pagaz:2.5"})
module foo {
    exports com.example.module.foo;
    requires baz.base;
    requires pagaz.base;
}
