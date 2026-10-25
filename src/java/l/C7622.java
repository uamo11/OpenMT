package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;

/* compiled from: G7TD */
/* renamed from: l.۟ܿ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C7622 extends AbstractC20250 {

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C4553 f23565 = new C4553();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76966;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2c, m11556("descPath"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo23259("...");
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        String[] m11558 = m11558("ARG_PATHS");
        String m11556 = m11556("targetPath");
        AbstractC13921 m11526 = m11526();
        AbstractC3163 abstractC3163 = (AbstractC3163) m11553();
        this.f23565.m13405();
        this.f23565.m13401(m11526, abstractC3163, m11558, m11556, new C13971(this));
        return m11545();
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
            c16560.m39015();
        }
        List m13400 = this.f23565.m13400();
        if (m13400.isEmpty() || !m11525(c165602)) {
            return;
        }
        c165602.m39000((Collection) m13400);
        c165602.m39015();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C4553 c4553 = this.f23565;
        AbstractC3163 m13404 = c4553.m13404();
        C15528.m36595(m13404.mo9688());
        AbstractC13921 m13403 = c4553.m13403();
        if (m13403 instanceof C2499) {
            C15528.m36596();
        } else if (m13403 instanceof AbstractC3163) {
            AbstractC3163 abstractC3163 = (AbstractC3163) m13403;
            if (abstractC3163.mo9688().equals(m13404.mo9688())) {
                return;
            }
            C15528.m36595(abstractC3163.mo9688());
        }
    }
}
