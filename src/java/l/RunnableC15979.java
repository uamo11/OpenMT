package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Q5YY */
/* renamed from: l.ܺܰᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC15979 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f49313;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11747[] f49314;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f49315;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2575 f49316;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float[] f49317;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9584 f49318;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f49319;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f49320;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f49321;

    public RunnableC15979(C2575 c2575, int[] iArr, C11747[] c11747Arr) {
        AtomicInteger atomicInteger;
        this.f49316 = c2575;
        this.f49313 = c2575.f10015;
        this.f49315 = c2575.m9781();
        atomicInteger = c2575.f8140;
        this.f49321 = atomicInteger.get();
        this.f49319 = iArr;
        this.f49314 = c11747Arr;
        this.f49317 = new float[iArr.length];
        synchronized (c2575.f10037) {
            this.f49318 = c2575.f10037.m24488();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m37778() {
        AtomicInteger atomicInteger;
        if (!this.f49320 && !this.f49316.f10019 && this.f49313.mo26548() == this.f49315) {
            int i = this.f49321;
            atomicInteger = this.f49316.f8140;
            if (i == atomicInteger.get()) {
                return;
            }
        }
        throw new CancellationException();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        Runnable runnableC9631;
        final boolean z = false;
        try {
            try {
                m37778();
                C7744 mo26556 = this.f49313.mo26556();
                try {
                    if (mo26556.m20767() != this.f49315) {
                        mo26556.close();
                        runnableC9631 = new Runnable() { // from class: l.᩷ܰᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                RunnableC15979.m37780(RunnableC15979.this, false);
                            }
                        };
                    } else {
                        mo26556.m20766(new RunnableC17290(1, this));
                        C20873 c20873 = new C20873(mo26556);
                        for (int i = 0; i < this.f49319.length; i++) {
                            m37778();
                            this.f49317[i] = this.f49314[i].m28749(c20873, this.f49318);
                        }
                        mo26556.close();
                        runnableC9631 = new RunnableC9631(0, this);
                    }
                    C4925.m14315(runnableC9631);
                } catch (Throwable th) {
                    try {
                        mo26556.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Error | RuntimeException unused) {
                runnable = new Runnable() { // from class: l.ۡܰᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC15979.m37780(RunnableC15979.this, z);
                    }
                };
                C4925.m14315(runnable);
            }
        } catch (CancellationException unused2) {
            runnable = new Runnable() { // from class: l.ۡܰᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC15979.m37780(RunnableC15979.this, z);
                }
            };
            C4925.m14315(runnable);
        } catch (Throwable th3) {
            C4925.m14315(new Runnable() { // from class: l.ۡܰᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC15979.m37780(RunnableC15979.this, z);
                }
            });
            throw th3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37780(RunnableC15979 runnableC15979, boolean z) {
        RunnableC15979 runnableC159792;
        AtomicInteger atomicInteger;
        C16501 c16501;
        C16501 c165012;
        C10421 c10421;
        C16501 c165013;
        float f;
        C10421 c104212;
        runnableC159792 = runnableC15979.f49316.f8144;
        if (runnableC159792 != runnableC15979) {
            return;
        }
        runnableC15979.f49316.f8144 = null;
        C2575 c2575 = runnableC15979.f49316;
        if (c2575.f10021.f37258 == c2575 && c2575.f10015 == runnableC15979.f49313 && !c2575.f10019) {
            if (!runnableC15979.f49320 && runnableC15979.f49316.m9757() && runnableC15979.f49316.m9781() == runnableC15979.f49315) {
                int i = runnableC15979.f49321;
                atomicInteger = runnableC15979.f49316.f8140;
                if (i == atomicInteger.get()) {
                    if (z) {
                        c16501 = runnableC15979.f49316.f8143;
                        if (c16501 == null) {
                            C2575 c25752 = runnableC15979.f49316;
                            c104212 = c25752.f8142;
                            c25752.f8143 = C16501.m38865(c104212);
                        }
                        for (int i2 = 0; i2 < runnableC15979.f49319.length; i2++) {
                            c10421 = runnableC15979.f49316.f8142;
                            c10421.mo4099(runnableC15979.f49317[i2], runnableC15979.f49319[i2]);
                            c165013 = runnableC15979.f49316.f8143;
                            c165013.m38870(runnableC15979.f49319[i2]);
                            C2575 c25753 = runnableC15979.f49316;
                            f = c25753.f8136;
                            c25753.f8136 = Math.max(f, runnableC15979.f49317[i2]);
                        }
                        C2575 c25754 = runnableC15979.f49316;
                        c165012 = c25754.f8143;
                        c25754.f8147 = c165012.m38869();
                        runnableC15979.f49316.f10021.invalidate();
                        return;
                    }
                    return;
                }
            }
            runnableC15979.f49316.f10021.invalidate();
        }
    }
}
