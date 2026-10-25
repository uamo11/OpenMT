package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* compiled from: M6UH */
/* renamed from: l.۬۬ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13137 implements InterfaceC10316 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f39297;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FileChannel f39298;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final FileLock f39299;

    public C13137(InterfaceC20758 interfaceC20758, boolean z) {
        this.f39297 = interfaceC20758.toAbsolutePath();
        FileChannel open = z ? C12084.open(interfaceC20758, EnumC3824.CREATE_NEW, EnumC3824.READ, EnumC3824.WRITE) : C12084.open(interfaceC20758, EnumC3824.READ, EnumC3824.WRITE);
        this.f39298 = open;
        try {
            FileLock tryLock = open.tryLock();
            this.f39299 = tryLock;
            if (tryLock != null) {
            } else {
                throw new IOException("Recovery file is already in use");
            }
        } catch (IOException | RuntimeException e) {
            this.f39298.close();
            throw e;
        }
    }

    @Override // l.InterfaceC10316
    /* renamed from: ֫ */
    public final void mo14384(long j, byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            int read = this.f39298.read(wrap, j);
            if (read < 0) {
                throw new EOFException("Truncated recovery file");
            }
            if (read == 0) {
                throw new IOException("Recovery read made no progress");
            }
            j += read;
        }
    }

    @Override // l.InterfaceC10316
    /* renamed from: ֫ */
    public final void mo14383(long j, int i, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        while (wrap.hasRemaining()) {
            int write = this.f39298.write(wrap, j);
            if (write <= 0) {
                throw new IOException("Recovery write made no progress");
            }
            j += write;
        }
    }

    @Override // l.InterfaceC10316
    public final long length() {
        return this.f39298.size();
    }

    @Override // l.InterfaceC10316
    public final void truncate(long j) {
        this.f39298.truncate(j);
    }

    @Override // l.InterfaceC10316
    /* renamed from: ܺ */
    public final void mo14386() {
        this.f39298.force(true);
    }

    @Override // l.InterfaceC10316
    /* renamed from: ۘ֫ */
    public final void mo14385() {
        C6082.m16997(this.f39297.getParent());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.f39298;
        try {
            this.f39299.release();
        } finally {
            fileChannel.close();
        }
    }
}
