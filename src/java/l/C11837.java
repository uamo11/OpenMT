package l;

import java.util.Arrays;

/* compiled from: M6NW */
/* renamed from: l.ۨܿ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11837 implements InterfaceC23125 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f35311;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f35312;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f35313;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f35314;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f35315;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f35316;

    @Override // l.InterfaceC14574
    /* renamed from: ֫ */
    public final int mo6200() {
        return -1;
    }

    @Override // l.InterfaceC14574
    /* renamed from: ܽ */
    public final void mo6207(int i) {
    }

    public C11837(CharSequence charSequence, Runnable runnable) {
        int i;
        C11003.requireNonNull(charSequence);
        this.f35313 = charSequence;
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            if ((i3 & 1023) == 0) {
                runnable.run();
            }
            if (Character.isHighSurrogate(charSequence.charAt(i2)) && (i = i2 + 1) < length && Character.isLowSurrogate(charSequence.charAt(i))) {
                int[] iArr = this.f35314;
                if (iArr == null) {
                    this.f35314 = new int[16];
                } else {
                    int i5 = this.f35312;
                    if (i5 == iArr.length) {
                        this.f35314 = Arrays.copyOf(iArr, i5 * 2);
                    }
                }
                int[] iArr2 = this.f35314;
                int i6 = this.f35312;
                iArr2[i6] = i2 - i6;
                this.f35312 = i6 + 1;
                i2 = i;
            }
            i2++;
            i3 = i4;
        }
        runnable.run();
        this.f35315 = length - this.f35312;
    }

    @Override // l.InterfaceC14574
    /* renamed from: ۧ */
    public final void mo6204() {
        if (this.f35316 >= this.f35315) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f35311;
        this.f35311 = Character.charCount(Character.codePointAt(this.f35313, i)) + i;
        this.f35316++;
    }

    @Override // l.InterfaceC14574
    /* renamed from: ۧ */
    public final int mo6203(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = this.f35316;
        long j = i2;
        if (i > 0) {
            i--;
        }
        long j2 = j + i;
        if (j2 < 0 || j2 >= this.f35315) {
            return -1;
        }
        return Character.codePointAt(this.f35313, j2 == ((long) i2) ? this.f35311 : m28922((int) j2));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m28922(int i) {
        int i2 = 0;
        int i3 = this.f35312;
        while (i2 < i3) {
            int i4 = (i2 + i3) >>> 1;
            if (this.f35314[i4] < i) {
                i2 = i4 + 1;
            } else {
                i3 = i4;
            }
        }
        return i + i2;
    }

    @Override // l.InterfaceC14574
    public final int index() {
        return this.f35316;
    }

    @Override // l.InterfaceC14574
    public final int size() {
        return this.f35315;
    }

    @Override // l.InterfaceC14574
    /* renamed from: ֫ */
    public final void mo6201(int i) {
        if (i < 0 || i > this.f35315) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "Index: "));
        }
        this.f35316 = i;
        this.f35311 = m28922(i);
    }

    @Override // l.InterfaceC23125
    /* renamed from: ֫ */
    public final String mo12025(C14763 c14763) {
        int i = c14763.f45081;
        int i2 = this.f35315;
        int min = Math.min(i, i2);
        int min2 = (int) Math.min(c14763.f45082 + 1, i2);
        if (min < 0 || min2 < min) {
            throw new IndexOutOfBoundsException("Interval: " + c14763);
        }
        int m28922 = m28922(min);
        int m289222 = m28922(min2);
        CharSequence charSequence = this.f35313;
        if (charSequence instanceof String) {
            return ((String) charSequence).substring(m28922, m289222);
        }
        if (m28922 == m289222) {
            return "";
        }
        int i3 = m289222 - m28922;
        char[] cArr = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            cArr[i4] = charSequence.charAt(m28922 + i4);
        }
        return new String(cArr);
    }

    public final String toString() {
        return mo12025(C14763.m35067(0, this.f35315 - 1));
    }
}
