package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: F70U */
/* renamed from: l.ۨܰܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11746 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f35055;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FileChannel f35056;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f35057;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17471 f35058;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f35059;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f35060 = new AtomicInteger(1);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private synchronized void m28742() {
        if (this.f35055) {
            return;
        }
        this.f35055 = true;
        try {
            this.f35056.close();
        } finally {
            this.f35058.close();
        }
    }

    public C11746(FileChannel fileChannel, C17471 c17471) {
        this.f35056 = fileChannel;
        this.f35058 = c17471;
        this.f35059 = fileChannel.size();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m28748() {
        return this.f35059;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28744() {
        return (this.f35057 || this.f35055 || !this.f35056.isOpen()) ? false : true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28746() {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f35060;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28743(long j, byte[] bArr, int i, int i2) {
        if (this.f35057) {
            throw new C5519();
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            try {
                int read = this.f35056.read(wrap, j);
                if (read < 0) {
                    throw new IOException("Unexpected end of hex checkpoint delta");
                }
                if (read == 0) {
                    Thread.yield();
                } else {
                    j += read;
                }
            } catch (ClosedChannelException e) {
                if (this.f35057) {
                    throw new C5519(e);
                }
                throw e;
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m28747() {
        this.f35057 = true;
        m28742();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28745() {
        AtomicInteger atomicInteger = this.f35060;
        int decrementAndGet = atomicInteger.decrementAndGet();
        if (decrementAndGet > 0) {
            return;
        }
        if (decrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex restore delta channel already closed");
        }
        m28742();
    }
}
