package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* compiled from: H4EU */
/* renamed from: l.᩹ܽ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22399 implements InterfaceC1274 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4760 f72554;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1274 f72555;

    public C22399(C4760 c4760, InterfaceC1274 interfaceC1274) {
        this.f72554 = c4760;
        this.f72555 = interfaceC1274;
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) {
        C4760 c4760 = this.f72554;
        c4760.m13925();
        try {
            try {
                long mo4334 = ((C18208) this.f72555).mo4334(c12521, 8192L);
                c4760.m13922(true);
                return mo4334;
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4760 c4760 = this.f72554;
        try {
            try {
                ((C18208) this.f72555).close();
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

    @Override // l.InterfaceC1274
    /* renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f72554;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f72555 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
