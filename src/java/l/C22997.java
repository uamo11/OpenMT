package l;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: 1ALL */
/* renamed from: l.᩺۫᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22997 extends AbstractC12414 {
    public volatile /* synthetic */ int size;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object[] f74040;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC13824 f74041;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f74042;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f74043;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f74044;

    @Override // l.AbstractC12414
    /* renamed from: ܳ */
    public final boolean mo30583() {
        return false;
    }

    @Override // l.AbstractC12414
    /* renamed from: ֫ */
    public final boolean mo30581(AbstractC23642 abstractC23642) {
        ReentrantLock reentrantLock = this.f74043;
        reentrantLock.lock();
        try {
            return super.mo30581(abstractC23642);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.AbstractC12414
    /* renamed from: ᩻ */
    public final boolean mo30585() {
        return this.size == 0;
    }

    @Override // l.AbstractC6064
    /* renamed from: ֫ */
    public final Object mo16918(C17473 c17473) {
        InterfaceC6709 m16924;
        C15050 c15050 = C10298.f31023;
        ReentrantLock reentrantLock = this.f74043;
        reentrantLock.lock();
        try {
            int i = this.size;
            C17998 m16921 = m16921();
            if (m16921 != null) {
                return m16921;
            }
            C15050 c150502 = null;
            if (i < this.f74042) {
                this.size = i + 1;
            } else {
                int i2 = C11709.f34922[this.f74041.ordinal()];
                if (i2 == 1) {
                    c150502 = C10298.f31022;
                } else if (i2 == 2) {
                    c150502 = c15050;
                } else if (i2 != 3) {
                    throw new C8764();
                }
            }
            if (c150502 != null) {
                return c150502;
            }
            if (i == 0) {
                do {
                    m16924 = m16924();
                    if (m16924 != null) {
                        if (m16924 instanceof C17998) {
                            this.size = i;
                            return m16924;
                        }
                    }
                } while (m16924.mo13623(c17473) == null);
                this.size = i;
                C8058 c8058 = C8058.f24861;
                reentrantLock.unlock();
                m16924.mo13621(c17473);
                return m16924.mo18267();
            }
            m51145(i, c17473);
            return c15050;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m51145(int i, C17473 c17473) {
        int i2 = this.f74042;
        if (i >= i2) {
            Object[] objArr = this.f74040;
            int i3 = this.f74044;
            objArr[i3 % objArr.length] = null;
            objArr[(i + i3) % objArr.length] = c17473;
            this.f74044 = (i3 + 1) % objArr.length;
            return;
        }
        Object[] objArr2 = this.f74040;
        if (i >= objArr2.length) {
            int min = Math.min(objArr2.length * 2, i2);
            Object[] objArr3 = new Object[min];
            for (int i4 = 0; i4 < i; i4++) {
                Object[] objArr4 = this.f74040;
                objArr3[i4] = objArr4[(this.f74044 + i4) % objArr4.length];
            }
            Arrays.fill(objArr3, i, min, C10298.f31021);
            this.f74040 = objArr3;
            this.f74044 = 0;
        }
        Object[] objArr5 = this.f74040;
        objArr5[(this.f74044 + i) % objArr5.length] = c17473;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    @Override // l.AbstractC12414
    /* renamed from: ᩷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo30584() {
        /*
            r8 = this;
            l.ܶۛ᩵ r0 = l.C10298.f31024
            java.util.concurrent.locks.ReentrantLock r1 = r8.f74043
            r1.lock()
            int r2 = r8.size     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L17
            l.ᩳۤ᩵ r2 = r8.m16921()     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L12
            goto L13
        L12:
            r0 = r2
        L13:
            r1.unlock()
            return r0
        L17:
            java.lang.Object[] r3 = r8.f74040     // Catch: java.lang.Throwable -> L5f
            int r4 = r8.f74044     // Catch: java.lang.Throwable -> L5f
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L5f
            r6 = 0
            r3[r4] = r6     // Catch: java.lang.Throwable -> L5f
            int r3 = r2 + (-1)
            r8.size = r3     // Catch: java.lang.Throwable -> L5f
            int r3 = r8.f74042     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            if (r2 != r3) goto L36
            l.᩷ۤ᩵ r3 = r8.m16923()     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L30
            goto L36
        L30:
            java.lang.Object r4 = r3.mo42037()     // Catch: java.lang.Throwable -> L5f
            r6 = 1
            goto L39
        L36:
            r4 = r0
            r3 = r6
            r6 = 0
        L39:
            if (r4 == r0) goto L4a
            boolean r0 = r4 instanceof l.C17998     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L4a
            r8.size = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object[] r0 = r8.f74040     // Catch: java.lang.Throwable -> L5f
            int r7 = r8.f74044     // Catch: java.lang.Throwable -> L5f
            int r7 = r7 + r2
            int r2 = r0.length     // Catch: java.lang.Throwable -> L5f
            int r7 = r7 % r2
            r0[r7] = r4     // Catch: java.lang.Throwable -> L5f
        L4a:
            int r0 = r8.f74044     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + 1
            java.lang.Object[] r2 = r8.f74040     // Catch: java.lang.Throwable -> L5f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 % r2
            r8.f74044 = r0     // Catch: java.lang.Throwable -> L5f
            l.۠۠᩵ r0 = l.C8058.f24861     // Catch: java.lang.Throwable -> L5f
            r1.unlock()
            if (r6 == 0) goto L5e
            l.C11233.m27799(r3)
        L5e:
            return r5
        L5f:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22997.mo30584():java.lang.Object");
    }

    @Override // l.AbstractC6064
    /* renamed from: ֫ */
    public final String mo16919() {
        return "(buffer:capacity=" + this.f74042 + ",size=" + this.size + ')';
    }

    public C22997(int i, EnumC13824 enumC13824) {
        this.f74042 = i;
        this.f74041 = enumC13824;
        if (i < 1) {
            throw new IllegalArgumentException(C18307.m42645(i, "ArrayChannel capacity must be at least 1, but ", " was specified").toString());
        }
        this.f74043 = new ReentrantLock();
        int min = Math.min(i, 8);
        Object[] objArr = new Object[min];
        Arrays.fill(objArr, 0, min, C10298.f31021);
        this.f74040 = objArr;
        this.size = 0;
    }
}
