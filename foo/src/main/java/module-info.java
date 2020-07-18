import com.github.rosti_il.jpms.VersionedModule;
import com.github.rosti_il.jpms.Dependencies;

@Dependencies(modules = {
        @VersionedModule(name = "baz", version = "2.1"),
        @VersionedModule(name = "pagaz", version = "2.5")
})
module foo {
    exports com.example.module.foo;
    requires baz.base;
    requires pagaz.base;
}
