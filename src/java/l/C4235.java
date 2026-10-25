package l;

import java.lang.ref.ReferenceQueue;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* compiled from: E3QI */
/* renamed from: l.ۘ᩹ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4235 extends ReentrantLock {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f13731;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f13732;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC14754 f13733;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14796 f13734;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ReferenceQueue f13735;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f13736;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile AtomicReferenceArray f13737;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f13738 = new AtomicInteger();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f13739;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f13740;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ReferenceQueue f13741;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f13742;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f13743;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f13744;

    public C4235(ConcurrentMapC14754 concurrentMapC14754, int i, long j, InterfaceC14796 interfaceC14796) {
        Collection concurrentLinkedQueue;
        Collection collection;
        Collection c20442;
        this.f13733 = concurrentMapC14754;
        this.f13732 = j;
        interfaceC14796.getClass();
        this.f13734 = interfaceC14796;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.f13744 = length;
        if (concurrentMapC14754.f45064 == EnumC16207.INSTANCE && length == j) {
            this.f13744 = length + 1;
        }
        this.f13737 = atomicReferenceArray;
        EnumC1412 enumC1412 = concurrentMapC14754.f45055;
        EnumC1412 enumC14122 = EnumC1412.f5081;
        this.f13741 = enumC1412 != enumC14122 ? new ReferenceQueue() : null;
        this.f13735 = concurrentMapC14754.f45068 != enumC14122 ? new ReferenceQueue() : null;
        if (!concurrentMapC14754.m35064() && !concurrentMapC14754.m35061()) {
            concurrentLinkedQueue = ConcurrentMapC14754.f45045;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f13736 = (AbstractQueue) concurrentLinkedQueue;
        if (!concurrentMapC14754.m35065()) {
            collection = ConcurrentMapC14754.f45045;
        } else {
            collection = new C18283();
        }
        this.f13731 = (AbstractQueue) collection;
        if (!concurrentMapC14754.m35064() && !concurrentMapC14754.m35061()) {
            c20442 = ConcurrentMapC14754.f45045;
        } else {
            c20442 = new C20442();
        }
        this.f13742 = (AbstractQueue) c20442;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 m12741(InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC239272) {
        Object key = interfaceC23927.getKey();
        if (key == null) {
            return null;
        }
        InterfaceC3529 mo17644 = interfaceC23927.mo17644();
        Object obj = mo17644.get();
        if (obj == null && mo17644.mo10725()) {
            return null;
        }
        InterfaceC23927 mo10704 = this.f13733.f45063.mo10704(this, interfaceC23927, interfaceC239272, key);
        mo10704.mo17636(mo17644.mo6743(this.f13735, obj, mo10704));
        return mo10704;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12748(InterfaceC23927 interfaceC23927, Object obj, Object obj2, long j) {
        InterfaceC3529 mo17644 = interfaceC23927.mo17644();
        ConcurrentMapC14754 concurrentMapC14754 = this.f13733;
        int mo25073 = concurrentMapC14754.f45064.mo25073(obj, obj2);
        C4025.m12115("Weights must be non-negative", mo25073 >= 0);
        interfaceC23927.mo17636(concurrentMapC14754.f45068.mo2793(this, interfaceC23927, obj2, mo25073));
        m12743();
        this.f13740 += mo25073;
        if (concurrentMapC14754.m35064()) {
            interfaceC23927.mo17635(j);
        }
        if (concurrentMapC14754.m35065() || concurrentMapC14754.f45058 > 0) {
            interfaceC23927.mo17642(j);
        }
        this.f13742.add(interfaceC23927);
        this.f13731.add(interfaceC23927);
        mo17644.mo10723(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        if (r6 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        r11 = new l.C23990();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if (r10 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        r3 = r17.f13733.f45063;
        r18.getClass();
        r10 = r3.mo10703(r17, r18, r19, r9);
        r10.mo17636(r11);
        r7.set(r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r10.mo17636(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if (r6 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b5, code lost:
    
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        monitor-enter(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        r0 = m12736(r18, r19, r11, r11.m52831(r18, r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        monitor-exit(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        r17.f13734.mo19003();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        return m12739(r10, r18, r13);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12735(java.lang.Object r18, int r19, l.AbstractC19031 r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r17.lock()
            l.ܳ᩶ܺ r3 = r1.f13733     // Catch: java.lang.Throwable -> Ld8
            l.ᩳ᩸ܺ r3 = r3.f45061     // Catch: java.lang.Throwable -> Ld8
            long r3 = r3.mo39766()     // Catch: java.lang.Throwable -> Ld8
            r1.m12752(r3)     // Catch: java.lang.Throwable -> Ld8
            int r5 = r1.f13743     // Catch: java.lang.Throwable -> Ld8
            r6 = 1
            int r5 = r5 - r6
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.f13737     // Catch: java.lang.Throwable -> Ld8
            int r8 = r7.length()     // Catch: java.lang.Throwable -> Ld8
            int r8 = r8 - r6
            r8 = r8 & r2
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> Ld8
            l.᩻᩶ܺ r9 = (l.InterfaceC23927) r9     // Catch: java.lang.Throwable -> Ld8
            r10 = r9
        L27:
            r11 = 0
            if (r10 == 0) goto L8e
            java.lang.Object r12 = r10.getKey()     // Catch: java.lang.Throwable -> Ld8
            int r13 = r10.getHash()     // Catch: java.lang.Throwable -> Ld8
            if (r13 != r2) goto L89
            if (r12 == 0) goto L89
            l.ܳ᩶ܺ r13 = r1.f13733     // Catch: java.lang.Throwable -> Ld8
            l.ۧܶܺ r13 = r13.f45053     // Catch: java.lang.Throwable -> Ld8
            boolean r13 = r13.m27496(r0, r12)     // Catch: java.lang.Throwable -> Ld8
            if (r13 == 0) goto L89
            l.ۗ᩹ܺ r13 = r10.mo17644()     // Catch: java.lang.Throwable -> Ld8
            boolean r14 = r13.mo10724()     // Catch: java.lang.Throwable -> Ld8
            if (r14 == 0) goto L4c
            r6 = 0
            goto L8f
        L4c:
            java.lang.Object r14 = r13.get()     // Catch: java.lang.Throwable -> Ld8
            if (r14 != 0) goto L5c
            int r3 = r13.mo6744()     // Catch: java.lang.Throwable -> Ld8
            l.ۖ᩶ܺ r4 = l.EnumC2761.f8579     // Catch: java.lang.Throwable -> Ld8
            r1.m12746(r12, r14, r3, r4)     // Catch: java.lang.Throwable -> Ld8
            goto L6d
        L5c:
            l.ܳ᩶ܺ r15 = r1.f13733     // Catch: java.lang.Throwable -> Ld8
            boolean r15 = r15.m35062(r10, r3)     // Catch: java.lang.Throwable -> Ld8
            if (r15 == 0) goto L7a
            int r3 = r13.mo6744()     // Catch: java.lang.Throwable -> Ld8
            l.ۖ᩶ܺ r4 = l.EnumC2761.f8577     // Catch: java.lang.Throwable -> Ld8
            r1.m12746(r12, r14, r3, r4)     // Catch: java.lang.Throwable -> Ld8
        L6d:
            java.util.AbstractQueue r3 = r1.f13731     // Catch: java.lang.Throwable -> Ld8
            r3.remove(r10)     // Catch: java.lang.Throwable -> Ld8
            java.util.AbstractQueue r3 = r1.f13742     // Catch: java.lang.Throwable -> Ld8
            r3.remove(r10)     // Catch: java.lang.Throwable -> Ld8
            r1.f13743 = r5     // Catch: java.lang.Throwable -> Ld8
            goto L8f
        L7a:
            r1.m12754(r10, r3)     // Catch: java.lang.Throwable -> Ld8
            l.ܳ᩸ܺ r0 = r1.f13734     // Catch: java.lang.Throwable -> Ld8
            r0.mo19007()     // Catch: java.lang.Throwable -> Ld8
            r17.unlock()
            r17.m12758()
            return r14
        L89:
            l.᩻᩶ܺ r10 = r10.getNext()     // Catch: java.lang.Throwable -> Ld8
            goto L27
        L8e:
            r13 = r11
        L8f:
            if (r6 == 0) goto Lad
            l.᩻᩹ܺ r11 = new l.᩻᩹ܺ     // Catch: java.lang.Throwable -> Ld8
            r11.<init>()     // Catch: java.lang.Throwable -> Ld8
            if (r10 != 0) goto Laa
            l.ܳ᩶ܺ r3 = r1.f13733     // Catch: java.lang.Throwable -> Ld8
            l.ܰ᩸ܺ r3 = r3.f45063     // Catch: java.lang.Throwable -> Ld8
            r18.getClass()     // Catch: java.lang.Throwable -> Ld8
            l.᩻᩶ܺ r10 = r3.mo10703(r1, r0, r2, r9)     // Catch: java.lang.Throwable -> Ld8
            r10.mo17636(r11)     // Catch: java.lang.Throwable -> Ld8
            r7.set(r8, r10)     // Catch: java.lang.Throwable -> Ld8
            goto Lad
        Laa:
            r10.mo17636(r11)     // Catch: java.lang.Throwable -> Ld8
        Lad:
            r17.unlock()
            r17.m12758()
            if (r6 == 0) goto Ld3
            r16 = r10
            monitor-enter(r16)     // Catch: java.lang.Throwable -> Lcc
            r3 = r20
            l.ۗܰܺ r3 = r11.m52831(r0, r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r0 = r1.m12736(r0, r2, r11, r3)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r16)     // Catch: java.lang.Throwable -> Lc9
            l.ܳ᩸ܺ r2 = r1.f13734
            r2.mo19003()
            return r0
        Lc9:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r0 = move-exception
            l.ܳ᩸ܺ r2 = r1.f13734
            r2.mo19003()
            throw r0
        Ld3:
            java.lang.Object r0 = r1.m12739(r10, r0, r13)
            return r0
        Ld8:
            r0 = move-exception
            r17.unlock()
            r17.m12758()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4235.m12735(java.lang.Object, int, l.ᩴ᩸ܺ):java.lang.Object");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12739(InterfaceC23927 interfaceC23927, Object obj, InterfaceC3529 interfaceC3529) {
        InterfaceC14796 interfaceC14796 = this.f13734;
        if (!interfaceC3529.mo10724()) {
            throw new AssertionError();
        }
        C4025.m12114(obj, "Recursive load of: %s", !Thread.holdsLock(interfaceC23927));
        try {
            Object mo10726 = interfaceC3529.mo10726();
            if (mo10726 == null) {
                throw new C4214("CacheLoader returned null for key " + obj + ".");
            }
            m12757(interfaceC23927, this.f13733.f45061.mo39766());
            return mo10726;
        } finally {
            interfaceC14796.mo19003();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12736(Object obj, int i, C23990 c23990, InterfaceFutureC3277 interfaceFutureC3277) {
        Object obj2;
        InterfaceC14796 interfaceC14796 = this.f13734;
        try {
            obj2 = C11744.m28740(interfaceFutureC3277);
            try {
                if (obj2 == null) {
                    throw new C4214("CacheLoader returned null for key " + obj + ".");
                }
                C12491 c12491 = c23990.f77775;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                interfaceC14796.mo19006(c12491.m30656());
                m12745(obj, i, c23990, obj2);
                return obj2;
            } catch (Throwable th) {
                th = th;
                if (obj2 == null) {
                    C12491 c124912 = c23990.f77775;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    interfaceC14796.mo19004(c124912.m30656());
                    lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = this.f13737;
                        int length = (atomicReferenceArray.length() - 1) & i;
                        InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
                        InterfaceC23927 interfaceC239272 = interfaceC23927;
                        while (true) {
                            if (interfaceC239272 == null) {
                                break;
                            }
                            Object key = interfaceC239272.getKey();
                            if (interfaceC239272.getHash() != i || key == null || !this.f13733.f45053.m27496(obj, key)) {
                                interfaceC239272 = interfaceC239272.getNext();
                            } else if (interfaceC239272.mo17644() == c23990) {
                                if (c23990.f77777.mo10725()) {
                                    interfaceC239272.mo17636(c23990.f77777);
                                } else {
                                    atomicReferenceArray.set(length, m12750(interfaceC23927, interfaceC239272));
                                }
                            }
                        }
                    } finally {
                        unlock();
                        m12758();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            obj2 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        unlock();
        m12758();
        r5 = r1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12738(l.InterfaceC23927 r13, final java.lang.Object r14, final int r15, java.lang.Object r16, long r17, l.AbstractC19031 r19) {
        /*
            r12 = this;
            r7 = r12
            r0 = r14
            r4 = r15
            l.ܳ᩶ܺ r1 = r7.f13733
            long r1 = r1.f45058
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le4
            long r1 = r13.mo17639()
            long r1 = r17 - r1
            l.ܳ᩶ܺ r3 = r7.f13733
            long r5 = r3.f45058
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le4
            l.ۗ᩹ܺ r1 = r13.mo17644()
            boolean r1 = r1.mo10724()
            if (r1 != 0) goto Le4
            r12.lock()
            l.ܳ᩶ܺ r1 = r7.f13733     // Catch: java.lang.Throwable -> Ldc
            l.ᩳ᩸ܺ r1 = r1.f45061     // Catch: java.lang.Throwable -> Ldc
            long r1 = r1.mo39766()     // Catch: java.lang.Throwable -> Ldc
            r12.m12752(r1)     // Catch: java.lang.Throwable -> Ldc
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r7.f13737     // Catch: java.lang.Throwable -> Ldc
            int r5 = r3.length()     // Catch: java.lang.Throwable -> Ldc
            int r5 = r5 + (-1)
            r5 = r5 & r4
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> Ldc
            l.᩻᩶ܺ r6 = (l.InterfaceC23927) r6     // Catch: java.lang.Throwable -> Ldc
            r8 = r6
        L43:
            r9 = 0
            if (r8 == 0) goto L90
            java.lang.Object r10 = r8.getKey()     // Catch: java.lang.Throwable -> Ldc
            int r11 = r8.getHash()     // Catch: java.lang.Throwable -> Ldc
            if (r11 != r4) goto L8b
            if (r10 == 0) goto L8b
            l.ܳ᩶ܺ r11 = r7.f13733     // Catch: java.lang.Throwable -> Ldc
            l.ۧܶܺ r11 = r11.f45053     // Catch: java.lang.Throwable -> Ldc
            boolean r10 = r11.m27496(r14, r10)     // Catch: java.lang.Throwable -> Ldc
            if (r10 == 0) goto L8b
            l.ۗ᩹ܺ r3 = r8.mo17644()     // Catch: java.lang.Throwable -> Ldc
            boolean r5 = r3.mo10724()     // Catch: java.lang.Throwable -> Ldc
            if (r5 != 0) goto L83
            long r5 = r8.mo17639()     // Catch: java.lang.Throwable -> Ldc
            long r1 = r1 - r5
            l.ܳ᩶ܺ r5 = r7.f13733     // Catch: java.lang.Throwable -> Ldc
            long r5 = r5.f45058     // Catch: java.lang.Throwable -> Ldc
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 >= 0) goto L74
            goto L83
        L74:
            int r1 = r7.f13739     // Catch: java.lang.Throwable -> Ldc
            int r1 = r1 + 1
            r7.f13739 = r1     // Catch: java.lang.Throwable -> Ldc
            l.᩻᩹ܺ r1 = new l.᩻᩹ܺ     // Catch: java.lang.Throwable -> Ldc
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Ldc
            r8.mo17636(r1)     // Catch: java.lang.Throwable -> Ldc
            goto Lac
        L83:
            r12.unlock()
            r12.m12758()
            r5 = r9
            goto Lb3
        L8b:
            l.᩻᩶ܺ r8 = r8.getNext()     // Catch: java.lang.Throwable -> Ldc
            goto L43
        L90:
            int r1 = r7.f13739     // Catch: java.lang.Throwable -> Ldc
            int r1 = r1 + 1
            r7.f13739 = r1     // Catch: java.lang.Throwable -> Ldc
            l.᩻᩹ܺ r1 = new l.᩻᩹ܺ     // Catch: java.lang.Throwable -> Ldc
            r1.<init>()     // Catch: java.lang.Throwable -> Ldc
            l.ܳ᩶ܺ r2 = r7.f13733     // Catch: java.lang.Throwable -> Ldc
            l.ܰ᩸ܺ r2 = r2.f45063     // Catch: java.lang.Throwable -> Ldc
            r14.getClass()     // Catch: java.lang.Throwable -> Ldc
            l.᩻᩶ܺ r2 = r2.mo10703(r12, r14, r15, r6)     // Catch: java.lang.Throwable -> Ldc
            r2.mo17636(r1)     // Catch: java.lang.Throwable -> Ldc
            r3.set(r5, r2)     // Catch: java.lang.Throwable -> Ldc
        Lac:
            r12.unlock()
            r12.m12758()
            r5 = r1
        Lb3:
            if (r5 != 0) goto Lb6
            goto Ld9
        Lb6:
            r1 = r19
            l.ۗܰܺ r8 = r5.m52831(r14, r1)
            l.ۖ᩹ܺ r10 = new l.ۖ᩹ܺ
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r15
            r6 = r8
            r1.<init>()
            java.util.concurrent.Executor r0 = l.C12449.m30605()
            r8.mo10080(r10, r0)
            boolean r0 = r8.isDone()
            if (r0 == 0) goto Ld9
            java.lang.Object r9 = l.C11744.m28740(r8)     // Catch: java.lang.Throwable -> Ld8
            goto Ld9
        Ld8:
        Ld9:
            if (r9 == 0) goto Le4
            return r9
        Ldc:
            r0 = move-exception
            r12.unlock()
            r12.m12758()
            throw r0
        Le4:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4235.m12738(l.᩻᩶ܺ, java.lang.Object, int, java.lang.Object, long, l.ᩴ᩸ܺ):java.lang.Object");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m12755() {
        if (tryLock()) {
            try {
                m12751();
            } finally {
                unlock();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
    
        if (r0.isHeldByCurrentThread() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
    
        if (r0.isHeldByCurrentThread() == false) goto L47;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12751() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4235.m12751():void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12757(InterfaceC23927 interfaceC23927, long j) {
        if (this.f13733.m35064()) {
            interfaceC23927.mo17635(j);
        }
        this.f13736.add(interfaceC23927);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12754(InterfaceC23927 interfaceC23927, long j) {
        if (this.f13733.m35064()) {
            interfaceC23927.mo17635(j);
        }
        this.f13742.add(interfaceC23927);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12743() {
        while (true) {
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) this.f13736.poll();
            if (interfaceC23927 == null) {
                return;
            }
            AbstractQueue abstractQueue = this.f13742;
            if (abstractQueue.contains(interfaceC23927)) {
                abstractQueue.add(interfaceC23927);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12744(long j) {
        InterfaceC23927 interfaceC23927;
        InterfaceC23927 interfaceC239272;
        m12743();
        do {
            interfaceC23927 = (InterfaceC23927) this.f13731.peek();
            ConcurrentMapC14754 concurrentMapC14754 = this.f13733;
            if (interfaceC23927 == null || !concurrentMapC14754.m35062(interfaceC23927, j)) {
                do {
                    interfaceC239272 = (InterfaceC23927) this.f13742.peek();
                    if (interfaceC239272 == null || !concurrentMapC14754.m35062(interfaceC239272, j)) {
                        return;
                    }
                } while (m12749(interfaceC239272, interfaceC239272.getHash(), EnumC2761.f8577));
                throw new AssertionError();
            }
        } while (m12749(interfaceC23927, interfaceC23927.getHash(), EnumC2761.f8577));
        throw new AssertionError();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12746(Object obj, Object obj2, int i, EnumC2761 enumC2761) {
        this.f13740 -= i;
        if (enumC2761.mo8522()) {
            this.f13734.mo19005();
        }
        ConcurrentMapC14754 concurrentMapC14754 = this.f13733;
        if (concurrentMapC14754.f45047 != ConcurrentMapC14754.f45045) {
            concurrentMapC14754.f45047.offer(new C18989(obj, obj2));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12747(InterfaceC23927 interfaceC23927) {
        if (this.f13733.m35061()) {
            m12743();
            long mo6744 = interfaceC23927.mo17644().mo6744();
            long j = this.f13732;
            if (mo6744 > j && !m12749(interfaceC23927, interfaceC23927.getHash(), EnumC2761.f8576)) {
                throw new AssertionError();
            }
            while (this.f13740 > j) {
                for (InterfaceC23927 interfaceC239272 : this.f13742) {
                    if (interfaceC239272.mo17644().mo6744() > 0) {
                        if (!m12749(interfaceC239272, interfaceC239272.getHash(), EnumC2761.f8576)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 m12740(int i, Object obj) {
        for (InterfaceC23927 interfaceC23927 = (InterfaceC23927) this.f13737.get((r0.length() - 1) & i); interfaceC23927 != null; interfaceC23927 = interfaceC23927.getNext()) {
            if (interfaceC23927.getHash() == i) {
                Object key = interfaceC23927.getKey();
                if (key == null) {
                    m12755();
                } else if (this.f13733.f45053.m27496(obj, key)) {
                    return interfaceC23927;
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12737(InterfaceC23927 interfaceC23927, long j) {
        if (interfaceC23927.getKey() == null) {
            m12755();
            return null;
        }
        Object obj = interfaceC23927.mo17644().get();
        if (obj == null) {
            m12755();
            return null;
        }
        if (!this.f13733.m35062(interfaceC23927, j)) {
            return obj;
        }
        if (!tryLock()) {
            return null;
        }
        try {
            m12744(j);
            return null;
        } finally {
            unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12734(Object obj, int i, Object obj2, boolean z) {
        int i2;
        lock();
        try {
            long mo39766 = this.f13733.f45061.mo39766();
            m12752(mo39766);
            if (this.f13743 + 1 > this.f13744) {
                m12756();
            }
            AtomicReferenceArray atomicReferenceArray = this.f13737;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            InterfaceC23927 interfaceC239272 = interfaceC23927;
            while (true) {
                if (interfaceC239272 != null) {
                    Object key = interfaceC239272.getKey();
                    if (interfaceC239272.getHash() != i || key == null || !this.f13733.f45053.m27496(obj, key)) {
                        interfaceC239272 = interfaceC239272.getNext();
                    } else {
                        InterfaceC3529 mo17644 = interfaceC239272.mo17644();
                        Object obj3 = mo17644.get();
                        if (obj3 == null) {
                            this.f13739++;
                            if (mo17644.mo10725()) {
                                m12746(obj, obj3, mo17644.mo6744(), EnumC2761.f8579);
                                m12748(interfaceC239272, obj, obj2, mo39766);
                                i2 = this.f13743;
                            } else {
                                m12748(interfaceC239272, obj, obj2, mo39766);
                                i2 = this.f13743 + 1;
                            }
                            this.f13743 = i2;
                            m12747(interfaceC239272);
                        } else {
                            if (z) {
                                m12754(interfaceC239272, mo39766);
                            } else {
                                this.f13739++;
                                m12746(obj, obj3, mo17644.mo6744(), EnumC2761.f8574);
                                m12748(interfaceC239272, obj, obj2, mo39766);
                                m12747(interfaceC239272);
                            }
                            unlock();
                            m12758();
                            return obj3;
                        }
                    }
                } else {
                    this.f13739++;
                    InterfaceC23927 mo10703 = this.f13733.f45063.mo10703(this, obj, i, interfaceC23927);
                    m12748(mo10703, obj, obj2, mo39766);
                    atomicReferenceArray.set(length, mo10703);
                    this.f13743++;
                    m12747(mo10703);
                    break;
                }
            }
            unlock();
            m12758();
            return null;
        } catch (Throwable th) {
            unlock();
            m12758();
            throw th;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12756() {
        AtomicReferenceArray atomicReferenceArray = this.f13737;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.f13743;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f13744 = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(i2);
            if (interfaceC23927 != null) {
                InterfaceC23927 next = interfaceC23927.getNext();
                int hash = interfaceC23927.getHash() & length2;
                if (next == null) {
                    atomicReferenceArray2.set(hash, interfaceC23927);
                } else {
                    InterfaceC23927 interfaceC239272 = interfaceC23927;
                    while (next != null) {
                        int hash2 = next.getHash() & length2;
                        if (hash2 != hash) {
                            interfaceC239272 = next;
                            hash = hash2;
                        }
                        next = next.getNext();
                    }
                    atomicReferenceArray2.set(hash, interfaceC239272);
                    while (interfaceC23927 != interfaceC239272) {
                        int hash3 = interfaceC23927.getHash() & length2;
                        InterfaceC23927 m12741 = m12741(interfaceC23927, (InterfaceC23927) atomicReferenceArray2.get(hash3));
                        if (m12741 != null) {
                            atomicReferenceArray2.set(hash3, m12741);
                        } else {
                            m12753(interfaceC23927);
                            i--;
                        }
                        interfaceC23927 = interfaceC23927.getNext();
                    }
                }
            }
        }
        this.f13737 = atomicReferenceArray2;
        this.f13743 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12745(Object obj, int i, C23990 c23990, Object obj2) {
        lock();
        try {
            long mo39766 = this.f13733.f45061.mo39766();
            m12752(mo39766);
            int i2 = this.f13743 + 1;
            if (i2 > this.f13744) {
                m12756();
                i2 = this.f13743 + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f13737;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            InterfaceC23927 interfaceC239272 = interfaceC23927;
            while (true) {
                if (interfaceC239272 != null) {
                    Object key = interfaceC239272.getKey();
                    if (interfaceC239272.getHash() != i || key == null || !this.f13733.f45053.m27496(obj, key)) {
                        interfaceC239272 = interfaceC239272.getNext();
                    } else {
                        InterfaceC3529 mo17644 = interfaceC239272.mo17644();
                        Object obj3 = mo17644.get();
                        if (c23990 != mo17644 && (obj3 != null || mo17644 == ConcurrentMapC14754.f45044)) {
                            m12746(obj, obj2, 0, EnumC2761.f8574);
                        }
                        this.f13739++;
                        if (c23990.f77777.mo10725()) {
                            m12746(obj, obj3, c23990.f77777.mo6744(), obj3 == null ? EnumC2761.f8579 : EnumC2761.f8574);
                            i2--;
                        }
                        m12748(interfaceC239272, obj, obj2, mo39766);
                        this.f13743 = i2;
                        m12747(interfaceC239272);
                    }
                } else {
                    this.f13739++;
                    EnumC14090 enumC14090 = this.f13733.f45063;
                    obj.getClass();
                    InterfaceC23927 mo10703 = enumC14090.mo10703(this, obj, i, interfaceC23927);
                    m12748(mo10703, obj, obj2, mo39766);
                    atomicReferenceArray.set(length, mo10703);
                    this.f13743 = i2;
                    m12747(mo10703);
                    break;
                }
            }
            unlock();
            m12758();
        } catch (Throwable th) {
            unlock();
            m12758();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 m12742(InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC239272, Object obj, Object obj2, InterfaceC3529 interfaceC3529, EnumC2761 enumC2761) {
        m12746(obj, obj2, interfaceC3529.mo6744(), enumC2761);
        this.f13731.remove(interfaceC239272);
        this.f13742.remove(interfaceC239272);
        if (interfaceC3529.mo10724()) {
            interfaceC3529.mo10723(null);
            return interfaceC23927;
        }
        return m12750(interfaceC23927, interfaceC239272);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 m12750(InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC239272) {
        int i = this.f13743;
        InterfaceC23927 next = interfaceC239272.getNext();
        while (interfaceC23927 != interfaceC239272) {
            InterfaceC23927 m12741 = m12741(interfaceC23927, next);
            if (m12741 != null) {
                next = m12741;
            } else {
                m12753(interfaceC23927);
                i--;
            }
            interfaceC23927 = interfaceC23927.getNext();
        }
        this.f13743 = i;
        return next;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12753(InterfaceC23927 interfaceC23927) {
        Object key = interfaceC23927.getKey();
        interfaceC23927.getHash();
        m12746(key, interfaceC23927.mo17644().get(), interfaceC23927.mo17644().mo6744(), EnumC2761.f8579);
        this.f13731.remove(interfaceC23927);
        this.f13742.remove(interfaceC23927);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12749(InterfaceC23927 interfaceC23927, int i, EnumC2761 enumC2761) {
        AtomicReferenceArray atomicReferenceArray = this.f13737;
        int length = i & (atomicReferenceArray.length() - 1);
        InterfaceC23927 interfaceC239272 = (InterfaceC23927) atomicReferenceArray.get(length);
        for (InterfaceC23927 interfaceC239273 = interfaceC239272; interfaceC239273 != null; interfaceC239273 = interfaceC239273.getNext()) {
            if (interfaceC239273 == interfaceC23927) {
                this.f13739++;
                InterfaceC23927 m12742 = m12742(interfaceC239272, interfaceC239273, interfaceC239273.getKey(), interfaceC239273.mo17644().get(), interfaceC239273.mo17644(), enumC2761);
                int i2 = this.f13743 - 1;
                atomicReferenceArray.set(length, m12742);
                this.f13743 = i2;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m12759() {
        if ((this.f13738.incrementAndGet() & 63) == 0) {
            m12752(this.f13733.f45061.mo39766());
            m12758();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12752(long j) {
        if (tryLock()) {
            try {
                m12751();
                m12744(j);
                this.f13738.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m12758() {
        if (isHeldByCurrentThread()) {
            return;
        }
        while (true) {
            ConcurrentMapC14754 concurrentMapC14754 = this.f13733;
            C18989 c18989 = (C18989) concurrentMapC14754.f45047.poll();
            if (c18989 == null) {
                return;
            }
            try {
                concurrentMapC14754.f45052.mo12612(c18989);
            } catch (Throwable th) {
                ConcurrentMapC14754.f45046.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }
}
