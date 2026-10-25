package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* compiled from: G16V */
/* renamed from: l.ܰ᩺ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14132 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16683 f42615;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14132(ActivityC16683 activityC16683, ActivityC16683 activityC166832) {
        super(activityC166832, -1);
        this.f42615 = activityC16683;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C11040 c11040;
        ActivityC16683 activityC16683 = this.f42615;
        String m31260 = m31260();
        if (m31260.isEmpty()) {
            m31262();
            return;
        }
        if (m31260.contains("/") || m31260.contains("\\")) {
            m31263(R.string.MT_Protector_res_0x7f1203ae);
            return;
        }
        if (C16249.m38219(m31260)) {
            m31263(R.string.MT_Protector_res_0x7f1203a1);
            return;
        }
        try {
            C16249.m38217(new C9195(m31260));
            m31262();
            activityC16683.f51210 = C16249.m38218();
            c11040 = activityC16683.f51211;
            c11040.notifyDataSetChanged();
        } catch (IOException e) {
            activityC16683.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
