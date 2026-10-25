package l;

/* compiled from: 461A */
/* renamed from: l.ۨ۠ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11572 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34510;

    public C11572(int i) {
        this.f34510 = i;
    }

    public C11572() {
        this.f34510 = -1;
    }

    public final String toString() {
        int i = this.f34510;
        return i >= 0 ? String.format("L%04x", Integer.valueOf(i)) : String.format("L%08x", Integer.valueOf(hashCode()));
    }
}
