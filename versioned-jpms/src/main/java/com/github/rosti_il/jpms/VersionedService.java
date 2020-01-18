package com.github.rosti_il.jpms;

/**
 * You can't use a real service interface from another module in this one, because this module can't declare
 * <b><code>'use'</code></b> of such an interface in the local <b><code>module-info.java</code></b>. Your service
 * interfaces in other modules must implement this interface. This is the only way I found.
 * */
public interface VersionedService {
}
