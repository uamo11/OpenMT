package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: O44L */
/* renamed from: l.ۛ᩷۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6304 extends AbstractC7715 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f19489;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9833 f19490;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f19491;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f19492;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9833 f19493;

    @Override // l.AbstractC7715
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6304 mo17363() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6304(C14439 c14439, int i, C9833 c9833, C9833 c98332) {
        super(c14439, 5);
        this.f19491 = c14439;
        this.f19492 = i;
        this.f19493 = c9833;
        this.f19490 = c98332;
    }

    @Override // l.AbstractC7715
    /* renamed from: ᩳ */
    public final AbstractC7715 mo5817() {
        C9833 c9833;
        AbstractC7715[] abstractC7715Arr;
        C9833 m17364 = m17364();
        boolean m17359 = m17359();
        C14439 c14439 = this.f19491;
        if (m17359) {
            c9833 = null;
        } else {
            c14439.f44254.m4811(this.f19493);
            c14439.f44254.m4824(4);
            c9833 = c14439.f44254.m4800(167);
        }
        if (m17364 != null) {
            c14439.f44254.m4811(m17364);
            c14439.f44254.m4824(3);
        }
        c14439.f44254.m4811(c9833);
        abstractC7715Arr = c14439.f44255;
        return abstractC7715Arr[this.f23845];
    }

    @Override // l.AbstractC7715
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo17361() {
        mo5817().mo17361();
    }

    @Override // l.AbstractC7715
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17358() {
        mo5817().mo17358();
    }

    @Override // l.AbstractC7715
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo17362(int i) {
        C12171.m29636();
        throw null;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C9833 m17360() {
        AbstractC5144 abstractC5144 = this.f19489;
        int i = this.f19492;
        C9833 c9833 = this.f19493;
        C14439 c14439 = this.f19491;
        if (abstractC5144 == null) {
            return C1365.m4783(c9833, c14439.f44254.m4800(i));
        }
        int m4816 = c14439.f44254.m4816();
        C9833 m4783 = C1365.m4783(c9833, c14439.f44254.m4800(i));
        C1365 c1365 = c14439.f44254;
        c1365.f4986.m27979(this.f19489, 128, m4816, c1365.m4816());
        return m4783;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9833 m17364() {
        AbstractC5144 abstractC5144 = this.f19489;
        int i = this.f19492;
        C9833 c9833 = this.f19490;
        C14439 c14439 = this.f19491;
        if (abstractC5144 == null) {
            return C1365.m4783(c9833, c14439.f44254.m4800(C1365.m4787(i)));
        }
        int m4816 = c14439.f44254.m4816();
        C9833 m4783 = C1365.m4783(c9833, c14439.f44254.m4800(C1365.m4787(i)));
        C1365 c1365 = c14439.f44254;
        c1365.f4986.m27979(this.f19489, 256, m4816, c1365.m4816());
        return m4783;
    }

    @Override // l.AbstractC7715
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo17365() {
        throw new AssertionError();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m17359() {
        return this.f19493 == null && this.f19492 == 168;
    }

    public final String toString() {
        String[] strArr;
        StringBuilder sb = new StringBuilder("cond(");
        int i = C1365.f4960;
        strArr = C2777.f8654;
        return C9045.m23341(sb, strArr[this.f19492], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
