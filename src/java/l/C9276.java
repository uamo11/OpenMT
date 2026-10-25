package l;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: Z1GQ */
/* renamed from: l.ۢ֫ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9276 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f28083;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f28084;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f28085;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7744 f28086;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28087;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f28088;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21434 f28089;

    public C9276(C7864 c7864, ActivityC17169 activityC17169, String str, AbstractC15440 abstractC15440) {
        this.f28088 = c7864;
        this.f28085 = activityC17169;
        this.f28087 = str;
        this.f28084 = abstractC15440;
        this.f28083 = C9170.m23579(c7864.getViewLifecycleOwner());
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C12392 c12392;
        c12392 = this.f28088.f24374;
        this.f28086 = c12392.m30436().mo26562();
        m20270(this.f28085, this.f28083);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C7744 c7744 = this.f28086;
        try {
            C21434 m16580 = C5916.m16580(c7744);
            this.f28089 = m16580;
            m16580.m48549("<--id-c5skl23kjndf-->", this.f28087);
            this.f28084.m36510(this.f28089.mo14987());
            if (c7744 != null) {
                c7744.close();
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
        if (this.f28083.m23581()) {
            long mo23117 = this.f28084.mo23117();
            C7864 c7864 = this.f28088;
            c7864.f24363 = mo23117;
            c7864.startActivity(new Intent(c7864.getContext(), (Class<?>) ActivityC13676.class));
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        int m38634;
        C12392 c12392;
        if (this.f28083.m23581()) {
            this.f28085.m10223(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C1580) || (m38634 = ((C1580) exc).m5400().m38634()) == -1) {
                return;
            }
            c12392 = this.f28088.f24374;
            c12392.m30372(m38634 - 1);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C7744 c7744 = this.f28086;
        if (c7744 != null) {
            c7744.close();
        }
        m20273();
    }
}
