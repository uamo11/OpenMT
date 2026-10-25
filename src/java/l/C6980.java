package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: R8AK */
/* renamed from: l.ۜ᩵᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6980 extends OutputStream {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f21509;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public IOException f21510;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] f21511;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C17563 f21512;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f21513 = new ArrayDeque();

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f21514;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f21515;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7664 f21516;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f21517;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20177 f21518;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23186 f21519;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f21520;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C14013 f21521;

    public C6980(int i, int i2, C17563 c17563, C23186 c23186, C14013 c14013, C7664 c7664, C20177 c20177) {
        this.f21511 = new byte[Math.max(1, i)];
        this.f21512 = c17563;
        this.f21519 = c23186;
        this.f21521 = c14013;
        this.f21516 = c7664;
        this.f21518 = c20177;
        this.f21509 = Math.max(1, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        m18866();
        int i2 = this.f21514;
        byte[] bArr = this.f21511;
        if (i2 == bArr.length) {
            m18869();
        }
        int i3 = this.f21514;
        this.f21514 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        m18866();
        C11003.checkFromIndexSize(i, i2, bArr.length);
        while (i2 > 0) {
            byte[] bArr2 = this.f21511;
            int min = Math.min(i2, bArr2.length - this.f21514);
            System.arraycopy(bArr, i, bArr2, this.f21514, min);
            int i3 = this.f21514 + min;
            this.f21514 = i3;
            i += min;
            i2 -= min;
            if (i3 == bArr2.length) {
                m18869();
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        m18866();
        m18869();
        m18867();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21520) {
            return;
        }
        boolean z = false;
        boolean z2 = this.f21510 != null;
        if (!z2) {
            try {
                m18869();
                m18867();
            } catch (IOException e) {
                e = e;
            }
        }
        e = null;
        try {
            this.f21519.run();
        } catch (IOException e2) {
            e = C4863.m14183(e, e2);
        }
        if (!z2 && e == null && this.f21513.isEmpty()) {
            z = true;
        }
        InterfaceC9097 interfaceC9097 = z ? this.f21521 : this.f21516;
        if (!z) {
            m18863();
        }
        try {
            interfaceC9097.run();
        } catch (IOException e3) {
            e = C4863.m14183(e, e3);
        }
        this.f21520 = true;
        if (e != null) {
            throw e;
        }
    }

    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m18869() {
        int i = this.f21514;
        if (i == 0) {
            return;
        }
        try {
            byte[] copyOf = Arrays.copyOf(this.f21511, i);
            long j = this.f21515;
            ArrayDeque arrayDeque = this.f21513;
            while (arrayDeque.size() >= this.f21509) {
                m18868();
            }
            arrayDeque.addLast(m18865(j, i, copyOf));
            this.f21515 += i;
            this.f21514 = 0;
        } catch (IOException e) {
            this.f21510 = e;
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C23913 m18865(long j, int i, byte[] bArr) {
        C7586 c7586;
        C17563 c17563 = this.f21512;
        c17563.getClass();
        try {
            c7586 = c17563.f53681.f68017;
            return new C23913(bArr, i, j, new C20386(c7586, c7586.m20338(j, i, bArr)));
        } catch (C1092 e) {
            throw new IOException(e.getMessage(), e);
        } catch (C10951 e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m18867() {
        while (!this.f21513.isEmpty()) {
            m18868();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m18868() {
        boolean m14203;
        InterfaceC4158 interfaceC4158;
        long j;
        byte[] bArr;
        int i;
        long j2;
        ArrayDeque arrayDeque = this.f21513;
        C23913 c23913 = (C23913) arrayDeque.removeFirst();
        try {
            m18864(c23913);
        } catch (IOException e) {
            this.f21518.getClass();
            m14203 = C4863.m14203((Exception) e);
            if (!m14203 || this.f21517) {
                this.f21510 = e;
                interfaceC4158 = c23913.f77319;
                ((C20386) interfaceC4158).m46700();
                m18863();
                throw e;
            }
            this.f21517 = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c23913);
            arrayList.addAll(arrayDeque);
            m18863();
            arrayDeque.clear();
            try {
                C17563 c17563 = this.f21512;
                j = c23913.f77317;
                this.f21509 = Math.max(1, Math.min(this.f21509, c17563.m41054(j)));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C23913 c239132 = (C23913) it.next();
                    while (arrayDeque.size() >= this.f21509) {
                        m18868();
                    }
                    bArr = c239132.f77316;
                    i = c239132.f77318;
                    j2 = c239132.f77317;
                    arrayDeque.addLast(m18865(j2, i, bArr));
                }
                m18867();
            } catch (IOException e2) {
                this.f21510 = C4863.m14183(e, e2);
                m18863();
                throw this.f21510;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18864(C23913 c23913) {
        InterfaceC4158 interfaceC4158;
        int i;
        long unused;
        interfaceC4158 = c23913.f77319;
        long m46699 = ((C20386) interfaceC4158).m46699();
        i = c23913.f77318;
        if (m46699 == i) {
            unused = c23913.f77317;
        } else {
            if (m46699 <= 0) {
                throw new IOException("SMB write returned no progress");
            }
            throw new IOException("SMB write returned partial progress: expected " + i + ", actual " + m46699);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18863() {
        InterfaceC4158 interfaceC4158;
        while (true) {
            ArrayDeque arrayDeque = this.f21513;
            if (arrayDeque.isEmpty()) {
                return;
            }
            interfaceC4158 = ((C23913) arrayDeque.removeFirst()).f77319;
            ((C20386) interfaceC4158).m46700();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m18866() {
        if (this.f21520) {
            throw new IOException("Stream is closed");
        }
        IOException iOException = this.f21510;
        if (iOException != null) {
            throw iOException;
        }
    }
}
