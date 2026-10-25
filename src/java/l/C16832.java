package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: 16RW */
/* renamed from: l.ܽᩴᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16832 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f51672;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f51673;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12392 f51674;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22372 f51675;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51676;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11915 f51679;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f51681;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Handler f51677 = new Handler(Looper.getMainLooper());

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RunnableC7227 f51680 = new Runnable() { // from class: l.۟ۘᩳ
        @Override // java.lang.Runnable
        public final void run() {
            C16832.m39608(C16832.this);
        }
    };

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f51678 = -1;

    /* JADX WARN: Type inference failed for: r0v1, types: [l.۟ۘᩳ] */
    public C16832(C22372 c22372, C11915 c11915, int i) {
        this.f51675 = c22372;
        this.f51679 = c11915;
        this.f51674 = c22372.f72517;
        this.f51681 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39611() {
        this.f51677.postDelayed(this.f51680, 2000L);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39612() {
        this.f51673 = true;
        this.f51677.removeCallbacks(this.f51680);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39608(final C16832 c16832) {
        C12392 c12392 = c16832.f51674;
        C11915 c11915 = c16832.f51679;
        C22372 c22372 = c16832.f51675;
        if (c16832.f51673 || !c22372.m50230(c11915, c12392)) {
            c16832.m39612();
            return;
        }
        if (c16832.f51676 || !c12392.m30508()) {
            c16832.m39610();
            return;
        }
        try {
            C10130 c10130 = new C10130();
            C10130 c101302 = new C10130();
            c22372.f72504.m36688(c10130);
            c22372.f72504.m36681(c101302);
            c22372.f5606.putBoolean("changed", c22372.m50236(c11915.f35630.isChanged()));
            C13304 m32268 = C13304.m32268(c16832.f51674, c22372.f5606, c22372.m50231(), c10130.m25444(), c101302.m25444(), c16832.f51681, c16832.f51678, c16832.f51672);
            if (m32268 == null) {
                c16832.m39610();
                return;
            }
            final byte[] m32277 = m32268.m32277();
            final long m32272 = m32268.m32272();
            c16832.f51676 = true;
            c11915.f35622.m52633(m32268).m10910(new InterfaceC8017() { // from class: l.֫ᩴᩳ
                @Override // l.InterfaceC8017
                /* renamed from: ۧ */
                public final void mo4663(Object obj, Throwable th) {
                    r4.f51677.post(new Runnable() { // from class: l.ۧᩴᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16832.m39609(r1, r3, th, r5);
                        }
                    });
                }
            });
        } catch (C3427 unused) {
            c16832.m39610();
        } catch (Exception e) {
            c22372.f5603.m46502((Throwable) e);
            c16832.m39610();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39609(long j, C16832 c16832, Throwable th, byte[] bArr) {
        C11915 c11915 = c16832.f51679;
        C22372 c22372 = c16832.f51675;
        c16832.f51676 = false;
        if (th == null) {
            c16832.f51678 = j;
            c16832.f51672 = bArr;
        }
        if (c16832.f51673 || !c22372.m50230(c11915, c16832.f51674)) {
            return;
        }
        if (th instanceof C13452) {
            th = th.getCause();
        }
        if (th != null && !(th instanceof CancellationException)) {
            c22372.f5603.m46502(th);
        }
        if (c11915.f35622.m52635() != null) {
            c22372.f5603.m46502((Throwable) c11915.f35622.m52635());
        }
        c16832.m39610();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m39610() {
        if (this.f51673) {
            return;
        }
        this.f51677.postDelayed(this.f51680, 2000L);
    }
}
