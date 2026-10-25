package l;

import android.R;
import bin.mt.plus.Main;

/* compiled from: Z1XC */
/* renamed from: l.᩵֨ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19135 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f60320;

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ۘ */
    public final void mo7756() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19135(Main main, C16560 c16560) {
        super(main, R.string.paste);
        this.f60320 = c16560;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String m31260 = m31260();
        if (!m31260.startsWith("/")) {
            m31260 = "/".concat(m31260);
        }
        boolean endsWith = m31260.endsWith("/");
        C16560 c16560 = this.f60320;
        if (!endsWith && c16560.m39044().mo6014(m31260)) {
            c16560.m39053(C9523.m24404(m31260));
            m31260 = C9523.m24406(m31260);
        }
        c16560.m39033(m31260, false);
        m31262();
    }
}
