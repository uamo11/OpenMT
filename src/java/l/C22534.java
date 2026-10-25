package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* compiled from: O1K3 */
/* renamed from: l.᩹᩷ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22534 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12656 f72915;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f72916;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f72917;

    public C22534(ActivityC17169 activityC17169, C12656 c12656, ResultCallback resultCallback) {
        this.f72916 = activityC17169;
        this.f72915 = c12656;
        this.f72917 = resultCallback;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f72916, R.string.MT_Protector_res_0x7f1208d2);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        this.f72915.mo3044();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        this.f72916.m40347();
        C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
        ResultCallback resultCallback = this.f72917;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f72915.mo3043(exc) != null) {
            this.f72916.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
        ResultCallback resultCallback = this.f72917;
        if (resultCallback != null) {
            resultCallback.onFailure(C18321.m42696(exc));
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
