package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: J6YG */
/* renamed from: l.۫ۡۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12301 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29843(C7383 c7383, String str, String str2, boolean z) {
        if (str == null || str.isEmpty()) {
            if (!z || str == null) {
                throw m29844("FILE_EMPTY_PATH_NOT_ALLOWED", "Path must not be empty.", str2, str);
            }
            return c7383.f22726;
        }
        m29848(str, str2);
        boolean z2 = str.charAt(0) == '/';
        try {
            String m29847 = m29847(z2 ? str : C23202.m51498(new StringBuilder(), c7383.f22726, "/", str), str2);
            if (z2 || m29846(m29847, c7383.f22726)) {
                return m29847;
            }
            throw m29844("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        } catch (C3059 e) {
            if (z2 || !"FILE_INVALID_PATH".equals(e.f9610)) {
                throw e;
            }
            throw m29844("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m29847(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                m29848(str, str2);
                ArrayDeque arrayDeque = new ArrayDeque();
                for (String str3 : str.split("/", -1)) {
                    if (!str3.isEmpty() && !".".equals(str3)) {
                        if ("..".equals(str3)) {
                            if (arrayDeque.isEmpty()) {
                                throw m29844("FILE_INVALID_PATH", "Path escapes the filesystem root.", str2, str);
                            }
                            arrayDeque.removeLast();
                        } else {
                            arrayDeque.addLast(str3);
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    sb.append('/');
                    sb.append(str4);
                }
                return C16999.m39885(sb.length() != 0 ? sb.toString() : "/");
            }
        }
        throw m29844("FILE_PATH_NOT_ABSOLUTE", "Path must be absolute.", str2, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29846(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if ("/".equals(str2)) {
            return str.startsWith("/");
        }
        return str.startsWith(str2 + "/");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29845(String str) {
        String m39859 = C16999.m39859(str);
        if (m39859 == null) {
            return false;
        }
        return m39859.equalsIgnoreCase("Android/data") || m39859.regionMatches(true, 0, "Android/data/", 0, 13);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m29848(String str, String str2) {
        if (str.indexOf(0) >= 0 || str.indexOf(92) >= 0) {
            throw m29844("FILE_INVALID_PATH", "Path contains an unsupported form.", str2, str);
        }
        int indexOf = str.indexOf(58);
        if (indexOf <= 0) {
            return;
        }
        for (int i = 0; i < indexOf; i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    return;
                }
            } else if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '+' && charAt != '-' && charAt != '.'))) {
                return;
            }
        }
        throw m29844("FILE_URI_UNSUPPORTED", "URI paths are not supported.", str2, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m29844(String str, String str2, String str3, String str4) {
        return C3059.m9369(str, str2, "fatal", null, JSON.object().add("argument", str3).add(MotionUtils.EASING_TYPE_PATH, str4 == null ? JSON.NULL : JSON.value(str4)));
    }
}
