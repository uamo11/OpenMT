package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.io.IOException;

/* compiled from: B4IO */
/* renamed from: l.ۡۢ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C8790 extends TextView {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1028 f26774;

    public C8790(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22689(attributeSet, 0);
    }

    public C8790(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22689(attributeSet, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22689(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            Drawable m22688 = m22688(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableLeft", 0));
            Drawable m226882 = m22688(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableTop", 0));
            Drawable m226883 = m22688(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableRight", 0));
            Drawable m226884 = m22688(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableBottom", 0));
            Drawable m226885 = m22688(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableStart", 0));
            Drawable m226886 = m22688(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (m226885 != null) {
                    m22688 = m226885;
                }
                if (m226886 != null) {
                    m226883 = m226886;
                }
            } else {
                if (m226885 != null) {
                    m226883 = m226885;
                }
                if (m226886 != null) {
                    m22688 = m226886;
                }
                Drawable drawable = m226883;
                m226883 = m22688;
                m22688 = drawable;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(m22688, m226882, m226883, m226884);
            setBackground(m22688(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "background", 0)));
            C1028 c1028 = new C1028(this, attributeSet, i);
            this.f26774 = c1028;
            if (c1028.f3758 >= 0) {
                for (Drawable drawable2 : getCompoundDrawables()) {
                    C8084.m21454(drawable2, this.f26774.f3758);
                }
                for (Drawable drawable3 : getCompoundDrawablesRelative()) {
                    C8084.m21454(drawable3, this.f26774.f3758);
                }
                C8084.m21454(getBackground(), this.f26774.f3758);
            }
        }
        this.f26774 = new C1028();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Drawable m22688(int i) {
        if (i == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i);
        if (!isInEditMode() && C8084.f24900.contains(resourceTypeName)) {
            try {
                return new C1734(resources, i);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return resources.getDrawable(i, getContext().getTheme());
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesWithIntrinsicBounds(m22688(i), m22688(i2), m22688(i3), m22688(i4));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(m22688(i), m22688(i2), m22688(i3), m22688(i4));
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f26774.f3757) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new C0322(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0322)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0322 c0322 = (C0322) parcelable;
        super.onRestoreInstanceState(c0322.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        c0322.m1731(compoundDrawables[0], 0);
        c0322.m1731(compoundDrawables[1], 1);
        c0322.m1731(compoundDrawables[2], 2);
        c0322.m1731(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        c0322.m1731(compoundDrawablesRelative[0], 4);
        c0322.m1731(compoundDrawablesRelative[2], 5);
        c0322.m1731(getBackground(), 6);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setVisible(true, false);
            }
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            if (drawable2 != null) {
                drawable2.setVisible(true, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            if (drawable2 != null) {
                drawable2.setVisible(false, false);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackground(m22688(i));
    }
}
