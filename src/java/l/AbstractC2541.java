package l;

/* compiled from: 069J */
/* renamed from: l.ۖ۬֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC2541 extends AbstractC19475 implements InterfaceC19583 {
    @Override // l.InterfaceC19583
    public final int hashCode() {
        return mo2850().hashCode() + (mo2849() * 31);
    }

    @Override // l.InterfaceC19583
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC19583)) {
            return false;
        }
        InterfaceC19583 interfaceC19583 = (InterfaceC19583) obj;
        return mo2849() == interfaceC19583.mo2849() && mo2850().equals(interfaceC19583.mo2850());
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC19583 interfaceC19583) {
        int compare = Integer.compare(mo2849(), interfaceC19583.mo2849());
        if (compare != 0) {
            return compare;
        }
        InterfaceC8293 mo2850 = mo2850();
        if (mo2850 instanceof InterfaceC18877) {
            if (interfaceC19583.mo2850() instanceof InterfaceC18877) {
                return ((InterfaceC18877) mo2850).compareTo((InterfaceC18877) interfaceC19583.mo2850());
            }
            return -1;
        }
        if (interfaceC19583.mo2850() instanceof InterfaceC5471) {
            return ((InterfaceC5471) mo2850).compareTo((InterfaceC5471) interfaceC19583.mo2850());
        }
        return 1;
    }
}
