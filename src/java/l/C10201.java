package l;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.GifInfoHandle;

/* compiled from: Z4KI */
/* renamed from: l.ۤۢ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10201 extends AbstractRunnableC5967 {
    @Override // l.AbstractRunnableC5967
    /* renamed from: ֫ */
    public final void mo16707() {
        C1734 c1734 = this.f18300;
        long m52903 = c1734.f5989.m52903(c1734.f5999);
        if (m52903 >= 0) {
            this.f18300.f5987 = SystemClock.uptimeMillis() + m52903;
            if (this.f18300.isVisible() && this.f18300.f5993) {
                C1734 c17342 = this.f18300;
                if (!c17342.f5985) {
                    c17342.f5998.remove(this);
                    C1734 c17343 = this.f18300;
                    c17343.f5994 = c17343.f5998.schedule(this, m52903, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f18300.f5992.isEmpty() && this.f18300.f5989.m52916() == this.f18300.f5989.m52915() - 1) {
                C1734 c17344 = this.f18300;
                HandlerC3145 handlerC3145 = c17344.f5986;
                GifInfoHandle gifInfoHandle = c17344.f5989;
                int m52919 = gifInfoHandle.m52919();
                if (m52919 != 0 && m52919 >= gifInfoHandle.m52925()) {
                    m52919--;
                }
                handlerC3145.sendEmptyMessageAtTime(m52919, this.f18300.f5987);
            }
        } else {
            C1734 c17345 = this.f18300;
            c17345.f5987 = Long.MIN_VALUE;
            c17345.f5993 = false;
        }
        if (!this.f18300.isVisible() || this.f18300.f5986.hasMessages(-1)) {
            return;
        }
        this.f18300.f5986.sendEmptyMessageAtTime(-1, 0L);
    }
}
