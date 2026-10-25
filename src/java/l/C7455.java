package l;

/* compiled from: 88DU */
/* renamed from: l.۟ۨ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7455 extends AbstractC11689 {
    @Override // l.AbstractC22977
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo19982() {
        int i;
        byte[] bArr;
        if (this.f34848 >= 16) {
            i = Integer.rotateLeft(this.f34846, 18) + Integer.rotateLeft(this.f34847, 12) + Integer.rotateLeft(this.f34844, 7) + Integer.rotateLeft(this.f34845, 1);
        } else {
            i = 374761393;
        }
        int i2 = (int) (i + this.f34848);
        int i3 = 0;
        while (true) {
            int i4 = this.f34849 - 4;
            bArr = this.f34850;
            if (i3 > i4) {
                break;
            }
            i2 = Integer.rotateLeft((C6322.m17578(i3, bArr) * (-1028477379)) + i2, 17) * 668265263;
            i3 += 4;
        }
        while (i3 < this.f34849) {
            i2 = Integer.rotateLeft(((bArr[i3] & 255) * 374761393) + i2, 11) * (-1640531535);
            i3++;
        }
        int i5 = ((i2 >>> 15) ^ i2) * (-2048144777);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477379);
        return i6 ^ (i6 >>> 16);
    }

    @Override // l.AbstractC22977
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19983(int i, byte[] bArr) {
        int i2;
        C6322.m17572(0, i, bArr);
        this.f34848 += i;
        int i3 = this.f34849;
        int i4 = i3 + i;
        byte[] bArr2 = this.f34850;
        if (i4 < 16) {
            System.arraycopy(bArr, 0, bArr2, i3, i);
            this.f34849 += i;
            return;
        }
        if (i3 > 0) {
            System.arraycopy(bArr, 0, bArr2, i3, 16 - i3);
            int m17578 = (C6322.m17578(0, bArr2) * (-2048144777)) + this.f34845;
            this.f34845 = m17578;
            this.f34845 = Integer.rotateLeft(m17578, 13) * (-1640531535);
            int m175782 = (C6322.m17578(4, bArr2) * (-2048144777)) + this.f34844;
            this.f34844 = m175782;
            this.f34844 = Integer.rotateLeft(m175782, 13) * (-1640531535);
            int m175783 = (C6322.m17578(8, bArr2) * (-2048144777)) + this.f34847;
            this.f34847 = m175783;
            this.f34847 = Integer.rotateLeft(m175783, 13) * (-1640531535);
            int m175784 = (C6322.m17578(12, bArr2) * (-2048144777)) + this.f34846;
            this.f34846 = m175784;
            this.f34846 = Integer.rotateLeft(m175784, 13) * (-1640531535);
            i2 = 16 - this.f34849;
            this.f34849 = 0;
        } else {
            i2 = 0;
        }
        int i5 = i - 16;
        int i6 = this.f34845;
        int i7 = this.f34844;
        int i8 = this.f34847;
        int i9 = this.f34846;
        while (i2 <= i5) {
            i6 = Integer.rotateLeft((C6322.m17578(i2, bArr) * (-2048144777)) + i6, 13) * (-1640531535);
            i7 = Integer.rotateLeft((C6322.m17578(i2 + 4, bArr) * (-2048144777)) + i7, 13) * (-1640531535);
            i8 = Integer.rotateLeft((C6322.m17578(i2 + 8, bArr) * (-2048144777)) + i8, 13) * (-1640531535);
            i9 = Integer.rotateLeft((C6322.m17578(i2 + 12, bArr) * (-2048144777)) + i9, 13) * (-1640531535);
            i2 += 16;
        }
        this.f34845 = i6;
        this.f34844 = i7;
        this.f34847 = i8;
        this.f34846 = i9;
        if (i2 < i) {
            int i10 = i - i2;
            System.arraycopy(bArr, i2, bArr2, 0, i10);
            this.f34849 = i10;
        }
    }
}
