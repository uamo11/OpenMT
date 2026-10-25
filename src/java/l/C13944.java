package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 56JZ */
/* renamed from: l.ܰܽܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13944 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC10418 m33385(C3074 c3074, int i) {
        int i2;
        int i3;
        int i4;
        HashMap hashMap;
        int i5;
        try {
            C11829 c11829 = new C11829();
            int length = c3074.m9396().length;
            int i6 = i;
            while (i6 < length) {
                int m33384 = m33384(c3074, i6, length);
                int m9399 = c3074.m9399(i6 + 2);
                if (m9399 < 284) {
                    return EnumC10418.AOSP;
                }
                HashMap hashMap2 = new HashMap();
                int i7 = i6 + m9399;
                while (i7 < m33384) {
                    int m333842 = m33384(c3074, i7, m33384);
                    int m93992 = c3074.m9399(i7);
                    int m93993 = c3074.m9399(i7 + 2);
                    if (m93992 == 514 || m93992 == 513) {
                        if (m93993 < 16) {
                            return EnumC10418.AOSP;
                        }
                        int m9401 = c3074.m9401(i7 + 8);
                        C23117 c23117 = (C23117) hashMap2.get(Integer.valueOf(m9401));
                        if (c23117 == null) {
                            c23117 = new C23117(0);
                            hashMap2.put(Integer.valueOf(m9401), c23117);
                        }
                        if (m93992 == 514) {
                            int m9400 = c3074.m9400(i7 + 12);
                            if (m9400 >= 0 && m9400 <= 65536) {
                                if ((m9400 * 4) + i7 + m93993 <= m333842) {
                                    c23117.f74359 = c3074.m9397(i7 + m93993, m9400);
                                }
                            }
                            return EnumC10418.AOSP;
                        }
                        if (m93993 < 24) {
                            return EnumC10418.AOSP;
                        }
                        int i8 = i7 + 20;
                        int m94002 = c3074.m9400(i8);
                        if (m94002 != 28 && m94002 != 32 && m94002 != 36 && m94002 != 48 && m94002 != 52 && m94002 != 76) {
                            return EnumC10418.AOSP;
                        }
                        long j = m93993;
                        if (m94002 + 20 > j) {
                            return EnumC10418.AOSP;
                        }
                        C21707 m49000 = C21707.m49000(c3074.m9403(i8), EnumC10418.MOTOROLA_76);
                        C5896 m9403 = c3074.m9403(i8);
                        EnumC10418 enumC10418 = EnumC10418.AOSP;
                        C21707 m490002 = C21707.m49000(m9403, enumC10418);
                        int m94003 = c3074.m9400(i7 + 12);
                        int m94012 = c3074.m9401(i7 + 9);
                        boolean z = true;
                        boolean z2 = (m94012 & 1) != 0;
                        if (z2 || (m94012 & 2) == 0) {
                            z = false;
                        }
                        int i9 = z ? 2 : 4;
                        i2 = length;
                        int m94004 = c3074.m9400(i7 + 16);
                        if (m94003 >= 0) {
                            i3 = m33384;
                            if (m94003 <= 65536 && m94004 >= m93993 && m94004 <= m333842 - i7) {
                                i4 = m333842;
                                hashMap = hashMap2;
                                if ((i9 * m94003) + j <= m94004) {
                                    int[] iArr = new int[m94003];
                                    int i10 = 0;
                                    while (i5 < m94003) {
                                        int i11 = (i5 * i9) + i7 + m93993;
                                        int m93994 = z ? c3074.m9399(i11) : c3074.m9400(i11);
                                        if (!z2) {
                                            i5 = m93994 == (z ? 65535 : -1) ? i5 + 1 : 0;
                                        }
                                        int i12 = i10 + 1;
                                        iArr[i10] = z2 ? c3074.m9399(i11) : i5;
                                        i10 = i12;
                                    }
                                    c23117.f74358.add(new C6184(m49000, m490002, iArr, i10));
                                    m33384 = i3;
                                    length = i2;
                                    i7 = i4;
                                    hashMap2 = hashMap;
                                }
                            }
                        }
                        return enumC10418;
                    }
                    i2 = length;
                    i3 = m33384;
                    i4 = m333842;
                    hashMap = hashMap2;
                    m33384 = i3;
                    length = i2;
                    i7 = i4;
                    hashMap2 = hashMap;
                }
                int i13 = length;
                int i14 = m33384;
                Iterator it = hashMap2.values().iterator();
                while (it.hasNext()) {
                    if (!((C23117) it.next()).m51309(c11829)) {
                        return EnumC10418.AOSP;
                    }
                }
                i6 = i14;
                length = i13;
            }
            return (c11829.f35295 <= 0 || c11829.f35294 != 0 || c11829.f35293 >= c11829.f35292) ? EnumC10418.AOSP : EnumC10418.MOTOROLA_76;
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException unused) {
            return EnumC10418.AOSP;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m33384(C3074 c3074, int i, int i2) {
        if (i >= 0) {
            long j = i;
            long j2 = i2;
            if (8 + j <= j2) {
                int m9400 = c3074.m9400(i + 4);
                int m9399 = c3074.m9399(i + 2);
                if (m9399 < 8 || m9400 < m9399 || j + m9400 > j2) {
                    throw new IOException("Invalid chunk bounds");
                }
                return i + m9400;
            }
        }
        throw new IOException("Invalid chunk offset");
    }
}
