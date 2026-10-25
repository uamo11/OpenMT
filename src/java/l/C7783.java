package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: G16V */
/* renamed from: l.۟᩺ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7783 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24056;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16683 f24057;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7783(ActivityC16683 activityC16683, ActivityC16683 activityC166832, String str) {
        super(activityC166832, -1);
        this.f24057 = activityC16683;
        this.f24056 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C11040 c11040;
        String m31260 = m31260();
        if (m31260.length() != 0) {
            String str = this.f24056;
            if (!m31260.equals(str)) {
                if (m31260.contains("/") || m31260.contains("\\")) {
                    m31263(R.string.MT_Protector_res_0x7f1203ae);
                    return;
                }
                if (!str.equalsIgnoreCase(m31260) && C16249.m38219(m31260)) {
                    m31263(R.string.MT_Protector_res_0x7f1203a1);
                    return;
                }
                if (!C16249.m38220(str, m31260)) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f120881);
                }
                ArrayList m38218 = C16249.m38218();
                ActivityC16683 activityC16683 = this.f24057;
                activityC16683.f51210 = m38218;
                c11040 = activityC16683.f51211;
                c11040.notifyDataSetChanged();
                m31262();
                return;
            }
        }
        m31262();
    }
}
