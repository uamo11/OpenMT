package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P70I */
/* renamed from: l.ۢܽܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9711 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f29395;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f29396;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9047 f29397;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6888 f29398;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0579 f29399;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f29400;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f29401 = new AtomicBoolean();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12100 f29402;

    public C9711(long j, long j2, long j3, C9047 c9047, C12100 c12100) {
        this.f29395 = j;
        this.f29400 = j2;
        this.f29396 = j3;
        this.f29397 = c9047;
        this.f29402 = c12100;
        this.f29398 = new C6888(C19631.m45121(c9047));
        this.f29399 = new C0579(c9047);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24677(OutputStream outputStream, int i) {
        m24679();
        this.f29399.m2393(outputStream, i);
        m24679();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883[] m24678() {
        m24679();
        InterfaceC18883[] m45121 = C19631.m45121(this.f29397);
        try {
            m24679();
            return m45121;
        } catch (IOException | Error | RuntimeException e) {
            try {
                C16059.m37963(m45121);
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f29401.compareAndSet(false, true)) {
            this.f29398.m18657();
        }
    }

    public final int length() {
        if (!this.f29401.get()) {
            return this.f29399.m2391();
        }
        throw new IllegalStateException("HexRange is closed");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24679() {
        InterfaceC18883[] interfaceC18883Arr;
        if (!this.f29401.get()) {
            interfaceC18883Arr = this.f29398.f21283;
            for (InterfaceC18883 interfaceC18883 : interfaceC18883Arr) {
                if (!interfaceC18883.mo10086()) {
                    throw new C5519();
                }
            }
            return;
        }
        throw new IllegalStateException("HexRange is closed");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21000 m24680() {
        AtomicBoolean atomicBoolean = this.f29401;
        if (!atomicBoolean.get()) {
            C6888 c6888 = this.f29398;
            c6888.m18658();
            if (atomicBoolean.get()) {
                c6888.m18657();
                throw new IllegalStateException("HexRange is closed");
            }
            return new C21000(this.f29395, this.f29400, this.f29396, this.f29397, this.f29402, this.f29398);
        }
        throw new IllegalStateException("HexRange is closed");
    }
}
