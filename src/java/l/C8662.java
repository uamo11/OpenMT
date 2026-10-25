package l;

import bin.mt.plus.R;

/* compiled from: Z11M */
/* renamed from: l.ۡۙ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8662 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15716 f26428;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8662(C15716 c15716, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, R.string.MT_Protector_res_0x7f1208b4);
        this.f26428 = c15716;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String trim = m31260().trim();
        if (trim.isEmpty()) {
            trim = "/sdcard/MT2";
        }
        String m38319 = C16293.m38319(trim);
        String mo23554 = C16293.m38327().mo23554();
        if (!C16293.m38330(m38319)) {
            m31251("Permission denied");
            return;
        }
        String mo235542 = C16293.m38327().mo23554();
        int i = ViewOnClickListenerC2040.f6808;
        String string = ApplicationC20075.f65008.getString("extract_apk_path", null);
        if (string != null) {
            if (string.startsWith(mo23554 + "/") || string.equals(mo23554)) {
                StringBuilder m15339 = C5368.m15339(mo235542);
                m15339.append(string.substring(mo23554.length()));
                ApplicationC20075.f65008.edit().putString("extract_apk_path", m15339.toString()).apply();
            }
        }
        String string2 = ApplicationC20075.f65008.getString("inject_log_path", null);
        if (string2 != null) {
            String mo235543 = C16293.f50120.mo23554();
            if (string2.startsWith("[SDCARD]/") || string2.equals("[SDCARD]")) {
                string2 = C20087.m46305(8, string2, C5368.m15339(mo235543));
            }
            if (string2.startsWith(mo23554 + "/") || string2.equals(mo23554)) {
                StringBuilder m153392 = C5368.m15339(mo235542);
                m153392.append(string2.substring(mo23554.length()));
                String sb = m153392.toString();
                if (sb.startsWith(mo235543)) {
                    sb = "[SDCARD]" + sb.substring(mo235543.length());
                }
                ApplicationC20075.f65008.edit().putString("inject_log_path", sb).apply();
            }
        }
        C15716 c15716 = this.f26428;
        c15716.m11313().edit().putString(c15716.m6911(), m38319).apply();
        m31262();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ۘ */
    public final void mo7756() {
        C15716 c15716 = this.f26428;
        c15716.m11313().edit().remove(c15716.m6911()).apply();
        C16293.m38328("/sdcard/MT2");
    }
}
