package l;

/* compiled from: 37RB */
/* renamed from: l.۠ۘ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7924 extends C14979 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f24532;

    public C7924(EnumC19920 enumC19920, int i, int i2, String str, int i3, C2609 c2609) {
        super(enumC19920, i, i2, str, c2609);
        this.f24532 = i3;
    }

    @Override // l.C14979, l.C22036
    /* renamed from: ֫ */
    public final void mo3193() {
        EnumC21331 enumC21331 = this.f70640.f64483;
        EnumC21331 enumC213312 = EnumC21331.NUMERIC;
        if (enumC21331 == enumC213312) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC213312);
    }

    @Override // l.C22036
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo21214() {
        return this.f24532;
    }
}
