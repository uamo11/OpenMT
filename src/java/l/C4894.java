package l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

/* compiled from: N933 */
/* renamed from: l.ۙ᩷ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4894 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15453;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Paint f15454 = new Paint();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Rect f15455;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14254(int i, Rect rect) {
        if (rect.equals(this.f15455) && i == this.f15453) {
            return;
        }
        this.f15455 = rect;
        this.f15453 = i;
        float f = rect.left;
        int i2 = rect.top;
        this.f15454.setShader(new LinearGradient(f, i2, rect.right, i2, i & 16777215, i | (-16777216), Shader.TileMode.CLAMP));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14255(Canvas canvas) {
        canvas.drawRect(this.f15455, this.f15454);
    }
}
