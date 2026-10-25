package l;

import android.util.Pair;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* compiled from: U8RL */
/* renamed from: l.᩹ۖۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21998 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70423 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f70424;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49483(int i) {
        return (i >> 24) & 255;
    }

    static {
        String str = C3603.f11424;
        f70424 = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:499:0x071c, code lost:
    
        if (r5 == (-1)) goto L383;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0d34  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m49485(l.C0780 r46, l.C7718 r47, long r48, l.C19643 r50, boolean r51, boolean r52, l.InterfaceC16724 r53) {
        /*
            Method dump skipped, instructions count: 3554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21998.m49485(l.֨֨֫, l.۟᩷ۧ, long, l.᩵ᩴ֫, boolean, boolean, l.ܽܶܺ):java.util.ArrayList");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23896 m49489(C7836 c7836) {
        int i;
        C17714 c17714 = c7836.f24238;
        c17714.m41484(8);
        C23896 c23896 = new C23896(new InterfaceC14723[0]);
        while (c17714.m41457() >= 8) {
            int m41485 = c17714.m41485();
            int m41493 = c17714.m41493();
            int m414932 = c17714.m41493();
            C23896 c238962 = null;
            if (m414932 == 1835365473) {
                c17714.m41484(m41485);
                int i2 = m41485 + m41493;
                c17714.m41478(8);
                m49490(c17714);
                while (true) {
                    if (c17714.m41485() >= i2) {
                        break;
                    }
                    int m414852 = c17714.m41485();
                    int m414933 = c17714.m41493();
                    if (c17714.m41493() == 1768715124) {
                        c17714.m41484(m414852);
                        int i3 = m414852 + m414933;
                        c17714.m41478(8);
                        ArrayList arrayList = new ArrayList();
                        while (c17714.m41485() < i3) {
                            AbstractC14626 m25171 = C10004.m25171(c17714);
                            if (m25171 != null) {
                                arrayList.add(m25171);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c238962 = new C23896(arrayList);
                        }
                    } else {
                        c17714.m41484(m414852 + m414933);
                    }
                }
                c23896 = c23896.m52642(c238962);
            } else if (m414932 == 1936553057) {
                c17714.m41484(m41485);
                int i4 = m41485 + m41493;
                c17714.m41478(12);
                while (true) {
                    if (c17714.m41485() >= i4) {
                        break;
                    }
                    int m414853 = c17714.m41485();
                    int m414934 = c17714.m41493();
                    if (c17714.m41493() != 1935766900) {
                        c17714.m41484(m414853 + m414934);
                    } else if (m414934 >= 16) {
                        c17714.m41478(4);
                        int i5 = -1;
                        int i6 = 0;
                        for (int i7 = 0; i7 < 2; i7++) {
                            int m41456 = c17714.m41456();
                            int m414562 = c17714.m41456();
                            if (m41456 == 0) {
                                i5 = m414562;
                            } else if (m41456 == 1) {
                                i6 = m414562;
                            }
                        }
                        if (i5 == 12) {
                            i = 240;
                        } else if (i5 == 13) {
                            i = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        } else {
                            if (i5 == 21 && c17714.m41457() >= 8 && c17714.m41485() + 8 <= i4) {
                                int m414935 = c17714.m41493();
                                int m414936 = c17714.m41493();
                                if (m414935 >= 12 && m414936 == 1936877170) {
                                    i = c17714.m41469();
                                }
                            }
                            i = SecP160R1Field.PInv;
                        }
                        if (i != -2147483647) {
                            c238962 = new C23896(new C19567(i, i6));
                        }
                    }
                }
                c23896 = c23896.m52642(c238962);
            } else if (m414932 == -1451722374) {
                short m41455 = c17714.m41455();
                c17714.m41478(2);
                String m41459 = c17714.m41459(m41455, StandardCharsets.UTF_8);
                int max = Math.max(m41459.lastIndexOf(43), m41459.lastIndexOf(45));
                try {
                    c238962 = new C23896(new C21243(Float.parseFloat(m41459.substring(0, max)), Float.parseFloat(m41459.substring(max, m41459.length() - 1))));
                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                }
                c23896 = c23896.m52642(c238962);
            }
            c17714.m41484(m41485 + m41493);
        }
        return c23896;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C21948 m49493(C17714 c17714) {
        long m41487;
        long m414872;
        c17714.m41484(8);
        if (m49483(c17714.m41493()) == 0) {
            m41487 = c17714.m41479();
            m414872 = c17714.m41479();
        } else {
            m41487 = c17714.m41487();
            m414872 = c17714.m41487();
        }
        return new C21948(m41487, m414872, c17714.m41479());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23896 m49488(C0780 c0780) {
        C0074 c0074;
        C7836 m2975 = c0780.m2975(1751411826);
        C7836 m29752 = c0780.m2975(1801812339);
        C7836 m29753 = c0780.m2975(1768715124);
        if (m2975 != null && m29752 != null && m29753 != null) {
            C17714 c17714 = m2975.f24238;
            c17714.m41484(16);
            if (c17714.m41493() == 1835299937) {
                C17714 c177142 = m29752.f24238;
                c177142.m41484(12);
                int m41493 = c177142.m41493();
                String[] strArr = new String[m41493];
                for (int i = 0; i < m41493; i++) {
                    int m414932 = c177142.m41493();
                    c177142.m41478(4);
                    strArr[i] = c177142.m41459(m414932 - 8, StandardCharsets.UTF_8);
                }
                C17714 c177143 = m29753.f24238;
                c177143.m41484(8);
                ArrayList arrayList = new ArrayList();
                while (c177143.m41457() > 8) {
                    int m41485 = c177143.m41485();
                    int m414933 = c177143.m41493();
                    int m414934 = c177143.m41493() - 1;
                    if (m414934 < 0 || m414934 >= m41493) {
                        C8083.m21451(m414934, "Skipped metadata with unknown key index: ");
                    } else {
                        String str = strArr[m414934];
                        int i2 = m41485 + m414933;
                        while (true) {
                            int m414852 = c177143.m41485();
                            if (m414852 >= i2) {
                                c0074 = null;
                                break;
                            }
                            int m414935 = c177143.m41493();
                            if (c177143.m41493() == 1684108385) {
                                int m414936 = c177143.m41493();
                                int m414937 = c177143.m41493();
                                int i3 = m414935 - 16;
                                byte[] bArr = new byte[i3];
                                c177143.m41461(0, i3, bArr);
                                c0074 = new C0074(m414937, m414936, str, bArr);
                                break;
                            }
                            c177143.m41484(m414852 + m414935);
                        }
                        if (c0074 != null) {
                            arrayList.add(c0074);
                        }
                    }
                    c177143.m41484(m41485 + m414933);
                }
                if (!arrayList.isEmpty()) {
                    return new C23896(arrayList);
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49490(C17714 c17714) {
        int m41485 = c17714.m41485();
        c17714.m41478(4);
        if (c17714.m41493() != 1751411826) {
            m41485 += 4;
        }
        c17714.m41484(m41485);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02ac A[ADDED_TO_REGION, LOOP:14: B:245:0x02ac->B:248:0x02b6, LOOP_START, PHI: r20
  0x02ac: PHI (r20v3 int) = (r20v2 int), (r20v4 int) binds: [B:244:0x02aa, B:248:0x02b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0438  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C20628 m49487(l.C14276 r39, l.C0780 r40, l.C7718 r41) {
        /*
            Method dump skipped, instructions count: 1569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21998.m49487(l.ܳۘۧ, l.֨֨֫, l.۟᩷ۧ):l.᩷ۘۧ");
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ad  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m49491(l.C17714 r40, int r41, int r42, int r43, int r44, java.lang.String r45, int r46, l.C19643 r47, l.C5064 r48, int r49) {
        /*
            Method dump skipped, instructions count: 2427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21998.m49491(l.ᩳ֨֫, int, int, int, int, java.lang.String, int, l.᩵ᩴ֫, l.ۚۖۧ, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2242 m49486(int i, C17714 c17714) {
        c17714.m41484(i + 12);
        c17714.m41478(1);
        m49492(c17714);
        c17714.m41478(2);
        int m41456 = c17714.m41456();
        if ((m41456 & 128) != 0) {
            c17714.m41478(2);
        }
        if ((m41456 & 64) != 0) {
            c17714.m41478(c17714.m41456());
        }
        if ((m41456 & 32) != 0) {
            c17714.m41478(2);
        }
        c17714.m41478(1);
        m49492(c17714);
        String m24796 = C9786.m24796(c17714.m41456());
        if ("audio/mpeg".equals(m24796) || "audio/vnd.dts".equals(m24796) || "audio/vnd.dts.hd".equals(m24796)) {
            return new C2242(-1L, -1L, m24796, null);
        }
        c17714.m41478(4);
        long m41479 = c17714.m41479();
        long m414792 = c17714.m41479();
        c17714.m41478(1);
        int m49492 = m49492(c17714);
        byte[] bArr = new byte[m49492];
        c17714.m41461(0, m49492, bArr);
        if (m414792 <= 0) {
            m414792 = -1;
        }
        return new C2242(m414792, m41479 > 0 ? m41479 : -1L, m24796, bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pair m49484(C17714 c17714, int i, int i2) {
        int i3;
        int i4;
        int m41485 = c17714.m41485();
        while (m41485 - i < i2) {
            c17714.m41484(m41485);
            int m41493 = c17714.m41493();
            C22535.m50531("childAtomSize must be positive", m41493 > 0);
            if (c17714.m41493() == 1936289382) {
                int i5 = m41485 + 8;
                int i6 = -1;
                Integer num = null;
                int i7 = 0;
                String str = null;
                while (i5 - m41485 < m41493) {
                    c17714.m41484(i5);
                    int m414932 = c17714.m41493();
                    int m414933 = c17714.m41493();
                    if (m414933 == 1718775137) {
                        num = Integer.valueOf(c17714.m41493());
                    } else if (m414933 == 1935894637) {
                        c17714.m41478(4);
                        str = c17714.m41459(4, StandardCharsets.UTF_8);
                    } else if (m414933 == 1935894633) {
                        i6 = i5;
                        i7 = m414932;
                    }
                    i5 += m414932;
                }
                C23449 c23449 = null;
                Pair create = null;
                r6 = null;
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C22535.m50531("frma atom is mandatory", num != null);
                    C22535.m50531("schi atom is mandatory", i6 != -1);
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            break;
                        }
                        c17714.m41484(i8);
                        int m414934 = c17714.m41493();
                        if (c17714.m41493() == 1952804451) {
                            int m49483 = m49483(c17714.m41493());
                            c17714.m41478(1);
                            if (m49483 == 0) {
                                c17714.m41478(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int m41456 = c17714.m41456();
                                i3 = m41456 & 15;
                                i4 = (m41456 & 240) >> 4;
                            }
                            boolean z = c17714.m41456() == 1;
                            int m414562 = c17714.m41456();
                            byte[] bArr2 = new byte[16];
                            c17714.m41461(0, 16, bArr2);
                            if (z && m414562 == 0) {
                                int m414563 = c17714.m41456();
                                bArr = new byte[m414563];
                                c17714.m41461(0, m414563, bArr);
                            }
                            c23449 = new C23449(z, str, m414562, bArr2, i4, i3, bArr);
                        } else {
                            i8 += m414934;
                        }
                    }
                    C22535.m50531("tenc atom is mandatory", c23449 != null);
                    String str2 = C3603.f11424;
                    create = Pair.create(num, c23449);
                }
                if (create != null) {
                    return create;
                }
            }
            m41485 += m41493;
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m49492(C17714 c17714) {
        int m41456 = c17714.m41456();
        int i = m41456 & 127;
        while ((m41456 & 128) == 128) {
            m41456 = c17714.m41456();
            i = (i << 7) | (m41456 & 127);
        }
        return i;
    }
}
