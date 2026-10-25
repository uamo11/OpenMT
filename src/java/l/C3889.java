package l;

import bin.mt.plus.R;
import java.io.IOException;

/* compiled from: M6WW */
/* renamed from: l.ۘۤ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3889 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f12442;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13732 f12443;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12444;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15176 f12445;

    public C3889(C15176 c15176, String str, boolean z) {
        this.f12445 = c15176;
        this.f12444 = str;
        this.f12442 = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۖۤ᩻] */
    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        AbstractActivityC3346 abstractActivityC3346;
        ?? r0 = new Runnable() { // from class: l.ۖۤ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C3889.this.m20273();
            }
        };
        C15176 c15176 = this.f12445;
        c15176.f46364 = r0;
        abstractActivityC3346 = c15176.f46358;
        m20272(abstractActivityC3346, 200);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C13732 m48492 = C21404.m48492(this.f12444);
        this.f12443 = m48492;
        if ((m48492.f41010 == EnumC6862.DIRECTORY) != this.f12442) {
            throw new IllegalArgumentException("Selected rule target type has changed");
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        boolean m35898;
        C15176 c15176 = this.f12445;
        m35898 = c15176.m35898();
        if (m35898) {
            C15176.m35887(c15176, this.f12443, true);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        boolean m35898;
        m35898 = this.f12445.m35898();
        if (m35898) {
            C21374.m48457(exc instanceof IOException ? R.string.MT_Protector_res_0x7f12056e : R.string.MT_Protector_res_0x7f120578);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C15176 c15176 = this.f12445;
        c15176.f46362 = false;
        m20273();
        c15176.f46364 = null;
    }
}
