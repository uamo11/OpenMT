package l;

/* compiled from: 4BJX */
/* renamed from: l.ۚ᩸ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5618 extends AbstractC21162 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17384;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f17385;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo15921(C19814 c19814);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract String mo15922();

    public AbstractC5618(int i, int i2) {
        this.f17384 = i;
        this.f17385 = i2;
    }

    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        C19814 mo28099 = c198142.mo28099();
        if (mo28099 == null || (mo28099 instanceof C0762)) {
            return false;
        }
        int mo15921 = mo15921(c198142);
        int i = this.f17385;
        int i2 = this.f17384;
        if (i2 == 0) {
            return mo15921 == i;
        }
        int i3 = mo15921 - i;
        return i3 * i2 >= 0 && i3 % i2 == 0;
    }

    public String toString() {
        int i = this.f17385;
        int i2 = this.f17384;
        return i2 == 0 ? String.format(":%s(%d)", mo15922(), Integer.valueOf(i)) : i == 0 ? String.format(":%s(%dn)", mo15922(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", mo15922(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
