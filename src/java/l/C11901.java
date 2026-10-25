package l;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: R450 */
/* renamed from: l.ۨ᩵֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11901 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2609 f35544;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29027(AbstractC7667 abstractC7667, AbstractC5698 abstractC5698) {
        m29026(abstractC5698, abstractC7667, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29028(AbstractC7667 abstractC7667, AbstractC5698 abstractC5698) {
        m29026(abstractC5698, abstractC7667, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29026(AbstractC5698 abstractC5698, AbstractC7667 abstractC7667, boolean z) {
        C18837 c18837 = new C18837();
        Iterator it = this.f35544.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC6256 interfaceC6256 = (InterfaceC6256) weakReference.get();
            if (interfaceC6256 != null) {
                if (z) {
                    interfaceC6256.mo2490(abstractC7667, abstractC5698);
                } else {
                    interfaceC6256.mo2489(abstractC7667, abstractC5698);
                }
                c18837.m43511(weakReference);
            }
        }
        this.f35544 = c18837.m43517();
    }
}
