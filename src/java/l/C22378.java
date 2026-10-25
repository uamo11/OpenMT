package l;

import java.net.InetAddress;

/* compiled from: C650 */
/* renamed from: l.᩹ܺ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22378 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4739 f72525;

    public C22378(C4739 c4739) {
        this.f72525 = c4739;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50242(String str) {
        if (!InetAddress.getByName(str).isSiteLocalAddress()) {
            return str;
        }
        InetAddress m15541 = this.f72525.m15541();
        return !m15541.isSiteLocalAddress() ? m15541.getHostAddress() : str;
    }
}
