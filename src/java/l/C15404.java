package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* compiled from: P67K */
/* renamed from: l.ܶᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15404 extends View {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f47170;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LayoutInflater f47171;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f47172;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public WeakReference f47173;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public C15404(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C15404(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47170 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3390.f10702, i, 0);
        this.f47172 = obtainStyledAttributes.getResourceId(2, -1);
        this.f47170 = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36453(LayoutInflater layoutInflater) {
        this.f47171 = layoutInflater;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        WeakReference weakReference = this.f47173;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m36452();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m36452() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            int i = this.f47170;
            if (i != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f47171;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(i, viewGroup, false);
                int i2 = this.f47172;
                if (i2 != -1) {
                    inflate.setId(i2);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f47173 = new WeakReference(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }
}
