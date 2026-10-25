package l;

import java.io.File;
import java.util.regex.Pattern;

/* compiled from: K2RY */
/* renamed from: l.ۖۢ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2439 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7766 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char f7767;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final char f7768;

    static {
        Character.toString('.');
        char c = File.separatorChar;
        f7768 = c;
        char c2 = '\\';
        if (c != '/') {
            if (c != '\\') {
                throw new IllegalArgumentException(String.valueOf(c));
            }
            c2 = '/';
        }
        f7767 = c2;
        Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m7877(String str) {
        int i;
        if (str != null) {
            char c = f7768;
            if (c == '\\') {
                int lastIndexOf = str.lastIndexOf(c);
                int lastIndexOf2 = str.lastIndexOf(f7767);
                if (lastIndexOf == -1) {
                    i = lastIndexOf2 == -1 ? 0 : lastIndexOf2 + 1;
                } else {
                    if (lastIndexOf2 != -1) {
                        lastIndexOf = Math.max(lastIndexOf, lastIndexOf2);
                    }
                    i = lastIndexOf + 1;
                }
                if (str.indexOf(58, i) != -1) {
                    throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
                }
            }
            int lastIndexOf3 = str.lastIndexOf(46);
            if (Math.max(str.lastIndexOf(47), str.lastIndexOf(92)) <= lastIndexOf3) {
                return lastIndexOf3;
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7876(String str) {
        if (str == null) {
            return null;
        }
        if (str.indexOf(0) < 0) {
            return str.substring(Math.max(str.lastIndexOf(47), str.lastIndexOf(92)) + 1);
        }
        throw new IllegalArgumentException("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m7878(String str) {
        if (str == null) {
            return null;
        }
        if (str.indexOf(0) < 0) {
            int m7877 = m7877(str);
            return m7877 == -1 ? str : str.substring(0, m7877);
        }
        throw new IllegalArgumentException("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
    }
}
