package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.HashMap;

/* compiled from: A65W */
/* renamed from: l.᩻ۛۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23511 extends AbstractC16620 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75467;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String[] f75462 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Property f75464 = new C22929(PointF.class, "topLeft");

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Property f75465 = new C13756(PointF.class, "bottomRight");

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Property f75466 = new C7407(PointF.class, "bottomRight");

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Property f75460 = new C1639(PointF.class, "topLeft");

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Property f75461 = new C10812(PointF.class, "position");

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C0933 f75463 = new C0933();

    @Override // l.AbstractC16620
    public final boolean isSeekingSupported() {
        return true;
    }

    public C23511() {
        this.f75467 = false;
    }

    public C23511(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75467 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45925);
        boolean z = C2958.m9022((XmlResourceParser) attributeSet, "resizeClip") ? obtainStyledAttributes.getBoolean(0, false) : false;
        obtainStyledAttributes.recycle();
        this.f75467 = z;
    }

    @Override // l.AbstractC16620
    public final String[] getTransitionProperties() {
        return f75462;
    }

    private void captureValues(C19444 c19444) {
        View view = c19444.f62890;
        HashMap hashMap = c19444.f62889;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", c19444.f62890.getParent());
        if (this.f75467) {
            hashMap.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // l.AbstractC16620
    public final void captureStartValues(C19444 c19444) {
        Rect rect;
        captureValues(c19444);
        if (!this.f75467 || (rect = (Rect) c19444.f62890.getTag(R.id.MT_Protector_res_0x7f0a0646)) == null) {
            return;
        }
        c19444.f62889.put("android:changeBounds:clip", rect);
    }

    @Override // l.AbstractC16620
    public final void captureEndValues(C19444 c19444) {
        captureValues(c19444);
    }

    @Override // l.AbstractC16620
    public final Animator createAnimator(ViewGroup viewGroup, C19444 c19444, C19444 c194442) {
        int i;
        int i2;
        int i3;
        int i4;
        Animator m44463;
        int i5;
        View view;
        Animator animator;
        Path path;
        Property property;
        if (c19444 != null) {
            HashMap hashMap = c19444.f62889;
            if (c194442 != null) {
                HashMap hashMap2 = c194442.f62889;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view2 = c194442.f62890;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i6 = rect.left;
                    int i7 = rect2.left;
                    int i8 = rect.top;
                    int i9 = rect2.top;
                    int i10 = rect.right;
                    int i11 = rect2.right;
                    int i12 = rect.bottom;
                    int i13 = rect2.bottom;
                    int i14 = i10 - i6;
                    int i15 = i12 - i8;
                    int i16 = i11 - i7;
                    int i17 = i13 - i9;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
                        i = 0;
                    } else {
                        i = (i6 == i7 && i8 == i9) ? 0 : 1;
                        if (i10 != i11 || i12 != i13) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i18 = i;
                    if (i18 > 0) {
                        boolean z = this.f75467;
                        Property property2 = f75461;
                        if (z) {
                            C21560.m48717(view2, i6, i8, Math.max(i14, i16) + i6, i8 + Math.max(i15, i17));
                            if (i6 == i7 && i8 == i9) {
                                i3 = i13;
                                i2 = i10;
                                i4 = i7;
                                m44463 = null;
                            } else {
                                i2 = i10;
                                i3 = i13;
                                i4 = i7;
                                m44463 = C19279.m44463(view2, property2, getPathMotion().getPath(i6, i8, i7, i9));
                            }
                            boolean z2 = rect3 == null;
                            if (z2) {
                                i5 = 0;
                                rect3 = new Rect(0, 0, i14, i15);
                            } else {
                                i5 = 0;
                            }
                            boolean z3 = rect4 == null;
                            Rect rect5 = z3 ? new Rect(i5, i5, i16, i17) : rect4;
                            if (rect3.equals(rect5)) {
                                view = view2;
                                animator = null;
                            } else {
                                view2.setClipBounds(rect3);
                                Object[] objArr = new Object[2];
                                objArr[i5] = rect3;
                                objArr[1] = rect5;
                                Animator ofObject = ObjectAnimator.ofObject(view2, "clipBounds", f75463, objArr);
                                int i19 = i4;
                                view = view2;
                                C17867 c17867 = new C17867(view2, rect3, z2, rect5, z3, i6, i8, i2, i12, i19, i9, i11, i3);
                                ofObject.addListener(c17867);
                                addListener(c17867);
                                animator = ofObject;
                            }
                            int i20 = C18738.f59215;
                            if (m44463 == null) {
                                m44463 = animator;
                            } else if (animator != null) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(m44463, animator);
                                m44463 = animatorSet;
                            }
                        } else {
                            C21560.m48717(view2, i6, i8, i10, i12);
                            if (i18 != 2) {
                                if (i6 == i7 && i8 == i9) {
                                    path = getPathMotion().getPath(i10, i12, i11, i13);
                                    property = f75466;
                                } else {
                                    path = getPathMotion().getPath(i6, i8, i7, i9);
                                    property = f75460;
                                }
                                m44463 = C19279.m44463(view2, property, path);
                            } else if (i14 == i16 && i15 == i17) {
                                m44463 = C19279.m44463(view2, property2, getPathMotion().getPath(i6, i8, i7, i9));
                            } else {
                                C14338 c14338 = new C14338(view2);
                                Animator m444632 = C19279.m44463(c14338, f75464, getPathMotion().getPath(i6, i8, i7, i9));
                                Animator m444633 = C19279.m44463(c14338, f75465, getPathMotion().getPath(i10, i12, i11, i13));
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(m444632, m444633);
                                animatorSet2.addListener(new C16455(c14338));
                                view = view2;
                                m44463 = animatorSet2;
                            }
                            view = view2;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            C1098.m3770(viewGroup4, true);
                            getRootTransition().addListener(new C17161(viewGroup4));
                        }
                        return m44463;
                    }
                }
            }
        }
        return null;
    }
}
