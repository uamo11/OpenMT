package l;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.alipay.sdk.app.OpenAuthTask;

/* compiled from: E8FJ */
/* renamed from: l.ܶܳۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC15289 extends AbstractC4930 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f46891;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final C20537 f46892;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C6404 f46893;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f46894;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public long f46895;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public long f46896;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public long f46897;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C21843 f46898;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21913 f46899;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f46900;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public Surface f46901;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f46902;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f46903;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C3519 f46904;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C13375 f46905;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f46906;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public C8353 f46907;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public Object f46908;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final int f46909;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f46910;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final long f46911;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public long f46912;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f46913;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public boolean f46914;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f46915;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final C10833 f46916;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f46917;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1381 f46918;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C21843 f46919;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C8353 f46920;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public int f46921;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f46922;

    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
    }

    /* renamed from: ۧ */
    public abstract InterfaceC1381 mo30948(C8353 c8353);

    public AbstractC15289(long j, Handler handler, InterfaceC16476 interfaceC16476, int i) {
        super(2);
        this.f46911 = j;
        this.f46909 = i;
        this.f46897 = -9223372036854775807L;
        this.f46892 = new C20537();
        this.f46898 = new C21843(0, 0);
        this.f46916 = new C10833(handler, interfaceC16476);
        this.f46894 = 0;
        this.f46921 = -1;
        this.f46891 = 0;
        this.f46904 = new C3519();
    }

    @Override // l.InterfaceC1837
    /* renamed from: ֫ */
    public final void mo6088(long j, long j2) {
        if (this.f46910) {
            return;
        }
        if (this.f46920 == null) {
            C3002 m14370 = m14370();
            this.f46898.mo7();
            int m14355 = m14355(m14370, this.f46898, 2);
            if (m14355 != -5) {
                if (m14355 == -4) {
                    C22632.m50634(this.f46898.m12697());
                    this.f46917 = true;
                    this.f46910 = true;
                    return;
                }
                return;
            }
            m36296(m14370);
        }
        m36294();
        if (this.f46918 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m36292(j)) {
                }
                while (m36293()) {
                }
                Trace.endSection();
                synchronized (this.f46904) {
                }
            } catch (C8437 e) {
                C19956.m46034("Video codec error", e);
                this.f46916.m27085((Exception) e);
                throw m14356(e, this.f46920, 4003);
            }
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ۧ */
    public final boolean mo6098() {
        return this.f46910;
    }

    @Override // l.InterfaceC1837
    /* renamed from: ܿ */
    public final boolean mo6101() {
        if (this.f46920 != null && ((m14365() || this.f46905 != null) && (this.f46891 == 3 || this.f46921 == -1))) {
            this.f46897 = -9223372036854775807L;
            return true;
        }
        if (this.f46897 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f46897) {
            return true;
        }
        this.f46897 = -9223372036854775807L;
        return false;
    }

    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo13457(boolean z, boolean z2) {
        C3519 c3519 = new C3519();
        this.f46904 = c3519;
        this.f46916.m27093(c3519);
        this.f46891 = z2 ? 1 : 0;
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ۜ */
    public final void mo6095() {
        if (this.f46891 == 0) {
            this.f46891 = 1;
        }
    }

    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo13451(long j, boolean z) {
        this.f46917 = false;
        this.f46910 = false;
        this.f46891 = Math.min(this.f46891, 1);
        this.f46912 = -9223372036854775807L;
        this.f46900 = 0;
        if (this.f46918 != null) {
            m36298();
        }
        if (!z) {
            this.f46897 = -9223372036854775807L;
        } else {
            long j2 = this.f46911;
            this.f46897 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
        this.f46892.m47025();
    }

    @Override // l.AbstractC4930
    /* renamed from: ܰ */
    public final void mo13466() {
        this.f46915 = 0;
        this.f46896 = SystemClock.elapsedRealtime();
        this.f46895 = C3603.m11014(SystemClock.elapsedRealtime());
    }

    @Override // l.AbstractC4930
    /* renamed from: ۟ */
    public final void mo13462() {
        this.f46897 = -9223372036854775807L;
        if (this.f46915 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f46916.m27084(this.f46915, elapsedRealtime - this.f46896);
            this.f46915 = 0;
            this.f46896 = elapsedRealtime;
        }
    }

    @Override // l.AbstractC4930
    /* renamed from: ۤ */
    public final void mo13464() {
        C10833 c10833 = this.f46916;
        this.f46920 = null;
        this.f46893 = null;
        this.f46891 = Math.min(this.f46891, 0);
        try {
            C18566.m43106(this.f46906, (InterfaceC0220) null);
            this.f46906 = null;
            m36299();
        } finally {
            c10833.m27089(this.f46904);
        }
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m36298() {
        this.f46922 = 0;
        if (this.f46894 != 0) {
            m36299();
            m36294();
            return;
        }
        this.f46919 = null;
        if (this.f46905 != null) {
            throw null;
        }
        InterfaceC1381 interfaceC1381 = this.f46918;
        interfaceC1381.getClass();
        interfaceC1381.flush();
        interfaceC1381.mo4864(m14371());
        this.f46913 = false;
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final void m36299() {
        this.f46919 = null;
        this.f46905 = null;
        this.f46894 = 0;
        this.f46913 = false;
        this.f46922 = 0;
        InterfaceC1381 interfaceC1381 = this.f46918;
        if (interfaceC1381 != null) {
            this.f46904.f11175++;
            interfaceC1381.mo12();
            this.f46916.m27087(this.f46918.getName());
            this.f46918 = null;
        }
        C18566.m43106(this.f46903, (InterfaceC0220) null);
        this.f46903 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36296(C3002 c3002) {
        C13396 mo30947;
        this.f46914 = true;
        C8353 c8353 = c3002.f9455;
        c8353.getClass();
        InterfaceC0220 interfaceC0220 = c3002.f9454;
        C18566.m43106(this.f46906, interfaceC0220);
        this.f46906 = interfaceC0220;
        C8353 c83532 = this.f46920;
        this.f46920 = c8353;
        InterfaceC1381 interfaceC1381 = this.f46918;
        C10833 c10833 = this.f46916;
        if (interfaceC1381 == null) {
            m36294();
            C8353 c83533 = this.f46920;
            c83533.getClass();
            c10833.m27091(c83533, (C13396) null);
            return;
        }
        if (interfaceC0220 != this.f46903) {
            String name = interfaceC1381.getName();
            c83532.getClass();
            mo30947 = new C13396(name, c83532, c8353, 0, 128);
        } else {
            String name2 = interfaceC1381.getName();
            c83532.getClass();
            mo30947 = mo30947(name2, c83532, c8353);
        }
        if (mo30947.f40048 == 0) {
            if (this.f46913) {
                this.f46894 = 1;
            } else {
                m36299();
                m36294();
            }
        }
        C8353 c83534 = this.f46920;
        c83534.getClass();
        c10833.m27091(c83534, mo30947);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36295(int i, int i2) {
        int i3;
        C3519 c3519 = this.f46904;
        c3519.f11180 += i;
        int i4 = i + i2;
        c3519.f11178 += i4;
        this.f46915 += i4;
        int i5 = this.f46900 + i4;
        this.f46900 = i5;
        c3519.f11176 = Math.max(i5, c3519.f11176);
        int i6 = this.f46909;
        if (i6 <= 0 || (i3 = this.f46915) < i6 || i3 <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f46916.m27084(this.f46915, elapsedRealtime - this.f46896);
        this.f46915 = 0;
        this.f46896 = elapsedRealtime;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36297(C13375 c13375, long j, C8353 c8353) {
        InterfaceC22618 interfaceC22618 = this.f46902;
        if (interfaceC22618 != null) {
            interfaceC22618.mo24148(j, m14362().mo33835(), c8353, null);
        }
        this.f46895 = C3603.m11014(SystemClock.elapsedRealtime());
        c13375.getClass();
        boolean z = this.f46899 != null;
        if (!z) {
            m36295(0, 1);
            throw null;
        }
        C6404 c6404 = this.f46893;
        C10833 c10833 = this.f46916;
        if (c6404 == null || c6404.f19815 != 0 || c6404.f19813 != 0) {
            C6404 c64042 = new C6404(0, 0);
            this.f46893 = c64042;
            c10833.m27090(c64042);
        }
        if (!z) {
            this.f46901.getClass();
        } else {
            InterfaceC21913 interfaceC21913 = this.f46899;
            interfaceC21913.getClass();
            interfaceC21913.mo36707(c13375);
        }
        this.f46900 = 0;
        this.f46904.f11172++;
        if (this.f46891 != 3) {
            this.f46891 = 3;
            Object obj = this.f46908;
            if (obj != null) {
                c10833.m27086(obj);
            }
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC5783
    /* renamed from: ֫ */
    public final void mo13450(int i, Object obj) {
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.f46902 = (InterfaceC22618) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f46901 = (Surface) obj;
            this.f46899 = null;
            this.f46921 = 1;
        } else if (obj instanceof InterfaceC21913) {
            this.f46901 = null;
            this.f46899 = (InterfaceC21913) obj;
            this.f46921 = 0;
        } else {
            this.f46901 = null;
            this.f46899 = null;
            this.f46921 = -1;
            obj = null;
        }
        Object obj3 = this.f46908;
        C10833 c10833 = this.f46916;
        if (obj3 == obj) {
            if (obj != null) {
                C6404 c6404 = this.f46893;
                if (c6404 != null) {
                    c10833.m27090(c6404);
                }
                if (this.f46891 != 3 || (obj2 = this.f46908) == null) {
                    return;
                }
                c10833.m27086(obj2);
                return;
            }
            return;
        }
        this.f46908 = obj;
        if (obj == null) {
            this.f46893 = null;
            this.f46891 = Math.min(this.f46891, 1);
            return;
        }
        C6404 c64042 = this.f46893;
        if (c64042 != null) {
            c10833.m27090(c64042);
        }
        this.f46891 = Math.min(this.f46891, 1);
        if (getState() == 2) {
            long j = this.f46911;
            this.f46897 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    /* renamed from: ֫ */
    public C13396 mo30947(String str, C8353 c8353, C8353 c83532) {
        return new C13396(str, c8353, c83532, 0, 1);
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m36294() {
        if (this.f46918 != null) {
            return;
        }
        InterfaceC0220 interfaceC0220 = this.f46906;
        C18566.m43106(this.f46903, interfaceC0220);
        this.f46903 = interfaceC0220;
        if (interfaceC0220 != null && interfaceC0220.mo1474() == null && this.f46903.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            C8353 c8353 = this.f46920;
            c8353.getClass();
            mo30948(c8353);
            this.f46918 = null;
            throw null;
        } catch (OutOfMemoryError e) {
            throw m14356(e, this.f46920, OpenAuthTask.NOT_INSTALLED);
        } catch (C8437 e2) {
            C19956.m46034("Video codec error", e2);
            this.f46916.m27085((Exception) e2);
            throw m14356(e2, this.f46920, OpenAuthTask.NOT_INSTALLED);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r0 == null) goto L38;
     */
    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m36293() {
        /*
            r8 = this;
            l.֨᩸֫ r0 = r8.f46918
            r1 = 0
            if (r0 == 0) goto L9d
            int r2 = r8.f46894
            r3 = 2
            if (r2 == r3) goto L9d
            boolean r2 = r8.f46917
            if (r2 == 0) goto L10
            goto L9d
        L10:
            l.᩸᩸֫ r2 = r8.f46919
            if (r2 != 0) goto L20
            java.lang.Object r0 = r0.mo4865()
            l.᩸᩸֫ r0 = (l.C21843) r0
            r8.f46919 = r0
            if (r0 != 0) goto L20
            goto L9d
        L20:
            l.᩸᩸֫ r0 = r8.f46919
            r0.getClass()
            int r2 = r8.f46894
            r4 = 0
            r5 = 1
            if (r2 != r5) goto L3c
            r2 = 4
            r0.m12693(r2)
            l.֨᩸֫ r2 = r8.f46918
            r2.getClass()
            r2.mo4862(r0)
            r8.f46919 = r4
            r8.f46894 = r3
            return r1
        L3c:
            l.ۗۙ֫ r2 = r8.m14370()
            int r3 = r8.m14355(r2, r0, r1)
            r6 = -5
            if (r3 == r6) goto L99
            r2 = -4
            if (r3 == r2) goto L54
            r0 = -3
            if (r3 != r0) goto L4e
            goto L9d
        L4e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L54:
            boolean r2 = r0.m12697()
            if (r2 == 0) goto L67
            r8.f46917 = r5
            l.֨᩸֫ r2 = r8.f46918
            r2.getClass()
            r2.mo4862(r0)
            r8.f46919 = r4
            return r1
        L67:
            boolean r2 = r8.f46914
            if (r2 == 0) goto L79
            long r2 = r0.f69997
            l.۠ᩴ֫ r6 = r8.f46920
            r6.getClass()
            l.᩷֨֫ r7 = r8.f46892
            r7.m47026(r2, r6)
            r8.f46914 = r1
        L79:
            r0.m49229()
            l.۠ᩴ֫ r1 = r8.f46920
            r0.f69994 = r1
            l.֨᩸֫ r1 = r8.f46918
            r1.getClass()
            r1.mo4862(r0)
            int r0 = r8.f46922
            int r0 = r0 + r5
            r8.f46922 = r0
            r8.f46913 = r5
            l.ۗ᩹֫ r0 = r8.f46904
            int r1 = r0.f11182
            int r1 = r1 + r5
            r0.f11182 = r1
            r8.f46919 = r4
            return r5
        L99:
            r8.m36296(r2)
            return r5
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC15289.m36293():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        if (r1 != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m36292(long r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC15289.m36292(long):boolean");
    }
}
