import com.example.module.pagaz.impl.PagazImpl;
import com.github.rosti_il.jpms.VersionedService;

module pagaz {
    requires pagaz.base;
    provides VersionedService with PagazImpl;
}
