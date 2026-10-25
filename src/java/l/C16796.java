package l;

import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;

/* compiled from: J4DP */
/* renamed from: l.ܽᩳ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16796 implements InterfaceC5508 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f51559;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15384 f51560;

    public C16796(C15384 c15384, OutputStream outputStream) {
        this.f51560 = c15384;
        this.f51559 = outputStream;
    }

    @Override // l.InterfaceC5508
    /* renamed from: ֫ */
    public final void mo8911(C12521 c12521, long j) {
        C21736.m49060(c12521.f37625, 0L, j);
        while (j > 0) {
            this.f51560.mo20332();
            C18914 c18914 = c12521.f37624;
            int min = (int) Math.min(j, c18914.f59597 - c18914.f59600);
            this.f51559.write(c18914.f59596, c18914.f59600, min);
            int i = c18914.f59600 + min;
            c18914.f59600 = i;
            long j2 = min;
            j -= j2;
            c12521.f37625 -= j2;
            if (i == c18914.f59597) {
                c12521.f37624 = c18914.m43656();
                C19620.m45064(c18914);
            }
        }
    }

    @Override // l.InterfaceC5508, java.io.Flushable
    public final void flush() {
        this.f51559.flush();
    }

    @Override // l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f51559.close();
    }

    @Override // l.InterfaceC5508
    /* renamed from: ۢ */
    public final C15384 mo8912() {
        return this.f51560;
    }

    public final String toString() {
        return "sink(" + this.f51559 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
