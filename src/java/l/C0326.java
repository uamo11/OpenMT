package l;

import java.util.Map;

/* compiled from: O6BJ */
/* renamed from: l.֡ۢۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0326 implements Map.Entry {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f1716;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5266 f1717;

    public C0326(AbstractC5266 abstractC5266) {
        this.f1717 = abstractC5266;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f1716;
        return Integer.valueOf(this.f1717.mo7888(((Integer) obj).intValue(), obj2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1716;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Integer.valueOf(this.f1717.mo7889(this.f1716));
    }
}
