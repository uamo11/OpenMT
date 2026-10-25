package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Q77G */
/* renamed from: l.᩻ܽۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23816 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m52503(InterfaceC21211 interfaceC21211) {
        C10130 c10130 = new C10130(256);
        c10130.writeInt(1);
        c10130.m25425(interfaceC21211.mo29412());
        c10130.m25425(interfaceC21211.mo29405());
        c10130.m25425(interfaceC21211.mo29411());
        c10130.m25425(interfaceC21211.mo29408());
        c10130.writeInt(interfaceC21211.getParent());
        ArrayList arrayList = new ArrayList(interfaceC21211.mo29409());
        Iterator it = interfaceC21211.values().iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC1454) it.next());
        }
        if (!interfaceC21211.mo29412() ? false : "style".equals(C2692.m8425(interfaceC21211.getType().getTypeName()))) {
            C6083.sort(arrayList, C8200.comparingInt(new C11117(0)));
        }
        c10130.writeInt(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC1454 interfaceC1454 = (InterfaceC1454) it2.next();
            c10130.writeInt(interfaceC1454.mo5006());
            c10130.writeInt(interfaceC1454.mo5004());
            if (interfaceC1454.mo5009() && interfaceC1454.mo5008() != null) {
                c10130.writeInt(0);
                c10130.m25425(true);
                InterfaceC3571 mo5008 = interfaceC1454.mo5008();
                c10130.m25423((CharSequence) mo5008.getValue());
                C21916[] mo10322 = mo5008.mo10322();
                c10130.writeInt(mo10322 == null ? 0 : mo10322.length);
                if (mo10322 != null) {
                    for (C21916 c21916 : mo10322) {
                        c10130.m25442(c21916.f70169);
                        c10130.writeInt(c21916.f70168);
                        c10130.writeInt(c21916.f70167);
                    }
                }
            } else {
                c10130.writeInt(interfaceC1454.getValue());
                c10130.writeByte(0);
            }
        }
        return c10130.m25444();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52500(byte[] bArr) {
        return C14460.m34531(C14460.m34532().digest(bArr)).substring(0, 16);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18172 m52501(InterfaceC7099 interfaceC7099, int i, byte[] bArr) {
        C17466 c17466;
        try {
            C12951 c12951 = new C12951(bArr);
            if (c12951.readInt() != 1) {
                throw new IOException("Unsupported resource entry payload version");
            }
            boolean m31498 = c12951.m31498();
            boolean m314982 = c12951.m31498();
            boolean m314983 = c12951.m31498();
            boolean m314984 = c12951.m31498();
            int readInt = c12951.readInt();
            int readInt2 = c12951.readInt();
            if (readInt2 >= 0) {
                int i2 = 100000;
                if (readInt2 <= 100000) {
                    ArrayList arrayList = new ArrayList(readInt2);
                    C18172 c18172 = new C18172(interfaceC7099, i, m31498, m314982, m314983, m314984, readInt, arrayList);
                    int i3 = 0;
                    while (i3 < readInt2) {
                        int readInt3 = c12951.readInt();
                        int readInt4 = c12951.readInt();
                        int readInt5 = c12951.readInt();
                        if (c12951.m31498()) {
                            String m31504 = c12951.m31504();
                            int readInt6 = c12951.readInt();
                            if (readInt6 < 0 || readInt6 > i2) {
                                throw new IOException("Invalid resource entry payload style count");
                            }
                            C21916[] c21916Arr = new C21916[readInt6];
                            for (int i4 = 0; i4 < readInt6; i4++) {
                                c21916Arr[i4] = new C21916(c12951.m31499(), c12951.readInt(), c12951.readInt());
                            }
                            c17466 = new C17466(m31504, c21916Arr);
                        } else {
                            c17466 = null;
                        }
                        arrayList.add(new C14643(c18172, readInt3, readInt4, readInt5, c17466));
                        i3++;
                        i2 = 100000;
                    }
                    if (c12951.available() == 0) {
                        return c18172;
                    }
                    throw new IOException("Trailing resource entry payload bytes");
                }
            }
            throw new IOException("Invalid resource entry payload value count");
        } catch (Exception e) {
            throw C3059.m9368("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52502(C9028 c9028, C4103 c4103) {
        boolean m12329 = c4103.m12329();
        byte[] bArr = c4103.f13042;
        String str = c4103.f13039;
        int i = c4103.f13041;
        C8322 c8322 = null;
        C16760 c16760 = null;
        if (m12329) {
            try {
                Iterator it = c9028.mo21936().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8322 c83222 = (C8322) it.next();
                    if (c83222.mo12858() == (i >>> 24)) {
                        c8322 = c83222;
                        break;
                    }
                }
                if (c8322 == null) {
                    throw new IOException("Resource patch package is missing");
                }
                C20317 m21925 = c8322.m21925((i >>> 16) & 255, c4103.f13045);
                int i2 = i & 65535;
                m21925.m46611(i2, c4103.f13040, false);
                if ("default".equals(str)) {
                    str = "";
                }
                C2678 m46608 = m21925.m46608(C21707.m48999(str, c8322.mo12848()));
                if (m46608.mo2347(i2)) {
                    throw new IOException("Added resource variant already exists");
                }
                m46608.m8392(i2).m43645((InterfaceC21211) m52501(m46608, i2, bArr));
                return;
            } catch (C3059 e) {
                throw e;
            } catch (Exception e2) {
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", e2.getMessage() == null ? "Resource patch is corrupt." : e2.getMessage());
            }
        }
        int i3 = (i >>> 24) & 255;
        int i4 = (i >>> 16) & 255;
        int i5 = i & 65535;
        Iterator it2 = c9028.mo21936().iterator();
        loop0: while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C8322 c83223 = (C8322) it2.next();
            if (c83223.mo12858() == i3) {
                for (C20317 c20317 : c83223.mo12850()) {
                    if (c20317.mo2870() == i4) {
                        for (C2678 c2678 : c20317.mo2872()) {
                            if (C2692.m8426(c2678).equals(str) && c2678.mo2347(i5)) {
                                c16760 = new C16760(c2678);
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        if (c16760 != null) {
            C2678 c26782 = c16760.f51452;
            C18172 m52501 = m52501(c26782, i5, bArr);
            c26782.m8399(i5);
            c26782.m8392(i5).m43645((InterfaceC21211) m52501);
            return;
        }
        throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
    }
}
