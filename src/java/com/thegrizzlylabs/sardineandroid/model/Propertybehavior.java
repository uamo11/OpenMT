package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Namespace(prefix = "D", reference = "DAV:")
@Root
/* loaded from: classes.dex */
public class Propertybehavior {
    public Keepalive keepalive;
    public Omit omit;

    public Omit getOmit() {
        return this.omit;
    }

    public void setOmit(Omit omit) {
        this.omit = omit;
    }

    public Keepalive getKeepalive() {
        return this.keepalive;
    }

    public void setKeepalive(Keepalive keepalive) {
        this.keepalive = keepalive;
    }
}
