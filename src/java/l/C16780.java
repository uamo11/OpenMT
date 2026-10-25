package l;

/* compiled from: I5AF */
/* renamed from: l.ܽܿۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C16780 implements InterfaceC17486, InterfaceC13231 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char f51538;

    @Override // l.InterfaceC10410
    /* renamed from: ۖ */
    public final int mo2302() {
        return 3;
    }

    public C16780(char c) {
        this.f51538 = c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int compare = Integer.compare(3, interfaceC10410.mo2302());
        if (compare != 0) {
            return compare;
        }
        return Character.compare(this.f51538, ((InterfaceC13231) interfaceC10410).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC13231) {
            return this.f51538 == ((InterfaceC13231) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC13231
    public final char getValue() {
        return this.f51538;
    }

    public final int hashCode() {
        return this.f51538;
    }
}
