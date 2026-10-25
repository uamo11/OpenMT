package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: TAXM */
/* renamed from: l.᩷ۛ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C20697 {
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    public volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66672 = AtomicReferenceFieldUpdater.newUpdater(C20697.class, Object.class, "_next");

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66673 = AtomicReferenceFieldUpdater.newUpdater(C20697.class, Object.class, "_prev");

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66671 = AtomicReferenceFieldUpdater.newUpdater(C20697.class, Object.class, "_removedRef");

    /* renamed from: ܺ */
    public boolean mo40262() {
        return m47316() instanceof C0234;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20697 m47312() {
        C20697 c20697;
        Object m47316 = m47316();
        C0234 c0234 = m47316 instanceof C0234 ? (C0234) m47316 : null;
        return (c0234 == null || (c20697 = c0234.f1504) == null) ? (C20697) m47316 : c20697;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20697 m47315() {
        C20697 m47306 = m47306();
        if (m47306 != null) {
            return m47306;
        }
        Object obj = this._prev;
        while (true) {
            C20697 c20697 = (C20697) obj;
            if (!c20697.mo40262()) {
                return c20697;
            }
            obj = c20697._prev;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47309(C23703 c23703) {
        f66673.lazySet(c23703, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66672;
        atomicReferenceFieldUpdater.lazySet(c23703, this);
        while (m47316() == this) {
            while (!atomicReferenceFieldUpdater.compareAndSet(this, this, c23703)) {
                if (atomicReferenceFieldUpdater.get(this) != this) {
                    break;
                }
            }
            c23703.m47305(this);
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47310(C20697 c20697, C17168 c17168) {
        f66673.lazySet(c20697, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66672;
        atomicReferenceFieldUpdater.lazySet(c20697, c17168);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c17168, c20697)) {
            if (atomicReferenceFieldUpdater.get(this) != c17168) {
                return false;
            }
        }
        c20697.m47305(c17168);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47308(C20697 c20697, C17168 c17168, AbstractC23518 abstractC23518) {
        f66673.lazySet(c20697, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66672;
        atomicReferenceFieldUpdater.lazySet(c20697, c17168);
        abstractC23518.f75486 = c17168;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c17168, abstractC23518)) {
            if (atomicReferenceFieldUpdater.get(this) != c17168) {
                return 0;
            }
        }
        return abstractC23518.mo33080(this) == null ? 1 : 2;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20697 m47311() {
        while (true) {
            Object m47316 = m47316();
            if (m47316 instanceof C0234) {
                return ((C0234) m47316).f1504;
            }
            if (m47316 == this) {
                return (C20697) m47316;
            }
            C20697 c20697 = (C20697) m47316;
            C0234 c0234 = (C0234) c20697._removedRef;
            if (c0234 == null) {
                c0234 = new C0234(c20697);
                f66671.lazySet(c20697, c0234);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66672;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, m47316, c0234)) {
                if (atomicReferenceFieldUpdater.get(this) != m47316) {
                    break;
                }
            }
            c20697.m47306();
            return null;
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m47314() {
        ((C0234) m47316()).f1504.m47313();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m47313() {
        C20697 c20697 = this;
        while (true) {
            Object m47316 = c20697.m47316();
            if (m47316 instanceof C0234) {
                c20697 = ((C0234) m47316).f1504;
            } else {
                c20697.m47306();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r5 = l.C20697.f66672;
        r4 = ((l.C0234) r4).f1504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r5.compareAndSet(r3, r2, r4) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r5.get(r3) == r2) goto L52;
     */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final l.C20697 m47306() {
        /*
            r8 = this;
        L0:
            java.lang.Object r0 = r8._prev
            l.᩷ۛ᩵ r0 = (l.C20697) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r8) goto L1e
            if (r0 != r2) goto Le
            goto L27
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = l.C20697.f66673
        L10:
            boolean r1 = r5.compareAndSet(r8, r0, r2)
            if (r1 == 0) goto L17
            goto L27
        L17:
            java.lang.Object r1 = r5.get(r8)
            if (r1 == r0) goto L10
            goto L0
        L1e:
            boolean r5 = r8.mo40262()
            if (r5 == 0) goto L25
            return r1
        L25:
            if (r4 != 0) goto L28
        L27:
            return r2
        L28:
            boolean r5 = r4 instanceof l.AbstractC19286
            if (r5 == 0) goto L32
            l.᩵ۛ᩵ r4 = (l.AbstractC19286) r4
            r4.mo33080(r2)
            goto L0
        L32:
            boolean r5 = r4 instanceof l.C0234
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = l.C20697.f66672
            l.֡ۛ᩵ r4 = (l.C0234) r4
            l.᩷ۛ᩵ r4 = r4.f1504
        L3e:
            boolean r6 = r5.compareAndSet(r3, r2, r4)
            if (r6 == 0) goto L46
            r2 = r3
            goto L6
        L46:
            java.lang.Object r6 = r5.get(r3)
            if (r6 == r2) goto L3e
            goto L0
        L4d:
            java.lang.Object r2 = r2._prev
            l.᩷ۛ᩵ r2 = (l.C20697) r2
            goto L7
        L52:
            r3 = r4
            l.᩷ۛ᩵ r3 = (l.C20697) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20697.m47306():l.᩷ۛ᩵");
    }

    public String toString() {
        return new C6585(this) + '@' + C11024.m27354(this);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object m47316() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC19286)) {
                return obj;
            }
            ((AbstractC19286) obj).mo33080(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47305(C20697 c20697) {
        while (true) {
            C20697 c206972 = (C20697) c20697._prev;
            if (m47316() != c20697) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66673;
            while (!atomicReferenceFieldUpdater.compareAndSet(c20697, c206972, this)) {
                if (atomicReferenceFieldUpdater.get(c20697) != c206972) {
                    break;
                }
            }
            if (mo40262()) {
                c20697.m47306();
                return;
            }
            return;
        }
    }
}
