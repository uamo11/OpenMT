package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: 56TX */
/* renamed from: l.֡ۗᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0149 implements AutoCloseable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f1281;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile C11936 f1282;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1283;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C3720 f1284;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f1285;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C5377 f1286;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C23721 f1287;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15253 f1288;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18537 f1289;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile Throwable f1290;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f1291 = new ReentrantLock();

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20900 f1292;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f1293;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C21605 f1294;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C5131 f1295;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f1296;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f1297;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C18495 f1298;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0149 m1233(C23721 c23721, InterfaceC20900 interfaceC20900, Charset charset) {
        C21605 m52353 = c23721.m52353();
        try {
            long m3930 = m52353.f69370.m3930() / 32;
            int i = 32768;
            while (i > 1024 && i > m3930) {
                i /= 2;
            }
            C11003.requireNonNull(interfaceC20900);
            C6788 identity = interfaceC20900.identity();
            C11003.requireNonNull(charset);
            return new C0149(c23721, interfaceC20900, new C5131(EnumC0191.LOADING, EnumC19243.NONE, identity, charset.name(), i, 0L, 0L, new byte[32], 0, false));
        } finally {
            m52353.m48812();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0149 m1232(C23721 c23721, InterfaceC20900 interfaceC20900) {
        return new C0149(c23721, interfaceC20900, null);
    }

    public C0149(C23721 c23721, InterfaceC20900 interfaceC20900, C5131 c5131) {
        C11003.requireNonNull(c23721);
        this.f1287 = c23721;
        C11003.requireNonNull(interfaceC20900);
        this.f1292 = interfaceC20900;
        this.f1283 = Integer.MAX_VALUE;
        this.f1281 = c5131 == null;
        this.f1294 = c23721.m52353();
        try {
            c23721.m52338(this, c5131);
        } catch (Error | RuntimeException e) {
            this.f1294.m48812();
            throw e;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5131 m1245() {
        return this.f1295;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Throwable m1248() {
        return this.f1290;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m1246() {
        return this.f1297;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18495 m1249() {
        return m1242(this.f1295.m14681());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18495 m1242(int i) {
        if (i < 1 || i > 65536) {
            throw new IllegalArgumentException("Invalid preferred load batch size");
        }
        this.f1287.m52336(this);
        ReentrantLock reentrantLock = this.f1291;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (this.f1298 != null) {
            this.f1291.unlock();
            throw new IllegalStateException("Previous text batch is not published");
        }
        try {
            try {
                try {
                    if (!this.f1285 && !this.f1297 && m1240()) {
                        if (!this.f1293) {
                            m1236();
                            try {
                                if (!this.f1297 && m1240()) {
                                    m1241();
                                    if (!this.f1297 && m1240()) {
                                        this.f1293 = true;
                                    }
                                    try {
                                        if (this.f1297 || !m1240()) {
                                            m1237();
                                        }
                                        return null;
                                    } finally {
                                    }
                                }
                                if (this.f1297 || !m1240()) {
                                    m1237();
                                }
                                return null;
                            } finally {
                            }
                        }
                        int m14681 = this.f1295.m14681();
                        m1238(Math.max(m14681, (((int) Math.min(i, this.f1294.f69370.m3930() / 16)) / m14681) * m14681));
                        int min = Math.min(this.f1296.length, Math.max(m14681, (i / m14681) * m14681));
                        byte[] m14684 = this.f1295.m14684();
                        int i2 = 0;
                        boolean z = false;
                        while (i2 < min) {
                            if (this.f1297) {
                                try {
                                    if (this.f1297 || !m1240()) {
                                        m1237();
                                    }
                                } finally {
                                }
                            } else {
                                int m1231 = m1231(i2, m14681);
                                if (this.f1297) {
                                    try {
                                        if (this.f1297 || !m1240()) {
                                            m1237();
                                        }
                                    } finally {
                                    }
                                } else {
                                    if (m1231 < m14681) {
                                        z = true;
                                    }
                                    if (m1231 > 0) {
                                        m14684 = this.f1289.m43077(m14684, i2, m1231, this.f1296);
                                        i2 += m1231;
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                            }
                            return null;
                        }
                        byte[] bArr = m14684;
                        int i3 = i2;
                        boolean z2 = z;
                        if (this.f1297) {
                            try {
                                if (this.f1297 || !m1240()) {
                                    m1237();
                                }
                            } finally {
                            }
                        } else {
                            if (this.f1295.m14693() <= C13132.FOREVER_NS - i3) {
                                C18495 c18495 = new C18495(this, i3, this.f1295.m14682(i3, this.f1282.m29126(), bArr, this.f1284.m11311(), this.f1284.m11312(), z2));
                                this.f1298 = c18495;
                                try {
                                    if (this.f1297 || !m1240()) {
                                        m1237();
                                    }
                                    return c18495;
                                } finally {
                                }
                            }
                            m1235(EnumC0191.LIMIT_EXCEEDED, EnumC19243.COORDINATE_LIMIT, (Throwable) null);
                            try {
                                if (this.f1297 || !m1240()) {
                                    m1237();
                                }
                            } finally {
                            }
                        }
                        return null;
                    }
                    if (this.f1297 || !m1240()) {
                        m1237();
                    }
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.f1297 || !m1240()) {
                        m1237();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (IOException e) {
            e = e;
            m1235(EnumC0191.FAILED, EnumC19243.IO, e);
            try {
                if (!this.f1297 || !m1240()) {
                    m1237();
                }
                return null;
            } finally {
            }
        } catch (UncheckedIOException e2) {
            e = e2;
            m1235(EnumC0191.FAILED, EnumC19243.IO, e);
            if (!this.f1297) {
            }
            m1237();
            return null;
        } catch (Error e3) {
            e = e3;
            m1235(EnumC0191.FAILED, EnumC19243.IO, e);
            throw e;
        } catch (C3966 e4) {
            m1235(EnumC0191.LIMIT_EXCEEDED, EnumC19243.CACHE_LIMIT, e4);
            try {
                if (this.f1297 || !m1240()) {
                    m1237();
                }
                return null;
            } finally {
            }
        } catch (RuntimeException e5) {
            e = e5;
            m1235(EnumC0191.FAILED, EnumC19243.IO, e);
            throw e;
        } catch (C19201 e6) {
            m1235(EnumC0191.FAILED, e6.f60453, e6);
            try {
                if (this.f1297 || !m1240()) {
                    m1237();
                }
                return null;
            } finally {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5131 m1234(C0149 c0149, C18495 c18495, InterfaceC0897 interfaceC0897) {
        C0149 c01492;
        int i;
        C5131 c5131;
        boolean mo3245;
        int i2;
        C5131 c51312;
        if (interfaceC0897 != null) {
            interfaceC0897.mo3244(c0149.f1287);
        }
        c0149.f1287.m52336(c0149);
        ReentrantLock reentrantLock = c0149.f1291;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (c0149.f1298 == c18495) {
            c01492 = c18495.f57330;
            if (c01492 == c0149) {
                try {
                    try {
                        try {
                        } catch (Throwable th) {
                            c18495.f57330 = null;
                            if (c0149.f1298 == c18495) {
                                c0149.f1298 = null;
                            }
                            try {
                                if (c0149.f1297 || !c0149.m1240()) {
                                    c0149.m1237();
                                }
                                throw th;
                            } finally {
                            }
                        }
                    } catch (C3966 e) {
                        c0149.m1235(EnumC0191.LIMIT_EXCEEDED, EnumC19243.CACHE_LIMIT, e);
                        c18495.f57330 = null;
                        if (c0149.f1298 == c18495) {
                            c0149.f1298 = null;
                        }
                        try {
                            if (c0149.f1297 || !c0149.m1240()) {
                                c0149.m1237();
                            }
                        } finally {
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        c0149.m1235(EnumC0191.FAILED, EnumC19243.IO, e);
                        throw e;
                    }
                } catch (UncheckedIOException e3) {
                    c0149.m1235(EnumC0191.FAILED, EnumC19243.IO, e3);
                    c18495.f57330 = null;
                    if (c0149.f1298 == c18495) {
                        c0149.f1298 = null;
                    }
                    try {
                        if (c0149.f1297 || !c0149.m1240()) {
                            c0149.m1237();
                        }
                    } finally {
                    }
                } catch (Error e4) {
                    e = e4;
                    c0149.m1235(EnumC0191.FAILED, EnumC19243.IO, e);
                    throw e;
                }
                if (!c0149.f1285 && !c0149.f1297 && c0149.m1240()) {
                    if (interfaceC0897 == null) {
                        C23721 c23721 = c0149.f1287;
                        char[] cArr = c0149.f1296;
                        i2 = c18495.f57329;
                        c51312 = c18495.f57328;
                        mo3245 = c23721.m52344(c0149, cArr, i2, c51312, c0149.f1283);
                    } else {
                        C23721 c237212 = c0149.f1287;
                        char[] cArr2 = c0149.f1296;
                        i = c18495.f57329;
                        c5131 = c18495.f57328;
                        mo3245 = interfaceC0897.mo3245(c237212, c0149, cArr2, i, c5131, c0149.f1283);
                    }
                    if (!mo3245 && !c0149.f1297 && c0149.m1240()) {
                        c0149.m1235(EnumC0191.LIMIT_EXCEEDED, EnumC19243.COORDINATE_LIMIT, (Throwable) null);
                    }
                    c18495.f57330 = null;
                    if (c0149.f1298 == c18495) {
                        c0149.f1298 = null;
                    }
                    try {
                        if (c0149.f1297 || !c0149.m1240()) {
                            c0149.m1237();
                        }
                        c0149.f1291.unlock();
                        return c0149.f1295;
                    } finally {
                    }
                }
                C5131 c51313 = c0149.f1295;
                c18495.f57330 = null;
                if (c0149.f1298 == c18495) {
                    c0149.f1298 = null;
                }
                try {
                    if (c0149.f1297 || !c0149.m1240()) {
                        c0149.m1237();
                    }
                    return c51313;
                } finally {
                }
            }
        }
        c0149.f1291.unlock();
        throw new IllegalStateException("Text batch is not pending");
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m1240() {
        return this.f1295.m14689() == EnumC0191.LOADING;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m1236() {
        if (this.f1281 && !this.f1295.m14685().m18434()) {
            throw new C19201(EnumC19243.SOURCE_UNAVAILABLE, "Text source cannot be reopened");
        }
        this.f1286 = this.f1294.f69370.m3921(m1239(this.f1295.m14681()));
        this.f1296 = new char[this.f1295.m14681()];
        this.f1289 = new C18537(this.f1295.m14681());
        if (this.f1297) {
            return;
        }
        this.f1282 = C11936.m29120(this.f1292.mo14081(), Charset.forName(this.f1295.m14690()), this.f1294.f69370);
        if (this.f1297) {
            return;
        }
        this.f1284 = new C3720(this.f1282);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m1238(int i) {
        if (i <= this.f1296.length) {
            return;
        }
        try {
            C5377 m3921 = this.f1294.f69370.m3921(m1239(i));
            try {
                this.f1286.close();
                this.f1286 = m3921;
                this.f1296 = new char[i];
            } catch (Error | RuntimeException e) {
                m3921.close();
                throw e;
            }
        } catch (C3966 unused) {
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private long m1239(int i) {
        return (((this.f1295.m14681() * 2) + 59) & (-8)) + 256 + 512 + (((i * 2) + 23) & (-8));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m1231(int i, int i2) {
        int i3 = 0;
        while (i3 < i2 && !this.f1297) {
            int min = Math.min(1024, i2 - i3);
            int read = this.f1284.read(this.f1296, i + i3, min);
            if (read > 0) {
                i3 += read;
            }
            if (read < min) {
                break;
            }
        }
        return i3;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m1241() {
        byte[] bArr = new byte[32];
        long m14693 = this.f1295.m14693();
        long j = 0;
        while (j < m14693) {
            if (this.f1297) {
                return;
            }
            int m1231 = m1231(0, this.f1296.length);
            if (this.f1297) {
                return;
            }
            char[] cArr = this.f1296;
            if (m1231 == cArr.length) {
                bArr = this.f1289.m43077(bArr, 0, m1231, cArr);
                j += this.f1296.length;
            } else {
                throw new C19201(EnumC19243.PREFIX_MISMATCH, "Text source prefix is truncated");
            }
        }
        if (!Arrays.equals(bArr, this.f1295.m14684()) || this.f1284.m11311() != this.f1295.m14688() || this.f1284.m11312() != this.f1295.m14694()) {
            throw new C19201(EnumC19243.PREFIX_MISMATCH, "Text source prefix does not match checkpoint");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1235(EnumC0191 enumC0191, EnumC19243 enumC19243, Throwable th) {
        if (th != null) {
            this.f1290 = th;
        }
        C23721 c23721 = this.f1287;
        if (this.f1297) {
            enumC0191 = EnumC0191.CANCELED;
        }
        if (this.f1297) {
            enumC19243 = EnumC19243.NONE;
        }
        c23721.m52337(this, enumC0191, enumC19243);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1243() {
        if (this.f1288 == null) {
            this.f1288 = this.f1294.m48799();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1244(boolean z) {
        C15253 c15253 = this.f1288;
        if (c15253 == null) {
            return;
        }
        if (!z) {
            c15253.flush();
            return;
        }
        this.f1288 = null;
        if (c15253 != null) {
            c15253.close();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1247() {
        this.f1287.m52337(this, EnumC0191.CANCELED, EnumC19243.NONE);
        this.f1297 = true;
        C11936 c11936 = this.f1282;
        if (c11936 != null) {
            try {
                c11936.m29127();
            } catch (IOException e) {
                this.f1290 = e;
            }
        }
        if (this.f1291.isHeldByCurrentThread() || !this.f1291.tryLock()) {
            return;
        }
        try {
            m1237();
        } finally {
            this.f1291.unlock();
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m1237() {
        if (this.f1285) {
            return;
        }
        this.f1285 = true;
        C18495 c18495 = this.f1298;
        if (c18495 != null) {
            c18495.f57330 = null;
            this.f1298 = null;
        }
        try {
            try {
                C11936 c11936 = this.f1282;
                this.f1282 = null;
                if (c11936 != null) {
                    c11936.close();
                }
                this.f1284 = null;
                this.f1296 = null;
                this.f1289 = null;
                try {
                    try {
                        C15253 c15253 = this.f1288;
                        this.f1288 = null;
                        if (c15253 != null) {
                            c15253.close();
                        }
                        try {
                            C5377 c5377 = this.f1286;
                            if (c5377 != null) {
                                c5377.close();
                            }
                        } finally {
                        }
                    } catch (IOException e) {
                        if (this.f1290 == null) {
                            this.f1290 = e;
                        } else if (this.f1290 != e) {
                            this.f1290.addSuppressed(e);
                        }
                        try {
                            C5377 c53772 = this.f1286;
                            if (c53772 != null) {
                                c53772.close();
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        C5377 c53773 = this.f1286;
                        if (c53773 != null) {
                            c53773.close();
                        }
                        throw th;
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                this.f1284 = null;
                this.f1296 = null;
                this.f1289 = null;
                try {
                    try {
                        C15253 c152532 = this.f1288;
                        this.f1288 = null;
                        if (c152532 != null) {
                            c152532.close();
                        }
                    } catch (Throwable th3) {
                        try {
                            C5377 c53774 = this.f1286;
                            if (c53774 != null) {
                                c53774.close();
                            }
                            throw th3;
                        } finally {
                        }
                    }
                } catch (IOException e2) {
                    if (this.f1290 == null) {
                        this.f1290 = e2;
                    } else if (this.f1290 != e2) {
                        this.f1290.addSuppressed(e2);
                    }
                    try {
                        C5377 c53775 = this.f1286;
                        if (c53775 != null) {
                            c53775.close();
                        }
                    } finally {
                    }
                }
                try {
                    C5377 c53776 = this.f1286;
                    if (c53776 != null) {
                        c53776.close();
                    }
                    throw th2;
                } finally {
                }
            }
        } catch (IOException e3) {
            this.f1290 = e3;
            this.f1284 = null;
            this.f1296 = null;
            this.f1289 = null;
            try {
                try {
                    C15253 c152533 = this.f1288;
                    this.f1288 = null;
                    if (c152533 != null) {
                        c152533.close();
                    }
                    try {
                        C5377 c53777 = this.f1286;
                        if (c53777 != null) {
                            c53777.close();
                        }
                    } finally {
                    }
                } catch (IOException e4) {
                    if (this.f1290 == null) {
                        this.f1290 = e4;
                    } else if (this.f1290 != e4) {
                        this.f1290.addSuppressed(e4);
                    }
                    try {
                        C5377 c53778 = this.f1286;
                        if (c53778 != null) {
                            c53778.close();
                        }
                    } finally {
                    }
                }
            } catch (Throwable th4) {
                try {
                    C5377 c53779 = this.f1286;
                    if (c53779 != null) {
                        c53779.close();
                    }
                    throw th4;
                } finally {
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m1247();
    }
}
