package l;

import android.view.View;

/* compiled from: 86WH */
/* renamed from: l.۬۠ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC12987 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5932 f38899;

    public RunnableC12987(C5932 c5932) {
        this.f38899 = c5932;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        C1904 c1904;
        long j;
        long j2;
        float f;
        C1904 c19042;
        C1904 c19043;
        C1904 c19044;
        View view;
        C5932 c5932 = this.f38899;
        z = c5932.f18179;
        if (z) {
            z2 = c5932.f18202;
            if (z2) {
                long nanoTime = System.nanoTime();
                c1904 = c5932.f18199;
                j = c5932.f18176;
                if (j == 0) {
                    f = 0.016666668f;
                } else {
                    j2 = c5932.f18176;
                    f = (nanoTime - j2) * 1.0E-9f;
                }
                c1904.m6255(f);
                c5932.f18176 = nanoTime;
                c19042 = c5932.f18199;
                float f2 = c19042.f6421;
                c19043 = c5932.f18199;
                c5932.m16626(f2, c19043.f6425);
                c19044 = c5932.f18199;
                if (!c19044.m6257()) {
                    c5932.m16643();
                } else {
                    view = c5932.f18192;
                    view.postOnAnimation(this);
                }
            }
        }
    }
}
