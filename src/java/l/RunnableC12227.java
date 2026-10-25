package l;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;

/* compiled from: X68P */
/* renamed from: l.۫ۛᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC12227 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7785 f36466;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3179 f36467;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36468;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f36469;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f36470;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC3575 f36471;

    public RunnableC12227(C12392 c12392, FutureC3575 futureC3575, InterfaceC7785 interfaceC7785, AbstractC3179 abstractC3179, int i, long j) {
        this.f36470 = c12392;
        this.f36471 = futureC3575;
        this.f36466 = interfaceC7785;
        this.f36467 = abstractC3179;
        this.f36468 = i;
        this.f36469 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22270 c22270;
        int i;
        C12392 c12392 = this.f36470;
        C6870 c6870 = c12392.f37235;
        FutureC3575 futureC3575 = this.f36471;
        if (futureC3575.isDone()) {
            return;
        }
        try {
            InterfaceC7785 interfaceC7785 = c12392.f37322;
            InterfaceC7785 interfaceC77852 = this.f36466;
            if (interfaceC7785 == interfaceC77852) {
                AbstractC3179 abstractC3179 = c12392.f37258;
                AbstractC3179 abstractC31792 = this.f36467;
                if (abstractC3179 == abstractC31792 && interfaceC77852.mo26548() == this.f36468) {
                    if (c12392.isAttachedToWindow() && c12392.f37245.f73267 && c6870.m18575() && interfaceC77852.length() != 0) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        long j = this.f36469;
                        if (uptimeMillis < j) {
                            if (c12392.m30483() && (!abstractC31792.mo9770() || c12392.m30479(abstractC31792))) {
                                c22270 = c12392.f37244;
                                if (c22270 == null || c12392.m30479(abstractC31792)) {
                                    int max = Math.max(0, c12392.m30408());
                                    int max2 = Math.max(1, c12392.m30542());
                                    long mo9787 = abstractC31792.mo9787(max, max2);
                                    if (mo9787 >= 0) {
                                        int i2 = (int) (mo9787 >>> 32);
                                        int i3 = (int) mo9787;
                                        c6870.m18598(interfaceC77852, i2, i3);
                                        if (c6870.m18585(i2, i3)) {
                                            i = i3;
                                            long mo9778 = abstractC31792.mo9778(max, max2);
                                            if (mo9778 != 0) {
                                                c6870.m18590(interfaceC77852, (int) (mo9778 >>> 32), (int) mo9778);
                                            }
                                        } else {
                                            i = i3;
                                        }
                                        if (c6870.m18594(i2, i)) {
                                            futureC3575.m10912((Object) null);
                                            return;
                                        }
                                    }
                                }
                            }
                            C4925.m14316(this, Math.min(10L, Math.max(1L, j - SystemClock.uptimeMillis())));
                            return;
                        }
                    }
                    futureC3575.m10912((Object) null);
                    return;
                }
            }
            throw new CancellationException("Initial highlight preparation was superseded");
        } catch (Throwable th) {
            futureC3575.m10914(th);
        }
    }
}
