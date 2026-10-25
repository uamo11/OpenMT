package l;

import java.io.InputStream;

/* compiled from: TAAW */
/* renamed from: l.ᩳ᩶ۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18275 extends AbstractC16863 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42607(C18621 c18621) {
        AbstractC16863.m39633(c18621);
        AbstractC0275 m43170 = c18621.m43170();
        if (m43170 != null) {
            try {
                InputStream m1611 = m43170.m1611();
                try {
                    do {
                    } while (m1611.read(new byte[1024]) >= 0);
                    m1611.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    m43170.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (m43170 != null) {
            m43170.close();
        }
    }
}
