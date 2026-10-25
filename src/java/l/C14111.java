package l;

import java.lang.ref.ReferenceQueue;

/* compiled from: E3QI */
/* renamed from: l.ܰ᩹ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14111 extends C19052 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f42590;

    public C14111(int i, InterfaceC23927 interfaceC23927, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC23927);
        this.f42590 = i;
    }

    @Override // l.C19052, l.InterfaceC3529
    /* renamed from: ۧ */
    public final int mo6744() {
        return this.f42590;
    }

    @Override // l.C19052, l.InterfaceC3529
    /* renamed from: ֫ */
    public final InterfaceC3529 mo6743(ReferenceQueue referenceQueue, Object obj, InterfaceC23927 interfaceC23927) {
        return new C14111(this.f42590, interfaceC23927, obj, referenceQueue);
    }
}
