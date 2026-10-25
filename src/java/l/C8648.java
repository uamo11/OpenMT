package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: T91K */
/* renamed from: l.ۡۙۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8648 implements InterfaceC4869 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21349 f26397;

    public C8648(C21349 c21349) {
        this.f26397 = c21349;
    }

    @Override // l.InterfaceC4869
    /* renamed from: ֫ */
    public final void mo1321(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String m31335 = ((C12897) abstractC0197).m31335();
        interfaceC3458.builder().m41753(m31335);
        C21349 c21349 = this.f26397;
        arrayList = c21349.f68787;
        if (arrayList.isEmpty()) {
            return;
        }
        interfaceC3458.length();
        m31335.length();
        arrayList2 = c21349.f68787;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((InterfaceC14997) it.next()).m35537();
        }
    }
}
