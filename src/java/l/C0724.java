package l;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: G5V7 */
/* renamed from: l.֡᩺ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0724 extends AbstractC5664 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f2722;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f2723;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f2724;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f2725;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f2726;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f2727;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Matrix f2728;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f2729;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f2730;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Matrix f2731;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f2732;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0724(C0724 c0724, C2727 c2727) {
        super(0);
        C19070 c19070;
        this.f2731 = new Matrix();
        this.f2722 = new ArrayList();
        this.f2727 = 0.0f;
        this.f2730 = 0.0f;
        this.f2729 = 0.0f;
        this.f2732 = 1.0f;
        this.f2723 = 1.0f;
        this.f2725 = 0.0f;
        this.f2724 = 0.0f;
        Matrix matrix = new Matrix();
        this.f2728 = matrix;
        this.f2726 = null;
        this.f2727 = c0724.f2727;
        this.f2730 = c0724.f2730;
        this.f2729 = c0724.f2729;
        this.f2732 = c0724.f2732;
        this.f2723 = c0724.f2723;
        this.f2725 = c0724.f2725;
        this.f2724 = c0724.f2724;
        String str = c0724.f2726;
        this.f2726 = str;
        if (str != null) {
            c2727.put(str, this);
        }
        matrix.set(c0724.f2728);
        ArrayList arrayList = c0724.f2722;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0724) {
                this.f2722.add(new C0724((C0724) obj, c2727));
            } else {
                if (!(obj instanceof C19776)) {
                    if (!(obj instanceof C19070)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c19070 = new C19070((C19070) obj);
                } else {
                    C19776 c19776 = (C19776) obj;
                    C19776 c197762 = new C19776(c19776);
                    c197762.f63846 = 0.0f;
                    c197762.f63848 = 1.0f;
                    c197762.f63851 = 1.0f;
                    c197762.f63844 = 0.0f;
                    c197762.f63849 = 1.0f;
                    c197762.f63843 = 0.0f;
                    c197762.f63845 = Paint.Cap.BUTT;
                    c197762.f63852 = Paint.Join.MITER;
                    c197762.f63847 = 4.0f;
                    c197762.f63853 = c19776.f63853;
                    c197762.f63846 = c19776.f63846;
                    c197762.f63848 = c19776.f63848;
                    c197762.f63850 = c19776.f63850;
                    c197762.f5125 = c19776.f5125;
                    c197762.f63851 = c19776.f63851;
                    c197762.f63844 = c19776.f63844;
                    c197762.f63849 = c19776.f63849;
                    c197762.f63843 = c19776.f63843;
                    c197762.f63845 = c19776.f63845;
                    c197762.f63852 = c19776.f63852;
                    c197762.f63847 = c19776.f63847;
                    c19070 = c197762;
                }
                this.f2722.add(c19070);
                Object obj2 = c19070.f5127;
                if (obj2 != null) {
                    c2727.put(obj2, c19070);
                }
            }
        }
    }

    public C0724() {
        super(0);
        this.f2731 = new Matrix();
        this.f2722 = new ArrayList();
        this.f2727 = 0.0f;
        this.f2730 = 0.0f;
        this.f2729 = 0.0f;
        this.f2732 = 1.0f;
        this.f2723 = 1.0f;
        this.f2725 = 0.0f;
        this.f2724 = 0.0f;
        this.f2728 = new Matrix();
        this.f2726 = null;
    }

    public String getGroupName() {
        return this.f2726;
    }

    public Matrix getLocalMatrix() {
        return this.f2728;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2833(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m9019 = C2958.m9019(resources, theme, attributeSet, C11309.f33855);
        float f = this.f2727;
        if (C2958.m9022(xmlPullParser, "rotation")) {
            f = m9019.getFloat(5, f);
        }
        this.f2727 = f;
        this.f2730 = m9019.getFloat(1, this.f2730);
        this.f2729 = m9019.getFloat(2, this.f2729);
        float f2 = this.f2732;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleX") != null) {
            f2 = m9019.getFloat(3, f2);
        }
        this.f2732 = f2;
        float f3 = this.f2723;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleY") != null) {
            f3 = m9019.getFloat(4, f3);
        }
        this.f2723 = f3;
        float f4 = this.f2725;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateX") != null) {
            f4 = m9019.getFloat(6, f4);
        }
        this.f2725 = f4;
        float f5 = this.f2724;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateY") != null) {
            f5 = m9019.getFloat(7, f5);
        }
        this.f2724 = f5;
        String string = m9019.getString(0);
        if (string != null) {
            this.f2726 = string;
        }
        m2832();
        m9019.recycle();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m2832() {
        Matrix matrix = this.f2728;
        matrix.reset();
        matrix.postTranslate(-this.f2730, -this.f2729);
        matrix.postScale(this.f2732, this.f2723);
        matrix.postRotate(this.f2727, 0.0f, 0.0f);
        matrix.postTranslate(this.f2725 + this.f2730, this.f2724 + this.f2729);
    }

    public float getRotation() {
        return this.f2727;
    }

    public void setRotation(float f) {
        if (f != this.f2727) {
            this.f2727 = f;
            m2832();
        }
    }

    public float getPivotX() {
        return this.f2730;
    }

    public void setPivotX(float f) {
        if (f != this.f2730) {
            this.f2730 = f;
            m2832();
        }
    }

    public float getPivotY() {
        return this.f2729;
    }

    public void setPivotY(float f) {
        if (f != this.f2729) {
            this.f2729 = f;
            m2832();
        }
    }

    public float getScaleX() {
        return this.f2732;
    }

    public void setScaleX(float f) {
        if (f != this.f2732) {
            this.f2732 = f;
            m2832();
        }
    }

    public float getScaleY() {
        return this.f2723;
    }

    public void setScaleY(float f) {
        if (f != this.f2723) {
            this.f2723 = f;
            m2832();
        }
    }

    public float getTranslateX() {
        return this.f2725;
    }

    public void setTranslateX(float f) {
        if (f != this.f2725) {
            this.f2725 = f;
            m2832();
        }
    }

    public float getTranslateY() {
        return this.f2724;
    }

    public void setTranslateY(float f) {
        if (f != this.f2724) {
            this.f2724 = f;
            m2832();
        }
    }

    @Override // l.AbstractC5664
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2834() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2722;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC5664) arrayList.get(i)).mo2834()) {
                return true;
            }
            i++;
        }
    }

    @Override // l.AbstractC5664
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2835(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f2722;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((AbstractC5664) arrayList.get(i)).mo2835(iArr);
            i++;
        }
    }
}
