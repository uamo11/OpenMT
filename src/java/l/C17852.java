package l;

import java.io.IOException;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: 1B3K */
/* renamed from: l.ᩳۚᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17852 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f54529;

    static {
        AbstractC15440 m36526 = C16293.f50117.m36526(TextBundle.TEXT_ENTRY);
        f54529 = m36526;
        if (m36526.mo23120() && !m36526.mo23113()) {
            m36526.mo23552();
        }
        try {
            m36526.m36508();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41819() {
        return f54529;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41821() {
        return f54529.m36526("current");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41823() {
        return f54529.m36526("list");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41822(String str) {
        return f54529.m36526(str + ".dat");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41824(String str) {
        return f54529.m36526(str.concat(".tat"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m41820(String str) {
        return f54529.m36526(str.concat(".lit"));
    }
}
