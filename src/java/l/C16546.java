package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: R7YU */
/* renamed from: l.ܽۡ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16546 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6669 f50843;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f50844;

    public C16546(ActivityC6669 activityC6669, View view) {
        this.f50843 = activityC6669;
        this.f50844 = view;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f50843, R.string.MT_Protector_res_0x7f120b33);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C19258 buildDialog = this.f50843.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f120b31);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        C8960.m23095(buildDialog.m44438());
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f50844.setEnabled(true);
        this.f50843.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C23881 m42496 = C18237.m42480(4213).m42496();
        if (!m42496.m52607()) {
            throw new C19401(C1575.m5392(m42496, R.string.MT_Protector_res_0x7f120520));
        }
    }
}
