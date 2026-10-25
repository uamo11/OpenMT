package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: B3B1 */
/* renamed from: l.ܿܰܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC17388 extends AbstractC2572 {
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo40743() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C23304 c23304;
        Object obj = this.f8130;
        if ((obj == null) | (obj instanceof RunnableC14131)) {
            if (AbstractC2572.f8124) {
                c23304 = new C23304(new CancellationException("Future.cancel() was called."), z);
            } else {
                if (z) {
                    c23304 = C23304.f74916;
                } else {
                    c23304 = C23304.f74915;
                }
                C11003.requireNonNull(c23304);
            }
            while (!AbstractC2572.m8126(this, obj, c23304)) {
                obj = this.f8130;
                if (!(obj instanceof RunnableC14131)) {
                }
            }
            m40738(this, z);
            if (obj instanceof RunnableC14131) {
                throw null;
            }
            return true;
        }
        return false;
    }

    public boolean isCancelled() {
        return this.f8130 instanceof C23304;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof RunnableC14131)) & (this.f8130 != null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m40739(Object obj) {
        if (obj instanceof C23304) {
            Throwable th = ((C23304) obj).f74917;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1866) {
            throw new ExecutionException(((C1866) obj).f6358);
        }
        if (obj == AbstractC2572.f8127) {
            return null;
        }
        return obj;
    }

    @Override // l.InterfaceFutureC3277
    /* renamed from: ֫ */
    public void mo10080(Runnable runnable, Executor executor) {
        C11039 c11039;
        C4025.m12106(executor, "Executor was null.");
        if (!isDone() && (c11039 = this.f8129) != C11039.f33179) {
            C11039 c110392 = new C11039(runnable, executor);
            do {
                c110392.f33181 = c11039;
                if (m8129(c11039, c110392)) {
                    return;
                } else {
                    c11039 = this.f8129;
                }
            } while (c11039 != C11039.f33179);
        }
        m40740(runnable, executor);
    }

    /* renamed from: ֫ */
    public boolean mo26126(Object obj) {
        if (obj == null) {
            obj = AbstractC2572.f8127;
        }
        if (!AbstractC2572.m8126(this, null, obj)) {
            return false;
        }
        m40738(this, false);
        return true;
    }

    /* renamed from: ֫ */
    public boolean mo26127(Throwable th) {
        th.getClass();
        if (!AbstractC2572.m8126(this, null, new C1866(th))) {
            return false;
        }
        m40738(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m40735(InterfaceFutureC3277 interfaceFutureC3277) {
        Object obj;
        Throwable m33215;
        if (interfaceFutureC3277 instanceof InterfaceC16682) {
            Object obj2 = ((AbstractC17388) interfaceFutureC3277).f8130;
            if (obj2 instanceof C23304) {
                C23304 c23304 = (C23304) obj2;
                if (c23304.f74918) {
                    obj2 = c23304.f74917 != null ? new C23304(c23304.f74917, false) : C23304.f74915;
                }
            }
            C11003.requireNonNull(obj2);
            return obj2;
        }
        if ((interfaceFutureC3277 instanceof AbstractC23032) && (m33215 = C13859.m33215((AbstractC23032) interfaceFutureC3277)) != null) {
            return new C1866(m33215);
        }
        boolean isCancelled = interfaceFutureC3277.isCancelled();
        if ((!AbstractC2572.f8124) && isCancelled) {
            C23304 c233042 = C23304.f74915;
            C11003.requireNonNull(c233042);
            return c233042;
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC3277.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e) {
                e = e;
                return new C1866(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new C1866(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC3277, e2));
                }
                return new C23304(e2, false);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    return new C23304(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC3277, e3), false);
                }
                return new C1866(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new C1866(e);
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? AbstractC2572.f8127 : obj;
        }
        return new C23304(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC3277), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40736(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        m40737(sb, obj);
        sb.append("]");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40738(AbstractC17388 abstractC17388, boolean z) {
        abstractC17388.m8131();
        abstractC17388.mo40743();
        C11039 m8128 = abstractC17388.m8128(C11039.f33179);
        C11039 c11039 = null;
        while (m8128 != null) {
            C11039 c110392 = m8128.f33181;
            m8128.f33181 = c11039;
            c11039 = m8128;
            m8128 = c110392;
        }
        while (c11039 != null) {
            C11039 c110393 = c11039.f33181;
            Runnable runnable = c11039.f33182;
            C11003.requireNonNull(runnable);
            if (runnable instanceof RunnableC14131) {
                throw null;
            }
            Executor executor = c11039.f33180;
            C11003.requireNonNull(executor);
            m40740(runnable, executor);
            c11039 = c110393;
        }
    }

    @Override // l.AbstractC23032
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable mo40741() {
        if (!(this instanceof InterfaceC16682)) {
            return null;
        }
        Object obj = this.f8130;
        if (obj instanceof C1866) {
            return ((C1866) obj).f6358;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r3.isEmpty() != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Ld3
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.m40736(r0)
            goto Ld3
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f8130
            boolean r3 = r3 instanceof l.RunnableC14131
            java.lang.String r4 = "Exception thrown from implementation: "
            if (r3 == 0) goto L91
            java.lang.String r3 = ", setFuture=["
            r0.append(r3)
            r3 = 0
            r0.append(r3)     // Catch: java.lang.Throwable -> L76
            goto L8d
        L76:
            r3 = move-exception
            boolean r5 = r3 instanceof java.lang.Error
            if (r5 == 0) goto L83
            boolean r5 = r3 instanceof java.lang.StackOverflowError
            if (r5 == 0) goto L80
            goto L83
        L80:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L83:
            r0.append(r4)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8d:
            r0.append(r2)
            goto Lc3
        L91:
            java.lang.String r3 = r6.mo40742()     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto L9d
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L9f
            if (r4 == 0) goto Lbc
        L9d:
            r3 = 0
            goto Lbc
        L9f:
            r3 = move-exception
            boolean r5 = r3 instanceof java.lang.Error
            if (r5 == 0) goto Lac
            boolean r5 = r3 instanceof java.lang.StackOverflowError
            if (r5 == 0) goto La9
            goto Lac
        La9:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        Lac:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.Class r3 = r3.getClass()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        Lbc:
            if (r3 == 0) goto Lc3
            java.lang.String r4 = ", info=["
            l.C20177.m46410(r0, r4, r3, r2)
        Lc3:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Ld3
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.m40736(r0)
        Ld3:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC17388.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String mo40742() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40737(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40740(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            AbstractC2572.f8126.m13744().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }
}
