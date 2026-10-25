package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: S97M */
/* renamed from: l.֡᩸᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0692 extends AbstractC6138 {

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public String f2630;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f2631 = true;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f2629 = new ArrayList();

    @Override // l.AbstractC3817
    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C11813 mo2779() {
        return C23777.f76968;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence mo2778() {
        return C4925.m14327(R.string.MT_Protector_res_0x7f120a2e);
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f1207e6);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17222 mo2780() {
        HashSet hashSet = new HashSet();
        try {
            ArrayList arrayList = (ArrayList) m11529("infos");
            C19277 c19277 = new C19277(arrayList.size());
            c19277.m44459(new C3362(2, this));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C21234 c21234 = (C21234) it.next();
                c19277.m44460(1);
                mo11520(c21234.m48194());
                hashSet.add(c21234.m48198());
                AbstractC15440 m48195 = c21234.m48195();
                hashSet.remove(c21234.m48198());
                if (this.f2631) {
                    String str = this.f2630;
                    ArrayList arrayList2 = this.f2629;
                    if (str == null) {
                        this.f2630 = m48195.getParent();
                        arrayList2.add(m48195.getName());
                    } else if (str.equals(m48195.getParent())) {
                        arrayList2.add(m48195.getName());
                    } else {
                        this.f2631 = false;
                    }
                }
                if (mo1526()) {
                    return C17222.m40521();
                }
            }
            return m11545();
        } finally {
            C21939.m49414(hashSet);
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
            if (this.f2631) {
                boolean m39035 = c165602.m39035("local");
                ArrayList arrayList = this.f2629;
                if (m39035 && m11525(c165602)) {
                    c165602.m39000((Collection) arrayList);
                    c165602.m39033(this.f2630, true);
                } else {
                    c16560.m39000((Collection) arrayList);
                    c16560.m39033(this.f2630, true);
                }
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
