package l;

import java.lang.ref.ReferenceQueue;

/* compiled from: E3QI */
/* renamed from: l.᩻᩹ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23990 implements InterfaceC3529 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12491 f77775;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10333 f77776;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC3529 f77777;

    @Override // l.InterfaceC3529
    public final InterfaceC23927 getEntry() {
        return null;
    }

    @Override // l.InterfaceC3529
    /* renamed from: ֫ */
    public final InterfaceC3529 mo6743(ReferenceQueue referenceQueue, Object obj, InterfaceC23927 interfaceC23927) {
        return this;
    }

    @Override // l.InterfaceC3529
    /* renamed from: ֫ */
    public final boolean mo10724() {
        return true;
    }

    public C23990() {
        this(ConcurrentMapC14754.f45044);
    }

    public C23990(InterfaceC3529 interfaceC3529) {
        this.f77776 = C10333.m26125();
        this.f77775 = C12491.m30655();
        this.f77777 = interfaceC3529;
    }

    @Override // l.InterfaceC3529
    /* renamed from: ܽ */
    public final boolean mo10725() {
        return this.f77777.mo10725();
    }

    @Override // l.InterfaceC3529
    /* renamed from: ۧ */
    public final int mo6744() {
        return this.f77777.mo6744();
    }

    @Override // l.InterfaceC3529
    /* renamed from: ֫ */
    public final void mo10723(Object obj) {
        if (obj != null) {
            this.f77776.mo26126(obj);
        } else {
            this.f77777 = ConcurrentMapC14754.f45044;
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [l.ܳ᩹ܺ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceFutureC3277 m52831(Object obj, AbstractC19031 abstractC19031) {
        InterfaceFutureC3277 m21758;
        try {
            this.f77775.m30657();
            if (this.f77777.get() == null) {
                Object mo16148 = abstractC19031.mo16148(obj);
                return this.f77776.mo26126(mo16148) ? this.f77776 : C8216.m21757(mo16148);
            }
            abstractC19031.getClass();
            obj.getClass();
            return C8216.m21759(C8216.m21757(abstractC19031.mo16148(obj)), new InterfaceC16724() { // from class: l.ܳ᩹ܺ
                @Override // l.InterfaceC16724
                public final Object apply(Object obj2) {
                    C23990.this.f77776.mo26126(obj2);
                    return obj2;
                }
            }, C12449.m30605());
        } catch (Throwable th) {
            if (!this.f77776.mo26127(th)) {
                m21758 = C8216.m21758(th);
            } else {
                m21758 = this.f77776;
            }
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return m21758;
        }
    }

    @Override // l.InterfaceC3529
    /* renamed from: ᩳ */
    public final Object mo10726() {
        return C11744.m28740(this.f77776);
    }

    @Override // l.InterfaceC3529
    public final Object get() {
        return this.f77777.get();
    }
}
