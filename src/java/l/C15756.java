package l;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.math.raw.Mod;

/* compiled from: 4AYL */
/* renamed from: l.ܺۛ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15756 {
    public volatile /* synthetic */ Object _next = null;
    public volatile /* synthetic */ long _state = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public /* synthetic */ AtomicReferenceArray f48587;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f48588;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f48589;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f48590;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C15050 f48585 = new C15050("REMOVE_FROZEN");

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48584 = AtomicReferenceFieldUpdater.newUpdater(C15756.class, Object.class, "_next");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f48586 = AtomicLongFieldUpdater.newUpdater(C15756.class, "_state");

    public C15756(int i, boolean z) {
        this.f48588 = i;
        this.f48590 = z;
        int i2 = i - 1;
        this.f48589 = i2;
        this.f48587 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m37154() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m37153() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37152() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f48586.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37151(Object obj) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f48589;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.f48590 && this.f48587.get(i2 & i3) != null) {
                int i4 = this.f48588;
                if (i4 < 1024 || ((i2 - i) & Mod.M30) > (i4 >> 1)) {
                    return 1;
                }
            } else {
                if (f48586.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i2 + 1) & Mod.M30) << 30))) {
                    this.f48587.set(i2 & i3, obj);
                    C15756 c15756 = this;
                    while ((c15756._state & 1152921504606846976L) != 0) {
                        c15756 = c15756.m37156();
                        AtomicReferenceArray atomicReferenceArray = c15756.f48587;
                        int i5 = c15756.f48589 & i2;
                        Object obj2 = atomicReferenceArray.get(i5);
                        if ((obj2 instanceof C8702) && ((C8702) obj2).f26492 == i2) {
                            atomicReferenceArray.set(i5, obj);
                        } else {
                            c15756 = null;
                        }
                        if (c15756 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003a, code lost:
    
        return null;
     */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m37155() {
        /*
            r26 = this;
            r6 = r26
        L2:
            long r2 = r6._state
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r2 & r7
            r9 = 0
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 == 0) goto L11
            l.ܶۛ᩵ r0 = l.C15756.f48585
            return r0
        L11:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r2 & r11
            int r13 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r2
            r4 = 30
            long r0 = r0 >> r4
            int r1 = (int) r0
            int r0 = r6.f48589
            r1 = r1 & r0
            r0 = r0 & r13
            r14 = 0
            if (r1 != r0) goto L29
            goto L3a
        L29:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r6.f48587
            java.lang.Object r15 = r1.get(r0)
            if (r15 != 0) goto L36
            boolean r0 = r6.f48590
            if (r0 == 0) goto L2
            goto L3a
        L36:
            boolean r0 = r15 instanceof l.C8702
            if (r0 == 0) goto L3b
        L3a:
            return r14
        L3b:
            int r0 = r13 + 1
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = l.C15756.f48586
            r16 = -1073741824(0xffffffffc0000000, double:NaN)
            long r4 = r2 & r16
            long r9 = (long) r0
            long r4 = r4 | r9
            r0 = r1
            r1 = r26
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L5c
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f48587
            int r1 = r6.f48589
            r1 = r1 & r13
            r0.set(r1, r14)
            return r15
        L5c:
            boolean r0 = r6.f48590
            if (r0 == 0) goto L2
            r0 = r6
        L61:
            long r1 = r0._state
            long r3 = r1 & r11
            int r4 = (int) r3
            long r20 = r1 & r7
            r18 = 0
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 == 0) goto L73
            l.ܺۛ᩵ r0 = r0.m37156()
            goto L8c
        L73:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r20 = l.C15756.f48586
            long r21 = r1 & r16
            long r24 = r21 | r9
            r21 = r0
            r22 = r1
            boolean r1 = r20.compareAndSet(r21, r22, r24)
            if (r1 == 0) goto L61
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f48587
            int r0 = r0.f48589
            r0 = r0 & r4
            r1.set(r0, r14)
            r0 = r14
        L8c:
            if (r0 != 0) goto L61
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15756.m37155():java.lang.Object");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15756 m37156() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (f48586.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            C15756 c15756 = (C15756) this._next;
            if (c15756 != null) {
                return c15756;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48584;
            C15756 c157562 = new C15756(this.f48588 * 2, this.f48590);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f48589;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.f48587.get(i4);
                if (obj == null) {
                    obj = new C8702(i);
                }
                c157562.f48587.set(c157562.f48589 & i, obj);
                i++;
            }
            c157562._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c157562) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }
}
