package org.bouncycastle.pqc.crypto.picnic;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.Properties;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes2.dex */
public abstract class LowmcConstants {
    public KMatrices KMatrix;
    public KMatrices KMatrix_full;
    public KMatrices KMatrix_inv;
    public KMatrices LMatrix;
    public KMatrices LMatrix_full;
    public KMatrices LMatrix_inv;
    public KMatrices RConstants;
    public KMatrices RConstants_full;
    public int[] keyMatrices;
    public int[] keyMatrices_full;
    public int[] keyMatrices_inv;
    public int[] linearMatrices;
    public int[] linearMatrices_full;
    public int[] linearMatrices_inv;
    public int[] roundConstants;
    public int[] roundConstants_full;

    private KMatricesWithPointer GET_MAT(KMatrices kMatrices, int i) {
        KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(kMatrices);
        kMatricesWithPointer.setMatrixPointer(i * kMatricesWithPointer.getSize());
        return kMatricesWithPointer;
    }

    public static int[] ReadFromProperty(Properties properties, String str, int i) {
        byte[] decode = Hex.decode(removeCommas(properties.getProperty(str)));
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < decode.length / 4; i2++) {
            iArr[i2] = Pack.littleEndianToInt(decode, i2 * 4);
        }
        return iArr;
    }

    public static int[] readArray(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        int[] iArr = new int[readInt];
        for (int i = 0; i != readInt; i++) {
            iArr[i] = dataInputStream.readInt();
        }
        return iArr;
    }

    public static byte[] removeCommas(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != str.length(); i++) {
            if (str.charAt(i) != ',') {
                byteArrayOutputStream.write(str.charAt(i));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r3.numRounds == 4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer KMatrix(org.bouncycastle.pqc.crypto.picnic.PicnicEngine r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.stateSizeBits
            r1 = 128(0x80, float:1.8E-43)
            if (r0 != r1) goto L7
            goto L21
        L7:
            r1 = 129(0x81, float:1.81E-43)
            if (r0 != r1) goto Lc
            goto L1a
        Lc:
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L16
            int r3 = r3.numRounds
            r0 = 4
            if (r3 != r0) goto L21
            goto L1a
        L16:
            r3 = 255(0xff, float:3.57E-43)
            if (r0 != r3) goto L1d
        L1a:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.KMatrix_full
            goto L23
        L1d:
            r3 = 256(0x100, float:3.59E-43)
            if (r0 != r3) goto L28
        L21:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.KMatrix
        L23:
            org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer r3 = r2.GET_MAT(r3, r4)
            return r3
        L28:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.LowmcConstants.KMatrix(org.bouncycastle.pqc.crypto.picnic.PicnicEngine, int):org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer");
    }

    public KMatricesWithPointer KMatrixInv(PicnicEngine picnicEngine) {
        int i = picnicEngine.stateSizeBits;
        if (i == 129 || ((i == 192 && picnicEngine.numRounds == 4) || i == 255)) {
            return GET_MAT(this.KMatrix_inv, 0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r3.numRounds == 4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer LMatrix(org.bouncycastle.pqc.crypto.picnic.PicnicEngine r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.stateSizeBits
            r1 = 128(0x80, float:1.8E-43)
            if (r0 != r1) goto L7
            goto L21
        L7:
            r1 = 129(0x81, float:1.81E-43)
            if (r0 != r1) goto Lc
            goto L1a
        Lc:
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L16
            int r3 = r3.numRounds
            r0 = 4
            if (r3 != r0) goto L21
            goto L1a
        L16:
            r3 = 255(0xff, float:3.57E-43)
            if (r0 != r3) goto L1d
        L1a:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.LMatrix_full
            goto L23
        L1d:
            r3 = 256(0x100, float:3.59E-43)
            if (r0 != r3) goto L28
        L21:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.LMatrix
        L23:
            org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer r3 = r2.GET_MAT(r3, r4)
            return r3
        L28:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.LowmcConstants.LMatrix(org.bouncycastle.pqc.crypto.picnic.PicnicEngine, int):org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer");
    }

    public KMatricesWithPointer LMatrixInv(PicnicEngine picnicEngine, int i) {
        int i2 = picnicEngine.stateSizeBits;
        if (i2 == 129 || ((i2 == 192 && picnicEngine.numRounds == 4) || i2 == 255)) {
            return GET_MAT(this.LMatrix_inv, i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r3.numRounds == 4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer RConstant(org.bouncycastle.pqc.crypto.picnic.PicnicEngine r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.stateSizeBits
            r1 = 128(0x80, float:1.8E-43)
            if (r0 != r1) goto L7
            goto L21
        L7:
            r1 = 129(0x81, float:1.81E-43)
            if (r0 != r1) goto Lc
            goto L1a
        Lc:
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L16
            int r3 = r3.numRounds
            r0 = 4
            if (r3 != r0) goto L21
            goto L1a
        L16:
            r3 = 255(0xff, float:3.57E-43)
            if (r0 != r3) goto L1d
        L1a:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.RConstants_full
            goto L23
        L1d:
            r3 = 256(0x100, float:3.59E-43)
            if (r0 != r3) goto L28
        L21:
            org.bouncycastle.pqc.crypto.picnic.KMatrices r3 = r2.RConstants
        L23:
            org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer r3 = r2.GET_MAT(r3, r4)
            return r3
        L28:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.LowmcConstants.RConstant(org.bouncycastle.pqc.crypto.picnic.PicnicEngine, int):org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer");
    }
}
