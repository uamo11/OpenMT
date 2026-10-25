package l;

/* compiled from: 76V4 */
/* renamed from: l.ܶ۠ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15108 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f46203;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f46204;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f46205;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8054 f46206;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public CharSequence f46207;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f46208;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f46209;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C2410 f46210;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f46211;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f46212;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f46213;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f46214;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f46215;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35810(C2410 c2410, C8054 c8054, CharSequence charSequence, int i) {
        this.f46206 = c8054;
        this.f46207 = charSequence;
        this.f46203 = false;
        m35806(c2410, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35806(C2410 c2410, int i) {
        this.f46210 = c2410;
        this.f46214 = i;
        int i2 = this.f46206.f24844 - c2410.f7677;
        this.f46205 = i2;
        boolean z = false;
        this.f46204 = 0;
        this.f46211 = 0;
        this.f46208 = false;
        if (c2410.f7680 == 3 && (i2 - i) + 1 < 128) {
            z = true;
        }
        this.f46215 = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        if (m35808() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        m35805(r8.f46210.f7678, r8.f46214);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014b, code lost:
    
        if (m35808() != false) goto L122;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m35811() {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15108.m35811():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c7, code lost:
    
        r9.f46214++;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m35804(boolean r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15108.m35804(boolean):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m35803(char c, int i, int i2) {
        CharSequence charSequence = this.f46207;
        if (!(charSequence instanceof InterfaceC23008)) {
            while (i < i2) {
                if (this.f46207.charAt(i) == c) {
                    return i;
                }
                if (m35808()) {
                    return -2;
                }
                i++;
            }
            return -1;
        }
        this.f46206.m21413();
        int indexOf = ((InterfaceC23008) charSequence).indexOf(c, i, i2);
        boolean z = false;
        boolean z2 = (indexOf >= 0 ? indexOf - i : i2 - i) >= 1024;
        if (this.f46206.m21411() || (z2 && Thread.currentThread().isInterrupted())) {
            this.f46203 = true;
            this.f46206.f24842 = false;
            z = true;
        }
        if (z) {
            return -2;
        }
        return indexOf;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m35808() {
        if (!this.f46206.m21407()) {
            return false;
        }
        this.f46203 = true;
        this.f46206.f24842 = false;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35805(int i, int i2) {
        this.f46209 = this.f46214;
        this.f46212 = i2;
        this.f46213 = i;
        this.f46208 = true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35807() {
        this.f46206.f24842 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35809() {
        this.f46210 = null;
        this.f46206 = null;
        this.f46207 = null;
    }
}
