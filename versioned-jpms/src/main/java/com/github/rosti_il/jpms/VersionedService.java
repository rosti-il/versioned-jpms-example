package com.github.rosti_il.jpms;

/**
 * You can't use a real service interface from another module here because this module can't declare
 * <b><code>'use'</code></b> of such an interface in its <b><code>module-info.java</code></b>. Your service
 * interfaces in other modules must implement this interface. This is the only way I found.
 *
 * @author Rostislav Krasny
 * */
public interface VersionedService {
}
