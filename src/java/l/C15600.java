package l;

import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: O741 */
/* renamed from: l.ܺ֨ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15600 implements InterfaceC15019 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC20541 f48048;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f48049;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9252 f48050;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9252 f48051;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f48052;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f48053;

    public C15600(InterfaceC15097 interfaceC15097, EnumC20541 enumC20541, C9252 c9252, C9252 c92522, long j, String str) {
        this.f48053 = interfaceC15097;
        this.f48048 = enumC20541;
        this.f48051 = c9252;
        this.f48050 = c92522;
        this.f48052 = j;
        this.f48049 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15600 m36759(C2196 c2196, long j, InterfaceC15097 interfaceC15097, InterfaceC15097 interfaceC150972, C23713 c23713, C0991 c0991, C16431 c16431) {
        ThreadPoolExecutor m26979 = C10767.m26979();
        C4951 m7264 = c2196.m7264();
        C21885 m36761 = m36761(c2196, j);
        EnumC20541 m36760 = m36760(m7264, m36761);
        if (m36760 != null && m36761 != null) {
            try {
                C21885 c21885 = m36761.f73015;
                C9252 m36758 = c21885 == null ? null : m36758(m7264, c21885, interfaceC15097, c23713, c0991, c16431, m26979);
                C9252 m367582 = m36758(m7264, m36761, interfaceC15097, c23713, c0991, c16431, m26979);
                if ((m36760 != EnumC20541.FRAGMENTED_MP4 || m36758 != null) && m367582 != null) {
                    return new C15600(interfaceC150972, m36760, m36758, m367582, Math.max(0L, j - ((m7264.f15599 - c2196.m7262()) + m36761.f73016)), m36757(c2196, m36761));
                }
            } catch (IOException | RuntimeException unused) {
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC20541 m36760(C4951 c4951, C21885 c21885) {
        if (c21885 == null) {
            return null;
        }
        C21885 c218852 = c21885.f73015;
        if (!c4951.f31807 || !c4951.f15610.isEmpty()) {
            return null;
        }
        if ((c4951.f15595 != 1 && !c4951.f15612) || !c21885.f70066.isEmpty()) {
            return null;
        }
        boolean z = c218852 != null;
        HashSet hashSet = new HashSet();
        for (C21885 c218853 : c4951.f15593) {
            int i = c218853.f73014;
            C21885 c218854 = c218853.f73015;
            if (i != 0 || c218853.f73019 != null || c218853.f73018 != null || !c218853.f70066.isEmpty()) {
                return null;
            }
            if (z) {
                if (c218854 == null) {
                    return null;
                }
                hashSet.add(C8542.m22231(c4951.f31806, c218854.f73022) + ":" + c218854.f73021 + ":" + c218854.f73020);
            } else if (c218854 != null) {
                return null;
            }
        }
        if (!z) {
            return EnumC20541.MPEG_TS;
        }
        if (hashSet.size() == 1 && c218852 != null && c218852.f73019 == null && c218852.f73018 == null) {
            return EnumC20541.FRAGMENTED_MP4;
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21885 m36761(C2196 c2196, long j) {
        C4951 m7264 = c2196.m7264();
        long m7262 = m7264.f15599 - c2196.m7262();
        C21885 c21885 = null;
        for (C21885 c218852 : m7264.f15593) {
            long j2 = c218852.f73016 + m7262;
            if (j < j2) {
                break;
            }
            if (j < j2 + c218852.f73013) {
                return c218852;
            }
            c21885 = c218852;
        }
        return c21885;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r23.m3463(r11, r21).m1627() == false) goto L46;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C9252 m36758(l.C4951 r19, l.C21885 r20, l.InterfaceC15097 r21, l.C23713 r22, l.C0991 r23, l.C16431 r24, java.util.concurrent.ThreadPoolExecutor r25) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15600.m36758(l.ۙ᩺֫, l.᩸᩺֫, l.ܶ۠֫, l.᩻۬ۜ, l.֨۠ۜ, l.ܽۚۜ, java.util.concurrent.ThreadPoolExecutor):l.ۢ֨ۜ");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8671 m36767() {
        C9252 c9252;
        InterfaceC15097 interfaceC15097;
        InterfaceC15097 interfaceC150972;
        Uri uri;
        String str;
        long j;
        long j2;
        InterfaceC15097 interfaceC150973;
        Uri uri2;
        String str2;
        long j3;
        long j4;
        InterfaceC15097 interfaceC150974;
        C9252 c92522 = this.f48050;
        if (this.f48048 != EnumC20541.FRAGMENTED_MP4 || (c9252 = this.f48051) == null) {
            throw new IOException("HLS preview does not have an initialization segment");
        }
        interfaceC15097 = c9252.f28029;
        InterfaceC15097 interfaceC150975 = this.f48053;
        if (interfaceC15097 != null) {
            interfaceC150974 = c9252.f28029;
            interfaceC150972 = interfaceC150974;
        } else {
            interfaceC150972 = interfaceC150975;
        }
        uri = c9252.f28031;
        str = c9252.f28028;
        j = c9252.f28032;
        j2 = c9252.f28030;
        C4871 c4871 = new C4871(j, j2, uri, interfaceC150972, str);
        try {
            interfaceC150973 = c92522.f28029;
            if (interfaceC150973 != null) {
                interfaceC150975 = c92522.f28029;
            }
            uri2 = c92522.f28031;
            str2 = c92522.f28028;
            j3 = c92522.f28032;
            j4 = c92522.f28030;
            return new C8671(c4871, new C4871(j3, j4, uri2, interfaceC150975, str2));
        } catch (Throwable th) {
            c4871.close();
            throw th;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 m36766() {
        InterfaceC15097 interfaceC15097;
        Uri uri;
        long j;
        String str;
        long j2;
        C9252 c9252 = this.f48050;
        interfaceC15097 = c9252.f28029;
        InterfaceC15097 interfaceC150972 = interfaceC15097 != null ? c9252.f28029 : this.f48053;
        C4515 c4515 = new C4515();
        uri = c9252.f28031;
        c4515.m13281(uri);
        j = c9252.f28032;
        c4515.m13286(j);
        str = c9252.f28028;
        c4515.m13282(str);
        C3104 m13278 = c4515.m13278();
        InterfaceC21449 mo6247 = interfaceC150972.mo6247();
        j2 = c9252.f28030;
        return new C17613(mo6247, m13278, j2, new C20177());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC20541 m36763() {
        return this.f48048;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m36765() {
        return this.f48052;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m36764() {
        return this.f48049;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15600 m36762(C2196 c2196, long j) {
        C21885 m36761 = m36761(c2196, j);
        if (m36761 == null || !this.f48049.equals(m36757(c2196, m36761))) {
            return null;
        }
        long max = Math.max(0L, j - ((c2196.m7264().f15599 - c2196.m7262()) + m36761.f73016));
        return new C15600(this.f48053, this.f48048, this.f48051, this.f48050, max, this.f48049);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36757(C2196 c2196, C21885 c21885) {
        return c2196.m7265() + ":" + c2196.m7263() + ":" + C8542.m22231(c2196.m7264().f31806, c21885.f73022) + ":" + c21885.f73021 + ":" + c21885.f73020;
    }
}
