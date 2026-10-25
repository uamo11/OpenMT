package l;

import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* compiled from: E3QI */
/* renamed from: l.ܳ᩶ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ConcurrentMapC14754 extends AbstractMap implements ConcurrentMap, InterfaceC17291 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f45047;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f45048;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f45049;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Set f45050;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public Collection f45051;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC4172 f45052;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC11081 f45053;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f45054;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC1412 f45055;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14796 f45056;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f45057;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f45058;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11081 f45059;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f45060;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC18325 f45061;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C4235[] f45062;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC14090 f45063;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19695 f45064;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f45065;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC19031 f45066;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f45067;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final EnumC1412 f45068;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final Logger f45046 = Logger.getLogger(ConcurrentMapC14754.class.getName());

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final C5625 f45044 = new C5625();

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final Queue f45045 = new C1391();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C16585.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C16585.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C16585.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C16585.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C16585.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C16585.$default$replaceAll(this, biFunction);
    }

    public ConcurrentMapC14754(C2803 c2803, AbstractC19031 abstractC19031) {
        long j;
        Collection concurrentLinkedQueue;
        int i = c2803.f8752;
        InterfaceC6141 interfaceC6141 = c2803.f8764;
        this.f45065 = Math.min(i == -1 ? 4 : i, 65536);
        EnumC1412 enumC1412 = c2803.f8762;
        EnumC1412 enumC14122 = EnumC1412.f5081;
        EnumC1412 enumC14123 = (EnumC1412) C16018.m37870(enumC1412, enumC14122);
        this.f45055 = enumC14123;
        this.f45068 = (EnumC1412) C16018.m37870(c2803.f8753, enumC14122);
        this.f45053 = (AbstractC11081) C16018.m37870(c2803.f8763, ((EnumC1412) C16018.m37870(c2803.f8762, enumC14122)).mo2794());
        this.f45059 = (AbstractC11081) C16018.m37870(c2803.f8760, ((EnumC1412) C16018.m37870(c2803.f8753, enumC14122)).mo2794());
        if (c2803.f8761 == 0 || c2803.f8758 == 0) {
            j = 0;
        } else {
            j = c2803.f8754 == null ? c2803.f8759 : c2803.f8765;
        }
        this.f45067 = j;
        InterfaceC19695 interfaceC19695 = c2803.f8754;
        EnumC16207 enumC16207 = EnumC16207.INSTANCE;
        InterfaceC19695 interfaceC196952 = (InterfaceC19695) C16018.m37870(interfaceC19695, enumC16207);
        this.f45064 = interfaceC196952;
        long j2 = c2803.f8758;
        this.f45048 = j2 == -1 ? 0L : j2;
        long j3 = c2803.f8761;
        this.f45057 = j3 == -1 ? 0L : j3;
        this.f45058 = 0L;
        InterfaceC4172 interfaceC4172 = c2803.f8755;
        EnumC9153 enumC9153 = EnumC9153.INSTANCE;
        InterfaceC4172 interfaceC41722 = (InterfaceC4172) C16018.m37870(interfaceC4172, enumC9153);
        this.f45052 = interfaceC41722;
        if (interfaceC41722 == enumC9153) {
            concurrentLinkedQueue = f45045;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f45047 = (AbstractQueue) concurrentLinkedQueue;
        int i2 = 0;
        boolean z = m35065() || 0 > 0 || m35064();
        AbstractC18325 abstractC18325 = c2803.f8756;
        this.f45061 = abstractC18325 == null ? z ? AbstractC18325.m42705() : C2803.f8751 : abstractC18325;
        this.f45063 = EnumC14090.m33694(enumC14123, m35064() || m35061() || m35064(), m35065() || m35065() || 0 > 0);
        this.f45056 = (InterfaceC14796) interfaceC6141.get();
        this.f45066 = abstractC19031;
        int min = Math.min(16, 1073741824);
        if (m35061() && interfaceC196952 == enumC16207) {
            min = (int) Math.min(min, j);
        }
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f45065 && (!m35061() || i3 * 20 <= this.f45067)) {
            i4++;
            i3 <<= 1;
        }
        this.f45060 = 32 - i4;
        this.f45054 = i3 - 1;
        this.f45062 = new C4235[i3];
        int i5 = min / i3;
        int i6 = 1;
        while (i6 < (i5 * i3 < min ? i5 + 1 : i5)) {
            i6 <<= 1;
        }
        if (m35061()) {
            long j4 = this.f45067;
            long j5 = i3;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                C4235[] c4235Arr = this.f45062;
                if (i2 >= c4235Arr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                c4235Arr[i2] = new C4235(this, i6, j8, (InterfaceC14796) interfaceC6141.get());
                i2++;
                j6 = j8;
            }
        } else {
            while (true) {
                C4235[] c4235Arr2 = this.f45062;
                if (i2 >= c4235Arr2.length) {
                    return;
                }
                c4235Arr2[i2] = new C4235(this, i6, -1L, (InterfaceC14796) interfaceC6141.get());
                i2++;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35061() {
        return this.f45067 >= 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m35065() {
        return this.f45057 > 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m35064() {
        return this.f45048 > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int m35059 = m35059(obj);
        return m35063(m35059).m12734(obj, m35059, obj2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int m35059 = m35059(obj);
        return m35063(m35059).m12734(obj, m35059, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int m35059 = m35059(obj);
        C4235 m35063 = m35063(m35059);
        m35063.lock();
        try {
            long mo39766 = m35063.f13733.f45061.mo39766();
            m35063.m12752(mo39766);
            AtomicReferenceArray atomicReferenceArray = m35063.f13737;
            int length = m35059 & (atomicReferenceArray.length() - 1);
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            InterfaceC23927 interfaceC239272 = interfaceC23927;
            while (true) {
                if (interfaceC239272 == null) {
                    break;
                }
                Object key = interfaceC239272.getKey();
                if (interfaceC239272.getHash() != m35059 || key == null || !m35063.f13733.f45053.m27496(obj, key)) {
                    interfaceC239272 = interfaceC239272.getNext();
                } else {
                    InterfaceC3529 mo17644 = interfaceC239272.mo17644();
                    Object obj3 = mo17644.get();
                    if (obj3 == null) {
                        if (mo17644.mo10725()) {
                            m35063.f13739++;
                            InterfaceC23927 m12742 = m35063.m12742(interfaceC23927, interfaceC239272, key, obj3, mo17644, EnumC2761.f8579);
                            int i = m35063.f13743 - 1;
                            atomicReferenceArray.set(length, m12742);
                            m35063.f13743 = i;
                        }
                    } else {
                        m35063.f13739++;
                        m35063.m12746(obj, obj3, mo17644.mo6744(), EnumC2761.f8574);
                        m35063.m12748(interfaceC239272, obj, obj2, mo39766);
                        m35063.m12747(interfaceC239272);
                        return obj3;
                    }
                }
            }
            return null;
        } finally {
            m35063.unlock();
            m35063.m12758();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int m35059 = m35059(obj);
        C4235 m35063 = m35063(m35059);
        m35063.lock();
        try {
            long mo39766 = m35063.f13733.f45061.mo39766();
            m35063.m12752(mo39766);
            AtomicReferenceArray atomicReferenceArray = m35063.f13737;
            int length = (atomicReferenceArray.length() - 1) & m35059;
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            InterfaceC23927 interfaceC239272 = interfaceC23927;
            while (true) {
                if (interfaceC239272 == null) {
                    break;
                }
                Object key = interfaceC239272.getKey();
                if (interfaceC239272.getHash() != m35059 || key == null || !m35063.f13733.f45053.m27496(obj, key)) {
                    int i = length;
                    interfaceC239272 = interfaceC239272.getNext();
                    length = i;
                } else {
                    InterfaceC3529 mo17644 = interfaceC239272.mo17644();
                    Object obj4 = mo17644.get();
                    if (obj4 == null) {
                        if (mo17644.mo10725()) {
                            m35063.f13739++;
                            InterfaceC23927 m12742 = m35063.m12742(interfaceC23927, interfaceC239272, key, obj4, mo17644, EnumC2761.f8579);
                            int i2 = m35063.f13743 - 1;
                            atomicReferenceArray.set(length, m12742);
                            m35063.f13743 = i2;
                        }
                    } else {
                        if (m35063.f13733.f45059.m27496(obj2, obj4)) {
                            m35063.f13739++;
                            m35063.m12746(obj, obj4, mo17644.mo6744(), EnumC2761.f8574);
                            m35063.m12748(interfaceC239272, obj, obj3, mo39766);
                            m35063.m12747(interfaceC239272);
                            return true;
                        }
                        m35063.m12754(interfaceC239272, mo39766);
                    }
                }
            }
            return false;
        } finally {
            m35063.unlock();
            m35063.m12758();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m35060(Object obj, AbstractC19031 abstractC19031) {
        InterfaceC23927 m12740;
        obj.getClass();
        int m35059 = m35059(obj);
        C4235 m35063 = m35063(m35059);
        m35063.getClass();
        abstractC19031.getClass();
        try {
            try {
                if (m35063.f13743 != 0 && (m12740 = m35063.m12740(m35059, obj)) != null) {
                    long mo39766 = m35063.f13733.f45061.mo39766();
                    Object m12737 = m35063.m12737(m12740, mo39766);
                    if (m12737 != null) {
                        m35063.m12757(m12740, mo39766);
                        m35063.f13734.mo19007();
                        return m35063.m12738(m12740, obj, m35059, m12737, mo39766, abstractC19031);
                    }
                    InterfaceC3529 mo17644 = m12740.mo17644();
                    if (mo17644.mo10724()) {
                        return m35063.m12739(m12740, obj, mo17644);
                    }
                }
                return m35063.m12735(obj, m35059, abstractC19031);
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new C0454((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw new C6099(cause);
                }
                throw e;
            }
        } finally {
            m35063.m12759();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35062(InterfaceC23927 interfaceC23927, long j) {
        interfaceC23927.getClass();
        if (!m35064() || j - interfaceC23927.mo17638() < this.f45048) {
            return m35065() && j - interfaceC23927.mo17639() >= this.f45057;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35059(Object obj) {
        int m27495 = this.f45053.m27495(obj);
        int i = m27495 + ((m27495 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4235 m35063(int i) {
        return this.f45062[(i >>> this.f45060) & this.f45054];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        C4235[] c4235Arr = this.f45062;
        long j = 0;
        for (C4235 c4235 : c4235Arr) {
            if (c4235.f13743 != 0) {
                return false;
            }
            j += r8.f13739;
        }
        if (j == 0) {
            return true;
        }
        for (C4235 c42352 : c4235Arr) {
            if (c42352.f13743 != 0) {
                return false;
            }
            j -= r9.f13739;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i = 0; i < this.f45062.length; i++) {
            j += Math.max(0, r0[i].f13743);
        }
        return C13426.m32450(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #1 {all -> 0x006a, blocks: (B:7:0x000f, B:9:0x0013, B:16:0x0045, B:18:0x004f, B:21:0x0063, B:22:0x0022, B:24:0x002a, B:28:0x0033, B:31:0x0038, B:32:0x003b, B:27:0x0030), top: B:6:0x000f, inners: #0 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r4 = r10.m35059(r11)
            l.ۘ᩹ܺ r9 = r10.m35063(r4)
            r9.getClass()
            int r1 = r9.f13743     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L66
            l.ܳ᩶ܺ r1 = r9.f13733     // Catch: java.lang.Throwable -> L6a
            l.ᩳ᩸ܺ r1 = r1.f45061     // Catch: java.lang.Throwable -> L6a
            long r6 = r1.mo39766()     // Catch: java.lang.Throwable -> L6a
            l.᩻᩶ܺ r11 = r9.m12740(r4, r11)     // Catch: java.lang.Throwable -> L6a
            if (r11 != 0) goto L22
            goto L3c
        L22:
            l.ܳ᩶ܺ r1 = r9.f13733     // Catch: java.lang.Throwable -> L6a
            boolean r1 = r1.m35062(r11, r6)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L3e
            boolean r11 = r9.tryLock()     // Catch: java.lang.Throwable -> L6a
            if (r11 == 0) goto L3c
            r9.m12744(r6)     // Catch: java.lang.Throwable -> L37
            r9.unlock()     // Catch: java.lang.Throwable -> L6a
            goto L3c
        L37:
            r11 = move-exception
            r9.unlock()     // Catch: java.lang.Throwable -> L6a
            throw r11     // Catch: java.lang.Throwable -> L6a
        L3c:
            r2 = r0
            goto L3f
        L3e:
            r2 = r11
        L3f:
            if (r2 != 0) goto L45
            r9.m12759()
            return r0
        L45:
            l.ۗ᩹ܺ r11 = r2.mo17644()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r5 = r11.get()     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L63
            r9.m12757(r2, r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L6a
            l.ܳ᩶ܺ r11 = r9.f13733     // Catch: java.lang.Throwable -> L6a
            l.ᩴ᩸ܺ r8 = r11.f45066     // Catch: java.lang.Throwable -> L6a
            r1 = r9
            java.lang.Object r11 = r1.m12738(r2, r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L6a
            r9.m12759()
            return r11
        L63:
            r9.m12755()     // Catch: java.lang.Throwable -> L6a
        L66:
            r9.m12759()
            return r0
        L6a:
            r11 = move-exception
            r9.m12759()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC14754.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x000f, B:9:0x0013, B:16:0x0044, B:21:0x0023, B:23:0x002b, B:27:0x0034, B:30:0x0039, B:31:0x003c, B:26:0x0031), top: B:6:0x000f, inners: #1 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsKey(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = r6.m35059(r7)
            l.ۘ᩹ܺ r2 = r6.m35063(r1)
            r2.getClass()
            int r3 = r2.f13743     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L53
            l.ܳ᩶ܺ r3 = r2.f13733     // Catch: java.lang.Throwable -> L57
            l.ᩳ᩸ܺ r3 = r3.f45061     // Catch: java.lang.Throwable -> L57
            long r3 = r3.mo39766()     // Catch: java.lang.Throwable -> L57
            l.᩻᩶ܺ r7 = r2.m12740(r1, r7)     // Catch: java.lang.Throwable -> L57
            r1 = 0
            if (r7 != 0) goto L23
            goto L3d
        L23:
            l.ܳ᩶ܺ r5 = r2.f13733     // Catch: java.lang.Throwable -> L57
            boolean r5 = r5.m35062(r7, r3)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L3e
            boolean r7 = r2.tryLock()     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L3d
            r2.m12744(r3)     // Catch: java.lang.Throwable -> L38
            r2.unlock()     // Catch: java.lang.Throwable -> L57
            goto L3d
        L38:
            r7 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> L57
            throw r7     // Catch: java.lang.Throwable -> L57
        L3d:
            r7 = r1
        L3e:
            if (r7 != 0) goto L44
            r2.m12759()
            return r0
        L44:
            l.ۗ᩹ܺ r7 = r7.mo17644()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L4f
            r0 = 1
        L4f:
            r2.m12759()
            return r0
        L53:
            r2.m12759()
            return r0
        L57:
            r7 = move-exception
            r2.m12759()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC14754.containsKey(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long mo39766 = this.f45061.mo39766();
        C4235[] c4235Arr = this.f45062;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = c4235Arr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                C4235 c4235 = c4235Arr[i2];
                int i3 = c4235.f13743;
                AtomicReferenceArray atomicReferenceArray = c4235.f13737;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(i4);
                    while (interfaceC23927 != null) {
                        C4235[] c4235Arr2 = c4235Arr;
                        Object m12737 = c4235.m12737(interfaceC23927, mo39766);
                        long j3 = mo39766;
                        if (m12737 != null && this.f45059.m27496(obj, m12737)) {
                            return true;
                        }
                        interfaceC23927 = interfaceC23927.getNext();
                        c4235Arr = c4235Arr2;
                        mo39766 = j3;
                    }
                }
                j2 += c4235.f13739;
                i2++;
                mo39766 = mo39766;
            }
            long j4 = mo39766;
            C4235[] c4235Arr3 = c4235Arr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            c4235Arr = c4235Arr3;
            mo39766 = j4;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r7 = r4.mo17644();
        r13 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r13 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r0 = l.EnumC2761.f8575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r9.f13739++;
        r0 = r9.m12742(r3, r4, r5, r13, r7, r8);
        r1 = r9.f13743 - 1;
        r10.set(r11, r0);
        r9.f13743 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r7.mo10725() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = l.EnumC2761.f8579;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            int r1 = r12.m35059(r13)
            l.ۘ᩹ܺ r9 = r12.m35063(r1)
            r9.lock()
            l.ܳ᩶ܺ r2 = r9.f13733     // Catch: java.lang.Throwable -> L83
            l.ᩳ᩸ܺ r2 = r2.f45061     // Catch: java.lang.Throwable -> L83
            long r2 = r2.mo39766()     // Catch: java.lang.Throwable -> L83
            r9.m12752(r2)     // Catch: java.lang.Throwable -> L83
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.f13737     // Catch: java.lang.Throwable -> L83
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L83
            int r2 = r2 + (-1)
            r11 = r1 & r2
            java.lang.Object r2 = r10.get(r11)     // Catch: java.lang.Throwable -> L83
            r3 = r2
            l.᩻᩶ܺ r3 = (l.InterfaceC23927) r3     // Catch: java.lang.Throwable -> L83
            r4 = r3
        L2c:
            if (r4 == 0) goto L7c
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L83
            int r2 = r4.getHash()     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L77
            if (r5 == 0) goto L77
            l.ܳ᩶ܺ r2 = r9.f13733     // Catch: java.lang.Throwable -> L83
            l.ۧܶܺ r2 = r2.f45053     // Catch: java.lang.Throwable -> L83
            boolean r2 = r2.m27496(r13, r5)     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L77
            l.ۗ᩹ܺ r7 = r4.mo17644()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L83
            if (r13 == 0) goto L52
            l.ۖ᩶ܺ r0 = l.EnumC2761.f8575     // Catch: java.lang.Throwable -> L83
        L50:
            r8 = r0
            goto L5b
        L52:
            boolean r1 = r7.mo10725()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L7c
            l.ۖ᩶ܺ r0 = l.EnumC2761.f8579     // Catch: java.lang.Throwable -> L83
            goto L50
        L5b:
            int r0 = r9.f13739     // Catch: java.lang.Throwable -> L83
            int r0 = r0 + 1
            r9.f13739 = r0     // Catch: java.lang.Throwable -> L83
            r2 = r9
            r6 = r13
            l.᩻᩶ܺ r0 = r2.m12742(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L83
            int r1 = r9.f13743     // Catch: java.lang.Throwable -> L83
            int r1 = r1 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> L83
            r9.f13743 = r1     // Catch: java.lang.Throwable -> L83
            r9.unlock()
            r9.m12758()
            return r13
        L77:
            l.᩻᩶ܺ r4 = r4.getNext()     // Catch: java.lang.Throwable -> L83
            goto L2c
        L7c:
            r9.unlock()
            r9.m12758()
            return r0
        L83:
            r13 = move-exception
            r9.unlock()
            r9.m12758()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC14754.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r7 = r4.mo17644();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r9.f13733.f45059.m27496(r14, r6) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r13 = l.EnumC2761.f8575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r9.f13739++;
        r14 = r9.m12742(r3, r4, r5, r6, r7, r13);
        r1 = r9.f13743 - 1;
        r10.set(r11, r14);
        r9.f13743 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r13 != l.EnumC2761.f8575) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r6 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r7.mo10725() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r13 = l.EnumC2761.f8579;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L95
            if (r14 != 0) goto L7
            goto L95
        L7:
            int r1 = r12.m35059(r13)
            l.ۘ᩹ܺ r9 = r12.m35063(r1)
            r9.lock()
            l.ܳ᩶ܺ r2 = r9.f13733     // Catch: java.lang.Throwable -> L8d
            l.ᩳ᩸ܺ r2 = r2.f45061     // Catch: java.lang.Throwable -> L8d
            long r2 = r2.mo39766()     // Catch: java.lang.Throwable -> L8d
            r9.m12752(r2)     // Catch: java.lang.Throwable -> L8d
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.f13737     // Catch: java.lang.Throwable -> L8d
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L8d
            int r2 = r2 + (-1)
            r11 = r1 & r2
            java.lang.Object r2 = r10.get(r11)     // Catch: java.lang.Throwable -> L8d
            r3 = r2
            l.᩻᩶ܺ r3 = (l.InterfaceC23927) r3     // Catch: java.lang.Throwable -> L8d
            r4 = r3
        L2f:
            if (r4 == 0) goto L86
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L8d
            int r2 = r4.getHash()     // Catch: java.lang.Throwable -> L8d
            if (r2 != r1) goto L81
            if (r5 == 0) goto L81
            l.ܳ᩶ܺ r2 = r9.f13733     // Catch: java.lang.Throwable -> L8d
            l.ۧܶܺ r2 = r2.f45053     // Catch: java.lang.Throwable -> L8d
            boolean r2 = r2.m27496(r13, r5)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L81
            l.ۗ᩹ܺ r7 = r4.mo17644()     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L8d
            l.ܳ᩶ܺ r13 = r9.f13733     // Catch: java.lang.Throwable -> L8d
            l.ۧܶܺ r13 = r13.f45059     // Catch: java.lang.Throwable -> L8d
            boolean r13 = r13.m27496(r14, r6)     // Catch: java.lang.Throwable -> L8d
            if (r13 == 0) goto L5c
            l.ۖ᩶ܺ r13 = l.EnumC2761.f8575     // Catch: java.lang.Throwable -> L8d
            goto L66
        L5c:
            if (r6 != 0) goto L86
            boolean r13 = r7.mo10725()     // Catch: java.lang.Throwable -> L8d
            if (r13 == 0) goto L86
            l.ۖ᩶ܺ r13 = l.EnumC2761.f8579     // Catch: java.lang.Throwable -> L8d
        L66:
            int r14 = r9.f13739     // Catch: java.lang.Throwable -> L8d
            int r14 = r14 + 1
            r9.f13739 = r14     // Catch: java.lang.Throwable -> L8d
            r2 = r9
            r8 = r13
            l.᩻᩶ܺ r14 = r2.m12742(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8d
            int r1 = r9.f13743     // Catch: java.lang.Throwable -> L8d
            int r1 = r1 + (-1)
            r10.set(r11, r14)     // Catch: java.lang.Throwable -> L8d
            r9.f13743 = r1     // Catch: java.lang.Throwable -> L8d
            l.ۖ᩶ܺ r14 = l.EnumC2761.f8575     // Catch: java.lang.Throwable -> L8d
            if (r13 != r14) goto L86
            r0 = 1
            goto L86
        L81:
            l.᩻᩶ܺ r4 = r4.getNext()     // Catch: java.lang.Throwable -> L8d
            goto L2f
        L86:
            r9.unlock()
            r9.m12758()
            return r0
        L8d:
            r13 = move-exception
            r9.unlock()
            r9.m12758()
            throw r13
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC14754.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        EnumC2761 enumC2761;
        C4235[] c4235Arr = this.f45062;
        int length = c4235Arr.length;
        for (int i = 0; i < length; i++) {
            C4235 c4235 = c4235Arr[i];
            if (c4235.f13743 != 0) {
                c4235.lock();
                try {
                    c4235.m12752(c4235.f13733.f45061.mo39766());
                    AtomicReferenceArray atomicReferenceArray = c4235.f13737;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(i2); interfaceC23927 != null; interfaceC23927 = interfaceC23927.getNext()) {
                            if (interfaceC23927.mo17644().mo10725()) {
                                Object key = interfaceC23927.getKey();
                                Object obj = interfaceC23927.mo17644().get();
                                if (key != null && obj != null) {
                                    enumC2761 = EnumC2761.f8575;
                                    interfaceC23927.getHash();
                                    c4235.m12746(key, obj, interfaceC23927.mo17644().mo6744(), enumC2761);
                                }
                                enumC2761 = EnumC2761.f8579;
                                interfaceC23927.getHash();
                                c4235.m12746(key, obj, interfaceC23927.mo17644().mo6744(), enumC2761);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    ConcurrentMapC14754 concurrentMapC14754 = c4235.f13733;
                    if (concurrentMapC14754.f45055 != EnumC1412.f5081) {
                        while (c4235.f13741.poll() != null) {
                        }
                    }
                    if (concurrentMapC14754.f45068 != EnumC1412.f5081) {
                        while (c4235.f13735.poll() != null) {
                        }
                    }
                    c4235.f13731.clear();
                    c4235.f13742.clear();
                    c4235.f13738.set(0);
                    c4235.f13739++;
                    c4235.f13743 = 0;
                } finally {
                    c4235.unlock();
                    c4235.m12758();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f45050;
        if (set != null) {
            return set;
        }
        C18346 c18346 = new C18346(this);
        this.f45050 = c18346;
        return c18346;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f45051;
        if (collection != null) {
            return collection;
        }
        C13406 c13406 = new C13406(this);
        this.f45051 = c13406;
        return c13406;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f45049;
        if (set != null) {
            return set;
        }
        C2118 c2118 = new C2118(this);
        this.f45049 = c2118;
        return c2118;
    }
}
