package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: VAGX */
/* renamed from: l.ܿۢ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17255 implements WritableByteChannel {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f52903 = new AtomicBoolean();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7356 f52904;

    public C17255(C7356 c7356) {
        this.f52904 = c7356;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f52903.compareAndSet(false, true)) {
            this.f52904.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f52903.get();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        if (!byteBuffer.hasArray()) {
            throw new IOException("Direct buffer somehow written to BufferAtATimeOutputChannel");
        }
        try {
            int position = byteBuffer.position();
            int limit = byteBuffer.limit() - position;
            this.f52904.write(byteBuffer.array(), byteBuffer.arrayOffset() + position, limit);
            byteBuffer.position(byteBuffer.limit());
            return limit;
        } catch (IOException e) {
            try {
                close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }
}
