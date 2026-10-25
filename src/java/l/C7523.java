package l;

import com.alipay.sdk.m.o.b;
import java.util.BitSet;

/* compiled from: 21MS */
/* renamed from: l.۟ܳۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7523 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f23139;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f23140;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f23141;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f23142;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f23143;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BitSet f23144;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f23145;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BitSet f23146;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f23147;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f23148;

    public C7523(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, BitSet bitSet, BitSet bitSet2) {
        this.f23148 = iArr;
        this.f23140 = iArr2;
        this.f23147 = i;
        this.f23141 = i3;
        this.f23145 = i2;
        this.f23143 = i4;
        this.f23144 = bitSet;
        this.f23146 = bitSet2;
        bitSet.set(i, i + i2);
        bitSet2.set(i3, i3 + i4);
        int i5 = i2 + i4 + 1;
        this.f23142 = new int[i5];
        this.f23139 = new int[i5];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20163() {
        int i;
        try {
            int sqrt = (((int) Math.sqrt(this.f23145 + this.f23143)) * 10) + b.j0;
            int i2 = this.f23145;
            if (i2 != 0 && (i = this.f23143) != 0) {
                m20162(0, i2, 0, i, Math.min(sqrt, i2 + i), false);
            }
        } catch (C13872 e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20164() {
        int i;
        int max = Math.max((((int) Math.sqrt(this.f23145 + this.f23143)) * 10) + b.j0, b.j0);
        int i2 = this.f23145;
        if (i2 == 0 || (i = this.f23143) == 0) {
            return;
        }
        m20162(0, i2, 0, i, Math.min(max, i2 + i), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r3[r15 - 1] < r3[r15 + 1]) goto L18;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m20162(int r23, int r24, int r25, int r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7523.m20162(int, int, int, int, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m20161(int i, int i2, int i3) {
        int i4;
        int min = Math.min(i3, Math.min(this.f23145 - i, this.f23143 - i2));
        int i5 = i;
        while (true) {
            i4 = i5 - i;
            if (i4 >= min) {
                break;
            }
            if (this.f23148[this.f23147 + i5] != this.f23140[this.f23141 + i2]) {
                break;
            }
            i5++;
            i2++;
        }
        return i4;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BitSet[] m20165() {
        return new BitSet[]{this.f23144, this.f23146};
    }
}
