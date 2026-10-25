package l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* compiled from: N518 */
/* renamed from: l.ᩴܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C18850 extends FrameLayout {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TypedValue f59445;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TypedValue f59446;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TypedValue f59447;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TypedValue f59448;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TypedValue f59449;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TypedValue f59450;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC4033 f59451;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Rect f59452;

    public C18850(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18850(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59452 = new Rect();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43550(InterfaceC4033 interfaceC4033) {
        this.f59451 = interfaceC4033;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43549(int i, int i2, int i3, int i4) {
        this.f59452.set(i, i2, i3, i4);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18850.onMeasure(int, int):void");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43554() {
        if (this.f59448 == null) {
            this.f59448 = new TypedValue();
        }
        return this.f59448;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43552() {
        if (this.f59447 == null) {
            this.f59447 = new TypedValue();
        }
        return this.f59447;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43553() {
        if (this.f59445 == null) {
            this.f59445 = new TypedValue();
        }
        return this.f59445;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43555() {
        if (this.f59449 == null) {
            this.f59449 = new TypedValue();
        }
        return this.f59449;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TypedValue m43548() {
        if (this.f59450 == null) {
            this.f59450 = new TypedValue();
        }
        return this.f59450;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43551() {
        if (this.f59446 == null) {
            this.f59446 = new TypedValue();
        }
        return this.f59446;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC4033 interfaceC4033 = this.f59451;
        if (interfaceC4033 != null) {
            interfaceC4033.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC4033 interfaceC4033 = this.f59451;
        if (interfaceC4033 != null) {
            interfaceC4033.onDetachedFromWindow();
        }
    }
}
