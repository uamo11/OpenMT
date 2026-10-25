package l;

import java.util.regex.Pattern;

/* compiled from: 07LO */
/* renamed from: l.ۗܶ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3314 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10381 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f10382 = Pattern.compile(".*");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m10127(String str) {
        if (str.equals("*")) {
            return ".*";
        }
        String replace = str.replace(".", "\\.");
        if (!replace.endsWith("*")) {
            return replace;
        }
        return replace.substring(0, replace.length() - 1) + ".+";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern m10126(String str) {
        String m10127 = m10127(str);
        if (m10127 == ".*") {
            return f10382;
        }
        return Pattern.compile(m10127);
    }
}
