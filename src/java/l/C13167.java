package l;

/* compiled from: 367O */
/* renamed from: l.۬ܳۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C13167 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f39374;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f39375;

    public C13167(Object obj, Object obj2) {
        this.f39374 = obj;
        this.f39375 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13167)) {
            return false;
        }
        C13167 c13167 = (C13167) obj;
        return C11166.m27696(this.f39374, c13167.f39374) && C11166.m27696(this.f39375, c13167.f39375);
    }

    public final int hashCode() {
        Object obj = this.f39374;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f39375;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "<" + this.f39374 + "," + this.f39375 + ">";
    }
}
