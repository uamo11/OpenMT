package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: YAH9 */
/* renamed from: l.ۛۨᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6042 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f18531;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f18532;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17186 f18533;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7744 f18534;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f18535;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13409 f18536;

    public C6042(C12392 c12392, AbstractActivityC3346 abstractActivityC3346, InterfaceC17186 interfaceC17186) {
        this.f18532 = c12392;
        this.f18535 = abstractActivityC3346;
        this.f18533 = interfaceC17186;
        this.f18531 = C9170.m23578(c12392);
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        this.f18534 = this.f18532.m30436().mo26562();
        AbstractActivityC3346 abstractActivityC3346 = this.f18535;
        if (abstractActivityC3346 != null) {
            m20267(abstractActivityC3346, R.string.MT_Protector_res_0x7f1207a7);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C12392 c12392 = this.f18532;
        C7744 c7744 = this.f18534;
        try {
            C19012 c19012 = new C19012(C7850.toPath(c12392.getContext().getCacheDir()).resolve("format-output"), C6417.m17744());
            try {
                this.f18533.mo40425(c12392, c7744, c19012);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                this.f18536 = c19012.finish();
                c19012.close();
                if (c7744 != null) {
                    c7744.close();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (c7744 != null) {
                try {
                    c7744.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f18531.m23581()) {
            C22975.m51115(this.f18532, this.f18536);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f18531.m23581()) {
            if (this.f18533 == InterfaceC17186.f52685 && (exc instanceof C14658)) {
                C14658 c14658 = (C14658) exc;
                C19287.m44466(c14658.f44794, c14658.f44798).m44474(this.f18532);
            }
            AbstractActivityC3346 abstractActivityC3346 = this.f18535;
            if (abstractActivityC3346 != null) {
                abstractActivityC3346.m10223(exc, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        try {
            C13409 c13409 = this.f18536;
            if (c13409 != null) {
                c13409.close();
            }
        } finally {
            C7744 c7744 = this.f18534;
            if (c7744 != null) {
                c7744.close();
            }
            m20273();
        }
    }
}
