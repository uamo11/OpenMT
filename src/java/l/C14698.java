package l;

/* compiled from: Y96B */
/* renamed from: l.ܳᩳ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14698 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f44893 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f44892 = false;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f44894 = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34991() {
        InterfaceC13049 edit = ApplicationC20075.f65008.edit();
        boolean z = this.f44893;
        boolean z2 = z;
        if (this.f44892) {
            z2 = (z ? 1 : 0) | 2;
        }
        int i = z2;
        if (this.f44894) {
            i = (z2 ? 1 : 0) | 4;
        }
        edit.mo25852((byte) i, "edfa");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34990() {
        byte mo18251 = ApplicationC20075.f65008.mo18251((byte) 0, "edfa");
        this.f44893 = (mo18251 & 1) != 0;
        this.f44892 = (mo18251 & 2) != 0;
        this.f44894 = (mo18251 & 4) != 0;
    }
}
