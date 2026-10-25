package l;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: J1WB */
/* renamed from: l.۟᩵ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7670 extends Animation {

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f23676;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final boolean f23677;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f23678;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f23679;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f23681;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f23683;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f23684;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f23685;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f23686;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f23687;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f23689;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Camera f23680 = new Camera();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f23692 = 1.0f;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f23693 = 1.0f;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f23688 = 1.0f;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final RectF f23690 = new RectF();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RectF f23691 = new RectF();

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Matrix f23682 = new Matrix();

    static {
        f23677 = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f23676 = new WeakHashMap();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7670 m20494(View view) {
        WeakHashMap weakHashMap = f23676;
        C7670 c7670 = (C7670) weakHashMap.get(view);
        if (c7670 != null && c7670 == view.getAnimation()) {
            return c7670;
        }
        C7670 c76702 = new C7670(view);
        weakHashMap.put(view, c76702);
        return c76702;
    }

    public C7670(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f23689 = new WeakReference(view);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m20499() {
        return this.f23692;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20500(float f) {
        if (this.f23692 != f) {
            this.f23692 = f;
            View view = (View) this.f23689.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m20514() {
        return this.f23687;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20509(float f) {
        if (this.f23679 && this.f23687 == f) {
            return;
        }
        m20493();
        this.f23679 = true;
        this.f23687 = f;
        m20497();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m20518() {
        return this.f23686;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20515(float f) {
        if (this.f23679 && this.f23686 == f) {
            return;
        }
        m20493();
        this.f23679 = true;
        this.f23686 = f;
        m20497();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m20516() {
        return this.f23685;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20519(float f) {
        if (this.f23685 != f) {
            m20493();
            this.f23685 = f;
            m20497();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m20510() {
        return this.f23683;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m20517(float f) {
        if (this.f23683 != f) {
            m20493();
            this.f23683 = f;
            m20497();
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m20503() {
        return this.f23681;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m20511(float f) {
        if (this.f23681 != f) {
            m20493();
            this.f23681 = f;
            m20497();
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m20521() {
        return this.f23693;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m20523(float f) {
        if (this.f23693 != f) {
            m20493();
            this.f23693 = f;
            m20497();
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float m20507() {
        return this.f23688;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m20504(float f) {
        if (this.f23688 != f) {
            m20493();
            this.f23688 = f;
            m20497();
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m20505() {
        View view = (View) this.f23689.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m20512() {
        View view = (View) this.f23689.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m20501() {
        return this.f23678;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20522(float f) {
        if (this.f23678 != f) {
            m20493();
            this.f23678 = f;
            m20497();
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float m20502() {
        return this.f23684;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m20508(float f) {
        if (this.f23684 != f) {
            m20493();
            this.f23684 = f;
            m20497();
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float m20520() {
        if (((View) this.f23689.get()) == null) {
            return 0.0f;
        }
        return r0.getLeft() + this.f23678;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m20506(float f) {
        if (((View) this.f23689.get()) != null) {
            m20522(f - r0.getLeft());
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float m20498() {
        if (((View) this.f23689.get()) == null) {
            return 0.0f;
        }
        return r0.getTop() + this.f23684;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m20513(float f) {
        if (((View) this.f23689.get()) != null) {
            m20508(f - r0.getTop());
        }
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m20493() {
        View view = (View) this.f23689.get();
        if (view != null) {
            m20496(view, this.f23690);
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m20497() {
        View view = (View) this.f23689.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.f23691;
        m20496(view, rectF);
        rectF.union(this.f23690);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20496(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.f23682;
        matrix.reset();
        m20495(view, matrix);
        matrix.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        float f = rectF.right;
        float f2 = rectF.left;
        if (f < f2) {
            rectF.right = f2;
            rectF.left = f;
        }
        float f3 = rectF.bottom;
        float f4 = rectF.top;
        if (f3 < f4) {
            rectF.top = f3;
            rectF.bottom = f4;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20495(View view, Matrix matrix) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z = this.f23679;
        float f = z ? this.f23687 : width / 2.0f;
        float f2 = z ? this.f23686 : height / 2.0f;
        float f3 = this.f23683;
        float f4 = this.f23681;
        float f5 = this.f23685;
        if (f3 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
            Camera camera = this.f23680;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f23693;
        float f7 = this.f23688;
        if (f6 != 1.0f || f7 != 1.0f) {
            matrix.postScale(f6, f7);
            matrix.postTranslate(((f6 * width) - width) * (-(f / width)), ((f7 * height) - height) * (-(f2 / height)));
        }
        matrix.postTranslate(this.f23678, this.f23684);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        View view = (View) this.f23689.get();
        if (view != null) {
            transformation.setAlpha(this.f23692);
            m20495(view, transformation.getMatrix());
        }
    }
}
