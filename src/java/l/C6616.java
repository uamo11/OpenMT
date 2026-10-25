package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: R790 */
/* renamed from: l.ۜ۟ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6616 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f20368;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f20369;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f20371;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f20370 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f20367 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m18140(C6616 c6616, int i) {
        int i2;
        c6616.getClass();
        ArrayList arrayList = new ArrayList();
        for (C2383 c2383 : c6616.f20370.values()) {
            i2 = c2383.f7589;
            if (i2 == i) {
                arrayList.add(c2383);
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18139(C6616 c6616, C2383 c2383) {
        int i;
        HashMap hashMap = c6616.f20370;
        i = c2383.f7592;
        hashMap.put(Integer.valueOf(i), c2383);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m18146(C6616 c6616) {
        long j;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        Iterator it = c6616.m18135().iterator();
        while (it.hasNext()) {
            C2383 c2383 = (C2383) it.next();
            j = c2383.f7591;
            if (j > 0) {
                z = c2383.f7590;
                if (!z) {
                    z2 = c2383.f7588;
                    if (!z2) {
                        long j8 = c6616.f20369;
                        if (j8 > 0) {
                            long j9 = c6616.f20371;
                            if (j9 > 0) {
                                j4 = C0265.m1555(j8, j9);
                                c2383.f7593 = j4;
                            }
                        }
                        j2 = c2383.f7595;
                        if (j2 > 0 && c6616.f20371 > 0) {
                            j7 = c2383.f7595;
                            j4 = C0265.m1555(j7, c6616.f20371);
                        } else {
                            j3 = c2383.f7594;
                            if (j3 > 0) {
                                j5 = c2383.f7594;
                                j6 = c2383.f7591;
                                j4 = C0265.m1555(j5, j6);
                            } else {
                                j4 = -9223372036854775807L;
                            }
                        }
                        c2383.f7593 = j4;
                    }
                }
            }
            throw new C19317();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m18145(C6616 c6616) {
        boolean z;
        if (c6616.f20368) {
            return true;
        }
        Iterator it = c6616.f20370.values().iterator();
        while (it.hasNext()) {
            z = ((C2383) it.next()).f7588;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList m18135() {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        for (C2383 c2383 : this.f20370.values()) {
            i = c2383.f7589;
            if (i != 1) {
                i2 = c2383.f7589;
                if (i2 == 2) {
                }
            }
            arrayList.add(c2383);
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14376 m18137(C6616 c6616, int i) {
        return (C14376) c6616.f20367.get(Integer.valueOf(i));
    }
}
