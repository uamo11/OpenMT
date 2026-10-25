package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;

/* compiled from: O8BF */
/* renamed from: l.᩶ܳ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20239 extends AbstractC20250 {

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65443 = 0;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f65444;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public C11339 f65447 = new C11339();

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C4553 f65445 = new C4553();

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f65446 = true;

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76967;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        if (m11552("streamMode")) {
            return C4925.m14306(R.string.MT_Protector_res_0x7f120a2f, m11531("targetPath"));
        }
        return this.f65446 ? C4925.m14306(R.string.MT_Protector_res_0x7f120a28, C4925.m14327(R.string.MT_Protector_res_0x7f12052f).toLowerCase()) : C4925.m14306(R.string.MT_Protector_res_0x7f120a31, m11531("targetPath"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo23259("...");
        if (m11552("streamMode")) {
            return;
        }
        m46498(m11535("ARG_MSG_FROM"), C4925.m14327(R.string.MT_Protector_res_0x7f12052f).toLowerCase());
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        AbstractC13921 abstractC13921;
        String[] m11558 = m11558("ARG_PATHS");
        String m11556 = m11556("targetPath");
        AbstractC3163 abstractC3163 = (AbstractC3163) m11526();
        AbstractC3163 abstractC31632 = (AbstractC3163) m11553();
        boolean m11552 = m11552("streamMode");
        if (m11552) {
            abstractC13921 = abstractC3163;
        } else {
            AbstractC15440 m36535 = C16293.f50111.m36535("");
            this.f65444 = m36535;
            m36535.m36508();
            this.f65447.m28011(abstractC3163, abstractC31632, m11556, m11558, this.f65444.mo23554(), new C15298(this));
            if (mo1526()) {
                return C17222.m40521();
            }
            m11536(R.string.MT_Protector_res_0x7f120797);
            mo23259("...");
            m46501(false);
            m46498(C4925.m14327(R.string.MT_Protector_res_0x7f12052f).toLowerCase(), m11535("ARG_MSG_TO"));
            AbstractC13921 c19702 = new C19702(this.f65447.m28010());
            m11558 = (String[]) C5378.stream(c19702.mo7637("/", true)).map(new C1981(2)).toArray(new C8244());
            this.f65445.m13402(new C21650(this));
            abstractC13921 = c19702;
        }
        C22355 c22355 = new C22355(this, m11552);
        this.f65445.m13401(abstractC13921, abstractC31632, m11558, m11556, c22355);
        return m11545();
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        List m13400 = this.f65445.m13400();
        if (m13400.isEmpty() || !m11525(c165602)) {
            return;
        }
        c165602.m39000((Collection) m13400);
        c165602.m39015();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440 = this.f65444;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
        C15528.m36596();
        AbstractC3163 m13404 = this.f65445.m13404();
        if (m13404 != null) {
            C15528.m36595(m13404.mo9688());
        }
    }
}
