package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* compiled from: P5CY */
/* renamed from: l.᩷ۛۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20690 extends AbstractC2136 {
    @Override // l.AbstractC16620
    public final boolean isSeekingSupported() {
        return true;
    }

    public C20690(int i) {
        setMode(i);
    }

    public C20690(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45927);
        setMode(C2958.m9018(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        obtainStyledAttributes.recycle();
    }

    @Override // l.AbstractC2136, l.AbstractC16620
    public final void captureStartValues(C19444 c19444) {
        super.captureStartValues(c19444);
        Float f = (Float) c19444.f62890.getTag(R.id.MT_Protector_res_0x7f0a064a);
        if (f == null) {
            if (c19444.f62890.getVisibility() == 0) {
                f = Float.valueOf(C21560.m48713(c19444.f62890));
            } else {
                f = Float.valueOf(0.0f);
            }
        }
        c19444.f62889.put("android:fade:transitionAlpha", f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ObjectAnimator m47304(float f, float f2, View view) {
        if (f == f2) {
            return null;
        }
        C21560.m48715(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) C21560.f69273, f2);
        C6578 c6578 = new C6578(view);
        ofFloat.addListener(c6578);
        getRootTransition().addListener(c6578);
        return ofFloat;
    }

    @Override // l.AbstractC2136
    public final Animator onAppear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c194442) {
        C21560.m48720();
        return m47304(m47303(c19444, 0.0f), 1.0f, view);
    }

    @Override // l.AbstractC2136
    public final Animator onDisappear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c194442) {
        C21560.m48720();
        ObjectAnimator m47304 = m47304(m47303(c19444, 1.0f), 0.0f, view);
        if (m47304 == null) {
            C21560.m48715(view, m47303(c194442, 1.0f));
        }
        return m47304;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m47303(C19444 c19444, float f) {
        Float f2;
        return (c19444 == null || (f2 = (Float) c19444.f62889.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }
}
