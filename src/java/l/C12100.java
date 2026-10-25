package l;

/* compiled from: A70P */
/* renamed from: l.۫֫ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12100 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f36164;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12100 f36165;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] f36166;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f36167;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f36168;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12100 f36169;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f36170;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f36171;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f36172;

    public C12100(C12100 c12100, C12100 c121002, long[] jArr, int i, int i2, boolean z, boolean z2) {
        long m32551;
        long m325512;
        long m325513;
        this.f36169 = c12100;
        this.f36165 = c121002;
        this.f36166 = jArr;
        this.f36167 = i;
        this.f36170 = i2;
        this.f36171 = z;
        this.f36164 = z2;
        if (jArr != null) {
            long length = jArr.length * 8;
            this.f36168 = length;
            this.f36172 = length + 48;
        } else {
            if (c12100 != null) {
                m32551 = C13510.m32551(c12100.f36168, c121002.f36168);
                this.f36168 = m32551;
                m325512 = C13510.m32551(c12100.f36172, c121002.f36172);
                m325513 = C13510.m32551(48L, m325512);
                this.f36172 = m325513;
                return;
            }
            this.f36168 = 0L;
            this.f36172 = 48L;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29515() {
        return this.f36169 == null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29514() {
        return this.f36166 != null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m29516() {
        return m29515() && this.f36166 == null;
    }
}
