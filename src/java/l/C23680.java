package l;

/* compiled from: B55V */
/* renamed from: l.᩻ۨܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23680 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f76708;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f76709;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f76710;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23680.class != obj.getClass()) {
            return false;
        }
        C23680 c23680 = (C23680) obj;
        if (C11003.equals(this.f76710, c23680.f76710)) {
            return C11003.equals(this.f76708, c23680.f76708);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f76710;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76708;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
