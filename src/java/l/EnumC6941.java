package l;

import java.util.Iterator;
import java.util.Set;

/* compiled from: C7LA */
/* renamed from: l.ۜᩴ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC6941 {
    SYNTHETIC(4096),
    MANDATED(32768);


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f21405;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18749(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC6941) it.next()).f21405;
        }
        return i;
    }

    EnumC6941(int i) {
        this.f21405 = i;
    }
}
