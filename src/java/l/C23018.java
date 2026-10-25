package l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;

/* compiled from: 81ID */
/* renamed from: l.᩺۬᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23018 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13845 f74092;

    public C23018(C13845 c13845) {
        this.f74092 = c13845;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        ActivityC17169 activityC17169;
        activityC17169 = this.f74092.f41285.f6276;
        m20266(activityC17169);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C20197 c20197;
        C20197 c201972;
        InterfaceC13049 edit = ApplicationC20075.f65008.edit();
        C13845 c13845 = this.f74092;
        edit.putString("dex_backup_name", c13845.m31260()).apply();
        C1832 c1832 = c13845.f41285;
        c20197 = c1832.f6275;
        c20197.m46434(c13845.m31260());
        c201972 = c1832.f6275;
        c1832.f6273 = c201972.m46433();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        BaseAdapter baseAdapter;
        DialogInterfaceC0206 dialogInterfaceC0206;
        C13845 c13845 = this.f74092;
        c13845.m31262();
        C1832 c1832 = c13845.f41285;
        baseAdapter = c1832.f6277;
        baseAdapter.notifyDataSetChanged();
        dialogInterfaceC0206 = c1832.f6274;
        dialogInterfaceC0206.m1449();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC17169 activityC17169;
        activityC17169 = this.f74092.f41285.f6276;
        activityC17169.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
