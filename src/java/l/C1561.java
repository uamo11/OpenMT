package l;

import java.io.UncheckedIOException;

/* compiled from: C6RP */
/* renamed from: l.֫ۗᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1561 implements AutoCloseable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21605 f5514;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f5515;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5649 f5516;

    public C1561(C21605 c21605, C21605 c216052) {
        this.f5514 = c21605;
        this.f5516 = new C5649(c21605, c216052);
    }

    public C1561(C21605 c21605, C21605 c216052, int i) {
        this.f5514 = c21605;
        this.f5516 = C5649.m15931(c21605, c216052);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15007 m5338(C15007 c15007) {
        if (this.f5515) {
            throw new IllegalStateException("Recovery graph copy is closed");
        }
        C12704 c12704 = c15007.f45762;
        if (c12704.m32420().f35930 != this.f5514) {
            throw new IllegalArgumentException("Snapshot belongs to another recovery generation");
        }
        try {
            C11999 m15935 = this.f5516.m15935(c12704.m32420());
            C2309 m5336 = m5336(c15007.f45765);
            C12704 c127042 = new C12704(m15935, c12704.m30979());
            try {
                return new C15007(c127042, c15007.f45763, m5336, c15007.f45766, c15007.f45764);
            } catch (Error | RuntimeException e) {
                c127042.close();
                throw e;
            }
        } catch (UncheckedIOException e2) {
            throw e2.getCause();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5339(Runnable runnable) {
        this.f5516.m15938(runnable);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2309 m5336(C2309 c2309) {
        if (c2309 == null) {
            return null;
        }
        C5649 c5649 = this.f5516;
        C2309 c23092 = (C2309) c5649.m15934(c2309);
        if (c23092 != null) {
            return c23092;
        }
        c5649.m15936();
        C9611 c9611 = c2309.f7441;
        C2309 c23093 = new C2309(new C9611(new C15713(m5337(c9611.f29156.f48465, true)), new C15713(m5337(c9611.f29155.f48465, true)), c9611.f29154, c9611.f29153), c2309.f7443, c2309.f7440, c2309.f7444, c2309.f7442);
        c5649.m15937(c2309, c23093);
        return c23093;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9365 m5337(C9365 c9365, boolean z) {
        Object obj;
        C9365 c93652;
        if (c9365 == null) {
            return null;
        }
        C5649 c5649 = this.f5516;
        C9365 c93653 = (C9365) c5649.m15934(c9365);
        if (c93653 != null) {
            return c93653;
        }
        c5649.m15936();
        Object obj2 = c9365.f28439;
        if (obj2 == null) {
            c93652 = new C9365(m5337(c9365.f28441, z), m5337(c9365.f28440, z));
        } else {
            if (!z) {
                C23224 c23224 = (C23224) obj2;
                obj = (C23224) c5649.m15934(c23224);
                if (obj == null) {
                    c5649.m15936();
                    obj = new C23224(c23224.f74637, c23224.f74640, c23224.f74638, c23224.f74643, c5649.m15935(c23224.f74639), c5649.m15935(c23224.f74636));
                    c5649.m15937(c23224, obj);
                }
            } else {
                C8905 c8905 = (C8905) obj2;
                obj = (C8905) c5649.m15934(c8905);
                if (obj == null) {
                    c5649.m15936();
                    obj = new C8905(c8905.f27082, c8905.f27083, c8905.f27084, new C15713(m5337(c8905.f27081.f48465, false)));
                    c5649.m15937(c8905, obj);
                }
            }
            c93652 = new C9365(obj);
        }
        c5649.m15937(c9365, c93652);
        return c93652;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f5515) {
            return;
        }
        this.f5515 = true;
        this.f5516.close();
    }
}
