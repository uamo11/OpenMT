package l;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: U1D7 */
/* renamed from: l.ۘۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3725 extends AbstractC4990 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Method f11771;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Method f11774;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f11778;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Method f11781;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f11772 = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11779 = -1;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f11776 = null;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f11777 = null;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f11773 = -1;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f11764 = -1;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public View f11769 = null;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f11780 = 0.1f;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f11768 = true;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f11770 = true;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f11765 = true;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f11766 = Float.NaN;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f11763 = false;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public RectF f11775 = new RectF();

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public RectF f11767 = new RectF();

    @Override // l.AbstractC4990
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11329(HashMap hashMap) {
        throw null;
    }

    @Override // l.AbstractC4990
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11330(HashSet hashSet) {
    }

    public C3725() {
        this.f15711 = new HashMap();
    }

    @Override // l.AbstractC4990
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11328(Context context, AttributeSet attributeSet) {
        C2314.m7572(this, context.obtainStyledAttributes(attributeSet, C21840.f69978));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11315(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b1  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11327(float r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3725.m11327(float, android.view.View):void");
    }
}
