package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 14V2 */
/* renamed from: l.ܶ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15460 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20401 f47323;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15460(ActivityC20401 activityC20401, ActivityC20401 activityC204012) {
        super(activityC204012, -1);
        this.f47323 = activityC20401;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        ActivityC20401 activityC20401 = this.f47323;
        String trim = m31260().trim();
        if (trim.isEmpty()) {
            m31262();
            return;
        }
        if (trim.contains("\\") || trim.contains("/")) {
            m31263(R.string.MT_Protector_res_0x7f1203ae);
            return;
        }
        AbstractC15440 m5957 = C1789.m5957(trim);
        if (m5957.mo23120()) {
            m31263(R.string.MT_Protector_res_0x7f1203a1);
            return;
        }
        try {
            m5957.m36510("{\n  \"example1\"\n  \"例子1\"\n}\n{\n  \"example2\"\n  \"例子2\"\n}\n{\n  \"LineBreak\\nLineBreak\"\n  \"换行\\n换行\"\n}\n");
            ActivityC20401.m46723(activityC20401);
            m31262();
        } catch (Exception e) {
            activityC20401.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
