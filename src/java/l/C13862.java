package l;

/* compiled from: R6N8 */
/* renamed from: l.ܰܰᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13862 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7513 f41327;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f41328;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f41330;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f41331;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10858 f41333;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f41329 = -1;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11747 f41332 = new C11747();

    public C13862(C10858 c10858) {
        this.f41333 = c10858;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11747 m33216(int i) {
        int i2;
        C7513 c7513;
        int i3;
        int i4;
        int i5;
        C10858 c10858 = this.f41333;
        c10858.m27126(i);
        int i6 = this.f41329;
        i2 = c10858.f32616;
        if (i6 != i2 || i < (i5 = this.f41330) || i >= i5 + this.f41327.f23106) {
            c7513 = c10858.f32615;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                C7513 c75132 = c7513.f23123;
                int i10 = c75132 == null ? 0 : c75132.f23114;
                i3 = i7 + i10;
                if (i < i3) {
                    i8 += c7513.f23118;
                    i9 += c7513.f23115;
                    c7513 = c75132;
                } else {
                    int i11 = c7513.f23106;
                    if (i < i3 + i11) {
                        break;
                    }
                    i7 += i10 + i11;
                    i8 += c7513.f23118;
                    i9 += c7513.f23115;
                    c7513 = c7513.f23109;
                }
            }
            this.f41327 = c7513;
            this.f41330 = i3;
            this.f41328 = i8 + c7513.f23107;
            this.f41331 = i9 + c7513.f23122;
            i4 = c10858.f32616;
            this.f41329 = i4;
        }
        int i12 = i - this.f41330;
        int m20153 = this.f41327.m20153(i12) + this.f41328;
        C7513 c75133 = this.f41327;
        char[] cArr = c75133.f23111;
        int i13 = cArr != null ? cArr[i12] : c75133.f23110[i12];
        int m20151 = c75133.m20151(i12) + this.f41331;
        C11747 c11747 = this.f41332;
        c11747.m28751(m20153, i13 + m20153, m20151);
        c11747.m28753(this.f41327.m20150(i12));
        return c11747;
    }
}
