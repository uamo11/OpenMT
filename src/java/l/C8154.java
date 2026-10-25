package l;

import android.util.Property;
import android.view.View;

/* compiled from: R697 */
/* renamed from: l.۠ۨۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8154 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(C21560.m48713((View) obj));
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        C21560.m48715((View) obj, ((Float) obj2).floatValue());
    }
}
