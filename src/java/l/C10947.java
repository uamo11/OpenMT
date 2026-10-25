package l;

import java.util.Arrays;

/* compiled from: 04FP */
/* renamed from: l.ۧۧ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10947 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f32977;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12521 f32980;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f32974 = Integer.MAX_VALUE;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7150[] f32973 = new C7150[8];

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f32976 = 7;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f32979 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f32975 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f32978 = 4096;

    public C10947(C12521 c12521) {
        this.f32980 = c12521;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m27266(int i) {
        int i2;
        if (i > 0) {
            int length = this.f32973.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f32976;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f32973[length].f21947;
                i -= i4;
                this.f32975 -= i4;
                this.f32979--;
                i3++;
                length--;
            }
            C7150[] c7150Arr = this.f32973;
            int i5 = i2 + 1;
            System.arraycopy(c7150Arr, i5, c7150Arr, i5 + i3, this.f32979);
            C7150[] c7150Arr2 = this.f32973;
            int i6 = this.f32976 + 1;
            Arrays.fill(c7150Arr2, i6, i6 + i3, (Object) null);
            this.f32976 += i3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27265(C7150 c7150) {
        int i = c7150.f21947;
        int i2 = this.f32978;
        if (i > i2) {
            Arrays.fill(this.f32973, (Object) null);
            this.f32976 = this.f32973.length - 1;
            this.f32979 = 0;
            this.f32975 = 0;
            return;
        }
        m27266((this.f32975 + i) - i2);
        int i3 = this.f32979 + 1;
        C7150[] c7150Arr = this.f32973;
        if (i3 > c7150Arr.length) {
            C7150[] c7150Arr2 = new C7150[c7150Arr.length * 2];
            System.arraycopy(c7150Arr, 0, c7150Arr2, c7150Arr.length, c7150Arr.length);
            this.f32976 = this.f32973.length - 1;
            this.f32973 = c7150Arr2;
        }
        int i4 = this.f32976;
        this.f32976 = i4 - 1;
        this.f32973[i4] = c7150;
        this.f32979++;
        this.f32975 += i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m27269(java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10947.m27269(java.util.ArrayList):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27268(int i, int i2, int i3) {
        C12521 c12521 = this.f32980;
        if (i < i2) {
            c12521.m30720writeByte(i | i3);
            return;
        }
        c12521.m30720writeByte(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c12521.m30720writeByte(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c12521.m30720writeByte(i4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27270(C11816 c11816) {
        C22940.m51059().getClass();
        int m51058 = C22940.m51058(c11816);
        int mo2336 = c11816.mo2336();
        C12521 c12521 = this.f32980;
        if (m51058 < mo2336) {
            C12521 c125212 = new C12521();
            C22940.m51059().getClass();
            C22940.m51060(c11816, c125212);
            C11816 m30719 = c125212.m30719();
            m27268(m30719.mo2336(), 127, 128);
            c12521.m30710(m30719);
            return;
        }
        m27268(c11816.mo2336(), 127, 0);
        c12521.m30710(c11816);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27267(int i) {
        int min = Math.min(i, 16384);
        int i2 = this.f32978;
        if (i2 == min) {
            return;
        }
        if (min < i2) {
            this.f32974 = Math.min(this.f32974, min);
        }
        this.f32977 = true;
        this.f32978 = min;
        int i3 = this.f32975;
        if (min < i3) {
            if (min == 0) {
                Arrays.fill(this.f32973, (Object) null);
                this.f32976 = this.f32973.length - 1;
                this.f32979 = 0;
                this.f32975 = 0;
                return;
            }
            m27266(i3 - min);
        }
    }
}
