package l;

import java.io.Serializable;
import java.util.Map;

/* compiled from: QA30 */
/* renamed from: l.᩷ۢ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20801 implements Map.Entry, Serializable, Cloneable {
    public static final long serialVersionUID = 9188503522395855322L;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f67339;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f67340;

    public final Object clone() {
        return this;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C20801(String str) {
        str = str == null ? "" : str;
        this.f67340 = str;
        this.f67339 = str.toLowerCase();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f67339;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f67340;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f67339.equals(entry.getKey()) && this.f67340.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f67339;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f67340;
        return (str2 != null ? str2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return this.f67339 + "=" + this.f67340;
    }
}
