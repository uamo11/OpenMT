package l;

import java.io.InterruptedIOException;

/* compiled from: T4F2 */
/* renamed from: l.ۗۧ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3185 implements InterfaceC5508 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10241 f10046;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12521 f10047 = new C12521();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f10048;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f10049;

    public C3185(C10241 c10241) {
        this.f10046 = c10241;
    }

    @Override // l.InterfaceC5508
    /* renamed from: ֫ */
    public final void mo8911(C12521 c12521, long j) {
        C12521 c125212 = this.f10047;
        c125212.mo8911(c12521, j);
        while (c125212.size() >= 16384) {
            m9798(false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9798(boolean z) {
        C10241 c10241;
        long min;
        C10241 c102412;
        synchronized (this.f10046) {
            this.f10046.f30868.m13925();
            while (true) {
                try {
                    c10241 = this.f10046;
                    if (c10241.f30866 > 0 || this.f10049 || this.f10048 || c10241.f30872 != null) {
                        break;
                    }
                    try {
                        c10241.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } finally {
                }
            }
            c10241.f30868.m29977();
            this.f10046.m25939();
            min = Math.min(this.f10046.f30866, this.f10047.size());
            c102412 = this.f10046;
            c102412.f30866 -= min;
        }
        c102412.f30868.m13925();
        try {
            C10241 c102413 = this.f10046;
            c102413.f30870.m49929(c102413.f30871, z && min == this.f10047.size(), this.f10047, min);
        } finally {
        }
    }

    @Override // l.InterfaceC5508, java.io.Flushable
    public final void flush() {
        synchronized (this.f10046) {
            this.f10046.m25939();
        }
        while (this.f10047.size() > 0) {
            m9798(false);
            this.f10046.f30870.f72147.flush();
        }
    }

    @Override // l.InterfaceC5508
    /* renamed from: ۢ */
    public final C15384 mo8912() {
        return this.f10046.f30868;
    }

    @Override // l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f10046) {
            if (this.f10048) {
                return;
            }
            if (!this.f10046.f30867.f10049) {
                if (this.f10047.size() > 0) {
                    while (this.f10047.size() > 0) {
                        m9798(true);
                    }
                } else {
                    C10241 c10241 = this.f10046;
                    c10241.f30870.m49929(c10241.f30871, true, (C12521) null, 0L);
                }
            }
            synchronized (this.f10046) {
                this.f10048 = true;
            }
            this.f10046.f30870.f72147.flush();
            this.f10046.m25934();
        }
    }
}
