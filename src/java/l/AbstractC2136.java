package l;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: G64W */
/* renamed from: l.֫᩺ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2136 extends AbstractC16620 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    public static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    public int mMode;
    public static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    public static final String PROPNAME_PARENT = "android:visibility:parent";
    public static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public Animator onAppear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c194442) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c194442) {
        return null;
    }

    public AbstractC2136() {
        this.mMode = 3;
    }

    public AbstractC2136(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45930);
        int m9018 = C2958.m9018(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (m9018 != 0) {
            setMode(m9018);
        }
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // l.AbstractC16620
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    private void captureValues(C19444 c19444) {
        int visibility = c19444.f62890.getVisibility();
        HashMap hashMap = c19444.f62889;
        hashMap.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        hashMap.put(PROPNAME_PARENT, c19444.f62890.getParent());
        int[] iArr = new int[2];
        c19444.f62890.getLocationOnScreen(iArr);
        hashMap.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // l.AbstractC16620
    public void captureStartValues(C19444 c19444) {
        captureValues(c19444);
    }

    @Override // l.AbstractC16620
    public void captureEndValues(C19444 c19444) {
        captureValues(c19444);
    }

    public boolean isVisible(C19444 c19444) {
        if (c19444 == null) {
            return false;
        }
        HashMap hashMap = c19444.f62889;
        return ((Integer) hashMap.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) hashMap.get(PROPNAME_PARENT)) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C7448 m7059(l.C19444 r9, l.C19444 r10) {
        /*
            r8 = this;
            l.۟ۨۧ r0 = new l.۟ۨۧ
            r0.<init>()
            r1 = 0
            r0.f22869 = r1
            r0.f22870 = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r9 == 0) goto L2f
            java.util.HashMap r6 = r9.f62889
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f22871 = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f22872 = r6
            goto L33
        L2f:
            r0.f22871 = r3
            r0.f22872 = r2
        L33:
            if (r10 == 0) goto L52
            java.util.HashMap r6 = r10.f62889
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f22868 = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f22867 = r2
            goto L56
        L52:
            r0.f22868 = r3
            r0.f22867 = r2
        L56:
            r2 = 1
            if (r9 == 0) goto L8a
            if (r10 == 0) goto L8a
            int r9 = r0.f22871
            int r10 = r0.f22868
            if (r9 != r10) goto L68
            android.view.ViewGroup r3 = r0.f22872
            android.view.ViewGroup r4 = r0.f22867
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r9 == r10) goto L78
            if (r9 != 0) goto L71
            r0.f22870 = r1
            r0.f22869 = r2
            return r0
        L71:
            if (r10 != 0) goto L9f
            r0.f22870 = r2
            r0.f22869 = r2
            return r0
        L78:
            android.view.ViewGroup r9 = r0.f22867
            if (r9 != 0) goto L81
            r0.f22870 = r1
            r0.f22869 = r2
            return r0
        L81:
            android.view.ViewGroup r9 = r0.f22872
            if (r9 != 0) goto L9f
            r0.f22870 = r2
            r0.f22869 = r2
            return r0
        L8a:
            if (r9 != 0) goto L95
            int r9 = r0.f22868
            if (r9 != 0) goto L95
            r0.f22870 = r2
            r0.f22869 = r2
            return r0
        L95:
            if (r10 != 0) goto L9f
            int r9 = r0.f22871
            if (r9 != 0) goto L9f
            r0.f22870 = r1
            r0.f22869 = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC2136.m7059(l.᩵ۨۧ, l.᩵ۨۧ):l.۟ۨۧ");
    }

    @Override // l.AbstractC16620
    public Animator createAnimator(ViewGroup viewGroup, C19444 c19444, C19444 c194442) {
        C7448 m7059 = m7059(c19444, c194442);
        if (!m7059.f22869) {
            return null;
        }
        if (m7059.f22872 == null && m7059.f22867 == null) {
            return null;
        }
        if (m7059.f22870) {
            return onAppear(viewGroup, c19444, m7059.f22871, c194442, m7059.f22868);
        }
        return onDisappear(viewGroup, c19444, m7059.f22871, c194442, m7059.f22868);
    }

    public Animator onAppear(ViewGroup viewGroup, C19444 c19444, int i, C19444 c194442, int i2) {
        if ((this.mMode & 1) != 1 || c194442 == null) {
            return null;
        }
        if (c19444 == null) {
            View view = (View) c194442.f62890.getParent();
            if (m7059(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f22869) {
                return null;
            }
        }
        return onAppear(viewGroup, c194442.f62890, c19444, c194442);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0085, code lost:
    
        if (r10.mCanRemoveViews != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r11, l.C19444 r12, int r13, l.C19444 r14, int r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC2136.onDisappear(android.view.ViewGroup, l.᩵ۨۧ, int, l.᩵ۨۧ, int):android.animation.Animator");
    }

    @Override // l.AbstractC16620
    public boolean isTransitionRequired(C19444 c19444, C19444 c194442) {
        if (c19444 == null && c194442 == null) {
            return false;
        }
        if (c19444 != null && c194442 != null && c194442.f62889.containsKey(PROPNAME_VISIBILITY) != c19444.f62889.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        C7448 m7059 = m7059(c19444, c194442);
        if (m7059.f22869) {
            return m7059.f22871 == 0 || m7059.f22868 == 0;
        }
        return false;
    }
}
