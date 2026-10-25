package l;

import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import java.util.regex.PatternSyntaxException;

/* compiled from: G4ML */
/* renamed from: l.ۚ᩺ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5669 extends AbstractDialogInterfaceOnClickListenerC1828 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f17510;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f17511;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5669(C15545 c15545, AbstractActivityC3346 abstractActivityC3346, String str) {
        super(abstractActivityC3346, "srepr");
        AbstractActivityC3346 abstractActivityC33462;
        this.f17510 = c15545;
        this.f17511 = str;
        m6052(R.string.MT_Protector_res_0x7f120373);
        abstractActivityC33462 = c15545.f47915;
        C14615 c14615 = new C14615(abstractActivityC33462, null, R.style.MT_Protector_res_0x7f130025);
        c14615.setText(R.string.MT_Protector_res_0x7f120374);
        m6053(c14615);
        C10235 m14607 = m6055().m14607();
        m14607.mo25910((CharSequence) str);
        m14607.m30317(PluginEditText.SYNTAX_REGEX_REPLACEMENT, true);
        m14607.m25926(131073);
        m14607.m30477("$0\\n");
        m6060();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828
    /* renamed from: ܿ */
    public final void mo6058() {
        C15545 c15545 = this.f17510;
        String m6057 = m6057();
        try {
            C13574.m32628((C11459) null, m6057);
            if (!m6057.equals(this.f17511)) {
                c15545.m36659();
                ApplicationC20075.f65008.edit().putString("srep", m6057).apply();
                m6056();
            }
            m6051();
        } catch (PatternSyntaxException e) {
            C15545.m36651(c15545, e);
        }
    }
}
