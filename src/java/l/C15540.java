package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: G5V7 */
/* renamed from: l.ܶ᩺ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15540 extends Drawable.ConstantState {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f47888;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f47889;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f47890;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ColorStateList f47891;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f47892;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ColorStateList f47893;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8486 f47894;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f47895;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f47896;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Bitmap f47897;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Paint f47898;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f47899;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C22597(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C22597(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f47889;
    }
}
