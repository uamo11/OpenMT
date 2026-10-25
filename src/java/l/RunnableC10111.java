package l;

import java.util.concurrent.CancellationException;

/* compiled from: X68P */
/* renamed from: l.ۤۛᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC10111 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4342 f30447;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC3575 f30448;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30449;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21565 f30450;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f30451;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public FutureC3575 f30452;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC3179 f30453;

    public RunnableC10111(C12392 c12392, FutureC3575 futureC3575, C21565 c21565, C4342 c4342) {
        this.f30451 = c12392;
        this.f30448 = futureC3575;
        this.f30450 = c21565;
        this.f30447 = c4342;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21565 c21565;
        boolean z;
        C12392 c12392 = this.f30451;
        FutureC3575 futureC3575 = this.f30448;
        if (futureC3575.isDone()) {
            FutureC3575 futureC35752 = this.f30452;
            if (futureC35752 != null) {
                futureC35752.cancel(false);
            }
            this.f30452 = null;
            return;
        }
        C21565 c215652 = this.f30450;
        if (c215652 != null) {
            try {
                c21565 = c12392.f37222;
                if (c21565 == c215652) {
                    InterfaceC7785 interfaceC7785 = c12392.f37322;
                    C4342 c4342 = this.f30447;
                    if (interfaceC7785 == c4342) {
                        z = c12392.f37256;
                        if (!z) {
                            Throwable m30417 = c12392.m30417();
                            if (m30417 != null) {
                                throw new C13452(m30417);
                            }
                            if (this.f30453 != c12392.f37258 || this.f30449 != c4342.mo26548() || !c12392.m30399()) {
                                FutureC3575 futureC35753 = this.f30452;
                                if (futureC35753 != null) {
                                    futureC35753.cancel(false);
                                }
                                this.f30452 = null;
                            }
                            if (c12392.m30399() && c12392.f37258.m9757()) {
                                if (this.f30452 == null) {
                                    this.f30453 = c12392.f37258;
                                    this.f30449 = c4342.mo26548();
                                    this.f30452 = c12392.m30474((InterfaceC7785) c4342);
                                }
                                if (this.f30452.isDone()) {
                                    this.f30452.m10930();
                                    futureC3575.m10912((Object) null);
                                    return;
                                }
                            }
                            C4925.m14316(this, 10L);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                FutureC3575 futureC35754 = this.f30452;
                if (futureC35754 != null) {
                    futureC35754.cancel(false);
                }
                this.f30452 = null;
                futureC3575.m10914(th);
                return;
            }
        }
        throw new CancellationException("Session preparation is no longer active");
    }
}
