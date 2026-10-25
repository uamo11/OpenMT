package l;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: T8SY */
/* renamed from: l.ۤ۫֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10284 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f30957;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f30958;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13105 f30959;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f30960;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f30961;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f30962;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f30963;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f30964;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f30965;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f30966;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f30967;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f30968;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f30969;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Method f30970;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f30971;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long[] f30972;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AudioTrack f30973;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f30974;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30975;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f30976;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f30977;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC16427 f30978;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12400 f30979;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f30980;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f30981;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f30982;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f30983;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f30984;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f30985;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f30986;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30987;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f30988;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30989;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f30990;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f30991;

    public C10284(InterfaceC12400 interfaceC12400) {
        this.f30979 = interfaceC12400;
        try {
            this.f30970 = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f30972 = new long[10];
        this.f30965 = -9223372036854775807L;
        this.f30985 = -9223372036854775807L;
        this.f30978 = InterfaceC16427.f50519;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26035(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        this.f30973 = audioTrack;
        this.f30983 = i3;
        this.f30959 = new C13105(audioTrack, this.f30979);
        this.f30962 = audioTrack.getSampleRate();
        this.f30988 = z && Build.VERSION.SDK_INT < 23 && (i == 5 || i == 6);
        boolean m11034 = C3603.m11034(i);
        this.f30961 = m11034;
        this.f30982 = m11034 ? C3603.m11013(this.f30962, i3 / i2) : -9223372036854775807L;
        this.f30966 = 0L;
        this.f30974 = 0L;
        this.f30987 = false;
        this.f30960 = 0L;
        this.f30976 = 0L;
        this.f30980 = false;
        this.f30968 = -9223372036854775807L;
        this.f30971 = -9223372036854775807L;
        this.f30963 = 0L;
        this.f30969 = 0L;
        this.f30981 = 1.0f;
        this.f30958 = 0;
        this.f30964 = -9223372036854775807L;
        this.f30991 = z2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26033(float f) {
        this.f30981 = f;
        C13105 c13105 = this.f30959;
        if (c13105 != null) {
            c13105.m31771();
        }
        m26030();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m26037() {
        Method method;
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long mo33835 = this.f30978.mo33835() / 1000;
            if (mo33835 - this.f30984 >= 30000) {
                long m11013 = C3603.m11013(this.f30962, m26031());
                if (m11013 != 0) {
                    int i = this.f30989;
                    long m11038 = C3603.m11038(m11013, this.f30981) - mo33835;
                    long[] jArr = this.f30972;
                    jArr[i] = m11038;
                    this.f30989 = (this.f30989 + 1) % 10;
                    int i2 = this.f30975;
                    if (i2 < 10) {
                        this.f30975 = i2 + 1;
                    }
                    this.f30984 = mo33835;
                    this.f30990 = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f30975;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f30990 += jArr[i3] / i4;
                        i3++;
                        jArr = jArr;
                    }
                }
            }
            if (!this.f30988) {
                if (this.f30961 && (method = this.f30970) != null && mo33835 - this.f30963 >= 500000) {
                    try {
                        AudioTrack audioTrack2 = this.f30973;
                        audioTrack2.getClass();
                        Integer num = (Integer) method.invoke(audioTrack2, null);
                        String str = C3603.f11424;
                        long intValue = (num.intValue() * 1000) - this.f30982;
                        this.f30969 = intValue;
                        long max = Math.max(intValue, 0L);
                        this.f30969 = max;
                        if (max > 5000000) {
                            C19956.m46037("Ignoring impossibly large audio latency: " + max);
                            this.f30969 = 0L;
                        }
                    } catch (Exception unused) {
                        this.f30970 = null;
                    }
                    this.f30963 = mo33835;
                }
                C13105 c13105 = this.f30959;
                c13105.getClass();
                c13105.m31768(this.f30981, mo33835, m26029(mo33835));
            }
        }
        long mo338352 = this.f30978.mo33835() / 1000;
        C13105 c131052 = this.f30959;
        c131052.getClass();
        boolean m31769 = c131052.m31769();
        long m31766 = m31769 ? c131052.m31766(mo338352, this.f30981) : m26029(mo338352);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (m31769 || !c131052.m31770()) {
                m26028(m31766);
            }
            long j = this.f30965;
            if (j != -9223372036854775807L) {
                long j2 = m31766 - this.f30985;
                long m11015 = C3603.m11015(mo338352 - j, this.f30981);
                long j3 = this.f30985 + m11015;
                long abs = Math.abs(j3 - m31766);
                if (j2 != 0 && abs < 1000000) {
                    long j4 = (m11015 * 10) / 100;
                    m31766 = C3603.m11016(m31766, j3 - j4, j3 + j4);
                }
            }
            if (!this.f30991 && !this.f30986) {
                long j5 = this.f30985;
                if (j5 != -9223372036854775807L && m31766 > j5) {
                    this.f30986 = true;
                    ((C19396) this.f30979).m44670(this.f30978.mo33831() - C3603.m11037(C3603.m11038(C3603.m11037(m31766 - j5), this.f30981)));
                }
            }
            this.f30965 = mo338352;
            this.f30985 = m31766;
        } else if (playState == 1) {
            m26028(m31766);
        }
        return m31766;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m26039() {
        if (this.f30968 != -9223372036854775807L) {
            this.f30968 = C3603.m11014(this.f30978.mo33834());
        }
        this.f30964 = C3603.m11013(this.f30962, m26031());
        C13105 c13105 = this.f30959;
        c13105.getClass();
        c13105.m31771();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26040() {
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m26044(long j) {
        InterfaceC21573 interfaceC21573;
        long j2;
        InterfaceC21573 interfaceC215732;
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f30988) {
            if (playState == 2) {
                this.f30980 = false;
                return false;
            }
            if (playState == 1 && m26031() == 0) {
                return false;
            }
        }
        if (Build.VERSION.SDK_INT < 24) {
            boolean z = this.f30980;
            boolean m26038 = m26038(j);
            this.f30980 = m26038;
            if (z && !m26038 && playState != 1) {
                r3 = true;
            }
        } else {
            AudioTrack audioTrack2 = this.f30973;
            audioTrack2.getClass();
            int underrunCount = audioTrack2.getUnderrunCount();
            r3 = underrunCount > this.f30958;
            this.f30958 = underrunCount;
        }
        if (r3) {
            int i = this.f30983;
            long m11037 = C3603.m11037(this.f30982);
            C8106 c8106 = ((C19396) this.f30979).f62762;
            interfaceC21573 = c8106.f24996;
            if (interfaceC21573 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j2 = c8106.f25028;
                interfaceC215732 = c8106.f24996;
                interfaceC215732.mo46348(m11037, i, elapsedRealtime - j2);
            }
        }
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26041(long j) {
        return this.f30971 != -9223372036854775807L && j > 0 && this.f30978.mo33834() - this.f30971 >= 200;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26034(long j) {
        this.f30977 = m26031();
        this.f30968 = C3603.m11014(this.f30978.mo33834());
        this.f30967 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m26038(long j) {
        long m26037 = m26037();
        int i = this.f30962;
        String str = C3603.f11424;
        if (j > C3603.m11017(m26037, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (!this.f30988) {
            return false;
        }
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && m26031() == 0;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26043() {
        m26030();
        if (this.f30968 == -9223372036854775807L) {
            C13105 c13105 = this.f30959;
            c13105.getClass();
            c13105.m31771();
        }
        this.f30977 = m26031();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26032() {
        this.f30987 = true;
        C13105 c13105 = this.f30959;
        if (c13105 != null) {
            c13105.m31767();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26042() {
        m26030();
        this.f30973 = null;
        this.f30959 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26036(InterfaceC16427 interfaceC16427) {
        this.f30978 = interfaceC16427;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m26028(long j) {
        if (this.f30991) {
            long j2 = this.f30964;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long mo33831 = this.f30978.mo33831() - C3603.m11037(C3603.m11038(j - j2, this.f30981));
            this.f30964 = -9223372036854775807L;
            ((C19396) this.f30979).m44670(mo33831);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private long m26029(long j) {
        long m11015;
        if (this.f30975 != 0) {
            m11015 = C3603.m11015(j + this.f30990, this.f30981);
        } else if (this.f30968 != -9223372036854775807L) {
            m11015 = C3603.m11013(this.f30962, m26027());
        } else {
            m11015 = C3603.m11013(this.f30962, m26031());
        }
        long max = Math.max(0L, m11015 - this.f30969);
        if (this.f30968 == -9223372036854775807L) {
            return max;
        }
        return Math.min(C3603.m11013(this.f30962, this.f30967), max);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26030() {
        this.f30990 = 0L;
        this.f30975 = 0;
        this.f30989 = 0;
        this.f30984 = 0L;
        this.f30985 = -9223372036854775807L;
        this.f30965 = -9223372036854775807L;
        this.f30986 = false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private long m26031() {
        if (this.f30968 != -9223372036854775807L) {
            return Math.min(this.f30967, m26027());
        }
        long mo33834 = this.f30978.mo33834();
        if (mo33834 - this.f30957 >= 5) {
            AudioTrack audioTrack = this.f30973;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f30988) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f30976 = this.f30966;
                    }
                    playbackHeadPosition += this.f30976;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.f30966 <= 0 || playState != 3) {
                        this.f30971 = -9223372036854775807L;
                    } else if (this.f30971 == -9223372036854775807L) {
                        this.f30971 = mo33834;
                    }
                }
                long j = this.f30966;
                if (j > playbackHeadPosition) {
                    if (this.f30987) {
                        this.f30960 += j;
                        this.f30987 = false;
                    } else {
                        this.f30974++;
                    }
                }
                this.f30966 = playbackHeadPosition;
            }
            this.f30957 = mo33834;
        }
        return this.f30966 + this.f30960 + (this.f30974 << 32);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private long m26027() {
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f30977;
        }
        return this.f30977 + C3603.m11017(C3603.m11015(C3603.m11014(this.f30978.mo33834()) - this.f30968, this.f30981), this.f30962, 1000000L, RoundingMode.UP);
    }
}
