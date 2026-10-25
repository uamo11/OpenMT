package l;

import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* compiled from: 61L9 */
/* renamed from: l.ۚ᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5607 extends AbstractC7548 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9170 f17354;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f17355;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f17356;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4733 f17357;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f17358;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14799 f17359;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f17360 = true;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f17361;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f17362;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f17363;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14799 f17364;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C4733 f17365;

    public C5607(ActivityC1748 activityC1748, boolean z, C12392 c12392, boolean z2, C12392 c123922, C9170 c9170, ResultCallback resultCallback) {
        this.f17358 = activityC1748;
        this.f17362 = z;
        this.f17355 = c12392;
        this.f17363 = z2;
        this.f17356 = c123922;
        this.f17354 = c9170;
        this.f17361 = resultCallback;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C23077 c23077;
        C13658 c13658;
        C23077 c230772;
        C23077 c230773;
        C13658 c136582;
        C23077 c230774;
        boolean z = this.f17362;
        ActivityC1748 activityC1748 = this.f17358;
        if (z) {
            c230773 = activityC1748.f6057;
            if (c230773 != null) {
                c136582 = activityC1748.f6067;
                this.f17365 = new C4733(c136582.f40732);
                C12392 c12392 = this.f17355;
                InterfaceC7785 m30436 = c12392.m30436();
                String m30531 = c12392.m30531();
                c230774 = activityC1748.f6057;
                this.f17364 = C14799.m35198(m30436, m30531, c230774);
            }
        }
        if (this.f17363) {
            c23077 = activityC1748.f6065;
            if (c23077 != null) {
                this.f17360 = false;
                c13658 = activityC1748.f6052;
                this.f17357 = new C4733(c13658.f40732);
                C12392 c123922 = this.f17356;
                InterfaceC7785 m304362 = c123922.m30436();
                String m305312 = c123922.m30531();
                c230772 = activityC1748.f6065;
                this.f17359 = C14799.m35198(m304362, m305312, c230772);
            }
        }
        m20267(activityC1748, R.string.MT_Protector_res_0x7f1208d2);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C14799 c14799 = this.f17364;
        try {
            C14799 c147992 = this.f17359;
            C9170 c9170 = this.f17354;
            if (c14799 != null) {
                try {
                    this.f17360 = true;
                    c14799.m35203(this.f17365);
                    C4925.m14315(new RunnableC19719(0, c9170, this.f17355));
                } finally {
                }
            }
            if (c147992 != null) {
                this.f17360 = false;
                c147992.m35203(this.f17357);
                C4925.m14315(new RunnableC0667(0, c9170, this.f17356));
            }
            if (c147992 != null) {
                c147992.close();
            }
            if (c14799 != null) {
                c14799.close();
            }
        } catch (Throwable th) {
            if (c14799 != null) {
                try {
                    c14799.close();
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
        if (this.f17354.m23581()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
        }
        ResultCallback resultCallback = this.f17361;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f17354.m23581()) {
            C12392 c12392 = this.f17360 ? this.f17355 : this.f17356;
            if (exc instanceof C4343) {
                c12392.m30372(((C4343) exc).m13050() - 1);
            } else if (exc instanceof C1580) {
                int m38634 = ((C1580) exc).m5400().m38634();
                if (m38634 != -1) {
                    c12392.m30372(m38634 - 1);
                }
            } else if (exc instanceof C14658) {
                C14658 c14658 = (C14658) exc;
                C19287.m44466(c14658.f44794, c14658.f44798).m44474(c12392);
            } else if (exc instanceof C3781) {
                ((C3781) exc).m11437(c12392);
            }
        }
        ResultCallback resultCallback = this.f17361;
        if (resultCallback != null) {
            resultCallback.onFailure(C18321.m42696(exc));
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C14799 c14799 = this.f17364;
        if (c14799 != null) {
            c14799.close();
        }
        C14799 c147992 = this.f17359;
        if (c147992 != null) {
            c147992.close();
        }
        m20273();
    }
}
