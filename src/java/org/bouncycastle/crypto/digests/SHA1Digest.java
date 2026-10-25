package org.bouncycastle.crypto.digests;

import l.C19373;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    public static final int DIGEST_LENGTH = 20;
    public static final int Y1 = 1518500249;
    public static final int Y2 = 1859775393;
    public static final int Y3 = -1894007588;
    public static final int Y4 = -899497514;
    public int H1;
    public int H2;
    public int H3;
    public int H4;
    public int H5;
    public int[] X;
    public int xOff;

    public SHA1Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public SHA1Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int g(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    private int h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 128, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i);
        Pack.intToBigEndian(this.H2, bArr, i + 4);
        Pack.intToBigEndian(this.H3, bArr, i + 8);
        Pack.intToBigEndian(this.H4, bArr, i + 12);
        Pack.intToBigEndian(this.H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest, org.bouncycastle.crypto.EncodableService
    public byte[] getEncodedState() {
        int i = this.xOff * 4;
        byte[] bArr = new byte[i + 41];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i2 = 0; i2 != this.xOff; i2++) {
            Pack.intToBigEndian(this.X[i2], bArr, (i2 * 4) + 40);
        }
        bArr[i + 40] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.H1;
        int i4 = this.H2;
        int i5 = this.H3;
        int i6 = this.H4;
        int i7 = this.H5;
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int m44633 = C19373.m44633(((i3 << 5) | (i3 >>> 27)) + f(i4, i5, i6), this.X[i8], Y1, i7);
            int i10 = (i4 >>> 2) | (i4 << 30);
            int m446332 = C19373.m44633(((m44633 << 5) | (m44633 >>> 27)) + f(i3, i10, i5), this.X[i8 + 1], Y1, i6);
            int i11 = (i3 >>> 2) | (i3 << 30);
            int m446333 = C19373.m44633(((m446332 << 5) | (m446332 >>> 27)) + f(m44633, i11, i10), this.X[i8 + 2], Y1, i5);
            i7 = (m44633 >>> 2) | (m44633 << 30);
            int i12 = i8 + 4;
            i4 = C19373.m44633(((m446333 << 5) | (m446333 >>> 27)) + f(m446332, i7, i11), this.X[i8 + 3], Y1, i10);
            i6 = (m446332 >>> 2) | (m446332 << 30);
            i8 += 5;
            i3 = C19373.m44633(((i4 << 5) | (i4 >>> 27)) + f(m446333, i6, i7), this.X[i12], Y1, i11);
            i5 = (m446333 >>> 2) | (m446333 << 30);
        }
        for (int i13 = 0; i13 < 4; i13++) {
            int m446334 = C19373.m44633(((i3 << 5) | (i3 >>> 27)) + h(i4, i5, i6), this.X[i8], Y2, i7);
            int i14 = (i4 >>> 2) | (i4 << 30);
            int m446335 = C19373.m44633(((m446334 << 5) | (m446334 >>> 27)) + h(i3, i14, i5), this.X[i8 + 1], Y2, i6);
            int i15 = (i3 >>> 2) | (i3 << 30);
            int m446336 = C19373.m44633(((m446335 << 5) | (m446335 >>> 27)) + h(m446334, i15, i14), this.X[i8 + 2], Y2, i5);
            i7 = (m446334 >>> 2) | (m446334 << 30);
            int i16 = i8 + 4;
            i4 = C19373.m44633(((m446336 << 5) | (m446336 >>> 27)) + h(m446335, i7, i15), this.X[i8 + 3], Y2, i14);
            i6 = (m446335 >>> 2) | (m446335 << 30);
            i8 += 5;
            i3 = C19373.m44633(((i4 << 5) | (i4 >>> 27)) + h(m446336, i6, i7), this.X[i16], Y2, i15);
            i5 = (m446336 >>> 2) | (m446336 << 30);
        }
        for (int i17 = 0; i17 < 4; i17++) {
            int m446337 = C19373.m44633(((i3 << 5) | (i3 >>> 27)) + g(i4, i5, i6), this.X[i8], Y3, i7);
            int i18 = (i4 >>> 2) | (i4 << 30);
            int m446338 = C19373.m44633(((m446337 << 5) | (m446337 >>> 27)) + g(i3, i18, i5), this.X[i8 + 1], Y3, i6);
            int i19 = (i3 >>> 2) | (i3 << 30);
            int m446339 = C19373.m44633(((m446338 << 5) | (m446338 >>> 27)) + g(m446337, i19, i18), this.X[i8 + 2], Y3, i5);
            i7 = (m446337 >>> 2) | (m446337 << 30);
            int i20 = i8 + 4;
            i4 = C19373.m44633(((m446339 << 5) | (m446339 >>> 27)) + g(m446338, i7, i19), this.X[i8 + 3], Y3, i18);
            i6 = (m446338 >>> 2) | (m446338 << 30);
            i8 += 5;
            i3 = C19373.m44633(((i4 << 5) | (i4 >>> 27)) + g(m446339, i6, i7), this.X[i20], Y3, i19);
            i5 = (m446339 >>> 2) | (m446339 << 30);
        }
        for (int i21 = 0; i21 <= 3; i21++) {
            int m4463310 = C19373.m44633(((i3 << 5) | (i3 >>> 27)) + h(i4, i5, i6), this.X[i8], Y4, i7);
            int i22 = (i4 >>> 2) | (i4 << 30);
            int m4463311 = C19373.m44633(((m4463310 << 5) | (m4463310 >>> 27)) + h(i3, i22, i5), this.X[i8 + 1], Y4, i6);
            int i23 = (i3 >>> 2) | (i3 << 30);
            int m4463312 = C19373.m44633(((m4463311 << 5) | (m4463311 >>> 27)) + h(m4463310, i23, i22), this.X[i8 + 2], Y4, i5);
            i7 = (m4463310 >>> 2) | (m4463310 << 30);
            int i24 = i8 + 4;
            i4 = C19373.m44633(((m4463312 << 5) | (m4463312 >>> 27)) + h(m4463311, i7, i23), this.X[i8 + 3], Y4, i22);
            i6 = (m4463311 >>> 2) | (m4463311 << 30);
            i8 += 5;
            i3 = C19373.m44633(((i4 << 5) | (i4 >>> 27)) + h(m4463312, i6, i7), this.X[i24], Y4, i23);
            i5 = (m4463312 >>> 2) | (m4463312 << 30);
        }
        this.H1 += i3;
        this.H2 += i4;
        this.H3 += i5;
        this.H4 += i6;
        this.H5 += i7;
        this.xOff = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            this.X[i25] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        this.X[this.xOff] = Pack.bigEndianToInt(bArr, i);
        int i2 = this.xOff + 1;
        this.xOff = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }
}
