package l;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: J71B */
/* renamed from: l.᩻ۢۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23611 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m52102() {
        C9449 c9449 = new C9449();
        c9449.m24282(C23986.m52821());
        C18621 execute = C4925.m14323().m40469(c9449.m24274()).execute();
        if (!execute.m43173()) {
            int m43177 = execute.m43177();
            execute.close();
            throw new IOException(C19370.m44628(m43177, "Boot hierarchy download failed with HTTP "));
        }
        AbstractC0275 m43170 = execute.m43170();
        if (m43170 != null) {
            return new C14438(m43170.m1611(), execute);
        }
        execute.close();
        throw new IOException("Boot hierarchy download body is null");
    }
}
