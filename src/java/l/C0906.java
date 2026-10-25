package l;

import java.util.Map;

/* compiled from: V9PU */
/* renamed from: l.֨ۚۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0906 implements Map.Entry, Comparable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f3480;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Comparable f3481;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21368 f3482;

    public C0906() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3481.compareTo(((C0906) obj).f3481);
    }

    public C0906(C21368 c21368, Comparable comparable, Object obj) {
        this.f3482 = c21368;
        this.f3481 = comparable;
        this.f3480 = obj;
    }

    @Override // java.util.Map.Entry
    public final Comparable getKey() {
        return this.f3481;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3481;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3480;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f3482.m48424();
        Object obj2 = this.f3480;
        this.f3480 = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f3481;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f3480;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        equals = value == null;
                    } else {
                        equals = obj2.equals(value);
                    }
                    if (equals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f3481;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3480;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return this.f3481 + "=" + this.f3480;
    }
}
