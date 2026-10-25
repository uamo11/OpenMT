package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: H4JG */
/* renamed from: l.۠ۙ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7955 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f24594;

    static {
        Charset forName = Charset.forName(a.D);
        C11233.m27803(forName, "forName(...)");
        f24594 = forName;
        C11233.m27803(Charset.forName("UTF-16"), "forName(...)");
        C11233.m27803(Charset.forName("UTF-16BE"), "forName(...)");
        C11233.m27803(Charset.forName("UTF-16LE"), "forName(...)");
        C11233.m27803(Charset.forName("US-ASCII"), "forName(...)");
        C11233.m27803(Charset.forName(LocalizedMessage.DEFAULT_ENCODING), "forName(...)");
    }
}
