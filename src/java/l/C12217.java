package l;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: U8XQ */
/* renamed from: l.۫ۛۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12217 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2545 f36449;

    public C12217(AbstractC2545 abstractC2545) {
        this.f36449 = abstractC2545;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22260 m29709(Map map) {
        C21555 c21555;
        C21555 c215552;
        String str = (String) map.get("style");
        if (!TextUtils.isEmpty(str)) {
            c21555 = null;
            c215552 = null;
            for (C3956 c3956 : this.f36449.mo8059(str)) {
                String m11997 = c3956.m11997();
                if ("width".equals(m11997)) {
                    c21555 = m29708(c3956.m11999());
                } else if ("height".equals(m11997)) {
                    c215552 = m29708(c3956.m11999());
                }
                if (c21555 != null && c215552 != null) {
                    break;
                }
            }
        } else {
            c21555 = null;
            c215552 = null;
        }
        if (c21555 != null && c215552 != null) {
            return new C22260(c21555, c215552);
        }
        if (c21555 == null) {
            c21555 = m29708((String) map.get("width"));
        }
        if (c215552 == null) {
            c215552 = m29708((String) map.get("height"));
        }
        if (c21555 == null && c215552 == null) {
            return null;
        }
        return new C22260(c21555, c215552);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r4 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r5 = java.lang.Float.parseFloat(r6.substring(0, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r3 != r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return new l.C21555(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        r6 = r6.substring(r4, r0);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C21555 m29708(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            goto L38
        L8:
            int r0 = r6.length()
            int r2 = r0 + (-1)
            r3 = r2
        Lf:
            r4 = -1
            if (r3 <= r4) goto L38
            char r4 = r6.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 == 0) goto L35
            int r4 = r3 + 1
            r5 = 0
            java.lang.String r5 = r6.substring(r5, r4)     // Catch: java.lang.NumberFormatException -> L38
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L38
            if (r3 != r2) goto L2b
            r6 = r1
            goto L2f
        L2b:
            java.lang.String r6 = r6.substring(r4, r0)     // Catch: java.lang.NumberFormatException -> L38
        L2f:
            l.᩸ۨۘ r0 = new l.᩸ۨۘ     // Catch: java.lang.NumberFormatException -> L38
            r0.<init>(r6, r5)     // Catch: java.lang.NumberFormatException -> L38
            return r0
        L35:
            int r3 = r3 + (-1)
            goto Lf
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12217.m29708(java.lang.String):l.᩸ۨۘ");
    }
}
