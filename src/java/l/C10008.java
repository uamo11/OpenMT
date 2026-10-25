package l;

import java.util.List;

/* compiled from: D6VU */
/* renamed from: l.ۤۖܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10008 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 f30139;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17768 f30140 = new C17768();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f30141;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f30142;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f30143;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16356 f30144;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9302 f30145;

    public C10008(C9302 c9302, C21834 c21834, int i) {
        this.f30145 = c9302;
        this.f30139 = c21834;
        this.f30142 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25176(int i, int i2, C21834 c21834) {
        int i3;
        int i4 = this.f30142;
        int max = Math.max(i, i4) - i4;
        int min = Math.min(i2 - i4, this.f30145.m23880());
        if (max >= min) {
            return;
        }
        if (this.f30144 != null && max < this.f30143) {
            m25174();
        }
        if (this.f30144 != null && max > (i3 = this.f30143)) {
            C9302 c9302 = this.f30145;
            C17768 c17768 = this.f30140;
            c17768.m41620(c9302);
            c17768.m41621(i3);
            if (c17768.m41619() < max) {
                m25174();
            } else {
                this.f30144.m38503(max - this.f30143, c17768.m41624(), c17768.m41626() && c17768.m41622() == this.f30143);
            }
            c17768.m41620(C9302.m23878());
        }
        if (this.f30144 == null) {
            this.f30144 = new C16356();
            this.f30141 = max;
        }
        this.f30144.m38503(min - max, c21834, max + i4 == i);
        this.f30143 = min;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12829 m25175(C5774 c5774) {
        List list;
        List list2;
        List list3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C21834 c21834;
        int i7;
        int i8;
        list = c5774.f17749;
        boolean isEmpty = list.isEmpty();
        C21834 c218342 = this.f30139;
        if (isEmpty) {
            i7 = c5774.f17750;
            i8 = c5774.f17748;
            m25176(i7, i8, c218342);
            return null;
        }
        list2 = c5774.f17749;
        if (list2.size() == 1) {
            list3 = c5774.f17749;
            C12124 c12124 = (C12124) list3.get(0);
            i = c12124.f36212;
            i2 = c5774.f17750;
            if (i == i2) {
                i3 = c12124.f36211;
                i4 = c5774.f17748;
                if (i3 == i4) {
                    i5 = c5774.f17750;
                    i6 = c5774.f17748;
                    c21834 = c12124.f36213;
                    m25176(i5, i6, c218342.m49203(c21834));
                    return null;
                }
            }
        }
        return new C12829(c5774, m25174(), c218342, this.f30142);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25177(C12829 c12829) {
        this.f30145 = c12829.m31206();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9302 m25174() {
        C16356 c16356 = this.f30144;
        if (c16356 != null) {
            this.f30145 = this.f30145.m23881(this.f30141, this.f30143, c16356.m38502());
            this.f30144 = null;
        }
        return this.f30145;
    }
}
