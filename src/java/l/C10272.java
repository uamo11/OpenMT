package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: E29Y */
/* renamed from: l.ۤۨܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C10272 extends AbstractC6138 {

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public List f30942 = new ArrayList();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a26, m11517("output"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        ArrayList arrayList;
        EnumC21437 enumC21437;
        AbstractC15440 m11515 = m11515("output");
        String[] m11558 = m11558("ARG_PATHS");
        String m11556 = m11556("password");
        int m11548 = m11548("level");
        boolean m11552 = m11552("headerEncryption");
        boolean m115522 = m11552("deleteSources");
        long m11527 = m11527("splitSize");
        boolean m115523 = m11552("replaceExisting");
        C1764 m52845 = C24009.m52845((AbstractC3817) this, m11558, false);
        if (mo1526()) {
            return C17222.m40521();
        }
        C22142 m49744 = C22142.m49744(m11515, m115523 || m11527 != -1);
        AbstractC15440 m49751 = m49744.m49751();
        ArrayList arrayList2 = new ArrayList();
        C22351 c22351 = new C22351();
        c22351.f72421 = m52845.f6117.size();
        c22351.f72419 = m11548;
        c22351.f72420 = m11552;
        try {
            try {
                C13178.m32002(c22351, new C12388(this, m11527, m49751, arrayList2, m11556, m52845));
                if (mo1526()) {
                    C24009.m52846(arrayList2);
                    m49751.mo27929();
                    return C17222.m40521();
                }
                if (m11527 == -1) {
                    enumC21437 = EnumC21437.NONE;
                } else {
                    enumC21437 = EnumC21437.SEVEN_ZIP;
                }
                this.f30942 = m49744.m49750(arrayList2, enumC21437);
                if (mo1526()) {
                    return C17222.m40521();
                }
                if (m115522) {
                    C24009.m52848(this, m11558, this.f30942, m52845.m5894());
                }
                return C17222.m40520();
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                C24009.m52846(arrayList);
                m49751.mo27929();
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            arrayList = arrayList2;
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        boolean m11552 = m11552("compressToAnother");
        C24009.m52849(c17222, m11552, m11552 ? m11525(c165602) : m11542(c16560), c16560, c165602, C24009.m52844(this.f30942));
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
