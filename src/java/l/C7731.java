package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* compiled from: H77X */
/* renamed from: l.۟᩸֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7731 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f23926;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23930;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f23925 = {0, 32, 64, 96, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 288, 320, 352, MLKEMEngine.KyberPolyBytes, 416, 448};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int[] f23920 = {0, 32, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f23924 = {0, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320};

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f23921 = {0, 32, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 144, DHParameters.DEFAULT_MINIMUM_LENGTH, PicnicEngine.MAX_AUX_BYTES, 192, BERTags.FLAGS, 256};

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int[] f23922 = {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 144, DHParameters.DEFAULT_MINIMUM_LENGTH};

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int[] f23923 = {44100, 48000, 32000};

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f23918 = {22050, 24000, 16000};

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int[] f23919 = {11025, 12000, 8000};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f23931 = new byte[4096];

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f23928 = -9223372036854775807L;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f23927 = -9223372036854775807L;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f23929 = ByteBuffer.allocateDirect(0);

    public C7731(int i) {
        this.f23926 = Math.max(0, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20708() {
        this.f23930 = 0;
        this.f23928 = -9223372036854775807L;
        this.f23927 = -9223372036854775807L;
        this.f23929.clear();
        this.f23929.limit(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.ByteBuffer m20707(long r19, java.nio.ByteBuffer r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7731.m20707(long, java.nio.ByteBuffer):java.nio.ByteBuffer");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m20706(long j) {
        long j2 = this.f23927;
        return j2 == -9223372036854775807L ? j : j2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14080 m20705(int i, byte[] bArr) {
        int m52580;
        int i2;
        int i3 = (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        if ((i3 & (-2097152)) != -2097152) {
            return null;
        }
        int i4 = (i3 >>> 19) & 3;
        int i5 = (i3 >>> 17) & 3;
        int i6 = (i3 >>> 12) & 15;
        int i7 = (i3 >>> 10) & 3;
        int i8 = (i3 >>> 9) & 1;
        if (i4 == 1 || i5 == 0 || i6 == 0 || i6 == 15 || i7 == 3) {
            return null;
        }
        int i9 = i4 == 3 ? i5 == 3 ? f23925[i6] : i5 == 2 ? f23920[i6] : f23924[i6] : i5 == 3 ? f23921[i6] : f23922[i6];
        int i10 = i4 == 3 ? f23923[i7] : i4 == 2 ? f23918[i7] : f23919[i7];
        if (i5 == 3) {
            m52580 = (((i9 * 12000) / i10) + i8) * 4;
            i2 = MLKEMEngine.KyberPolyBytes;
        } else if (i5 != 1 || i4 == 3) {
            m52580 = C23868.m52580(i9, 144000, i10, i8);
            i2 = 1152;
        } else {
            m52580 = C23868.m52580(i9, 72000, i10, i8);
            i2 = 576;
        }
        if (m52580 <= 4) {
            return null;
        }
        return new C14080(m52580, i10, i2);
    }
}
