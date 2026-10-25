package l;

/* compiled from: 61KH */
/* renamed from: l.ۡۛ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8703 implements Comparable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f26493;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f26494;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f26495;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8703 c8703 = (C8703) obj;
        int compare = Integer.compare(this.f26493, c8703.f26493);
        return compare == 0 ? this.f26495.compareTo(c8703.f26495) : compare;
    }

    public C8703(AbstractC15440 abstractC15440) {
        C9800 c9800;
        C9800 c98002;
        this.f26494 = abstractC15440;
        String lowerCase = abstractC15440.getName().toLowerCase();
        this.f26495 = lowerCase;
        c9800 = C15757.f48592;
        String mo23554 = abstractC15440.mo23554();
        c98002 = C15757.f48592;
        this.f26493 = c9800.mo24837(c98002.mo24837(Integer.MAX_VALUE, lowerCase), mo23554);
    }
}
