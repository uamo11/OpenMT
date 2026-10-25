package l;

import java.util.ArrayDeque;

/* compiled from: 78QG */
/* renamed from: l.ۙᩴۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC4833 implements InterfaceC7222 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f15269 = new ArrayDeque();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f15270;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f15271;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22472 f15272;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f15273;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f15274;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f15275;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo14074(C18239 c18239);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC13571 mo14077();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract boolean mo14078();

    @Override // l.InterfaceC1381
    /* renamed from: ֫ */
    public final void mo4862(Object obj) {
        C18239 c18239 = (C18239) obj;
        C22632.m50631(c18239 == this.f15272);
        C22472 c22472 = (C22472) c18239;
        if (!c22472.m12697()) {
            long j = c22472.f69997;
            if (j != Long.MIN_VALUE) {
                long j2 = this.f15274;
                if (j2 != -9223372036854775807L && j < j2) {
                    c22472.mo7();
                    this.f15269.add(c22472);
                    this.f15272 = null;
                }
            }
        }
        long j3 = this.f15271;
        this.f15271 = 1 + j3;
        c22472.f72776 = j3;
        this.f15275.add(c22472);
        this.f15272 = null;
    }

    public AbstractC4833() {
        for (int i = 0; i < 10; i++) {
            this.f15269.add(new C22472(0));
        }
        this.f15270 = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f15270.add(new C20356(new C21767(this)));
        }
        this.f15275 = new ArrayDeque();
        this.f15274 = -9223372036854775807L;
    }

    @Override // l.InterfaceC1381
    /* renamed from: ۧ */
    public final void mo4864(long j) {
        this.f15274 = j;
    }

    @Override // l.InterfaceC7222
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo14072(long j) {
        this.f15273 = j;
    }

    @Override // l.InterfaceC1381
    /* renamed from: ܽ */
    public final Object mo4865() {
        C22632.m50634(this.f15272 == null);
        ArrayDeque arrayDeque = this.f15269;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C22472 c22472 = (C22472) arrayDeque.pollFirst();
        this.f15272 = c22472;
        return c22472;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r1.mo7();
        r3.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        return r0;
     */
    @Override // l.InterfaceC1381
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.AbstractC17533 mo4863() {
        /*
            r10 = this;
            java.util.ArrayDeque r0 = r10.f15270
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9
            goto L66
        L9:
            java.util.ArrayDeque r1 = r10.f15275
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L66
            java.lang.Object r2 = r1.peek()
            l.᩹ᩴۧ r2 = (l.C22472) r2
            java.lang.String r3 = l.C3603.f11424
            long r2 = r2.f69997
            long r4 = r10.f15273
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L66
            java.lang.Object r1 = r1.poll()
            l.᩹ᩴۧ r1 = (l.C22472) r1
            boolean r2 = r1.m12697()
            java.util.ArrayDeque r3 = r10.f15269
            if (r2 == 0) goto L40
            java.lang.Object r0 = r0.pollFirst()
            l.ܿᩴۧ r0 = (l.AbstractC17533) r0
            r2 = 4
            r0.m12691(r2)
        L39:
            r1.mo7()
            r3.add(r1)
            return r0
        L40:
            r10.mo14074(r1)
            boolean r2 = r10.mo14078()
            if (r2 == 0) goto L5f
            l.ܰۘۧ r7 = r10.mo14077()
            java.lang.Object r0 = r0.pollFirst()
            l.ܿᩴۧ r0 = (l.AbstractC17533) r0
            long r5 = r1.f69997
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = r0
            r4.m40971(r5, r7, r8)
            goto L39
        L5f:
            r1.mo7()
            r3.add(r1)
            goto L9
        L66:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC4833.mo4863():l.ܿᩴۧ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14073(AbstractC17533 abstractC17533) {
        abstractC17533.mo7();
        this.f15270.add(abstractC17533);
    }

    @Override // l.InterfaceC1381
    public void flush() {
        ArrayDeque arrayDeque;
        this.f15271 = 0L;
        this.f15273 = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f15275;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f15269;
            if (isEmpty) {
                break;
            }
            C22472 c22472 = (C22472) arrayDeque2.poll();
            String str = C3603.f11424;
            c22472.mo7();
            arrayDeque.add(c22472);
        }
        C22472 c224722 = this.f15272;
        if (c224722 != null) {
            c224722.mo7();
            arrayDeque.add(c224722);
            this.f15272 = null;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC17533 m14076() {
        return (AbstractC17533) this.f15270.pollFirst();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m14075() {
        return this.f15273;
    }
}
