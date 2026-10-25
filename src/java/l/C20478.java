package l;

import android.app.ActivityManager;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: V6MU */
/* renamed from: l.᩶᩺ۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20478 implements InterfaceC4458, AutoCloseable {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final ExecutorService f66001;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C4623 f66002;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C12011 f66003;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66004;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f66005;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66006;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C13854 f66007;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final ExecutorService f66008;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public RunnableC6772 f66009;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f66010;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final long f66011;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f66012;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Handler f66013;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15537 f66014;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile C15537 f66015;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f66016;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile long f66017;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C15537 f66018;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public long f66019;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f66020;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f66021;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public volatile long f66022;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final long f66023;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public AbstractC12924 f66024;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19981 f66025;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f66026;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f66027;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f66028;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22097 f66029;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C12011 f66030;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r18 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        r14.f66013.post(new l.RunnableC24005(r14, r17, r21, r22, r16, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        return;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m46878(final l.C20478 r14, l.C22097 r15, final l.C5661 r16, final boolean r17, l.C22262 r18, long r19, final l.C15537 r21, final l.C22262 r22) {
        /*
            r7 = r14
            r0 = r15
            r8 = r16
            r9 = r18
            r10 = r21
            l.᩺ۨۜ r1 = r10.f47866
            l.᩸᩺ۜ r11 = new l.᩸᩺ۜ
            r11.<init>()
            r11.f70080 = r0
            boolean r2 = r14.m46880(r8)     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            if (r2 != 0) goto L7f
            r2 = 0
            r11.f70079 = r2     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            if (r17 == 0) goto L31
            long r1 = r7.f66011     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            l.᩹ۨۜ r0 = l.C4623.m13567(r9, r15, r1)     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            r11.f70082 = r0     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            r0 = 0
            r11.f70080 = r0     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            goto L7f
        L28:
            r0 = move-exception
            goto L84
        L2b:
            r0 = move-exception
            goto L84
        L2d:
            r0 = move-exception
            goto L84
        L2f:
            r0 = move-exception
            goto L84
        L31:
            l.᩶ۛۜ r12 = new l.᩶ۛۜ     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            r3 = r19
            r12.<init>(r3, r15)     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            boolean r3 = r1.mo6176()     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            if (r3 == 0) goto L6d
            l.ۨ᩺ۜ r3 = r7.f66030     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            if (r3 == 0) goto L65
            l.ܳ᩺ۜ r4 = new l.ܳ᩺ۜ     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            r4.<init>()     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            l.ۛ᩺ۜ r13 = r3.m29378(r1, r2, r4)     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            r6 = 0
            r1 = r14
            r2 = r16
            r3 = r13
            r4 = r11
            r5 = r12
            r1.m46875(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L59
            r13.close()     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            goto L78
        L59:
            r0 = move-exception
            r1 = r0
            r13.close()     // Catch: java.lang.Throwable -> L5f
            goto L64
        L5f:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
        L64:
            throw r1     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
        L65:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            java.lang.String r1 = "A cache directory is required for this image source"
            r0.<init>(r1)     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
        L6d:
            l.᩺ۨۜ r3 = r10.f47866     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            r6 = 0
            r1 = r14
            r2 = r16
            r4 = r11
            r5 = r12
            r1.m46875(r2, r3, r4, r5, r6)     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
        L78:
            long r1 = r12.m46070()     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
            r15.m49683(r1)     // Catch: java.lang.StackOverflowError -> L28 java.lang.OutOfMemoryError -> L2b java.lang.RuntimeException -> L2d java.io.IOException -> L2f java.lang.Throwable -> L82
        L7f:
            if (r9 == 0) goto L8b
            goto L88
        L82:
            r0 = move-exception
            goto La1
        L84:
            r11.f70081 = r0     // Catch: java.lang.Throwable -> L82
            if (r9 == 0) goto L8b
        L88:
            r18.close()
        L8b:
            android.os.Handler r0 = r7.f66013
            l.᩻᩺ۜ r9 = new l.᩻᩺ۜ
            r1 = r9
            r2 = r14
            r3 = r17
            r4 = r21
            r5 = r22
            r6 = r16
            r7 = r11
            r1.<init>()
            r0.post(r9)
            return
        La1:
            if (r9 == 0) goto La6
            r18.close()
        La6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20478.m46878(l.᩶᩺ۜ, l.᩹ۛۜ, l.ۚ᩺ۜ, boolean, l.᩹ۨۜ, long, l.ܶ᩺ۜ, l.᩹ۨۜ):void");
    }

    public C20478(ActivityC16012 activityC16012, ArrayList arrayList) {
        long min;
        ActivityManager activityManager = (ActivityManager) activityC16012.getSystemService("activity");
        long maxMemory = Runtime.getRuntime().maxMemory();
        int memoryClass = activityManager.getMemoryClass();
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        if (maxMemory <= 0) {
            throw new IllegalArgumentException("Maximum heap must be positive");
        }
        if (memoryClass > 0) {
            if (isLowRamDevice) {
                min = Math.min(16777216L, (memoryClass * 1048576) / 16);
            } else {
                min = Math.min(268435456L, maxMemory / 3);
            }
            C19981 c19981 = new C19981(Math.max(1048576L, min), null);
            File file = new File(activityC16012.getCacheDir(), "gallery-sources");
            this.f66021 = new SparseArray(3);
            this.f66002 = new C4623();
            this.f66013 = new Handler(Looper.getMainLooper());
            this.f66001 = Executors.newSingleThreadExecutor(new ThreadFactoryC4250());
            this.f66008 = Executors.newSingleThreadExecutor(new ThreadFactoryC19067());
            this.f66026 = new IdentityHashMap();
            this.f66027 = true;
            if (arrayList == null || arrayList.isEmpty() || c19981.m46067() < 1048576) {
                throw new IllegalArgumentException("Invalid gallery sources or bitmap budget");
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f66005 = arrayList2;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((AbstractC22967) it.next()) == null) {
                    throw new IllegalArgumentException("Null gallery source");
                }
            }
            this.f66025 = c19981;
            c19981.m46069(new RunnableC19472(3, this));
            long min2 = Math.min(X931RNG.BLOCK128_RESEED_MAX, c19981.m46067() / 8);
            this.f66011 = min2;
            this.f66028 = (c19981.m46067() / 3) * 2;
            this.f66023 = c19981.m46067() - (min2 * 3);
            this.f66003 = new C12011(file);
            this.f66030 = new C12011(file);
            return;
        }
        throw new IllegalArgumentException("Memory class must be positive");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46925(AbstractC12924 abstractC12924, int i) {
        m46919();
        if (this.f66004 || this.f66024 != null) {
            throw new IllegalStateException("Gallery session already attached or closed");
        }
        this.f66024 = abstractC12924;
        abstractC12924.getClass();
        this.f66016 = abstractC12924 instanceof C5164;
        abstractC12924.mo14781(this, i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46928(AbstractC12924 abstractC12924, int i) {
        AbstractC12924 abstractC129242;
        m46919();
        if (this.f66004 || (abstractC129242 = this.f66024) == null) {
            throw new IllegalStateException("Gallery session is not attached");
        }
        abstractC129242.mo14790();
        this.f66024 = null;
        m46925(abstractC12924, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46924(RunnableC6772 runnableC6772) {
        m46919();
        this.f66009 = runnableC6772;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46921() {
        return this.f66005.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15205 m46922(int i) {
        m46919();
        C15537 c15537 = (C15537) this.f66021.get(i);
        if (c15537 == null || c15537.f47863) {
            return null;
        }
        return c15537.f47871;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m46929(int i) {
        C15537 c15537 = (C15537) this.f66021.get(i);
        return c15537 != null && c15537.f47876;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m46932(int i) {
        AbstractC22967 abstractC22967 = (AbstractC22967) this.f66005.get(i);
        abstractC22967.getClass();
        return abstractC22967 instanceof C3978;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46934(int i) {
        m46919();
        this.f66022++;
        this.f66012 = i;
        this.f66015 = (C15537) this.f66021.get(i);
        if (this.f66015 != null) {
            this.f66015.f47868 = false;
            if (this.f66015.f47871 != null) {
                this.f66015.f47853 = true;
            }
            this.f66015.f47882 |= this.f66015.f47864;
            this.f66015.f47864 = true;
        }
        for (int i2 = 0; i2 < this.f66021.size(); i2++) {
            C15537 c15537 = (C15537) this.f66021.valueAt(i2);
            if (!this.f66016 && c15537 != this.f66015) {
                c15537.m36626();
            }
            c15537.m36632();
        }
        for (int i3 = 0; i3 < this.f66021.size(); i3++) {
            ((C15537) this.f66021.valueAt(i3)).f47867 = false;
        }
        m46915();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46931() {
        if (!this.f66016 || this.f66004) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f66021.size(); i++) {
            C15537 c15537 = (C15537) this.f66021.valueAt(i);
            boolean mo14782 = this.f66024.mo14782(c15537.f47855);
            if (c15537.f47851 != mo14782) {
                c15537.f47851 = mo14782;
                if (!mo14782) {
                    c15537.m36626();
                }
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < this.f66021.size(); i2++) {
                ((C15537) this.f66021.valueAt(i2)).f47881 = false;
            }
        }
        m46915();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46927(int i, long j) {
        m46919();
        if (this.f66004) {
            return;
        }
        C15537 c15537 = (C15537) this.f66021.get(i);
        if (c15537 != null) {
            c15537.m36629();
        }
        C15537 c155372 = new C15537(this, i, j, (AbstractC22967) this.f66005.get(i));
        this.f66021.put(i, c155372);
        if (i == this.f66012) {
            this.f66015 = c155372;
            c155372.f47864 = true;
        }
        m46915();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46923(int i, long j) {
        m46919();
        C15537 c15537 = (C15537) this.f66021.get(i);
        if (c15537 == null || c15537.f47854 != j) {
            return;
        }
        this.f66021.remove(i);
        if (this.f66015 == c15537) {
            this.f66015 = null;
        }
        c15537.m36629();
        m46915();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46933() {
        AbstractC12924 abstractC12924;
        int i = this.f66012;
        m46919();
        if (this.f66004 || (abstractC12924 = this.f66024) == null) {
            return;
        }
        abstractC12924.mo14786(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46926(boolean z) {
        m46919();
        if (this.f66004 || this.f66027 == z) {
            return;
        }
        this.f66027 = z;
        this.f66017++;
        for (int i = 0; i < this.f66021.size(); i++) {
            C15537 c15537 = (C15537) this.f66021.valueAt(i);
            c15537.m36626();
            if (z && c15537.f47871 != null) {
                c15537.f47853 = true;
                c15537.f47882 = true;
            }
            c15537.m36632();
        }
        AbstractC12924 abstractC12924 = this.f66024;
        if (abstractC12924 != null) {
            abstractC12924.invalidate();
        }
        m46915();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m46930() {
        m46919();
        this.f66017++;
        for (int i = 0; i < this.f66021.size(); i++) {
            C15537 c15537 = (C15537) this.f66021.valueAt(i);
            c15537.f47849 = Math.max(262144L, c15537.f47849 / 2);
            c15537.m36626();
        }
        AbstractC12924 abstractC12924 = this.f66024;
        if (abstractC12924 != null) {
            abstractC12924.invalidate();
        }
        m46915();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m46919();
        if (this.f66004) {
            return;
        }
        this.f66004 = true;
        this.f66025.m46069((RunnableC19472) null);
        this.f66027 = false;
        this.f66015 = null;
        this.f66009 = null;
        AbstractC12924 abstractC12924 = this.f66024;
        if (abstractC12924 != null) {
            abstractC12924.mo14790();
        }
        this.f66024 = null;
        for (int i = 0; i < this.f66021.size(); i++) {
            ((C15537) this.f66021.valueAt(i)).m36629();
        }
        this.f66021.clear();
        this.f66001.execute(new RunnableC20760(6, this));
        this.f66001.shutdown();
        this.f66008.execute(new RunnableC0558(1, this));
        this.f66008.shutdown();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46907(C20478 c20478) {
        c20478.m46884();
        c20478.m46898(true);
        C12011 c12011 = c20478.f66003;
        if (c12011 != null) {
            c12011.close();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46905(C20478 c20478) {
        C12011 c12011 = c20478.f66030;
        if (c12011 != null) {
            c12011.close();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m46919() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery UI access off main thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void m46915() {
        if (this.f66004) {
            return;
        }
        this.f66020 = true;
        if (this.f66010) {
            return;
        }
        this.f66010 = true;
        this.f66013.post(new RunnableC16185(4, this));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m46897(final C20478 c20478) {
        c20478.f66010 = false;
        if (c20478.f66004 || c20478.f66006) {
            return;
        }
        long m46885 = c20478.m46885();
        if (m46885 != 0 && c20478.f66025.m46067() - c20478.f66025.m46070() < m46885 && c20478.f66018 == null) {
            for (int size = c20478.f66021.size() - 1; size >= 0; size--) {
                C15537 c15537 = (C15537) c20478.f66021.valueAt(size);
                if (c15537 != c20478.f66015 && (c15537.f47870 != null || c15537.f47885 != null)) {
                    c20478.f66024.mo14786(c15537.f47855);
                }
            }
        }
        c20478.m46913();
        final C5661 m46888 = c20478.m46888();
        if (m46888 != null) {
            m46888.f17485 = m46888.f17486 != c20478.f66015;
        }
        c20478.f66020 = false;
        c20478.f66006 = true;
        c20478.f66001.execute(new Runnable() { // from class: l.᩵᩺ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C20478.m46892(C20478.this, m46888);
            }
        });
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46892(final C20478 c20478, final C5661 c5661) {
        C15537 c15537;
        final C21889 c21889 = new C21889();
        try {
            if (c20478.f66014 != (c5661 == null ? c20478.f66015 : c5661.f17486) || !c20478.f66027 || ((c15537 = c20478.f66014) != null && c15537.f47863)) {
                c20478.m46884();
            }
            c20478.m46898(false);
            if (c5661 != null && !c5661.f17486.f47863 && c20478.f66027 && !c20478.f66004) {
                c20478.m46896(c5661, c21889);
            }
        } catch (IOException | OutOfMemoryError | RuntimeException | StackOverflowError e) {
            c21889.f70081 = e;
            if (c5661 != null && c5661.f17479 == null && c20478.f66014 == c5661.f17486) {
                c20478.m46884();
            }
        }
        if (c20478.f66004 || (c5661 != null && c5661.f17486.f47863)) {
            c21889.close();
            c20478.m46884();
        }
        c20478.f66013.post(new Runnable() { // from class: l.ۧ᩺ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C20478.m46877(C20478.this, c5661, c21889);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46877(C20478 c20478, C5661 c5661, C21889 c21889) {
        c20478.f66006 = false;
        if (c5661 != null) {
            c20478.m46874(c5661, c21889);
        } else {
            c21889.close();
        }
        if (!c20478.f66004 && (c20478.f66020 || c20478.m46888() != null)) {
            c20478.m46915();
        }
        c20478.m46913();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5661 m46888() {
        C5661 m46904;
        C5661 m46873;
        C5661 m469042;
        if (!this.f66027 || this.f66004) {
            return null;
        }
        C5661 m469043 = m46904(this.f66015);
        if (m469043 != null) {
            return m469043;
        }
        if (this.f66016) {
            for (int i = 0; i < this.f66021.size(); i++) {
                C15537 c15537 = (C15537) this.f66021.valueAt(i);
                if (c15537 != this.f66015 && c15537.f47851 && (m469042 = m46904(c15537)) != null) {
                    return m469042;
                }
            }
        }
        C5661 m468732 = m46873(this.f66015);
        if (m468732 != null) {
            return m468732;
        }
        if (this.f66016) {
            for (int i2 = 0; i2 < this.f66021.size(); i2++) {
                C15537 c155372 = (C15537) this.f66021.valueAt(i2);
                if (c155372 != this.f66015 && c155372.f47851 && (m46873 = m46873(c155372)) != null) {
                    return m46873;
                }
            }
        }
        if (!this.f66016) {
            return null;
        }
        for (int i3 = 0; i3 < this.f66021.size(); i3++) {
            C15537 c155373 = (C15537) this.f66021.valueAt(i3);
            if (c155373 != this.f66015 && !c155373.f47851 && c155373.f47866.mo6174() && (m46904 = m46904(c155373)) != null) {
                return m46904;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5661 m46873(C15537 c15537) {
        if (c15537 == null || c15537.f47863 || c15537.f47853) {
            return null;
        }
        if (c15537.m36631() && c15537.f47879) {
            return null;
        }
        if (c15537.f47885 != null) {
            for (C23733 c23733 : c15537.f47877) {
                if (!(c15537.f47862 ? c15537.f47878 : c15537.f47856).containsKey(c23733) && !c15537.f47874.contains(c23733)) {
                    return new C5661(c15537, c23733, this.f66017, this.f66022);
                }
            }
        }
        if (c15537.f47871 == null || c15537.f47880) {
            return null;
        }
        for (C8917 c8917 : c15537.f47873) {
            if (!c15537.f47884.containsKey(c8917) && !c15537.f47869.contains(c8917)) {
                return new C5661(c15537, c8917, false, this.f66017, this.f66022);
            }
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C5661 m46904(C15537 c15537) {
        if (c15537 == null || c15537.f47863) {
            return null;
        }
        if (c15537.f47852 && (c15537 == this.f66015 || (this.f66016 && c15537.f47851))) {
            if (this.f66025.m46067() - this.f66025.m46070() < (this.f66016 ? Math.min(1048576L, this.f66025.m46067() / 128) : this.f66028)) {
                return null;
            }
            return new C5661(c15537, null, false, this.f66017, this.f66022);
        }
        if (c15537.f47876) {
            return null;
        }
        if (c15537 != this.f66015 && c15537.f47848) {
            return null;
        }
        if (c15537 != this.f66015 && !c15537.f47866.mo6174()) {
            return null;
        }
        if (c15537.f47871 == null) {
            if (c15537 == this.f66018) {
                return null;
            }
            return new C5661(c15537, null, false, this.f66017, this.f66022);
        }
        if (c15537.f47853) {
            return new C5661(c15537, null, true, this.f66017, this.f66022);
        }
        long m46885 = m46885();
        if (c15537 != this.f66015 || m46885 <= 0 || this.f66025.m46067() - this.f66025.m46070() < m46885) {
            return null;
        }
        return new C5661(c15537, null, false, this.f66017, this.f66022);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private long m46885() {
        if (this.f66016 || !this.f66027 || this.f66015 == null || this.f66015.f47863) {
            return 0L;
        }
        if (this.f66015.f47852) {
            return this.f66016 ? Math.min(1048576L, this.f66025.m46067() / 128) : this.f66028;
        }
        if (this.f66015.f47885 == null || this.f66015.f47868 || this.f66015.f47853) {
            return 0L;
        }
        long m32762 = this.f66015.f47885.m32762();
        if (m32762 <= this.f66025.m46067() - this.f66015.f47885.m32763()) {
            return m32762;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ۢ᩺ۜ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.᩷᩺ۜ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۡ᩺ۜ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46875(final C5661 c5661, AbstractC22967 abstractC22967, C21889 c21889, C19981 c19981, boolean z) {
        C13854 c13854;
        if (abstractC22967 instanceof C3978) {
            C11679 mo6179 = abstractC22967.mo6179();
            c21889.f70082 = ((C3978) abstractC22967).m12023(c19981, this.f66011, (C21184) new InterfaceC17066() { // from class: l.᩷᩺ۜ
                @Override // l.InterfaceC17066
                /* renamed from: ᩻ */
                public final boolean mo1526() {
                    boolean m46880;
                    m46880 = C20478.this.m46880(c5661);
                    return m46880;
                }
            });
            abstractC22967.m51108(mo6179);
            c21889.f70077 = new C15205(abstractC22967.mo6180(), c21889.f70082.f72236.getWidth(), c21889.f70082.f72236.getHeight(), 1, "video/*", mo6179);
            return;
        }
        long min = this.f66016 ? Math.min(1048576L, this.f66025.m46067() / 128) : this.f66011;
        C22802 m42083 = C18029.m42083(abstractC22967, (C9895) new InterfaceC17066() { // from class: l.ۢ᩺ۜ
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                boolean m46880;
                m46880 = C20478.this.m46880(c5661);
                return m46880;
            }
        });
        C13629 m42081 = C18029.m42081(abstractC22967, m42083, c19981, this.f66011, this.f66028, (C9189) new InterfaceC17066() { // from class: l.ۡ᩺ۜ
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                boolean m46880;
                m46880 = C20478.this.m46880(c5661);
                return m46880;
            }
        });
        c21889.f70078 = m42081;
        if (m42081 != null) {
            c21889.f70077 = m42081.f40640;
            return;
        }
        C15205 m13571 = this.f66002.m13571(abstractC22967, m42083.f73631, m42083.f73630.f30566);
        c21889.f70077 = m13571;
        if (m13571.f46660 != null) {
            if (z && abstractC22967.mo17660() != null) {
                m46884();
                try {
                    c13854 = C13854.m33209(abstractC22967, c21889.f70077, c19981, new InterfaceC17066() { // from class: l.ܺ᩺ۜ
                        @Override // l.InterfaceC17066
                        /* renamed from: ᩻ */
                        public final boolean mo1526() {
                            boolean m46880;
                            m46880 = C20478.this.m46880(c5661);
                            return m46880;
                        }
                    });
                    this.f66007 = c13854;
                    this.f66014 = c5661.f17486;
                } catch (C1095 unused) {
                }
                c21889.f70082 = C20912.m47747(abstractC22967, c21889.f70077, c19981, min, c13854, new InterfaceC17066() { // from class: l.ۖ᩺ۜ
                    @Override // l.InterfaceC17066
                    /* renamed from: ᩻ */
                    public final boolean mo1526() {
                        boolean m46880;
                        m46880 = C20478.this.m46880(c5661);
                        return m46880;
                    }
                }, C20146.f65246);
                return;
            }
            c13854 = null;
            c21889.f70082 = C20912.m47747(abstractC22967, c21889.f70077, c19981, min, c13854, new InterfaceC17066() { // from class: l.ۖ᩺ۜ
                @Override // l.InterfaceC17066
                /* renamed from: ᩻ */
                public final boolean mo1526() {
                    boolean m46880;
                    m46880 = C20478.this.m46880(c5661);
                    return m46880;
                }
            }, C20146.f65246);
            return;
        }
        if (!C13854.m33210(m13571.f46661)) {
            min = this.f66011;
        }
        if (m46880(c5661)) {
            return;
        }
        c21889.f70082 = this.f66002.m13572(abstractC22967, c21889.f70077, c19981, (!this.f66016 && z && c5661.f17486 == this.f66015 && "image/png".equals(c21889.f70077.f46661)) ? Math.min(X931RNG.BLOCK128_RESEED_MAX, this.f66011 * 2) : min);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m46909(C15537 c15537) {
        C22262 c22262 = c15537.f47870;
        if (c22262 == null || c15537.f47867) {
            return 0L;
        }
        long allocationByteCount = c22262.f72236.getAllocationByteCount();
        long j = this.f66011;
        if (allocationByteCount <= j) {
            return 0L;
        }
        int i = 2;
        while (C4623.m13563(c15537.f47870.f72236.getWidth(), c15537.f47870.f72236.getHeight(), i) > j) {
            i *= 2;
        }
        return C4623.m13563(c15537.f47870.f72236.getWidth(), c15537.f47870.f72236.getHeight(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m46913() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20478.m46913():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46879(C20478 c20478, boolean z, C15537 c15537, C22262 c22262, C5661 c5661, C21889 c21889) {
        c20478.f66018 = null;
        c20478.f66019 = 0L;
        c20478.f66029 = null;
        if (z) {
            if (!c20478.f66004 && c20478.f66027 && !c15537.f47863 && c15537 != c20478.f66015 && c15537.f47870 == c22262 && c5661.f17481 == c20478.f66017 && !c21889.f70079) {
                C22262 c222622 = c21889.f70082;
                if (c222622 == null) {
                    c15537.f47867 = true;
                } else {
                    c21889.f70082 = null;
                    c15537.f47870 = c222622;
                    c22262.close();
                }
            }
            c21889.close();
        } else {
            c20478.m46874(c5661, c21889);
        }
        if (c20478.f66004) {
            return;
        }
        if (c20478.f66015 != null) {
            c20478.f66015.f47881 = false;
        }
        AbstractC12924 abstractC12924 = c20478.f66024;
        if (abstractC12924 != null) {
            abstractC12924.invalidate();
        }
        c20478.m46915();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m46896(final C5661 c5661, C21889 c21889) {
        C15537 c15537 = c5661.f17486;
        C8917 c8917 = c5661.f17479;
        if (m46880(c5661)) {
            return;
        }
        c21889.f70079 = false;
        if (c5661.f17483) {
            c21889.f70083 = (c5661.f17482 && c15537.f47866.mo6175()) || !c15537.f47871.f46664.equals(c15537.f47866.mo6179());
            return;
        }
        C23733 c23733 = c5661.f17480;
        if (c23733 != null) {
            c21889.f70082 = c5661.f17478.m32757(c23733.f76848, c23733.f76850, this.f66025, c5661.f17487, new C16949(this, c5661));
            return;
        }
        if (c8917 == null) {
            m46875(c5661, m46895(c5661), c21889, this.f66025, true);
            return;
        }
        C15537 c155372 = this.f66014;
        C19981 c19981 = this.f66025;
        if (c155372 != c15537) {
            m46884();
            AbstractC22967 m46895 = m46895(c5661);
            C15205 c15205 = c15537.f47871;
            this.f66007 = c15205.f46660 == null ? C13854.m33208(m46895, c15205) : C13854.m33209(m46895, c15205, c19981, new InterfaceC17066() { // from class: l.ᩳ᩺ۜ
                @Override // l.InterfaceC17066
                /* renamed from: ᩻ */
                public final boolean mo1526() {
                    boolean m46880;
                    m46880 = C20478.this.m46880(c5661);
                    return m46880;
                }
            });
            this.f66014 = c15537;
        }
        c21889.f70082 = this.f66007.m33211(new Rect(c8917.f27098, c8917.f27102, c8917.f27103, c8917.f27095), c8917.f27096, c19981, new InterfaceC17066() { // from class: l.ܿ᩺ۜ
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                boolean m46880;
                m46880 = C20478.this.m46880(c5661);
                return m46880;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m46880(C5661 c5661) {
        if (this.f66004 || !this.f66027 || c5661.f17481 != this.f66017 || c5661.f17486.f47863 || ((c5661.f17484 != this.f66022 && ((!this.f66016 || !c5661.f17486.f47866.mo6174() || (!c5661.f17485 && c5661.f17486.f47866.mo6176())) && (!c5661.f17485 || c5661.f17488 != null || c5661.f17486 != this.f66015 || c5661.f17479 != null || c5661.f17480 != null || !c5661.f17486.f47866.mo6174()))) || (((c5661.f17479 != null || c5661.f17480 != null) && !m46899(c5661.f17486)) || (c5661.f17480 != null && !c5661.f17486.f47877.contains(c5661.f17480))))) {
            c5661.f17477 = true;
        }
        return c5661.f17477;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m46899(C15537 c15537) {
        return this.f66016 ? c15537.f47851 : c15537 == this.f66015;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC22967 m46895(final C5661 c5661) {
        C15537 c15537 = c5661.f17486;
        AbstractC22967 abstractC22967 = c15537.f47866;
        if (!abstractC22967.mo6176()) {
            return abstractC22967;
        }
        IdentityHashMap identityHashMap = this.f66026;
        C6366 c6366 = (C6366) identityHashMap.get(c15537);
        if (c6366 != null) {
            return c6366;
        }
        C12011 c12011 = this.f66003;
        if (c12011 == null) {
            throw new IOException("A cache directory is required for this image source");
        }
        C6366 m29378 = c12011.m29378(abstractC22967, !c5661.f17485, new InterfaceC17066() { // from class: l.ۜ᩺ۜ
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                boolean m46880;
                m46880 = C20478.this.m46880(c5661);
                return m46880;
            }
        });
        identityHashMap.put(c15537, m29378);
        return m29378;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m46898(boolean z) {
        Iterator it = this.f66026.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C15537 c15537 = (C15537) entry.getKey();
            if (z || c15537.f47863 || !m46899(c15537)) {
                if (this.f66014 == c15537) {
                    m46884();
                }
                ((C6366) entry.getValue()).close();
                it.remove();
            }
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m46884() {
        try {
            C13854 c13854 = this.f66007;
            if (c13854 != null) {
                c13854.close();
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f66007 = null;
            this.f66014 = null;
            throw th;
        }
        this.f66007 = null;
        this.f66014 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x01dc, code lost:
    
        if (l.C2133.m7054(r4, r7, r9.f46658, r9.f46659, ((l.C8917) r8.get(0)).f27096) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01eb, code lost:
    
        if (r24.f70082 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01f1, code lost:
    
        if (r3.m36631() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01f3, code lost:
    
        r4 = r3.f47884.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0201, code lost:
    
        if (r4.hasNext() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0203, code lost:
    
        ((l.C22594) r4.next()).f73027.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x020f, code lost:
    
        r3.f47884.clear();
        r3.f47873 = java.util.Collections.singletonList(r23.f17479);
        r22.f66013.removeCallbacks(r3.f47847);
        r3.f47879 = false;
        r3.f47883.m19980();
        r3.f47881 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x022c, code lost:
    
        r5 = r23.f17479;
        r6 = r24.f70082;
        r24.f70082 = null;
        r1 = (l.C22594) r3.f47884.put(r23.f17479, new l.C22594(r5, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0241, code lost:
    
        if (r1 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0243, code lost:
    
        r1.f73027.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0248, code lost:
    
        r1 = r3.f47872;
        r1.clear();
        r1.addAll(r3.f47884.values());
        r22.f66024.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0260, code lost:
    
        if ((r24.f70081 instanceof l.C1095) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0262, code lost:
    
        r3.f47849 = java.lang.Math.max(262144L, r3.f47849 / 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0274, code lost:
    
        if (r3.m36631() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0276, code lost:
    
        r3.f47881 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x027c, code lost:
    
        r3.f47869.add(r23.f17479);
        r22.f66024.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0279, code lost:
    
        r3.m36626();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0289, code lost:
    
        r3.f47880 = true;
        r3.m36626();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01e7, code lost:
    
        if (r3.f47873.contains(r23.f17479) != false) goto L133;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m46874(l.C5661 r23, l.C21889 r24) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20478.m46874(l.ۚ᩺ۜ, l.᩸᩺ۜ):void");
    }
}
