package l;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.function.IntConsumer;

/* compiled from: A186 */
/* renamed from: l.᩵᩵ܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19676 implements IntConsumer {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2036 f63552;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f63553;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f63554 = SystemClock.uptimeMillis();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f63555 = 0;

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    public C19676(C2036 c2036, long j) {
        this.f63552 = c2036;
        this.f63553 = j;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.f63554;
        C2036 c2036 = this.f63552;
        if (j >= 1000) {
            c2036.mo6623();
            this.f63554 = uptimeMillis;
        }
        long j2 = i;
        long j3 = this.f63555 + j2;
        this.f63555 = j3;
        c2036.mo6621(j2, j3, this.f63553);
        if (c2036.f6790.mo1526()) {
            throw new CancellationException();
        }
    }
}
