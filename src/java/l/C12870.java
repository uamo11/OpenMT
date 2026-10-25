package l;

import java.util.Arrays;

/* compiled from: 76ZW */
/* renamed from: l.۬ۘܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12870 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38641;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38642;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f38643;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f38644;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38645;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f38646;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12165 f38647;

    public C12870(C12165 c12165) {
        C19927[] c19927Arr;
        C19927[] c19927Arr2;
        this.f38647 = c12165;
        c19927Arr = c12165.f36284;
        this.f38643 = new int[c19927Arr.length];
        c19927Arr2 = c12165.f36284;
        this.f38644 = new int[Math.min(16, c19927Arr2.length)];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4404 m31305(C14986 c14986) {
        int i;
        int[] iArr;
        EnumC21338 enumC21338;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        C4404 c4404;
        C11003.requireNonNull(c14986);
        int m35507 = c14986.m35507();
        C12165 c12165 = this.f38647;
        i = c12165.f36290;
        if (m35507 != i) {
            throw new IllegalArgumentException("Index and change set lengths differ");
        }
        this.f38646 = 0;
        this.f38642 = 0;
        this.f38645 = -1;
        if (this.f38641 == Integer.MAX_VALUE) {
            Arrays.fill(this.f38643, 0);
            this.f38641 = 0;
        }
        boolean z = true;
        this.f38641++;
        if (c14986.m35506()) {
            c4404 = C4404.f14096;
            return c4404;
        }
        for (int i2 = 0; i2 < c14986.m35504(); i2++) {
            int m35508 = c14986.m35508(i2);
            int m35510 = c14986.m35510(i2);
            boolean z2 = m35510 - m35508 != c14986.m35502(i2) - c14986.m35505(i2);
            iArr4 = c12165.f36289;
            m31304(0, iArr4.length, m35508, m35510, z2);
        }
        if (c14986.m35500()) {
            iArr3 = c12165.f36288;
            for (int i3 : iArr3) {
                m31303(i3);
            }
        }
        iArr = c12165.f36283;
        for (int i4 : iArr) {
            m31303(i4);
        }
        Arrays.sort(this.f38644, 0, this.f38642);
        enumC21338 = c12165.f36282;
        if (enumC21338 == EnumC21338.COMPLETE) {
            iArr2 = c12165.f36283;
            if (iArr2.length == 0) {
                z = false;
            }
        }
        return new C4404(Arrays.copyOf(this.f38644, this.f38642), z, this.f38645, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31304(int i, int i2, int i3, int i4, boolean z) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        C19927[] c19927Arr;
        int[] iArr4;
        if (i == i2) {
            return;
        }
        int i5 = (i + i2) >>> 1;
        this.f38646++;
        C12165 c12165 = this.f38647;
        iArr = c12165.f36285;
        if (iArr[i5] >= i3) {
            iArr2 = c12165.f36289;
            if (C12165.m29621(c12165, iArr2[i]) > i4) {
                return;
            }
            m31304(i, i5, i3, i4, z);
            iArr3 = c12165.f36289;
            int i6 = iArr3[i5];
            c19927Arr = c12165.f36284;
            if (c19927Arr[i6].m45893(i3, i4) || (z && C12165.m29621(c12165, i6) <= i4 && i3 <= C12165.m29618(c12165, i6))) {
                int i7 = this.f38645;
                iArr4 = c12165.f36287;
                this.f38645 = Math.max(i7, iArr4[i6]);
                m31303(i6);
            }
            m31304(i5 + 1, i2, i3, i4, z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31303(int i) {
        C19927[] c19927Arr;
        int[] iArr = this.f38643;
        int i2 = iArr[i];
        int i3 = this.f38641;
        if (i2 == i3) {
            return;
        }
        iArr[i] = i3;
        if (this.f38642 == this.f38644.length) {
            c19927Arr = this.f38647.f36284;
            int length = c19927Arr.length;
            int i4 = this.f38642;
            this.f38644 = Arrays.copyOf(this.f38644, Math.min(length, Math.max(16, i4 + (i4 >>> 1))));
        }
        int[] iArr2 = this.f38644;
        int i5 = this.f38642;
        this.f38642 = i5 + 1;
        iArr2[i5] = i;
    }
}
