package l;

/* compiled from: T30P */
/* renamed from: l.ᩳ۬, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18062 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f56275 = new ThreadLocal();

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r6 >= r7) goto L24;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m42132(android.text.TextPaint r9, java.lang.String r10) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r9 = l.C16650.m39174(r9, r10)
            return r9
        Lb:
            int r0 = r10.length()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L1e
            char r3 = r10.charAt(r2)
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 == 0) goto L1e
            goto L63
        L1e:
            java.lang.String r3 = "\udfffd"
            float r4 = r9.measureText(r3)
            java.lang.String r5 = "m"
            float r5 = r9.measureText(r5)
            float r6 = r9.measureText(r10)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 != 0) goto L34
            goto L5e
        L34:
            int r8 = r10.length()
            int r8 = r10.codePointCount(r2, r8)
            if (r8 <= r1) goto L5f
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r8
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L47
            goto L5e
        L47:
            r5 = 0
        L48:
            if (r5 >= r0) goto L5a
            int r8 = r10.codePointAt(r5)
            int r8 = java.lang.Character.charCount(r8)
            int r8 = r8 + r5
            float r5 = r9.measureText(r10, r5, r8)
            float r7 = r7 + r5
            r5 = r8
            goto L48
        L5a:
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 < 0) goto L5f
        L5e:
            return r2
        L5f:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L64
        L63:
            return r1
        L64:
            java.lang.ThreadLocal r4 = l.C18062.f56275
            java.lang.Object r5 = r4.get()
            l.ۤۤ r5 = (l.C10220) r5
            if (r5 != 0) goto L81
            l.ۤۤ r5 = new l.ۤۤ
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r5.<init>(r6, r7)
            r4.set(r5)
            goto L8f
        L81:
            java.lang.Object r4 = r5.f30697
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
            java.lang.Object r4 = r5.f30698
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
        L8f:
            java.lang.Object r4 = r5.f30698
            java.lang.Object r5 = r5.f30697
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            r6 = 2
            r9.getTextBounds(r3, r2, r6, r5)
            r3 = r4
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            r9.getTextBounds(r10, r2, r0, r3)
            boolean r9 = r5.equals(r4)
            r9 = r9 ^ r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18062.m42132(android.text.TextPaint, java.lang.String):boolean");
    }
}
