package l;

import java.util.Map;

/* compiled from: H5GB */
/* renamed from: l.۠᩷ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8419 implements Map.Entry {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0657 f25793;

    public C8419(C0657 c0657) {
        this.f25793 = c0657;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Integer num = (Integer) obj;
        this.f25793.f2526 = num.intValue();
        return num;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f25793;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Integer.valueOf(this.f25793.f2526);
    }
}
