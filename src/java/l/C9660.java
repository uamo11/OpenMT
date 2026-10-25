package l;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: 84GP */
/* renamed from: l.ۢܶ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9660 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29255 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f29257 = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f29256 = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m24596(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f29256.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m24597(java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "Inconsistent headers ["
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r2 = "]"
            if (r1 != 0) goto L23
            long r3 = java.lang.Long.parseLong(r9)     // Catch: java.lang.NumberFormatException -> Lf
            goto L25
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected Content-Length ["
            r1.<init>(r3)
            r1.append(r9)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            l.C19956.m46033(r1)
        L23:
            r3 = -1
        L25:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L92
            java.util.regex.Pattern r1 = l.C9660.f29257
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r5 = r1.matches()
            if (r5 == 0) goto L92
            r5 = 2
            java.lang.String r5 = r1.group(r5)     // Catch: java.lang.NumberFormatException -> L7e
            r5.getClass()     // Catch: java.lang.NumberFormatException -> L7e
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L7e
            r7 = 1
            java.lang.String r1 = r1.group(r7)     // Catch: java.lang.NumberFormatException -> L7e
            r1.getClass()     // Catch: java.lang.NumberFormatException -> L7e
            long r7 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L7e
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L5b
            r3 = r5
            goto L92
        L5b:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L92
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L7e
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L7e
            r1.append(r9)     // Catch: java.lang.NumberFormatException -> L7e
            java.lang.String r9 = "] ["
            r1.append(r9)     // Catch: java.lang.NumberFormatException -> L7e
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L7e
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L7e
            java.lang.String r9 = r1.toString()     // Catch: java.lang.NumberFormatException -> L7e
            l.C19956.m46037(r9)     // Catch: java.lang.NumberFormatException -> L7e
            long r3 = java.lang.Math.max(r3, r5)     // Catch: java.lang.NumberFormatException -> L7e
            goto L92
        L7e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected Content-Range ["
            r9.<init>(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            l.C19956.m46033(r9)
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9660.m24597(java.lang.String, java.lang.String):long");
    }
}
