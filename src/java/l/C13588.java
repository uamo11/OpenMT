package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: P7FQ */
/* renamed from: l.ܰۙۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13588 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32669(int i, String str) {
        C22761 c22761;
        if (i < 0) {
            m32671(str);
            return;
        }
        ArrayList m32668 = m32668();
        Iterator it = m32668.iterator();
        while (true) {
            if (!it.hasNext()) {
                c22761 = null;
                break;
            } else {
                c22761 = (C22761) it.next();
                if (c22761.f73493.equals(str)) {
                    break;
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (c22761 != null) {
            c22761.f73492 = i;
            c22761.f73491 = currentTimeMillis;
        } else {
            m32668.add(new C22761(str, i, currentTimeMillis));
        }
        if (m32668.size() > 100) {
            Collections.sort(m32668, new C11473());
            while (m32668.size() > 100) {
                C18473.m42953(m32668, 1);
            }
        }
        m32670(m32668);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32667(String str) {
        ArrayList m32668 = m32668();
        Iterator it = m32668.iterator();
        while (it.hasNext()) {
            C22761 c22761 = (C22761) it.next();
            if (c22761.f73493.equals(str)) {
                if (c22761.f73492 < 0) {
                    return -1;
                }
                c22761.f73491 = System.currentTimeMillis();
                m32670(m32668);
                return c22761.f73492;
            }
        }
        return -1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32671(String str) {
        ArrayList m32668 = m32668();
        for (int i = 0; i < m32668.size(); i++) {
            if (((C22761) m32668.get(i)).f73493.equals(str)) {
                m32668.remove(i);
                m32670(m32668);
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m32668() {
        ArrayList arrayList = new ArrayList();
        try {
            byte[] mo18253 = ApplicationC20075.f65008.mo18253("vats", (byte[]) null);
            if (mo18253 != null && mo18253.length != 0) {
                C12951 m31485 = C12951.m31485(mo18253);
                m31485.m31490(1699025494);
                int readByte = m31485.readByte() & 255;
                for (int i = 0; i < readByte; i++) {
                    arrayList.add(new C22761(m31485.m31506(), m31485.readInt(), m31485.readLong()));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32670(ArrayList arrayList) {
        C10130 m43030 = C18515.m43030(1699025494);
        m43030.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C22761 c22761 = (C22761) it.next();
            m43030.m25439(c22761.f73493);
            m43030.writeInt(c22761.f73492);
            m43030.m25431(c22761.f73491);
        }
        ApplicationC20075.f65008.edit().mo25855("vats", m43030.m25427()).apply();
    }
}
