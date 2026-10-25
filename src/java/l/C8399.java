package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: T72Q */
/* renamed from: l.۠᩶ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8399 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f25749 = new Object();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long f25750;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22008(AbstractC13921 abstractC13921, List list, int i) {
        C2499 c2499 = C2499.f7958;
        if (abstractC13921 == c2499) {
            if (list.isEmpty() || i < 0 || i >= list.size()) {
                throw new IllegalArgumentException("Invalid music playlist");
            }
            if (abstractC13921 == c2499 && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        if (((InterfaceC17889) it.next()).mo24433().m36507()) {
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                synchronized (f25749) {
                    m22003(i, 0, list);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22005(AbstractC13921 abstractC13921, int i) {
        if (abstractC13921 != C2499.f7958) {
            return;
        }
        synchronized (f25749) {
            if (ApplicationC20075.f65008.contains("mpl")) {
                ApplicationC20075.f65008.edit().mo25853(i, "mpi").remove("mpp").apply();
                f25750++;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22006(AbstractC13921 abstractC13921, int i, int i2) {
        if (abstractC13921 != C2499.f7958) {
            return;
        }
        synchronized (f25749) {
            if (ApplicationC20075.f65008.contains("mpl") && ApplicationC20075.f65008.mo18252(21, "mpi") && ApplicationC20075.f65008.getInt("mpi", -1) == i) {
                InterfaceC13049 edit = ApplicationC20075.f65008.edit();
                if (i2 > 0) {
                    edit.mo25853(i2, "mpp");
                } else {
                    edit.remove("mpp");
                }
                edit.apply();
                f25750++;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22004(AbstractC13921 abstractC13921) {
        if (abstractC13921 != C2499.f7958) {
            return;
        }
        synchronized (f25749) {
            if (ApplicationC20075.f65008.contains("mpp")) {
                ApplicationC20075.f65008.edit().remove("mpp").apply();
                f25750++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[Catch: all -> 0x0153, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0018, B:7:0x0020, B:9:0x002d, B:10:0x0035, B:12:0x0040, B:17:0x0050, B:24:0x0066, B:25:0x0068), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0059  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C1343 m22002() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8399.m22002():l.֨᩶ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22007(C1343 c1343) {
        synchronized (f25749) {
            if (f25750 != c1343.m4689()) {
                return false;
            }
            if (!c1343.m4690()) {
                return true;
            }
            C2608 m4688 = c1343.m4688();
            if (m4688 != null) {
                m22003(m4688.m8232(), c1343.m4691(), m4688.m8233());
            } else {
                ApplicationC20075.f65008.edit().remove("mpl").remove("mpi").remove("mpp").apply();
                f25750++;
            }
            return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m22001(byte[] bArr) {
        C12951 m31485 = C12951.m31485(bArr);
        if (m31485.readInt() != 1297107969) {
            throw new IllegalArgumentException("Unsupported music playlist format");
        }
        int readInt = m31485.readInt();
        if (readInt <= 0 || readInt > m31485.available()) {
            throw new IllegalArgumentException("Invalid music playlist size");
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            String m31506 = m31485.m31506();
            if (m31506.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            arrayList.add(m31506);
        }
        if (m31485.available() == 0) {
            return arrayList;
        }
        throw new IllegalArgumentException("Trailing music playlist data");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22003(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC17889) it.next()).getPath());
        }
        InterfaceC13049 edit = ApplicationC20075.f65008.edit();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Empty music playlist");
        }
        C10130 m43030 = C18515.m43030(1297107969);
        m43030.writeInt(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            m43030.m25439(str);
        }
        InterfaceC13049 mo25853 = edit.mo25855("mpl", m43030.m25427()).mo25853(i, "mpi");
        if (i2 > 0) {
            mo25853.mo25853(i2, "mpp");
        } else {
            mo25853.remove("mpp");
        }
        mo25853.apply();
        f25750++;
    }
}
