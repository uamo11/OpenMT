package l;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: W5CQ */
/* renamed from: l.ܰ᩷֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC14057 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23230 m33659(Charset charset) {
        return new C11942(charset);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23230 m33658(String str) {
        Charset defaultCharset;
        try {
            int i = C8789.f26773;
            defaultCharset = Charset.defaultCharset();
            if (str != null) {
                defaultCharset = Charset.forName(str);
            }
        } catch (UnsupportedCharsetException unused) {
            defaultCharset = Charset.defaultCharset();
        }
        return new C11942(defaultCharset);
    }
}
