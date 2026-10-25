package l;

import android.os.ParcelFileDescriptor;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;

/* compiled from: J72H */
/* renamed from: l.᩶ᩳܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20336 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f65648;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f65649;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Object f65650;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f65651;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f65652;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f65653;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Semaphore f65654;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1769 f65655;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f65656;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f65657;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f65658;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f65659;

    public C20336(ActivityC0921 activityC0921, AbstractC13921 abstractC13921, String str, boolean z) {
        this.f65655 = ConcurrentMapC10942.newKeySet();
        this.f65650 = new Object();
        this.f65649 = new HashSet();
        this.f65654 = new Semaphore(2, true);
        this.f65657 = new WeakReference(activityC0921);
        this.f65652 = abstractC13921;
        this.f65653 = abstractC13921 instanceof C2346 ? new Object() : abstractC13921;
        this.f65659 = str;
        this.f65648 = z;
        this.f65651 = null;
    }

    public C20336(ActivityC0921 activityC0921, AbstractC15440 abstractC15440) {
        this.f65655 = ConcurrentMapC10942.newKeySet();
        this.f65650 = new Object();
        this.f65649 = new HashSet();
        this.f65654 = new Semaphore(2, true);
        this.f65657 = new WeakReference(activityC0921);
        this.f65652 = null;
        this.f65653 = new Object();
        this.f65659 = null;
        this.f65648 = true;
        this.f65651 = abstractC15440;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x006c: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:66:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.ParcelFileDescriptor m46664(final l.C20336 r8) {
        /*
            int r1 = r8.f65656
            boolean r0 = r8.f65658
            if (r0 != 0) goto L97
            java.util.concurrent.Semaphore r0 = r8.f65654
            boolean r0 = r0.tryAcquire()
            if (r0 == 0) goto L8f
            r2 = 0
            r3 = 0
            android.os.ParcelFileDescriptor[] r4 = android.os.ParcelFileDescriptor.createPipe()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L57 java.io.IOException -> L59
            r5 = 1
            r6 = r4[r5]     // Catch: java.lang.Throwable -> L4a java.lang.RuntimeException -> L4d java.io.IOException -> L4f
            java.lang.Object r0 = r8.f65650     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L48
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L48
            boolean r7 = r8.f65658     // Catch: java.lang.Throwable -> L41
            if (r7 != 0) goto L39
            int r7 = r8.f65656     // Catch: java.lang.Throwable -> L41
            if (r1 != r7) goto L39
            l.֫ۤᩴ r7 = r8.f65655     // Catch: java.lang.Throwable -> L41
            r7.add(r6)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            java.util.concurrent.ThreadPoolExecutor r0 = l.C1802.f6209     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L48
            l.۠ᩳܳ r7 = new l.۠ᩳܳ     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L48
            r7.<init>()     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L48
            r0.submit(r7)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L48
            r8 = r4[r3]     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37 java.lang.Throwable -> L6b
            return r8
        L35:
            r0 = move-exception
            goto L5e
        L37:
            r0 = move-exception
            goto L5e
        L39:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "HTML preview session is closed"
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L41
            throw r1     // Catch: java.lang.Throwable -> L41
        L41:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r1     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L48
        L44:
            r0 = move-exception
            goto L55
        L46:
            r0 = move-exception
            goto L5c
        L48:
            r0 = move-exception
            goto L5c
        L4a:
            r0 = move-exception
            r6 = r2
            goto L55
        L4d:
            r0 = move-exception
            goto L50
        L4f:
            r0 = move-exception
        L50:
            r6 = r2
            goto L5c
        L52:
            r0 = move-exception
            r4 = r2
            r6 = r4
        L55:
            r1 = 0
            goto L6d
        L57:
            r0 = move-exception
            goto L5a
        L59:
            r0 = move-exception
        L5a:
            r4 = r2
            r6 = r4
        L5c:
            r1 = 0
            r5 = 0
        L5e:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r0.getMessage()     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            r1.initCause(r0)     // Catch: java.lang.Throwable -> L6b
            throw r1     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            r1 = r5
        L6d:
            if (r1 != 0) goto L8e
            if (r6 == 0) goto L76
            l.֫ۤᩴ r1 = r8.f65655
            r1.remove(r6)
        L76:
            if (r6 != 0) goto L79
            goto L7e
        L79:
            r6.close()     // Catch: java.io.IOException -> L7d
            goto L7e
        L7d:
        L7e:
            if (r4 != 0) goto L81
            goto L83
        L81:
            r2 = r4[r3]
        L83:
            if (r2 != 0) goto L86
            goto L89
        L86:
            r2.close()     // Catch: java.io.IOException -> L89
        L89:
            java.util.concurrent.Semaphore r8 = r8.f65654
            r8.release()
        L8e:
            throw r0
        L8f:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            java.lang.String r0 = "Too many open HTML preview streams"
            r8.<init>(r0)
            throw r8
        L97:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            java.lang.String r0 = "HTML preview session is closed"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20336.m46664(l.᩶ᩳܳ):android.os.ParcelFileDescriptor");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46661(final C20336 c20336, ParcelFileDescriptor parcelFileDescriptor, final int i) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        final AbstractActivityC3346 abstractActivityC3346;
        try {
            try {
                autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
            } catch (IOException | RuntimeException unused) {
            }
            try {
                C23157 m46665 = c20336.m46665(i);
                try {
                    byte[] bArr = new byte[65536];
                    while (!c20336.f65658 && i == c20336.f65656) {
                        try {
                            int read = m46665.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                autoCloseOutputStream.write(bArr, 0, read);
                            }
                        } catch (IOException e) {
                            e = e;
                            if ((c20336.f65652 instanceof AbstractC3163) && (abstractActivityC3346 = (AbstractActivityC3346) c20336.f65657.get()) != null) {
                                abstractActivityC3346.runOnUiThread(new Runnable() { // from class: l.᩹ᩳܳ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C20336.m46660(C20336.this, i, abstractActivityC3346);
                                    }
                                });
                            }
                            throw e;
                        } catch (RuntimeException e2) {
                            e = e2;
                            if (c20336.f65652 instanceof AbstractC3163) {
                                abstractActivityC3346.runOnUiThread(new Runnable() { // from class: l.᩹ᩳܳ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C20336.m46660(C20336.this, i, abstractActivityC3346);
                                    }
                                });
                            }
                            throw e;
                        }
                    }
                    m46665.close();
                    autoCloseOutputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    autoCloseOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } finally {
            c20336.f65655.remove(parcelFileDescriptor);
            c20336.f65654.release();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46660(C20336 c20336, int i, AbstractActivityC3346 abstractActivityC3346) {
        if (c20336.f65658 || i != c20336.f65656 || abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f120711);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C23157 m46665(final int i) {
        C23157 c23157;
        if (this.f65652 instanceof AbstractC3163) {
            c23157 = new C23157(new InterfaceC11869() { // from class: l.ܶᩳܳ
                @Override // l.InterfaceC11869
                /* renamed from: ֫ */
                public final InputStream mo28995() {
                    InputStream m46657;
                    m46657 = C20336.this.m46657(i);
                    return m46657;
                }
            }, new Consumer() { // from class: l.᩸ᩳܳ
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void n(Object obj) {
                    C20336.m46662(C20336.this, (C23157) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        } else {
            c23157 = new C23157(m46657(i), new Consumer() { // from class: l.᩸ᩳܳ
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void n(Object obj) {
                    C20336.m46662(C20336.this, (C23157) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        }
        C23157 c231572 = c23157;
        synchronized (this.f65650) {
            if (!this.f65658 && i == this.f65656) {
                this.f65649.add(c231572);
                return c231572;
            }
            c231572.close();
            throw new IOException("HTML preview request was cancelled");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46662(C20336 c20336, C23157 c23157) {
        synchronized (c20336.f65650) {
            c20336.f65649.remove(c23157);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputStream m46657(int i) {
        InterfaceC17889 mo7638;
        InputStream mo7636;
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f65657.get();
        if (this.f65658 || i != this.f65656 || abstractActivityC3346 == null || abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
            throw new IOException("HTML preview owner is unavailable");
        }
        AbstractC15440 abstractC15440 = this.f65651;
        if (abstractC15440 != null) {
            return abstractC15440.mo27926();
        }
        if (this.f65652 == null || this.f65659 == null) {
            throw new IOException("MHTML source is unavailable");
        }
        synchronized (this.f65653) {
            synchronized (this.f65652) {
                if (this.f65658 || i != this.f65656 || abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
                    throw new IOException("HTML preview owner is unavailable");
                }
                AbstractC13921 abstractC13921 = this.f65652;
                boolean z = abstractC13921 instanceof AbstractC3163;
                if (z) {
                    abstractC13921.mo7646(false);
                }
                mo7638 = this.f65652.mo7638(this.f65659);
                if (mo7638 != null) {
                    C15688 c15688 = (C15688) mo7638;
                    if (c15688.mo36969() && ((!this.f65648 && !z) || !c15688.mo36978())) {
                    }
                }
                throw new IOException("MHTML source is unavailable");
            }
            mo7636 = this.f65652.mo7636(abstractActivityC3346, mo7638);
            if (mo7636 == null) {
                throw new IOException("MHTML source was not opened");
            }
        }
        return mo7636;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m46663(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m46663(boolean z) {
        int i;
        C23157[] c23157Arr;
        ParcelFileDescriptor[] parcelFileDescriptorArr;
        synchronized (this.f65650) {
            this.f65658 = z | this.f65658;
            this.f65656++;
            c23157Arr = (C23157[]) this.f65649.toArray(new C23157[0]);
            this.f65649.clear();
            parcelFileDescriptorArr = (ParcelFileDescriptor[]) this.f65655.toArray(new ParcelFileDescriptor[0]);
        }
        for (C23157 c23157 : c23157Arr) {
            c23157.close();
        }
        for (ParcelFileDescriptor parcelFileDescriptor : parcelFileDescriptorArr) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            this.f65655.remove(parcelFileDescriptor);
        }
    }
}
