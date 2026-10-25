package l;

/* compiled from: B7AT */
/* renamed from: l.ܽܿۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16781 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f51539;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f51540;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f51541;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f51542;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11459 f51543;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39515(char c) {
        return c == '.' || c == '/';
    }

    public C16781(C11459 c11459, String str, boolean z, String str2, boolean z2) {
        this.f51543 = c11459;
        this.f51542 = str;
        this.f51539 = z;
        this.f51541 = str2;
        this.f51540 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
    
        if (r10 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:
    
        r4 = r16;
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0148, code lost:
    
        if (m39515(r15) != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16781 m39514(java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16781.m39514(java.lang.String, java.lang.String, java.lang.String, boolean):l.ܽܿۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11138 m39517() {
        C12164 matcher = this.f51543.matcher((CharSequence) "");
        matcher.m29616setTimeoutMillis(500);
        return new C11138(this, matcher);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39516(C3059 c3059) {
        String str = c3059.f9610;
        return "REGEX_TIMEOUT".equals(str) || "REGEX_RESOURCE_LIMIT".equals(str);
    }
}
