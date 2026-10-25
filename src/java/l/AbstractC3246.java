package l;

/* compiled from: D56J */
/* renamed from: l.ۗ۬֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC3246 implements InterfaceC16801 {
    @Override // l.InterfaceC10410
    /* renamed from: ۖ */
    public final int mo2302() {
        return 21;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int compare = Integer.compare(21, interfaceC10410.mo2302());
        return compare != 0 ? compare : getValue().mo2256(((InterfaceC16801) interfaceC10410).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC16801) {
            return getValue().equals(((InterfaceC16801) obj).getValue());
        }
        return false;
    }
}
