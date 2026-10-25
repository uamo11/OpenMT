package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: Y96B */
/* renamed from: l.ۜᩳ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6938 extends AbstractC22366 {

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public String f21400;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f21401 = new ArrayList();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76970;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        String str = this.f21400;
        if (str == null) {
            str = "null";
        }
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2d, str, C4925.m14327(R.string.MT_Protector_res_0x7f120a8c));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120301);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        AbstractC15440[] m39875 = C16999.m39875(m11558("ARG_PATHS"));
        int i = 0;
        boolean z = m39875.length == 1;
        if (z) {
            m50128();
        }
        String m11556 = m11556("password");
        boolean m11552 = m11552("removeSource");
        long j = 0;
        for (AbstractC15440 abstractC15440 : m39875) {
            j += abstractC15440.mo23127();
        }
        C19277 c19277 = new C19277(j);
        if (!z) {
            c19277.m44459(new C16648(4, this));
        }
        int length = m39875.length;
        while (true) {
            if (i >= length) {
                break;
            }
            AbstractC15440 abstractC154402 = m39875[i];
            String name = abstractC154402.getName();
            this.f21400 = name;
            mo11520(name);
            AbstractC15440 m36524 = abstractC154402.m36524(name + ".encrypt");
            C19277 c192772 = new C19277(abstractC154402.mo23127());
            if (z) {
                c192772.m44459(new C16648(4, this));
            } else {
                c192772.m44459(new C19907(this));
            }
            C5390 c5390 = new C5390(m36524.m36525(), m11556, 1, true);
            try {
                abstractC154402.m36495(c5390, new C23871(this, c192772, c19277));
                c5390.close();
                if (mo1526()) {
                    m36524.mo27929();
                    break;
                }
                this.f21401.add(m36524.getName());
                if (m11552) {
                    abstractC154402.mo27929();
                }
                i++;
            } catch (Throwable th) {
                try {
                    c5390.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return m11545();
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        ArrayList arrayList = this.f21401;
        if (arrayList.isEmpty() || !m11542(c16560)) {
            return;
        }
        if (!mo1526()) {
            c16560.m39041();
        }
        c16560.m39000((Collection) arrayList);
        c16560.m39015();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
