package l;

import java.util.regex.Pattern;

/* compiled from: KBJN */
/* renamed from: l.᩻᩵ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23908 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f77299 = Pattern.compile("^/mnt/user/(\\d+)/emulated/(\\d+)");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C2727 f77300 = new C2727();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0260  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m52660(android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23908.m52660(android.net.Uri):java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52661(String str) {
        String m39859;
        if (!C16999.m39886() || str.indexOf("\u200bAndroid") < 0 || (m39859 = C16999.m39859(str)) == null || (!m39859.equals("\u200bAndroid") && !m39859.startsWith("\u200bAndroid/"))) {
            return str;
        }
        int length = str.length() - m39859.length();
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, length));
        sb.append("Android");
        return C20087.m46305(length + 8, str, sb);
    }
}
