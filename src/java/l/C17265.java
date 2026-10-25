package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* compiled from: L8OU */
/* renamed from: l.ܿۢۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17265 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f52918;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52919;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f52920;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52921;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52922;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f52923;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f52924;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40557(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int i6;
        int[] iArr2;
        int[] iArr3;
        int i7;
        int[] iArr4;
        int[] iArr5;
        int i8;
        int[] iArr6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f52924 = i2;
        strArr = C14442.f44265;
        this.f52923 = strArr[3 - i3];
        iArr = C14442.f44269;
        int i9 = iArr[i5];
        this.f52922 = i9;
        if (i2 == 2) {
            this.f52922 = i9 / 2;
        } else if (i2 == 0) {
            this.f52922 = i9 / 4;
        }
        int i10 = (i >>> 9) & 1;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i6 = MLKEMEngine.KyberPolyBytes;
            }
            i6 = 1152;
        } else {
            if (i2 != 3) {
                i6 = 576;
            }
            i6 = 1152;
        }
        this.f52920 = i6;
        if (i3 == 3) {
            if (i2 == 3) {
                iArr6 = C14442.f44263;
                i8 = iArr6[i4 - 1];
            } else {
                iArr5 = C14442.f44267;
                i8 = iArr5[i4 - 1];
            }
            this.f52918 = i8;
            this.f52921 = (((i8 * 12) / this.f52922) + i10) * 4;
        } else {
            if (i2 == 3) {
                if (i3 == 2) {
                    iArr4 = C14442.f44264;
                    i7 = iArr4[i4 - 1];
                } else {
                    iArr3 = C14442.f44266;
                    i7 = iArr3[i4 - 1];
                }
                this.f52918 = i7;
                this.f52921 = ((i7 * 144) / this.f52922) + i10;
            } else {
                iArr2 = C14442.f44268;
                int i11 = iArr2[i4 - 1];
                this.f52918 = i11;
                this.f52921 = (((i3 == 1 ? 72 : 144) * i11) / this.f52922) + i10;
            }
        }
        this.f52919 = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
