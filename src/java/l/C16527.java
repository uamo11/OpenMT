package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: J4YO */
/* renamed from: l.ܽۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16527 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5800 f50799;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50800 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5800 f50801;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ImageView f50802;

    public C16527(ImageView imageView) {
        this.f50802 = imageView;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38899(AttributeSet attributeSet, int i) {
        int m50806;
        ImageView imageView = this.f50802;
        Context context = imageView.getContext();
        int[] iArr = C3390.f10723;
        C22733 m50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(imageView, imageView.getContext(), iArr, attributeSet, m50796.m50810(), i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (m50806 = m50796.m50806(1, -1)) != -1 && (drawable = C21311.m48345(imageView.getContext(), m50806)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C15320.m36347(drawable);
            }
            if (m50796.m50802(2)) {
                C20558.m47124(imageView, m50796.m50804(2));
            }
            if (m50796.m50802(3)) {
                C20558.m47125(imageView, C15320.m36346(m50796.m50809(3, -1), null));
            }
        } finally {
            m50796.m50813();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38895(int i) {
        ImageView imageView = this.f50802;
        if (i != 0) {
            Drawable m48345 = C21311.m48345(imageView.getContext(), i);
            if (m48345 != null) {
                C15320.m36347(m48345);
            }
            imageView.setImageDrawable(m48345);
        } else {
            imageView.setImageDrawable(null);
        }
        m38900();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m38902() {
        return !(this.f50802.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38896(ColorStateList colorStateList) {
        if (this.f50799 == null) {
            this.f50799 = new C5800();
        }
        C5800 c5800 = this.f50799;
        c5800.f17838 = colorStateList;
        c5800.f17836 = true;
        m38900();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m38901() {
        C5800 c5800 = this.f50799;
        if (c5800 != null) {
            return c5800.f17838;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38897(PorterDuff.Mode mode) {
        if (this.f50799 == null) {
            this.f50799 = new C5800();
        }
        C5800 c5800 = this.f50799;
        c5800.f17839 = mode;
        c5800.f17837 = true;
        m38900();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m38903() {
        C5800 c5800 = this.f50799;
        if (c5800 != null) {
            return c5800.f17839;
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38900() {
        ImageView imageView = this.f50802;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C15320.m36347(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (this.f50801 == null) {
                    this.f50801 = new C5800();
                }
                C5800 c5800 = this.f50801;
                c5800.f17838 = null;
                c5800.f17836 = false;
                c5800.f17839 = null;
                c5800.f17837 = false;
                ColorStateList m47123 = C20558.m47123(imageView);
                if (m47123 != null) {
                    c5800.f17836 = true;
                    c5800.f17838 = m47123;
                }
                PorterDuff.Mode m47126 = C20558.m47126(imageView);
                if (m47126 != null) {
                    c5800.f17837 = true;
                    c5800.f17839 = m47126;
                }
                if (c5800.f17836 || c5800.f17837) {
                    int[] drawableState = imageView.getDrawableState();
                    int i2 = C5965.f18296;
                    C1566.m5351(drawable, c5800, drawableState);
                    return;
                }
            }
            C5800 c58002 = this.f50799;
            if (c58002 != null) {
                int[] drawableState2 = imageView.getDrawableState();
                int i3 = C5965.f18296;
                C1566.m5351(drawable, c58002, drawableState2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38898(Drawable drawable) {
        this.f50800 = drawable.getLevel();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38894() {
        ImageView imageView = this.f50802;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.f50800);
        }
    }
}
