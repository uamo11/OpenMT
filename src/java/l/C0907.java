package l;

/* compiled from: 54F8 */
/* renamed from: l.֨ۚۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0907 extends C17135 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f3483;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f3484;

    @Override // l.C17135
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3260(C2319 c2319) {
        if (this.f3483 == null) {
            throw new IllegalStateException("Invalid stub: " + this.f3483);
        }
        m40162((short) ((m40166().contains(EnumC20664.OBJECT_UUID) ? 40 : 24) + this.f3483.length));
        super.mo3260(c2319);
        byte[] bArr = this.f3483;
        c2319.m7581(bArr.length);
        c2319.m7582(0);
        c2319.m7582(this.f3484);
        c2319.m7580(bArr);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3262(short s) {
        this.f3484 = s;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3261(byte[] bArr) {
        this.f3483 = bArr;
    }
}
