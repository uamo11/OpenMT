package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: 77HF */
/* renamed from: l.᩺ۤۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22926 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51015(String str, long j, long j2) {
        C11638 c11638;
        if (j2 < 180000) {
            return;
        }
        if (j < 5000) {
            m51017(str);
            return;
        }
        if (j2 - j < 10000) {
            m51017(str);
            return;
        }
        ArrayList m51014 = m51014();
        Iterator it = m51014.iterator();
        while (true) {
            if (!it.hasNext()) {
                c11638 = null;
                break;
            } else {
                c11638 = (C11638) it.next();
                if (c11638.f34722.equals(str)) {
                    break;
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (c11638 != null) {
            c11638.f34723 = j;
            c11638.f34720 = j2;
            c11638.f34721 = currentTimeMillis;
        } else {
            m51014.add(new C11638(str, j, j2, currentTimeMillis));
        }
        if (m51014.size() > 100) {
            Collections.sort(m51014, new C5993());
            while (m51014.size() > 100) {
                C18473.m42953(m51014, 1);
            }
        }
        m51016(m51014);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m51013(String str) {
        ArrayList m51014 = m51014();
        Iterator it = m51014.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C11638 c11638 = (C11638) it.next();
            if (c11638.f34722.equals(str)) {
                long j = c11638.f34723;
                if (j > 0 && j <= c11638.f34720) {
                    c11638.f34721 = System.currentTimeMillis();
                    m51016(m51014);
                    return c11638.f34723;
                }
            }
        }
        return 0L;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51017(String str) {
        ArrayList m51014 = m51014();
        for (int i = 0; i < m51014.size(); i++) {
            if (((C11638) m51014.get(i)).f34722.equals(str)) {
                m51014.remove(i);
                m51016(m51014);
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m51014() {
        ArrayList arrayList = new ArrayList();
        try {
            C12951 m31485 = C12951.m31485(ApplicationC20075.f65008.mo18253("vpp", (byte[]) null));
            m31485.m31490(1699025492);
            int readByte = m31485.readByte() & 255;
            for (int i = 0; i < readByte; i++) {
                arrayList.add(new C11638(m31485.m31506(), m31485.readLong(), m31485.readLong(), m31485.readLong()));
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51016(ArrayList arrayList) {
        C10130 m43030 = C18515.m43030(1699025492);
        m43030.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11638 c11638 = (C11638) it.next();
            m43030.m25439(c11638.f34722);
            m43030.m25431(c11638.f34723);
            m43030.m25431(c11638.f34720);
            m43030.m25431(c11638.f34721);
        }
        ApplicationC20075.f65008.edit().mo25855("vpp", m43030.m25427()).apply();
    }
}
