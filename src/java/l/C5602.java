package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* compiled from: 88T8 */
/* renamed from: l.ۚ᩷ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5602 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f17336 = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f17340 = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f17342 = {64, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 192, BERTags.FLAGS, 256, MLKEMEngine.KyberPolyBytes, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f17338 = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f17344 = {5, 8, 10, 12};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f17343 = {6, 9, 12, 15};

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f17341 = {2, 4, 6, 8};

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f17339 = {9, 11, 13, 16};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int[] f17337 = {5, 8, 10, 12};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8353 m15894(int i, String str, String str2, String str3, byte[] bArr) {
        C16302 m15895 = m15895(bArr);
        m15895.m38351(60);
        int i2 = f17336[m15895.m38343(6)];
        int i3 = f17340[m15895.m38343(4)];
        int m38343 = m15895.m38343(5);
        int i4 = m38343 >= 29 ? -1 : (f17342[m38343] * 1000) / 2;
        m15895.m38351(10);
        int i5 = i2 + (m15895.m38343(2) > 0 ? 1 : 0);
        C1297 c1297 = new C1297();
        c1297.m4469(str);
        c1297.m4462(str3);
        c1297.m4465("audio/vnd.dts");
        c1297.m4468(i4);
        c1297.m4472(i5);
        c1297.m4456(i3);
        c1297.m4447((C19643) null);
        c1297.m4471(str2);
        c1297.m4454(i);
        return c1297.m4440();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C0662 m15896(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        C16302 m15895 = m15895(bArr);
        m15895.m38351(40);
        int m38343 = m15895.m38343(2);
        if (m15895.m38352()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        m15895.m38351(i2);
        int m383432 = m15895.m38343(i) + 1;
        boolean m38352 = m15895.m38352();
        int i7 = 0;
        if (m38352) {
            i3 = m15895.m38343(2);
            int m383433 = (m15895.m38343(3) + 1) * 512;
            if (m15895.m38352()) {
                m15895.m38351(36);
            }
            int m383434 = m15895.m38343(3) + 1;
            int m383435 = m15895.m38343(3) + 1;
            if (m383434 != 1 || m383435 != 1) {
                throw C9080.m23441("Multiple audio presentations or assets not supported");
            }
            int i8 = m38343 + 1;
            int m383436 = m15895.m38343(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                if (((m383436 >> i9) & 1) == 1) {
                    m15895.m38351(8);
                }
            }
            if (m15895.m38352()) {
                m15895.m38351(2);
                int m383437 = (m15895.m38343(2) + 1) << 2;
                int m383438 = m15895.m38343(2) + 1;
                while (i7 < m383438) {
                    m15895.m38351(m383437);
                    i7++;
                }
            }
            i7 = m383433;
        } else {
            i3 = -1;
        }
        m15895.m38351(i);
        m15895.m38351(12);
        if (m38352) {
            if (m15895.m38352()) {
                m15895.m38351(4);
            }
            if (m15895.m38352()) {
                m15895.m38351(24);
            }
            if (m15895.m38352()) {
                m15895.m38347(m15895.m38343(10) + 1);
            }
            m15895.m38351(5);
            i5 = f17338[m15895.m38343(4)];
            i4 = m15895.m38343(8) + 1;
        } else {
            i4 = -1;
            i5 = SecP160R1Field.PInv;
        }
        if (m38352) {
            if (i3 == 0) {
                i6 = 32000;
            } else if (i3 == 1) {
                i6 = 44100;
            } else {
                if (i3 != 2) {
                    throw C9080.m23440("Unsupported reference clock code in DTS HD header: " + i3, (Throwable) null);
                }
                i6 = 48000;
            }
            long j2 = i6;
            String str = C3603.f11424;
            j = C3603.m11017(i7, 1000000L, j2, RoundingMode.DOWN);
        } else {
            j = -9223372036854775807L;
        }
        return new C0662(i4, i5, m383432, j, "audio/vnd.dts.hd;profile=lbr");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m15897(byte[] bArr) {
        C16302 m15895 = m15895(bArr);
        m15895.m38351(42);
        return m15895.m38343(m15895.m38352() ? 12 : 8) + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0662 m15893(byte[] bArr, AtomicInteger atomicInteger) {
        long j;
        int i;
        int i2;
        int i3;
        C16302 m15895 = m15895(bArr);
        int i4 = m15895.m38343(32) == 1078008818 ? 1 : 0;
        int m15892 = m15892(m15895, f17344);
        int i5 = m15892 + 1;
        if (i4 == 0) {
            j = -9223372036854775807L;
            i = SecP160R1Field.PInv;
        } else {
            if (!m15895.m38352()) {
                throw C9080.m23441("Only supports full channel mask-based audio presentation");
            }
            int i6 = m15892 - 1;
            if (((bArr[m15892] & 255) | ((bArr[i6] << 8) & 65535)) == C3603.m11004(i6, bArr)) {
                int m38343 = m15895.m38343(2);
                if (m38343 == 0) {
                    i2 = 512;
                } else if (m38343 == 1) {
                    i2 = 480;
                } else {
                    if (m38343 != 2) {
                        throw C9080.m23440("Unsupported base duration index in DTS UHD header: " + m38343, (Throwable) null);
                    }
                    i2 = MLKEMEngine.KyberPolyBytes;
                }
                int m383432 = (m15895.m38343(3) + 1) * i2;
                int m383433 = m15895.m38343(2);
                if (m383433 == 0) {
                    i3 = 32000;
                } else if (m383433 == 1) {
                    i3 = 44100;
                } else {
                    if (m383433 != 2) {
                        throw C9080.m23440("Unsupported clock rate index in DTS UHD header: " + m383433, (Throwable) null);
                    }
                    i3 = 48000;
                }
                if (m15895.m38352()) {
                    m15895.m38351(36);
                }
                i = (1 << m15895.m38343(2)) * i3;
                j = C3603.m11017(m383432, 1000000L, i3, RoundingMode.DOWN);
            } else {
                throw C9080.m23440("CRC check failed", (Throwable) null);
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 += m15892(m15895, f17343);
        }
        if (i4 != 0) {
            atomicInteger.set(m15892(m15895, f17341));
        }
        return new C0662(2, i, i7 + (atomicInteger.get() != 0 ? m15892(m15895, f17339) : 0) + i5, j, "audio/vnd.dts.uhd;profile=p2");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m15898(byte[] bArr) {
        C16302 m15895 = m15895(bArr);
        m15895.m38351(32);
        return m15892(m15895, f17337) + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15892(C16302 c16302, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c16302.m38352(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c16302.m38343(iArr[i]) + i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16302 m15895(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new C16302(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = copyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b3 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b3;
            }
        }
        C16302 c16302 = new C16302(copyOf, copyOf.length);
        if (copyOf[0] == 31) {
            C16302 c163022 = new C16302(copyOf, copyOf.length);
            while (c163022.m38339() >= 16) {
                c163022.m38351(2);
                c16302.m38340(c163022.m38343(14));
            }
        }
        c16302.m38350(copyOf.length, copyOf);
        return c16302;
    }
}
