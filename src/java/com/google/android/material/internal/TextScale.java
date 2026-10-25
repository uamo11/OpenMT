package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import l.AbstractC16620;
import l.C19444;

/* loaded from: classes.dex */
public class TextScale extends AbstractC16620 {
    public static final String PROPNAME_SCALE = "android:textscale:scale";

    @Override // l.AbstractC16620
    public void captureStartValues(C19444 c19444) {
        captureValues(c19444);
    }

    @Override // l.AbstractC16620
    public void captureEndValues(C19444 c19444) {
        captureValues(c19444);
    }

    private void captureValues(C19444 c19444) {
        View view = c19444.f62890;
        if (view instanceof TextView) {
            c19444.f62889.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // l.AbstractC16620
    public Animator createAnimator(ViewGroup viewGroup, C19444 c19444, C19444 c194442) {
        if (c19444 == null || c194442 == null || !(c19444.f62890 instanceof TextView)) {
            return null;
        }
        View view = c194442.f62890;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        HashMap hashMap = c19444.f62889;
        HashMap hashMap2 = c194442.f62889;
        float floatValue = hashMap.get(PROPNAME_SCALE) != null ? ((Float) hashMap.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get(PROPNAME_SCALE) != null ? ((Float) hashMap2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
            }
        });
        return ofFloat;
    }
}
