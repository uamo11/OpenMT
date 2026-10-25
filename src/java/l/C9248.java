package l;

import java.math.RoundingMode;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: 08QK */
/* renamed from: l.ۢ֨֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9248 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f28018;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f28019;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f28020 = new ThreadLocal();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f28021;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized long m23730() {
        long j;
        j = this.f28018;
        if (j == C13132.FOREVER_NS || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized long m23731(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!m23738()) {
            long j2 = this.f28018;
            if (j2 == 9223372036854775806L) {
                Long l2 = (Long) this.f28020.get();
                l2.getClass();
                j2 = l2.longValue();
            }
            this.f28021 = j2 - j;
            notifyAll();
        }
        this.f28019 = j;
        return j + this.f28021;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m23732(long j, boolean z) {
        C22632.m50634(this.f28018 == 9223372036854775806L);
        if (m23738()) {
            return;
        }
        if (z) {
            this.f28020.set(Long.valueOf(j));
        } else {
            while (!m23738()) {
                wait();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long m23733() {
        long j;
        j = this.f28019;
        return j != -9223372036854775807L ? j + this.f28021 : m23730();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long m23734(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f28019;
        if (j3 != -9223372036854775807L) {
            String str = C3603.f11424;
            long m11017 = C3603.m11017(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = (Blake2xsDigest.MAX_NUMBER_BLOCKS + m11017) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - m11017) < Math.abs(j - m11017)) {
                j2 = j5;
                String str2 = C3603.f11424;
                return m23731(C3603.m11017(j2, 1000000L, 90000L, RoundingMode.DOWN));
            }
        }
        j2 = j;
        String str22 = C3603.f11424;
        return m23731(C3603.m11017(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized long m23735() {
        return this.f28021;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized long m23736(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f28019;
        if (j3 != -9223372036854775807L) {
            String str = C3603.f11424;
            long m11017 = C3603.m11017(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = m11017 / 8589934592L;
            Long.signum(j4);
            long j5 = (j4 * 8589934592L) + j;
            j += (j4 + 1) * 8589934592L;
            if (j5 >= m11017) {
                j2 = j5;
                String str2 = C3603.f11424;
                return m23731(C3603.m11017(j2, 1000000L, 90000L, RoundingMode.DOWN));
            }
        }
        j2 = j;
        String str22 = C3603.f11424;
        return m23731(C3603.m11017(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m23737(long j) {
        this.f28018 = j;
        this.f28021 = j == C13132.FOREVER_NS ? 0L : -9223372036854775807L;
        this.f28019 = -9223372036854775807L;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m23738() {
        return this.f28021 != -9223372036854775807L;
    }

    public C9248(long j) {
        m23737(j);
    }
}
