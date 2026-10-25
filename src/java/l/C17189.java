package l;

import java.lang.Thread;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import sun.misc.Unsafe;

/* compiled from: H6Q8 */
/* renamed from: l.ܿۜ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17189 extends AbstractExecutorService implements AutoCloseable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final int f52689;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final int f52690;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final long f52691;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f52692;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C14157 f52693;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final long f52694;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final C17189 f52695;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final Unsafe f52696;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f52697;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final RuntimePermission f52698;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f52699;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52700;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17895[] f52701;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Thread.UncaughtExceptionHandler f52702;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f52703;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile long f52704;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile int f52705;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC7808 f52706;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f52707;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile long f52708;

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C10631.m26668(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractFutureC8723 c9429;
        runnable.getClass();
        if (runnable instanceof AbstractFutureC8723) {
            c9429 = (AbstractFutureC8723) runnable;
        } else {
            c9429 = new C9429(runnable);
        }
        m40433(c9429);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        AbstractFutureC8723 runnableFutureC6606 = runnable instanceof AbstractFutureC8723 ? (AbstractFutureC8723) runnable : new RunnableFutureC6606(runnable);
        m40433(runnableFutureC6606);
        return runnableFutureC6606;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f52698);
        }
        m40431(false, true);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f52698);
        }
        m40431(true, true);
        return Collections.EMPTY_LIST;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AccessControlContext m40427(Permission... permissionArr) {
        Permissions permissions = new Permissions();
        for (Permission permission : permissionArr) {
            permissions.add(permission);
        }
        return new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, permissions)});
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40428(Object obj, long j, long j2) {
        Unsafe unsafe;
        long longVolatile;
        do {
            unsafe = f52696;
            longVolatile = unsafe.getLongVolatile(obj, j);
        } while (!unsafe.compareAndSwapLong(obj, j, longVolatile, longVolatile + j2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m40426(long j, Object obj) {
        Unsafe unsafe;
        Object objectVolatile;
        do {
            unsafe = f52696;
            objectVolatile = unsafe.getObjectVolatile(obj, j);
        } while (!C6397.m17724(unsafe, obj, j, objectVolatile));
        return objectVolatile;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m40436() {
        InterfaceC7808 interfaceC7808 = this.f52706;
        C3784 th = null;
        if (interfaceC7808 != null) {
            try {
                C3784 mo20831 = interfaceC7808.mo20831(this);
                if (mo20831 != null) {
                    try {
                        mo20831.start();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C3784 c3784 = th;
                th = mo20831;
                th = c3784;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            th = null;
        }
        m40439(th, th);
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40432(long j) {
        long j2 = j;
        do {
            long j3 = ((281474976710656L + j2) & (-281474976710656L)) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j2) & 281470681743360L);
            if (this.f52708 == j2 && f52696.compareAndSwapLong(this, f52691, j2, j3)) {
                m40436();
                return;
            } else {
                j2 = this.f52708;
                if ((140737488355328L & j2) == 0) {
                    return;
                }
            }
        } while (((int) j2) == 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17895 m40438(C3784 c3784) {
        int i;
        int length;
        c3784.setDaemon(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f52702;
        if (uncaughtExceptionHandler != null) {
            c3784.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        C17895 c17895 = new C17895(this, c3784);
        int i2 = this.f52705 & 65536;
        String str = this.f52703;
        if (str == null) {
            return c17895;
        }
        synchronized (str) {
            C17895[] c17895Arr = this.f52701;
            int i3 = this.f52700 - 1640531527;
            this.f52700 = i3;
            i = 0;
            if (c17895Arr != null && (length = c17895Arr.length) > 1) {
                int i4 = length - 1;
                int i5 = i3 & i4;
                int i6 = ((i3 << 1) | 1) & i4;
                int i7 = length >>> 1;
                while (true) {
                    C17895 c178952 = c17895Arr[i6];
                    if (c178952 == null || c178952.f54644 == 1073741824) {
                        break;
                    }
                    i7--;
                    if (i7 == 0) {
                        i6 = length | 1;
                        break;
                    }
                    i6 = (i6 + 2) & i4;
                }
                int i8 = i2 | i6 | (i3 & 1073610752);
                c17895.f54645 = i8;
                c17895.f54644 = i8;
                if (i6 < length) {
                    c17895Arr[i6] = c17895;
                } else {
                    int i9 = length << 1;
                    C17895[] c17895Arr2 = new C17895[i9];
                    c17895Arr2[i6] = c17895;
                    int i10 = i9 - 1;
                    while (i < length) {
                        C17895 c178953 = c17895Arr[i];
                        if (c178953 != null) {
                            c17895Arr2[c178953.f54645 & i10 & 126] = c178953;
                        }
                        int i11 = i + 1;
                        if (i11 >= length) {
                            break;
                        }
                        c17895Arr2[i11] = c17895Arr[i11];
                        i += 2;
                    }
                    this.f52701 = c17895Arr2;
                }
                i = i5;
            }
        }
        c3784.setName(str.concat(Integer.toString(i)));
        return c17895;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0044 A[LOOP:0: B:28:0x0044->B:31:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[LOOP:1: B:33:0x006c->B:41:0x006c, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m40439(l.C3784 r18, java.lang.Throwable r19) {
        /*
            r17 = this;
            r9 = r17
            r0 = r18
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 0
            r12 = 0
            if (r0 == 0) goto L3d
            l.ᩳۜ᩵ r0 = r0.f11956
            if (r0 == 0) goto L3c
            java.lang.String r2 = r9.f52703
            int r3 = r0.f54647
            long r3 = (long) r3
            long r3 = r3 & r10
            int r5 = r0.f54645
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            if (r2 == 0) goto L39
            r16 = r2
            monitor-enter(r16)
            l.ᩳۜ᩵[] r2 = r9.f52701     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L2f
            int r6 = r2.length     // Catch: java.lang.Throwable -> L36
            if (r6 <= r5) goto L2f
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L36
            if (r6 != r0) goto L2f
            r2[r5] = r1     // Catch: java.lang.Throwable -> L36
        L2f:
            long r1 = r9.f52704     // Catch: java.lang.Throwable -> L36
            long r1 = r1 + r3
            r9.f52704 = r1     // Catch: java.lang.Throwable -> L36
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L36
            throw r0
        L39:
            int r1 = r0.f54644
            goto L40
        L3c:
            r1 = r0
        L3d:
            r0 = 0
            r0 = r1
            r1 = 0
        L40:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L6a
        L44:
            sun.misc.Unsafe r1 = l.C17189.f52696
            long r3 = l.C17189.f52691
            long r5 = r9.f52708
            r7 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r7 = r5 - r7
            r13 = -281474976710656(0xffff000000000000, double:NaN)
            long r7 = r7 & r13
            r13 = 4294967296(0x100000000, double:2.121995791E-314)
            long r13 = r5 - r13
            r15 = 281470681743360(0xffff00000000, double:1.39064994160909E-309)
            long r13 = r13 & r15
            long r7 = r7 | r13
            long r13 = r5 & r10
            long r7 = r7 | r13
            r2 = r17
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 == 0) goto L44
        L6a:
            if (r0 == 0) goto L7c
        L6c:
            l.ۡۜ᩵ r1 = r0.m41862()
            if (r1 == 0) goto L7c
            int r2 = r1.f26563
            if (r2 < 0) goto L6c
            r1.cancel(r12)     // Catch: java.lang.Throwable -> L7a
            goto L6c
        L7a:
            goto L6c
        L7c:
            boolean r1 = r9.m40431(r12, r12)
            if (r1 != 0) goto L8b
            if (r0 == 0) goto L8b
            l.ۡۜ᩵[] r0 = r0.f54640
            if (r0 == 0) goto L8b
            r17.m40443()
        L8b:
            if (r19 != 0) goto L91
            l.AbstractFutureC8723.m22546()
            return
        L91:
            int r0 = l.AbstractFutureC8723.f26562
            throw r19
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17189.m40439(l.ۘۜ᩵, java.lang.Throwable):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m40443() {
        int i;
        C17895 c17895;
        while (true) {
            long j = this.f52708;
            if (j >= 0) {
                return;
            }
            int i2 = (int) j;
            if (i2 == 0) {
                if ((140737488355328L & j) != 0) {
                    m40432(j);
                    return;
                }
                return;
            }
            C17895[] c17895Arr = this.f52701;
            if (c17895Arr == null || c17895Arr.length <= (i = 65535 & i2) || (c17895 = c17895Arr[i]) == null) {
                return;
            }
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = c17895.f54644;
            long j2 = (c17895.f54648 & 4294967295L) | ((281474976710656L + j) & (-4294967296L));
            C3784 c3784 = c17895.f54646;
            if (i2 == i4 && f52696.compareAndSwapLong(this, f52691, j, j2)) {
                c17895.f54644 = i3;
                if (c17895.f54641 < 0) {
                    LockSupport.unpark(c3784);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m40435(C17895 c17895) {
        int length;
        Thread.State state;
        long j = this.f52708;
        C17895[] c17895Arr = this.f52701;
        short s = (short) (j >>> 32);
        if (s >= 0) {
            if (c17895Arr == null || (length = c17895Arr.length) <= 0 || c17895 == null) {
                return 0;
            }
            int i = (int) j;
            if (i != 0) {
                C17895 c178952 = c17895Arr[i & (length - 1)];
                int i2 = c17895.f54644;
                long j2 = (-4294967296L) & (i2 < 0 ? 281474976710656L + j : j);
                int i3 = i & Integer.MAX_VALUE;
                if (c178952 == null) {
                    return 0;
                }
                int i4 = c178952.f54644;
                C3784 c3784 = c178952.f54646;
                long j3 = (c178952.f54648 & 4294967295L) | j2;
                if (i4 != i || !f52696.compareAndSwapLong(this, f52691, j, j3)) {
                    return 0;
                }
                c178952.f54644 = i3;
                if (c178952.f54641 < 0) {
                    LockSupport.unpark(c3784);
                }
                return i2 < 0 ? -1 : 1;
            }
            if (((int) (j >> 48)) - ((short) (this.f52707 & 65535)) > 0) {
                return f52696.compareAndSwapLong(this, f52691, j, (281474976710655L & j) | ((-281474976710656L) & (j - 281474976710656L))) ? 1 : 0;
            }
            int i5 = this.f52705 & 65535;
            int i6 = i5 + s;
            int i7 = 0;
            int i8 = i6;
            for (int i9 = 1; i9 < length; i9 += 2) {
                C17895 c178953 = c17895Arr[i9];
                if (c178953 != null) {
                    if (c178953.f54641 == 0) {
                        return 0;
                    }
                    i8--;
                    C3784 c37842 = c178953.f54646;
                    if (c37842 != null && ((state = c37842.getState()) == Thread.State.BLOCKED || state == Thread.State.WAITING)) {
                        i7++;
                    }
                }
            }
            if (i8 != 0 || this.f52708 != j) {
                return 0;
            }
            if (i6 >= 32767 || s >= (this.f52707 >>> 16)) {
                if (i7 < i5) {
                    Thread.yield();
                    return 0;
                }
                throw new RejectedExecutionException("Thread limit exceeded replacing blocked worker");
            }
        }
        return (f52696.compareAndSwapLong(this, f52691, j, ((-281470681743361L) & j) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j) & 281470681743360L)) && m40436()) ? 1 : 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40442(C17895 c17895) {
        int i;
        long j;
        C17895[] c17895Arr;
        int i2;
        C17895 c178952;
        AbstractFutureC8723[] abstractFutureC8723Arr;
        int length;
        c17895.m41859();
        int m14970 = c17895.f54645 ^ C5195.m14970();
        if (m14970 == 0) {
            m14970 = 1;
        }
        int i3 = 0;
        C17189 c17189 = this;
        C17895 c178953 = c17895;
        while (true) {
            C17895[] c17895Arr2 = c17189.f52701;
            if (c17895Arr2 == null) {
                return;
            }
            int length2 = c17895Arr2.length;
            int i4 = length2 - 1;
            boolean z = false;
            C17895 c178954 = c178953;
            int i5 = length2;
            while (true) {
                if (i5 <= 0) {
                    i = 65536;
                    break;
                }
                int i6 = m14970 & i4;
                if (i6 >= 0 && i6 < length2 && (c178952 = c17895Arr2[i6]) != null) {
                    int i7 = c178952.f54643;
                    if (i7 - c178952.f54642 < 0 && (abstractFutureC8723Arr = c178952.f54640) != null && (length = abstractFutureC8723Arr.length) > 0) {
                        int i8 = c178952.f54645;
                        c17895Arr = c17895Arr2;
                        i2 = length2;
                        long j2 = (((length - 1) & i7) << f52692) + f52697;
                        Unsafe unsafe = f52696;
                        AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) unsafe.getObjectVolatile(abstractFutureC8723Arr, j2);
                        if (abstractFutureC8723 != null) {
                            int i9 = i7 + 1;
                            if (i7 == c178952.f54643 && C6397.m17724(unsafe, abstractFutureC8723Arr, j2, abstractFutureC8723)) {
                                c178952.f54643 = i9;
                                if (i9 - c178952.f54642 < 0 && i8 != i3) {
                                    c17189.m40443();
                                }
                                c17895.f54641 = i8;
                                abstractFutureC8723.m22555();
                                if ((c17895.f54645 & 65536) != 0) {
                                    c17895.m41860(1024);
                                } else {
                                    c17895.m41863(1024);
                                }
                                C3784 c3784 = c17895.f54646;
                                c17895.f54647++;
                                c17895.f54641 = 0;
                                if (c3784 != null) {
                                    c3784.mo7689();
                                }
                                i3 = i8;
                            }
                        }
                        c178954 = c17895;
                        z = true;
                        i5--;
                        c17895Arr2 = c17895Arr;
                        length2 = i2;
                    }
                }
                c17895Arr = c17895Arr2;
                i2 = length2;
                i = 65536;
                if (z) {
                    break;
                }
                m14970++;
                i5--;
                c17895Arr2 = c17895Arr;
                length2 = i2;
            }
            if (z) {
                int i10 = m14970 ^ (m14970 << 13);
                int i11 = i10 ^ (i10 >>> 17);
                m14970 = i11 ^ (i11 << 5);
            } else {
                int i12 = c178954.f54644;
                if (i12 >= 0) {
                    int i13 = (i12 + i) | Integer.MIN_VALUE;
                    c178954.f54644 = i13;
                    do {
                        j = c17189.f52708;
                        c178954.f54648 = (int) j;
                    } while (!f52696.compareAndSwapLong(c17189, f52691, j, (i13 & 4294967295L) | ((j - 281474976710656L) & (-4294967296L))));
                } else {
                    int i14 = c178954.f54648;
                    c178954.f54641 = -1073741824;
                    int i15 = 0;
                    while (c178954.f54644 < 0) {
                        int i16 = c17189.f52705;
                        if (i16 < 0) {
                            return;
                        }
                        long j3 = c17189.f52708;
                        int i17 = (65535 & i16) + ((int) (j3 >> 48));
                        if (i17 <= 0 && (i16 & 262144) != 0 && c17189.m40431(false, false)) {
                            return;
                        }
                        i15++;
                        if ((i15 & 1) == 0) {
                            Thread.interrupted();
                        } else if (i17 <= 0 && i14 != 0 && i12 == ((int) j3)) {
                            long currentTimeMillis = System.currentTimeMillis() + c17189.f52699;
                            LockSupport.parkUntil(c17189, currentTimeMillis);
                            if (c17189.f52708 == j3 && currentTimeMillis - System.currentTimeMillis() <= 20) {
                                if (f52696.compareAndSwapLong(c17189, f52691, j3, (i14 & 4294967295L) | ((j3 - Blake2xsDigest.MAX_NUMBER_BLOCKS) & (-4294967296L)))) {
                                    c178954.f54644 = 1073741824;
                                    return;
                                }
                            }
                        } else {
                            LockSupport.park(this);
                        }
                        c17189 = this;
                    }
                    c178954.f54641 = 0;
                }
                i3 = 0;
            }
            c178953 = c178954;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0090 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m40437(l.C17895 r17, l.AbstractFutureC8723 r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            if (r1 == 0) goto Lb4
            r17.m41864(r18)
            int r3 = r1.f54641
            int r4 = r1.f54645
            int r5 = r2.f26563
        L11:
            if (r5 < 0) goto Lb3
            int r5 = l.C5195.m14970()
            r6 = 1
            r5 = r5 | r6
            l.ᩳۜ᩵[] r7 = r0.f52701
            if (r7 == 0) goto L76
            int r8 = r7.length
            int r9 = r8 + (-1)
            int r10 = -r8
        L21:
            if (r10 >= r8) goto L76
            int r11 = r5 + r10
            r11 = r11 & r9
            if (r11 < 0) goto L73
            if (r11 >= r8) goto L73
            r11 = r7[r11]
            if (r11 == 0) goto L73
            int r12 = r11.f54641
            if (r12 != r4) goto L73
            int r12 = r11.f54643
            int r13 = r11.f54642
            int r13 = r12 - r13
            if (r13 >= 0) goto L73
            l.ۡۜ᩵[] r13 = r11.f54640
            if (r13 == 0) goto L73
            int r14 = r13.length
            if (r14 <= 0) goto L73
            int r5 = r11.f54645
            int r14 = r14 + (-1)
            r7 = r14 & r12
            long r7 = (long) r7
            int r9 = l.C17189.f52692
            long r7 = r7 << r9
            int r9 = l.C17189.f52697
            long r9 = (long) r9
            long r7 = r7 + r9
            sun.misc.Unsafe r9 = l.C17189.f52696
            java.lang.Object r10 = r9.getObjectVolatile(r13, r7)
            l.ۡۜ᩵ r10 = (l.AbstractFutureC8723) r10
            if (r10 == 0) goto L77
            int r14 = r12 + 1
            int r15 = r11.f54643
            if (r12 != r15) goto L77
            int r12 = r11.f54641
            if (r4 != r12) goto L77
            boolean r7 = l.C6397.m17724(r9, r13, r7, r10)
            if (r7 == 0) goto L77
            r11.f54643 = r14
            r1.f54641 = r5
            r10.m22555()
            r1.f54641 = r3
            goto L77
        L73:
            int r10 = r10 + 2
            goto L21
        L76:
            r6 = 0
        L77:
            int r5 = r2.f26563
            if (r5 >= 0) goto L7c
            goto L90
        L7c:
            if (r6 != 0) goto L11
            r6 = 0
            int r8 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r8 != 0) goto L86
            r8 = r6
            goto L9d
        L86:
            long r8 = java.lang.System.nanoTime()
            long r8 = r19 - r8
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 > 0) goto L91
        L90:
            return r5
        L91:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r8 = r5.toMillis(r8)
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 > 0) goto L9d
            r8 = 1
        L9d:
            int r5 = r16.m40435(r17)
            if (r5 == 0) goto Laf
            r2.m22552(r8)
            long r8 = l.C17189.f52691
            if (r5 <= 0) goto Lac
            r6 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
        Lac:
            m40428(r0, r8, r6)
        Laf:
            int r5 = r2.f26563
            goto L11
        Lb3:
            return r5
        Lb4:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17189.m40437(l.ᩳۜ᩵, l.ۡۜ᩵, long):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40440(C17895 c17895) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        C17895 c178952;
        int i3;
        AbstractFutureC8723[] abstractFutureC8723Arr;
        int i4 = c17895.f54641;
        int i5 = c17895.f54645 & 65536;
        char c = 65535;
        char c2 = 65535;
        int i6 = i4;
        while (true) {
            if (i5 != 0) {
                c17895.m41860(0);
            } else {
                c17895.m41863(0);
            }
            if (c2 == c && c17895.f54644 >= 0) {
                c2 = 1;
            }
            int m14970 = C5195.m14970();
            C17895[] c17895Arr = this.f52701;
            long j = 281474976710656L;
            if (c17895Arr != null) {
                int length = c17895Arr.length;
                int i7 = length - 1;
                z2 = true;
                int i8 = length;
                while (true) {
                    if (i8 <= 0) {
                        i = i5;
                        z = true;
                        break;
                    }
                    int i9 = (m14970 - i8) & i7;
                    if (i9 < 0 || i9 >= length || (c178952 = c17895Arr[i9]) == null) {
                        i = i5;
                        i2 = m14970;
                    } else {
                        int i10 = c178952.f54643;
                        i = i5;
                        if (i10 - c178952.f54642 >= 0 || (abstractFutureC8723Arr = c178952.f54640) == null) {
                            i2 = m14970;
                            i3 = 1073741824;
                        } else {
                            i3 = 1073741824;
                            i2 = m14970;
                            if (abstractFutureC8723Arr.length > 0) {
                                if (c2 == 0) {
                                    m40428(this, f52691, j);
                                    c2 = 1;
                                }
                                long j2 = (((r4 - 1) & i10) << f52692) + f52697;
                                Unsafe unsafe = f52696;
                                AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) unsafe.getObjectVolatile(abstractFutureC8723Arr, j2);
                                if (abstractFutureC8723 != null) {
                                    int i11 = i10 + 1;
                                    if (i10 == c178952.f54643 && C6397.m17724(unsafe, abstractFutureC8723Arr, j2, abstractFutureC8723)) {
                                        c178952.f54643 = i11;
                                        c17895.f54641 = c178952.f54645;
                                        abstractFutureC8723.m22555();
                                        c17895.f54641 = i4;
                                        i6 = i4;
                                    }
                                }
                                z = false;
                                z2 = false;
                            }
                        }
                        if ((c178952.f54641 & i3) == 0) {
                            z2 = false;
                        }
                    }
                    i8--;
                    j = 281474976710656L;
                    i5 = i;
                    m14970 = i2;
                }
            } else {
                i = i5;
                z = true;
                z2 = true;
            }
            if (z2) {
                break;
            }
            if (z) {
                if (i6 != 1073741824) {
                    c17895.f54641 = 1073741824;
                    i6 = 1073741824;
                }
                if (c2 == 1) {
                    m40428(this, f52691, -281474976710656L);
                    c2 = 0;
                }
            }
            c = 65535;
            i5 = i;
        }
        if (c2 == 0) {
            m40428(this, f52691, 281474976710656L);
        }
        c17895.f54641 = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r0 = (((r10 - 1) & r8) << l.C17189.f52692) + l.C17189.f52697;
        r2 = l.C17189.f52696;
        r3 = (l.AbstractFutureC8723) r2.getObjectVolatile(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        r4 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r8 != r7.f54643) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (l.C6397.m17724(r2, r9, r0, r3) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r7.f54643 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0000, code lost:
    
        continue;
     */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.AbstractFutureC8723 m40434() {
        /*
            r11 = this;
        L0:
            int r0 = r11.f52705
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 != 0) goto L60
            l.ᩳۜ᩵[] r0 = r11.f52701
            if (r0 == 0) goto L60
            int r1 = r0.length
            if (r1 <= 0) goto L60
            int r1 = r1 + (-1)
            int r2 = l.C5195.m14970()
            int r3 = r2 >>> 16
            r2 = r2 & r1
            r3 = r3 | 1
            r4 = 0
            r5 = 0
            r6 = r2
        L1c:
            r7 = r0[r6]
            if (r7 == 0) goto L55
            int r8 = r7.f54643
            int r4 = r4 + r8
            int r9 = r7.f54642
            int r9 = r8 - r9
            if (r9 >= 0) goto L55
            l.ۡۜ᩵[] r9 = r7.f54640
            if (r9 == 0) goto L55
            int r10 = r9.length
            if (r10 <= 0) goto L55
            int r10 = r10 + (-1)
            r0 = r10 & r8
            long r0 = (long) r0
            int r2 = l.C17189.f52692
            long r0 = r0 << r2
            int r2 = l.C17189.f52697
            long r2 = (long) r2
            long r0 = r0 + r2
            sun.misc.Unsafe r2 = l.C17189.f52696
            java.lang.Object r3 = r2.getObjectVolatile(r9, r0)
            l.ۡۜ᩵ r3 = (l.AbstractFutureC8723) r3
            if (r3 == 0) goto L0
            int r4 = r8 + 1
            int r5 = r7.f54643
            if (r8 != r5) goto L0
            boolean r0 = l.C6397.m17724(r2, r9, r0, r3)
            if (r0 == 0) goto L0
            r7.f54643 = r4
            return r3
        L55:
            int r6 = r6 + r3
            r6 = r6 & r1
            if (r6 != r2) goto L1c
            if (r5 != r4) goto L5c
            goto L60
        L5c:
            r5 = 0
            r5 = r4
            r4 = 0
            goto L1c
        L60:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17189.m40434():l.ۡۜ᩵");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40433(AbstractFutureC8723 abstractFutureC8723) {
        int length;
        boolean z;
        boolean z2;
        int length2;
        int length3;
        int length4;
        C17895 c17895;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C3784) {
            C3784 c3784 = (C3784) currentThread;
            if (c3784.f11955 == this && (c17895 = c3784.f11956) != null) {
                c17895.m41861(abstractFutureC8723);
                return;
            }
        }
        int m14963 = C5195.m14963();
        if (m14963 == 0) {
            C5195.m14969();
            m14963 = C5195.m14963();
        }
        int i = m14963;
        while (true) {
            int i2 = this.f52705;
            C17895[] c17895Arr = this.f52701;
            if ((i2 & 262144) != 0 || c17895Arr == null || (length = c17895Arr.length) <= 0) {
                break;
            }
            C17895 c178952 = c17895Arr[(length - 1) & i & 126];
            if (c178952 == null) {
                String str = this.f52703;
                int i3 = (i | 1073741824) & (-65538);
                C17895 c178953 = new C17895(this, null);
                c178953.f54645 = i3;
                c178953.f54641 = 1073741824;
                c178953.f54644 = 1;
                if (str != null) {
                    synchronized (str) {
                        C17895[] c17895Arr2 = this.f52701;
                        if (c17895Arr2 != null && (length4 = c17895Arr2.length) > 0) {
                            int i4 = i3 & (length4 - 1) & 126;
                            if (c17895Arr2[i4] == null) {
                                c17895Arr2[i4] = c178953;
                                z = true;
                                z2 = true;
                            }
                        }
                        z = false;
                        z2 = false;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                c178952 = c178953;
            } else if (c178952.m41865()) {
                int i5 = c178952.f54643;
                int i6 = c178952.f54642;
                AbstractFutureC8723[] abstractFutureC8723Arr = c178952.f54640;
                if (abstractFutureC8723Arr != null && (length2 = abstractFutureC8723Arr.length) > 0) {
                    int i7 = length2 - 1;
                    int i8 = i5 - i6;
                    if (i7 + i8 > 0) {
                        abstractFutureC8723Arr[i7 & i6] = abstractFutureC8723;
                        c178952.f54642 = i6 + 1;
                        if (i8 < 0 && c178952.f54643 - i6 < -1) {
                            return;
                        }
                        z2 = false;
                        z = true;
                    }
                }
                z2 = true;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z) {
                if (z2) {
                    try {
                        c178952.m41859();
                        int i9 = c178952.f54642;
                        AbstractFutureC8723[] abstractFutureC8723Arr2 = c178952.f54640;
                        if (abstractFutureC8723Arr2 != null && (length3 = abstractFutureC8723Arr2.length) > 0) {
                            abstractFutureC8723Arr2[(length3 - 1) & i9] = abstractFutureC8723;
                            c178952.f54642 = i9 + 1;
                        }
                    } finally {
                        c178952.f54644 = 0;
                    }
                }
                m40443();
                return;
            }
            i = C5195.m14964(i);
        }
        throw new RejectedExecutionException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40441(AbstractFutureC8723 abstractFutureC8723) {
        int length;
        C17895 c17895;
        int m14963 = C5195.m14963();
        C17895[] c17895Arr = this.f52701;
        return c17895Arr != null && (length = c17895Arr.length) > 0 && (c17895 = c17895Arr[(m14963 & (length - 1)) & 126]) != null && c17895.m41866(abstractFutureC8723);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40431(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5;
        while (true) {
            int i6 = this.f52705;
            if ((262144 & i6) != 0) {
                while (true) {
                    int i7 = this.f52705;
                    int i8 = 65535;
                    int i9 = 1;
                    if ((Integer.MIN_VALUE & i7) != 0) {
                        while (true) {
                            if ((this.f52705 & 524288) != 0) {
                                break;
                            }
                            long j3 = 0;
                            while (true) {
                                long j4 = this.f52708;
                                C17895[] c17895Arr = this.f52701;
                                if (c17895Arr != null) {
                                    for (C17895 c17895 : c17895Arr) {
                                        if (c17895 != null) {
                                            C3784 c3784 = c17895.f54646;
                                            while (true) {
                                                AbstractFutureC8723 m41862 = c17895.m41862();
                                                if (m41862 == null) {
                                                    break;
                                                }
                                                if (m41862.f26563 >= 0) {
                                                    try {
                                                        m41862.cancel(false);
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                            if (c3784 != null) {
                                                try {
                                                    c3784.interrupt();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            j4 += (c17895.f54644 << 32) + c17895.f54643;
                                        }
                                    }
                                }
                                i = this.f52705;
                                i2 = i & 524288;
                                if (i2 != 0) {
                                    break;
                                }
                                if (this.f52701 == c17895Arr) {
                                    if (j3 == j4) {
                                        break;
                                    }
                                    j3 = j4;
                                }
                            }
                            if (i2 != 0 || (i & 65535) + ((short) (this.f52708 >>> 32)) > 0) {
                                break;
                            }
                            if (f52696.compareAndSwapInt(this, f52694, i, i | 524288)) {
                                synchronized (this) {
                                    notifyAll();
                                }
                                break;
                            }
                        }
                        return true;
                    }
                    if (z) {
                        i3 = i7;
                        i4 = Integer.MIN_VALUE;
                    } else {
                        long j5 = 0;
                        while (true) {
                            long j6 = this.f52708;
                            C17895[] c17895Arr2 = this.f52701;
                            if ((i7 & i8) + ((int) (j6 >> 48)) > 0) {
                                i4 = Integer.MIN_VALUE;
                                j = j5;
                            } else {
                                if (c17895Arr2 != null) {
                                    int i10 = 0;
                                    while (i10 < c17895Arr2.length) {
                                        C17895 c178952 = c17895Arr2[i10];
                                        if (c178952 != null) {
                                            int i11 = c178952.f54641;
                                            int i12 = c178952.f54644;
                                            int i13 = c178952.f54645;
                                            int i14 = c178952.f54643;
                                            if (i14 != c178952.f54642 || ((i13 & 1) == i9 && (i11 >= 0 || i12 >= 0))) {
                                                j = j5;
                                                i9 = 1;
                                                i4 = Integer.MIN_VALUE;
                                                break;
                                            }
                                            j2 = j5;
                                            j6 = (i11 << 48) + (i12 << 32) + (i14 << 16) + i13 + j6;
                                        } else {
                                            j2 = j5;
                                        }
                                        i10++;
                                        i9 = 1;
                                        j5 = j2;
                                    }
                                }
                                j = j5;
                                i4 = Integer.MIN_VALUE;
                                i9 = 0;
                            }
                            i5 = this.f52705;
                            if ((i5 & i4) != 0) {
                                break;
                            }
                            if (i9 != 0) {
                                return false;
                            }
                            if (this.f52701 != c17895Arr2) {
                                j5 = j;
                            } else {
                                if (j == j6) {
                                    break;
                                }
                                j5 = j6;
                            }
                            i9 = 1;
                            i7 = i5;
                            i8 = 65535;
                        }
                        i3 = i5;
                    }
                    if ((i3 & i4) == 0) {
                        f52696.compareAndSwapInt(this, f52694, i3, i3 | i4);
                    }
                }
            } else {
                if (!z2 || this == f52695) {
                    return false;
                }
                f52696.compareAndSwapInt(this, f52694, i6, i6 | 262144);
            }
        }
    }

    public C17189() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        InterfaceC7808 interfaceC7808 = null;
        try {
            String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
            r0 = property != null ? Integer.parseInt(property) : -1;
            String property2 = System.getProperty("java.util.concurrent.ForkJoinPool.common.threadFactory");
            InterfaceC7808 interfaceC78082 = (InterfaceC7808) (property2 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property2).getConstructor(null).newInstance(null));
            try {
                String property3 = System.getProperty("java.util.concurrent.ForkJoinPool.common.exceptionHandler");
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) (property3 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property3).getConstructor(null).newInstance(null));
            } catch (Exception unused) {
                uncaughtExceptionHandler = null;
            }
            interfaceC7808 = interfaceC78082;
        } catch (Exception unused2) {
            uncaughtExceptionHandler = null;
        }
        if (interfaceC7808 == null) {
            if (System.getSecurityManager() == null) {
                interfaceC7808 = f52693;
            } else {
                interfaceC7808 = new C10840();
            }
        }
        if (r0 < 0 && (r0 = Runtime.getRuntime().availableProcessors() - 1) <= 0) {
            r0 = 1;
        }
        r0 = r0 > 32767 ? EnumC5983.f18409 : r0;
        long j = -r0;
        long j2 = ((j << 48) & (-281474976710656L)) | ((j << 32) & 281470681743360L);
        int i = ((1 - r0) & 65535) | (f52690 << 16);
        int i2 = r0 > 1 ? r0 - 1 : 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        this.f52703 = "FJPool.commonPool-worker-";
        this.f52701 = new C17895[((i6 | (i6 >>> 16)) + 1) << 1];
        this.f52706 = interfaceC7808;
        this.f52702 = uncaughtExceptionHandler;
        this.f52699 = 60000L;
        this.f52707 = i;
        this.f52705 = r0;
        this.f52708 = j2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        RunnableFutureC14366 runnableFutureC14366 = new RunnableFutureC14366(callable);
        m40433(runnableFutureC14366);
        return runnableFutureC14366;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        RunnableFutureC23539 runnableFutureC23539 = new RunnableFutureC23539(runnable, obj);
        m40433(runnableFutureC23539);
        return runnableFutureC23539;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                RunnableFutureC14366 runnableFutureC14366 = new RunnableFutureC14366((Callable) it.next());
                arrayList.add(runnableFutureC14366);
                m40433(runnableFutureC14366);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractFutureC8723) arrayList.get(i)).m22556();
            }
            return arrayList;
        } catch (Throwable th) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((Future) arrayList.get(i2)).cancel(false);
            }
            throw th;
        }
    }

    public final String toString() {
        int i;
        long j;
        Thread.State state;
        long j2 = this.f52704;
        C17895[] c17895Arr = this.f52701;
        long j3 = 0;
        if (c17895Arr != null) {
            j = 0;
            i = 0;
            for (int i2 = 0; i2 < c17895Arr.length; i2++) {
                C17895 c17895 = c17895Arr[i2];
                if (c17895 != null) {
                    int i3 = c17895.f54643 - c17895.f54642;
                    int i4 = i3 >= 0 ? 0 : -i3;
                    if ((i2 & 1) == 0) {
                        j += i4;
                    } else {
                        j3 += i4;
                        j2 += c17895.f54647 & 4294967295L;
                        C3784 c3784 = c17895.f54646;
                        if (c3784 != null && (state = c3784.getState()) != Thread.State.BLOCKED && state != Thread.State.WAITING && state != Thread.State.TIMED_WAITING) {
                            i++;
                        }
                    }
                }
            }
        } else {
            i = 0;
            j = 0;
        }
        int i5 = this.f52705;
        int i6 = 65535 & i5;
        int i7 = ((short) (r10 >>> 32)) + i6;
        int i8 = ((int) (this.f52708 >> 48)) + i6;
        int i9 = i8 >= 0 ? i8 : 0;
        String str = (524288 & i5) != 0 ? "Terminated" : (Integer.MIN_VALUE & i5) != 0 ? "Terminating" : (i5 & 262144) != 0 ? "Shutting down" : "Running";
        StringBuilder sb = new StringBuilder();
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, super.toString(), "[", str, ", parallelism = ");
        C5834.m16344(sb, i6, ", size = ", i7, ", active = ");
        C5834.m16344(sb, i9, ", running = ", i, ", steals = ");
        sb.append(j2);
        sb.append(", tasks = ");
        sb.append(j3);
        sb.append(", submissions = ");
        return C15942.m37718(sb, j, "]");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return (this.f52705 & 524288) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return (this.f52705 & 262144) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        r10 = false;
     */
    @Override // java.util.concurrent.ExecutorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean awaitTermination(long r10, java.util.concurrent.TimeUnit r12) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17189.awaitTermination(long, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40430(C19098 c19098) {
        C3784 c3784;
        C17189 c17189;
        C17895 c17895;
        long j = c19098.f60138;
        long j2 = f52691;
        Thread currentThread = Thread.currentThread();
        if ((currentThread instanceof C3784) && (c17189 = (c3784 = (C3784) currentThread).f11955) != null && (c17895 = c3784.f11956) != null) {
            while (!c19098.m43985()) {
                int m40435 = c17189.m40435(c17895);
                if (m40435 != 0) {
                    try {
                        if (!c19098.m43985()) {
                            while (!c19098.m43985()) {
                                if (j == 0) {
                                    LockSupport.park(c19098);
                                } else {
                                    LockSupport.parkNanos(c19098, c19098.f60141);
                                }
                            }
                        }
                        return;
                    } finally {
                        m40428(c17189, j2, m40435 > 0 ? 281474976710656L : 0L);
                    }
                }
            }
            return;
        }
        if (c19098.m43985()) {
            return;
        }
        while (!c19098.m43985()) {
            if (j == 0) {
                LockSupport.park(c19098);
            } else {
                LockSupport.parkNanos(c19098, c19098.f60141);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[LOOP:0: B:9:0x002f->B:29:0x002f, LOOP_START] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m40429(java.util.concurrent.Executor r9, l.C19098 r10) {
        /*
            boolean r0 = r9 instanceof l.C17189
            if (r0 == 0) goto L75
            l.ܿۜ᩵ r9 = (l.C17189) r9
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof l.C3784
            if (r1 == 0) goto L17
            l.ۘۜ᩵ r0 = (l.C3784) r0
            l.ܿۜ᩵ r1 = r0.f11955
            if (r1 != r9) goto L17
            l.ᩳۜ᩵ r9 = r0.f11956
            goto L2d
        L17:
            int r0 = l.C5195.m14963()
            if (r0 == 0) goto L2c
            l.ᩳۜ᩵[] r9 = r9.f52701
            if (r9 == 0) goto L2c
            int r1 = r9.length
            if (r1 <= 0) goto L2c
            int r1 = r1 + (-1)
            r0 = r0 & r1
            r0 = r0 & 126(0x7e, float:1.77E-43)
            r9 = r9[r0]
            goto L2d
        L2c:
            r9 = 0
        L2d:
            if (r9 == 0) goto L75
        L2f:
            int r0 = r9.f54643
            int r1 = r9.f54642
            l.ۡۜ᩵[] r2 = r9.f54640
            if (r2 == 0) goto L75
            int r1 = r0 - r1
            if (r1 >= 0) goto L75
            int r3 = r2.length
            if (r3 <= 0) goto L75
            int r3 = r3 + (-1)
            r3 = r3 & r0
            long r3 = (long) r3
            int r5 = l.C17189.f52692
            long r3 = r3 << r5
            int r5 = l.C17189.f52697
            long r5 = (long) r5
            long r3 = r3 + r5
            sun.misc.Unsafe r5 = l.C17189.f52696
            java.lang.Object r6 = r5.getObjectVolatile(r2, r3)
            l.ۡۜ᩵ r6 = (l.AbstractFutureC8723) r6
            boolean r7 = r10.m43985()
            if (r7 == 0) goto L58
            goto L75
        L58:
            int r7 = r0 + 1
            int r8 = r9.f54643
            if (r0 != r8) goto L2f
            if (r6 != 0) goto L64
            r0 = -1
            if (r1 != r0) goto L2f
            goto L75
        L64:
            boolean r0 = r6 instanceof l.InterfaceC9926
            if (r0 != 0) goto L69
            goto L75
        L69:
            boolean r0 = l.C6397.m17724(r5, r2, r3, r6)
            if (r0 == 0) goto L2f
            r9.f54643 = r7
            r6.m22555()
            goto L2f
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17189.m40429(java.util.concurrent.Executor, l.ᩴ᩻᩵):void");
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC23539(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC14366(callable);
    }

    static {
        Unsafe unsafe = C0961.f3616;
        f52696 = unsafe;
        try {
            f52691 = unsafe.objectFieldOffset(C17189.class.getDeclaredField("᩹"));
            f52694 = unsafe.objectFieldOffset(C17189.class.getDeclaredField("۬"));
            f52697 = unsafe.arrayBaseOffset(AbstractFutureC8723[].class);
            int arrayIndexScale = unsafe.arrayIndexScale(AbstractFutureC8723[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            f52692 = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
            int i = 256;
            try {
                String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.maximumSpares");
                if (property != null) {
                    i = Integer.parseInt(property);
                }
            } catch (Exception unused) {
            }
            f52690 = i;
            f52693 = new C14157();
            f52698 = new RuntimePermission("modifyThread");
            C17189 c17189 = (C17189) AccessController.doPrivileged(new C12042());
            f52695 = c17189;
            f52689 = Math.max(c17189.f52705 & 65535, 1);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
