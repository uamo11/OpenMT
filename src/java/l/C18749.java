package l;

/* compiled from: H4NZ */
/* renamed from: l.ᩴ۫֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18749 implements InterfaceC16724 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1109 f59251;

    public C18749(C1109 c1109) {
        this.f59251 = c1109;
    }

    @Override // l.InterfaceC16724
    public final Object apply(Object obj) {
        boolean z;
        C15925 c15925 = (C15925) obj;
        z = this.f59251.f4043;
        if (z) {
            throw new IllegalStateException("This iterator was invalidated by a change to this MutableMethodImplementation.");
        }
        return c15925.m37702();
    }
}
