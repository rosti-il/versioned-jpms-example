import com.example.module.pagaz.base.Pagaz;

module pagaz.base {
    requires transitive com.github.rosti_il.jpms;

    exports com.example.module.pagaz.base;

    uses Pagaz;
}
