package l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: A4E9 */
/* renamed from: l.ۤ֫֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9973 extends AbstractC4328 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f30088;

    public C9973(C11384 c11384, long j) {
        super(c11384);
        this.f30088 = j;
        if (j == 0) {
            m12985(true, null);
        }
    }

    @Override // l.AbstractC4328, l.InterfaceC1274
    /* renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) {
        if (this.f13928) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f30088;
        if (j2 == 0) {
            return -1L;
        }
        long mo4334 = super.mo4334(c12521, Math.min(j2, 8192L));
        if (mo4334 == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m12985(false, protocolException);
            throw protocolException;
        }
        long j3 = this.f30088 - mo4334;
        this.f30088 = j3;
        if (j3 == 0) {
            m12985(true, null);
        }
        return mo4334;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.f13928) {
            return;
        }
        if (this.f30088 != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                z = C20032.m46184(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                m12985(false, null);
            }
        }
        this.f13928 = true;
    }
}
