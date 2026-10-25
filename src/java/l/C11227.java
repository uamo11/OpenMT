package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 164Z */
/* renamed from: l.ۧ᩶ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11227 implements InterfaceC2054 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f33665;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f33666;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13041 f33667;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19883 f33668;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f33669;

    public C11227(String str, int i, C19883 c19883, String str2, InterfaceC13041 interfaceC13041) {
        this.f33665 = str;
        this.f33666 = i;
        this.f33668 = c19883;
        this.f33669 = str2;
        this.f33667 = interfaceC13041;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m27794() {
        boolean z;
        boolean z2;
        switch (this.f33665) {
            case "pt":
                z = C16870.f51763;
                return z;
            case "re":
                return C21939.m49417();
            case "tu":
                z2 = C16870.f51765;
                if (!z2 || !C9523.m24407()) {
                    return false;
                }
                break;
            default:
                return true;
        }
    }

    @Override // l.InterfaceC2054
    public final String getName() {
        return C4925.m14327(this.f33666);
    }

    public final String toString() {
        return C4925.m14327(this.f33666);
    }

    @Override // l.InterfaceC2054
    /* renamed from: ۧ */
    public final C11813 mo6741() {
        return this.f33668.f64248;
    }

    @Override // l.InterfaceC2054
    /* renamed from: ֫ */
    public final String mo6739() {
        return this.f33665;
    }

    @Override // l.InterfaceC2054
    /* renamed from: ܽ */
    public final boolean mo6742() {
        if (this.f33666 == R.string.MT_Protector_res_0x7f12076f) {
            return C4715.m13816();
        }
        return false;
    }

    @Override // l.InterfaceC2054
    /* renamed from: ֫ */
    public final void mo6740(Main main) {
        this.f33667.accept(main);
    }
}
