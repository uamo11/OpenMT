package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: A924 */
/* renamed from: l.᩸᩻ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21911 extends AbstractC12382 {
    @Override // l.AbstractC12382
    /* renamed from: ֫ */
    public final C1093 mo19978(String str) {
        C11044 c11044;
        C17209 c17209;
        C9449 c9449 = new C9449();
        c11044 = C20500.f66073;
        c9449.m24279(c11044);
        c9449.m24282(str);
        C8743 m24274 = c9449.m24274();
        try {
            c17209 = C20500.f66074;
            C18621 execute = c17209.m40469(m24274).execute();
            AbstractC0275 m43170 = execute.m43170();
            String str2 = null;
            InputStream m1611 = m43170 != null ? m43170.m1611() : null;
            if (m1611 == null) {
                throw new IllegalStateException("Response does not contain body: ".concat(str));
            }
            String m43169 = execute.m43169("Content-Type");
            if (m43169 != null) {
                int indexOf = m43169.indexOf(59);
                str2 = indexOf > -1 ? m43169.substring(0, indexOf) : m43169;
            }
            return AbstractC8149.m21620(m1611, str2);
        } catch (Throwable th) {
            throw new IllegalStateException("Exception obtaining network resource: ".concat(str), th);
        }
    }

    @Override // l.AbstractC12382
    /* renamed from: ֫ */
    public final Collection mo19977() {
        return Arrays.asList(a.s, b.a);
    }
}
