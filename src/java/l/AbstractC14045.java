package l;

/* compiled from: Z6OG */
/* renamed from: l.ܰ᩶ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC14045 extends AbstractC23747 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33654(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f';
    }

    @Override // l.AbstractC23747, l.InterfaceC1169
    public final InterfaceC0463 nextToken() {
        C20813.m47630();
        return super.nextToken();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        r0.append(r8.charAt(r4));
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m33655(java.lang.String r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8.length()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r8.length()
            if (r1 >= r2) goto L9e
            char r2 = r8.charAt(r1)
            r3 = 92
            if (r2 != r3) goto L97
            int r3 = r1 + 1
            int r4 = r8.length()
            if (r3 != r4) goto L22
            goto L97
        L22:
            r2 = 0
            r3 = 0
        L24:
            int r4 = r1 + 1
            int r5 = r8.length()
            if (r4 >= r5) goto L4b
            r5 = 6
            if (r2 >= r5) goto L4b
            char r5 = r8.charAt(r4)
            r6 = 16
            int r5 = java.lang.Character.digit(r5, r6)
            if (r5 < 0) goto L4b
            char r6 = r8.charAt(r4)
            r7 = 127(0x7f, float:1.78E-43)
            if (r6 <= r7) goto L44
            goto L4b
        L44:
            int r3 = r3 * 16
            int r3 = r3 + r5
            int r2 = r2 + 1
            r1 = r4
            goto L24
        L4b:
            if (r2 != 0) goto L55
            char r1 = r8.charAt(r4)
            r0.append(r1)
            goto L95
        L55:
            if (r3 == 0) goto L66
            r2 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 > r2) goto L66
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r2) goto L69
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r3 > r2) goto L69
        L66:
            r3 = 65533(0xfffd, float:9.1831E-41)
        L69:
            r0.appendCodePoint(r3)
            int r2 = r8.length()
            if (r4 >= r2) goto L9a
            char r2 = r8.charAt(r4)
            boolean r2 = m33654(r2)
            if (r2 == 0) goto L9a
            char r2 = r8.charAt(r4)
            r3 = 13
            if (r2 != r3) goto L95
            int r1 = r1 + 2
            int r2 = r8.length()
            if (r1 >= r2) goto L95
            char r2 = r8.charAt(r1)
            r3 = 10
            if (r2 != r3) goto L95
            goto L9a
        L95:
            r1 = r4
            goto L9a
        L97:
            r0.append(r2)
        L9a:
            int r1 = r1 + 1
            goto La
        L9e:
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC14045.m33655(java.lang.String):java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33653(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                charAt = (char) (charAt + ' ');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
