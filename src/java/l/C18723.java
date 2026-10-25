package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 56B1 */
/* renamed from: l.ᩴۧᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18723 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1083 f59188;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC5317 f59189;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f59190;

    public C18723(DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317, AbstractC1083 abstractC1083, List list) {
        this.f59189 = dialogInterfaceOnDismissListenerC5317;
        this.f59188 = abstractC1083;
        this.f59190 = list;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        AbstractActivityC12266 abstractActivityC12266;
        abstractActivityC12266 = this.f59189.f16596;
        m20266(abstractActivityC12266);
        this.f23322.m31860((Runnable) null);
        this.f59188.mo3739();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18723.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        AbstractActivityC12266 abstractActivityC12266;
        if (this.f23322.m31868()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12003d);
        } else {
            C21374.m48457(R.string.MT_Protector_res_0x7f1203ea);
        }
        abstractActivityC12266 = this.f59189.f16596;
        abstractActivityC12266.m29797();
        this.f59188.mo3732();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC12266 abstractActivityC12266;
        AbstractActivityC12266 abstractActivityC122662;
        boolean m31868 = this.f23322.m31868();
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f59189;
        if (m31868) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12003d);
        } else if (!this.f59188.mo3734(exc)) {
            abstractActivityC12266 = dialogInterfaceOnDismissListenerC5317.f16596;
            abstractActivityC12266.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
        abstractActivityC122662 = dialogInterfaceOnDismissListenerC5317.f16596;
        abstractActivityC122662.m29797();
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        AbstractActivityC12266 abstractActivityC12266;
        abstractActivityC12266 = this.f59189.f16596;
        abstractActivityC12266.m29792();
        this.f23322.m31857();
    }
}
