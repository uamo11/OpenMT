package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* compiled from: H4EU */
/* renamed from: l.᩸ܽ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21694 implements InterfaceC5508 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4760 f69578;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5508 f69579;

    public C21694(C4760 c4760, InterfaceC5508 interfaceC5508) {
        this.f69578 = c4760;
        this.f69579 = interfaceC5508;
    }

    @Override // l.InterfaceC5508
    /* renamed from: ֫ */
    public final void mo8911(C12521 c12521, long j) {
        C21736.m49060(c12521.f37625, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            C18914 c18914 = c12521.f37624;
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += c18914.f59597 - c18914.f59600;
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                c18914 = c18914.f59599;
            }
            C4760 c4760 = this.f69578;
            c4760.m13925();
            try {
                try {
                    ((C16796) this.f69579).mo8911(c12521, j2);
                    j -= j2;
                    c4760.m13922(true);
                } catch (IOException e) {
                    if (!c4760.m13923()) {
                        throw e;
                    }
                    throw c4760.mo13921(e);
                }
            } catch (Throwable th) {
                c4760.m13922(false);
                throw th;
            }
        }
    }

    @Override // l.InterfaceC5508, java.io.Flushable
    public final void flush() {
        C4760 c4760 = this.f69578;
        c4760.m13925();
        try {
            try {
                ((C16796) this.f69579).flush();
                c4760.m13922(true);
            } catch (IOException e) {
                if (!c4760.m13923()) {
                    throw e;
                }
                throw c4760.mo13921(e);
            }
        } catch (Throwable th) {
            c4760.m13922(false);
            throw th;
        }
    }

    @Override // l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4760 c4760 = this.f69578;
        c4760.m13925();
        try {
            try {
                ((C16796) this.f69579).close();
                c4760.m13922(true);
            } catch (IOException e) {
                if (!c4760.m13923()) {
                    throw e;
                }
                throw c4760.mo13921(e);
            }
        } catch (Throwable th) {
            c4760.m13922(false);
            throw th;
        }
    }

    @Override // l.InterfaceC5508
    /* renamed from: ۢ */
    public final C15384 mo8912() {
        return this.f69578;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f69579 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
