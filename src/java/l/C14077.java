package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: S6AR */
/* renamed from: l.ܰ᩸, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14077 extends ViewGroup.MarginLayoutParams {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f42507;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f42508;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f42509;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f42510;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Rect f42511;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public View f42512;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Object f42513;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f42514;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f42515;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View f42516;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f42517;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f42518;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42519;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f42520;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f42521;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f42522;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC6317 f42523;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f42524;

    public C14077() {
        super(-2, -2);
        this.f42514 = false;
        this.f42518 = 0;
        this.f42508 = 0;
        this.f42519 = -1;
        this.f42524 = -1;
        this.f42520 = 0;
        this.f42515 = 0;
        this.f42511 = new Rect();
    }

    public C14077(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42514 = false;
        this.f42518 = 0;
        this.f42508 = 0;
        this.f42519 = -1;
        this.f42524 = -1;
        this.f42520 = 0;
        this.f42515 = 0;
        this.f42511 = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13372.f39997);
        this.f42518 = obtainStyledAttributes.getInteger(0, 0);
        this.f42524 = obtainStyledAttributes.getResourceId(1, -1);
        this.f42508 = obtainStyledAttributes.getInteger(2, 0);
        this.f42519 = obtainStyledAttributes.getInteger(6, -1);
        this.f42520 = obtainStyledAttributes.getInt(5, 0);
        this.f42515 = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f42514 = hasValue;
        if (hasValue) {
            this.f42523 = C18333.m42713(context, attributeSet, obtainStyledAttributes.getString(3));
        }
        obtainStyledAttributes.recycle();
        AbstractC6317 abstractC6317 = this.f42523;
        if (abstractC6317 != null) {
            abstractC6317.onAttachedToLayoutParams(this);
        }
    }

    public C14077(C14077 c14077) {
        super((ViewGroup.MarginLayoutParams) c14077);
        this.f42514 = false;
        this.f42518 = 0;
        this.f42508 = 0;
        this.f42519 = -1;
        this.f42524 = -1;
        this.f42520 = 0;
        this.f42515 = 0;
        this.f42511 = new Rect();
    }

    public C14077(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f42514 = false;
        this.f42518 = 0;
        this.f42508 = 0;
        this.f42519 = -1;
        this.f42524 = -1;
        this.f42520 = 0;
        this.f42515 = 0;
        this.f42511 = new Rect();
    }

    public C14077(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f42514 = false;
        this.f42518 = 0;
        this.f42508 = 0;
        this.f42519 = -1;
        this.f42524 = -1;
        this.f42520 = 0;
        this.f42515 = 0;
        this.f42511 = new Rect();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m33685() {
        return this.f42524;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC6317 m33687() {
        return this.f42523;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33680(AbstractC6317 abstractC6317) {
        AbstractC6317 abstractC63172 = this.f42523;
        if (abstractC63172 != abstractC6317) {
            if (abstractC63172 != null) {
                abstractC63172.onDetachedFromLayoutParams();
            }
            this.f42523 = abstractC6317;
            this.f42513 = null;
            this.f42514 = true;
            if (abstractC6317 != null) {
                abstractC6317.onAttachedToLayoutParams(this);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33682() {
        if (this.f42523 == null) {
            this.f42510 = false;
        }
        return this.f42510;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33684(C18333 c18333, View view) {
        boolean z = this.f42510;
        if (z) {
            return true;
        }
        AbstractC6317 abstractC6317 = this.f42523;
        boolean blocksInteractionBelow = (abstractC6317 != null ? abstractC6317.blocksInteractionBelow(c18333, view) : false) | z;
        this.f42510 = blocksInteractionBelow;
        return blocksInteractionBelow;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m33686() {
        this.f42510 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33679(int i, boolean z) {
        if (i == 0) {
            this.f42509 = z;
        } else {
            if (i != 1) {
                return;
            }
            this.f42517 = z;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33683(int i) {
        if (i == 0) {
            return this.f42509;
        }
        if (i != 1) {
            return false;
        }
        return this.f42517;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m33689() {
        return this.f42521;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33681(boolean z) {
        this.f42521 = z;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33688() {
        this.f42521 = false;
    }
}
