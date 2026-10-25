package l;

import android.view.View;
import bin.mt.plus.Main;

/* compiled from: L5KK */
/* renamed from: l.ۘܶܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4024 extends AbstractViewOnClickListenerC1201 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19547 f12770;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16828 f12771;

    @Override // l.AbstractC11580
    /* renamed from: ۧ */
    public final int mo6259() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4024(C19547 c19547, Main main, C16828 c16828) {
        super(main);
        this.f12770 = c19547;
        this.f12771 = c16828;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11813 m12101() {
        C16828 c16828 = this.f12771;
        C19883 m39597 = c16828.m39597();
        if (m39597 == null) {
            C17534 m39598 = c16828.m39598();
            if (m39598 != null) {
                C19883 m7317 = m39598.m40975() ? C19883.f64181 : C2204.m7292(c16828.m39588(), true).m7317();
                c16828.m39584(m7317);
                return m7317.f64248;
            }
            return C2204.m7292(c16828.m39588(), true).m7317().f64248;
        }
        return m39597.f64248;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f12770.f37526.m10155() || AbstractViewOnClickListenerC1201.f4338.m22793()) {
            return;
        }
        C16828 c16828 = this.f12771;
        C17534 m39598 = c16828.m39598();
        Main main = this.f34527;
        if (m39598 == null) {
            main.m127();
            AbstractC15440 m39866 = C16999.m39866(c16828.m39588(), new String[0]);
            C9340 m132 = main.m132();
            C11003.requireNonNull(m132);
            C16560 m24070 = m132.m24070();
            boolean mo23113 = m39866.mo23113();
            if (!mo23113) {
                m24070.m39053(m39866.getName());
            }
            m24070.m39033(mo23113 ? m39866.mo23554() : m39866.getParent(), true);
            return;
        }
        if (main.m125(m39598.m40974(), c16828.m39588(), m39598.m40975())) {
            main.m127();
        }
    }
}
