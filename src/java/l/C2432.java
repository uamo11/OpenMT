package l;

import java.nio.charset.StandardCharsets;

/* compiled from: Q6ZO */
/* renamed from: l.ۖۡܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2432 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f7758;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f7759;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7760;

    public C2432(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < i || i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Invalid syntax cache reader range");
        }
        this.f7758 = bArr;
        this.f7760 = i;
        this.f7759 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m7869() {
        return this.f7760;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m7874() {
        return this.f7759 - this.f7760;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m7872() {
        m7868(1);
        int i = this.f7760;
        this.f7760 = i + 1;
        return this.f7758[i] & 255;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m7871() {
        int m43266;
        m7868(4);
        m43266 = C18660.m43266(this.f7760, this.f7758);
        this.f7760 += 4;
        return m43266;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m7870(int i) {
        int m7871 = m7871();
        if (m7871 < 0 || m7871 > i) {
            throw new IllegalArgumentException("Invalid syntax cache string length");
        }
        m7868(m7871);
        String str = new String(this.f7758, this.f7760, m7871, StandardCharsets.UTF_8);
        this.f7760 += m7871;
        return str;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m7873() {
        if (this.f7760 != this.f7759) {
            throw new IllegalArgumentException("Trailing syntax cache payload");
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m7868(int i) {
        if (i < 0 || i > this.f7759 - this.f7760) {
            throw new IndexOutOfBoundsException("Truncated syntax cache payload");
        }
    }
}
