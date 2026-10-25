package l;

import android.content.DialogInterface;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import org.json.JSONObject;

/* compiled from: 08W8 */
/* renamed from: l.᩻᩻ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C24027 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77847;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f77848;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IWXAPI f77849;

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
    }

    public C24027(AbstractActivityC3346 abstractActivityC3346, int i, IWXAPI iwxapi) {
        this.f77848 = abstractActivityC3346;
        this.f77847 = i;
        this.f77849 = iwxapi;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f77848);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C5242 c5242 = C7094.f21798;
        String[] m19098 = C7094.m19098(this.f77847, 1);
        C22470.f72773 = new RunnableC3858(1, m19098);
        JSONObject jSONObject = new JSONObject(m19098[0]);
        if ("OK".equals(jSONObject.getString("1"))) {
            PayReq payReq = new PayReq();
            C5242 c52422 = C22470.f72770;
            payReq.appId = C22470.m50420();
            payReq.partnerId = "1493963962";
            payReq.prepayId = jSONObject.getString("2");
            payReq.nonceStr = jSONObject.getString("3");
            payReq.timeStamp = jSONObject.getString("4");
            payReq.packageValue = jSONObject.getString("5");
            payReq.sign = jSONObject.getString("6");
            this.f77849.sendReq(payReq);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f77848.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
