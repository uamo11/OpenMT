package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: B75R */
/* renamed from: l.ۙۚۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4437 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Executor f14174;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20177 f14175;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f14176;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19960 f14177;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f14178;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19960 f14179;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C19960 f14180;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f14181;

    public C4437() {
        ExecutorService executorService = C1802.f6208;
        C20177 c20177 = new C20177();
        this.f14176 = new Object();
        this.f14178 = new ArrayDeque();
        this.f14174 = executorService;
        this.f14175 = c20177;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0020, code lost:
    
        r3 = true;
        r1.f64631 = true;
        r1.f64641++;
        r4 = r1.f64630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        r1.f64630 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (r1 != r5.f14180) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        if (r1 == r5.f14179) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        if (r1.f64632 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
    
        if (r3 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        if (r1.f64638.isEmpty() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        r5.f14178.addLast(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002d, code lost:
    
        r3 = false;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13187(l.C15600 r6, int r7, l.C16576 r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f14176
            monitor-enter(r0)
            l.᩶ۚۜ r1 = r5.f14177     // Catch: java.lang.Throwable -> L69
            r2 = 0
            if (r1 == 0) goto L1e
            int r3 = r1.f64643     // Catch: java.lang.Throwable -> L69
            if (r3 != r7) goto L1e
            java.lang.String r3 = r1.f64640     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = r6.m36764()     // Catch: java.lang.Throwable -> L69
            boolean r3 = l.C11003.equals(r3, r4)     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L19
            goto L1e
        L19:
            r1.f64639 = r6     // Catch: java.lang.Throwable -> L69
            r1.f64636 = r8     // Catch: java.lang.Throwable -> L69
            goto L5b
        L1e:
            if (r1 == 0) goto L4d
            r3 = 1
            r1.f64631 = r3     // Catch: java.lang.Throwable -> L69
            int r4 = r1.f64641     // Catch: java.lang.Throwable -> L69
            int r4 = r4 + r3
            r1.f64641 = r4     // Catch: java.lang.Throwable -> L69
            l.۟ܰۜ r4 = r1.f64630     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = 0
        L2e:
            r1.f64630 = r2     // Catch: java.lang.Throwable -> L69
            l.᩶ۚۜ r2 = r5.f14180     // Catch: java.lang.Throwable -> L69
            if (r1 != r2) goto L35
            goto L4c
        L35:
            l.᩶ۚۜ r2 = r5.f14179     // Catch: java.lang.Throwable -> L69
            if (r1 == r2) goto L47
            l.᩹ۚۜ r2 = r1.f64632     // Catch: java.lang.Throwable -> L69
            if (r2 != 0) goto L47
            if (r3 != 0) goto L47
            java.util.ArrayDeque r2 = r1.f64638     // Catch: java.lang.Throwable -> L69
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r2 != 0) goto L4c
        L47:
            java.util.ArrayDeque r2 = r5.f14178     // Catch: java.lang.Throwable -> L69
            r2.addLast(r1)     // Catch: java.lang.Throwable -> L69
        L4c:
            r2 = r4
        L4d:
            l.᩶ۚۜ r1 = new l.᩶ۚۜ     // Catch: java.lang.Throwable -> L69
            r1.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L69
            r5.f14177 = r1     // Catch: java.lang.Throwable -> L69
            boolean r6 = r5.f14181     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L5b
            r5.m13177()     // Catch: java.lang.Throwable -> L69
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L68
            java.util.concurrent.Executor r6 = r5.f14174
            l.ᩴۚۜ r7 = new l.ᩴۚۜ
            r7.<init>(r2)
            r6.execute(r7)
        L68:
            return
        L69:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4437.m13187(l.ܺ֨ۜ, int, l.ܽۤۜ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13185(int i, int i2) {
        synchronized (this.f14176) {
            C19960 c19960 = this.f14177;
            if (c19960 == null) {
                return;
            }
            c19960.f64634 = new C21371(c19960.f64639, c19960.f64641, c19960.f64636, Math.max(1, i), Math.max(1, i2));
            if (!this.f14181) {
                m13177();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13184() {
        InterfaceC7505 interfaceC7505;
        synchronized (this.f14176) {
            C19960 c19960 = this.f14177;
            interfaceC7505 = null;
            if (c19960 != null) {
                c19960.f64634 = null;
                c19960.f64641++;
                InterfaceC7505 interfaceC75052 = c19960.f64630;
                c19960.f64630 = null;
                interfaceC7505 = interfaceC75052;
            }
        }
        if (interfaceC7505 != null) {
            this.f14174.execute(new RunnableC18549(interfaceC7505));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13186(Runnable runnable) {
        synchronized (this.f14176) {
            C19960 c19960 = this.f14177;
            if (c19960 == null) {
                this.f14174.execute(runnable);
                return;
            }
            c19960.f64631 = true;
            c19960.f64638.addLast(runnable);
            c19960.f64634 = null;
            c19960.f64641++;
            InterfaceC7505 interfaceC7505 = c19960.f64630;
            c19960.f64630 = null;
            if (!this.f14181) {
                m13177();
            }
            if (interfaceC7505 != null) {
                this.f14174.execute(new RunnableC18549(interfaceC7505));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13177() {
        final C19960 c19960 = (C19960) this.f14178.pollFirst();
        Executor executor = this.f14174;
        if (c19960 != null) {
            this.f14181 = true;
            this.f14179 = c19960;
            this.f14180 = c19960;
            executor.execute(new Runnable() { // from class: l.ܺۚۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C4437.this.m13183(c19960);
                }
            });
            return;
        }
        final C19960 c199602 = this.f14177;
        if (c199602 == null) {
            return;
        }
        if (c199602.f64631) {
            this.f14181 = true;
            this.f14179 = c199602;
            this.f14180 = c199602;
            executor.execute(new Runnable() { // from class: l.ۖۚۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C4437.this.m13183(c199602);
                }
            });
            return;
        }
        final C21371 c21371 = c199602.f64634;
        if (c21371 == null) {
            return;
        }
        c199602.f64634 = null;
        this.f14181 = true;
        this.f14179 = c199602;
        this.f14180 = null;
        executor.execute(new Runnable() { // from class: l.ۘۚۜ
            @Override // java.lang.Runnable
            public final void run() {
                C4437.m13169(C4437.this, c199602, c21371);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13169(final C4437 c4437, final C19960 c19960, final C21371 c21371) {
        C0203 c0203;
        c0203 = C0203.f1445;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    c0203 = c4437.m13176(c19960, c21371);
                }
            } catch (Throwable th) {
                c4437.m13175(c19960, c21371);
                throw th;
            }
        } catch (Throwable unused) {
            m13179(c19960);
        }
        c4437.m13175(c19960, c21371);
        final Bitmap m1364 = c0203.m1364();
        final C13547 m1363 = c0203.m1363();
        C4925.m14315(new Runnable() { // from class: l.᩵ۚۜ
            @Override // java.lang.Runnable
            public final void run() {
                C4437.m13170(C4437.this, c19960, c21371, m1364, m1363);
            }
        });
        c4437.m13182(c19960);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13170(C4437 c4437, C19960 c19960, C21371 c21371, Bitmap bitmap, C13547 c13547) {
        synchronized (c4437.f14176) {
            if (c4437.f14177 == c19960 && c19960.f64641 == c21371.m48435() && !c19960.f64631) {
                c21371.m48432().mo5884(c19960.f64643, bitmap);
                if (c13547 != null) {
                    c21371.m48432().mo5885(c19960.f64643, c13547);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13175(C19960 c19960, C21371 c21371) {
        synchronized (this.f14176) {
            if (c19960.f64641 == c21371.m48435()) {
                return;
            }
            m13179(c19960);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C0203 m13176(C19960 c19960, C21371 c21371) {
        C0203 c0203;
        MediaMetadataRetriever mediaMetadataRetriever;
        C0203 c02032;
        C15600 c15600 = (C15600) c21371.m48434();
        C17137 c17137 = null;
        C13547 c13547 = null;
        c17137 = null;
        if (c15600.m36763() == EnumC20541.MPEG_TS) {
            C0203 c02033 = c19960.f64633;
            if (c02033 != null && c19960.f64635 == c21371.m48436() && c19960.f64642 == c21371.m48433()) {
                return c02033;
            }
            InterfaceC7505 m36766 = ((C15600) c21371.m48434()).m36766();
            C7965 c7965 = new C7965();
            try {
                C0909 m13167 = m13167(c19960, c21371, m36766, c7965);
                Throwable m3264 = m13167.m3264(c7965.m21271());
                if (m3264 != null) {
                    m13181(m3264);
                    throw null;
                }
                int m48435 = c21371.m48435();
                synchronized (this.f14176) {
                    if (this.f14177 != c19960 || c19960.f64631 || c19960.f64641 != m48435) {
                        throw new InterruptedIOException("HLS preview read was canceled");
                    }
                }
                if (c7965.m21271()) {
                    C0203 m13166 = m13166(c19960, c21371, c7965, m13167.f3485);
                    c7965.close();
                    return m13166;
                }
                c02032 = C0203.f1445;
                c7965.close();
                return c02032;
            } finally {
            }
        } else {
            int m484352 = c21371.m48435();
            if (c19960.f64637 == null) {
                try {
                    C8671 m36767 = c15600.m36767();
                    try {
                        m13174(c19960, m36767, m484352);
                        c19960.f64637 = C0265.m1536(m36767, m36767.m22458());
                        m36767.close();
                    } finally {
                    }
                } finally {
                }
            }
            C5205 c5205 = c19960.f64637;
            if (c5205 == null || c5205.m14976() == 0) {
                c0203 = C0203.f1445;
                return c0203;
            }
            long m14980 = c5205.m14980() + c15600.m36765();
            int m14977 = c5205.m14977(m14980);
            int m484353 = c21371.m48435();
            C5205 c52052 = c19960.f64637;
            C11003.requireNonNull(c52052);
            long m14978 = c52052.m14978(m14977);
            C22076 c22076 = c19960.f64632;
            if (c22076 == null || c22076.f71721 != m14978) {
                m13179(c19960);
                C8671 m367672 = c15600.m36767();
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    m13174(c19960, m367672, m484353);
                    long m22458 = m367672.m22458();
                    long m14979 = c52052.m14979(m14977);
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    try {
                        C17137 c171372 = new C17137(m367672, m22458, m14978, m14979);
                        try {
                            mediaMetadataRetriever.setDataSource(c171372);
                            C22076 c220762 = new C22076(m14978, mediaMetadataRetriever, c171372, m367672);
                            c19960.f64632 = c220762;
                            m13173(c19960);
                            c22076 = c220762;
                        } catch (Throwable th) {
                            th = th;
                            c17137 = c171372;
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused) {
                            }
                            try {
                                C0349.m1793(c17137);
                                if (c17137 == null) {
                                    C0349.m1793(m367672);
                                }
                                if (th instanceof IOException) {
                                    throw th;
                                }
                                throw new IOException("Failed to open HLS preview fragment", th);
                            } finally {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                }
            }
            int m48436 = c21371.m48436();
            int m48433 = c21371.m48433();
            int m484354 = c21371.m48435();
            InterfaceC7505 interfaceC7505 = c22076.f71719;
            MediaMetadataRetriever mediaMetadataRetriever3 = c22076.f71720;
            m13174(c19960, interfaceC7505, m484354);
            try {
                Bitmap m13163 = m13163(mediaMetadataRetriever3, m14980, m48436, m48433);
                try {
                    int parseInt = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(19));
                    String extractMetadata = mediaMetadataRetriever3.extractMetadata(24);
                    c13547 = C1841.m6125(parseInt, parseInt2, extractMetadata == null ? 0 : Integer.parseInt(extractMetadata), 1.0f);
                } catch (RuntimeException unused2) {
                }
                return new C0203(m13163, c13547);
            } finally {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0909 m13167(C19960 c19960, C21371 c21371, InterfaceC7505 interfaceC7505, C7965 c7965) {
        C6282 c6282;
        C5143 c5143;
        C0909 c0909 = new C0909();
        C5143 c51432 = null;
        e = null;
        c51432 = null;
        try {
            m13174(c19960, interfaceC7505, c21371.m48435());
        } catch (Throwable th) {
            th = th;
            c6282 = null;
        }
        if (((C17613) interfaceC7505).length() > 0) {
            c6282 = new C6282(interfaceC7505);
            try {
                this.f14175.getClass();
                c5143 = new C5143();
            } catch (Throwable th2) {
                try {
                    c0909.f3487 = th2;
                    c5143 = null;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c0909.m3265(th);
                        c5143 = c51432;
                        m13171(c5143, c6282, interfaceC7505, c0909);
                        m13173(c19960);
                        return c0909;
                    } catch (Throwable th4) {
                        m13171(c51432, c6282, interfaceC7505, c0909);
                        m13173(c19960);
                        throw th4;
                    }
                }
            }
            try {
                if (c0909.f3487 == null) {
                    try {
                        c5143.m14705(c6282);
                    } catch (Throwable th5) {
                        e = th5;
                    }
                    try {
                        c6282.m17327();
                        IOException iOException = (IOException) m13165(e, IOException.class);
                        if (iOException != null) {
                            e = iOException;
                        }
                    } catch (IOException e) {
                        e = e;
                    }
                    if (e != null) {
                        c0909.m3265(e);
                    } else {
                        int m48435 = c21371.m48435();
                        synchronized (this.f14176) {
                            if (this.f14177 != c19960 || c19960.f64631 || c19960.f64641 != m48435) {
                                throw new InterruptedIOException("HLS preview read was canceled");
                            }
                        }
                        m13172(c5143, c6282, c7965, c0909, c21371.m48436(), c21371.m48433());
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                c51432 = c5143;
                c0909.m3265(th);
                c5143 = c51432;
                m13171(c5143, c6282, interfaceC7505, c0909);
                m13173(c19960);
                return c0909;
            }
            m13171(c5143, c6282, interfaceC7505, c0909);
            m13173(c19960);
            return c0909;
        }
        m13171((C5143) null, (C6282) null, interfaceC7505, c0909);
        m13173(c19960);
        return c0909;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13172(C5143 c5143, C6282 c6282, C7965 c7965, C0909 c0909, int i, int i2) {
        IOException e;
        Bitmap bitmap;
        try {
            bitmap = c5143.m14703(i, i2);
            e = null;
        } catch (Throwable th) {
            e = th;
            bitmap = null;
        }
        if (bitmap != null) {
            c7965.m21270(bitmap);
        }
        try {
            c6282.m17327();
            IOException iOException = (IOException) m13165(e, IOException.class);
            if (iOException != null) {
                e = iOException;
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (e != null) {
            c0909.m3265(e);
            return;
        }
        if (c7965.m21271()) {
            try {
                int parseInt = Integer.parseInt(c5143.m14704(18));
                int parseInt2 = Integer.parseInt(c5143.m14704(19));
                String m14704 = c5143.m14704(24);
                c0909.f3485 = C1841.m6125(parseInt, parseInt2, m14704 == null ? 0 : Integer.parseInt(m14704), 1.0f);
                e = null;
            } catch (Throwable th2) {
                e = th2;
            }
            try {
                c6282.m17327();
                IOException iOException2 = (IOException) m13165(e, IOException.class);
                if (iOException2 != null) {
                    e = iOException2;
                }
            } catch (IOException e3) {
                e = e3;
            }
            if (e == null) {
                return;
            }
            if (m13165(e, InterruptedIOException.class) != null || m13165(e, C3586.class) != null || m13165(e, Error.class) != null) {
                c0909.m3265(e);
            } else {
                c0909.f3485 = null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13171(C5143 c5143, C6282 c6282, InterfaceC7505 interfaceC7505, C0909 c0909) {
        ArrayList arrayList = c0909.f3486;
        if (c5143 != null) {
            try {
                c5143.close();
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        if (c6282 != null) {
            try {
                c6282.close();
                return;
            } catch (Throwable th2) {
                arrayList.add(th2);
                return;
            }
        }
        try {
            ((C17613) interfaceC7505).close();
        } catch (Throwable th3) {
            arrayList.add(th3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13174(C19960 c19960, InterfaceC7505 interfaceC7505, int i) {
        synchronized (this.f14176) {
            if (this.f14177 != c19960 || c19960.f64631 || c19960.f64641 != i) {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
            c19960.f64630 = interfaceC7505;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13173(C19960 c19960) {
        synchronized (this.f14176) {
            c19960.f64630 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m13183(C19960 c19960) {
        ArrayList arrayList;
        m13179(c19960);
        synchronized (this.f14176) {
            arrayList = new ArrayList(c19960.f64638);
            c19960.f64638.clear();
            if (this.f14177 == c19960) {
                this.f14177 = null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException unused) {
            }
        }
        m13182(c19960);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m13182(C19960 c19960) {
        synchronized (this.f14176) {
            if (this.f14179 == c19960) {
                this.f14179 = null;
            }
            if (this.f14180 == c19960) {
                this.f14180 = null;
            }
            this.f14181 = false;
            m13177();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m13179(C19960 c19960) {
        C22076 c22076 = c19960.f64632;
        c19960.f64632 = null;
        if (c22076 != null) {
            try {
                c22076.f71720.release();
            } catch (Throwable unused) {
            }
            C0349.m1793(c22076.f71718);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m13163(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, 2, i, i2);
        }
        return m13162(mediaMetadataRetriever.getFrameAtTime(j, 2), i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m13162(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || (bitmap.getWidth() <= i && bitmap.getHeight() <= i2)) {
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, Math.round(bitmap.getWidth() * min)), Math.max(1, Math.round(bitmap.getHeight() * min)), true);
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return createScaledBitmap;
        } catch (Throwable th) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0203 m13166(C19960 c19960, C21371 c21371, C7965 c7965, C13547 c13547) {
        C0203 c0203;
        synchronized (this.f14176) {
            int m48435 = c21371.m48435();
            if (this.f14177 == c19960 && !c19960.f64631 && c19960.f64641 == m48435) {
                c0203 = new C0203(c7965.take(), c13547);
                c19960.f64633 = c0203;
                c19960.f64635 = c21371.m48436();
                c19960.f64642 = c21371.m48433();
            } else {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
        }
        return c0203;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13180(Throwable th) {
        return (m13165(th, InterruptedIOException.class) == null && m13165(th, C3586.class) == null) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Throwable m13165(Throwable th, Class cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return (Throwable) cls.cast(th);
            }
            Throwable cause = th.getCause();
            if (cause == th) {
                return null;
            }
            th = cause;
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m13181(Throwable th) {
        Error error = (Error) m13165(th, Error.class);
        if (error != null) {
            throw error;
        }
        IOException iOException = (IOException) m13165(th, IOException.class);
        if (iOException != null) {
            throw iOException;
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new IOException("Failed to load HLS MPEG-TS preview frame", th);
    }
}
