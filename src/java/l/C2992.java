package l;

/* compiled from: J1JQ */
/* renamed from: l.ۗۘܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2992 implements Comparable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f9436;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f9437;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f9438;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2992 c2992 = (C2992) obj;
        int compare = Integer.compare(this.f9436, c2992.f9436);
        return compare == 0 ? Integer.compare(this.f9438, c2992.f9438) : compare;
    }

    public C2992(int i, int i2, int i3) {
        this.f9438 = i;
        this.f9436 = i2;
        this.f9437 = i3;
    }

    public final String toString() {
        return "Group" + this.f9438 + " " + this.f9436 + "-" + this.f9437;
    }
}
