package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: 83AT */
/* renamed from: l.ۛۤۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C5996 extends AbstractC0227 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final float f18431 = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f18432;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f18433;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f18434;

    public C5996(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18433 = 0.0f;
        this.f18434 = 0.0f;
        this.f18432 = f18431;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45924);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f18434 = m16810(!C2958.m9022(xmlPullParser, "minimumVerticalAngle") ? 0.0f : obtainStyledAttributes.getFloat(1, 0.0f));
        this.f18433 = m16810(xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "minimumHorizontalAngle") != null ? obtainStyledAttributes.getFloat(0, 0.0f) : 0.0f);
        this.f18432 = m16810(xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "maximumAngle") != null ? obtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m16810(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // l.AbstractC0227
    public final Path getPath(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f9 * f9) + (f8 * f8);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f5 = f3;
            } else {
                f6 = abs + f2;
                f5 = f;
            }
            f7 = this.f18434;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.f18433;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f17 * f17) + (f16 * f16);
        float f19 = this.f18432;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f5 = C20382.m46695(f5, f11, sqrt, f11);
            f6 = C20382.m46695(f6, f12, sqrt, f12);
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }
}
