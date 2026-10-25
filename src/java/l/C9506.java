package l;

/* compiled from: M292 */
/* renamed from: l.ۢۢܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9506 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f28876;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f28877 = "";

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16560 f28878;

    public C9506(C16560 c16560) {
        this.f28878 = c16560;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24365(boolean z) {
        if (this.f28876 != z) {
            this.f28876 = z;
            this.f28877 = "";
            C16560 c16560 = this.f28878;
            if (!z) {
                c16560.m39002(c16560.m39028());
                c16560.f50891.m29927();
            }
            if (c16560.m39021()) {
                c16560.m39016().m24093();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24361() {
        if (this.f28876) {
            this.f28876 = false;
            this.f28877 = "";
            C16560 c16560 = this.f28878;
            if (c16560.m39021()) {
                c16560.m39016().m24088();
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m24367() {
        return this.f28876;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m24366() {
        return this.f28877;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24364(C2075 c2075) {
        this.f28876 = c2075.f6924;
        this.f28877 = c2075.f6925;
        C16560 c16560 = this.f28878;
        if (c16560.m39021()) {
            c16560.m39016().m24093();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24363(String str, boolean z) {
        this.f28876 = z;
        this.f28877 = str;
        C16560 c16560 = this.f28878;
        if (c16560.m39021()) {
            c16560.m39016().m24093();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24362(String str) {
        this.f28877 = str;
        C16560 c16560 = this.f28878;
        c16560.m39002(m24360(str, c16560.m39028()));
        c16560.f50891.m29927();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List m24360(java.lang.String r6, java.util.List r7) {
        /*
            boolean r0 = r6.isEmpty()
            l.᩻ۢܳ r1 = l.InterfaceC20795.f67331
            l.ۜۢܳ r2 = l.InterfaceC20795.f67330
            if (r0 == 0) goto Lb
            goto L6f
        Lb:
            java.lang.String r0 = "/"
            boolean r0 = r6.startsWith(r0)
            java.lang.String r3 = ""
            r4 = 66
            r5 = 1
            if (r0 == 0) goto L30
            int r0 = r6.length()
            if (r0 <= r5) goto L6f
            java.lang.String r6 = r6.substring(r5)     // Catch: java.lang.Exception -> L51
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r4)     // Catch: java.lang.Exception -> L51
            java.util.regex.Matcher r6 = r6.matcher(r3)     // Catch: java.lang.Exception -> L51
            l.ܿۢܳ r0 = new l.ܿۢܳ     // Catch: java.lang.Exception -> L51
            r0.<init>()     // Catch: java.lang.Exception -> L51
            goto L7a
        L30:
            java.lang.String r0 = "!/"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L53
            int r0 = r6.length()
            r5 = 2
            if (r0 <= r5) goto L6f
            java.lang.String r6 = r6.substring(r5)     // Catch: java.lang.Exception -> L51
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r4)     // Catch: java.lang.Exception -> L51
            java.util.regex.Matcher r6 = r6.matcher(r3)     // Catch: java.lang.Exception -> L51
            l.ۚۡܳ r0 = new l.ۚۡܳ     // Catch: java.lang.Exception -> L51
            r0.<init>(r6)     // Catch: java.lang.Exception -> L51
            goto L7a
        L51:
            r0 = r1
            goto L7a
        L53:
            java.lang.String r0 = "!"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L71
            int r0 = r6.length()
            if (r0 <= r5) goto L6f
            java.lang.String r6 = r6.substring(r5)
            java.lang.String r6 = r6.toLowerCase()
            l.ܳۢܳ r0 = new l.ܳۢܳ
            r0.<init>()
            goto L7a
        L6f:
            r0 = r2
            goto L7a
        L71:
            java.lang.String r6 = r6.toLowerCase()
            l.۠ۡܳ r0 = new l.۠ۡܳ
            r0.<init>(r6)
        L7a:
            if (r0 != r1) goto L82
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r6
        L82:
            if (r0 != r2) goto L85
            return r7
        L85:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r1 = r7.size()
            r6.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L92:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r7.next()
            l.ᩳۜܳ r1 = (l.InterfaceC17889) r1
            boolean r2 = r1.mo36981()
            if (r2 == 0) goto La5
            goto L92
        La5:
            boolean r2 = r0.mo15147(r1)
            if (r2 == 0) goto L92
            r6.add(r1)
            goto L92
        Laf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9506.m24360(java.lang.String, java.util.List):java.util.List");
    }
}
