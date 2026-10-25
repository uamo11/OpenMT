package l;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: S8SM */
/* renamed from: l.۟᩵ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7676 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f23716 = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m20561(C17714 c17714) {
        int m41485 = c17714.m41485();
        if (m20560(c17714)) {
            return;
        }
        c17714.m41484(m41485);
        throw C9080.m23440("Expected WEBVTT. Got " + c17714.m41474(StandardCharsets.UTF_8), (Throwable) null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m20560(C17714 c17714) {
        c17714.getClass();
        String m41474 = c17714.m41474(StandardCharsets.UTF_8);
        return m41474 != null && m41474.startsWith("WEBVTT");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m20559(String str) {
        String str2 = C3603.f11424;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() == 3) {
                j2 += Long.parseLong(trim);
            } else {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
        }
        return j2 * 1000;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m20557(String str) {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Matcher m20558(C17714 c17714) {
        String m41474;
        while (true) {
            String m414742 = c17714.m41474(StandardCharsets.UTF_8);
            if (m414742 == null) {
                return null;
            }
            if (f23716.matcher(m414742).matches()) {
                do {
                    m41474 = c17714.m41474(StandardCharsets.UTF_8);
                    if (m41474 != null) {
                    }
                } while (!m41474.isEmpty());
            } else {
                Matcher matcher = C23198.f74573.matcher(m414742);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
