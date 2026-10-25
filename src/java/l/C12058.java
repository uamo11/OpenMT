package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.HashMap;

/* compiled from: XAJ9 */
/* renamed from: l.۫֡ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C12058 extends AbstractC6138 {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C18090 f36066;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C18090 f36067;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public String f36068;

    @Override // l.AbstractC3817
    /* renamed from: ۡ */
    public final boolean mo3145() {
        return false;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76965;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2d, m11517("saveAsPath"), C4925.m14327(R.string.MT_Protector_res_0x7f1205ba));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f1205ba);
        m11555(R.string.MT_Protector_res_0x7f1207a7);
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        String m11556 = m11556("inputPath1");
        String m115562 = m11556("inputPath2");
        String m11535 = m11535("zipPath1");
        String m115352 = m11535("zipPath2");
        AbstractC3163 abstractC3163 = m11543().containsKey("statelessVisitor1") ? (AbstractC3163) C11806.m28856(m11560("statelessVisitor1"), false) : null;
        AbstractC3163 abstractC31632 = m11543().containsKey("statelessVisitor2") ? (AbstractC3163) C11806.m28856(m11560("statelessVisitor2"), false) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        boolean z = m11535 == null || m115352 == null;
        boolean z2 = m11535 == null && m115352 == null;
        if (m11535 != null) {
            C18090 c18090 = new C18090(m11535);
            this.f36066 = c18090;
            C9942.m25066(hashMap, c18090, m11556, z);
            m11556 = m11535.concat(m11556);
        } else if (abstractC3163 != null) {
            C9942.m25062(hashMap, abstractC3163, m11556, z2, "", this);
            m11556 = abstractC3163.m9680() + m11556;
        } else {
            C9942.m25064(hashMap, C16999.m39866(m11556, new String[0]), z2, "", this);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        if (m115352 != null) {
            C18090 c180902 = new C18090(m115352);
            this.f36067 = c180902;
            C9942.m25066(hashMap2, c180902, m115562, z);
            m115562 = m115352.concat(m115562);
        } else if (abstractC31632 != null) {
            C9942.m25062(hashMap2, abstractC31632, m115562, z2, "", this);
            m115562 = abstractC31632.m9680() + m115562;
        } else {
            C9942.m25064(hashMap2, C16999.m39866(m115562, new String[0]), z2, "", this);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        this.f36068 = C8198.m21696(m11556, m115562, hashMap, hashMap2, new C12763(this));
        return m11545();
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526()) {
            if (this.f36068.isEmpty()) {
                C21374.m48463(R.string.MT_Protector_res_0x7f1206ed);
                return;
            }
            String str = this.f36068;
            String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f1205ba);
            String m11556 = m11556("saveAsPath");
            int i = C7017.f21654;
            ActivityC14946.m35399(main, str, m14327, m11556, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C0349.m1793(this.f36066);
        C0349.m1793(this.f36067);
        C15528.m36596();
    }
}
