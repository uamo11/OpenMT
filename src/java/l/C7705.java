package l;

import android.os.Bundle;
import java.util.HashSet;

/* compiled from: S54T */
/* renamed from: l.۟᩶᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C7705 extends AbstractC21851 {
    @Override // l.AbstractC21851
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo20622() {
        Bundle requireArguments = requireArguments();
        if (requireArguments.containsKey("preferencesName")) {
            m49239().m41269(requireArguments.getString("preferencesName"));
        }
        m49236(requireArguments.getInt("layoutID"));
        m20620((AbstractC3506) m49240());
        ActivityC0737 activity = getActivity();
        if (activity instanceof AbstractActivityC1606) {
            ((AbstractActivityC1606) activity).mo5465(this, m49240());
        }
        if (requireArguments.containsKey("scrollTo")) {
            String string = requireArguments.getString("scrollTo");
            C11003.requireNonNull(string);
            m49238(string);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20620(AbstractC3506 abstractC3506) {
        HashSet hashSet;
        int m10699 = abstractC3506.m10699();
        for (int i = 0; i < m10699; i++) {
            C2095 m10701 = abstractC3506.m10701(i);
            if (m10701 instanceof C19546) {
                C19546 c19546 = (C19546) m10701;
                hashSet = AbstractActivityC1606.f5660;
                if (!hashSet.contains(m10701.m6911())) {
                    c19546.mo6894(c19546.m44959());
                }
                c19546.m6899(this);
            } else if (m10701 instanceof C1410) {
                m10701.m6899(this);
            } else if (m10701 instanceof C6845) {
                m10701.m6899(this);
            } else if (m10701 instanceof C18080) {
                m10701.m6899(this);
            } else if (m10701 instanceof AbstractC3506) {
                m20620((AbstractC3506) m10701);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20621(C2095 c2095, Object obj) {
        HashSet hashSet;
        ActivityC0737 activity = getActivity();
        if (!((activity instanceof AbstractActivityC1606) && ((AbstractActivityC1606) activity).mo5466(this, c2095, obj)) && (c2095 instanceof C19546)) {
            C19546 c19546 = (C19546) c2095;
            hashSet = AbstractActivityC1606.f5660;
            if (hashSet.contains(c2095.m6911())) {
                return;
            }
            c2095.mo6894(c19546.m44958()[c19546.m44956((String) obj)]);
        }
    }
}
