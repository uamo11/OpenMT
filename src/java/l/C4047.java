package l;

/* compiled from: Y74I */
/* renamed from: l.ۘܺܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4047 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f12841;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f12844;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f12846;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f12847;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f12850;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f12851;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f12852;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f12855;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f12856;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2636 f12848 = new C2636();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2636 f12849 = new C2636();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2636 f12853 = new C2636();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C2636 f12845 = new C2636();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2636 f12843 = new C2636();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2636 f12842 = new C2636();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f12854 = "";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019 A[RETURN] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static char m12148(char r4, int r5) {
        /*
            r0 = 1
            r1 = 46
            r2 = 47
            if (r5 != r0) goto La
            if (r4 != r2) goto L24
            goto L19
        La:
            r0 = 2
            if (r5 != r0) goto L10
            if (r4 != r1) goto L24
            goto L23
        L10:
            r0 = 3
            r3 = 36
            if (r5 != r0) goto L1a
            if (r4 == r2) goto L19
            if (r4 != r3) goto L24
        L19:
            return r1
        L1a:
            r0 = 4
            if (r5 != r0) goto L24
            if (r4 == r1) goto L23
            if (r4 == r2) goto L23
            if (r4 != r3) goto L24
        L23:
            return r2
        L24:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4047.m12148(char, int):char");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m12163(String str) {
        if (str == null) {
            str = "";
        }
        m12146(str, 0, str.length(), false);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m12161(String str) {
        if (str == null || str.length() < 2 || str.charAt(0) != 'L' || C7416.m19937(1, str) != ';') {
            m12163("");
            return false;
        }
        m12146(str, 1, str.length() - 1, true);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m12149() {
        if (this.f12855) {
            return this.f12854;
        }
        String str = this.f12854;
        int i = this.f12851;
        int i2 = this.f12847;
        C2636 c2636 = this.f12848;
        c2636.m8294(i, i2, str);
        return c2636;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CharSequence m12152() {
        if (!this.f12855 && !this.f12841) {
            return this.f12854;
        }
        String str = this.f12854;
        int i = this.f12851;
        int i2 = this.f12847;
        C2636 c2636 = this.f12853;
        c2636.m8293(i, i2, 2, str);
        return c2636;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final CharSequence m12151() {
        String str = this.f12854;
        int i = this.f12851;
        int i2 = this.f12847;
        C2636 c2636 = this.f12849;
        c2636.m8293(i, i2, 1, str);
        return c2636;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CharSequence m12165() {
        String str = this.f12854;
        int i = this.f12851;
        int i2 = this.f12847;
        C2636 c2636 = this.f12845;
        c2636.m8293(i, i2, 3, str);
        return c2636;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final CharSequence m12153() {
        String str = this.f12854;
        int i = this.f12851 + this.f12852;
        int i2 = this.f12847;
        C2636 c2636 = this.f12843;
        c2636.m8293(i, i2, 1, str);
        return c2636;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence m12164() {
        String str = this.f12854;
        int i = this.f12851 + this.f12852;
        int i2 = this.f12847;
        C2636 c2636 = this.f12842;
        c2636.m8293(i, i2, 3, str);
        return c2636;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m12154() {
        if (this.f12846 == null) {
            this.f12846 = m12149().toString();
        }
        return this.f12846;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12150(String str) {
        char charAt;
        int i = this.f12850 + 2;
        if (str.length() == i) {
            int i2 = 0;
            while (i2 < i) {
                if (i2 == 0) {
                    charAt = 'L';
                } else {
                    charAt = i2 == this.f12850 + 1 ? ';' : this.f12854.charAt((this.f12851 + i2) - 1);
                }
                if (charAt == str.charAt(i2)) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m12155(String str) {
        char charAt;
        int i = this.f12850;
        if (1 <= i + 2 && str.length() <= i + 1) {
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = 1 + i2;
                if (i3 == 0) {
                    charAt = 'L';
                } else {
                    charAt = i3 == this.f12850 + 1 ? ';' : this.f12854.charAt((this.f12851 + i3) - 1);
                }
                if (charAt == str.charAt(i2)) {
                    i2 = i3;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m12157(String str) {
        return m12147(2, str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m12159(String str) {
        return m12147(4, str);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m12156() {
        return this.f12844;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m12160() {
        return this.f12856;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m12162() {
        return this.f12852;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m12158() {
        return this.f12850;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12146(String str, int i, int i2, boolean z) {
        this.f12854 = str;
        this.f12855 = z;
        this.f12851 = i;
        this.f12847 = i2;
        this.f12850 = i2 - i;
        this.f12846 = z ? str : null;
        this.f12841 = false;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = i; i5 < i2; i5++) {
            char charAt = str.charAt(i5);
            int i6 = i5 - i;
            if (charAt == '.') {
                this.f12841 = true;
            }
            if (charAt == '/' || charAt == '.') {
                i3 = i6;
            }
            if (charAt == '/') {
                i4 = i6;
            }
        }
        this.f12852 = i3 + 1;
        this.f12844 = i4 >= 0 ? i4 + 2 : 0;
        this.f12856 = this.f12850 + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m12147(int i, String str) {
        if (str.length() <= this.f12850) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (m12148(this.f12854.charAt(this.f12851 + i2), i) == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }
}
