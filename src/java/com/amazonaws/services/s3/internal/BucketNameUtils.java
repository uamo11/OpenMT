package com.amazonaws.services.s3.internal;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public enum BucketNameUtils {
    ;


    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f474 = 3;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int f475 = 63;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f477 = Pattern.compile("(\\d+\\.){3}\\d+");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m462(String str) {
        m459(str, true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m461(String str) {
        return m459(str, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m458(String str) {
        return m461(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m459(String str, boolean z) {
        if (str == null) {
            return m460(z, "Bucket name cannot be null");
        }
        if (str.length() < 3 || str.length() > 63) {
            return m460(z, "Bucket name should be between 3 and 63 characters long");
        }
        if (f477.matcher(str).matches()) {
            return m460(z, "Bucket name must not be formatted as an IP Address");
        }
        int i = 0;
        char c = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                return m460(z, "Bucket name should not contain uppercase characters");
            }
            if (charAt == ' ' || charAt == '\t' || charAt == '\r' || charAt == '\n') {
                return m460(z, "Bucket name should not contain white space");
            }
            if (charAt == '.') {
                if (c == 0) {
                    return m460(z, "Bucket name should not begin with a period");
                }
                if (c == '.') {
                    return m460(z, "Bucket name should not contain two adjacent periods");
                }
                if (c == '-') {
                    return m460(z, "Bucket name should not contain dashes next to periods");
                }
            } else if (charAt == '-') {
                if (c == '.') {
                    return m460(z, "Bucket name should not contain dashes next to periods");
                }
                if (c == 0) {
                    return m460(z, "Bucket name should not begin with a '-'");
                }
            } else if (charAt < '0' || ((charAt > '9' && charAt < 'a') || charAt > 'z')) {
                return m460(z, "Bucket name should not contain '" + charAt + "'");
            }
            i++;
            c = charAt;
        }
        if (c == '.' || c == '-') {
            return m460(z, "Bucket name should not end with '-' or '.'");
        }
        return !str.contains(".");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m460(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
        return false;
    }
}
