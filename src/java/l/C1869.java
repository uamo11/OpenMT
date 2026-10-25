package l;

import android.graphics.Canvas;

/* compiled from: J5IM */
/* renamed from: l.֫ܰᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1869 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6373;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6374;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6375;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6196(Canvas canvas, int i, int i2, int i3, float f, boolean z, C1539 c1539, InterfaceC10961 interfaceC10961, C22686 c22686) {
        if (this.f6373) {
            int i4 = this.f6375;
            int i5 = this.f6374;
            if ((i > i4 || i2 < i4) && ((i > i5 || i2 < i5) && (i <= i4 || i2 >= i5))) {
                return;
            }
            int max = Math.max(i, i4);
            int min = Math.min(i2, i5);
            C20113 c20113 = (C20113) interfaceC10961;
            float m46370 = c20113.m46370(i, 0.0f, max);
            float m463702 = c20113.m46370(i, 0.0f, min);
            if (i2 < i5 && (!z || i2 == i3)) {
                m463702 += c22686.f73281;
            }
            float f2 = m463702;
            float m24495 = c22686.m24495();
            float m24501 = (0.08f * m24495) + c22686.m24501() + f;
            c1539.setColor(c22686.m24492() & (-1426063361));
            c1539.setStrokeWidth(m24495 * 0.04f);
            canvas.drawLine(m46370, m24501, f2, m24501, c1539);
            c1539.setStrokeWidth(0.0f);
        }
    }
}
