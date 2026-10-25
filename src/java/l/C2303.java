package l;

import java.util.Iterator;

/* compiled from: K6OY */
/* renamed from: l.ۖۙۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2303 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7566(CharSequence charSequence, C3463 c3463, C12635 c12635, EnumC13340 enumC13340, boolean z, C19012 c19012) {
        C8931 m24172;
        try {
            C20813.m47630();
            C23218 c23218 = new C23218(new C20813(charSequence));
            c23218.m43458();
            C15707 c15707 = new C15707(c23218);
            c15707.m6206();
            Iterator it = c15707.m6210().iterator();
            int i = 0;
            while (it.hasNext()) {
                InterfaceC0463 interfaceC0463 = (InterfaceC0463) it.next();
                C20813.m47630();
                int type = interfaceC0463.getType();
                if (type != 15 && type != 19 && type != 8 && type != 17) {
                    if (type == 16 || type == 20 || type == 18) {
                        i = Math.max(0, i - 1);
                    }
                }
                i++;
                if (i > 128) {
                    throw new IllegalArgumentException("Source nesting exceeds formatter limit");
                }
            }
            C9359 c9359 = new C9359(c15707);
            c9359.m43458();
            int i2 = C8653.f26410[enumC13340.ordinal()];
            if (i2 == 1) {
                m24172 = c9359.m24172();
            } else if (i2 == 2) {
                m24172 = c9359.m24170();
            } else {
                if (i2 != 3) {
                    throw new IncompatibleClassChangeError();
                }
                m24172 = c9359.m24171();
            }
            C11930 c11930 = new C11930(charSequence, c15707, m24172, c3463, c12635, z, c19012);
            c11930.m29115(enumC13340);
            c11930.m29114();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C6701 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }
}
