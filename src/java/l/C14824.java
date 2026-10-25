package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: 8985 */
/* renamed from: l.ܳ᩹᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14824 extends AbstractC16891 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f45223;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f45224;

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo6006(C16560 c16560, C16560 c165602) {
    }

    @Override // l.AbstractC16891
    /* renamed from: ۗ */
    public final String mo6007() {
        return "trash";
    }

    @Override // l.AbstractC16891
    /* renamed from: ۟ */
    public final boolean mo6011() {
        return true;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final boolean mo6014(String str) {
        return false;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ֫ */
    public final boolean mo6015() {
        return false;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۫ */
    public final boolean mo6016() {
        return true;
    }

    @Override // l.AbstractC16891
    /* renamed from: ܽ */
    public final void mo6018(C16560 c16560) {
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩺ */
    public final void mo6021() {
    }

    static {
        C13654.m32812("trash");
        C9214.m23656("trash", "local", new C23270());
        f45224 = new C14097(R.string.MT_Protector_res_0x7f12060b, R.drawable.MT_Protector_res_0x7f080242);
        f45223 = new C17647(R.string.MT_Protector_res_0x7f1205b0, R.drawable.MT_Protector_res_0x7f0801dc);
    }

    public C14824(C12951 c12951) {
        super(c12951);
    }

    public C14824(int i) {
        super(i, "/");
    }

    @Override // l.AbstractC16891
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo35230(String str) {
        super.mo35230(str);
        String m39741 = m39741();
        if (m39741.length() <= 1 || m39741.indexOf(47, 1) != m39741.length() - 1) {
            return;
        }
        super.mo35230("/");
    }

    @Override // l.AbstractC16891
    /* renamed from: ۙ */
    public final String mo6009() {
        String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f1207df);
        C6337 m29289 = C11982.m29289(m39741());
        if (m29289 == null) {
            return m14327.concat("/");
        }
        StringBuilder m15339 = C5368.m15339(m14327);
        m15339.append(m29289.m17614());
        return AbstractC16891.m39728(m15339.toString());
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩶ */
    public final AbstractC13921 mo6020() {
        return C11982.f35872;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۤ */
    public final List mo6012() {
        String m39741 = m39741();
        ArrayList mo7637 = C11982.f35872.mo7637(m39741, true);
        if (m39741.length() > 1) {
            mo7637.add(0, C15688.f48358);
        }
        return mo7637;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final AbstractC1661 mo15165(C2450 c2450) {
        C19744 c19744 = new C19744(R.string.MT_Protector_res_0x7f1205ec, R.drawable.MT_Protector_res_0x7f0801e5);
        c19744.m5604();
        return c19744;
    }

    @Override // l.AbstractC16891
    /* renamed from: ܺ */
    public final AbstractC1661 mo15169() {
        return new C4221(R.string.MT_Protector_res_0x7f1205ca, R.drawable.MT_Protector_res_0x7f0801e6);
    }

    @Override // l.AbstractC16891
    /* renamed from: ۘ */
    public final AbstractC1661 mo6008() {
        return new DialogInterfaceOnDismissListenerC4926();
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩴ */
    public final AbstractC1661 mo15172() {
        return new C5632(R.string.MT_Protector_res_0x7f1207e3, R.drawable.MT_Protector_res_0x7f080235);
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo35231() {
        return C10087.m25350();
    }

    @Override // l.AbstractC16891
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo35227() {
        return C3031.m9281();
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo35226(C16560 c16560, InterfaceC17889 interfaceC17889) {
        C21374.m48457(R.string.MT_Protector_res_0x7f12015c);
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩻ */
    public final InterfaceC10834 mo14827() {
        return C13392.f40017;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo35228(C16560 c16560) {
        C21234 m30958;
        if (m39741().length() > 1) {
            return null;
        }
        boolean m39030 = c16560.m39030();
        long j = 0;
        for (InterfaceC17889 interfaceC17889 : c16560.m39014()) {
            if (!m39030 || interfaceC17889.isChecked()) {
                if ((interfaceC17889 instanceof C12687) && (m30958 = ((C12687) interfaceC17889).m30958()) != null) {
                    j += m30958.size();
                }
            }
        }
        return C4925.m14327(R.string.MT_Protector_res_0x7f1207be) + ": " + C22927.m51020(j);
    }

    @Override // l.AbstractC16891
    /* renamed from: ܳ */
    public final C12244 mo6017() {
        C6337 m29289 = C11982.m29289(m39741());
        return new C12244(C4925.m14327(R.string.MT_Protector_res_0x7f1207df), m29289 == null ? "/" : m29289.m17614(), C19883.f64186);
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo35229() {
        return m39741().length() > 1;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۛ */
    public final List mo6010() {
        return Arrays.asList(AbstractC16891.f51864, AbstractC16891.f51865, AbstractC16891.f51860, f45224, f45223, AbstractC16891.m39725(R.string.MT_Protector_res_0x7f120189, true));
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final AbstractC15440 mo6013(InterfaceC17889 interfaceC17889) {
        return interfaceC17889.mo24433();
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo6005(C16560 c16560, List list, Runnable runnable) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10211 c10211 = (C10211) it.next();
            InterfaceC17889 m25624 = c10211.m25624();
            if (m25624 instanceof C12687) {
                c10211.m25620(((C12687) m25624).mo24433());
            }
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            c16560.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }
}
