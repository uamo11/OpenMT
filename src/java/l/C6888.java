package l;

/* compiled from: P70I */
/* renamed from: l.ۜܽܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6888 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21282 = 1;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883[] f21283;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m18658() {
        int i = this.f21282;
        if (i <= 0) {
            throw new IllegalStateException("HexRange root lease is closed");
        }
        if (i == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f21282 = i + 1;
    }

    public C6888(InterfaceC18883[] interfaceC18883Arr) {
        this.f21283 = interfaceC18883Arr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18657() {
        InterfaceC18883[] interfaceC18883Arr;
        synchronized (this) {
            int i = this.f21282;
            if (i <= 0) {
                throw new IllegalStateException("HexRange root lease closed twice");
            }
            int i2 = i - 1;
            this.f21282 = i2;
            interfaceC18883Arr = i2 == 0 ? this.f21283 : null;
        }
        if (interfaceC18883Arr != null) {
            C16059.m37963(interfaceC18883Arr);
        }
    }
}
