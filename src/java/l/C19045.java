package l;

/* compiled from: 0BJO */
/* renamed from: l.ᩴ᩹ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19045 extends AbstractC21867 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6134 f59982;

    public C19045(AbstractC21162 abstractC21162) {
        this.f70032 = abstractC21162;
        this.f59982 = new C6134(abstractC21162);
    }

    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        for (int i = 0; i < c198142.mo10981(); i++) {
            AbstractC11347 m28087 = c198142.m28087(i);
            if ((m28087 instanceof C19814) && this.f59982.m17056(c198142, (C19814) m28087) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.f70032);
    }
}
