package l;

import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* compiled from: 46OI */
/* renamed from: l.ۗ۟ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3096 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3179 f9680;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21625 f9681;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f9682;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f9683;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f9684;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f9685;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f9686;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f9687;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f9688;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f9689;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20736 f9690;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f9691;

    public C3096(AbstractC3179 abstractC3179, int i, int i2, int i3, int i4, int i5) {
        this.f9680 = abstractC3179;
        C20736 c20736 = abstractC3179.f9998;
        this.f9690 = c20736;
        this.f9681 = abstractC3179.f10033;
        this.f9683 = i2;
        this.f9685 = i3;
        this.f9682 = i4;
        this.f9686 = i5;
        this.f9688 = abstractC3179.mo8164();
        int m47366 = c20736.m47366(abstractC3179.m9762(i, true));
        this.f9689 = m47366;
        int m47365 = c20736.m47365(abstractC3179.m9762(i + i2, false));
        this.f9691 = m47365;
        this.f9687 = c20736.m47355(m47366);
        this.f9684 = (c20736.m47358(m47365) + i3) - i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9447(AbstractC3179 abstractC3179, int i, int i2) {
        AbstractC3179 abstractC31792 = this.f9680;
        return abstractC3179 == abstractC31792 && abstractC31792.f9998 == this.f9690 && abstractC31792.f10033 == this.f9681 && !abstractC31792.mo9770() && !this.f9680.f10019 && this.f9680.mo8171() == null && this.f9680.mo8164() == this.f9688 && i == this.f9682 && i2 == this.f9686 && this.f9680.f10018.equals(this.f9680.f10021.m30544());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe A[LOOP:2: B:16:0x006b->B:25:0x00fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[EDGE_INSN: B:26:0x009d->B:27:0x009d BREAK  A[LOOP:2: B:16:0x006b->B:25:0x00fe], SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C4507 m9446(l.AbstractC3179 r20, java.util.function.BooleanSupplier r21) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3096.m9446(l.ۗۤᩳ, java.util.function.BooleanSupplier):l.ۙ۟ᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9445(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Layout preparation canceled");
        }
    }
}
