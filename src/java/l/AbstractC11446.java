package l;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: 52DI */
/* renamed from: l.ۨۘ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC11446 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f34218 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: ֫ */
    public abstract int mo16274(CharSequence charSequence, int i, StringWriter stringWriter);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28254(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int mo16274 = mo16274(charSequence, i, stringWriter);
                if (mo16274 == 0) {
                    char charAt = charSequence.charAt(i);
                    stringWriter.write(charAt);
                    int i2 = i + 1;
                    if (Character.isHighSurrogate(charAt) && i2 < length) {
                        char charAt2 = charSequence.charAt(i2);
                        if (Character.isLowSurrogate(charAt2)) {
                            stringWriter.write(charAt2);
                            i += 2;
                        }
                    }
                    i = i2;
                } else {
                    for (int i3 = 0; i3 < mo16274; i3++) {
                        i += Character.charCount(Character.codePointAt(charSequence, i));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
