package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: N8BL */
/* renamed from: l.ᩳۨۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18030 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C16618 f56209 = new C16618(new byte[0]);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InputStream f56210;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Thread f56212;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile Exception f56213;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f56211 = new LinkedBlockingQueue(3);

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f56217 = new LinkedBlockingQueue(3);

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f56214 = new AtomicBoolean(false);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f56218 = new AtomicBoolean(false);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16618 f56216 = null;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f56215 = 0;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C18030(InputStream inputStream) {
        this.f56210 = inputStream;
        for (int i = 0; i < 3; i++) {
            this.f56217.add(new C16618(new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT]));
        }
        Thread thread = new Thread(new RunnableC19473(4, this, inputStream));
        this.f56212 = thread;
        thread.setName("InputStream-Decompress-Thread");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r7.f56217.put(r2);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m42092(l.C18030 r7, java.io.InputStream r8) {
        /*
            l.ܽۨۡ r0 = l.C18030.f56209
        L2:
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f56218     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            if (r2 != 0) goto L62
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            boolean r2 = r2.isInterrupted()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            if (r2 != 0) goto L62
            java.util.concurrent.LinkedBlockingQueue r2 = r7.f56217     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            r4 = 100
            java.lang.Object r2 = r2.poll(r4, r3)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            l.ܽۨۡ r2 = (l.C16618) r2     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            if (r2 != 0) goto L2c
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f56218     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            if (r2 == 0) goto L2
            goto L62
        L2c:
            byte[] r3 = r2.f51061     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            int r3 = r8.read(r3)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            r6 = -1
            if (r3 != r6) goto L3b
            java.util.concurrent.LinkedBlockingQueue r8 = r7.f56217     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            r8.put(r2)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            goto L62
        L3b:
            r2.f51062 = r3     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            r3 = 0
        L3e:
            if (r3 != 0) goto L5b
            java.util.concurrent.atomic.AtomicBoolean r6 = r7.f56218     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            if (r6 != 0) goto L5b
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            boolean r6 = r6.isInterrupted()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            if (r6 != 0) goto L5b
            java.util.concurrent.LinkedBlockingQueue r3 = r7.f56211     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            boolean r3 = r3.offer(r2, r4, r6)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            goto L3e
        L5b:
            if (r3 != 0) goto L2
            java.util.concurrent.LinkedBlockingQueue r8 = r7.f56217     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            r8.put(r2)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
        L62:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f56214
            r8.set(r1)
            java.util.concurrent.LinkedBlockingQueue r7 = r7.f56211     // Catch: java.lang.InterruptedException -> L84
            r7.put(r0)     // Catch: java.lang.InterruptedException -> L84
            return
        L6d:
            r8 = move-exception
            goto L85
        L6f:
            r8 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f56218     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L7a
            r7.f56213 = r8     // Catch: java.lang.Throwable -> L6d
        L7a:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f56214
            r8.set(r1)
            java.util.concurrent.LinkedBlockingQueue r7 = r7.f56211     // Catch: java.lang.InterruptedException -> L84
            r7.put(r0)     // Catch: java.lang.InterruptedException -> L84
        L84:
            return
        L85:
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f56214
            r2.set(r1)
            java.util.concurrent.LinkedBlockingQueue r7 = r7.f56211     // Catch: java.lang.InterruptedException -> L8f
            r7.put(r0)     // Catch: java.lang.InterruptedException -> L8f
        L8f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18030.m42092(l.ᩳۨۡ, java.io.InputStream):void");
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f56218.get()) {
            throw new IOException("Stream closed");
        }
        m42091();
        C16618 c16618 = this.f56216;
        if ((c16618 == null || this.f56215 >= c16618.f51062) && !m42093()) {
            m42091();
            return -1;
        }
        byte[] bArr = this.f56216.f51061;
        int i = this.f56215;
        this.f56215 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f56218.get()) {
            throw new IOException("Stream closed");
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        m42091();
        C16618 c16618 = this.f56216;
        if ((c16618 == null || this.f56215 >= c16618.f51062) && !m42093()) {
            m42091();
            return -1;
        }
        int min = Math.min(this.f56216.f51062 - this.f56215, i2);
        System.arraycopy(this.f56216.f51061, this.f56215, bArr, i, min);
        this.f56215 += min;
        return min;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (r1.get() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004e, code lost:
    
        if (r2 != r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        r8.f56216 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0053, code lost:
    
        r8.f56216 = r2;
        r8.f56215 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        return true;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m42093() {
        /*
            r8 = this;
            java.util.concurrent.LinkedBlockingQueue r0 = r8.f56211
            l.ܽۨۡ r1 = r8.f56216     // Catch: java.lang.InterruptedException -> L59
            r2 = 0
            l.ܽۨۡ r3 = l.C18030.f56209
            r4 = 0
            if (r1 == 0) goto L15
            if (r1 == r3) goto L15
            r1.f51062 = r4     // Catch: java.lang.InterruptedException -> L59
            java.util.concurrent.LinkedBlockingQueue r5 = r8.f56217     // Catch: java.lang.InterruptedException -> L59
            r5.put(r1)     // Catch: java.lang.InterruptedException -> L59
            r8.f56216 = r2     // Catch: java.lang.InterruptedException -> L59
        L15:
            boolean r1 = r0.isEmpty()     // Catch: java.lang.InterruptedException -> L59
            java.util.concurrent.atomic.AtomicBoolean r5 = r8.f56214
            if (r1 == 0) goto L24
            boolean r1 = r5.get()     // Catch: java.lang.InterruptedException -> L59
            if (r1 == 0) goto L24
            goto L4d
        L24:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.f56218
            if (r2 != 0) goto L47
            boolean r6 = r1.get()     // Catch: java.lang.InterruptedException -> L59
            if (r6 != 0) goto L47
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L59
            r6 = 100
            java.lang.Object r2 = r0.poll(r6, r2)     // Catch: java.lang.InterruptedException -> L59
            l.ܽۨۡ r2 = (l.C16618) r2     // Catch: java.lang.InterruptedException -> L59
            if (r2 != 0) goto L24
            boolean r6 = r5.get()     // Catch: java.lang.InterruptedException -> L59
            if (r6 != 0) goto L4d
            boolean r1 = r1.get()     // Catch: java.lang.InterruptedException -> L59
            if (r1 == 0) goto L24
            goto L4d
        L47:
            boolean r0 = r1.get()     // Catch: java.lang.InterruptedException -> L59
            if (r0 == 0) goto L4e
        L4d:
            return r4
        L4e:
            if (r2 != r3) goto L53
            r8.f56216 = r3     // Catch: java.lang.InterruptedException -> L59
            return r4
        L53:
            r8.f56216 = r2     // Catch: java.lang.InterruptedException -> L59
            r8.f56215 = r4     // Catch: java.lang.InterruptedException -> L59
            r0 = 1
            return r0
        L59:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Interrupted while waiting for data"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18030.m42093():boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42091() {
        if (this.f56213 != null) {
            if (this.f56213 instanceof IOException) {
                throw ((IOException) this.f56213);
            }
            throw new IOException("Error in reader thread", this.f56213);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.f56214;
        Thread thread = this.f56212;
        if (this.f56218.compareAndSet(false, true)) {
            try {
                thread.interrupt();
                try {
                    thread.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f56210.close();
                this.f56211.clear();
                this.f56217.clear();
                this.f56216 = null;
            } finally {
                atomicBoolean.set(true);
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.f56218.get()) {
            throw new IOException("Stream closed");
        }
        C16618 c16618 = this.f56216;
        if (c16618 != null) {
            return c16618.f51062 - this.f56215;
        }
        return 0;
    }
}
