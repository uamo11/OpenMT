package l;

import java.util.List;

/* compiled from: D6VU */
/* renamed from: l.۬ۖܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12829 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12124 f38524;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C9302 f38525;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17768 f38526;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f38527;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21834 f38528;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f38529;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f38530 = -1;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5774 f38531;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16356 f38532;

    public C12829(C5774 c5774, C9302 c9302, C21834 c21834, int i) {
        this.f38531 = c5774;
        this.f38525 = c9302;
        this.f38528 = c21834;
        this.f38529 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31205() {
        int i;
        C21834 c21834;
        int i2;
        int i3;
        int i4;
        List list;
        List list2;
        int i5;
        int i6;
        C21834 c218342;
        C21834 c218343;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.f38530;
        C5774 c5774 = this.f38531;
        int i13 = this.f38529;
        if (i12 < 0) {
            i9 = c5774.f17750;
            int max = Math.max(i9, i13) - i13;
            i10 = c5774.f17748;
            int min = Math.min(i10 - i13, this.f38525.m23880());
            if (max < min) {
                C9302 c9302 = this.f38525;
                int i14 = min - max;
                i11 = c5774.f17750;
                this.f38525 = c9302.m23881(max, min, C9302.m23868(i14, this.f38528, i11 == i13 + max));
            }
            this.f38530 = 0;
            return false;
        }
        C12124 c12124 = this.f38524;
        if (c12124 == null) {
            list = c5774.f17749;
            if (i12 == list.size()) {
                return true;
            }
            list2 = c5774.f17749;
            int i15 = this.f38530;
            this.f38530 = i15 + 1;
            C12124 c121242 = (C12124) list2.get(i15);
            i5 = c121242.f36212;
            int max2 = Math.max(i5, i13) - i13;
            i6 = c121242.f36211;
            int min2 = Math.min(i6 - i13, this.f38525.m23880());
            if (max2 < min2) {
                c218342 = c121242.f36213;
                if (c218342 != C21834.f69949) {
                    c218343 = c121242.f36213;
                    C12124 c121243 = new C12124(max2, min2, c218343);
                    this.f38524 = c121243;
                    C9302 c93022 = this.f38525;
                    i7 = c121243.f36212;
                    c93022.getClass();
                    C17768 c17768 = new C17768();
                    c17768.m41620(c93022);
                    c17768.m41621(i7);
                    this.f38526 = c17768;
                    this.f38532 = new C16356();
                    i8 = this.f38524.f36212;
                    this.f38527 = i8;
                    return false;
                }
            }
            this.f38524 = null;
            return false;
        }
        i = c12124.f36211;
        int min3 = Math.min(i, this.f38526.m41619());
        C16356 c16356 = this.f38532;
        int i16 = min3 - this.f38527;
        C21834 m41624 = this.f38526.m41624();
        c21834 = this.f38524.f36213;
        c16356.m38503(i16, m41624.m49203(c21834), this.f38526.m41626() && this.f38527 == this.f38526.m41622());
        this.f38527 = min3;
        i2 = this.f38524.f36211;
        if (min3 == i2) {
            C9302 c93023 = this.f38525;
            i3 = this.f38524.f36212;
            i4 = this.f38524.f36211;
            this.f38525 = c93023.m23881(i3, i4, this.f38532.m38502());
            this.f38524 = null;
            this.f38526 = null;
            this.f38532 = null;
            return false;
        }
        if (this.f38526.m41625()) {
            return false;
        }
        throw new IllegalStateException("Incomplete syntax style transaction coverage");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9302 m31206() {
        return this.f38525;
    }
}
