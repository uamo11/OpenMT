package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: X99G */
/* renamed from: l.᩵ۨ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19435 extends AbstractC3912 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f62862;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f62864;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f62865;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23411 f62866;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f62868;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f62863 = -1;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62867 = -1;

    public C19435(AbstractC15440 abstractC15440) {
        C23411 m36513 = abstractC15440.m36513("r");
        this.f62866 = m36513;
        long length = m36513.length();
        int i = (int) length;
        if (length != i) {
            throw new ArithmeticException();
        }
        this.f62862 = i;
        this.f62868 = new byte[i];
        this.f62866.seek(0L);
        this.f62866.readFully(this.f62868);
        this.f62865 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44776(C12918 c12918) {
        if (c12918.m31418() != this) {
            throw new RuntimeException();
        }
        Iterator it = new C15034(c12918).iterator();
        C20846 c20846 = null;
        int i = -1;
        int i2 = -1;
        while (it.hasNext()) {
            Iterator it2 = ((C7980) it.next()).getMethods().iterator();
            while (it2.hasNext()) {
                C20846 mo3570 = ((C16611) it2.next()).mo3570();
                if (mo3570 != null) {
                    int i3 = mo3570.f67488;
                    if (i == -1) {
                        c20846 = mo3570;
                        i = i3;
                        i2 = i;
                    } else if (i3 < i) {
                        i = i3;
                    } else if (i3 > i2) {
                        c20846 = mo3570;
                        i2 = i3;
                    }
                }
            }
        }
        if (c20846 == null) {
            return;
        }
        int m47669 = (c20846.m47669() * 2) + c20846.f67488 + 16;
        Iterator it3 = c20846.mo3811().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((C15905) it3.next()).mo14556().iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            m47669 = Math.max(m47669, ((AbstractC21427) it4).m48544());
        }
        if (this.f62863 != -1) {
            throw new IllegalStateException();
        }
        this.f62863 = i;
        this.f62867 = m47669;
        if (this.f62866 == null) {
            AbstractC15440 m36527 = C16293.f50113.m36527();
            m36527.m36503(this.f62868, i, m47669 - i);
            this.f62864 = m36527;
            this.f62866 = m36527.m36513("r");
            this.f62865 = -i;
        }
        byte[] bArr = this.f62868;
        int length = bArr.length - (m47669 - i);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = this.f62868;
        System.arraycopy(bArr3, m47669, bArr2, i, bArr3.length - m47669);
        System.out.println("FileDexBuffer.optimize() save memory: " + ((this.f62868.length - length) / 1024) + "KB");
        this.f62868 = bArr2;
    }

    @Override // l.AbstractC3912
    /* renamed from: ֫ */
    public final byte mo11933(int i) {
        byte readByte;
        int i2 = this.f62863;
        int i3 = this.f62867;
        boolean z = true;
        if (i2 != -1 && i > i2 - 1) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            return this.f62868[i];
        }
        if (i < i2 || i + 1 > i3) {
            throw new RuntimeException();
        }
        synchronized (this.f62866) {
            try {
                try {
                    this.f62866.seek(this.f62865 + i);
                    readByte = this.f62866.readByte();
                } catch (IOException e) {
                    throw new C15431(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return readByte;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // l.AbstractC3912
    /* renamed from: ᩻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo11943(int r5) {
        /*
            r4 = this;
            int r0 = r4.f62863
            int r1 = r4.f62867
            r2 = -1
            if (r0 == r2) goto L14
            int r2 = r0 + (-2)
            if (r5 > r2) goto Lc
            goto L14
        Lc:
            if (r5 < r1) goto L12
            int r2 = r1 - r0
            int r5 = r5 - r2
            goto L14
        L12:
            r2 = 0
            goto L15
        L14:
            r2 = 1
        L15:
            if (r2 == 0) goto L25
            byte[] r0 = r4.f62868
            r1 = r0[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r5 = r5 + 1
            r5 = r0[r5]
            int r5 = r5 << 8
            r5 = r5 | r1
            return r5
        L25:
            if (r5 < r0) goto L4c
            int r0 = r5 + 2
            if (r0 <= r1) goto L2c
            goto L4c
        L2c:
            l.᩻ۖܽ r0 = r4.f62866
            monitor-enter(r0)
            l.᩻ۖܽ r1 = r4.f62866     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            int r2 = r4.f62865     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            int r2 = r2 + r5
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r1.seek(r2)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            l.᩻ۖܽ r5 = r4.f62866     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            int r5 = r5.mo21172()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            short r5 = (short) r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return r5
        L41:
            r5 = move-exception
            goto L4a
        L43:
            r5 = move-exception
            l.ܶ᩵ۚ r1 = new l.ܶ᩵ۚ     // Catch: java.lang.Throwable -> L41
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L41
            throw r1     // Catch: java.lang.Throwable -> L41
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r5
        L4c:
            byte r0 = r4.mo11933(r5)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r5 = r5 + 1
            byte r5 = r4.mo11933(r5)
            int r5 = r5 << 8
            r5 = r5 | r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19435.mo11943(int):int");
    }

    @Override // l.AbstractC3912
    /* renamed from: ۧ */
    public final int mo11937(int i) {
        int readInt;
        int i2 = this.f62863;
        int i3 = this.f62867;
        boolean z = true;
        if (i2 != -1 && i > i2 - 4) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f62868;
            return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        if (i < i2 || i + 4 > i3) {
            return (mo11933(i + 3) << 24) | (mo11933(i) & 255) | ((mo11933(i + 1) & 255) << 8) | ((mo11933(i + 2) & 255) << 16);
        }
        synchronized (this.f62866) {
            try {
                try {
                    this.f62866.seek(this.f62865 + i);
                    readInt = this.f62866.readInt();
                } catch (IOException e) {
                    throw new C15431(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return readInt;
    }

    @Override // l.AbstractC3912
    /* renamed from: ܽ */
    public final long mo11940(int i) {
        long readLong;
        int i2 = this.f62863;
        int i3 = this.f62867;
        boolean z = true;
        if (i2 != -1 && i > i2 - 8) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f62868;
            return (bArr[i + 7] << 56) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 4] & 255) << 32) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 5] & 255) << 40);
        }
        if (i < i2 || i + 8 > i3) {
            return (mo11933(i) & 255) | ((mo11933(i + 1) & 255) << 8) | ((mo11933(i + 2) & 255) << 16) | ((mo11933(i + 3) & 255) << 24) | ((mo11933(i + 4) & 255) << 32) | ((mo11933(i + 5) & 255) << 40) | ((mo11933(i + 6) & 255) << 48) | (mo11933(i + 7) << 56);
        }
        synchronized (this.f62866) {
            try {
                try {
                    this.f62866.seek(this.f62865 + i);
                    readLong = this.f62866.readLong();
                } catch (IOException e) {
                    throw new C15431(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return readLong;
    }

    @Override // l.AbstractC3912
    public final int length() {
        return this.f62862;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f62868 = null;
        C23411 c23411 = this.f62866;
        if (c23411 != null) {
            c23411.close();
            this.f62866 = null;
        }
        AbstractC15440 abstractC15440 = this.f62864;
        if (abstractC15440 != null) {
            abstractC15440.mo27929();
            this.f62864 = null;
        }
    }

    public final void finalize() {
        super.finalize();
        C0349.m1793(this);
    }
}
