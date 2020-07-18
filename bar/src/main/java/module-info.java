import com.github.rosti_il.jpms.Dependencies;
import com.github.rosti_il.jpms.VersionedModule;

@Dependencies(modules = {
        @VersionedModule(name = "baz", version = "3.1"),
        @VersionedModule(name = "pagaz", version = "3.2")
})
module bar {
    exports com.example.module.bar;
    requires baz.base;
    requires pagaz.base;
}
