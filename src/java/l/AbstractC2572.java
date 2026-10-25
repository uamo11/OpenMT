package l;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: O7SL */
/* renamed from: l.ۖܰܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2572 extends AbstractC23032 implements InterfaceFutureC3277 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final boolean f8124;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14565 f8125;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C15976 f8128;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C11039 f8129;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Object f8130;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Object f8127 = new Object();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C4688 f8126 = new C4688(AbstractC17388.class);

    @Override // java.util.concurrent.Future
    public Object get() {
        return m8130();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8129(C11039 c11039, C11039 c110392) {
        return f8125.mo18451(this, c11039, c110392);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return m8127(j, timeUnit);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11039 m8128(C11039 c11039) {
        return f8125.mo18446(this, c11039);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8126(AbstractC2572 abstractC2572, Object obj, Object obj2) {
        return f8125.mo18450(abstractC2572, obj, obj2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m8127(long j, TimeUnit timeUnit) {
        C15976 c15976 = C15976.f49301;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8130;
        if ((obj != null) && (!(obj instanceof RunnableC14131))) {
            return AbstractC17388.m40739(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C15976 c159762 = this.f8128;
            if (c159762 != c15976) {
                C15976 c159763 = new C15976();
                do {
                    m8125(c159763, c159762);
                    if (f8125.mo18452(this, c159762, c159763)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m8123(c159763);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8130;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC14131))) {
                                return AbstractC17388.m40739(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m8123(c159763);
                    } else {
                        c159762 = this.f8128;
                    }
                } while (c159762 != c15976);
            }
            Object obj3 = this.f8130;
            C11003.requireNonNull(obj3);
            return AbstractC17388.m40739(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f8130;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC14131))) {
                return AbstractC17388.m40739(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj5 = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        StringBuilder m31106 = C12803.m31106("Waited ", " ", j);
        m31106.append(timeUnit.toString().toLowerCase(locale));
        String sb = m31106.toString();
        if (nanos + 1000 < 0) {
            String m37867 = C16014.m37867(sb, " (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = m37867 + convert + " " + lowerCase;
                if (z) {
                    str = C16014.m37867(str, ",");
                }
                m37867 = C16014.m37867(str, " ");
            }
            if (z) {
                m37867 = m37867 + nanos2 + " nanoseconds ";
            }
            sb = C16014.m37867(m37867, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C16014.m37867(sb, " but future completed as timeout expired"));
        }
        throw new TimeoutException(C22870.m50967(sb, " for ", obj5));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m8130() {
        Object obj;
        C15976 c15976 = C15976.f49301;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f8130;
        if ((obj2 != null) & (!(obj2 instanceof RunnableC14131))) {
            return AbstractC17388.m40739(obj2);
        }
        C15976 c159762 = this.f8128;
        if (c159762 != c15976) {
            C15976 c159763 = new C15976();
            do {
                m8125(c159763, c159762);
                if (!f8125.mo18452(this, c159762, c159763)) {
                    c159762 = this.f8128;
                } else {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m8123(c159763);
                            throw new InterruptedException();
                        }
                        obj = this.f8130;
                    } while (!((obj != null) & (!(obj instanceof RunnableC14131))));
                    return AbstractC17388.m40739(obj);
                }
            } while (c159762 != c15976);
        }
        Object obj3 = this.f8130;
        C11003.requireNonNull(obj3);
        return AbstractC17388.m40739(obj3);
    }

    static {
        boolean z;
        AbstractC14565 c6805;
        Throwable th;
        AbstractC14565 abstractC14565;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f8124 = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e = null;
        if (property == null || property.contains("Android")) {
            try {
                abstractC14565 = new C8922();
            } catch (Error | Exception e2) {
                try {
                    c6805 = new C23738();
                } catch (Error | Exception e3) {
                    e = e3;
                    c6805 = new C6805();
                }
                AbstractC14565 abstractC145652 = c6805;
                th = e2;
                abstractC14565 = abstractC145652;
            }
        } else {
            try {
                abstractC14565 = new C23738();
            } catch (NoClassDefFoundError unused2) {
                abstractC14565 = new C6805();
            }
        }
        th = null;
        f8125 = abstractC14565;
        if (e != null) {
            C4688 c4688 = f8126;
            Logger m13744 = c4688.m13744();
            Level level = Level.SEVERE;
            m13744.log(level, "UnsafeAtomicHelper is broken!", th);
            c4688.m13744().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8124(C15976 c15976, Thread thread) {
        f8125.mo18448(c15976, thread);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8125(C15976 c15976, C15976 c159762) {
        f8125.mo18449(c15976, c159762);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8131() {
        for (C15976 mo18447 = f8125.mo18447(this); mo18447 != null; mo18447 = mo18447.f49302) {
            Thread thread = mo18447.f49303;
            if (thread != null) {
                mo18447.f49303 = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8123(C15976 c15976) {
        c15976.f49303 = null;
        while (true) {
            C15976 c159762 = this.f8128;
            if (c159762 == C15976.f49301) {
                return;
            }
            C15976 c159763 = null;
            while (c159762 != null) {
                C15976 c159764 = c159762.f49302;
                if (c159762.f49303 != null) {
                    c159763 = c159762;
                } else if (c159763 == null) {
                    if (!f8125.mo18452(this, c159762, c159764)) {
                        break;
                    }
                } else {
                    c159763.f49302 = c159764;
                    if (c159763.f49303 == null) {
                        break;
                    }
                }
                c159762 = c159764;
            }
            return;
        }
    }
}
