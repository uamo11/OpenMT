package l;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: W1PL */
/* renamed from: l.᩶ܰۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20209 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ViewGroup.MarginLayoutParams f65382;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6495 f65383;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f65382 = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C20209(C6495 c6495) {
        this.f65383 = c6495;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        r1 = r0.getChildCount();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (r4 >= r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (m46441(r0.getChildAt(r4)) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0096, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009d, code lost:
    
        if (r0.getChildCount() <= 1) goto L41;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m46442() {
        /*
            r12 = this;
            l.ۜۗۧ r0 = r12.f65383
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lc
            goto L99
        Lc:
            int r4 = r0.getOrientation()
            if (r4 != 0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            r5 = 2
            int[] r6 = new int[r5]
            r6[r3] = r5
            r6[r2] = r1
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r6)
            int[][] r5 = (int[][]) r5
            r6 = 0
        L25:
            if (r6 >= r1) goto L6d
            android.view.View r7 = r0.getChildAt(r6)
            if (r7 == 0) goto L65
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L38
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L3a
        L38:
            android.view.ViewGroup$MarginLayoutParams r8 = l.C20209.f65382
        L3a:
            r9 = r5[r6]
            if (r4 == 0) goto L45
            int r10 = r7.getLeft()
            int r11 = r8.leftMargin
            goto L4b
        L45:
            int r10 = r7.getTop()
            int r11 = r8.topMargin
        L4b:
            int r10 = r10 - r11
            r9[r2] = r10
            r9 = r5[r6]
            if (r4 == 0) goto L59
            int r7 = r7.getRight()
            int r8 = r8.rightMargin
            goto L5f
        L59:
            int r7 = r7.getBottom()
            int r8 = r8.bottomMargin
        L5f:
            int r7 = r7 + r8
            r9[r3] = r7
            int r6 = r6 + 1
            goto L25
        L65:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L6d:
            l.᩹ܰۧ r4 = new l.᩹ܰۧ
            r4.<init>()
            java.util.Arrays.sort(r5, r4)
            r4 = 1
        L76:
            if (r4 >= r1) goto L88
            int r6 = r4 + (-1)
            r6 = r5[r6]
            r6 = r6[r3]
            r7 = r5[r4]
            r7 = r7[r2]
            if (r6 == r7) goto L85
            goto L9f
        L85:
            int r4 = r4 + 1
            goto L76
        L88:
            r4 = r5[r2]
            r6 = r4[r3]
            r4 = r4[r2]
            int r6 = r6 - r4
            if (r4 > 0) goto L9f
            int r1 = r1 - r3
            r1 = r5[r1]
            r1 = r1[r3]
            if (r1 >= r6) goto L99
            goto L9f
        L99:
            int r1 = r0.getChildCount()
            if (r1 > r3) goto Lb4
        L9f:
            int r1 = r0.getChildCount()
            r4 = 0
        La4:
            if (r4 >= r1) goto Lb4
            android.view.View r5 = r0.getChildAt(r4)
            boolean r5 = m46441(r5)
            if (r5 == 0) goto Lb1
            return r3
        Lb1:
            int r4 = r4 + 1
            goto La4
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20209.m46442():boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46441(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m46441(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
