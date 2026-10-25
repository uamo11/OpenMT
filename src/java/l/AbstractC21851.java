package l;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* compiled from: I5JQ */
/* renamed from: l.᩸᩸ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC21851 extends ComponentCallbacksC9205 implements InterfaceC18344, InterfaceC11289, InterfaceC16932, InterfaceC1906 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f70008;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Runnable f70009;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17638 f70011;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13132 f70012;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f70013;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0683 f70014 = new C0683(this);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f70007 = R.layout.MT_Protector_res_0x7f0d01bd;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Handler f70015 = new HandlerC4212(this, Looper.getMainLooper());

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f70010 = new RunnableC19029(this);

    /* renamed from: ܿ */
    public abstract void mo20622();

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.MT_Protector_res_0x7f0403cb, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.MT_Protector_res_0x7f1301b4;
        }
        requireContext().getTheme().applyStyle(i, false);
        C17638 c17638 = new C17638(requireContext());
        this.f70011 = c17638;
        c17638.m41272((InterfaceC16932) this);
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        mo20622();
    }

    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13132 c13132;
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, C9878.f29911, R.attr.MT_Protector_res_0x7f0403c5, 0);
        this.f70007 = obtainStyledAttributes.getResourceId(0, this.f70007);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.f70007, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (c13132 = (C13132) viewGroup2.findViewById(R.id.MT_Protector_res_0x7f0a0488)) == null) {
            c13132 = (C13132) cloneInContext.inflate(R.layout.MT_Protector_res_0x7f0d01bf, viewGroup2, false);
            c13132.setLayoutManager(new C6495(requireContext()));
            c13132.setAccessibilityDelegateCompat(new C23988(c13132));
        }
        this.f70012 = c13132;
        C0683 c0683 = this.f70014;
        c13132.addItemDecoration(c0683);
        c0683.m2770(drawable);
        if (dimensionPixelSize != -1) {
            c0683.m2769(dimensionPixelSize);
        }
        c0683.m2771(z);
        if (this.f70012.getParent() == null) {
            viewGroup2.addView(this.f70012);
        }
        this.f70015.post(this.f70010);
        return inflate;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        C7055 m41278;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (m41278 = this.f70011.m41278()) != null) {
            m41278.mo6891(bundle2);
        }
        if (this.f70013) {
            m49237();
            Runnable runnable = this.f70009;
            if (runnable != null) {
                ((RunnableC19735) runnable).run();
                this.f70009 = null;
            }
        }
        this.f70008 = true;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onStart() {
        super.onStart();
        this.f70011.m41273((InterfaceC18344) this);
        this.f70011.m41271((InterfaceC11289) this);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onStop() {
        super.onStop();
        this.f70011.m41273((InterfaceC18344) null);
        this.f70011.m41271((InterfaceC11289) null);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        Runnable runnable = this.f70010;
        Handler handler = this.f70015;
        handler.removeCallbacks(runnable);
        handler.removeMessages(1);
        if (this.f70013) {
            this.f70012.setAdapter(null);
            C7055 m41278 = this.f70011.m41278();
            if (m41278 != null) {
                m41278.mo6920();
            }
        }
        this.f70012 = null;
        super.onDestroyView();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C7055 m41278 = this.f70011.m41278();
        if (m41278 != null) {
            Bundle bundle2 = new Bundle();
            m41278.mo6915(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17638 m49239() {
        return this.f70011;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49237() {
        C7055 m41278 = this.f70011.m41278();
        if (m41278 != null) {
            this.f70012.setAdapter(new C6328(m41278));
            m41278.mo6912();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7055 m49240() {
        return this.f70011.m41278();
    }

    @Override // l.InterfaceC18344
    /* renamed from: ֫ */
    public final boolean mo8649(C2095 c2095) {
        if (c2095.m6929() == null) {
            return false;
        }
        boolean z = false;
        for (ComponentCallbacksC9205 componentCallbacksC9205 = this; !z && componentCallbacksC9205 != null; componentCallbacksC9205 = componentCallbacksC9205.getParentFragment()) {
            if (componentCallbacksC9205 instanceof InterfaceC1389) {
                z = ((InterfaceC1389) componentCallbacksC9205).mo4875(this, c2095);
            }
        }
        if (!z && (getContext() instanceof InterfaceC1389)) {
            z = ((InterfaceC1389) getContext()).mo4875(this, c2095);
        }
        if (!z && (getActivity() instanceof InterfaceC1389)) {
            z = ((InterfaceC1389) getActivity()).mo4875(this, c2095);
        }
        if (z) {
            return true;
        }
        AbstractC5180 parentFragmentManager = getParentFragmentManager();
        Bundle m6913 = c2095.m6913();
        C20494 m14889 = parentFragmentManager.m14889();
        requireActivity().getClassLoader();
        ComponentCallbacksC9205 mo41848 = m14889.mo41848(c2095.m6929());
        mo41848.setArguments(m6913);
        mo41848.setTargetFragment(this, 0);
        AbstractC16882 m14900 = parentFragmentManager.m14900();
        m14900.m39679(((View) requireView().getParent()).getId(), mo41848, null);
        m14900.m39677();
        m14900.mo39685();
        return true;
    }

    @Override // l.InterfaceC16932
    /* renamed from: ֫ */
    public final void mo8647(C7055 c7055) {
        boolean z = false;
        for (ComponentCallbacksC9205 componentCallbacksC9205 = this; !z && componentCallbacksC9205 != null; componentCallbacksC9205 = componentCallbacksC9205.getParentFragment()) {
            if (componentCallbacksC9205 instanceof InterfaceC8445) {
                z = ((InterfaceC8445) componentCallbacksC9205).m22125();
            }
        }
        if (!z && (getContext() instanceof InterfaceC8445)) {
            z = ((InterfaceC8445) getContext()).m22125();
        }
        if (z || !(getActivity() instanceof InterfaceC8445)) {
            return;
        }
        ((InterfaceC8445) getActivity()).m22125();
    }

    @Override // l.InterfaceC1906
    public final C2095 findPreference(String str) {
        C17638 c17638 = this.f70011;
        if (c17638 == null) {
            return null;
        }
        return c17638.m41267((CharSequence) str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49236(int i) {
        C17638 c17638 = this.f70011;
        if (c17638 != null) {
            if (this.f70011.m41274(c17638.m41268(requireContext(), i, this.f70011.m41278()))) {
                this.f70013 = true;
                if (this.f70008) {
                    Handler handler = this.f70015;
                    if (handler.hasMessages(1)) {
                        return;
                    }
                    handler.obtainMessage(1).sendToTarget();
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    @Override // l.InterfaceC11289
    /* renamed from: ֫ */
    public final void mo8648(AbstractC11079 abstractC11079) {
        DialogInterfaceOnCancelListenerC10344 c13194;
        boolean z = false;
        for (ComponentCallbacksC9205 componentCallbacksC9205 = this; !z && componentCallbacksC9205 != null; componentCallbacksC9205 = componentCallbacksC9205.getParentFragment()) {
            if (componentCallbacksC9205 instanceof InterfaceC5623) {
                z = ((InterfaceC5623) componentCallbacksC9205).m15929();
            }
        }
        if (!z && (getContext() instanceof InterfaceC5623)) {
            z = ((InterfaceC5623) getContext()).m15929();
        }
        if (!z && (getActivity() instanceof InterfaceC5623)) {
            z = ((InterfaceC5623) getActivity()).m15929();
        }
        if (!z && getParentFragmentManager().m14899("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (abstractC11079 instanceof C6845) {
                String m6911 = abstractC11079.m6911();
                c13194 = new C8962();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", m6911);
                c13194.setArguments(bundle);
            } else if (abstractC11079 instanceof C19546) {
                String m69112 = abstractC11079.m6911();
                c13194 = new C8256();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", m69112);
                c13194.setArguments(bundle2);
            } else if (abstractC11079 instanceof C22367) {
                String m69113 = abstractC11079.m6911();
                c13194 = new C13194();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", m69113);
                c13194.setArguments(bundle3);
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + abstractC11079.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            c13194.setTargetFragment(this, 0);
            c13194.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49238(String str) {
        RunnableC19735 runnableC19735 = new RunnableC19735(this, str);
        if (this.f70012 == null) {
            this.f70009 = runnableC19735;
        } else {
            runnableC19735.run();
        }
    }
}
