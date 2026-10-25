package l;

import java.util.Collection;

/* compiled from: V4OW */
/* renamed from: l.ۛۜܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC5895 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f18101;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1662 f18102;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f18103;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f18104;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f18105;

    /* renamed from: ֫ */
    public abstract int mo13219(AbstractC2368 abstractC2368);

    /* renamed from: ۧ */
    public abstract void mo13224(C18241 c18241);

    /* renamed from: ܳ */
    public abstract void mo13225();

    /* renamed from: ᩳ */
    public abstract Collection mo6834();

    /* renamed from: ᩷ */
    public abstract int mo13226();

    public AbstractC5895(String str, C1662 c1662, int i) {
        if (c1662 == null) {
            throw new NullPointerException("file == null");
        }
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        this.f18105 = str;
        this.f18102 = c1662;
        this.f18101 = i;
        this.f18103 = -1;
        this.f18104 = false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1662 m16521() {
        return this.f18102;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m16516() {
        return this.f18101;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m16522() {
        int i = this.f18103;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("fileOffset not set");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m16520(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        }
        if (this.f18103 >= 0) {
            throw new RuntimeException("fileOffset already set");
        }
        int i2 = this.f18101 - 1;
        int i3 = (i + i2) & (~i2);
        this.f18103 = i3;
        return i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16518(C18241 c18241) {
        m16524();
        c18241.m42500(this.f18101);
        int m42510 = c18241.m42510();
        int i = this.f18103;
        if (i < 0) {
            this.f18103 = m42510;
        } else if (i != m42510) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + m42510 + ", but expected " + this.f18103);
        }
        if (c18241.m42506()) {
            String str = this.f18105;
            if (str != null) {
                c18241.m42501(0, "\n" + str + ":");
            } else if (m42510 != 0) {
                c18241.m42501(0, "\n");
            }
        }
        mo13224(c18241);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m16517(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        int i2 = this.f18103;
        if (i2 >= 0) {
            return i2 + i;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m16523() {
        m16519();
        mo13225();
        this.f18104 = true;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m16524() {
        if (!this.f18104) {
            throw new RuntimeException("not prepared");
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m16519() {
        if (this.f18104) {
            throw new RuntimeException("already prepared");
        }
    }
}
