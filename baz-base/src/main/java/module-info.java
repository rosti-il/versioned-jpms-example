import com.example.module.baz.base.Baz;

module baz.base {
    requires transitive com.github.rosti_il.jpms;

    exports com.example.module.baz.base;

    uses Baz;
}
