package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;

/* compiled from: MAIE */
/* renamed from: l.۬ܳ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13182 extends AbstractC20250 {

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C4553 f39407 = new C4553();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76954;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a31, m11556("descPath"));
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
        this.f39407.m13401(m11526(), (AbstractC3163) m11553(), m11558, m11556, new C3305(this));
        return m11545();
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        List m13400 = this.f39407.m13400();
        if (m13400.isEmpty() || !m11525(c165602)) {
            return;
        }
        c165602.m39000((Collection) m13400);
        c165602.m39015();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC3163 m13404 = this.f39407.m13404();
        if (m13404 != null) {
            C15528.m36595(m13404.mo9688());
        }
    }
}
