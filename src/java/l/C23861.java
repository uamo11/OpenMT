package l;

/* compiled from: UATT */
/* renamed from: l.᩻ᩳۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23861 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f77183;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence f77184;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52572(char c) {
        return c == '\n' || c == '\r' || c == 133 || c == 8232 || c == 8233;
    }

    public C23861(CharSequence charSequence) {
        this.f77184 = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (m52573(r9, "END") == false) goto L31;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m52574(int r8, boolean r9) {
        /*
            r7 = this;
            java.lang.CharSequence r0 = r7.f77184
            char r1 = r0.charAt(r8)
            int r2 = r0.length()
            r3 = 34
            r4 = 1
            if (r1 == r3) goto L93
            r3 = 39
            if (r1 != r3) goto L15
            goto L93
        L15:
            r3 = 47
            if (r1 != r3) goto L92
            int r1 = r8 + 1
            if (r1 >= r2) goto L92
            char r1 = r0.charAt(r1)
            if (r1 != r3) goto L71
            if (r9 == 0) goto L5f
            java.lang.String r9 = "// MARK_"
            boolean r9 = r7.m52573(r8, r9)
            if (r9 != 0) goto L2e
            goto L5f
        L2e:
            int r9 = r8 + 8
            java.lang.String r5 = "CLASS_"
            boolean r5 = r7.m52573(r9, r5)
            if (r5 != 0) goto L4c
            java.lang.String r5 = "FIELD_"
            boolean r5 = r7.m52573(r9, r5)
            if (r5 == 0) goto L41
            goto L4c
        L41:
            java.lang.String r5 = "METHOD_"
            boolean r9 = r7.m52573(r9, r5)
            if (r9 == 0) goto L5f
            int r9 = r8 + 15
            goto L4e
        L4c:
            int r9 = r8 + 14
        L4e:
            java.lang.String r5 = "START"
            boolean r5 = r7.m52573(r9, r5)
            if (r5 != 0) goto L71
            java.lang.String r5 = "END"
            boolean r9 = r7.m52573(r9, r5)
            if (r9 == 0) goto L5f
            goto L71
        L5f:
            int r8 = r8 + 2
        L61:
            if (r8 >= r2) goto L70
            char r9 = r0.charAt(r8)
            boolean r9 = m52572(r9)
            if (r9 != 0) goto L70
            int r8 = r8 + 1
            goto L61
        L70:
            return r8
        L71:
            r9 = 42
            if (r1 != r9) goto L92
            boolean r1 = r7.f77183
            if (r1 != 0) goto L92
            int r1 = r8 + 2
        L7b:
            int r5 = r1 + 1
            if (r5 >= r2) goto L90
            char r6 = r0.charAt(r1)
            if (r6 != r9) goto L8e
            char r6 = r0.charAt(r5)
            if (r6 != r3) goto L8e
            int r1 = r1 + 2
            return r1
        L8e:
            r1 = r5
            goto L7b
        L90:
            r7.f77183 = r4
        L92:
            return r8
        L93:
            int r8 = r8 + r4
            if (r8 >= r2) goto Lb9
            char r9 = r0.charAt(r8)
            if (r9 != r1) goto L9e
            int r8 = r8 + r4
            return r8
        L9e:
            boolean r3 = m52572(r9)
            if (r3 == 0) goto La5
            return r8
        La5:
            r3 = 92
            if (r9 != r3) goto L93
            int r9 = r8 + 1
            if (r9 >= r2) goto L93
            char r3 = r0.charAt(r9)
            boolean r3 = m52572(r3)
            if (r3 != 0) goto L93
            r8 = r9
            goto L93
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23861.m52574(int, boolean):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52573(int i, String str) {
        int length = str.length() + i;
        CharSequence charSequence = this.f77184;
        if (length <= charSequence.length()) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (charSequence.charAt(i + i2) == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }
}
