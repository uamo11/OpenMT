package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: 3346 */
/* renamed from: l.ۚۛۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C5167 extends AbstractC0227 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Path f16169 = new Path();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Matrix f16170 = new Matrix();

    public C5167(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45929);
        try {
            String m9020 = C2958.m9020(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m9020 == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            m14819(C14533.m34681(m9020));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public C5167(Path path) {
        m14819(path);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14819(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        Matrix matrix = this.f16170;
        matrix.setTranslate(-f3, -f4);
        float f5 = f2 - f4;
        float sqrt = 1.0f / ((float) Math.sqrt((f5 * f5) + (r2 * r2)));
        matrix.postScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f5, f - f3)));
        path.transform(matrix, this.f16169);
    }

    @Override // l.AbstractC0227
    public final Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float sqrt = (float) Math.sqrt((f5 * f5) + (r6 * r6));
        double atan2 = Math.atan2(f5, f3 - f);
        Matrix matrix = this.f16170;
        matrix.setScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(atan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.f16169.transform(matrix, path);
        return path;
    }
}
