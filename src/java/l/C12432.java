package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: M6UH */
/* renamed from: l.۫۬ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12432 implements InterfaceC10316 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FileChannel f37426;

    public C12432(InterfaceC20758 interfaceC20758) {
        this.f37426 = C12084.open(interfaceC20758, EnumC3824.READ);
    }

    @Override // l.InterfaceC10316
    /* renamed from: ֫ */
    public final void mo14384(long j, byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            int read = this.f37426.read(wrap, j);
            if (read < 0) {
                throw new EOFException("Truncated recovery validation file");
            }
            if (read == 0) {
                throw new IOException("Recovery validation read made no progress");
            }
            j += read;
        }
    }

    @Override // l.InterfaceC10316
    public final long length() {
        return this.f37426.size();
    }

    @Override // l.InterfaceC10316
    /* renamed from: ֫ */
    public final void mo14383(long j, int i, byte[] bArr) {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // l.InterfaceC10316
    public final void truncate(long j) {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // l.InterfaceC10316
    /* renamed from: ܺ */
    public final void mo14386() {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // l.InterfaceC10316
    /* renamed from: ۘ֫ */
    public final void mo14385() {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f37426.close();
    }
}
