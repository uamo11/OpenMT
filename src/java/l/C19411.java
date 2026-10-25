package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.R;

/* compiled from: 31K1 */
/* renamed from: l.᩵ۤ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19411 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f62798;

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
    }

    public C19411(ActivityC17169 activityC17169) {
        this.f62798 = activityC17169;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f62798, R.string.MT_Protector_res_0x7f120808);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C12366 c12366;
        C12230 c12230;
        C12366 c123662;
        ActivityC17169 activityC17169 = this.f62798;
        c12366 = activityC17169.f52606;
        if (c12366 != null) {
            c123662 = activityC17169.f52606;
            c123662.m30075();
        }
        c12230 = activityC17169.f52608;
        c12230.m29734();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        Bundle bundle = new Bundle();
        ActivityC17169 activityC17169 = this.f62798;
        activityC17169.onSaveInstanceState(bundle);
        Intent intent = new Intent(activityC17169, (Class<?>) ActivityC17169.class);
        intent.putExtra("bundle", bundle);
        activityC17169.startActivity(intent);
        super/*android.app.Activity*/.finish();
        activityC17169.overridePendingTransition(0, 0);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f62798.m10223(exc, (DialogInterface.OnDismissListener) null);
    }
}
