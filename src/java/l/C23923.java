package l;

/* compiled from: BBKO */
/* renamed from: l.᩻᩶ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23923 implements Comparable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f77594;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC21102 f77595;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f77596;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C23923 c23923 = (C23923) obj;
        int compareTo = this.f77595.compareTo(c23923.f77595);
        if (compareTo != 0) {
            return compareTo;
        }
        int compare = Integer.compare(this.f77596, c23923.f77596);
        return compare != 0 ? compare : this.f77594.compareTo(c23923.f77594);
    }

    public C23923(EnumC21102 enumC21102, int i, String str) {
        this.f77595 = enumC21102;
        this.f77596 = i;
        this.f77594 = str;
    }
}
