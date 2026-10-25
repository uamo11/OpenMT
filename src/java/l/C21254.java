package l;

/* compiled from: Z6QT */
/* renamed from: l.᩸֨ܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21254 extends C0085 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5855 f68574;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17019 f68575;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5855 f68576;

    public C21254(C5855 c5855, C17019 c17019, C5855 c58552) {
        super(c5855);
        int unused;
        this.f68576 = c5855;
        this.f68575 = c17019;
        unused = c17019.f52192;
        this.f68574 = c58552;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21254 m48260(C5855 c5855, C0085 c0085) {
        int i;
        boolean z;
        C17019 m39981 = C17019.m39981(c5855);
        if (m39981 == null) {
            return null;
        }
        i = m39981.f52192;
        if (i == 0) {
            z = m39981.f52191;
            if (!z) {
                return null;
            }
        }
        return new C21254(c5855, m39981, c0085);
    }
}
