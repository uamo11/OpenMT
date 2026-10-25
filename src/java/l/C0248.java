package l;

import java.util.ArrayList;

/* compiled from: J8M6 */
/* renamed from: l.֡ۜۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0248 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19300 m1506(int i, byte[] bArr) {
        ArrayList arrayList;
        int m41493;
        C17714 c17714 = new C17714(bArr);
        try {
            c17714.m41478(4);
            m41493 = c17714.m41493();
            c17714.m41484(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (!(m41493 == 1886547818)) {
            arrayList = m1505(c17714);
        } else {
            c17714.m41478(8);
            int m41485 = c17714.m41485();
            int m41483 = c17714.m41483();
            while (m41485 < m41483) {
                int m414932 = c17714.m41493() + m41485;
                if (m414932 <= m41485 || m414932 > m41483) {
                    break;
                }
                int m414933 = c17714.m41493();
                if (m414933 != 2037673328 && m414933 != 1836279920) {
                    c17714.m41484(m414932);
                    m41485 = m414932;
                }
                c17714.m41486(m414932);
                arrayList = m1505(c17714);
                break;
            }
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            C3777 c3777 = (C3777) arrayList.get(0);
            return new C19300(c3777, c3777, i);
        }
        if (size != 2) {
            return null;
        }
        return new C19300((C3777) arrayList.get(0), (C3777) arrayList.get(1), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011e, code lost:
    
        r12 = r0;
        r15 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b5 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m1505(l.C17714 r25) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0248.m1505(l.ᩳ֨֫):java.util.ArrayList");
    }
}
