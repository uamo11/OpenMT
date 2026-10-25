package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import l.C20118;
import l.C23575;
import l.C8791;

/* loaded from: classes.dex */
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper {
    public final float maxScaleXDistance;
    public final float maxScaleYDistance;

    public MaterialBottomContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistance = resources.getDimension(C23575.f76220);
        this.maxScaleYDistance = resources.getDimension(C23575.f76268);
    }

    public void startBackProgress(C20118 c20118) {
        super.onStartBackProgress(c20118);
    }

    public void updateBackProgress(C20118 c20118) {
        if (super.onUpdateBackProgress(c20118) == null) {
            return;
        }
        updateBackProgress(c20118.m46371());
    }

    public void updateBackProgress(float f) {
        float interpolateProgress = interpolateProgress(f);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.maxScaleXDistance / width;
        float f3 = this.maxScaleYDistance / height;
        float lerp = 1.0f - AnimationUtils.lerp(0.0f, f2, interpolateProgress);
        float lerp2 = 1.0f - AnimationUtils.lerp(0.0f, f3, interpolateProgress);
        this.view.setScaleX(lerp);
        this.view.setPivotY(height);
        this.view.setScaleY(lerp2);
        View view = this.view;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(lerp2 != 0.0f ? lerp / lerp2 : 1.0f);
            }
        }
    }

    public void finishBackProgressPersistent(C20118 c20118, Animator.AnimatorListener animatorListener) {
        Animator createResetScaleAnimator = createResetScaleAnimator();
        createResetScaleAnimator.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, c20118.m46371()));
        if (animatorListener != null) {
            createResetScaleAnimator.addListener(animatorListener);
        }
        createResetScaleAnimator.start();
    }

    public void finishBackProgressNotPersistent(C20118 c20118, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.view, (Property<View, Float>) View.TRANSLATION_Y, this.view.getScaleY() * this.view.getHeight());
        ofFloat.setInterpolator(new C8791());
        ofFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, c20118.m46371()));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialBottomContainerBackHelper.this.view.setTranslationY(0.0f);
                MaterialBottomContainerBackHelper.this.updateBackProgress(0.0f);
            }
        });
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        Animator createResetScaleAnimator = createResetScaleAnimator();
        createResetScaleAnimator.setDuration(this.cancelDuration);
        createResetScaleAnimator.start();
    }

    private Animator createResetScaleAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.view;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C8791());
        return animatorSet;
    }
}
