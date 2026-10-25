package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiConsumer;

/* compiled from: 6AIE */
/* renamed from: l.᩵ۘ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19207 extends AbstractC1567 implements Closeable {

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public Object f60460;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f60461;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public volatile int f60462;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public Iterator f60463;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f60464;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f60465;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2938 f60466;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public volatile int f60467;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f60468;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public volatile int f60469;

    public C19207(AbstractC2938 abstractC2938, C6127 c6127) {
        super(c6127, "pool");
        this.f60469 = 8;
        this.f60462 = 0;
        this.f60467 = 8;
        this.f60464 = new ConcurrentMapC10942();
        this.f60465 = new ArrayList();
        this.f60468 = new ReentrantReadWriteLock(true);
        this.f60461 = new AtomicInteger(0);
        this.f60466 = abstractC2938;
        m5367(c6127);
        this.f60469 = c6127.m1265();
        this.f60467 = c6127.m1262();
        m5365(-1);
        this.f60462 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44275(Object obj, InterfaceC9994 interfaceC9994) {
        if (interfaceC9994 != null) {
            this.f60466.getClass();
            C19913 m43005 = ((C18501) this.f60464.get(obj)).m43005();
            if (m5372()) {
                m43005.addFirst(interfaceC9994);
            } else {
                m43005.addLast(interfaceC9994);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m44286(Object obj) {
        boolean z;
        long millis = m5371().toMillis();
        AbstractC2938 abstractC2938 = this.f60466;
        if (!this.f5537) {
            boolean m5377 = m5377();
            long currentTimeMillis = System.currentTimeMillis();
            C18501 m44282 = m44282(obj);
            do {
                InterfaceC9994 interfaceC9994 = null;
                while (interfaceC9994 == null) {
                    try {
                        interfaceC9994 = (InterfaceC9994) m44282.m43005().pollFirst();
                        boolean z2 = false;
                        z = interfaceC9994 == null && (interfaceC9994 = m44281(obj)) != null;
                        if (m5377) {
                            if (interfaceC9994 == null) {
                                if (millis < 0) {
                                    interfaceC9994 = (InterfaceC9994) m44282.m43005().m45818();
                                } else {
                                    C19913 m43005 = m44282.m43005();
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    interfaceC9994 = (InterfaceC9994) m43005.m45815(millis);
                                }
                            }
                            if (interfaceC9994 == null) {
                                throw new NoSuchElementException("Timeout waiting for idle object, borrowMaxWaitMillis=" + millis);
                            }
                        } else if (interfaceC9994 == null) {
                            throw new NoSuchElementException("Pool exhausted");
                        }
                        if (!interfaceC9994.mo25156()) {
                            interfaceC9994 = null;
                        }
                        if (interfaceC9994 != null) {
                            try {
                                abstractC2938.getClass();
                            } catch (Exception e) {
                                try {
                                    EnumC12110 enumC12110 = EnumC12110.NORMAL;
                                    m44277(obj, interfaceC9994, true);
                                } catch (Exception unused) {
                                }
                                if (z) {
                                    NoSuchElementException noSuchElementException = new NoSuchElementException("Unable to activate object");
                                    noSuchElementException.initCause(e);
                                    throw noSuchElementException;
                                }
                                interfaceC9994 = null;
                            }
                            if (interfaceC9994 != null && m5380()) {
                                try {
                                    z2 = abstractC2938.mo8961(obj, interfaceC9994);
                                    th = null;
                                } catch (Throwable th) {
                                    th = th;
                                    if (th instanceof ThreadDeath) {
                                        throw ((ThreadDeath) th);
                                    }
                                    if (th instanceof VirtualMachineError) {
                                        throw ((VirtualMachineError) th);
                                    }
                                }
                                if (!z2) {
                                    try {
                                        EnumC12110 enumC121102 = EnumC12110.NORMAL;
                                        m44277(obj, interfaceC9994, true);
                                        this.f5545.incrementAndGet();
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        m44280(obj);
                        throw th2;
                    }
                }
                m44280(obj);
                m5368(interfaceC9994, C2828.ofMillis(System.currentTimeMillis() - currentTimeMillis));
                return interfaceC9994.mo25153();
            } while (!z);
            NoSuchElementException noSuchElementException2 = new NoSuchElementException("Unable to validate object");
            noSuchElementException2.initCause(th);
            throw noSuchElementException2;
        }
        throw new IllegalStateException("Pool not open");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44288(Object obj) {
        try {
            C19913 m43005 = m44282(obj).m43005();
            for (InterfaceC9994 interfaceC9994 = (InterfaceC9994) m43005.pollFirst(); interfaceC9994 != null; interfaceC9994 = (InterfaceC9994) m43005.pollFirst()) {
                try {
                    EnumC12110 enumC12110 = EnumC12110.NORMAL;
                    m44277(obj, interfaceC9994, true);
                } catch (Exception unused) {
                }
            }
        } finally {
            m44280(obj);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44276(TreeMap treeMap, Object obj, C18501 c18501) {
        if (c18501 != null) {
            C19846.forEach(c18501.m43005(), new C8645(1, treeMap, obj));
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m44280(Object obj) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f60464;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f60468;
        Lock readLock = reentrantReadWriteLock.readLock();
        try {
            readLock.lock();
            C18501 c18501 = (C18501) concurrentMapC10942.get(obj);
            if (c18501.m43006().decrementAndGet() == 0 && c18501.m43004().get() == 0) {
                readLock.unlock();
                readLock = reentrantReadWriteLock.writeLock();
                readLock.lock();
                if (c18501.m43004().get() == 0 && c18501.m43006().get() == 0) {
                    concurrentMapC10942.remove(obj);
                    this.f60465.remove(obj);
                }
            }
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m44277(Object obj, InterfaceC9994 interfaceC9994, boolean z) {
        boolean equals;
        C18501 m44282 = m44282(obj);
        try {
            synchronized (interfaceC9994) {
                equals = interfaceC9994.getState().equals(EnumC5760.IDLE);
                if (equals || z) {
                    equals = m44282.m43005().removeFirstOccurrence(interfaceC9994);
                }
            }
            if (equals || z) {
                m44282.m43003().remove(new C13520(interfaceC9994.mo25153()));
                interfaceC9994.invalidate();
                try {
                    this.f60466.mo8959(obj, interfaceC9994);
                    m44280(obj);
                    return true;
                } finally {
                    m44282.m43004().decrementAndGet();
                    this.f5547.incrementAndGet();
                    this.f60461.decrementAndGet();
                }
            }
            m44280(obj);
            return false;
        } catch (Throwable th) {
            m44280(obj);
            throw th;
        }
    }

    @Override // l.AbstractC1567
    /* renamed from: ֫ */
    public final void mo5364() {
        ConcurrentMapC10942 concurrentMapC10942 = this.f60464;
        int i = this.f60469;
        if (this.f60462 <= i) {
            i = this.f60462;
        }
        if (i < 1) {
            return;
        }
        for (Object obj : concurrentMapC10942.keySet()) {
            C18501 c18501 = (C18501) concurrentMapC10942.get(obj);
            int m44274 = m44274(c18501);
            for (int i2 = 0; i2 < m44274 && m44274(c18501) > 0; i2++) {
                m44283(obj);
                if (c18501 == null) {
                    c18501 = (C18501) concurrentMapC10942.get(obj);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m44274(C18501 c18501) {
        if (c18501 != null) {
            int m5369 = m5369();
            int i = this.f60467;
            int i2 = this.f60469;
            if (this.f60462 <= i2) {
                i2 = this.f60462;
            }
            int size = i2 - c18501.m43005().size();
            if (i > 0) {
                size = Math.min(size, Math.max(0, i - c18501.m43005().size()));
            }
            return m5369 > 0 ? Math.min(size, Math.max(0, (m5369 - (this.f60461.get() - m44285())) - m44285())) : size;
        }
        int i3 = this.f60469;
        return this.f60462 > i3 ? i3 : this.f60462;
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m44278() {
        int i = this.f60467;
        C19913 c19913 = null;
        Object obj = null;
        int i2 = 0;
        for (Map.Entry entry : this.f60464.entrySet()) {
            Object key = entry.getKey();
            C18501 c18501 = (C18501) entry.getValue();
            if (c18501 != null) {
                C19913 m43005 = c18501.m43005();
                int m45816 = m43005.m45816();
                C18501 c185012 = (C18501) this.f60464.get(key);
                if ((c185012 != null ? c185012.m43003().size() - c185012.m43005().size() : 0) < i && m45816 > i2) {
                    c19913 = m43005;
                    obj = key;
                    i2 = m45816;
                }
            }
        }
        if (c19913 != null) {
            m44282(obj);
            try {
                InterfaceC9994 m44281 = m44281(obj);
                if (m44281 != null) {
                    m44275(obj, m44281);
                }
            } catch (Exception unused) {
            } finally {
                m44280(obj);
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private InterfaceC9994 m44281(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        long j;
        Object obj7;
        boolean z;
        int i = this.f60467;
        int i2 = i < 0 ? Integer.MAX_VALUE : i;
        int m5369 = m5369();
        C18501 c18501 = (C18501) this.f60464.get(obj);
        boolean z2 = true;
        while (z2) {
            int incrementAndGet = this.f60461.incrementAndGet();
            if (m5369 <= -1 || incrementAndGet <= m5369) {
                z2 = false;
            } else {
                this.f60461.decrementAndGet();
                if (m44285() == 0) {
                    return null;
                }
                final TreeMap treeMap = new TreeMap();
                C17997.forEach(this.f60464, new BiConsumer() { // from class: l.ܺۘ֡
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj8, Object obj9) {
                        C19207.m44276(treeMap, obj8, (C18501) obj9);
                    }

                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C17873.$default$andThen(this, biConsumer);
                    }
                });
                int size = ((int) (treeMap.size() * 0.15d)) + 1;
                Iterator it = treeMap.entrySet().iterator();
                while (it.hasNext() && size > 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object value = entry.getValue();
                    InterfaceC9994 interfaceC9994 = (InterfaceC9994) entry.getKey();
                    try {
                        EnumC12110 enumC12110 = EnumC12110.NORMAL;
                        z = m44277(value, interfaceC9994, false);
                    } catch (Exception unused) {
                        z = true;
                    }
                    if (z) {
                        size--;
                    }
                }
            }
        }
        Boolean bool = null;
        while (bool == null) {
            obj6 = c18501.f57341;
            synchronized (obj6) {
                if (c18501.m43004().incrementAndGet() > i2) {
                    c18501.m43004().decrementAndGet();
                    j = c18501.f57342;
                    if (j == 0) {
                        bool = Boolean.FALSE;
                    } else {
                        obj7 = c18501.f57341;
                        obj7.wait();
                    }
                } else {
                    C18501.m43000(c18501);
                    bool = Boolean.TRUE;
                }
            }
        }
        if (!bool.booleanValue()) {
            this.f60461.decrementAndGet();
            return null;
        }
        try {
            try {
                AbstractC2938 abstractC2938 = this.f60466;
                InterfaceC9994 mo8960 = abstractC2938.mo8960(abstractC2938.mo8958(obj));
                obj4 = c18501.f57341;
                synchronized (obj4) {
                    C18501.m43002(c18501);
                    obj5 = c18501.f57341;
                    obj5.notifyAll();
                }
                this.f5549.incrementAndGet();
                c18501.m43003().put(new C13520(((C16383) mo8960).mo25153()), mo8960);
                return mo8960;
            } catch (Exception e) {
                this.f60461.decrementAndGet();
                c18501.m43004().decrementAndGet();
                throw e;
            }
        } catch (Throwable th) {
            obj2 = c18501.f57341;
            synchronized (obj2) {
                C18501.m43002(c18501);
                obj3 = c18501.f57341;
                obj3.notifyAll();
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5537) {
            return;
        }
        synchronized (this.f5539) {
            if (this.f5537) {
                return;
            }
            m5366(C2828.ofMillis(-1L));
            this.f5537 = true;
            C19846.forEach(this.f60464.keySet(), new C18084(1, this));
            m5370();
            C19846.forEach(this.f60464.values(), new C3684());
            C19846.forEach(this.f60464.keySet(), new C18084(1, this));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44283(Object obj) {
        if (!this.f5537) {
            m44282(obj);
            try {
                m44275(obj, m44281(obj));
                return;
            } finally {
                m44280(obj);
            }
        }
        throw new IllegalStateException("Pool not open");
    }

    @Override // l.AbstractC1567
    /* renamed from: ܽ */
    public final void mo5376() {
        int ceil;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f5537) {
            throw new IllegalStateException("Pool not open");
        }
        if (m44285() > 0) {
            InterfaceC17089 m5374 = m5374();
            synchronized (this.f5542) {
                C2828 m5378 = m5378();
                C2828 m5375 = m5375();
                int i = this.f60469;
                if (this.f60462 <= i) {
                    i = this.f60462;
                }
                C17795 c17795 = new C17795(m5378, m5375, i);
                boolean m5379 = m5379();
                int m44285 = m44285();
                int m5363 = m5363();
                if (m5363 >= 0) {
                    ceil = Math.min(m5363, m44285);
                } else {
                    ceil = (int) Math.ceil(m44285 / Math.abs(m5363));
                }
                int i2 = 0;
                while (i2 < ceil) {
                    C11405 c11405 = this.f5550;
                    Object th = null;
                    if (c11405 == null || !c11405.hasNext()) {
                        Iterator it = this.f60463;
                        if (it == null || !it.hasNext()) {
                            ArrayList arrayList = new ArrayList();
                            Lock readLock = this.f60468.readLock();
                            readLock.lock();
                            try {
                                arrayList.addAll(this.f60465);
                                readLock.unlock();
                                this.f60463 = arrayList.iterator();
                            } catch (Throwable th2) {
                                readLock.unlock();
                                throw th2;
                            }
                        }
                        while (this.f60463.hasNext()) {
                            Object next = this.f60463.next();
                            this.f60460 = next;
                            C18501 c18501 = (C18501) this.f60464.get(next);
                            if (c18501 != null) {
                                C11405 c114052 = new C11405(this, c18501.m43005());
                                this.f5550 = c114052;
                                if (c114052.hasNext()) {
                                    break;
                                } else {
                                    this.f5550 = null;
                                }
                            }
                        }
                    }
                    C11405 c114053 = this.f5550;
                    if (c114053 == null) {
                        return;
                    }
                    try {
                        InterfaceC9994 next2 = c114053.next();
                        Deque m28165 = this.f5550.m28165();
                        if (next2.mo25152()) {
                            try {
                                z = m5374.mo26941(c17795, next2, ((C18501) this.f60464.get(this.f60460)).m43005().size());
                            } catch (Throwable th3) {
                                if (th3 instanceof ThreadDeath) {
                                    throw ((ThreadDeath) th3);
                                }
                                if (!(th3 instanceof VirtualMachineError)) {
                                    new Exception(th3);
                                    z = false;
                                } else {
                                    throw ((VirtualMachineError) th3);
                                }
                            }
                            if (z) {
                                Object obj = this.f60460;
                                EnumC12110 enumC12110 = EnumC12110.NORMAL;
                                m44277(obj, next2, true);
                                this.f5540.incrementAndGet();
                            } else {
                                if (m5379) {
                                    try {
                                        this.f60466.getClass();
                                        z2 = true;
                                    } catch (Exception unused) {
                                        Object obj2 = this.f60460;
                                        EnumC12110 enumC121102 = EnumC12110.NORMAL;
                                        m44277(obj2, next2, true);
                                        this.f5540.incrementAndGet();
                                        z2 = false;
                                    }
                                    if (z2) {
                                        try {
                                            z3 = this.f60466.mo8961(this.f60460, next2);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (th instanceof ThreadDeath) {
                                                throw ((ThreadDeath) th);
                                            }
                                            if (th instanceof VirtualMachineError) {
                                                throw ((VirtualMachineError) th);
                                            }
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            Object obj3 = this.f60460;
                                            EnumC12110 enumC121103 = EnumC12110.NORMAL;
                                            m44277(obj3, next2, true);
                                            this.f5540.incrementAndGet();
                                            if (th != null) {
                                                if (th instanceof RuntimeException) {
                                                    throw ((RuntimeException) th);
                                                }
                                                throw ((Error) th);
                                            }
                                        } else {
                                            try {
                                                this.f60466.getClass();
                                            } catch (Exception unused2) {
                                                Object obj4 = this.f60460;
                                                EnumC12110 enumC121104 = EnumC12110.NORMAL;
                                                m44277(obj4, next2, true);
                                                this.f5540.incrementAndGet();
                                            }
                                        }
                                    }
                                }
                                next2.mo25151(m28165);
                            }
                        } else {
                            i2--;
                        }
                    } catch (NoSuchElementException unused3) {
                        i2--;
                        this.f5550 = null;
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44285() {
        return C5378.stream(this.f60464.values()).mapToInt(new C8623()).sum();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m44289(Object obj) {
        C18501 c18501 = (C18501) this.f60464.get(obj);
        if (c18501 != null) {
            return c18501.m43005().size();
        }
        return 0;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m44279() {
        return C5378.stream(this.f60464.values()).anyMatch(new C2273());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44284(Object obj, Object obj2) {
        C19913 c19913;
        C18501 c18501 = (C18501) this.f60464.get(obj);
        InterfaceC9994 interfaceC9994 = (InterfaceC9994) c18501.m43003().get(new C13520(obj2));
        if (interfaceC9994 == null) {
            throw new IllegalStateException("Object not currently part of this pool");
        }
        synchronized (interfaceC9994) {
            if (interfaceC9994.getState() != EnumC5760.INVALID) {
                m44277(obj, interfaceC9994, true);
            }
        }
        c19913 = c18501.f57340;
        if (c19913.m45817()) {
            m44283(obj);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C18501 m44282(Object obj) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f60464;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f60468;
        Lock readLock = reentrantReadWriteLock.readLock();
        try {
            readLock.lock();
            C18501 c18501 = (C18501) concurrentMapC10942.get(obj);
            if (c18501 == null) {
                readLock.unlock();
                readLock = reentrantReadWriteLock.writeLock();
                readLock.lock();
                c18501 = (C18501) concurrentMapC10942.get(obj);
                if (c18501 == null) {
                    c18501 = new C18501();
                    c18501.m43006().incrementAndGet();
                    concurrentMapC10942.put(obj, c18501);
                    this.f60465.add(obj);
                } else {
                    c18501.m43006().incrementAndGet();
                }
            } else {
                c18501.m43006().incrementAndGet();
            }
            return c18501;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:17|(8:24|(1:26)(1:36)|27|(1:29)|30|(1:32)|33|34)|37|38|30|(0)|33|34) */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m44287(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            l.ۧۤᩴ r0 = r5.f60464
            java.lang.Object r0 = r0.get(r6)
            r1 = r0
            l.ᩴۘ֡ r1 = (l.C18501) r1
            if (r1 == 0) goto Lc2
            l.ۧۤᩴ r0 = r1.m43003()
            l.ܰۖ֡ r2 = new l.ܰۖ֡
            r2.<init>(r7)
            java.lang.Object r7 = r0.get(r2)
            l.ۤۖ֡ r7 = (l.InterfaceC9994) r7
            if (r7 == 0) goto Lba
            r0 = r7
            monitor-enter(r0)
            l.ۛۖ֡ r2 = r7.getState()     // Catch: java.lang.Throwable -> Lb7
            l.ۛۖ֡ r3 = l.EnumC5760.ALLOCATED     // Catch: java.lang.Throwable -> Lb7
            if (r2 != r3) goto Laf
            r7.mo25158()     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb7
            l.ۖ᩹ᩴ r0 = r7.mo25159()
            r2 = 1
            l.ۗۖ֡ r3 = r5.f60466     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r3.getClass()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            boolean r3 = r7.mo25154()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L77
            int r3 = r5.f60469     // Catch: java.lang.Throwable -> L7f
            l.᩶ۘ֡ r1 = r1.m43005()     // Catch: java.lang.Throwable -> L7f
            boolean r4 = r5.f5537     // Catch: java.lang.Throwable -> L7f
            if (r4 != 0) goto L63
            r4 = -1
            if (r3 <= r4) goto L4e
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L7f
            if (r3 > r4) goto L4e
            goto L63
        L4e:
            boolean r2 = r5.m5372()     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L58
            r1.addFirst(r7)     // Catch: java.lang.Throwable -> L7f
            goto L5b
        L58:
            r1.addLast(r7)     // Catch: java.lang.Throwable -> L7f
        L5b:
            boolean r7 = r5.f5537     // Catch: java.lang.Throwable -> L7f
            if (r7 == 0) goto L6a
            r5.m44288(r6)     // Catch: java.lang.Throwable -> L7f
            goto L6a
        L63:
            l.۫ۖ֡ r1 = l.EnumC12110.NORMAL     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L7f
            r5.m44277(r6, r7, r2)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L7f
            goto L6a
        L69:
        L6a:
            boolean r6 = r5.m44279()
            if (r6 == 0) goto L73
            r5.m44278()
        L73:
            r5.m5373(r0)
            return
        L77:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = "Object has already been returned to this pool"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7f
            throw r6     // Catch: java.lang.Throwable -> L7f
        L7f:
            r6 = move-exception
            goto La2
        L81:
            l.۫ۖ֡ r3 = l.EnumC12110.NORMAL     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L86
            r5.m44277(r6, r7, r2)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L86
        L86:
            l.᩶ۘ֡ r7 = l.C18501.m43001(r1)     // Catch: java.lang.Throwable -> L7f
            boolean r7 = r7.m45817()     // Catch: java.lang.Throwable -> L7f
            if (r7 == 0) goto L95
            r5.m44283(r6)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L94
            goto L95
        L94:
        L95:
            boolean r6 = r5.m44279()
            if (r6 == 0) goto L9e
            r5.m44278()
        L9e:
            r5.m5373(r0)
            return
        La2:
            boolean r7 = r5.m44279()
            if (r7 == 0) goto Lab
            r5.m44278()
        Lab:
            r5.m5373(r0)
            throw r6
        Laf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = "Object has already been returned to this pool or is invalid"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb7
            throw r6     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb7
            throw r6
        Lba:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Returned object not currently part of this pool"
            r6.<init>(r7)
            throw r6
        Lc2:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "No keyed pool found under the given key."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19207.m44287(java.lang.Object, java.lang.Object):void");
    }

    @Override // l.AbstractC1567, l.AbstractC12815
    /* renamed from: ֫ */
    public final void mo1260(StringBuilder sb) {
        super.mo1260(sb);
        sb.append(", maxIdlePerKey=");
        sb.append(this.f60469);
        sb.append(", minIdlePerKey=");
        sb.append(this.f60462);
        sb.append(", maxTotalPerKey=");
        sb.append(this.f60467);
        sb.append(", factory=");
        sb.append(this.f60466);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", poolMap=");
        sb.append(this.f60464);
        sb.append(", poolKeyList=");
        sb.append(this.f60465);
        sb.append(", keyLock=");
        sb.append(this.f60468);
        sb.append(", numTotal=");
        sb.append(this.f60461);
        sb.append(", evictionKeyIterator=");
        sb.append(this.f60463);
        sb.append(", evictionKey=");
        sb.append(this.f60460);
        sb.append(", abandonedConfig=");
        sb.append((Object) null);
    }
}
