package l;

/* compiled from: 81T3 */
/* renamed from: l.ۨܶۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11783 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f35163;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f35165;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f35164 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f35162 = new byte[40960];

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0015, code lost:
    
        if (r9.f35164 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0018, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x001a, code lost:
    
        r11 = r9.f35162.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x001d, code lost:
    
        if (r11 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001f, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0022, code lost:
    
        r3 = r10.length;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0025, code lost:
    
        if (r3 <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0027, code lost:
    
        r6 = r9.f35165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0029, code lost:
    
        if (r6 <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002b, code lost:
    
        r6 = java.lang.Math.min(r3, java.lang.Math.min(r11 - r9.f35163, r6));
        java.lang.System.arraycopy(r9.f35162, r9.f35163, r10, r5, r6);
        r7 = r9.f35163 + r6;
        r9.f35163 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0043, code lost:
    
        if (r7 < r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        r9.f35163 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0047, code lost:
    
        r9.f35165 -= r6;
        r3 = r3 - r6;
        r5 = r5 + r6;
        r4 = r4 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0050, code lost:
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        notify();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0056, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0021, code lost:
    
        r1 = false;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int m28838(byte[] r10, boolean r11) {
        /*
            r9 = this;
            r0 = r9
            monitor-enter(r0)
        L2:
            int r1 = r9.f35165     // Catch: java.lang.Throwable -> L57
            r2 = 0
            if (r1 != 0) goto L13
            boolean r3 = r9.f35164     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L13
            if (r11 == 0) goto L11
            r9.wait()     // Catch: java.lang.InterruptedException -> L2 java.lang.Throwable -> L57
            goto L2
        L11:
            monitor-exit(r0)
            return r2
        L13:
            boolean r11 = r9.f35164     // Catch: java.lang.Throwable -> L57
            if (r11 != 0) goto L1a
            monitor-exit(r0)
            r10 = -1
            return r10
        L1a:
            byte[] r11 = r9.f35162     // Catch: java.lang.Throwable -> L57
            int r11 = r11.length     // Catch: java.lang.Throwable -> L57
            if (r11 != r1) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            int r3 = r10.length     // Catch: java.lang.Throwable -> L57
            r4 = 0
            r5 = 0
        L25:
            if (r3 <= 0) goto L50
            int r6 = r9.f35165     // Catch: java.lang.Throwable -> L57
            if (r6 <= 0) goto L50
            int r7 = r9.f35163     // Catch: java.lang.Throwable -> L57
            int r7 = r11 - r7
            int r6 = java.lang.Math.min(r7, r6)     // Catch: java.lang.Throwable -> L57
            int r6 = java.lang.Math.min(r3, r6)     // Catch: java.lang.Throwable -> L57
            byte[] r7 = r9.f35162     // Catch: java.lang.Throwable -> L57
            int r8 = r9.f35163     // Catch: java.lang.Throwable -> L57
            java.lang.System.arraycopy(r7, r8, r10, r5, r6)     // Catch: java.lang.Throwable -> L57
            int r7 = r9.f35163     // Catch: java.lang.Throwable -> L57
            int r7 = r7 + r6
            r9.f35163 = r7     // Catch: java.lang.Throwable -> L57
            if (r7 < r11) goto L47
            r9.f35163 = r2     // Catch: java.lang.Throwable -> L57
        L47:
            int r7 = r9.f35165     // Catch: java.lang.Throwable -> L57
            int r7 = r7 - r6
            r9.f35165 = r7     // Catch: java.lang.Throwable -> L57
            int r3 = r3 - r6
            int r5 = r5 + r6
            int r4 = r4 + r6
            goto L25
        L50:
            if (r1 == 0) goto L55
            r9.notify()     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r0)
            return r4
        L57:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11783.m28838(byte[], boolean):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m28839() {
        this.f35164 = false;
        notify();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28840(int i, byte[] bArr) {
        int i2;
        int i3;
        if (i > bArr.length) {
            throw new IllegalArgumentException("length + offset > buffer.length");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("length <= 0");
        }
        int length = this.f35162.length;
        synchronized (this) {
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i <= 0) {
                    return true;
                }
                while (true) {
                    try {
                        i2 = this.f35165;
                        if (length != i2 || !this.f35164) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!this.f35164) {
                    return false;
                }
                if (i2 != 0) {
                    z = false;
                }
                int min = Math.min(i, length - i2);
                i -= min;
                while (min > 0) {
                    int i5 = this.f35163;
                    int i6 = this.f35165 + i5;
                    if (i6 >= length) {
                        i6 -= length;
                        i3 = i5 - i6;
                    } else {
                        i3 = length - i6;
                    }
                    int min2 = Math.min(i3, min);
                    System.arraycopy(bArr, i4, this.f35162, i6, min2);
                    i4 += min2;
                    min -= min2;
                    this.f35165 += min2;
                }
                if (z) {
                    notify();
                }
            }
        }
    }
}
