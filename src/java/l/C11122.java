package l;

import java.util.ArrayDeque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: D70T */
/* renamed from: l.ۧܽܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11122 implements AutoCloseable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f33362;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C12100 f33363;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f33364;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f33365;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C18177 f33366;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f33367;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Thread f33368;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f33369 = new IdentityHashMap();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f33370;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f33371;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f33372;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f33373;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f33374;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C9047 f33375;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C4607 f33376;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7429 f33377;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1949 f33378;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15189 f33379;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f33380;

    public C11122(C18177 c18177, C7429 c7429, long j, C15189 c15189) {
        this.f33366 = c18177;
        this.f33377 = c7429;
        this.f33370 = j;
        this.f33379 = c15189;
        this.f33375 = c7429.f22836;
        this.f33363 = c7429.f22840;
        this.f33364 = c7429.f22838;
        this.f33365 = c7429.f22839;
        this.f33362 = c7429.f22835;
        this.f33374 = c7429.f22843;
        this.f33371 = c7429.f22842;
    }

    public final int length() {
        int i;
        synchronized (this.f33366) {
            m27577();
            C9047 c9047 = this.f33375;
            i = c9047 == null ? 0 : c9047.f27431;
        }
        return i;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m27602(int i, int i2, byte[] bArr) {
        synchronized (this.f33366) {
            m27577();
            this.f33366.m42396();
            if (C18177.m42334((Iterable) this.f33369.keySet())) {
                m27577();
                C19631.m45125(i, 0, i2, this.f33375, bArr);
                this.f33366.m42396();
                if (!C18177.m42334((Iterable) this.f33369.keySet())) {
                    m27552();
                    throw new C5519();
                }
            } else {
                m27552();
                throw new C5519();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m27598(int r25, int r26, byte[] r27, int r28, l.InterfaceC17066 r29) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11122.m27598(int, int, byte[], int, l.ܿۖ᩷):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27597(int i, int i2) {
        synchronized (this.f33366) {
            m27577();
            m27595();
            int i3 = i2 - i;
            m27553(i, i2, i3);
            if (i3 == 0) {
                return;
            }
            C15189 m48698 = this.f33366.f56545.m48698();
            try {
                C9047 m27551 = m27551(C19631.m45103(this.f33375, i, i2, C19631.m45107(new C20130((byte) 0, i3))), i, this.f33366.f56545);
                C12100 m32542 = C13510.m32542(this.f33363, i, i2, i3);
                m27554(m27551, m32542);
                C4108 m45129 = C19631.m45129(m27551);
                this.f33375 = m27551;
                this.f33363 = m32542;
                this.f33364 = m45129.m12331();
                this.f33365 = m45129.m12332();
                this.f33380 |= (this.f33362 == 0 && this.f33374 == 0 && this.f33371 == 0) ? false : true;
                this.f33372 = true;
            } catch (Error e) {
                e = e;
                this.f33366.f56545.m48699(m48698);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                this.f33366.f56545.m48699(m48698);
                throw e;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02db A[Catch: all -> 0x013d, TRY_ENTER, TryCatch #13 {all -> 0x013d, blocks: (B:173:0x00dd, B:178:0x00f1, B:121:0x02db, B:123:0x02e0, B:124:0x02ec, B:125:0x02ee, B:131:0x02f7, B:135:0x02fa, B:182:0x0124, B:46:0x015f, B:48:0x0163, B:50:0x0169, B:52:0x0177, B:56:0x0189, B:60:0x0199, B:61:0x01a2, B:63:0x01a6, B:65:0x01ac, B:66:0x01ae, B:117:0x029d, B:148:0x02a6, B:149:0x02ab, B:150:0x02ac, B:151:0x02b3, B:152:0x019e, B:153:0x0190, B:154:0x0180, B:155:0x02b4, B:156:0x02b9, B:157:0x02ba, B:158:0x02c1, B:40:0x0158, B:43:0x015c, B:127:0x02ef, B:129:0x02f3, B:130:0x02f6), top: B:36:0x00db, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m27599(int r30, l.C9711 r31, l.C23556 r32) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11122.m27599(int, l.ۢܽܳ, l.᩻۟ܿ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27601(int i, int i2) {
        synchronized (this.f33366) {
            m27577();
            m27595();
            int i3 = 0;
            C4607 c4607 = new C4607(i, i2, true, false);
            C9047 c9047 = this.f33375;
            if (c9047 != null) {
                i3 = c9047.f27431;
            }
            C4607.m13516(c4607, i3);
            this.f33376 = c4607;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27600(InterfaceC17066 interfaceC17066) {
        InterfaceC17066 m38504 = interfaceC17066 == null ? null : C16360.m38504(interfaceC17066);
        synchronized (this.f33366) {
            m27577();
            m27595();
            if (m38504 != null && m38504.mo1526()) {
                m27552();
                return false;
            }
            InterfaceC18883[] m42342 = C18177.m42342(this.f33366, this, m38504);
            if (m42342 == null) {
                return false;
            }
            C18177.m42332(m42342);
            return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1949 m27596(int i, byte[] bArr) {
        C1949 c1949;
        synchronized (this.f33366) {
            m27577();
            m27595();
            if (!this.f33372) {
                C9047 c9047 = this.f33375;
                C7429 c7429 = this.f33377;
                if (c9047 == c7429.f22836 && this.f33363 == c7429.f22840) {
                    if (i <= 0) {
                        throw new IllegalArgumentException("Pattern must not be empty");
                    }
                    if (bArr.length > 67108864) {
                        throw new IllegalStateException("Replacement metadata exceeds memory limit");
                    }
                    if (!C18177.m42360(C1005.m3495(C1005.m3495(C19631.m45118(c9047), C1005.m3495(C19631.m45128(this.f33375), C1005.m3495(this.f33362, C1005.m3495(this.f33374, C13510.m32558(this.f33363))))), C1005.m3495(bArr.length, 16384L)))) {
                        throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                    }
                    this.f33374 = C18177.m42351(this.f33375);
                    this.f33362 = C19631.m45142(this.f33375);
                    c1949 = new C1949(this, i, (byte[]) bArr.clone());
                    this.f33378 = c1949;
                }
            }
            throw new IllegalStateException("Batch replacement requires a pristine transaction");
        }
        return c1949;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33366) {
            if (!this.f33367) {
                C18177.m42328(this.f33366, this);
            }
        }
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m27575(C11122 c11122) {
        if (C18177.m42334((Iterable) c11122.f33369.keySet())) {
            return;
        }
        c11122.m27552();
        throw new C5519();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27565(C11122 c11122) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        C19631.m45134(c11122.f33375, identityHashMap);
        IdentityHashMap identityHashMap2 = c11122.f33369;
        for (InterfaceC18883 interfaceC18883 : identityHashMap2.keySet()) {
            if (!identityHashMap.containsKey(interfaceC18883) || c11122.f33366.f56546.put(interfaceC18883, Boolean.TRUE) != null) {
                C18177.m42332(new InterfaceC18883[]{interfaceC18883});
            }
        }
        identityHashMap2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m27574(InterfaceC18883[] interfaceC18883Arr) {
        InterfaceC18883[] interfaceC18883Arr2;
        Set keySet = this.f33366.f56546.keySet();
        IdentityHashMap identityHashMap = this.f33369;
        Set keySet2 = identityHashMap.keySet();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayDeque.push((InterfaceC18883) it.next());
        }
        Iterator it2 = keySet2.iterator();
        while (it2.hasNext()) {
            arrayDeque.push((InterfaceC18883) it2.next());
        }
        for (InterfaceC18883 interfaceC18883 : interfaceC18883Arr) {
            arrayDeque.push(interfaceC18883);
        }
        while (!arrayDeque.isEmpty()) {
            InterfaceC18883 interfaceC188832 = (InterfaceC18883) arrayDeque.pop();
            Boolean bool = Boolean.TRUE;
            if (identityHashMap2.put(interfaceC188832, bool) == null) {
                if (interfaceC188832 instanceof C5477) {
                    identityHashMap3.put((C5477) interfaceC188832, bool);
                } else if (interfaceC188832 instanceof C6018) {
                    interfaceC18883Arr2 = ((C6018) interfaceC188832).f18478;
                    for (InterfaceC18883 interfaceC188833 : interfaceC18883Arr2) {
                        arrayDeque.push(interfaceC188833);
                    }
                }
            }
        }
        if (identityHashMap3.size() > 64) {
            throw new IllegalStateException("Too many external file sources");
        }
        for (InterfaceC18883 interfaceC188834 : interfaceC18883Arr) {
            if (identityHashMap.put(interfaceC188834, Boolean.TRUE) != null) {
                C18177.m42332(new InterfaceC18883[]{interfaceC188834});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m27560(InterfaceC18883[] interfaceC18883Arr) {
        int length = interfaceC18883Arr.length;
        int i = 0;
        while (true) {
            IdentityHashMap identityHashMap = this.f33369;
            if (i >= length) {
                for (InterfaceC18883 interfaceC18883 : interfaceC18883Arr) {
                    identityHashMap.put(interfaceC18883, Boolean.TRUE);
                }
                return;
            } else {
                InterfaceC18883 interfaceC188832 = interfaceC18883Arr[i];
                if (identityHashMap.containsKey(interfaceC188832) || this.f33366.f56546.containsKey(interfaceC188832)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        throw new IllegalStateException("Created source is already owned");
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static void m27563(C11122 c11122) {
        IdentityHashMap identityHashMap = c11122.f33369;
        InterfaceC18883[] interfaceC18883Arr = (InterfaceC18883[]) identityHashMap.keySet().toArray(new InterfaceC18883[0]);
        identityHashMap.clear();
        C18177.m42332(interfaceC18883Arr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27558(C11122 c11122, InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            c11122.m27552();
            throw new C23821();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9047 m27551(C9047 c9047, int i, C21541 c21541) {
        if (this.f33364 > 8323072) {
            return c9047;
        }
        if ((c9047 == null ? 0 : c9047.f27428) <= 256) {
            return c9047;
        }
        C9753 m45131 = C19631.m45131(i, c9047);
        if (m45131.m24732() == null) {
            return c9047;
        }
        C9047 m24732 = m45131.m24732();
        if ((m24732 != null ? m24732.f27428 : 0) <= 256) {
            return c9047;
        }
        int length = m45131.length();
        byte[] bArr = new byte[length];
        C19631.m45114(m45131.m24732(), bArr);
        return C19631.m45103(c9047, m45131.m24731(), m45131.m24731() + m45131.length(), c21541.m48697(length, bArr));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27553(int i, int i2, int i3) {
        int length = length();
        if (i < 0 || i2 < i || i2 > length) {
            StringBuilder m46682 = C20361.m46682("start=", i, ", end=", ", length=", i2);
            m46682.append(length);
            throw new IndexOutOfBoundsException(m46682.toString());
        }
        if ((length - (i2 - i)) + i3 > 2147483647L) {
            throw new C7161();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m27577() {
        m27581();
        if (this.f33367 || this.f33366.f56551 != this || this.f33370 != this.f33366.f56547 || this.f33366.f56537 != this.f33377) {
            throw new IllegalStateException("Transaction is not active");
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m27586() {
        if (this.f33368 != null) {
            throw new IllegalStateException("Range transfer is already active");
        }
        this.f33368 = Thread.currentThread();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        r0.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
    
        return;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m27581() {
        /*
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 0
        L5:
            boolean r2 = r3.f33367
            if (r2 != 0) goto L17
            java.lang.Thread r2 = r3.f33368
            if (r2 == 0) goto L17
            if (r2 == r0) goto L17
            l.ᩳܽܳ r2 = r3.f33366     // Catch: java.lang.InterruptedException -> L15
            r2.wait()     // Catch: java.lang.InterruptedException -> L15
            goto L5
        L15:
            r1 = 1
            goto L5
        L17:
            if (r1 == 0) goto L1c
            r0.interrupt()
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11122.m27581():void");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m27595() {
        if (this.f33378 != null) {
            throw new IllegalStateException("A batch replacement is active");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m27552() {
        m27581();
        if (this.f33367 || this.f33366.f56551 != this) {
            return;
        }
        C1949 c1949 = this.f33378;
        if (c1949 != null) {
            c1949.f6503 = true;
            this.f33378 = null;
        }
        this.f33366.f56545.m48699(this.f33379);
        IdentityHashMap identityHashMap = this.f33369;
        InterfaceC18883[] interfaceC18883Arr = (InterfaceC18883[]) identityHashMap.keySet().toArray(new InterfaceC18883[0]);
        identityHashMap.clear();
        C18177.m42332(interfaceC18883Arr);
        this.f33366.f56551 = null;
        this.f33367 = true;
        this.f33366.notifyAll();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static void m27590(C11122 c11122) {
        c11122.m27554(c11122.f33375, c11122.f33363);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27554(C9047 c9047, C12100 c12100) {
        if (!C18177.m42360(C1005.m3495(C1005.m3495(C1005.m3495(C1005.m3495(C19631.m45128(c9047), this.f33362), C19631.m45118(c9047)), this.f33374), C13510.m32558(c12100)))) {
            throw new IllegalStateException("Edit metadata exceeds memory limit");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m27561(int i) {
        if (i == 0) {
            return false;
        }
        if (i >= 0) {
            return C1005.m3495(this.f33364, C1005.m3495(((((long) i) + 65535) / 65536) * 65536, 65536L)) > X931RNG.BLOCK128_RESEED_MAX;
        }
        throw new IllegalArgumentException("Negative literal length");
    }
}
