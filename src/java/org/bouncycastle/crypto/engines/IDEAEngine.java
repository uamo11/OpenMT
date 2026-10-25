package org.bouncycastle.crypto.engines;

import l.C20177;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes.dex */
public class IDEAEngine implements BlockCipher {
    public static final int BASE = 65537;
    public static final int BLOCK_SIZE = 8;
    public static final int MASK = 65535;
    public boolean forEncryption;
    public int[] workingKey = null;

    public IDEAEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128));
    }

    private int bytesToWord(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    private int[] expandKey(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i2 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i2 >= 8) {
                break;
            }
            iArr[i2] = bytesToWord(bArr, i2 * 2);
            i2++;
        }
        for (i = 8; i < 52; i++) {
            int i3 = i & 7;
            if (i3 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i3 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] generateWorkingKey(boolean z, byte[] bArr) {
        return z ? expandKey(bArr) : invertKey(expandKey(bArr));
    }

    private void ideaFunc(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 2);
        int bytesToWord3 = bytesToWord(bArr, i + 4);
        int bytesToWord4 = bytesToWord(bArr, i + 6);
        int i3 = 0;
        int i4 = 0;
        while (i3 < 8) {
            int mul = mul(bytesToWord, iArr[i4]);
            int i5 = (bytesToWord2 + iArr[i4 + 1]) & 65535;
            int i6 = (bytesToWord3 + iArr[i4 + 2]) & 65535;
            int mul2 = mul(bytesToWord4, iArr[i4 + 3]);
            int i7 = i4 + 5;
            int mul3 = mul(i6 ^ mul, iArr[i4 + 4]);
            i4 += 6;
            int mul4 = mul(((i5 ^ mul2) + mul3) & 65535, iArr[i7]);
            int i8 = 65535 & (mul3 + mul4);
            bytesToWord = mul ^ mul4;
            bytesToWord4 = mul2 ^ i8;
            int i9 = i6 ^ mul4;
            i3++;
            bytesToWord3 = i5 ^ i8;
            bytesToWord2 = i9;
        }
        wordToBytes(mul(bytesToWord, iArr[i4]), bArr2, i2);
        wordToBytes(bytesToWord3 + iArr[i4 + 1], bArr2, i2 + 2);
        wordToBytes(bytesToWord2 + iArr[i4 + 2], bArr2, i2 + 4);
        wordToBytes(mul(bytesToWord4, iArr[i4 + 3]), bArr2, i2 + 6);
    }

    private int[] invertKey(int[] iArr) {
        int[] iArr2 = new int[52];
        int mulInv = mulInv(iArr[0]);
        int addInv = addInv(iArr[1]);
        int addInv2 = addInv(iArr[2]);
        iArr2[51] = mulInv(iArr[3]);
        iArr2[50] = addInv2;
        iArr2[49] = addInv;
        int i = 48;
        iArr2[48] = mulInv;
        int i2 = 4;
        for (int i3 = 1; i3 < 8; i3++) {
            int i4 = iArr[i2];
            iArr2[i - 1] = iArr[i2 + 1];
            iArr2[i - 2] = i4;
            int mulInv2 = mulInv(iArr[i2 + 2]);
            int addInv3 = addInv(iArr[i2 + 3]);
            int i5 = i2 + 5;
            int addInv4 = addInv(iArr[i2 + 4]);
            i2 += 6;
            iArr2[i - 3] = mulInv(iArr[i5]);
            iArr2[i - 4] = addInv3;
            iArr2[i - 5] = addInv4;
            i -= 6;
            iArr2[i] = mulInv2;
        }
        int i6 = iArr[i2];
        iArr2[i - 1] = iArr[i2 + 1];
        iArr2[i - 2] = i6;
        int mulInv3 = mulInv(iArr[i2 + 2]);
        int addInv5 = addInv(iArr[i2 + 3]);
        int addInv6 = addInv(iArr[i2 + 4]);
        iArr2[i - 3] = mulInv(iArr[i2 + 5]);
        iArr2[i - 4] = addInv6;
        iArr2[i - 5] = addInv5;
        iArr2[i - 6] = mulInv3;
        return iArr2;
    }

    private int mul(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = BASE - i2;
        } else if (i2 == 0) {
            i3 = BASE - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 - i6) + (i5 < i6 ? 1 : 0);
        }
        return i3 & 65535;
    }

    private int mulInv(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = BASE / i;
        int i3 = BASE % i;
        int i4 = 1;
        while (i3 != 1) {
            int i5 = i / i3;
            i %= i3;
            i4 = ((i5 * i2) + i4) & 65535;
            if (i == 1) {
                return i4;
            }
            int i6 = i3 / i;
            i3 %= i;
            i2 = ((i6 * i4) + i2) & 65535;
        }
        return (1 - i2) & 65535;
    }

    private void wordToBytes(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public int addInv(int i) {
        return (0 - i) & 65535;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        ideaFunc(iArr, bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(C20177.m46409("invalid parameter passed to IDEA init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = generateWorkingKey(z, key);
        this.forEncryption = z;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z)));
    }
}
