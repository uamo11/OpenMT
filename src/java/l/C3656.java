package l;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: E4G9 */
/* renamed from: l.ۘۖܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3656 implements InterfaceC2245 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Uri f11521;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ParcelFileDescriptor f11522;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f11523;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f11524 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public FileDescriptor f11525;

    @Override // l.InterfaceC2245
    /* renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo7436() {
        return null;
    }

    @Override // l.InterfaceC2245
    /* renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo7441() {
        return false;
    }

    public C3656(Uri uri, String str) {
        this.f11521 = uri;
        this.f11523 = str;
        try {
            ParcelFileDescriptor openFileDescriptor = C4925.m14336().openFileDescriptor(uri, str);
            this.f11522 = openFileDescriptor;
            if (openFileDescriptor == null) {
                throw new FileNotFoundException();
            }
            this.f11525 = openFileDescriptor.getFileDescriptor();
        } catch (Error | RuntimeException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException();
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        }
    }

    @Override // l.InterfaceC2245
    /* renamed from: ۧ */
    public final InterfaceC2245 mo7438(long j, long j2) {
        return new C20590(mo7437(), j, j2);
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) {
        try {
            Os.lseek(this.f11525, j, OsConstants.SEEK_SET);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC2245
    /* renamed from: ܽ */
    public final InterfaceC2245 mo7440(long j, long j2) {
        return new C20590(this, j, j2);
    }

    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = Os.read(this.f11525, bArr, i, i2);
            if (read == 0) {
                return -1;
            }
            return read;
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) {
        try {
            Os.write(this.f11525, bArr, i, i2);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC2245
    public final long length() {
        FileDescriptor fileDescriptor = this.f11525;
        try {
            long lseek = Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            long lseek2 = Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_END);
            Os.lseek(fileDescriptor, lseek, OsConstants.SEEK_SET);
            return lseek2;
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) {
        try {
            Os.ftruncate(this.f11525, j);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC2245
    public final long position() {
        try {
            return Os.lseek(this.f11525, 0L, OsConstants.SEEK_CUR);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC2245
    /* renamed from: ܺ */
    public final void mo7439() {
        try {
            Os.fsync(this.f11525);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f11524;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11524) {
            return;
        }
        this.f11524 = true;
        boolean equals = this.f11523.equals("r");
        ParcelFileDescriptor parcelFileDescriptor = this.f11522;
        if (equals) {
            C0349.m1793(parcelFileDescriptor);
        } else {
            parcelFileDescriptor.close();
        }
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        return C14609.m34870(this.f11521);
    }

    @Override // l.InterfaceC2245
    /* renamed from: ۡ */
    public final InterfaceC2245 mo7437() {
        return new C3656(this.f11521, this.f11523);
    }
}
