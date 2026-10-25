package l;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: R697 */
/* renamed from: l.ܶۨۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15208 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return ((View) obj).getClipBounds();
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((View) obj).setClipBounds((Rect) obj2);
    }
}
