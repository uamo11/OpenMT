package l;

/* compiled from: X5N8 */
/* renamed from: l.ۧܿۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11137 implements InterfaceC17486, InterfaceC3354 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte f33421;

    @Override // l.InterfaceC10410
    /* renamed from: ۖ */
    public final int mo2302() {
        return 0;
    }

    public C11137(byte b) {
        this.f33421 = b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int compare = Integer.compare(0, interfaceC10410.mo2302());
        if (compare != 0) {
            return compare;
        }
        return Integer.compare(this.f33421, ((InterfaceC3354) interfaceC10410).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC3354) {
            return this.f33421 == ((InterfaceC3354) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC3354
    public final byte getValue() {
        return this.f33421;
    }

    public final int hashCode() {
        return this.f33421;
    }
}
