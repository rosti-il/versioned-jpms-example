import com.example.module.baz.base.Baz;

module baz.base {
    exports com.example.module.baz.base;
    exports com.example.jpms.version;

    uses Baz;
}
