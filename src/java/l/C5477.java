package l;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;

/* compiled from: M70O */
/* renamed from: l.ۚܽܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5477 implements InterfaceC4339, InterfaceC2655 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f17008 = new AtomicInteger(1);

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15587 f17009;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f17010;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f17011;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C1785 f17012;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f17013;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FileChannel f17014;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17471 f17015;

    public C5477(C15587 c15587, C1785 c1785, FileChannel fileChannel, C17471 c17471, BooleanSupplier booleanSupplier) {
        this.f17009 = c15587;
        this.f17012 = c1785;
        this.f17010 = (int) Math.min(c1785.m5940(), 2147483647L);
        this.f17014 = fileChannel;
        this.f17015 = c17471;
        this.f17013 = booleanSupplier;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5477 m15575(C15587 c15587) {
        return m15576(c15587, new C0537(), false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5477 m15577(C15587 c15587) {
        return m15576(c15587, new C0537(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r7 != null) goto L54;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5477 m15576(l.C15587 r9, java.util.function.BooleanSupplier r10, boolean r11) {
        /*
            l.C11003.requireNonNull(r9)
            boolean r0 = r10.getAsBoolean()
            if (r0 == 0) goto L92
            l.֫ۧܳ r0 = new l.֫ۧܳ
            long r1 = r9.mo23127()
            long r3 = r9.mo23117()
            r0.<init>(r1, r3)
            if (r11 != 0) goto L2c
            long r1 = r0.m5940()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 > 0) goto L24
            goto L2c
        L24:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Only files smaller than 2 GB can be opened"
            r9.<init>(r10)
            throw r9
        L2c:
            r11 = 0
            l.ܿܽܳ r7 = l.C14648.m34938()     // Catch: java.lang.Error -> L6f java.lang.RuntimeException -> L71 java.io.IOException -> L73
            java.nio.channels.FileChannel r8 = r9.mo27922()     // Catch: java.lang.Error -> L69 java.lang.RuntimeException -> L6b java.io.IOException -> L6d
            l.C11003.requireNonNull(r8)     // Catch: java.lang.Error -> L69 java.lang.RuntimeException -> L6b java.io.IOException -> L6d
            l.֫ۧܳ r3 = new l.֫ۧܳ     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            long r1 = r9.mo23127()     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            long r4 = r9.mo23117()     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            r3.<init>(r1, r4)     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            boolean r11 = r0.equals(r3)     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            if (r11 == 0) goto L5c
            boolean r11 = r10.getAsBoolean()     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            if (r11 == 0) goto L5c
            l.ۚܽܳ r11 = new l.ۚܽܳ     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            r1 = r11
            r2 = r9
            r4 = r8
            r5 = r7
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            return r11
        L5c:
            l.ۚᩳܳ r9 = new l.ۚᩳܳ     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            r9.<init>()     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
            throw r9     // Catch: java.lang.Error -> L62 java.lang.RuntimeException -> L64 java.io.IOException -> L66
        L62:
            r9 = move-exception
            goto L67
        L64:
            r9 = move-exception
            goto L67
        L66:
            r9 = move-exception
        L67:
            r11 = r8
            goto L75
        L69:
            r9 = move-exception
            goto L75
        L6b:
            r9 = move-exception
            goto L75
        L6d:
            r9 = move-exception
            goto L75
        L6f:
            r9 = move-exception
            goto L74
        L71:
            r9 = move-exception
            goto L74
        L73:
            r9 = move-exception
        L74:
            r7 = r11
        L75:
            if (r11 == 0) goto L8c
            r11.close()     // Catch: java.lang.Throwable -> L7b
            goto L8c
        L7b:
            r10 = move-exception
            if (r10 == r9) goto L89
            r9.addSuppressed(r10)     // Catch: java.lang.Throwable -> L82
            goto L89
        L82:
            r9 = move-exception
            if (r7 == 0) goto L88
            r7.close()
        L88:
            throw r9
        L89:
            if (r7 == 0) goto L91
            goto L8e
        L8c:
            if (r7 == 0) goto L91
        L8e:
            r7.close()
        L91:
            throw r9
        L92:
            l.ۚᩳܳ r9 = new l.ۚᩳܳ
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5477.m15576(l.ܺ֡ܿ, java.util.function.BooleanSupplier, boolean):l.ۚܽܳ");
    }

    @Override // l.InterfaceC18883
    public final int length() {
        return this.f17010;
    }

    @Override // l.InterfaceC18883
    /* renamed from: ֫ */
    public final void mo10084(int i, byte[] bArr, int i2, int i3) {
        C9005.m23246(this.f17010, i, i3);
        C9005.m23245(bArr.length, i2, i3);
        if (this.f17008.get() <= 0) {
            throw new ClosedChannelException();
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, i3);
        long j = i;
        while (wrap.hasRemaining()) {
            int read = this.f17014.read(wrap, j);
            if (read < 0) {
                if (!mo10086()) {
                    throw new C5519();
                }
                throw new C5519(new EOFException("Unexpected end of source file"));
            }
            if (read == 0) {
                Thread.yield();
            } else {
                j += read;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1785 m15578() {
        return this.f17012;
    }

    @Override // l.InterfaceC18883
    /* renamed from: ۫ */
    public final boolean mo10086() {
        if (this.f17011) {
            return true;
        }
        return this.f17012.m5939(this.f17009) && this.f17013.getAsBoolean();
    }

    @Override // l.InterfaceC4339
    /* renamed from: ۡ֫ */
    public final void mo13039() {
        this.f17011 = true;
    }

    @Override // l.InterfaceC18883
    /* renamed from: ᩺ۧ */
    public final InterfaceC18883 mo10088() {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f17008;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C17471 c17471 = this.f17015;
        AtomicInteger atomicInteger = this.f17008;
        int decrementAndGet = atomicInteger.decrementAndGet();
        if (decrementAndGet == 0) {
            try {
                this.f17014.close();
            } finally {
                c17471.close();
            }
        } else {
            if (decrementAndGet >= 0) {
                return;
            }
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("NormalFileSource already closed");
        }
    }
}
