import com.example.module.baz.impl.BazImpl;
import com.github.rosti_il.jpms.VersionedService;

module baz {
    requires baz.base;
    provides VersionedService with BazImpl;
}
