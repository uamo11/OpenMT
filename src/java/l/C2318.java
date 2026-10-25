package l;

import java.util.List;
import java.util.Map;

/* compiled from: V9PU */
/* renamed from: l.ۖۚۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2318 extends C21368 {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return m48425((Comparable) obj, obj2);
    }

    @Override // l.C21368
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo7575() {
        if (!m48430()) {
            for (int i = 0; i < m48427(); i++) {
                Map.Entry m48428 = m48428(i);
                if (((InterfaceC18504) m48428.getKey()).mo1129()) {
                    m48428.setValue(C20195.unmodifiableList((List) m48428.getValue()));
                }
            }
            for (Map.Entry entry : m48429()) {
                if (((InterfaceC18504) entry.getKey()).mo1129()) {
                    entry.setValue(C20195.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo7575();
    }
}
