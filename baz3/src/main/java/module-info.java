import com.example.module.baz.base.Baz;
import com.example.module.baz.impl.BazImpl;

module baz {
    requires baz.base;
    provides Baz with BazImpl;
}
