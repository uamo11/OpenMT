package l;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: R6OT */
/* renamed from: l.ܺ۬ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15959 implements InterfaceC10316 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f49260 = new ReentrantReadWriteLock();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public IOException f49261;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f49262;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10316 f49263;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f49264;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f49265;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f49266;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f49267;

    public C15959(InterfaceC10316 interfaceC10316) {
        this.f49263 = interfaceC10316;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37736(long j, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m37732();
            if (this.f49266) {
                throw new IllegalStateException("Recovery append batch is already active");
            }
            this.f49266 = true;
            this.f49267 = bArr;
            this.f49264 = j;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37735() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                m37734();
            } finally {
                this.f49267 = null;
                this.f49262 = 0;
                this.f49266 = false;
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m37732() {
        if (this.f49265) {
            throw new IOException("Recovery file is closed");
        }
        if (this.f49261 != null) {
            throw new IOException("Buffered recovery append requires reopening", this.f49261);
        }
    }

    public final void flush() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m37734();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m37734() {
        m37732();
        int i = this.f49262;
        if (i == 0) {
            return;
        }
        try {
            this.f49263.mo14383(this.f49264, i, this.f49267);
            this.f49264 += this.f49262;
            this.f49262 = 0;
        } catch (IOException e) {
            this.f49261 = e;
            throw e;
        }
    }

    @Override // l.InterfaceC10316
    /* renamed from: ֫ */
    public final void mo14383(long j, int i, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m37732();
            int i2 = 0;
            m37733(j, bArr, 0, i);
            byte[] bArr2 = this.f49267;
            InterfaceC10316 interfaceC10316 = this.f49263;
            if (bArr2 == null) {
                interfaceC10316.mo14383(j, i, bArr);
            } else if (j != this.f49264 + this.f49262) {
                m37734();
                interfaceC10316.mo14383(j, i, bArr);
                this.f49264 = interfaceC10316.length();
            } else {
                while (i > 0) {
                    int min = Math.min(i, this.f49267.length - this.f49262);
                    System.arraycopy(bArr, i2, this.f49267, this.f49262, min);
                    int i3 = this.f49262 + min;
                    this.f49262 = i3;
                    i2 += min;
                    i -= min;
                    if (i3 == this.f49267.length) {
                        m37734();
                    }
                }
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // l.InterfaceC10316
    /* renamed from: ֫ */
    public final void mo14384(long j, byte[] bArr, int i, int i2) {
        long j2;
        int i3;
        int i4 = i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.readLock().lock();
        try {
            m37732();
            m37733(j, bArr, i, i2);
            int i5 = this.f49262;
            if (i5 != 0) {
                long j3 = this.f49264;
                if (j < i5 + j3 && i4 + j > j3) {
                    if (j < j3) {
                        int i6 = (int) (j3 - j);
                        this.f49263.mo14384(j, bArr, i, i6);
                        j2 = i6 + j;
                        i3 = i + i6;
                        i4 -= i6;
                    } else {
                        j2 = j;
                        i3 = i;
                    }
                    int min = (int) Math.min(i4, (this.f49264 + this.f49262) - j2);
                    System.arraycopy(this.f49267, (int) (j2 - this.f49264), bArr, i3, min);
                    if (min < i4) {
                        this.f49263.mo14384(min + j2, bArr, i3 + min, i4 - min);
                    }
                }
            }
            this.f49263.mo14384(j, bArr, i, i2);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37733(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || j > C13132.FOREVER_NS - i2 || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException("Invalid recovery I/O range");
        }
    }

    @Override // l.InterfaceC10316
    public final long length() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.readLock().lock();
        try {
            m37732();
            int i = this.f49262;
            InterfaceC10316 interfaceC10316 = this.f49263;
            return i == 0 ? interfaceC10316.length() : Math.max(interfaceC10316.length(), this.f49264 + this.f49262);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // l.InterfaceC10316
    public final void truncate(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (this.f49265) {
                throw new IOException("Recovery file is closed");
            }
            if (j < 0) {
                throw new IllegalArgumentException("Negative recovery length");
            }
            IOException iOException = this.f49261;
            InterfaceC10316 interfaceC10316 = this.f49263;
            if (iOException != null) {
                this.f49262 = 0;
                interfaceC10316.truncate(j);
            } else {
                int i = this.f49262;
                if (i != 0) {
                    long j2 = this.f49264;
                    if (j >= j2) {
                        this.f49262 = (int) Math.min(i, j - j2);
                    }
                }
                interfaceC10316.truncate(j);
                this.f49262 = 0;
                this.f49264 = Math.min(this.f49264, j);
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // l.InterfaceC10316
    /* renamed from: ܺ */
    public final void mo14386() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m37734();
            this.f49263.mo14386();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // l.InterfaceC10316
    /* renamed from: ۘ֫ */
    public final void mo14385() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f49263.mo14385();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC10316 interfaceC10316 = this.f49263;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!this.f49265) {
                try {
                    if (this.f49261 == null) {
                        m37734();
                    }
                } finally {
                    this.f49267 = null;
                    this.f49262 = 0;
                    this.f49266 = false;
                    this.f49265 = true;
                    interfaceC10316.close();
                }
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
