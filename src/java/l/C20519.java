package l;

import com.umeng.commonsdk.debug.UMLog;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.util.ASN1Dump;

/* compiled from: IC6V */
/* renamed from: l.᩷֡ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20519 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66111 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f66116 = {"", " ", EnumC0121.f1143, "   ", ASN1Dump.TAB, UMLog.INDENT, "      ", "       ", EnumC0121.f1160, "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f66114 = Pattern.compile("^/((\\.{1,2}/)+)");

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f66113 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f66112 = Pattern.compile("[\\x00-\\x1f]*");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f66115 = new C6407();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47003(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46999(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder m47000 = m47000();
        C16990.m39822(m47000);
        Object obj2 = obj;
        while (true) {
            m47000.append(obj2);
            if (it.hasNext()) {
                Object next = it.next();
                m47000.append(str);
                obj2 = next;
            } else {
                return m46998(m47000);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46996(int i, int i2) {
        if (!(i >= 0)) {
            throw new C14167("width must be >= 0");
        }
        C16990.m39825(i2 >= -1);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        if (i < 21) {
            return f66116[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47004(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m47003(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47002(String str, StringBuilder sb, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (codePointAt != 8203 && codePointAt != 173) {
                sb.appendCodePoint(codePointAt);
                z2 = true;
                z3 = false;
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47005(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46997(String str, String str2) {
        Pattern pattern = f66112;
        String replaceAll = pattern.matcher(str).replaceAll("");
        String replaceAll2 = pattern.matcher(str2).replaceAll("");
        try {
            try {
                return m47001(new URL(replaceAll), replaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(replaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f66113.matcher(replaceAll2).find() ? replaceAll2 : "";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static URL m47001(URL url, String str) {
        String replaceAll = f66112.matcher(str).replaceAll("");
        if (replaceAll.startsWith("?")) {
            replaceAll = C16014.m37867(url.getPath(), replaceAll);
        }
        URL url2 = new URL(url, replaceAll);
        String replaceFirst = f66114.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            replaceFirst = C22870.m50967(replaceFirst, "#", url2.getRef());
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m47000() {
        Stack stack = (Stack) f66115.get();
        if (stack.empty()) {
            return new StringBuilder(8192);
        }
        return (StringBuilder) stack.pop();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46998(StringBuilder sb) {
        C16990.m39822(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack stack = (Stack) f66115.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }
}
