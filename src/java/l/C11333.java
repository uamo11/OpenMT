package l;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: C1FD */
/* renamed from: l.ۧ᩻ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11333 implements InterfaceC6121 {
    @Override // l.InterfaceC6121
    /* renamed from: ֫ */
    public final void mo3995(C18906 c18906, C10355 c10355, C19220 c19220) {
        c18906.m43647(true);
        Iterator m44338 = C19220.m44338(c19220, "item");
        while (m44338.hasNext()) {
            C19220 c192202 = (C19220) m44338.next();
            C18514 m44348 = c192202.m44348("quantity");
            String m43026 = m44348.m43026();
            int indexOf = Arrays.asList(InterfaceC1454.f5200).indexOf(m43026);
            if (indexOf == -1) {
                throw new C1580(C20094.m46315("Unknown quantity: ", m43026), m44348);
            }
            int i = indexOf + 16777220;
            if (c192202.m44346()) {
                String m3219 = c192202.m44347().m3219();
                if (m3219.startsWith("@")) {
                    C11766.m28796(c18906, c192202, c10355, true).m13997(i);
                } else if (m3219.startsWith("?")) {
                    C11766.m28795(c18906, c10355, c192202).m13997(i);
                }
            }
            C11766.m28800(c18906, c10355, c192202).m13997(i);
        }
    }
}
