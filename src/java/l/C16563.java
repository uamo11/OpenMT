package l;

/* compiled from: N6ZQ */
/* renamed from: l.ܽۢܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16563 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14986 f50912;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50916;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f50917;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50918;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f50919;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f50920;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f50921;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17975 f50922;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f50913 = 1;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f50915 = -1;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f50914 = true;

    public C16563(C17975 c17975, C14986 c14986, int i, int i2, boolean z) {
        int i3;
        int i4;
        this.f50922 = c17975;
        C11003.requireNonNull(c14986, "changes");
        this.f50912 = c14986;
        this.f50917 = i;
        this.f50919 = i2;
        this.f50921 = z;
        int m35507 = c14986.m35507();
        i3 = c17975.f56071;
        if (m35507 != i3 || i < 0 || i > c14986.m35507() || i2 < 0 || i2 > c14986.m35509()) {
            throw new IllegalArgumentException("Syntax context reuse boundaries differ");
        }
        if (z) {
            i4 = c17975.f56069;
            this.f50918 = i4 - 1;
            this.f50920 = true;
            return;
        }
        this.f50918 = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r6[r16.f50918] > r3) goto L23;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m39069(l.C14446 r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16563.m39069(l.ܳۢܿ):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39068() {
        return this.f50916;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m39070() {
        return this.f50914;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39067(int i) {
        int i2;
        if (!this.f50921 || !this.f50916 || !this.f50914 || this.f50915 < 0 || i < this.f50913) {
            return -1;
        }
        i2 = this.f50922.f56069;
        if (i > i2) {
            return -1;
        }
        return (this.f50915 + i) - this.f50913;
    }
}
