package l;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: 74MB */
/* renamed from: l.ۖ۠ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2400 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f7657 = Charset.defaultCharset();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Charset f7658;

    static {
        Charset charset;
        Charset charset2 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        f7658 = charset;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charset2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset3 = f7658;
        if ((charset3 == null || !charset3.equals(f7657)) && charset2 != null) {
            charset2.equals(f7657);
        }
    }
}
