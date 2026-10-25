package l;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* compiled from: Y4GW */
/* renamed from: l.᩵ۖܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19179 implements InterfaceC2245 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f60431;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f60432;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f60433 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final File f60434;

    @Override // l.InterfaceC2245
    /* renamed from: ᩻ܽ */
    public final boolean mo7441() {
        return true;
    }

    public C19179(File file, String str) {
        this.f60434 = file;
        this.f60432 = str;
        this.f60431 = new RandomAccessFile(file, str);
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) {
        this.f60431.seek(j);
    }

    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) {
        return this.f60431.read(bArr, i, i2);
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) {
        this.f60431.write(bArr, i, i2);
    }

    @Override // l.InterfaceC2245
    public final long length() {
        return this.f60431.length();
    }

    @Override // l.InterfaceC2245
    /* renamed from: ۧ */
    public final InterfaceC2245 mo7438(long j, long j2) {
        return new C20590(mo7437(), j, j2);
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) {
        this.f60431.setLength(j);
    }

    @Override // l.InterfaceC2245
    /* renamed from: ܽ */
    public final InterfaceC2245 mo7440(long j, long j2) {
        return new C20590(this, j, j2);
    }

    @Override // l.InterfaceC2245
    public final long position() {
        return this.f60431.getFilePointer();
    }

    @Override // l.InterfaceC2245
    /* renamed from: ܺ */
    public final void mo7439() {
        this.f60431.getFD().sync();
    }

    @Override // l.InterfaceC2245
    /* renamed from: ֫ܽ */
    public final FileChannel mo7436() {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(this.f60431.getChannel());
        return convertMaybeLegacyFileChannelFromLibrary;
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        return this.f60434.getName();
    }

    @Override // l.InterfaceC2245
    /* renamed from: ۡ */
    public final InterfaceC2245 mo7437() {
        return new C19179(this.f60434, this.f60432);
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f60433;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f60433) {
            return;
        }
        this.f60433 = true;
        boolean equals = this.f60432.equals("r");
        RandomAccessFile randomAccessFile = this.f60431;
        if (equals) {
            C0349.m1793(randomAccessFile);
        } else {
            randomAccessFile.close();
        }
    }
}
