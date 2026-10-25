package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: K8BJ */
/* renamed from: l.ۛ᩺ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6370 extends AbstractC22366 {

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19705 = 0;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final C7325 f19706 = new C7325();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76954;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2a, m11531("targetPath"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        HashSet m19675 = this.f19706.m19675();
        if (m19675.isEmpty() || !m11525(c165602)) {
            return;
        }
        c165602.m39000((Collection) m19675);
        c165602.m39015();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        String[] m11558 = m11558("ARG_PATHS");
        String m11556 = m11556("targetPath");
        this.f19706.m19676(m11526(), m11558, m11556, new C10604(this));
        return m11545();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
