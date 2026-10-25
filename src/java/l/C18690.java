package l;

import android.os.SystemClock;

/* compiled from: 68UW */
/* renamed from: l.ᩴۤ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18690 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Exception f59099;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f59100 = -9223372036854775807L;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f59098 = -9223372036854775807L;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43309(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f59099 == null) {
            this.f59099 = exc;
        }
        if (this.f59100 == -9223372036854775807L && !C8106.m21555()) {
            this.f59100 = 200 + elapsedRealtime;
        }
        long j = this.f59100;
        if (j != -9223372036854775807L && elapsedRealtime >= j) {
            Exception exc2 = this.f59099;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f59099;
            m43308();
            throw exc3;
        }
        this.f59098 = elapsedRealtime + 50;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43310() {
        if (this.f59099 == null) {
            return false;
        }
        return C8106.m21555() || SystemClock.elapsedRealtime() < this.f59098;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43308() {
        this.f59099 = null;
        this.f59100 = -9223372036854775807L;
        this.f59098 = -9223372036854775807L;
    }
}
