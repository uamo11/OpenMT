package l;

import java.io.IOException;

/* compiled from: N6TT */
/* renamed from: l.ܳۗᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14260 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f42949;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21605 f42950;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14820 f42951;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33906(C9611 c9611, int i) {
        C17789.m41669(c9611.f29156, i, false, (Runnable) new RunnableC0709());
        C17789.m41669(c9611.f29155, i, true, (Runnable) new RunnableC0709());
    }

    public C14260(C21605 c21605, C14820 c14820, Runnable runnable) {
        this.f42950 = c21605;
        this.f42951 = c14820;
        this.f42949 = runnable;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m33909(C2309 c2309) {
        long m48809;
        long m33902 = m33902(c2309.f7441.f29156.f48465, true);
        long m339022 = m33902(c2309.f7441.f29155.f48465, true);
        synchronized (this.f42950.f69370.f4153) {
            C10130 c10130 = new C10130(72);
            c10130.writeInt(1);
            c10130.writeInt(1);
            c10130.m25431(m33902);
            c10130.m25431(m339022);
            c10130.m25431(c2309.f7441.f29154);
            c10130.m25431(c2309.f7440);
            c10130.m25431(c2309.f7444);
            c10130.m25431(c2309.f7442);
            c10130.writeInt(c2309.f7443.m14642());
            c10130.writeInt(c2309.f7443.m14640());
            c10130.writeInt(c2309.f7441.f29153 ? 1 : 0);
            c10130.writeInt(0);
            C21605 c21605 = this.f42950;
            m48809 = c21605.m48809(c21605.m48810(), c10130.m25438(), 5, c10130.size());
        }
        return m48809;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33902(C9365 c9365, boolean z) {
        long m48809;
        long m488092;
        this.f42949.run();
        if (c9365 == null) {
            return 0L;
        }
        long j = c9365.f28443;
        m33905(j, c9365.f28442);
        if (j >= 0) {
            return j;
        }
        Object obj = c9365.f28439;
        if (obj != null) {
            long m33901 = z ? m33901((C8905) obj) : m33903((C23224) obj);
            synchronized (this.f42950.f69370.f4153) {
                C10130 c10130 = new C10130(12);
                c10130.writeInt(z ? 2 : 4);
                c10130.m25431(m33901);
                C21605 c21605 = this.f42950;
                m488092 = c21605.m48809(c21605.m48810(), c10130.m25438(), 5, c10130.size());
                c9365.f28442 = this.f42950;
                c9365.f28443 = m488092;
            }
            return m488092;
        }
        long m33902 = m33902(c9365.f28441, z);
        long m339022 = m33902(c9365.f28440, z);
        synchronized (this.f42950.f69370.f4153) {
            C10130 c101302 = new C10130(28);
            c101302.writeInt(z ? 3 : 5);
            c101302.writeInt(c9365.f28438);
            c101302.writeInt(c9365.f28444);
            c101302.m25431(m33902);
            c101302.m25431(m339022);
            C21605 c216052 = this.f42950;
            m48809 = c216052.m48809(c216052.m48810(), c101302.m25438(), 5, c101302.size());
            c9365.f28442 = this.f42950;
            c9365.f28443 = m48809;
        }
        return m48809;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33901(C8905 c8905) {
        long m48809;
        long j = c8905.f27086;
        m33905(j, c8905.f27085);
        if (j >= 0) {
            return j;
        }
        int i = 0;
        long m33902 = m33902(c8905.f27081.f48465, false);
        synchronized (this.f42950.f69370.f4153) {
            C10130 c10130 = new C10130(36);
            c10130.writeInt(6);
            c10130.m25431(c8905.f27082);
            c10130.m25431(c8905.f27083);
            if (c8905.f27084 != EnumC14051.USER) {
                i = 1;
            }
            c10130.writeInt(i);
            c10130.m25431(m33902);
            c10130.writeInt(c8905.f27081.m37046());
            C21605 c21605 = this.f42950;
            m48809 = c21605.m48809(c21605.m48810(), c10130.m25438(), 5, c10130.size());
            c8905.f27085 = this.f42950;
            c8905.f27086 = m48809;
        }
        return m48809;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33903(C23224 c23224) {
        long m48809;
        long j = c23224.f74642;
        m33905(j, c23224.f74641);
        if (j >= 0) {
            return j;
        }
        C11999 c11999 = c23224.f74639;
        C21605 c21605 = c11999.f35930;
        C21605 c216052 = this.f42950;
        if (c21605 != c216052 || c23224.f74636.f35930 != c216052) {
            throw new IOException("History belongs to another store");
        }
        long m35224 = this.f42951.m35224(c11999);
        long m352242 = this.f42951.m35224(c23224.f74636);
        synchronized (this.f42950.f69370.f4153) {
            C10130 c10130 = new C10130(72);
            c10130.writeInt(7);
            c10130.writeInt(c23224.f74637);
            c10130.m25431(c23224.f74640);
            c10130.m25431(c23224.f74638);
            c10130.writeInt(c23224.f74643.m14642());
            c10130.writeInt(c23224.f74643.m14640());
            C11999 c119992 = c23224.f74639;
            c10130.m25431(m35224);
            c10130.writeInt(c119992.m29347());
            c10130.writeInt(c119992.m29349());
            c10130.writeInt(c119992.m29341());
            C11999 c119993 = c23224.f74636;
            c10130.m25431(m352242);
            c10130.writeInt(c119993.m29347());
            c10130.writeInt(c119993.m29349());
            c10130.writeInt(c119993.m29341());
            C21605 c216053 = this.f42950;
            m48809 = c216053.m48809(c216053.m48810(), c10130.m25438(), 5, c10130.size());
            c23224.f74641 = this.f42950;
            c23224.f74642 = m48809;
        }
        return m48809;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33905(long j, C21605 c21605) {
        if (j >= 0 && c21605 != this.f42950) {
            throw new IOException("History offset belongs to another store");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2309 m33910(long j, long j2, int i, C17643 c17643) {
        Runnable runnable = this.f42949;
        C17789 c17789 = new C17789(this, c17643);
        c17643.m41292();
        C10734 m41675 = c17789.m41675(j, j2);
        try {
            C12951 c12951 = m41675.f32348;
            if (m41675.f32347 != 72 || c12951.readInt() != 1 || c12951.readInt() != 1) {
                throw new IOException("Invalid history state shape");
            }
            long readLong = c12951.readLong();
            long readLong2 = c12951.readLong();
            long readLong3 = c12951.readLong();
            long readLong4 = c12951.readLong();
            long readLong5 = c12951.readLong();
            long readLong6 = c12951.readLong();
            C5089 m41671 = c17789.m41671(c12951);
            int readInt = c12951.readInt();
            if (readLong3 <= 0 || readLong4 < 0 || readLong5 < readLong4 || readLong6 < 0 || readInt < 0 || readInt > 1 || m41671.m14642() > i || m41671.m14640() > i || c12951.readInt() != 0 || c12951.available() != 0) {
                throw new IOException("Invalid history state metadata");
            }
            C15713 c15713 = new C15713(c17789.m41672(0, readLong, j, true));
            C15713 c157132 = new C15713(c17789.m41672(0, readLong2, j, true));
            c17789.m41674(c15713, c157132, readLong3, readLong5);
            C17789.m41669(c15713, i, false, runnable);
            C17789.m41669(c157132, i, true, runnable);
            C2309 c2309 = new C2309(new C9611(c15713, c157132, readLong3, readInt == 1), m41671, readLong4, readLong5, readLong6);
            m41675.close();
            return c2309;
        } catch (Throwable th) {
            try {
                m41675.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
