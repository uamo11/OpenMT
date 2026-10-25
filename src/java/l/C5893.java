package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: 68JR */
/* renamed from: l.ۛۜۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5893 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f18095 = {1, 2, 3, 6};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f18099 = {48000, 44100, 32000};

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f18098 = {24000, 22050, 16000};

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f18097 = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f18094 = {32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes, 448, 512, 576, 640};

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f18096 = {69, 87, IShizukuService.Stub.TRANSACTION_isHidden, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8353 m16513(C17714 c17714, String str, String str2, C19643 c19643) {
        C16302 c16302 = new C16302();
        c16302.m38342(c17714);
        int i = f18099[c16302.m38343(2)];
        c16302.m38351(8);
        int i2 = f18097[c16302.m38343(3)];
        if (c16302.m38343(1) != 0) {
            i2++;
        }
        int i3 = f18094[c16302.m38343(5)] * 1000;
        c16302.m38344();
        c17714.m41484(c16302.m38348());
        C1297 c1297 = new C1297();
        c1297.m4469(str);
        c1297.m4465("audio/ac3");
        c1297.m4472(i2);
        c1297.m4456(i);
        c1297.m4447(c19643);
        c1297.m4471(str2);
        c1297.m4468(i3);
        c1297.m4438(i3);
        return c1297.m4440();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8353 m16515(C17714 c17714, String str, String str2, C19643 c19643) {
        String str3;
        C16302 c16302 = new C16302();
        c16302.m38342(c17714);
        int m38343 = c16302.m38343(13) * 1000;
        c16302.m38351(3);
        int i = f18099[c16302.m38343(2)];
        c16302.m38351(10);
        int i2 = f18097[c16302.m38343(3)];
        if (c16302.m38343(1) != 0) {
            i2++;
        }
        c16302.m38351(3);
        int m383432 = c16302.m38343(4);
        c16302.m38351(1);
        if (m383432 > 0) {
            c16302.m38351(6);
            if (c16302.m38343(1) != 0) {
                i2 += 2;
            }
            c16302.m38351(1);
        }
        if (c16302.m38339() > 7) {
            c16302.m38351(7);
            if (c16302.m38343(1) != 0) {
                str3 = "audio/eac3-joc";
                c16302.m38344();
                c17714.m41484(c16302.m38348());
                C1297 c1297 = new C1297();
                c1297.m4469(str);
                c1297.m4465(str3);
                c1297.m4472(i2);
                c1297.m4456(i);
                c1297.m4447(c19643);
                c1297.m4471(str2);
                c1297.m4438(m38343);
                return c1297.m4440();
            }
        }
        str3 = "audio/eac3";
        c16302.m38344();
        c17714.m41484(c16302.m38348());
        C1297 c12972 = new C1297();
        c12972.m4469(str);
        c12972.m4465(str3);
        c12972.m4472(i2);
        c12972.m4456(i);
        c12972.m4447(c19643);
        c12972.m4471(str2);
        c12972.m4438(m38343);
        return c12972.m4440();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01af  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C10127 m16514(l.C16302 r23) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5893.m16514(l.ܽ֨֫):l.ۤۜۧ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16512(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m16510((b & 192) >> 6, b & 63);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16511(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f18095[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & UTF8.S_P3A) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16510(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f18099[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f18096[i3]) * 2;
        }
        int i5 = f18094[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
