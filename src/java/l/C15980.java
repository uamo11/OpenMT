package l;

import java.util.function.IntFunction;

/* compiled from: N673 */
/* renamed from: l.ܺܰᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15980 extends AbstractC17392 {
    public final AbstractC12725 j;
    public final IntFunction k;

    /* renamed from: l, reason: collision with root package name */
    public final long f77965l;
    public final long m;
    public long n;
    public volatile boolean o;

    @Override // l.AbstractC17392
    public final void f() {
        this.i = true;
        if (this.o) {
            d(AbstractC9198.P(this.j.m0()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        if (r2 >= r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15980.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public C15980(AbstractC12725 abstractC12725, AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction, long j, long j2) {
        super(abstractC9198, interfaceC15234);
        this.j = abstractC12725;
        this.k = intFunction;
        this.f77965l = j;
        this.m = j2;
    }

    public C15980(C15980 c15980, InterfaceC15234 interfaceC15234) {
        super(c15980, interfaceC15234);
        this.j = c15980.j;
        this.k = c15980.k;
        this.f77965l = c15980.f77965l;
        this.m = c15980.m;
    }

    @Override // l.AbstractC13158
    public final AbstractC13158 c(InterfaceC15234 interfaceC15234) {
        return new C15980(this, interfaceC15234);
    }

    @Override // l.AbstractC17392
    public final Object h() {
        return AbstractC9198.P(this.j.m0());
    }

    @Override // l.AbstractC13158
    public final Object a() {
        if (b()) {
            EnumC7330 enumC7330 = EnumC7330.SIZED;
            AbstractC12725 abstractC12725 = this.j;
            int i = abstractC12725.j;
            int i2 = enumC7330.e;
            InterfaceC8948 c0 = this.j.c0((i & i2) == i2 ? abstractC12725.R(this.b) : -1L, this.k);
            InterfaceC0585 q0 = this.j.q0(((AbstractC12725) this.a).m, c0);
            AbstractC9198 abstractC9198 = this.a;
            abstractC9198.N(this.b, abstractC9198.g0(q0));
            return c0.build();
        }
        InterfaceC8948 c02 = this.j.c0(-1L, this.k);
        if (this.f77965l == 0) {
            InterfaceC0585 q02 = this.j.q0(((AbstractC12725) this.a).m, c02);
            AbstractC9198 abstractC91982 = this.a;
            abstractC91982.N(this.b, abstractC91982.g0(q02));
        } else {
            this.a.f0(this.b, c02);
        }
        InterfaceC5214 build = c02.build();
        this.n = build.count();
        this.o = true;
        this.b = null;
        return build;
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        C15980 c15980 = (C15980) this.d;
        C15980 c159802 = (C15980) this.e;
        if (c15980 == null || c159802 == null) {
            return this.n;
        }
        long j2 = c15980.j(j);
        return j2 >= j ? j2 : c159802.j(j) + j2;
    }
}
