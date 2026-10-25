package l;

import com.alipay.sdk.m.y.o;
import java.util.List;

/* compiled from: O700 */
/* renamed from: l.᩷ۡܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20777 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile C22913 f67284;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17248 f67285;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16747 f67286;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14425 f67287 = new C14425();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6665 f67288;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12392 f67289;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23803 f67290;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m47485(C15068 c15068) {
        m47499(true, false, false);
        this.f67287.f44222 = false;
        this.f67284 = C22913.m50999(c15068);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47500(int i, int i2, int i3, int i4) {
        return i >= 0 && i <= i3 && i4 <= i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized boolean m47501(C10193 c10193) {
        C4048 c4048;
        InterfaceC7785 m30436 = this.f67289.m30436();
        C23097 m51001 = this.f67284.m51001();
        if (c10193.m25591()) {
            C20798 c20798 = c10193.f30625;
            if (c20798.f67336 == m30436 && c20798.f67334 == m51001 && m51001.m51272()) {
                int i = c10193.f30624;
                C14425 c14425 = this.f67287;
                if (i == c14425.f44223 && !c14425.f44215) {
                    C4048 c40482 = c14425.f44216;
                    if (c40482 != null && c40482.m12169(m30436, m51001, m30436.mo26548(), m30436.length())) {
                        C13035 c13035 = c40482.f12857;
                        C13035 c130352 = c10193.f30626;
                        if (c13035 == c130352) {
                            return true;
                        }
                        c4048 = c40482.m12167(c130352);
                        C14425 c144252 = this.f67287;
                        c144252.f44216 = c4048.m12166(c144252.f44217);
                        return true;
                    }
                    int mo26548 = m30436.mo26548();
                    int length = m30436.length();
                    C13035 c130353 = c10193.f30626;
                    c4048 = new C4048(m30436, m51001, mo26548, length, c130353, c130353);
                    C14425 c1442522 = this.f67287;
                    c1442522.f44216 = c4048.m12166(c1442522.f44217);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bb, code lost:
    
        if (r1.m19244(r3.f20719, r3.f20709) == false) goto L56;
     */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean m47506(l.InterfaceC20445 r6) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20777.m47506(l.᩶᩸ᩳ):boolean");
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized void m47536() {
        m47485((C15068) null);
        this.f67287.f44222 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47537() {
        if (this.f67288.f20696 != null) {
            m47499(false, false, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47540(C10130 c10130) {
        InterfaceC7785 m30436 = this.f67289.m30436();
        C22707 c22707 = m47502(m30436, m30436.mo26548()) ? this.f67285.f52874 : null;
        C22913 c22913 = this.f67284;
        C9302 c9302 = this.f67287.f44224;
        C14425 c14425 = this.f67287;
        C17975 c17975 = c14425.f44221;
        boolean z = c14425.f44222;
        C14425 c144252 = this.f67287;
        C18660.m43265(c10130, c22913, c9302, c17975, z, c144252.f44215, c144252.f44217, c22707);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        if (r1.m19244(r4, r5) != false) goto L12;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m47543(int r4, int r5) {
        /*
            r3 = this;
            r0 = r3
            monitor-enter(r0)
            l.ܳۡܿ r1 = r3.f67287     // Catch: java.lang.Throwable -> L18
            boolean r2 = r1.f44215     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L15
            l.۟ۖܿ r1 = r1.f44217     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L13
            boolean r4 = r1.m19244(r4, r5)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L13
            goto L15
        L13:
            r4 = 0
            goto L16
        L15:
            r4 = 1
        L16:
            monitor-exit(r0)
            return r4
        L18:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20777.m47543(int, int):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m47546(C12951 c12951, int i) {
        m47499(true, false, false);
        this.f67287.f44222 = false;
        C15836 m43260 = C18660.m43260(i, this.f67289.m30436().length(), c12951);
        this.f67284 = m43260.m37489();
        m47483(m43260.m37493(), m43260.m37488(), m43260.m37490(), m43260.m37492(), false);
        this.f67287.f44222 = m43260.m37494();
        C22707 m37491 = m43260.m37491();
        if (this.f67287.f44222 && m37491 != null) {
            InterfaceC7785 m30436 = this.f67289.m30436();
            m47509();
            m47532();
            C17248 c17248 = this.f67285;
            c17248.f52874 = m37491;
            c17248.f52878 = true;
            c17248.f52876 = m30436.mo26548();
            c17248.f52872 = m30436.length();
            c17248.f52875 = m30436;
            c17248.f52866 = false;
            c17248.f52868 = false;
        } else if (this.f67287.f44222 && m43260.m37492() != null) {
            m47489(this.f67289.m30436(), m43260.m37492());
        }
        return this.f67287.f44222;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47549() {
        m47499(true, false, false);
        this.f67287.f44219 = null;
        this.f67287.f44220 = null;
        this.f67287.f44225 = null;
        this.f67287.f44222 = false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long m47553() {
        if (this.f67289.m30483() && !this.f67289.m30532()) {
            InterfaceC7785 m30436 = this.f67289.m30436();
            if (m47502(m30436, m30436.mo26548())) {
                return -1L;
            }
            if (this.f67284.m51000() != null && m47559() == null) {
                return -1L;
            }
            C14425 c14425 = this.f67287;
            C7185 c7185 = c14425.f44217;
            if (c7185 != null) {
                if (m47504(this.f67289.m30436()) && c7185.m19250()) {
                    return (c7185.m19245() << 32) | (c7185.m19241() & 4294967295L);
                }
                return -1L;
            }
            if (c14425.f44224 != null && !this.f67287.f44215) {
                return -1L;
            }
            C6665 c6665 = this.f67288;
            return (c6665.f20699 == -1 && c6665.f20708 == -1 && !m47504(this.f67289.m30436())) ? Long.MIN_VALUE : -1L;
        }
        return -1L;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47554(CharSequence charSequence) {
        if (m47526(charSequence)) {
            m47508((InterfaceC20445) charSequence);
            return;
        }
        if (this.f67289.m30436() == charSequence) {
            m47499(true, false, false);
            this.f67287.f44222 = false;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47555(InterfaceC20445 interfaceC20445, int i, int i2) {
        if (this.f67287.f44222 && this.f67288.f20704 == interfaceC20445 && m47523((CharSequence) interfaceC20445) && i < i2 && i2 <= interfaceC20445.length()) {
            m47479(interfaceC20445, interfaceC20445.mo26548(), C22707.m50723(-1, -1, i, i2), EnumC16542.MERGE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        if (m47500(r1.f20719, r1.f20709, r6, r7) == false) goto L37;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m47556(int r6, int r7) {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            l.۫ۨᩳ r1 = r5.f67289     // Catch: java.lang.Throwable -> L68
            l.۟᩺ᩳ r1 = r1.m30436()     // Catch: java.lang.Throwable -> L68
            boolean r2 = r5.m47519(r1)     // Catch: java.lang.Throwable -> L68
            r3 = 0
            if (r2 != 0) goto L11
            monitor-exit(r0)
            return r3
        L11:
            r2 = 1
            if (r6 < 0) goto L66
            if (r6 > r7) goto L66
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L68
            if (r7 <= r4) goto L1d
            goto L66
        L1d:
            boolean r4 = r5.m47511(r1)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L30
            l.ۜۡܿ r1 = r5.f67288     // Catch: java.lang.Throwable -> L68
            int r3 = r1.f20699     // Catch: java.lang.Throwable -> L68
            int r1 = r1.f20706     // Catch: java.lang.Throwable -> L68
            boolean r6 = m47500(r3, r1, r6, r7)     // Catch: java.lang.Throwable -> L68
            r6 = r6 ^ r2
            monitor-exit(r0)
            return r6
        L30:
            boolean r4 = r5.m47516()     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L43
            l.ۜۡܿ r1 = r5.f67288     // Catch: java.lang.Throwable -> L68
            int r3 = r1.f20708     // Catch: java.lang.Throwable -> L68
            int r1 = r1.f20713     // Catch: java.lang.Throwable -> L68
            boolean r6 = m47500(r3, r1, r6, r7)     // Catch: java.lang.Throwable -> L68
            r6 = r6 ^ r2
            monitor-exit(r0)
            return r6
        L43:
            l.ܳۡܿ r2 = r5.f67287     // Catch: java.lang.Throwable -> L68
            l.۟ۖܿ r2 = r2.f44217     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L51
            boolean r2 = r2.m19244(r6, r7)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L51
            monitor-exit(r0)
            return r3
        L51:
            boolean r1 = r5.m47504(r1)     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L63
            l.ۜۡܿ r1 = r5.f67288     // Catch: java.lang.Throwable -> L68
            int r2 = r1.f20719     // Catch: java.lang.Throwable -> L68
            int r1 = r1.f20709     // Catch: java.lang.Throwable -> L68
            boolean r6 = m47500(r2, r1, r6, r7)     // Catch: java.lang.Throwable -> L68
            if (r6 != 0) goto L64
        L63:
            r3 = 1
        L64:
            monitor-exit(r0)
            return r3
        L66:
            monitor-exit(r0)
            return r2
        L68:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20777.m47556(int, int):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m47558(InterfaceC20445 interfaceC20445) {
        C7185 c7185;
        m47515();
        if (m47519((CharSequence) interfaceC20445)) {
            if (!m47504(interfaceC20445) && !m47511(interfaceC20445) && !m47516() && ((c7185 = this.f67287.f44217) == null || c7185.m19247().m23880() != interfaceC20445.length())) {
                m47491(interfaceC20445, false);
            }
            m47506(interfaceC20445);
            return false;
        }
        if (!m47523((CharSequence) interfaceC20445)) {
            return true;
        }
        C9302 c9302 = this.f67287.f44224;
        if (this.f67287.f44217 == null && c9302 != null && c9302.m23880() == interfaceC20445.length()) {
            if (!this.f67287.f44215 && m47510(interfaceC20445)) {
                m47514(interfaceC20445, false);
            }
            return false;
        }
        m47508(interfaceC20445);
        return false;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47560(InterfaceC20445 interfaceC20445) {
        int i;
        if (this.f67287.f44222 && this.f67288.f20704 == interfaceC20445 && this.f67287.f44224 != null && this.f67287.f44224.m23880() == interfaceC20445.length() && interfaceC20445.length() != 0) {
            int length = interfaceC20445.length();
            if (!m47523((CharSequence) interfaceC20445)) {
                C7185 c7185 = this.f67287.f44217;
                if (m47528((CharSequence) interfaceC20445) && c7185 != null && c7185.m19250()) {
                    i = c7185.m19245();
                    length = c7185.m19241();
                }
                return;
            }
            i = 0;
            m47509();
            m47479(interfaceC20445, interfaceC20445.mo26548(), C22707.m50723(-1, -1, i, length), EnumC16542.MERGE);
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m47561() {
        return this.f67287.f44215;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47570() {
        m47499(false, true, true);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized void m47574(InterfaceC20445 interfaceC20445) {
        if (this.f67287.f44222 && this.f67289.isAttachedToWindow() && this.f67289.m30389() && !this.f67289.m30532()) {
            if (m47523((CharSequence) interfaceC20445)) {
                if (this.f67288.f20696 != interfaceC20445) {
                    m47514(interfaceC20445, true);
                }
            } else if (m47528((CharSequence) interfaceC20445) && m47504(interfaceC20445)) {
                C6665 c6665 = this.f67288;
                m47488(interfaceC20445, c6665.f20719, c6665.f20709, true);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47538(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 == 0 && i3 == 0) {
            this.f67290.f77021 = false;
            return;
        }
        m47515();
        C15068 m51000 = this.f67284.m51000();
        if (m51000 != null && this.f67287.f44222 && (charSequence instanceof InterfaceC20445)) {
            InterfaceC20445 interfaceC20445 = (InterfaceC20445) charSequence;
            if (m47526((CharSequence) interfaceC20445)) {
                boolean m30532 = this.f67289.m30532();
                C4048 c4048 = this.f67287.f44216;
                if (c4048 != null) {
                    this.f67287.f44216 = m30532 ? null : c4048.m12168(interfaceC20445, this.f67284.m51001(), interfaceC20445.mo26548(), interfaceC20445.length(), i, i2, i3, (i <= 0 || this.f67287.f44224 == null || i > this.f67287.f44224.m23880()) ? m51000.m35661() : this.f67287.f44224.m23883(i - 1));
                }
                m47487(interfaceC20445, i, i2, i3, m30532);
                m47486(interfaceC20445, i, i2, i3, m51000, m30532);
                return;
            }
        }
        this.f67290.f77021 = false;
    }

    public C20777(C12392 c12392, C20177 c20177) {
        C6665 c6665 = new C6665();
        c6665.f20699 = -1;
        c6665.f20706 = -1;
        c6665.f20719 = -1;
        c6665.f20709 = -1;
        c6665.f20708 = -1;
        c6665.f20713 = -1;
        this.f67288 = c6665;
        C17248 c17248 = new C17248();
        C22707 c22707 = C22707.f73353;
        c17248.f52869 = c22707;
        c17248.f52874 = c22707;
        this.f67285 = c17248;
        this.f67290 = new C23803();
        this.f67289 = c12392;
        this.f67286 = new C16747(new ExecutorC1726(c12392), new C10899(this, c12392));
        m47485((C15068) null);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C9302 m47551() {
        return this.f67287.f44224;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47495(C20777 c20777, C10193 c10193) {
        if (c20777.m47501(c10193)) {
            c20777.f67289.postInvalidateOnAnimation();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47539(C7391 c7391, int i, int i2) {
        int i3;
        int i4 = -1;
        c7391.m19901((C13035) null, -1, -1, 0);
        C10193 m39419 = this.f67286.m39419();
        C4048 c4048 = this.f67287.f44216;
        if (m39419 == null && c4048 == null) {
            return;
        }
        C23097 m51001 = this.f67284.m51001();
        InterfaceC7785 m30436 = this.f67289.m30436();
        if (this.f67287.f44222 && m51001 != null && m51001.m51272() && this.f67289.isAttachedToWindow() && this.f67289.m30483() && !this.f67289.m30532() && !this.f67287.f44215) {
            if (m39419 != null && (c4048 == null || c4048.f12857 != m39419.f30626)) {
                m47501(m39419);
                c4048 = this.f67287.f44216;
            }
            if (c4048 == null || !c4048.m12169(m30436, m51001, m30436.mo26548(), m30436.length())) {
                return;
            }
            C13035 c13035 = c4048.f12860;
            if (c13035.f39035 <= i || c13035.f39036 >= i2) {
                return;
            }
            C7185 c7185 = this.f67287.f44217;
            if (c7185 == null || !c7185.m19250()) {
                i3 = -1;
            } else {
                i4 = c7185.m19245();
                i3 = c7185.m19241();
                if (i4 <= Math.max(i, c13035.f39036) && Math.min(i2, c13035.f39035) <= i3) {
                    return;
                }
            }
            c7391.m19901(c13035, i4, i3, m51001.f74319.m49205());
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m47571() {
        this.f67289.m30415();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9302 m47573() {
        if (!this.f67287.f44222) {
            return null;
        }
        C23097 m51001 = this.f67284.m51001();
        C23598 c23598 = this.f67287.f44225;
        InterfaceC7785 m30436 = this.f67289.m30436();
        if (c23598 != null && m51001 != null && m51001.m51272() && c23598.f76505 == m30436 && c23598.f76503 == m51001 && c23598.f76502 == m30436.mo26548() && c23598.f76506 == m30436.length()) {
            return c23598.f76504;
        }
        return null;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6686 m47559() {
        if (!this.f67287.f44222) {
            return null;
        }
        C6686 c6686 = this.f67287.f44219;
        C23097 m51001 = this.f67284.m51001();
        InterfaceC7785 m30436 = this.f67289.m30436();
        if (c6686 == null || m51001 == null || !m51001.m51272() || !c6686.m18229(m30436, m51001)) {
            return null;
        }
        return c6686;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6686 m47572() {
        if (!this.f67287.f44222) {
            return null;
        }
        C6686 c6686 = this.f67287.f44220;
        C23097 m51001 = this.f67284.m51001();
        InterfaceC7785 m30436 = this.f67289.m30436();
        if (c6686 == null || m51001 == null || !m51001.m51272() || !c6686.m18229(m30436, m51001)) {
            return null;
        }
        return c6686;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47568(InterfaceC20445 interfaceC20445) {
        boolean z;
        C5959 c5959;
        C7370 c7370;
        C7370 m39423;
        C5959 m39421;
        synchronized (this) {
            z = false;
            if (this.f67288.f20696 != interfaceC20445 || m47515()) {
                c5959 = null;
                c7370 = null;
            } else {
                C6665 c6665 = this.f67288;
                c6665.f20714 = true;
                c5959 = c6665.f20715;
                c7370 = c6665.f20702;
                if (c5959 == null && (m39421 = this.f67286.m39421()) != null && this.f67286.m39417(m39421)) {
                    c5959 = m39421;
                }
                if (c7370 == null && (m39423 = this.f67286.m39423()) != null && this.f67286.m39418(m39423)) {
                    c7370 = m39423;
                }
                if (c5959 == null && c7370 == null) {
                    C6665 c66652 = this.f67288;
                    if (!c66652.f20697 && !c66652.f20710) {
                        z = true;
                    }
                    m47505();
                }
                m47505();
            }
        }
        if (c5959 != null) {
            m47481(c5959);
            return;
        }
        if (c7370 != null) {
            m47482(c7370);
        } else if (z) {
            this.f67289.m30405();
        } else {
            if (m47506(interfaceC20445)) {
                return;
            }
            this.f67289.m30405();
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m47535() {
        this.f67289.m30515();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47563(InterfaceC20445 interfaceC20445) {
        boolean z;
        RunnableC17954 runnableC17954;
        synchronized (this) {
            boolean z2 = true;
            z = false;
            if (m47502(interfaceC20445, interfaceC20445.mo26548()) && this.f67284.m51000() != null) {
                m47509();
                runnableC17954 = m47477(interfaceC20445, interfaceC20445.mo26548(), this.f67285.f52874);
                C17248 c17248 = this.f67285;
                boolean z3 = c17248.f52868;
                C6665 c6665 = this.f67288;
                if ((!c6665.f20697 || c6665.f20704 != interfaceC20445) && (!c6665.f20710 || !m47511(interfaceC20445))) {
                    z2 = false;
                }
                c17248.f52868 = z2 | z3;
                this.f67285.f52871 = runnableC17954;
            } else {
                C6665 c66652 = this.f67288;
                if ((!c66652.f20697 || c66652.f20704 != interfaceC20445) && (!c66652.f20710 || !m47511(interfaceC20445))) {
                    z2 = false;
                }
                runnableC17954 = null;
                z = z2;
            }
        }
        if (runnableC17954 == null) {
            if (z) {
                m47506(interfaceC20445);
            }
            this.f67289.m30405();
        } else {
            C12392 c12392 = this.f67289;
            c12392.postInvalidate();
            c12392.post(runnableC17954);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47542(InterfaceC20445 interfaceC20445, int i, int i2) {
        C7185 c7185;
        C7185 c71852;
        this.f67286.m39412(interfaceC20445, i, i2);
        synchronized (this) {
            if (this.f67287.f44222 && this.f67289.isAttachedToWindow() && !this.f67289.m30532() && this.f67288.f20704 == interfaceC20445) {
                if (m47523((CharSequence) interfaceC20445) && this.f67287.f44215) {
                    return;
                }
                if (i2 <= i || !m47528((CharSequence) interfaceC20445) || (c71852 = this.f67287.f44217) == null || !c71852.m19244(i, i2)) {
                    if (i2 > i && m47528((CharSequence) interfaceC20445) && ((c7185 = this.f67287.f44217) == null || !c7185.m19244(i, i2))) {
                        m47488(interfaceC20445, i, i2, this.f67289.m30389());
                    }
                    C16747 c16747 = this.f67286;
                    c16747.m39411(c16747.m39409(interfaceC20445));
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47541(InterfaceC20445 interfaceC20445) {
        if (m47506(interfaceC20445)) {
            return;
        }
        this.f67289.m30405();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m47523(CharSequence charSequence) {
        return m47526(charSequence) && charSequence.length() <= 1000000;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m47519(CharSequence charSequence) {
        return m47526(charSequence) && charSequence.length() > 1000000;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m47510(InterfaceC20445 interfaceC20445) {
        if (!m47523((CharSequence) interfaceC20445)) {
            return false;
        }
        C12392 c12392 = this.f67289;
        return c12392.isAttachedToWindow() && c12392.m30483() && !c12392.m30532();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private boolean m47521(InterfaceC20445 interfaceC20445) {
        if (!m47528((CharSequence) interfaceC20445)) {
            return false;
        }
        C12392 c12392 = this.f67289;
        return c12392.isAttachedToWindow() && c12392.m30483() && !c12392.m30532();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47514(InterfaceC20445 interfaceC20445, boolean z) {
        if (m47529(interfaceC20445) || m47531(interfaceC20445)) {
            return;
        }
        if (this.f67288.f20707 != null) {
            m47533();
        }
        m47505();
        C6665 c6665 = this.f67288;
        c6665.f20697 = false;
        c6665.f20704 = interfaceC20445;
        if (z) {
            c6665.f20696 = interfaceC20445;
        }
        this.f67286.m39415(this.f67284.m51001(), interfaceC20445, this.f67287.f44224, this.f67287.f44223);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47488(InterfaceC20445 interfaceC20445, int i, int i2, boolean z) {
        if (z || m47521(interfaceC20445)) {
            m47534(interfaceC20445, i, i2);
            if (m47529(interfaceC20445)) {
                return;
            }
            if (m47511(interfaceC20445)) {
                C6665 c6665 = this.f67288;
                if (c6665.f20699 <= i && i2 <= c6665.f20706) {
                    return;
                }
            }
            if (m47516()) {
                C6665 c66652 = this.f67288;
                if (c66652.f20708 <= i && i2 <= c66652.f20713) {
                    return;
                }
            }
            m47530();
            m47505();
            if (z) {
                this.f67288.f20696 = interfaceC20445;
            }
            C6665 c66653 = this.f67288;
            c66653.f20704 = interfaceC20445;
            c66653.f20699 = i;
            c66653.f20706 = i2;
            c66653.f20705 = interfaceC20445.mo26548();
            this.f67288.f20700 = interfaceC20445.length();
            C6665 c66654 = this.f67288;
            c66654.f20717 = this.f67287.f44223;
            c66654.f20710 = false;
            this.f67286.m39420(this.f67284.m51001(), interfaceC20445, i, i2, this.f67287.f44223);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47518(InterfaceC20445 interfaceC20445, int i, int i2) {
        boolean m47511 = m47511(interfaceC20445);
        C6665 c6665 = this.f67288;
        if ((!m47511 || !m47500(c6665.f20699, c6665.f20706, i, i2)) && c6665.f20699 != -1) {
            this.f67286.m39422();
            m47507();
        }
        if (c6665.f20708 != -1 && (!m47516() || !m47500(c6665.f20708, c6665.f20713, i, i2))) {
            m47530();
        }
        c6665.f20704 = interfaceC20445;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47491(InterfaceC20445 interfaceC20445, boolean z) {
        m47499(false, false, false);
        C7185 m19240 = C7185.m19240(interfaceC20445.length(), this.f67284.m51000().m35661());
        m47483(m19240.m19247(), (C17975) null, false, m19240, z);
        m47534(interfaceC20445, 0, Math.min(interfaceC20445.length(), 10000));
        this.f67287.f44222 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47499(boolean z, boolean z2, boolean z3) {
        if (z || !z3) {
            this.f67287.f44216 = null;
        }
        this.f67286.m39410();
        C6665 c6665 = this.f67288;
        c6665.f20697 = false;
        c6665.f20704 = null;
        m47505();
        m47507();
        if (!z2) {
            m47533();
            m47530();
        }
        if (!z3) {
            C6665 c66652 = this.f67288;
            c66652.f20719 = -1;
            c66652.f20709 = -1;
            c66652.f20718 = 0;
            c66652.f20701 = 0;
            c66652.f20716 = null;
            m47532();
        }
        if (z) {
            this.f67287.f44222 = false;
            m47483((C9302) null, (C17975) null, false, (C7185) null, false);
        }
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47507() {
        C6665 c6665 = this.f67288;
        c6665.f20699 = -1;
        c6665.f20706 = -1;
        c6665.f20705 = 0;
        c6665.f20700 = 0;
        c6665.f20717 = 0;
        c6665.f20710 = false;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m47530() {
        C6665 c6665 = this.f67288;
        c6665.f20708 = -1;
        c6665.f20713 = -1;
        c6665.f20712 = 0;
        c6665.f20703 = 0;
        c6665.f20720 = null;
        c6665.getClass();
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m47533() {
        C6665 c6665 = this.f67288;
        c6665.f20698 = 0;
        c6665.f20711 = 0;
        c6665.f20707 = null;
        c6665.getClass();
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m47505() {
        C6665 c6665 = this.f67288;
        c6665.f20696 = null;
        c6665.f20715 = null;
        c6665.f20702 = null;
        c6665.f20714 = false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m47534(InterfaceC20445 interfaceC20445, int i, int i2) {
        C11003.checkFromToIndex(i, i2, interfaceC20445.length());
        C6665 c6665 = this.f67288;
        c6665.f20719 = i;
        c6665.f20709 = i2;
        c6665.f20718 = interfaceC20445.mo26548();
        c6665.f20701 = interfaceC20445.length();
        c6665.f20716 = interfaceC20445;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m47504(InterfaceC20445 interfaceC20445) {
        C6665 c6665 = this.f67288;
        return c6665.f20716 == interfaceC20445 && c6665.f20719 != -1 && c6665.f20718 == interfaceC20445.mo26548() && c6665.f20701 == interfaceC20445.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m47489(InterfaceC20445 interfaceC20445, C7185 c7185) {
        C17248 c17248 = this.f67285;
        c17248.f52870 = c7185;
        c17248.f52869 = C22707.m50723(-1, -1, c7185.m19245(), c7185.m19241());
        c17248.f52877 = interfaceC20445.mo26548();
        c17248.f52867 = interfaceC20445.length();
        c17248.f52873 = interfaceC20445;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47498(C20777 c20777, InterfaceC20445 interfaceC20445, C22707 c22707) {
        C17248 c17248 = c20777.f67285;
        c17248.f52870 = null;
        c17248.f52869 = c22707;
        c17248.f52877 = interfaceC20445.mo26548();
        c17248.f52867 = interfaceC20445.length();
        c17248.f52873 = interfaceC20445;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m47532() {
        C17248 c17248 = this.f67285;
        c17248.f52870 = null;
        c17248.f52869 = C22707.f73353;
        c17248.f52877 = 0;
        c17248.f52867 = 0;
        c17248.f52873 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m47520() {
        m47509();
        C22707 c22707 = C22707.f73353;
        C17248 c17248 = this.f67285;
        c17248.f52874 = c22707;
        c17248.f52878 = false;
        c17248.f52876 = 0;
        c17248.f52872 = 0;
        c17248.f52875 = null;
        c17248.f52866 = false;
        c17248.f52868 = false;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m47509() {
        C17248 c17248 = this.f67285;
        RunnableC17954 runnableC17954 = c17248.f52871;
        c17248.f52871 = null;
        if (runnableC17954 != null) {
            this.f67289.removeCallbacks(runnableC17954);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m47502(InterfaceC20445 interfaceC20445, int i) {
        C17248 c17248 = this.f67285;
        return c17248.f52878 && c17248.f52875 == interfaceC20445 && c17248.f52876 == i && c17248.f52872 == interfaceC20445.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C22707 m47479(InterfaceC20445 interfaceC20445, int i, C22707 c22707, EnumC16542 enumC16542) {
        boolean m47502 = m47502(interfaceC20445, i);
        C17248 c17248 = this.f67285;
        if (!m47502) {
            c17248.f52866 = false;
            c17248.f52868 = false;
        }
        if (enumC16542 != EnumC16542.REPLACE && m47502) {
            c22707 = c17248.f52874.m50726(c22707);
        }
        c17248.f52874 = c22707;
        c17248.f52878 = true;
        c17248.f52876 = i;
        c17248.f52872 = interfaceC20445.length();
        c17248.f52875 = interfaceC20445;
        return c22707;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47487(InterfaceC20445 interfaceC20445, int i, int i2, int i3, boolean z) {
        int i4;
        m47509();
        long length = (interfaceC20445.length() - i3) + i2;
        int mo26548 = interfaceC20445.mo26548();
        if (length >= 0 && length <= 2147483647L) {
            C17248 c17248 = this.f67285;
            if (c17248.f52878 && c17248.f52875 == interfaceC20445 && c17248.f52872 == (i4 = (int) length) && c17248.f52876 + 1 == mo26548) {
                if (c17248.f52874.m50728() == null || z) {
                    m47520();
                    return;
                }
                C22707 m50725 = c17248.f52874.m50725(i4, i, i2, i3);
                if (m50725.m50728() == null) {
                    m47520();
                    return;
                }
                c17248.f52874 = m50725;
                c17248.f52876 = mo26548;
                c17248.f52872 = interfaceC20445.length();
                c17248.f52875 = interfaceC20445;
                return;
            }
        }
        m47520();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m47529(InterfaceC20445 interfaceC20445) {
        return this.f67285.f52868 && !this.f67289.m30389() && m47502(interfaceC20445, interfaceC20445.mo26548());
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m47511(InterfaceC20445 interfaceC20445) {
        C6665 c6665 = this.f67288;
        return c6665.f20704 == interfaceC20445 && c6665.f20699 != -1 && c6665.f20705 == interfaceC20445.mo26548() && c6665.f20700 == interfaceC20445.length();
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m47516() {
        InterfaceC7785 m30436;
        C6665 c6665 = this.f67288;
        return c6665.f20708 != -1 && c6665.f20720 == (m30436 = this.f67289.m30436()) && c6665.f20712 == m30436.mo26548() && c6665.f20703 == m30436.length();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m47531(InterfaceC20445 interfaceC20445) {
        C6665 c6665 = this.f67288;
        return c6665.f20707 == interfaceC20445 && c6665.f20698 == interfaceC20445.mo26548() && c6665.f20711 == interfaceC20445.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47486(InterfaceC20445 interfaceC20445, int i, int i2, int i3, C15068 c15068, boolean z) {
        C9302 m23868;
        C9302 m238682;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        C7185 m19240;
        boolean z3;
        C22707 c22707 = C22707.f73353;
        long j = i3;
        long j2 = i2;
        long length = (interfaceC20445.length() - j) + j2;
        if (length >= 0 && length <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0) {
            long j3 = i + j2;
            if (j3 <= length) {
                int i8 = (int) length;
                if (interfaceC20445.length() <= 1000000) {
                    C9302 c9302 = this.f67287.f44224;
                    C14425 c14425 = this.f67287;
                    Integer num = c14425.f44218;
                    boolean z4 = c14425.f44217 == null && c9302 != null && c9302.m23880() == i8;
                    if (z || !z4) {
                        if (!z) {
                            c22707 = m47478(interfaceC20445, i8, i, i2, i3, c15068);
                        }
                        m47499(false, false, false);
                        int length2 = interfaceC20445.length();
                        C21834 m35661 = c15068.m35661();
                        if (length2 == 0) {
                            m23868 = C9302.m23878();
                        } else {
                            m23868 = C9302.m23868(length2, m35661, false);
                        }
                        m47483(m23868, (C17975) null, false, (C7185) null, !z);
                        this.f67287.f44222 = true;
                        if (!z) {
                            m47490(interfaceC20445, c22707);
                        }
                        C23803 c23803 = this.f67290;
                        c23803.f77021 = false;
                        c23803.f77020 = i;
                        c23803.f77019 = i + i3;
                        return;
                    }
                    try {
                        C21834 m356612 = (i <= 0 || i3 <= 0) ? c15068.m35661() : c9302.m23883(i - 1);
                        int i9 = i + i2;
                        if (i3 == 0) {
                            m238682 = C9302.m23878();
                        } else {
                            m238682 = C9302.m23868(i3, m356612, false);
                        }
                        m47484(c9302.m23881(i, i9, m238682), null, false, null, true, num, false);
                        this.f67287.f44222 = true;
                        C23803 c238032 = this.f67290;
                        c238032.f77021 = false;
                        c238032.f77020 = i;
                        c238032.f77019 = i + i3;
                        m47505();
                        if (m47529(interfaceC20445) || m47531(interfaceC20445)) {
                            return;
                        }
                        if (this.f67288.f20707 != null) {
                            m47533();
                        }
                        boolean z5 = this.f67289.m30389() && this.f67289.isAttachedToWindow() && !this.f67289.m30532();
                        if (!z5 && !m47510(interfaceC20445)) {
                            if (this.f67289.m30532()) {
                                m47499(false, false, false);
                                return;
                            }
                            return;
                        }
                        C6665 c6665 = this.f67288;
                        if (c6665.f20704 != interfaceC20445) {
                            m47514(interfaceC20445, false);
                            return;
                        }
                        c6665.f20697 = false;
                        if (z5) {
                            c6665.f20696 = interfaceC20445;
                        }
                        this.f67286.m39414(this.f67284.m51001(), interfaceC20445, i, i2, i3, this.f67287.f44224, this.f67287.f44223);
                        return;
                    } catch (RuntimeException unused) {
                        m47508(interfaceC20445);
                        C23803 c238033 = this.f67290;
                        c238033.f77021 = true;
                        c238033.f77020 = 0;
                        c238033.f77019 = interfaceC20445.length();
                        return;
                    }
                }
                if (i8 > 1000000 && m47519((CharSequence) interfaceC20445)) {
                    long length3 = (interfaceC20445.length() - j) + j2;
                    if (length3 >= 0 && length3 <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0 && j3 <= length3) {
                        int i10 = (int) length3;
                        int mo26548 = interfaceC20445.mo26548();
                        C6665 c66652 = this.f67288;
                        if (c66652.f20716 == interfaceC20445 && (i4 = c66652.f20719) != -1 && c66652.f20701 == i10 && c66652.f20718 + 1 == mo26548) {
                            i5 = c66652.f20709;
                        } else if (c66652.f20704 == interfaceC20445 && (i4 = c66652.f20699) != -1 && c66652.f20700 == i10 && c66652.f20705 + 1 == mo26548) {
                            i5 = c66652.f20706;
                        } else if (c66652.f20720 == interfaceC20445 && (i4 = c66652.f20708) != -1 && c66652.f20703 == i10 && c66652.f20712 + 1 == mo26548) {
                            i5 = c66652.f20713;
                        }
                        int i11 = i5;
                        int i12 = i4;
                        C9302 c93022 = this.f67287.f44224;
                        if (c93022 != null) {
                            if (this.f67287.f44217 != null && c93022.m23880() == i10 && this.f67287.f44217.m19247() == c93022) {
                                if (m47521(interfaceC20445)) {
                                    C13534 m19242 = this.f67287.f44217.m19242(i, i2, i3, i12, i11, c15068.m35661());
                                    m19240 = m19242.m32576();
                                    i6 = m19242.m32578();
                                    i7 = m19242.m32577();
                                } else {
                                    long m19237 = C7185.m19237(i10, i, i2, i3, i12, i11);
                                    i6 = (int) (m19237 >>> 32);
                                    i7 = (int) m19237;
                                    m19240 = C7185.m19240(interfaceC20445.length(), c15068.m35661());
                                }
                            }
                        } else {
                            long m192372 = C7185.m19237(i10, i, i2, i3, i12, i11);
                            i6 = (int) (m192372 >>> 32);
                            i7 = (int) m192372;
                            m19240 = C7185.m19240(interfaceC20445.length(), c15068.m35661());
                        }
                        int i13 = i7;
                        C7185 c7185 = m19240;
                        int i14 = i6;
                        boolean m30532 = this.f67289.m30532();
                        C17248 c17248 = this.f67285;
                        C22707 c227072 = (c17248.f52873 == interfaceC20445 && c17248.f52867 == i10 && c17248.f52877 + 1 == mo26548) ? c17248.f52869 : null;
                        c17248.f52870 = null;
                        if (c227072 == null) {
                            m47532();
                        } else {
                            if (!m30532) {
                                c22707 = c227072.m50725(i10, i, i2, i3);
                            }
                            c17248.f52869 = c22707;
                            c17248.f52877 = mo26548;
                            c17248.f52867 = interfaceC20445.length();
                            c17248.f52873 = interfaceC20445;
                        }
                        this.f67286.m39413(this.f67284.m51001(), interfaceC20445, i, i2, i3);
                        this.f67288.f20704 = interfaceC20445;
                        m47507();
                        m47530();
                        if (c7185 != null) {
                            m47483(c7185.m19247(), (C17975) null, false, c7185, true);
                        }
                        m47534(interfaceC20445, i14, i13);
                        if (m47521(interfaceC20445)) {
                            z3 = false;
                            m47488(interfaceC20445, i14, i13, false);
                        } else {
                            z3 = false;
                        }
                        C23803 c238034 = this.f67290;
                        c238034.f77021 = z3;
                        c238034.f77020 = i;
                        c238034.f77019 = i + i3;
                        return;
                    }
                }
                if (z) {
                    z2 = false;
                    m47491(interfaceC20445, false);
                } else {
                    C22707 m47478 = m47478(interfaceC20445, i8, i, i2, i3, c15068);
                    m47491(interfaceC20445, true);
                    m47490(interfaceC20445, m47478);
                    z2 = false;
                }
                C23803 c238035 = this.f67290;
                c238035.f77021 = z2;
                c238035.f77020 = i;
                c238035.f77019 = i + i3;
                return;
            }
        }
        m47508(interfaceC20445);
        C23803 c238036 = this.f67290;
        c238036.f77021 = true;
        c238036.f77020 = 0;
        c238036.f77019 = interfaceC20445.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C22707 m47478(InterfaceC20445 interfaceC20445, int i, int i2, int i3, int i4, C15068 c15068) {
        C9302 m23868;
        C22707 c22707 = C22707.f73353;
        C14425 c14425 = this.f67287;
        C7185 c7185 = c14425.f44217;
        if (c7185 != null) {
            int mo26548 = interfaceC20445.mo26548();
            C17248 c17248 = this.f67285;
            if (c17248.f52873 == interfaceC20445 && c17248.f52877 + 1 == mo26548 && c17248.f52867 == i) {
                c22707 = c17248.f52869;
            } else if (c7185.m19250()) {
                c22707 = C22707.m50723(-1, -1, c7185.m19245(), c7185.m19241());
            }
        } else {
            C9302 c9302 = c14425.f44224;
            if (c9302 != null && c9302.m23880() == i) {
                C21834 m35661 = c15068.m35661();
                if (i == 0) {
                    m23868 = C9302.m23878();
                } else {
                    m23868 = C9302.m23868(i, m35661, false);
                }
                C14239 m23887 = c9302.m23887(m23868);
                if (m23887 != null) {
                    c22707 = C22707.m50723(-1, -1, m23887.m33888(), m23887.m33887());
                }
            } else {
                c22707 = C22707.m50723(-1, -1, 0, i);
            }
        }
        return c22707.m50725(i, i2, i3, i4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47490(InterfaceC20445 interfaceC20445, C22707 c22707) {
        RunnableC17954 m47513 = m47513(interfaceC20445, interfaceC20445.mo26548(), c22707, EnumC16542.MERGE);
        if (m47513 == null) {
            m47506(interfaceC20445);
            return;
        }
        boolean z = this.f67287.f44217 != null;
        C17248 c17248 = this.f67285;
        c17248.f52866 = z;
        c17248.f52868 = true;
        C12392 c12392 = this.f67289;
        c12392.postInvalidate();
        c12392.post(m47513);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47483(C9302 c9302, C17975 c17975, boolean z, C7185 c7185, boolean z2) {
        C22913 c22913 = this.f67284;
        C23097 m51001 = c22913 == null ? null : c22913.m51001();
        m47484(c9302, c17975, z, c7185, z2, m51001 != null ? Integer.valueOf(m51001.m51274()) : null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m47484(l.C9302 r9, l.C17975 r10, boolean r11, l.C7185 r12, boolean r13, java.lang.Integer r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20777.m47484(l.ۢۖܿ, l.ᩳۢܿ, boolean, l.۟ۖܿ, boolean, java.lang.Integer, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m47481(C5959 c5959) {
        C14239 m16687;
        C22707 m50723;
        C16747 c16747 = this.f67286;
        if (c16747.m39417(c5959)) {
            C9302 m36849 = c5959.m16692().m36849();
            synchronized (this) {
                try {
                    InterfaceC20445 interfaceC20445 = this.f67288.f20704;
                    C23097 m51001 = this.f67284.m51001();
                    if (c16747.m39417(c5959) && interfaceC20445 != null && c5959.m16692().m36848() == m51001 && this.f67289.m30436() == interfaceC20445 && c5959.m16690() == interfaceC20445.mo26548() && c5959.m16691() == interfaceC20445.length() && m36849.m23880() == c5959.m16691() && this.f67287.f44223 == c5959.m16688()) {
                        C6665 c6665 = this.f67288;
                        if (c6665.f20696 == interfaceC20445) {
                            if (!c6665.f20714) {
                                c6665.f20715 = c5959;
                                return;
                            }
                            m47505();
                        }
                        if (this.f67289.isAttachedToWindow() && this.f67289.m30483() && !this.f67289.m30532()) {
                            this.f67288.f20697 = false;
                            if (!c5959.m16689()) {
                                m16687 = m36849.m23880() == 0 ? null : new C14239(0, m36849.m23880());
                            } else {
                                m16687 = c5959.m16687();
                            }
                            m47484(m36849, c5959.m16692().m36847(), true, null, true, Integer.valueOf(m51001.m51274()), true);
                            m47532();
                            C6665 c66652 = this.f67288;
                            c66652.f20719 = -1;
                            c66652.f20709 = -1;
                            c66652.f20718 = 0;
                            c66652.f20701 = 0;
                            c66652.f20716 = null;
                            m47507();
                            m47533();
                            m47530();
                            if (m16687 == null) {
                                m50723 = C22707.f73353;
                            } else {
                                m50723 = C22707.m50723(-1, -1, m16687.m33888(), m16687.m33887());
                            }
                            RunnableC17954 m47513 = m47513(interfaceC20445, c5959.m16690(), m50723, EnumC16542.MERGE);
                            C12392 c12392 = this.f67289;
                            if (m47513 == null) {
                                return;
                            }
                            c12392.postInvalidate();
                            c12392.post(m47513);
                            return;
                        }
                        this.f67288.f20697 = true;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m47482(C7370 c7370) {
        C22707 m50723;
        C16747 c16747 = this.f67286;
        if (c16747.m39418(c7370)) {
            C14280 m19819 = c7370.m19819();
            C11003.requireNonNull(m19819, o.c);
            C7185 m19238 = C7185.m19238(m19819.m34058(), m19819.m34060(), m19819.m34065(), m19819.m34059(), m19819.m34063().f74319);
            synchronized (this) {
                InterfaceC20445 interfaceC20445 = this.f67288.f20704;
                C23097 m51001 = this.f67284.m51001();
                if (c16747.m39418(c7370) && interfaceC20445 != null && m19819.m34063() == m51001 && this.f67289.m30436() == interfaceC20445 && interfaceC20445.length() > 1000000 && c7370.m19818() == interfaceC20445.mo26548() && c7370.m19820() == interfaceC20445.length() && m19819.m34064() == c7370.m19818() && m19819.m34058() == c7370.m19820() && m19819.m34060() == this.f67288.f20699) {
                    int m34061 = m19819.m34061();
                    C6665 c6665 = this.f67288;
                    if (m34061 == c6665.f20706 && c6665.f20705 == c7370.m19818() && this.f67288.f20700 == c7370.m19820() && this.f67288.f20717 == c7370.m19817() && this.f67287.f44223 == c7370.m19817()) {
                        C6665 c66652 = this.f67288;
                        if (c66652.f20696 == interfaceC20445) {
                            if (!c66652.f20714) {
                                c66652.f20702 = c7370;
                                return;
                            }
                            m47505();
                        }
                        if (this.f67289.isAttachedToWindow() && this.f67289.m30483() && !this.f67289.m30532()) {
                            C7185 c7185 = this.f67285.f52870;
                            if (c7185 == null || c7185.m19247().m23880() != m19238.m19247().m23880()) {
                                C17248 c17248 = this.f67285;
                                if (c17248.f52873 == interfaceC20445 && c17248.f52877 == interfaceC20445.mo26548() && c17248.f52867 == interfaceC20445.length()) {
                                    m50723 = C22707.m50722(this.f67285.f52869, m19819.m34060(), m19819.m34061());
                                } else {
                                    m50723 = C22707.m50723(-1, -1, m19819.m34060(), m19819.m34061());
                                }
                            } else {
                                m50723 = m19238.m19243(c7185);
                            }
                            C22707 c22707 = m50723;
                            m47484(m19238.m19247(), null, false, m19238, true, Integer.valueOf(m51001.m51274()), true);
                            if (!m47504(interfaceC20445)) {
                                m47534(interfaceC20445, m19819.m34060(), m19819.m34061());
                            }
                            m47507();
                            m47530();
                            RunnableC17954 m47513 = m47513(interfaceC20445, c7370.m19818(), c22707, EnumC16542.REPLACE);
                            C12392 c12392 = this.f67289;
                            if (m47513 == null) {
                                return;
                            }
                            c12392.postInvalidate();
                            c12392.post(m47513);
                            return;
                        }
                        this.f67288.f20710 = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m47492(l.C20777 r6, l.C4548 r7) {
        /*
            boolean r0 = r7.m13366()
            if (r0 == 0) goto La
            r6.m47480(r7)
            return
        La:
            l.ܽܺܿ r1 = r6.f67286
            boolean r0 = r1.m39416(r7)
            if (r0 != 0) goto L13
            goto L78
        L13:
            r0 = r6
            monitor-enter(r0)
            l.ۜۡܿ r2 = r6.f67288     // Catch: java.lang.Throwable -> L7b
            l.᩶᩸ᩳ r2 = r2.f20704     // Catch: java.lang.Throwable -> L7b
            boolean r1 = r1.m39416(r7)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L79
            if (r2 == 0) goto L79
            l.۫ۨᩳ r1 = r6.f67289     // Catch: java.lang.Throwable -> L7b
            l.۟᩺ᩳ r1 = r1.m30436()     // Catch: java.lang.Throwable -> L7b
            if (r1 != r2) goto L79
            int r1 = r7.m13365()     // Catch: java.lang.Throwable -> L7b
            int r3 = r2.mo26548()     // Catch: java.lang.Throwable -> L7b
            if (r1 != r3) goto L79
            int r1 = r7.m13367()     // Catch: java.lang.Throwable -> L7b
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L7b
            if (r1 == r3) goto L3e
            goto L79
        L3e:
            l.ۗۡܿ r1 = r7.m13364()     // Catch: java.lang.Throwable -> L7b
            l.ۗۡܿ r3 = l.EnumC3137.SCHEDULER_REJECTED     // Catch: java.lang.Throwable -> L7b
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L58
            l.ۜۡܿ r7 = r6.f67288     // Catch: java.lang.Throwable -> L7b
            r7.f20697 = r4     // Catch: java.lang.Throwable -> L7b
            l.᩶᩸ᩳ r1 = r7.f20696     // Catch: java.lang.Throwable -> L7b
            if (r1 != r2) goto L71
            boolean r7 = r7.f20714     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L71
            r6.m47505()     // Catch: java.lang.Throwable -> L7b
            goto L72
        L58:
            l.ۜۡܿ r1 = r6.f67288     // Catch: java.lang.Throwable -> L7b
            r1.f20697 = r5     // Catch: java.lang.Throwable -> L7b
            int r3 = r7.m13365()     // Catch: java.lang.Throwable -> L7b
            r1.f20698 = r3     // Catch: java.lang.Throwable -> L7b
            l.ۜۡܿ r1 = r6.f67288     // Catch: java.lang.Throwable -> L7b
            int r7 = r7.m13367()     // Catch: java.lang.Throwable -> L7b
            r1.f20711 = r7     // Catch: java.lang.Throwable -> L7b
            l.ۜۡܿ r7 = r6.f67288     // Catch: java.lang.Throwable -> L7b
            r7.f20707 = r2     // Catch: java.lang.Throwable -> L7b
            r6.m47499(r5, r4, r5)     // Catch: java.lang.Throwable -> L7b
        L71:
            r4 = 0
        L72:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L78
            r6.m47506(r2)
        L78:
            return
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            return
        L7b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20777.m47492(l.᩷ۡܿ, l.ۙۡܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47480(C4548 c4548) {
        C16747 c16747 = this.f67286;
        if (c16747.m39416(c4548)) {
            synchronized (this) {
                InterfaceC20445 interfaceC20445 = this.f67288.f20704;
                int m13368 = c4548.m13368();
                int m13369 = c4548.m13369();
                if (c16747.m39416(c4548) && interfaceC20445 != null && this.f67289.m30436() == interfaceC20445 && c4548.m13365() == interfaceC20445.mo26548() && c4548.m13367() == interfaceC20445.length()) {
                    C6665 c6665 = this.f67288;
                    if (m13368 == c6665.f20699 && m13369 == c6665.f20706 && c6665.f20705 == c4548.m13365() && this.f67288.f20700 == c4548.m13367()) {
                        boolean z = false;
                        if (c4548.m13364() == EnumC3137.SCHEDULER_REJECTED) {
                            C6665 c66652 = this.f67288;
                            c66652.f20710 = true;
                            if (c66652.f20696 == interfaceC20445 && c66652.f20714) {
                                m47505();
                                z = true;
                            }
                        } else {
                            m47507();
                            C6665 c66653 = this.f67288;
                            c66653.f20708 = m13368;
                            c66653.f20713 = m13369;
                            c66653.f20712 = c4548.m13365();
                            this.f67288.f20703 = c4548.m13367();
                            this.f67288.f20720 = interfaceC20445;
                            this.f67287.f44216 = null;
                            m47499(false, true, true);
                        }
                        if (z) {
                            m47506(interfaceC20445);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private RunnableC17954 m47513(InterfaceC20445 interfaceC20445, int i, C22707 c22707, EnumC16542 enumC16542) {
        if (this.f67289.m30436() != interfaceC20445 || interfaceC20445.mo26548() != i || this.f67284.m51000() == null) {
            return null;
        }
        C22707 m47479 = m47479(interfaceC20445, i, c22707, enumC16542);
        m47509();
        RunnableC17954 m47477 = m47477(interfaceC20445, i, m47479);
        this.f67285.f52871 = m47477;
        return m47477;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47566(InterfaceC20445 interfaceC20445) {
        synchronized (this) {
            if (m47502(interfaceC20445, interfaceC20445.mo26548()) && this.f67284.m51000() != null) {
                m47509();
                RunnableC17954 m47477 = m47477(interfaceC20445, interfaceC20445.mo26548(), this.f67285.f52874);
                this.f67285.f52871 = m47477;
                this.f67289.post(m47477);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private RunnableC17954 m47477(InterfaceC20445 interfaceC20445, int i, C22707 c22707) {
        C9302 c9302 = this.f67287.f44224;
        if (c9302 == null) {
            throw new IllegalStateException("Syntax display is not initialized");
        }
        C15068 m51000 = this.f67284.m51000();
        C14425 c14425 = this.f67287;
        return new RunnableC17954(this, interfaceC20445, m51000, i, c14425.f44217, c9302, c14425.f44223, c22707);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m47547() {
        return this.f67287.f44222;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47544(CharSequence charSequence) {
        C9302 c9302;
        return this.f67287.f44222 && (c9302 = this.f67287.f44224) != null && c9302.m23880() == charSequence.length();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m47508(InterfaceC20445 interfaceC20445) {
        C9302 m23868;
        m47515();
        if ((m47531(interfaceC20445) || m47516()) && this.f67287.f44224 != null && this.f67287.f44224.m23880() == interfaceC20445.length()) {
            return;
        }
        if (interfaceC20445.length() <= 1000000) {
            m47499(false, false, false);
            C15068 m51000 = this.f67284.m51000();
            if (m51000 == null) {
                return;
            }
            int length = interfaceC20445.length();
            C21834 m35661 = m51000.m35661();
            if (length == 0) {
                m23868 = C9302.m23878();
            } else {
                m23868 = C9302.m23868(length, m35661, false);
            }
            m47483(m23868, (C17975) null, false, (C7185) null, false);
            this.f67287.f44222 = true;
            if (m47510(interfaceC20445)) {
                m47514(interfaceC20445, false);
                return;
            }
            return;
        }
        m47491(interfaceC20445, false);
        if (m47521(interfaceC20445)) {
            C6665 c6665 = this.f67288;
            m47488(interfaceC20445, c6665.f20719, c6665.f20709, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47545(String str) {
        m47485(C7017.m18986(str));
        return this.f67284.m51000() != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m47557(String str) {
        m47485(C7017.m18983(str));
        return this.f67284.m51000() != null;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C15068 m47517(C20777 c20777) {
        return c20777.f67284.m51000();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m47548() {
        return this.f67284.m51000() != null;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15068 m47550() {
        return this.f67284.m51000();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m47552() {
        C15068 m51000 = this.f67284.m51000();
        return m51000 == null ? "Text" : m51000.m35657();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m47562() {
        C15068 m51000 = this.f67284.m51000();
        if (m51000 != null) {
            return m51000.m35663();
        }
        return null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6603 m47565() {
        C15068 m51000 = this.f67284.m51000();
        if (m51000 == null) {
            return null;
        }
        return m51000.m35664();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17186 m47567() {
        C15068 m51000 = this.f67284.m51000();
        if (m51000 == null) {
            return null;
        }
        return m51000.m35665();
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m47515() {
        C23097 m51001 = this.f67284.m51001();
        if (m51001 == null || m51001.m51272()) {
            return false;
        }
        C15068 m51000 = this.f67284.m51000();
        C9302 c9302 = this.f67287.f44224;
        C14425 c14425 = this.f67287;
        Integer num = c14425.f44218;
        boolean z = c14425.f44222 && c9302 != null;
        C22913 m50999 = C22913.m50999(m51000);
        m47499(false, false, false);
        this.f67284 = m50999;
        if (m50999.m51001() != null) {
            m47484(c9302, null, false, null, true, num, false);
            this.f67287.f44222 = z;
        } else {
            this.f67287.f44222 = false;
            m47483((C9302) null, (C17975) null, false, (C7185) null, false);
        }
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m47526(CharSequence charSequence) {
        return (charSequence == null || this.f67284.m51001() == null || this.f67284.m51000() == null || !(charSequence instanceof InterfaceC20445) || this.f67289.m30436() != charSequence) ? false : true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m47528(CharSequence charSequence) {
        return m47519(charSequence) && this.f67284.m51001() != null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47569(InterfaceC20445 interfaceC20445, int i, int i2) {
        if (m47526((CharSequence) interfaceC20445)) {
            this.f67286.m39412(interfaceC20445, i, i2);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47564(InterfaceC20445 interfaceC20445, int i, int i2) {
        if (!m47519((CharSequence) interfaceC20445) || i < 0 || i2 < 0) {
            return;
        }
        C11003.checkFromToIndex(i, i2, interfaceC20445.length());
        synchronized (this) {
            m47515();
            m47534(interfaceC20445, i, i2);
            C7185 c7185 = this.f67287.f44217;
            if (c7185 != null && c7185.m19244(i, i2)) {
                m47524(interfaceC20445, i, i2);
                return;
            }
            if (m47521(interfaceC20445)) {
                m47488(interfaceC20445, i, i2, false);
            } else {
                m47518(interfaceC20445, i, i2);
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m47524(InterfaceC20445 interfaceC20445, int i, int i2) {
        C6665 c6665 = this.f67288;
        if (c6665.f20699 != -1 && (!m47511(interfaceC20445) || !m47500(c6665.f20699, c6665.f20706, i, i2))) {
            this.f67286.m39422();
            c6665.f20704 = interfaceC20445;
            m47507();
        }
        if (c6665.f20708 != -1) {
            if (m47516() && m47500(c6665.f20708, c6665.f20713, i, i2)) {
                return;
            }
            m47530();
        }
    }
}
