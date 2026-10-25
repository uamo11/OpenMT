package l;

import com.google.android.material.motion.MotionUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* compiled from: QA1E */
/* renamed from: l.ܽۡ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16545 extends AbstractC1729 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f50838 = C11321.m27962(C16545.class.getName());

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f50839;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f50840;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11254 f50841;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InetAddress f50842;

    public C16545(C8806 c8806, C11254 c11254, InetAddress inetAddress, int i) {
        super(c8806);
        this.f50841 = c11254;
        this.f50842 = inetAddress;
        this.f50840 = i;
        this.f50839 = i != C13038.f39044;
    }

    @Override // l.AbstractC1729
    /* renamed from: ۧ */
    public final String mo5781() {
        return C9045.m23341(new StringBuilder("Responder("), m5776() != null ? m5776().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC1729
    public final String toString() {
        return mo5781() + " incomming: " + this.f50841;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38925(Timer timer) {
        InterfaceC2148 interfaceC2148;
        C11254 c11254 = this.f50841;
        Iterator it = c11254.m42656().iterator();
        boolean z = true;
        do {
            boolean hasNext = it.hasNext();
            interfaceC2148 = f50838;
            if (!hasNext) {
                break;
            }
            C19015 c19015 = (C19015) it.next();
            interfaceC2148.mo7090("{}.start() question={}", mo5781(), c19015);
            z = c19015.mo8618(m5776());
        } while (z);
        int nextInt = (!z || c11254.m42657()) ? (C8806.m22717().nextInt(96) + 20) - c11254.m27847() : 0;
        int i = nextInt >= 0 ? nextInt : 0;
        interfaceC2148.mo7090("{}.start() Responder chosen delay={}", mo5781(), Integer.valueOf(i));
        if (m5776().m22750() || m5776().m22741()) {
            return;
        }
        timer.schedule(this, i);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC2148 interfaceC2148 = f50838;
        C8806 m5776 = m5776();
        C11254 c11254 = this.f50841;
        m5776.m22745(c11254);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        if (m5776().m22752()) {
            try {
                Iterator it = c11254.m42656().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    z = this.f50839;
                    if (!hasNext) {
                        break;
                    }
                    C19015 c19015 = (C19015) it.next();
                    interfaceC2148.mo7082("{}.run() JmDNS responding to: {}", mo5781(), c19015);
                    if (z) {
                        hashSet.add(c19015);
                    }
                    c19015.mo8617(m5776(), hashSet2);
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (AbstractC22542 abstractC22542 : c11254.m42654()) {
                    if (abstractC22542.m50544(currentTimeMillis)) {
                        hashSet2.remove(abstractC22542);
                        interfaceC2148.mo7100(mo5781(), "{} - JmDNS Responder Known Answer Removed");
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                interfaceC2148.mo7100(mo5781(), "{}.run() JmDNS responding");
                C14780 c14780 = new C14780(33792, c11254.m27848(), !z);
                if (z) {
                    c14780.m35160(new InetSocketAddress(this.f50842, this.f50840));
                }
                c14780.m42655(c11254.m42660());
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    C19015 c190152 = (C19015) it2.next();
                    if (c190152 != null) {
                        c14780 = m5778(c14780, c190152);
                    }
                }
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    AbstractC22542 abstractC225422 = (AbstractC22542) it3.next();
                    if (abstractC225422 != null) {
                        c14780 = m5777(c14780, c11254, abstractC225422);
                    }
                }
                if (c14780.m42651()) {
                    return;
                }
                m5776().m22728(c14780);
            } catch (Throwable th) {
                interfaceC2148.mo7083(mo5781() + "run() exception ", th);
                m5776().close();
            }
        }
    }
}
