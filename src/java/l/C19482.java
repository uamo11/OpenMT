package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;

/* compiled from: OA5R */
/* renamed from: l.᩵۬ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19482 extends OutputStream {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10405 f62978;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f62979;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f62980;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0430 f62981;

    public C19482(C0430 c0430, long j, InterfaceC10405 interfaceC10405) {
        this.f62981 = c0430;
        this.f62979 = j;
        this.f62978 = interfaceC10405;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        boolean z;
        z = this.f62981.f1913;
        if (z) {
            throw new IOException("closed");
        }
        long j = this.f62979;
        if (j != -1 && this.f62980 + i2 > j) {
            StringBuilder m31106 = C12803.m31106("expected ", " bytes but received ", j);
            m31106.append(this.f62980);
            m31106.append(i2);
            throw new ProtocolException(m31106.toString());
        }
        this.f62980 += i2;
        try {
            this.f62978.mo26252(i, i2, bArr);
        } catch (InterruptedIOException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        boolean z;
        z = this.f62981.f1913;
        if (z) {
            return;
        }
        this.f62978.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        C0430 c0430 = this.f62981;
        z = c0430.f1913;
        if (z) {
            return;
        }
        c0430.f1913 = true;
        this.f62978.close();
        long j = this.f62979;
        if (j == -1 || this.f62980 >= j) {
            return;
        }
        StringBuilder m31106 = C12803.m31106("expected ", " bytes but received ", j);
        m31106.append(this.f62980);
        throw new ProtocolException(m31106.toString());
    }
}
