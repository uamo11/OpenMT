package l;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: L8GV */
/* renamed from: l.ۨ᩻᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12044 implements InterfaceC2245 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14159 f36029;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f36031 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f36030 = false;

    @Override // l.InterfaceC2245
    /* renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo7436() {
        return null;
    }

    @Override // l.InterfaceC2245
    /* renamed from: ۧ */
    public final /* synthetic */ InterfaceC2245 mo7438(long j, long j2) {
        return C15649.m36840(this, j, j2);
    }

    @Override // l.InterfaceC2245
    /* renamed from: ܺ */
    public final void mo7439() {
    }

    @Override // l.InterfaceC2245
    /* renamed from: ܽ */
    public final /* synthetic */ InterfaceC2245 mo7440(long j, long j2) {
        return C15649.m36839(this, j, j2);
    }

    @Override // l.InterfaceC2245
    /* renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo7441() {
        return false;
    }

    public C12044(C14159 c14159) {
        this.f36029 = c14159;
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) {
        if (j < 0) {
            throw new IOException(C16014.m37865(j, "offset < 0: "));
        }
        this.f36031 = j;
    }

    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) {
        int m33790 = this.f36029.m33790(this.f36031, bArr, i, i2);
        if (m33790 != -1) {
            this.f36031 += m33790;
        }
        return m33790;
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) {
        throw new IOException("Unsupported");
    }

    @Override // l.InterfaceC2245
    public final long length() {
        return this.f36029.m33792();
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) {
        throw new IOException("Unsupported");
    }

    @Override // l.InterfaceC2245
    public final long position() {
        return this.f36031;
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        String str;
        str = this.f36029.f42740;
        return str;
    }

    @Override // l.InterfaceC2245
    /* renamed from: ۡ */
    public final InterfaceC2245 mo7437() {
        throw new IOException("Unsupported");
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f36030;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f36030) {
            return;
        }
        this.f36030 = true;
        this.f36029.close();
    }
}
