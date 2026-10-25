package l;

import android.R;

/* compiled from: 6AY4 */
/* renamed from: l.ܳ֡᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14180 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f42818;

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ۘ */
    public final void mo7756() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14180(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        super(viewOnClickListenerC19121, R.string.paste);
        this.f42818 = viewOnClickListenerC19121;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String m31260 = m31260();
        C11233.m27799((Object) m31260);
        if (!m31260.startsWith("/")) {
            m31260 = "/".concat(m31260);
        }
        C11233.m27799((Object) m31260);
        this.f42818.m44083(m31260, (InterfaceC2123) null);
        m31262();
    }
}
