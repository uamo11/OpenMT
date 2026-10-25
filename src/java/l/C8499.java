package l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import bin.mt.plus.R;

/* compiled from: G1H1 */
/* renamed from: l.۠᩻֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8499 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5677 m22198(Context context, ComponentCallbacksC9205 componentCallbacksC9205, boolean z, boolean z2) {
        int exitAnim;
        int m22197;
        int nextTransition = componentCallbacksC9205.getNextTransition();
        if (z2) {
            if (z) {
                exitAnim = componentCallbacksC9205.getPopEnterAnim();
            } else {
                exitAnim = componentCallbacksC9205.getPopExitAnim();
            }
        } else if (z) {
            exitAnim = componentCallbacksC9205.getEnterAnim();
        } else {
            exitAnim = componentCallbacksC9205.getExitAnim();
        }
        componentCallbacksC9205.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC9205.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.MT_Protector_res_0x7f0a0690) != null) {
            componentCallbacksC9205.mContainer.setTag(R.id.MT_Protector_res_0x7f0a0690, null);
        }
        ViewGroup viewGroup2 = componentCallbacksC9205.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = componentCallbacksC9205.onCreateAnimation(nextTransition, z, exitAnim);
        if (onCreateAnimation != null) {
            return new C5677(onCreateAnimation);
        }
        Animator onCreateAnimator = componentCallbacksC9205.onCreateAnimator(nextTransition, z, exitAnim);
        if (onCreateAnimator != null) {
            return new C5677(onCreateAnimator);
        }
        if (exitAnim == 0 && nextTransition != 0) {
            if (nextTransition == 4097) {
                exitAnim = z ? R.animator.MT_Protector_res_0x7f02000a : R.animator.MT_Protector_res_0x7f02000b;
            } else if (nextTransition != 8194) {
                if (nextTransition != 8197) {
                    if (nextTransition == 4099) {
                        exitAnim = z ? R.animator.MT_Protector_res_0x7f020008 : R.animator.MT_Protector_res_0x7f020009;
                    } else if (nextTransition != 4100) {
                        exitAnim = -1;
                    } else if (z) {
                        m22197 = m22197(context, android.R.attr.activityOpenEnterAnimation);
                    } else {
                        m22197 = m22197(context, android.R.attr.activityOpenExitAnimation);
                    }
                } else if (z) {
                    m22197 = m22197(context, android.R.attr.activityCloseEnterAnimation);
                } else {
                    m22197 = m22197(context, android.R.attr.activityCloseExitAnimation);
                }
                exitAnim = m22197;
            } else {
                exitAnim = z ? R.animator.MT_Protector_res_0x7f020006 : R.animator.MT_Protector_res_0x7f020007;
            }
        }
        if (exitAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                    if (loadAnimation != null) {
                        return new C5677(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                if (loadAnimator != null) {
                    return new C5677(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (equals) {
                    throw e2;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                if (loadAnimation2 != null) {
                    return new C5677(loadAnimation2);
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22197(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
