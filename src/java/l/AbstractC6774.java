package l;

/* compiled from: K593 */
/* renamed from: l.ۜ۬֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC6774 implements InterfaceC2216 {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC2216 interfaceC2216 = (InterfaceC2216) obj;
        String mo7393 = mo7393();
        if (mo7393 == null) {
            if (interfaceC2216.mo7393() != null) {
                return 1;
            }
        } else {
            if (interfaceC2216.mo7393() == null) {
                return -1;
            }
            int compareTo = mo7393.compareTo(interfaceC2216.mo7393());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.compare(mo7391(), interfaceC2216.mo7391());
    }

    @Override // l.InterfaceC2216
    /* renamed from: ۫ۧ */
    public InterfaceC21699 mo7392() {
        String mo7393 = mo7393();
        if (mo7393 == null) {
            return null;
        }
        return new C23707(mo7393);
    }

    public final int hashCode() {
        String mo7393 = mo7393();
        return mo7391() + ((mo7393 == null ? 0 : mo7393.hashCode()) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC2216) {
            InterfaceC2216 interfaceC2216 = (InterfaceC2216) obj;
            if (C11003.equals(mo7393(), interfaceC2216.mo7393()) && mo7391() == interfaceC2216.mo7391()) {
                return true;
            }
        }
        return false;
    }
}
