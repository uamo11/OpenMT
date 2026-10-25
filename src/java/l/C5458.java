package l;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* compiled from: W144 */
/* renamed from: l.ۚܺܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5458 implements Closeable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f16985;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0518[] f16986;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16987;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f16988;

    public C5458(InterfaceC15334[] interfaceC15334Arr) {
        this(Arrays.asList(interfaceC15334Arr));
    }

    public C5458(List list) {
        this.f16987 = new AtomicInteger();
        int i = 0;
        this.f16988 = false;
        this.f16986 = new C0518[list.size()];
        this.f16985 = new CountDownLatch(list.size());
        while (true) {
            C0518[] c0518Arr = this.f16986;
            if (i < c0518Arr.length) {
                c0518Arr[i] = new C0518(this, (InterfaceC15334) list.get(i));
                i++;
            } else {
                try {
                    this.f16985.await();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15563(ByteBuffer byteBuffer) {
        m15562(new C19570(byteBuffer), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r6.m44460(r1.m43574());
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15562(java.io.InputStream r5, l.C19277 r6) {
        /*
            r4 = this;
            l.ᩴܺܽ r0 = new l.ᩴܺܽ
            r0.<init>()
            l.ᩴܺܽ r1 = new l.ᩴܺܽ
            r1.<init>()
        La:
            boolean r2 = r0.m43575(r5)
            if (r2 == 0) goto L55
        L10:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.f16987
            int r3 = r2.get()
            if (r3 == 0) goto L24
            boolean r3 = r0.m43576()
            if (r3 == 0) goto L24
            boolean r3 = r0.m43572(r5)
            if (r3 != 0) goto L10
        L24:
            if (r6 == 0) goto L2d
            int r3 = r0.m43574()
            r6.m44460(r3)
        L2d:
            r4.m15564(r0)
            boolean r3 = r1.m43575(r5)
            if (r3 == 0) goto L55
        L36:
            int r3 = r2.get()
            if (r3 == 0) goto L48
            boolean r3 = r1.m43576()
            if (r3 == 0) goto L48
            boolean r3 = r1.m43572(r5)
            if (r3 != 0) goto L36
        L48:
            if (r6 == 0) goto L51
            int r2 = r1.m43574()
            r6.m44460(r2)
        L51:
            r4.m15564(r1)
            goto La
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5458.m15562(java.io.InputStream, l.᩵ۛۡ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15564(C18864 c18864) {
        while (this.f16987.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f16987.set(this.f16986.length);
        for (C0518 c0518 : this.f16986) {
            c0518.f2171 = c18864;
            LockSupport.unpark(c0518);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (this.f16987.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f16988 = true;
        for (C0518 c0518 : this.f16986) {
            c0518.interrupt();
        }
    }
}
