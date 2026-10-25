package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* compiled from: MAUA */
/* renamed from: l.ᩳ֡ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17696 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f54158;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset forName = Charset.forName(a.D);
        f54158 = forName;
        forName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
