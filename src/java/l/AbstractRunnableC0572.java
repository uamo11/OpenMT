package l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: U9HB */
/* renamed from: l.֡ᩳۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC0572 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Thread f2255;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC8730 f2258;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BufferedInputStream f2259;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC2148 f2257 = C11321.m27961(getClass());

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f2256 = new AtomicBoolean(false);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC5386 mo2341();

    public AbstractRunnableC0572(String str, InputStream inputStream, InterfaceC8730 interfaceC8730) {
        if (inputStream instanceof BufferedInputStream) {
            this.f2259 = (BufferedInputStream) inputStream;
        } else {
            this.f2259 = new BufferedInputStream(inputStream);
        }
        this.f2258 = interfaceC8730;
        StringBuilder m9834 = C3200.m9834("Packet Reader for ", str, ", Original Thread name: ");
        m9834.append(Thread.currentThread().getName());
        Thread thread = new Thread(this, m9834.toString());
        this.f2255 = thread;
        thread.setDaemon(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2148 interfaceC2148;
        AtomicBoolean atomicBoolean;
        InterfaceC8730 interfaceC8730 = this.f2258;
        while (true) {
            boolean isInterrupted = Thread.currentThread().isInterrupted();
            interfaceC2148 = this.f2257;
            atomicBoolean = this.f2256;
            if (isInterrupted || atomicBoolean.get()) {
                break;
            }
            try {
                InterfaceC5386 mo2341 = mo2341();
                interfaceC2148.mo7100(mo2341, "Received packet {}");
                ((C23650) interfaceC8730).m52157(mo2341);
            } catch (C2380 e) {
                if (!atomicBoolean.get()) {
                    interfaceC2148.mo7089("PacketReader error, got exception.", (Exception) e);
                    ((C23650) interfaceC8730).m52156(e);
                    return;
                }
            }
        }
        if (atomicBoolean.get()) {
            interfaceC2148.mo7087(this.f2255, "{} stopped.");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2343() {
        this.f2257.mo7088("Stopping PacketReader...");
        this.f2256.set(true);
        this.f2255.interrupt();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2342() {
        Thread thread = this.f2255;
        this.f2257.mo7100(thread.getName(), "Starting PacketReader on thread: {}");
        thread.start();
    }
}
