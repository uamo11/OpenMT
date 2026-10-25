package l;

import java.util.Iterator;

/* compiled from: E1FH */
/* renamed from: l.֨ܳܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1182 implements InterfaceC6121 {
    @Override // l.InterfaceC6121
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3995(C18906 c18906, C10355 c10355, C19220 c19220) {
        String m44350;
        char c;
        int i;
        c18906.m43647(true);
        m44350 = c19220.m44350();
        m44350.getClass();
        c = 0;
        switch (m44350) {
            case "string-array":
                break;
            case "array":
                c = 2;
                break;
            case "integer-array":
                c = 1;
                break;
            default:
                throw new C1580(C4860.m14172("Unknown tag: <", m44350, ">"), c19220);
        }
        Iterator m44337 = C19220.m44337(c19220);
        int i2 = 16777217;
        while (m44337.hasNext()) {
            C19220 c192202 = (C19220) m44337.next();
            if (c != 2 && c192202.m44346()) {
                String m3219 = c192202.m44347().m3219();
                if (m3219.startsWith("@")) {
                    i = i2 + 1;
                    C11766.m28796(c18906, c192202, c10355, true).m13997(i2);
                } else if (m3219.startsWith("?")) {
                    i = i2 + 1;
                    C11766.m28795(c18906, c10355, c192202).m13997(i2);
                }
                i2 = i;
            }
            if (c == 0) {
                i = i2 + 1;
                C11766.m28800(c18906, c10355, c192202).m13997(i2);
            } else if (c == 1) {
                i = i2 + 1;
                C11766.m28806(c18906, c10355, c192202).m13997(i2);
            } else {
                i = i2 + 1;
                C4710.m13804(c18906, c10355, c192202).m13997(i2);
            }
            i2 = i;
        }
    }
}
