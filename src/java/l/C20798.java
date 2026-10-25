package l;

/* compiled from: K6VB */
/* renamed from: l.᩷ۢܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20798 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23244 f67332;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f67333;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23097 f67334;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f67335;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20445 f67336;

    public C20798(C23097 c23097, InterfaceC20445 interfaceC20445, int i, int i2, int i3) {
        C11003.requireNonNull(c23097);
        this.f67334 = c23097;
        C11003.requireNonNull(interfaceC20445);
        this.f67336 = interfaceC20445;
        this.f67333 = i;
        this.f67335 = i2;
        this.f67332 = new C23244(i2, i3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47593() {
        InterfaceC20445 interfaceC20445 = this.f67336;
        try {
            int mo26548 = interfaceC20445.mo26548();
            int i = this.f67333;
            if (mo26548 == i && interfaceC20445.length() == this.f67335) {
                return interfaceC20445.mo26548() == i;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
