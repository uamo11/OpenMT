package l;

import java.io.IOException;

/* compiled from: T5RH */
/* renamed from: l.᩹ۢܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22207 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        C13034.f39033 = true;
        C20091 c20091 = new C20091(c16040);
        new C21502(c20091).start();
        long currentTimeMillis = System.currentTimeMillis();
        while (c20091.f65056) {
            Thread.sleep(200L);
            if (System.currentTimeMillis() - currentTimeMillis > 15000) {
                c20091.m46309();
                throw new IOException("Connection timed out");
            }
            if (!C13034.f39033) {
                c20091.m46309();
                return;
            }
        }
    }
}
