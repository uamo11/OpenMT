package l;

import java.util.function.Supplier;

/* compiled from: Z5U8 */
/* renamed from: l.ܺۜ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15767 implements InterfaceC8457 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14163 f48607;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2363 f48608;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2363 f48609;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f48610;

    public C15767(C20002 c20002, C14163 c14163, C2363 c2363, C2363 c23632) {
        this.f48610 = c20002;
        this.f48607 = c14163;
        this.f48609 = c2363;
        this.f48608 = c23632;
    }

    @Override // l.InterfaceC8457
    /* renamed from: ֫ */
    public final void mo4895(C14163 c14163) {
        C20002 c20002 = this.f48610;
        C14163 c141632 = this.f48607;
        C12171.m29642(c141632 == c14163);
        try {
            C2363 c2363 = this.f48609;
            C16384 m34258 = c2363 != null ? new C14356(c20002, c141632).m34258(c2363) : null;
            C2363 c23632 = this.f48608;
            C16384 m342582 = c23632 != null ? new C14356(c20002, c141632).m34258(c23632) : null;
            c14163.mo33816().m49253(m34258);
            c14163.mo33816().m49252(m342582);
        } catch (Exception e) {
            throw new C20515(c14163, new Supplier() { // from class: l.ۡۜ۠
                @Override // java.util.function.Supplier
                public final Object get() {
                    C5931 c5931 = C15767.this.f48610.f64772;
                    String message = e.getMessage();
                    C11576 c11576 = C11886.f35440;
                    return c5931.m16617(new C11576("compiler", "exception.message", message));
                }
            }, c20002.f64759);
        }
    }
}
