package l;

import android.os.SystemClock;

/* compiled from: 05B9 */
/* renamed from: l.ܶ۫ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15226 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f46731;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f46732;

    public C15226(int i) {
        this.f46731 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36033() {
        this.f46732 = System.currentTimeMillis();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36032() {
        int currentTimeMillis = (int) (this.f46731 - (System.currentTimeMillis() - this.f46732));
        if (currentTimeMillis > 0) {
            SystemClock.sleep(currentTimeMillis);
        }
    }
}
