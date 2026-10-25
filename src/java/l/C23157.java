package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: N6KV */
/* renamed from: l.᩺ᩳܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23157 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Consumer f74437;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f74438;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11869 f74439;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f74440;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicReference f74441;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f74442;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f74443;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C23157(InterfaceC11869 interfaceC11869, Consumer consumer) {
        this.f74440 = new Object();
        this.f74441 = new AtomicReference();
        this.f74442 = new AtomicBoolean();
        this.f74439 = interfaceC11869;
        this.f74438 = true;
        this.f74437 = consumer;
    }

    public C23157(InputStream inputStream, Consumer consumer) {
        this.f74440 = new Object();
        AtomicReference atomicReference = new AtomicReference();
        this.f74441 = atomicReference;
        this.f74442 = new AtomicBoolean();
        this.f74439 = null;
        this.f74438 = false;
        this.f74437 = consumer;
        atomicReference.set(inputStream);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InputStream m51339() {
        InputStream inputStream;
        synchronized (this.f74440) {
            if (this.f74442.get()) {
                throw new IOException("HTML preview stream is closed");
            }
            inputStream = (InputStream) this.f74441.get();
            if (inputStream == null) {
                inputStream = this.f74439.mo28995();
                if (inputStream == null) {
                    throw new IOException("HTML preview source was not opened");
                }
                this.f74441.set(inputStream);
                if (this.f74442.get()) {
                    InputStream inputStream2 = (InputStream) this.f74441.getAndSet(null);
                    if (inputStream2 != null) {
                        RunnableC20760 runnableC20760 = new RunnableC20760(4, inputStream2);
                        if (this.f74438) {
                            C1802.f6209.execute(runnableC20760);
                        } else {
                            runnableC20760.run();
                        }
                    }
                    throw new IOException("HTML preview stream is closed");
                }
            }
        }
        return inputStream;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f74443) {
            return -1;
        }
        try {
            int read = m51339().read();
            if (read == -1) {
                this.f74443 = true;
                close();
            }
            return read;
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f74443) {
            return -1;
        }
        try {
            int read = m51339().read(bArr, i, i2);
            if (read == -1) {
                this.f74443 = true;
                close();
            }
            return read;
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.f74443 || this.f74442.get()) {
            return 0;
        }
        try {
            InputStream inputStream = (InputStream) this.f74441.get();
            if (inputStream == null) {
                return 0;
            }
            return inputStream.available();
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0 || this.f74443) {
            return 0L;
        }
        try {
            return m51339().skip(j);
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f74442.compareAndSet(false, true)) {
            this.f74437.accept(this);
            InputStream inputStream = (InputStream) this.f74441.getAndSet(null);
            if (inputStream == null) {
                return;
            }
            RunnableC20760 runnableC20760 = new RunnableC20760(4, inputStream);
            if (this.f74438) {
                C1802.f6209.execute(runnableC20760);
            } else {
                runnableC20760.run();
            }
        }
    }
}
