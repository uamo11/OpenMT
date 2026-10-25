package l;

/* compiled from: 367O */
/* renamed from: l.ۜۗۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C6491 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f20042;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f20043;

    public C6491(Object obj, Object obj2) {
        this.f20042 = obj;
        this.f20043 = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6491 c6491 = (C6491) obj;
        if (this.f20042.equals(c6491.f20042)) {
            return this.f20043.equals(c6491.f20043);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f20042;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f20043;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{ " + this.f20042 + ", " + this.f20043 + " }";
    }
}
