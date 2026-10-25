package l;

import android.media.AudioTrack;

/* compiled from: W8Q1 */
/* renamed from: l.۬۫֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13105 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3228 f39235;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f39236;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12400 f39237;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f39238;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f39239;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f39240;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f39241;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f39242;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f39243;

    public C13105(AudioTrack audioTrack, InterfaceC12400 interfaceC12400) {
        this.f39235 = new C3228(audioTrack);
        this.f39236 = audioTrack.getSampleRate();
        this.f39237 = interfaceC12400;
        m31765(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31768(float f, long j, long j2) {
        long m21548;
        long m215482;
        if (j - this.f39238 < this.f39243) {
            return;
        }
        this.f39238 = j;
        C3228 c3228 = this.f39235;
        boolean m9903 = c3228.m9903();
        int i = this.f39236;
        if (m9903) {
            long m9902 = c3228.m9902();
            long m9901 = c3228.m9901();
            long m99022 = c3228.m9902();
            long m11015 = C3603.m11015(j - m99022, f) + C3603.m11013(i, m9901);
            long abs = Math.abs(m9902 - j);
            InterfaceC12400 interfaceC12400 = this.f39237;
            if (abs > 5000000) {
                long m99012 = c3228.m9901();
                C19396 c19396 = (C19396) interfaceC12400;
                c19396.getClass();
                StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                sb.append(m99012);
                sb.append(", ");
                sb.append(m9902);
                sb.append(", ");
                sb.append(j);
                sb.append(", ");
                sb.append(j2);
                sb.append(", ");
                C8106 c8106 = c19396.f62762;
                sb.append(C8106.m21562(c8106));
                sb.append(", ");
                m215482 = c8106.m21548();
                sb.append(m215482);
                C19956.m46037(sb.toString());
                m31765(4);
            } else if (Math.abs(m11015 - j2) > 5000000) {
                long m99013 = c3228.m9901();
                C19396 c193962 = (C19396) interfaceC12400;
                c193962.getClass();
                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                sb2.append(m99013);
                sb2.append(", ");
                sb2.append(m9902);
                sb2.append(", ");
                sb2.append(j);
                sb2.append(", ");
                sb2.append(j2);
                sb2.append(", ");
                C8106 c81062 = c193962.f62762;
                sb2.append(C8106.m21562(c81062));
                sb2.append(", ");
                m21548 = c81062.m21548();
                sb2.append(m21548);
                C19956.m46037(sb2.toString());
                m31765(4);
            } else if (this.f39242 == 4) {
                m31765(0);
            }
        }
        int i2 = this.f39242;
        if (i2 == 0) {
            if (!m9903) {
                if (j - this.f39240 > 500000) {
                    m31765(3);
                    return;
                }
                return;
            } else {
                if (c3228.m9902() >= this.f39240) {
                    this.f39239 = c3228.m9901();
                    this.f39241 = c3228.m9902();
                    m31765(1);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                if (m9903) {
                    return;
                }
                m31765(0);
                return;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (m9903) {
                    m31765(0);
                    return;
                }
                return;
            }
        }
        if (!m9903) {
            m31765(0);
            return;
        }
        long m99014 = c3228.m9901();
        long j3 = this.f39239;
        if (m99014 > j3) {
            long j4 = this.f39241;
            long m110152 = C3603.m11015(j - j4, f) + C3603.m11013(i, j3);
            long m99015 = c3228.m9901();
            long m99023 = c3228.m9902();
            if (Math.abs((C3603.m11015(j - m99023, f) + C3603.m11013(i, m99015)) - m110152) < 1000) {
                m31765(2);
                return;
            }
        }
        if (j - this.f39240 > 2000000) {
            m31765(3);
        } else {
            this.f39239 = c3228.m9901();
            this.f39241 = c3228.m9902();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m31769() {
        return this.f39242 == 2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m31770() {
        int i = this.f39242;
        return i == 0 || i == 1;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m31771() {
        m31765(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31767() {
        this.f39235.m9900();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31765(int i) {
        this.f39242 = i;
        if (i == 0) {
            this.f39238 = 0L;
            this.f39239 = -1L;
            this.f39241 = -9223372036854775807L;
            this.f39240 = System.nanoTime() / 1000;
            this.f39243 = 10000L;
            return;
        }
        if (i == 1) {
            this.f39243 = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f39243 = 10000000L;
        } else {
            if (i == 4) {
                this.f39243 = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m31766(long j, float f) {
        C3228 c3228 = this.f39235;
        long m9901 = c3228.m9901();
        long m9902 = c3228.m9902();
        return C3603.m11015(j - m9902, f) + C3603.m11013(this.f39236, m9901);
    }
}
