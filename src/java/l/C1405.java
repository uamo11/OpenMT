package l;

/* compiled from: 0BJO */
/* renamed from: l.֨᩹ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1405 extends AbstractC21867 {
    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        if (c19814 == c198142) {
            return false;
        }
        for (C19814 mo28099 = c198142.mo28099(); mo28099 != null; mo28099 = mo28099.mo28099()) {
            if (this.f70032.mo2753(c19814, mo28099)) {
                return true;
            }
            if (mo28099 == c19814) {
                return false;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ", this.f70032);
    }
}
