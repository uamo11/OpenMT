package l;

import android.net.Uri;
import com.alipay.sdk.m.n.b;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: Y739 */
/* renamed from: l.ۜܿܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6909 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18702(String str) {
        if (str != null) {
            int i = 0;
            if (str.indexOf(0) == -1 && str.indexOf(92) == -1) {
                ArrayDeque arrayDeque = new ArrayDeque();
                int length = str.length();
                while (i <= length) {
                    int indexOf = str.indexOf(47, i);
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    String substring = str.substring(i, indexOf);
                    if (!substring.isEmpty() && !substring.equals(".")) {
                        if (substring.equals("..")) {
                            if (arrayDeque.isEmpty()) {
                                return null;
                            }
                            arrayDeque.removeLast();
                        } else {
                            arrayDeque.addLast(substring);
                        }
                    }
                    if (indexOf == length) {
                        break;
                    }
                    i = indexOf + 1;
                }
                StringBuilder sb = new StringBuilder(str.length());
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (sb.length() != 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m18704(String str, String str2) {
        String m18702;
        if (str.startsWith("/") && str.endsWith("/") && str.indexOf(0) == -1 && str.indexOf(92) == -1 && (m18702 = m18702(str2)) != null && !m18702.isEmpty()) {
            return str.concat(m18702);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m18701(String str, String str2) {
        String m18702 = m18702(str2);
        if (m18702 == null || m18702.isEmpty()) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        Uri.Builder authority = new Uri.Builder().scheme(b.a).authority(str);
        int i = 0;
        while (i < m18702.length()) {
            int indexOf = m18702.indexOf(47, i);
            if (indexOf == -1) {
                indexOf = m18702.length();
            }
            authority.appendPath(m18702.substring(i, indexOf));
            i = indexOf + 1;
        }
        return authority.build();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18703(Uri uri, String str) {
        return uri != null && b.a.equalsIgnoreCase(uri.getScheme()) && str.equalsIgnoreCase(uri.getAuthority());
    }
}
