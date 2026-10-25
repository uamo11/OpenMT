package l;

/* compiled from: K250 */
/* renamed from: l.ᩴۡܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18658 implements Comparable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13217 f58973;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13217 f58974;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18658 m43257(C13217 c13217, C13217 c132172) {
        if (c13217 == null && c132172 == null) {
            return null;
        }
        return new C18658(c13217, c132172);
    }

    public C18658(C13217 c13217, C13217 c132172) {
        this.f58973 = c13217;
        this.f58974 = c132172;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C18658) && compareTo((C18658) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C18658 c18658) {
        int compareTo;
        AbstractC13717 abstractC13717 = c18658.f58973;
        C13217 c13217 = this.f58973;
        if (c13217 == abstractC13717) {
            compareTo = 0;
        } else if (c13217 == null) {
            compareTo = -1;
        } else {
            compareTo = abstractC13717 == null ? 1 : c13217.compareTo(abstractC13717);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        AbstractC13717 abstractC137172 = c18658.f58974;
        C13217 c132172 = this.f58974;
        if (c132172 == abstractC137172) {
            return 0;
        }
        if (c132172 == null) {
            return -1;
        }
        if (abstractC137172 == null) {
            return 1;
        }
        return c132172.compareTo(abstractC137172);
    }

    public final int hashCode() {
        C13217 c13217 = this.f58973;
        int hashCode = (c13217 == null ? 0 : c13217.hashCode()) * 31;
        C13217 c132172 = this.f58974;
        return hashCode + (c132172 != null ? c132172.hashCode() : 0);
    }

    public final String toString() {
        C13217 c13217 = this.f58974;
        C13217 c132172 = this.f58973;
        if (c132172 != null && c13217 == null) {
            return c132172.m32052();
        }
        if (c132172 == null && c13217 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(c132172 == null ? "" : c132172.m32052());
        sb.append("|");
        sb.append(c13217 != null ? c13217.m32052() : "");
        return sb.toString();
    }

    public final C13217 getName() {
        return this.f58973;
    }

    public final C13217 getSignature() {
        return this.f58974;
    }
}
