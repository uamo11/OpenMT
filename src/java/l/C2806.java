package l;

/* compiled from: V6NC */
/* renamed from: l.ۖ᩸ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2806 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f8773;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f8774;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public char f8775;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f8776;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f8777;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8681(char c) {
        char c2 = this.f8775;
        if (c2 != 0) {
            this.f8775 = (char) 0;
            if (Character.isLowSurrogate(c)) {
                m8679(Character.toCodePoint(c2, c));
                return;
            }
            m8679((int) c2);
        }
        if (Character.isHighSurrogate(c)) {
            this.f8775 = c;
        } else {
            m8679((int) c);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8679(int i) {
        boolean z;
        int i2 = C2164.f7153;
        boolean z2 = false;
        if (i > 127) {
            z = Character.isLetterOrDigit(i);
        } else {
            z = (97 <= i && i <= 122) || (65 <= i && i <= 90) || (48 <= i && i <= 57);
        }
        boolean z3 = C2164.m7146(i) == 6;
        boolean z4 = i == 95 || z || (z3 && this.f8773);
        boolean z5 = Character.isLetter(i) || (i >= 48 && i <= 57);
        if (this.f8777 && !z5) {
            if (!z4) {
                this.f8774++;
            }
            this.f8777 = false;
        }
        if (z5 && !this.f8776) {
            this.f8777 = true;
        }
        boolean z6 = i <= 65535 && (z || (z3 && this.f8773));
        this.f8773 = z6;
        if (i == 95 || z || (z3 && z6)) {
            z2 = true;
        }
        this.f8776 = z2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m8680() {
        return this.f8774 + (this.f8777 ? 1L : 0L);
    }
}
