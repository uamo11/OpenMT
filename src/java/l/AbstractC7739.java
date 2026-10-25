package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* compiled from: 7ANL */
/* renamed from: l.۟᩸ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC7739 extends ComponentCallbacksC9205 implements InterfaceC1389 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC0525 f23948;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC21851 m20750();

    @Override // l.ComponentCallbacksC9205
    public final void onAttach(Context context) {
        C11233.m27805(context, d.R);
        super.onAttach(context);
        AbstractC5180 parentFragmentManager = getParentFragmentManager();
        C11233.m27803(parentFragmentManager, "parentFragmentManager");
        AbstractC16882 m14900 = parentFragmentManager.m14900();
        m14900.mo39674(this);
        m14900.mo39685();
    }

    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C11233.m27805(layoutInflater, "inflater");
        C14462 c14462 = new C14462(layoutInflater.getContext(), null);
        c14462.setId(R.id.MT_Protector_res_0x7f0a044d);
        C21905 c21905 = new C21905(layoutInflater.getContext());
        c21905.setId(R.id.MT_Protector_res_0x7f0a044c);
        C1763 c1763 = new C1763(getResources().getDimensionPixelSize(R.dimen.MT_Protector_res_0x7f070359));
        c1763.f6116 = getResources().getInteger(R.integer.MT_Protector_res_0x7f0b0046);
        c14462.addView(c21905, c1763);
        C21905 c219052 = new C21905(layoutInflater.getContext());
        c219052.setId(R.id.MT_Protector_res_0x7f0a044b);
        C1763 c17632 = new C1763(getResources().getDimensionPixelSize(R.dimen.MT_Protector_res_0x7f070358));
        c17632.f6116 = getResources().getInteger(R.integer.MT_Protector_res_0x7f0b0045);
        c14462.addView(c219052, c17632);
        if (getChildFragmentManager().m14862(R.id.MT_Protector_res_0x7f0a044c) == null) {
            AbstractC21851 m20750 = m20750();
            AbstractC5180 childFragmentManager = getChildFragmentManager();
            C11233.m27803(childFragmentManager, "childFragmentManager");
            AbstractC16882 m14900 = childFragmentManager.m14900();
            m14900.m39691();
            m14900.m39684(m20750);
            m14900.mo39685();
        }
        c14462.m34550();
        return c14462;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۨ᩸ۧ] */
    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C11815 onBackPressedDispatcher;
        C11233.m27805(view, "view");
        super.onViewCreated(view, bundle);
        this.f23948 = new C23261(this);
        C14462 c14462 = (C14462) requireView();
        int i = C17648.f53953;
        if (!c14462.isLaidOut() || c14462.isLayoutRequested()) {
            c14462.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC14088(this));
        } else {
            AbstractC0525 abstractC0525 = this.f23948;
            C11233.m27799(abstractC0525);
            abstractC0525.m2240(((C14462) requireView()).m34547() && ((C14462) requireView()).m34549());
        }
        getChildFragmentManager().m14875((C11973) new InterfaceC18586() { // from class: l.ۨ᩸ۧ
            @Override // l.InterfaceC18586
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo29246() {
                AbstractC7739.m20748(AbstractC7739.this);
            }
        });
        InterfaceC23103 m42422 = C18207.m42422(view);
        if (m42422 == null || (onBackPressedDispatcher = m42422.getOnBackPressedDispatcher()) == null) {
            return;
        }
        InterfaceC23586 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC0525 abstractC05252 = this.f23948;
        C11233.m27799(abstractC05252);
        onBackPressedDispatcher.m28894(viewLifecycleOwner, abstractC05252);
    }

    @Override // l.InterfaceC1389
    /* renamed from: ֫ */
    public final boolean mo4875(AbstractC21851 abstractC21851, C2095 c2095) {
        AbstractC16882 m14900;
        ComponentCallbacksC9205 mo41848;
        if (abstractC21851.getId() != R.id.MT_Protector_res_0x7f0a044c) {
            if (abstractC21851.getId() != R.id.MT_Protector_res_0x7f0a044b) {
                return false;
            }
            C20494 m14889 = getChildFragmentManager().m14889();
            requireContext().getClassLoader();
            String m6929 = c2095.m6929();
            C11233.m27799((Object) m6929);
            ComponentCallbacksC9205 mo418482 = m14889.mo41848(m6929);
            C11233.m27803(mo418482, "childFragmentManager.fra….fragment!!\n            )");
            mo418482.setArguments(c2095.m6913());
            AbstractC5180 childFragmentManager = getChildFragmentManager();
            C11233.m27803(childFragmentManager, "childFragmentManager");
            m14900 = childFragmentManager.m14900();
            m14900.m39691();
            m14900.m39679(R.id.MT_Protector_res_0x7f0a044b, mo418482, null);
            m14900.m39688();
            m14900.m39677();
        } else {
            if (c2095.m6929() == null) {
                Intent m6937 = c2095.m6937();
                if (m6937 == null) {
                    return true;
                }
                startActivity(m6937);
                return true;
            }
            String m69292 = c2095.m6929();
            if (m69292 == null) {
                mo41848 = null;
            } else {
                C20494 m148892 = getChildFragmentManager().m14889();
                requireContext().getClassLoader();
                mo41848 = m148892.mo41848(m69292);
            }
            if (mo41848 != null) {
                mo41848.setArguments(c2095.m6913());
            }
            if (getChildFragmentManager().m14925() > 0) {
                InterfaceC8708 m14924 = getChildFragmentManager().m14924();
                C11233.m27803(m14924, "childFragmentManager.getBackStackEntryAt(0)");
                getChildFragmentManager().m14901(m14924.getId());
            }
            AbstractC5180 childFragmentManager2 = getChildFragmentManager();
            C11233.m27803(childFragmentManager2, "childFragmentManager");
            m14900 = childFragmentManager2.m14900();
            m14900.m39691();
            C11233.m27799(mo41848);
            m14900.m39679(R.id.MT_Protector_res_0x7f0a044b, mo41848, null);
            if (((C14462) requireView()).m34549()) {
                m14900.m39688();
            }
            ((C14462) requireView()).m34544();
        }
        m14900.mo39685();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20748(AbstractC7739 abstractC7739) {
        AbstractC0525 abstractC0525 = abstractC7739.f23948;
        C11233.m27799(abstractC0525);
        abstractC0525.m2240(abstractC7739.getChildFragmentManager().m14925() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    @Override // l.ComponentCallbacksC9205
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewStateRestored(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onViewStateRestored(r6)
            if (r6 != 0) goto L8e
            l.ۚۜ֫ r6 = r5.getChildFragmentManager()
            r0 = 2131362892(0x7f0a044c, float:1.8345577E38)
            l.ۡ᩻֫ r6 = r6.m14862(r0)
            if (r6 == 0) goto L86
            l.᩸᩸ۧ r6 = (l.AbstractC21851) r6
            l.ۜ᩹ۧ r0 = r6.m49240()
            int r0 = r0.m10699()
            r1 = 0
            if (r0 > 0) goto L20
            goto L68
        L20:
            l.ۜ᩹ۧ r0 = r6.m49240()
            int r0 = r0.m10699()
            r2 = 0
        L29:
            if (r2 >= r0) goto L68
            int r3 = r2 + 1
            l.ۜ᩹ۧ r4 = r6.m49240()
            l.֫᩸ۧ r2 = r4.m10701(r2)
            java.lang.String r4 = "headerFragment.preferenc…reen.getPreference(index)"
            l.C11233.m27803(r2, r4)
            java.lang.String r4 = r2.m6929()
            if (r4 != 0) goto L42
            r2 = r3
            goto L29
        L42:
            java.lang.String r6 = r2.m6929()
            if (r6 != 0) goto L4a
            r6 = r1
            goto L5d
        L4a:
            l.ۚۜ֫ r0 = r5.getChildFragmentManager()
            l.᩶᩻֫ r0 = r0.m14889()
            android.content.Context r3 = r5.requireContext()
            r3.getClassLoader()
            l.ۡ᩻֫ r6 = r0.mo41848(r6)
        L5d:
            if (r6 != 0) goto L60
            goto L69
        L60:
            android.os.Bundle r0 = r2.m6913()
            r6.setArguments(r0)
            goto L69
        L68:
            r6 = r1
        L69:
            if (r6 != 0) goto L6c
            return
        L6c:
            l.ۚۜ֫ r0 = r5.getChildFragmentManager()
            java.lang.String r2 = "childFragmentManager"
            l.C11233.m27803(r0, r2)
            l.ܽ᩷֫ r0 = r0.m14900()
            r0.m39691()
            r2 = 2131362891(0x7f0a044b, float:1.8345575E38)
            r0.m39679(r2, r6, r1)
            r0.mo39685()
            return
        L86:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat"
            r6.<init>(r0)
            throw r6
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC7739.onViewStateRestored(android.os.Bundle):void");
    }
}
