package l;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: 067E */
/* renamed from: l.ۢۤܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC9527 extends AbstractMap {
    /* renamed from: ֫ */
    public abstract Iterator mo15281();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C20816(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator mo15281 = mo15281();
        mo15281.getClass();
        while (mo15281.hasNext()) {
            mo15281.next();
            mo15281.remove();
        }
    }
}
