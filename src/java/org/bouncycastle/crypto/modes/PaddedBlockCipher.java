package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes.dex */
public class PaddedBlockCipher extends DefaultBufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        ((DefaultBufferedBlockCipher) this).buf = new byte[blockCipher.getBlockSize()];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        int i2;
        int i3;
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        if (((DefaultBufferedBlockCipher) this).forEncryption) {
            if (((DefaultBufferedBlockCipher) this).bufOff != blockSize) {
                i3 = 0;
            } else {
                if ((blockSize * 2) + i > bArr.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                i3 = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i);
                ((DefaultBufferedBlockCipher) this).bufOff = 0;
            }
            byte b = (byte) (blockSize - ((DefaultBufferedBlockCipher) this).bufOff);
            while (true) {
                int i4 = ((DefaultBufferedBlockCipher) this).bufOff;
                if (i4 >= blockSize) {
                    break;
                }
                ((DefaultBufferedBlockCipher) this).buf[i4] = b;
                ((DefaultBufferedBlockCipher) this).bufOff = i4 + 1;
            }
            i2 = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i + i3) + i3;
        } else {
            if (((DefaultBufferedBlockCipher) this).bufOff != blockSize) {
                throw new DataLengthException("last block incomplete in decryption");
            }
            BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
            byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
            int processBlock = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
            int i5 = bArr3[blockSize - 1] & 255;
            if (i5 > blockSize) {
                throw new InvalidCipherTextException("pad block corrupted");
            }
            int i6 = processBlock - i5;
            System.arraycopy(bArr3, 0, bArr, i, i6);
            i2 = i6;
        }
        reset();
        return i2;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        int i2 = i + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i2 % bArr.length;
        if (length != 0) {
            i2 -= length;
        } else if (!((DefaultBufferedBlockCipher) this).forEncryption) {
            return i2;
        }
        return i2 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) {
        int i2 = ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int processBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            i3 = processBlock;
        }
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
        int i4 = ((DefaultBufferedBlockCipher) this).bufOff;
        ((DefaultBufferedBlockCipher) this).bufOff = i4 + 1;
        bArr3[i4] = b;
        return i3;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
        int length = bArr3.length;
        int i4 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i5 = length - i4;
        int i6 = 0;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            int processBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i3);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            i2 -= i5;
            i += i5;
            i6 = processBlock;
            while (i2 > ((DefaultBufferedBlockCipher) this).buf.length) {
                i6 += ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr, i, bArr2, i3 + i6);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, i2);
        ((DefaultBufferedBlockCipher) this).bufOff += i2;
        return i6;
    }
}
