package l;

import javax.crypto.SecretKey;

/* compiled from: Z9HI */
/* renamed from: l.ۘۧۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3895 implements InterfaceC20123 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f12465 = C11321.m27961(C3895.class);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12466 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2215 f12467;

    public C3895(C2215 c2215) {
        this.f12467 = c2215;
    }

    @Override // l.InterfaceC20123
    /* renamed from: ֫ */
    public final C16614 mo8479(C16614 c16614, SecretKey secretKey) {
        if (secretKey != null) {
            return new C2484(this, c16614, secretKey);
        }
        f12465.mo7100(((C23670) c16614.mo3028()).m52217(), "Not wrapping {} as signed, as no key is set.");
        return c16614;
    }
}
