package l;

import java.util.HashMap;

/* compiled from: W7S0 */
/* renamed from: l.ۡۘ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8630 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f26352;

    public C8630(C15684 c15684) {
        c15684.f48346.getClass();
        this.f26352 = new HashMap();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22393(C9378 c9378) {
        return this.f26352.containsKey(c9378);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m22391(AbstractC5144 abstractC5144) {
        C9336 c9336 = (C9336) this.f26352.get(abstractC5144);
        InterfaceC5102 interfaceC5102 = c9336 == null ? null : c9336.f28314;
        if (interfaceC5102 == null) {
            return null;
        }
        return interfaceC5102.getText();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22392(AbstractC5144 abstractC5144, InterfaceC5102 interfaceC5102) {
        this.f26352.put(abstractC5144, new C9336(interfaceC5102));
    }
}
