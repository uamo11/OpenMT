package l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: 78NK */
/* renamed from: l.ۨ᩻ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12035 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12468 f36004;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f36011;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4979 f36013;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20502 f36007 = new C20502();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C20537 f36006 = new C20537();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20537 f36005 = new C20537();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3022 f36014 = new C3022();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f36010 = -9223372036854775807L;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6404 f36009 = C6404.f19812;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f36012 = -9223372036854775807L;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f36008 = -9223372036854775807L;

    public C12035(C12468 c12468, C4979 c4979) {
        this.f36004 = c12468;
        this.f36013 = c4979;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29396() {
        this.f36014.m9266();
        this.f36010 = -9223372036854775807L;
        this.f36012 = -9223372036854775807L;
        this.f36008 = -9223372036854775807L;
        C20537 c20537 = this.f36005;
        if (c20537.m47029() > 0) {
            C22632.m50631(c20537.m47029() > 0);
            while (c20537.m47029() > 1) {
                c20537.m47027();
            }
            Object m47027 = c20537.m47027();
            m47027.getClass();
            this.f36011 = ((Long) m47027).longValue();
        }
        C20537 c205372 = this.f36006;
        if (c205372.m47029() > 0) {
            C22632.m50631(c205372.m47029() > 0);
            while (c205372.m47029() > 1) {
                c205372.m47027();
            }
            Object m470272 = c205372.m47027();
            m470272.getClass();
            c205372.m47026(0L, (C6404) m470272);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29400(long j, long j2) {
        long m46975;
        Executor executor;
        ArrayDeque arrayDeque;
        while (true) {
            C3022 c3022 = this.f36014;
            if (c3022.m9269()) {
                return;
            }
            long m9268 = c3022.m9268();
            Long l2 = (Long) this.f36005.m47028(m9268);
            C4979 c4979 = this.f36013;
            if (l2 != null && l2.longValue() != this.f36011) {
                this.f36011 = l2.longValue();
                c4979.m14441(2);
            }
            long j3 = this.f36011;
            C4979 c49792 = this.f36013;
            C20502 c20502 = this.f36007;
            int m14438 = c49792.m14438(m9268, j, j2, j3, false, false, c20502);
            final C12468 c12468 = this.f36004;
            if (m14438 == 0 || m14438 == 1) {
                this.f36012 = m9268;
                boolean z = m14438 == 0;
                long m9270 = c3022.m9270();
                C6404 c6404 = (C6404) this.f36006.m47028(m9270);
                if (c6404 != null && !c6404.equals(C6404.f19812) && !c6404.equals(this.f36009)) {
                    this.f36009 = c6404;
                    c12468.m30628(c6404);
                }
                if (z) {
                    m46975 = System.nanoTime();
                } else {
                    m46975 = c20502.m46975();
                }
                c12468.m30627(m46975, m9270, c4979.m14448());
            } else if (m14438 == 2 || m14438 == 3) {
                this.f36012 = m9268;
                c3022.m9270();
                C10352 c10352 = c12468.f37486;
                executor = c10352.f31158;
                executor.execute(new Runnable() { // from class: l.ۗܳۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC17182 interfaceC17182;
                        interfaceC17182 = C12468.this.f37486.f31156;
                        interfaceC17182.mo25027();
                    }
                });
                arrayDeque = c10352.f31157;
                ((InterfaceC14359) arrayDeque.remove()).skip();
            } else {
                if (m14438 != 4) {
                    if (m14438 != 5) {
                        throw new IllegalStateException(String.valueOf(m14438));
                    }
                    return;
                }
                this.f36012 = m9268;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29397(int i, int i2) {
        long j = this.f36010;
        this.f36006.m47026(j == -9223372036854775807L ? 0L : j + 1, new C6404(i, i2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29398(int i, long j) {
        if (this.f36014.m9269()) {
            this.f36013.m14441(i);
            this.f36011 = j;
        } else {
            long j2 = this.f36010;
            this.f36005.m47026(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29399(long j) {
        this.f36014.m9267(j);
        this.f36010 = j;
        this.f36008 = -9223372036854775807L;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29402() {
        if (this.f36010 == -9223372036854775807L) {
            this.f36010 = Long.MIN_VALUE;
            this.f36012 = Long.MIN_VALUE;
        }
        this.f36008 = this.f36010;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29401() {
        long j = this.f36008;
        return j != -9223372036854775807L && this.f36012 == j;
    }
}
