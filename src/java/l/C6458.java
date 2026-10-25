package l;

import android.graphics.Canvas;
import android.os.SystemClock;
import com.alipay.sdk.m.y.c;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: S4H6 */
/* renamed from: l.ۜ֫ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6458 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f19954;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f19955;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f19956 = new AtomicInteger();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f19957;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final WeakReference f19958;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f19959;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Future f19960;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f19961;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC20445 f19962;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f19963;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f19964;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f19965;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile int f19966;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C14218 f19967;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11459 f19968;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(64), new ThreadFactoryC11563());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f19955 = threadPoolExecutor;
        f19954 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC10152());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        if (r7 == l.EnumC23391.COMPLETE) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C16335 m17850(android.content.Context r7, int r8, int r9) {
        /*
            r6 = this;
            l.ܳ֫ܿ r0 = r6.f19967
            l.ۢ֫ܿ r1 = l.C14218.m33881(r0)
            int r1 = r1.m23808()
            int[] r2 = l.C10692.f32186
            l.᩻֫ܿ r3 = l.C14218.m33880(r0)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            r4 = 0
            switch(r2) {
                case 1: goto L4f;
                case 2: goto L4f;
                case 3: goto L35;
                case 4: goto L2d;
                case 5: goto L25;
                case 6: goto L1d;
                default: goto L1b;
            }
        L1b:
            r7 = 0
            goto L51
        L1d:
            r2 = 2131888772(0x7f120a84, float:1.9412189E38)
            java.lang.String r7 = r7.getString(r2)
            goto L51
        L25:
            r2 = 2131888388(0x7f120904, float:1.941141E38)
            java.lang.String r7 = r7.getString(r2)
            goto L51
        L2d:
            r2 = 2131888389(0x7f120905, float:1.9411412E38)
            java.lang.String r7 = r7.getString(r2)
            goto L51
        L35:
            if (r1 != 0) goto L3f
            r2 = 2131888390(0x7f120906, float:1.9411414E38)
            java.lang.String r7 = r7.getString(r2)
            goto L51
        L3f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r2
            r2 = 2131888391(0x7f120907, float:1.9411416E38)
            java.lang.String r7 = r7.getString(r2, r5)
            goto L51
        L4f:
            java.lang.String r7 = "…"
        L51:
            l.᩻֫ܿ r2 = l.C14218.m33880(r0)
            l.᩻֫ܿ r5 = l.EnumC23391.SEARCHING
            if (r2 == r5) goto L64
            l.᩻֫ܿ r2 = l.C14218.m33880(r0)
            l.᩻֫ܿ r5 = l.EnumC23391.IDLE
            if (r2 != r5) goto L62
            goto L64
        L62:
            r2 = 0
            goto L65
        L64:
            r2 = 1
        L65:
            if (r7 == 0) goto L6f
            l.ܽ֫ܿ r8 = new l.ܽ֫ܿ
            r9 = r2 ^ 1
            r8.<init>(r7, r1, r9, r2)
            return r8
        L6f:
            l.ۢ֫ܿ r7 = l.C14218.m33881(r0)
            int r7 = r7.m23810(r8, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            l.᩻֫ܿ r9 = l.C14218.m33880(r0)
            l.᩻֫ܿ r2 = l.EnumC23391.LIMIT_REACHED
            if (r9 != r2) goto L8a
            java.lang.String r9 = "+"
            goto L8c
        L8a:
            java.lang.String r9 = ""
        L8c:
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            l.ܽ֫ܿ r9 = new l.ܽ֫ܿ
            r2 = -1
            if (r7 != r2) goto L99
            goto Lad
        L99:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r7 = "/"
            r2.append(r7)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
        Lad:
            if (r1 != 0) goto Lb8
            l.᩻֫ܿ r7 = l.C14218.m33880(r0)
            l.᩻֫ܿ r0 = l.EnumC23391.COMPLETE
            if (r7 != r0) goto Lb8
            goto Lb9
        Lb8:
            r3 = 0
        Lb9:
            r9.<init>(r8, r1, r3, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6458.m17850(android.content.Context, int, int):l.ܽ֫ܿ");
    }

    public C6458(C12392 c12392) {
        ThreadPoolExecutor threadPoolExecutor = f19955;
        this.f19965 = new Object();
        this.f19967 = C14218.m33878(null, 0, 0);
        this.f19958 = new WeakReference(c12392);
        C11003.requireNonNull(threadPoolExecutor);
        this.f19963 = threadPoolExecutor;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Thread m17834(Runnable runnable) {
        Thread thread = new Thread(runnable, "Search-Highlight-Worker-" + f19956.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17853(InterfaceC7785 interfaceC7785, C11459 c11459) {
        C11003.requireNonNull(interfaceC7785, TextBundle.TEXT_ENTRY);
        synchronized (this.f19965) {
            m17849();
            this.f19968 = c11459;
            this.f19962 = interfaceC7785;
            this.f19967 = C14218.m33878(interfaceC7785, interfaceC7785.mo26548(), interfaceC7785.length());
            if (!this.f19957 && !this.f19961) {
                m17848(interfaceC7785);
            }
        }
        m17847();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m17857() {
        C9281 c9281;
        c9281 = this.f19967.f42891;
        return c9281.m23808() != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17852(Canvas canvas, int i, int i2, float f, float f2, C1539 c1539, C22686 c22686, InterfaceC10961 interfaceC10961) {
        C9281 c9281;
        int m23815;
        c9281 = this.f19967.f42891;
        if (c9281.m23808() == 0 || i == i2) {
            return;
        }
        float f3 = 0.0f;
        int m23813 = c9281.m23813(i);
        int i3 = i;
        while (m23813 < c9281.m23808() && (m23815 = c9281.m23815(m23813)) < i2) {
            int max = Math.max(i, m23815);
            int min = Math.min(i2, c9281.m23809(m23813));
            if (i3 < max) {
                f3 += ((C20113) interfaceC10961).m46370(i3, f3, max);
            }
            float f4 = f3;
            float m46370 = f4 + ((C20113) interfaceC10961).m46370(max, f4, min);
            int i4 = c22686.f73260;
            if (i4 == 0) {
                c1539.setColor(c22686.f73242);
                canvas.drawRect(f4, f, m46370, f2, c1539);
            } else {
                c1539.setColor(i4);
                canvas.drawRect(f4, f, m46370, f2, c1539);
                c1539.setColor(c22686.f73242);
                float m27878 = C11266.m27878(1.0f);
                canvas.drawRect(f4 + m27878, f + m27878, m46370 - m27878, f2 - m27878, c1539);
            }
            m23813++;
            i3 = min;
            f3 = m46370;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17851() {
        synchronized (this.f19965) {
            m17849();
            this.f19968 = null;
            InterfaceC20445 interfaceC20445 = this.f19962;
            int i = 0;
            int mo26548 = interfaceC20445 == null ? 0 : interfaceC20445.mo26548();
            if (interfaceC20445 != null) {
                i = interfaceC20445.length();
            }
            this.f19967 = C14218.m33878(interfaceC20445, mo26548, i);
        }
        m17847();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m17858() {
        InterfaceC20445 interfaceC20445;
        int i;
        C9281 c9281;
        m17851();
        synchronized (this.f19965) {
            interfaceC20445 = this.f19967.f42889;
            i = this.f19967.f42888;
            c9281 = this.f19967.f42891;
            this.f19967 = new C14218(interfaceC20445, i, c9281, EnumC23391.INVALID_PATTERN, 0);
        }
        m17847();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17855(InterfaceC20445 interfaceC20445, int i, int i2, int i3) {
        InterfaceC20445 interfaceC204452;
        int i4;
        C9281 c9281;
        C9281 c92812;
        C9281 c92813;
        EnumC23391 enumC23391;
        if (i2 == 0 && i3 == 0) {
            return;
        }
        synchronized (this.f19965) {
            if (this.f19968 == null) {
                return;
            }
            m17849();
            this.f19962 = interfaceC20445;
            if (!this.f19957 && !this.f19961) {
                int mo26548 = interfaceC20445.mo26548();
                int length = interfaceC20445.length();
                long j = (length - i3) + i2;
                C14218 c14218 = this.f19967;
                if (j >= 0 && j <= 2147483647L) {
                    interfaceC204452 = c14218.f42889;
                    if (interfaceC204452 == interfaceC20445) {
                        i4 = c14218.f42888;
                        if (i4 + 1 == mo26548) {
                            c9281 = c14218.f42891;
                            if (c9281.m23812() == ((int) j)) {
                                c92812 = c14218.f42891;
                                c92812.m23811(i, i2, i3);
                                c92813 = c14218.f42891;
                                enumC23391 = c14218.f42890;
                                this.f19967 = new C14218(interfaceC20445, mo26548, c92813, enumC23391, 0);
                                m17848(interfaceC20445);
                                m17847();
                            }
                        }
                    }
                }
                this.f19967 = C14218.m33878(interfaceC20445, mo26548, length);
                m17848(interfaceC20445);
                m17847();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17856(InterfaceC20445 interfaceC20445) {
        boolean z;
        C9281 c9281;
        synchronized (this.f19965) {
            m17849();
            z = true;
            this.f19957 = true;
            this.f19962 = interfaceC20445;
            c9281 = this.f19967.f42891;
            if (c9281.m23808() == 0) {
                z = false;
            }
            this.f19967 = C14218.m33878(interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length());
        }
        if (z) {
            m17847();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17854(InterfaceC20445 interfaceC20445) {
        synchronized (this.f19965) {
            m17849();
            this.f19957 = false;
            this.f19962 = interfaceC20445;
            this.f19967 = C14218.m33878(interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length());
            if (this.f19968 != null && !this.f19961) {
                m17848(interfaceC20445);
            }
        }
        m17847();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m17860(InterfaceC20445 interfaceC20445) {
        synchronized (this.f19965) {
            m17849();
            this.f19962 = interfaceC20445;
            this.f19961 = true;
            this.f19967 = C14218.m33878(interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length());
        }
        m17847();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m17859(InterfaceC20445 interfaceC20445) {
        synchronized (this.f19965) {
            if (this.f19962 != interfaceC20445) {
                return;
            }
            m17849();
            this.f19961 = false;
            this.f19967 = C14218.m33878(interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length());
            if (this.f19968 != null && !this.f19957) {
                m17848(interfaceC20445);
            }
            m17847();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m17848(InterfaceC20445 interfaceC20445) {
        C9281 c9281;
        int i;
        int i2;
        int mo26548 = interfaceC20445.mo26548();
        int length = interfaceC20445.length();
        C12392 c12392 = (C12392) this.f19958.get();
        C12973 m30518 = c12392 != null ? c12392.m30518() : null;
        boolean z = m30518 != null && (i = m30518.f38879) >= 0 && i < (i2 = m30518.f38878) && i2 <= length;
        int i3 = z ? m30518.f38879 : -1;
        int i4 = z ? m30518.f38878 : -1;
        int i5 = this.f19966 + 1;
        this.f19966 = i5;
        C17041 c17041 = new C17041(i5, this.f19968, interfaceC20445, mo26548, length, i3, i4);
        InterfaceC20445 interfaceC204452 = this.f19962;
        c9281 = this.f19967.f42891;
        this.f19967 = new C14218(interfaceC204452, mo26548, c9281, EnumC23391.SEARCHING, 0);
        this.f19964 = f19954.schedule(new RunnableC8700(1, this, c17041), 100L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17843(final C6458 c6458, final C17041 c17041) {
        synchronized (c6458.f19965) {
            if (c6458.m17846(c17041) && C17041.m40010(c17041)) {
                RejectedExecutionException e = null;
                c6458.f19964 = null;
                try {
                    final Future<?> submit = c6458.f19963.submit(new Runnable() { // from class: l.᩺۟ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6458.m17837(C6458.this, c17041);
                        }
                    });
                    c6458.f19960 = submit;
                    c6458.f19959 = f19954.schedule(new Runnable() { // from class: l.ܰ۟ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6458.m17838(C6458.this, c17041, submit);
                        }
                    }, 3500L, TimeUnit.MILLISECONDS);
                } catch (RejectedExecutionException e2) {
                    e = e2;
                }
                if (e != null) {
                    c6458.m17840(c17041, e);
                    return;
                }
                return;
            }
            c6458.m17844(c17041);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17837(final C6458 c6458, final C17041 c17041) {
        int i;
        InterfaceC20445 interfaceC20445;
        C7744 mo26556;
        int i2;
        int i3;
        int i4;
        C11459 c11459;
        EnumC23391 enumC23391;
        int i5;
        int i6;
        int i7;
        int i8;
        C20570 c20570 = new C20570();
        EnumC23391 enumC233912 = EnumC23391.IDLE;
        int i9 = c6458.f19966;
        i = c17041.f52224;
        if (i9 == i) {
            Runnable runnable = new Runnable() { // from class: l.۟۟ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C6458.m17845(C6458.this, c17041);
                }
            };
            try {
                interfaceC20445 = c17041.f52226;
                mo26556 = interfaceC20445.mo26556();
                try {
                    mo26556.m20766(runnable);
                    int i10 = c6458.f19966;
                    i2 = c17041.f52224;
                    if ((i10 == i2) && C17041.m40010(c17041)) {
                        int m20767 = mo26556.m20767();
                        i3 = c17041.f52225;
                        if (m20767 == i3) {
                            int length = mo26556.length();
                            i4 = c17041.f52230;
                            if (length == i4) {
                                c11459 = c17041.f52227;
                                C12164 matcher = c11459.matcher((CharSequence) mo26556);
                                matcher.m29599(runnable);
                                if (C17041.m40004(c17041)) {
                                    i7 = c17041.f52228;
                                    i8 = c17041.f52229;
                                    matcher.m29614region(i7, i8);
                                }
                                long uptimeMillis = SystemClock.uptimeMillis();
                                int i11 = 0;
                                while (true) {
                                    try {
                                        try {
                                            boolean find = matcher.find();
                                            int i12 = c6458.f19966;
                                            i6 = c17041.f52224;
                                            if (!(i12 == i6) || !C17041.m40010(c17041)) {
                                                break;
                                            }
                                            if (matcher.m29603()) {
                                                enumC23391 = EnumC23391.TIMED_OUT;
                                            } else if (matcher.m29613()) {
                                                enumC23391 = EnumC23391.RESOURCE_LIMIT;
                                            } else {
                                                enumC23391 = matcher.m29608() ? EnumC23391.FAILED : EnumC23391.COMPLETE;
                                            }
                                            if (!find) {
                                                break;
                                            }
                                            int start = matcher.start();
                                            int end = matcher.end();
                                            if (start != end) {
                                                if (i11 == 9999) {
                                                    if (enumC23391 == EnumC23391.COMPLETE) {
                                                        enumC23391 = EnumC23391.LIMIT_REACHED;
                                                    }
                                                } else {
                                                    c20570.m47131(start, end);
                                                    i11++;
                                                }
                                            }
                                            if (enumC23391 != EnumC23391.COMPLETE) {
                                                break;
                                            } else if (SystemClock.uptimeMillis() - uptimeMillis > c.a) {
                                                enumC23391 = EnumC23391.TIMED_OUT;
                                                break;
                                            }
                                        } catch (RuntimeException e) {
                                            enumC23391 = e instanceof C3966 ? EnumC23391.RESOURCE_LIMIT : EnumC23391.FAILED;
                                        }
                                    } catch (CancellationException e2) {
                                        throw e2;
                                    }
                                }
                                c6458.m17839(c17041);
                                mo26556.close();
                                return;
                            }
                        }
                    }
                    c6458.m17839(c17041);
                    mo26556.close();
                    return;
                } catch (Throwable th) {
                    try {
                        mo26556.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (CancellationException unused) {
                c6458.m17839(c17041);
                return;
            } catch (RuntimeException e3) {
                c6458.m17840(c17041, e3);
                return;
            }
        }
        return;
        i5 = c17041.f52230;
        C17747 c17747 = new C17747(c17041, c20570.m47130(i5), enumC23391);
        mo26556.close();
        try {
            c6458.m17842(c17747);
        } catch (RuntimeException e4) {
            c6458.m17840(c17041, e4);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17838(C6458 c6458, C17041 c17041, Future future) {
        boolean z;
        synchronized (c6458.f19965) {
            if (!c6458.m17846(c17041) || future.isDone()) {
                z = false;
            } else {
                c6458.m17841(c17041, EnumC23391.TIMED_OUT);
                z = true;
                c6458.f19966++;
                c6458.f19960 = null;
                c6458.f19959 = null;
            }
        }
        if (z) {
            c6458.m17835(future);
            c6458.m17847();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17842(final C17747 c17747) {
        C17041 c17041;
        C17041 c170412;
        C17041 c170413;
        C17041 c170414;
        synchronized (this.f19965) {
            c17041 = c17747.f54298;
            if (m17846(c17041)) {
                c170413 = c17747.f54298;
                if (C17041.m40010(c170413)) {
                    ScheduledFuture scheduledFuture = this.f19959;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f19959 = null;
                    }
                    final C12392 c12392 = (C12392) this.f19958.get();
                    if (c12392 == null || !c12392.post(new Runnable() { // from class: l.֫֫ܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6458.m17836(C6458.this, c12392, c17747);
                        }
                    })) {
                        c170414 = c17747.f54298;
                        m17839(c170414);
                        return;
                    }
                    return;
                }
            }
            c170412 = c17747.f54298;
            m17844(c170412);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17836(C6458 c6458, C12392 c12392, C17747 c17747) {
        C17041 c17041;
        InterfaceC20445 interfaceC20445;
        InterfaceC20445 interfaceC204452;
        int i;
        C9281 c9281;
        EnumC23391 enumC23391;
        synchronized (c6458.f19965) {
            c17041 = c17747.f54298;
            if (c6458.m17846(c17041) && C17041.m40010(c17041)) {
                InterfaceC7785 m30436 = c12392.m30436();
                interfaceC20445 = c17041.f52226;
                if (m30436 == interfaceC20445) {
                    c6458.f19966++;
                    c6458.f19960 = null;
                    interfaceC204452 = c17041.f52226;
                    i = c17041.f52225;
                    c9281 = c17747.f54300;
                    enumC23391 = c17747.f54299;
                    c6458.f19967 = new C14218(interfaceC204452, i, c9281, enumC23391, 0);
                    c12392.m30423();
                    c12392.invalidate();
                    return;
                }
            }
            c6458.m17844(c17041);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17839(C17041 c17041) {
        synchronized (this.f19965) {
            m17844(c17041);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17840(C17041 c17041, RuntimeException runtimeException) {
        synchronized (this.f19965) {
            if (m17846(c17041)) {
                Future future = this.f19960;
                if (future != null) {
                    m17835(future);
                }
                m17844(c17041);
                m17841(c17041, runtimeException instanceof C3966 ? EnumC23391.RESOURCE_LIMIT : EnumC23391.FAILED);
                m17847();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17841(C17041 c17041, EnumC23391 enumC23391) {
        InterfaceC20445 interfaceC20445;
        InterfaceC20445 interfaceC204452;
        int i;
        int i2;
        InterfaceC20445 interfaceC204453;
        int i3;
        C9281 c9281;
        C14218 c14218 = this.f19967;
        interfaceC20445 = c14218.f42889;
        interfaceC204452 = c17041.f52226;
        if (interfaceC20445 == interfaceC204452) {
            i = c14218.f42888;
            i2 = c17041.f52225;
            if (i == i2) {
                interfaceC204453 = c14218.f42889;
                i3 = c14218.f42888;
                c9281 = c14218.f42891;
                this.f19967 = new C14218(interfaceC204453, i3, c9281, enumC23391, 0);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17835(Future future) {
        future.cancel(false);
        if (future instanceof Runnable) {
            this.f19963.remove((Runnable) future);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17844(C17041 c17041) {
        if (m17846(c17041)) {
            m17841(c17041, EnumC23391.IDLE);
            this.f19966++;
            this.f19964 = null;
            this.f19960 = null;
            ScheduledFuture scheduledFuture = this.f19959;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f19959 = null;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m17845(C6458 c6458, C17041 c17041) {
        int i;
        int i2 = c6458.f19966;
        i = c17041.f52224;
        if (i2 != i || Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search highlight canceled");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m17846(C17041 c17041) {
        int i;
        C11459 c11459;
        InterfaceC20445 interfaceC20445;
        int i2 = this.f19966;
        i = c17041.f52224;
        if (i2 != i) {
            return false;
        }
        C11459 c114592 = this.f19968;
        c11459 = c17041.f52227;
        if (c114592 != c11459) {
            return false;
        }
        InterfaceC20445 interfaceC204452 = this.f19962;
        interfaceC20445 = c17041.f52226;
        return (interfaceC204452 != interfaceC20445 || this.f19957 || this.f19961) ? false : true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m17849() {
        EnumC23391 enumC23391;
        InterfaceC20445 interfaceC20445;
        int i;
        C9281 c9281;
        this.f19966++;
        enumC23391 = this.f19967.f42890;
        if (enumC23391 == EnumC23391.SEARCHING) {
            interfaceC20445 = this.f19967.f42889;
            i = this.f19967.f42888;
            c9281 = this.f19967.f42891;
            this.f19967 = new C14218(interfaceC20445, i, c9281, EnumC23391.IDLE, 0);
        }
        ScheduledFuture scheduledFuture = this.f19964;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f19964 = null;
        }
        Future future = this.f19960;
        if (future != null) {
            m17835(future);
            this.f19960 = null;
        }
        ScheduledFuture scheduledFuture2 = this.f19959;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.f19959 = null;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m17847() {
        final C12392 c12392 = (C12392) this.f19958.get();
        if (c12392 != null) {
            c12392.post(new Runnable() { // from class: l.ۛ۟ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12392 c123922 = C12392.this;
                    c123922.m30423();
                    c123922.invalidate();
                }
            });
        }
    }
}
