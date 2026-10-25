package l;

import java.util.HashSet;

/* compiled from: P7KL */
/* renamed from: l.᩵ۘ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19214 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashSet m44333(String str) {
        int i;
        HashSet hashSet = new HashSet();
        if (!str.isEmpty()) {
            char m19937 = C7416.m19937(1, str);
            boolean z = m19937 == '\n' || m19937 == '\r';
            String[] split = str.split("\\R");
            int length = split.length;
            String str2 = length == 0 ? "" : split[length - 1];
            if (z) {
                i = 0;
            } else {
                i = m44334(str2);
                for (String str3 : split) {
                    int length2 = str3.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            int codePointAt = str3.codePointAt(i2);
                            if (!Character.isWhitespace(codePointAt)) {
                                i = Math.min(i, m44334(str3));
                                if (i == 0) {
                                    break;
                                }
                            } else {
                                i2 += Character.charCount(codePointAt);
                            }
                        }
                    }
                }
            }
            String substring = str2.substring(0, i);
            for (String str4 : split) {
                int length3 = str4.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    }
                    int codePointAt2 = str4.codePointAt(i3);
                    if (Character.isWhitespace(codePointAt2)) {
                        i3 += Character.charCount(codePointAt2);
                    } else if (!str4.startsWith(substring)) {
                        hashSet.add(EnumC18508.INCONSISTENT);
                    }
                }
                if (i < str4.length() && Character.isWhitespace(str4.charAt(str4.length() - 1))) {
                    hashSet.add(EnumC18508.TRAILING);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44334(String str) {
        int length = str.length();
        int length2 = str.length();
        int i = 0;
        while (i < length2) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                break;
            }
            i += Character.charCount(codePointAt);
        }
        return length - str.substring(i, length2).length();
    }
}
