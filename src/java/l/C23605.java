package l;

import java.io.IOException;

/* compiled from: Y8ET */
/* renamed from: l.᩻ۢ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23605 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52085(String str) {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C20094.m46315("Unable to parse int from string value: ", str));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m52086(String str) {
        try {
            return Long.parseLong(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C20094.m46315("Unable to parse long from string value: ", str));
        }
    }
}
