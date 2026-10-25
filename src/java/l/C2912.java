package l;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: N673 */
/* renamed from: l.ۗ֨ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2912 {
    public static final String a = C12789.b;

    public static boolean a(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        if ('a' > c || c > 'f') {
            return 'A' <= c && c <= 'F';
        }
        return true;
    }

    public static String decode(String str) {
        try {
            return decode(str, a);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String decode(String str, String str2) {
        if (str2.isEmpty()) {
            throw new UnsupportedEncodingException("URLDecoder: empty string enc parameter");
        }
        try {
            return decode(str, Charset.forName(str2));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        if (r4 >= r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        if (r6 == '%') goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        throw new java.lang.IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        r1.append(new java.lang.String(r3, 0, r5, r12));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String decode(java.lang.String r11, java.nio.charset.Charset r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2912.decode(java.lang.String, java.nio.charset.Charset):java.lang.String");
    }
}
