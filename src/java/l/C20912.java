package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.InputStream;

/* compiled from: 56JK */
/* renamed from: l.᩷ܰۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20912 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22262 m47747(AbstractC22967 abstractC22967, C15205 c15205, C19981 c19981, long j, C13854 c13854, InterfaceC17066 interfaceC17066, C20146 c20146) {
        C10104 c10104 = c15205.f46660;
        C11679 c11679 = c15205.f46664;
        int i = c10104.f30421;
        int i2 = c10104.f30424;
        Rect rect = new Rect(0, 0, i, i2);
        long min = Math.min(j, c19981.m46067());
        int i3 = 1;
        while (i3 > 0 && i3 <= 1073741824) {
            AbstractC22967.m51107(interfaceC17066);
            int m13562 = (int) C4623.m13562(c10104.f30421, i3);
            int m135622 = (int) C4623.m13562(i2, i3);
            long j2 = m13562 * m135622;
            long j3 = 4 * j2;
            c20146.getClass();
            int i4 = i2;
            if (m13562 <= 2048 && m135622 <= 2048 && j2 <= 4194304 && j3 <= min) {
                if (c13854 != null) {
                    try {
                        return c13854.m33211(rect, i3, c19981, interfaceC17066);
                    } catch (C1095 e) {
                        if (m13562 == 1 && m135622 == 1) {
                            throw e;
                        }
                    }
                } else {
                    C22097 m46068 = c19981.m46068(c10104.m25387(false) + j3 + j3);
                    if (m46068 != null) {
                        Bitmap bitmap = null;
                        try {
                            abstractC22967.m51108(c11679);
                            InputStream mo6178 = abstractC22967.mo6178();
                            try {
                                c10104.m25388(C22803.m50895(mo6178));
                                bitmap = C22803.m50894(mo6178, c10104, rect, i3, interfaceC17066);
                                if (mo6178 != null) {
                                    mo6178.close();
                                }
                                abstractC22967.m51108(c11679);
                                AbstractC22967.m51107(interfaceC17066);
                                if (!m46068.m49683(bitmap.getAllocationByteCount())) {
                                    throw new C1095("TGA preview allocation exceeds budget");
                                }
                                return new C22262(bitmap, m46068, i3);
                            } finally {
                            }
                        } catch (Throwable th) {
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            m46068.close();
                            throw th;
                        }
                    } else if (m13562 == 1 && m135622 == 1) {
                        break;
                    }
                }
            }
            i3 *= 2;
            i2 = i4;
        }
        throw new C1095("TGA preview does not fit bitmap budget");
    }
}
