package l;

/* compiled from: XAZX */
/* renamed from: l.ܶܰᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15273 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8219[] f46865;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1163 f46866;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f46867;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f46868;

    public C15273(C21625 c21625, C8219[] c8219Arr, int i) {
        this.f46866 = new C1163(c21625);
        this.f46865 = c8219Arr;
        this.f46868 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36282(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        while (i < i2) {
            C1163 c1163 = this.f46866;
            c1163.m3964(i);
            int m3963 = c1163.m3963();
            i++;
            if (m3963 != 0 && c1163.m3959() != 0) {
                boolean z = true;
                int i8 = i;
                int i9 = i8;
                int i10 = i9;
                while (true) {
                    if (i8 >= i2) {
                        i8 = i9;
                        break;
                    }
                    c1163.m3964(i8);
                    char m3959 = c1163.m3959();
                    if (m3959 != 0) {
                        if (c1163.m3963() > (z ? m3963 + 1 : m3963)) {
                            i10 = i8 + 1;
                            i9 = i10;
                            i8++;
                            z = false;
                        }
                    }
                    if (m3959 == 0) {
                        i9 = i8 + 1;
                        i8++;
                        z = false;
                    } else if ((m3959 == '}' || m3959 == ']' || m3959 == ')' || m3959 == '>') && i10 != i) {
                        i10 = i8;
                    }
                }
                int i11 = i;
                while (i11 < i10) {
                    c1163.m3964(i11);
                    i3 = c1163.f4202;
                    C8219 c8219 = this.f46865[i3 - this.f46868];
                    i4 = c1163.f4204;
                    int min = Math.min(i10, i4);
                    i5 = c1163.f4203;
                    int i12 = min - i5;
                    if (this.f46867) {
                        for (i7 = c1163.f4206; i7 < i12; i7++) {
                            char[] cArr = c8219.f25323;
                            int[] iArr = c8219.f25327;
                            int i13 = iArr[i7];
                            iArr[i7] = i13 + 1;
                            cArr[i13] = (char) m3963;
                        }
                    } else {
                        i6 = c1163.f4206;
                        int[] iArr2 = c8219.f25325;
                        iArr2[i6] = iArr2[i6] + 1;
                        iArr2[i12] = iArr2[i12] - 1;
                    }
                    i11 = min;
                }
                m36282(i, i8);
                i = i8;
            }
        }
    }
}
