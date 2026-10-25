package l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: J4W4 */
/* renamed from: l.ܳۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C14410 extends PopupWindow {
    public C14410(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m34434(context, attributeSet, i);
    }

    public C14410(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        m34434(context, attributeSet, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34434(Context context, AttributeSet attributeSet, int i) {
        C22733 m50796 = C22733.m50796(context, attributeSet, C3390.f10712, i, 0);
        if (m50796.m50802(2)) {
            C0801.m3024(this, m50796.m50801(2, false));
        }
        setBackgroundDrawable(m50796.m50815(0));
        m50796.m50813();
    }
}
