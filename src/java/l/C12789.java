package l;

import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.util.BitSet;

/* compiled from: N673 */
/* renamed from: l.۬֨ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C12789 {
    public static final BitSet a = new BitSet(256);
    public static final String b;

    static {
        String str;
        for (int i = 97; i <= 122; i++) {
            a.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            a.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            a.set(i3);
        }
        BitSet bitSet = a;
        bitSet.set(32);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        if (System.getSecurityManager() != null) {
            C9884 c9884 = new C9884();
            c9884.b = "file.encoding";
            str = (String) AccessController.doPrivileged(c9884);
        } else {
            str = System.getProperty("file.encoding");
        }
        b = str;
    }

    public static String encode(String str) {
        try {
            return encode(str, b);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String encode(String str, String str2) {
        if (str2 == null) {
            throw new NullPointerException("charsetName");
        }
        try {
            return encode(str, Charset.forName(str2));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str2);
        }
    }

    public static String encode(String str, Charset charset) {
        BitSet bitSet;
        int i;
        char charAt;
        C11003.requireNonNull(charset, "charset");
        StringBuilder sb = new StringBuilder(str.length());
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int i2 = 0;
        boolean z = false;
        while (i2 < str.length()) {
            char charAt2 = str.charAt(i2);
            if (a.get(charAt2)) {
                if (charAt2 == ' ') {
                    charAt2 = '+';
                    z = true;
                }
                sb.append(charAt2);
                i2++;
            } else {
                do {
                    charArrayWriter.write(charAt2);
                    if (charAt2 >= 55296 && charAt2 <= 56319 && (i = i2 + 1) < str.length() && (charAt = str.charAt(i)) >= 56320 && charAt <= 57343) {
                        charArrayWriter.write(charAt);
                        i2 = i;
                    }
                    i2++;
                    if (i2 >= str.length()) {
                        break;
                    }
                    bitSet = a;
                    charAt2 = str.charAt(i2);
                } while (!bitSet.get(charAt2));
                charArrayWriter.flush();
                byte[] bytes = new String(charArrayWriter.toCharArray()).getBytes(charset);
                for (int i3 = 0; i3 < bytes.length; i3++) {
                    sb.append('%');
                    char forDigit = Character.forDigit((bytes[i3] >> 4) & 15, 16);
                    if (Character.isLetter(forDigit)) {
                        forDigit = (char) (forDigit - ' ');
                    }
                    sb.append(forDigit);
                    char forDigit2 = Character.forDigit(bytes[i3] & 15, 16);
                    if (Character.isLetter(forDigit2)) {
                        forDigit2 = (char) (forDigit2 - ' ');
                    }
                    sb.append(forDigit2);
                }
                charArrayWriter.reset();
                z = true;
            }
        }
        return z ? sb.toString() : str;
    }
}
