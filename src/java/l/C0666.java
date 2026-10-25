package l;

/* compiled from: 37JR */
/* renamed from: l.֡᩷ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0666 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f2577;

    public C0666(String str, C20177 c20177) {
        this.f2577 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r14 = r4.substring(r12, r13);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m2713(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0666.m2713(java.lang.String):java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m2712(String str, int i, int i2, String str2) {
        String concat;
        char charAt;
        int m44264 = str.startsWith("MT") ? C19180.m44264(2, str) : 0;
        int i3 = m44264;
        while (i3 < str.length() && ((charAt = str.charAt(i3)) == '>' || charAt == '<' || charAt == '=' || charAt == '!')) {
            i3++;
        }
        int m442642 = C19180.m44264(i3, str);
        if (m44264 <= 2 || i3 <= m44264 || m442642 <= i3 || C19180.m44265(m442642, str) != str.length()) {
            int i4 = i + 1;
            if (str.isEmpty()) {
                concat = "Missing condition after #".concat(str2);
            } else {
                concat = "Invalid condition: ".concat(str);
            }
            throw new C3781(this.f2577, i4, i2, concat);
        }
        return C19180.m44260(str.substring(m44264, i3), str.substring(m442642));
    }
}
