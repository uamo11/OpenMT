package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: N673 */
/* renamed from: l.ܺۧ᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15901 extends AbstractC17392 {
    public final AbstractC12725 j;
    public final IntFunction k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f77963l;
    public long m;
    public boolean n;
    public volatile boolean o;

    @Override // l.AbstractC17392
    public final void f() {
        this.i = true;
        if (this.f77963l && this.o) {
            d(AbstractC9198.P(this.j.m0()));
        }
    }

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object L;
        AbstractC13158 abstractC13158 = this.d;
        if (abstractC13158 != null) {
            this.n = ((C15901) abstractC13158).n | ((C15901) this.e).n;
            if (this.f77963l && this.i) {
                this.m = 0L;
                L = AbstractC9198.P(this.j.m0());
            } else {
                if (this.f77963l) {
                    C15901 c15901 = (C15901) this.d;
                    if (c15901.n) {
                        this.m = c15901.m;
                        L = (InterfaceC5214) c15901.i();
                    }
                }
                C15901 c159012 = (C15901) this.d;
                long j = c159012.m;
                C15901 c159013 = (C15901) this.e;
                this.m = j + c159013.m;
                if (c159012.m == 0) {
                    L = (InterfaceC5214) c159013.i();
                } else if (c159013.m == 0) {
                    L = (InterfaceC5214) c159012.i();
                } else {
                    L = AbstractC9198.L(this.j.m0(), (InterfaceC5214) ((C15901) this.d).i(), (InterfaceC5214) ((C15901) this.e).i());
                }
            }
            d(L);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public C15901(AbstractC12725 abstractC12725, AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        super(abstractC9198, interfaceC15234);
        this.j = abstractC12725;
        this.k = intFunction;
        this.f77963l = EnumC7330.ORDERED.s(((AbstractC12725) abstractC9198).m);
    }

    public C15901(C15901 c15901, InterfaceC15234 interfaceC15234) {
        super(c15901, interfaceC15234);
        this.j = c15901.j;
        this.k = c15901.k;
        this.f77963l = c15901.f77963l;
    }

    @Override // l.AbstractC13158
    public final AbstractC13158 c(InterfaceC15234 interfaceC15234) {
        return new C15901(this, interfaceC15234);
    }

    @Override // l.AbstractC17392
    public final Object h() {
        return AbstractC9198.P(this.j.m0());
    }

    @Override // l.AbstractC13158
    public final Object a() {
        InterfaceC8948 c0 = this.a.c0(-1L, this.k);
        InterfaceC0585 q0 = this.j.q0(((AbstractC12725) this.a).m, c0);
        AbstractC9198 abstractC9198 = this.a;
        boolean N = abstractC9198.N(this.b, abstractC9198.g0(q0));
        this.n = N;
        if (N) {
            g();
        }
        InterfaceC5214 build = c0.build();
        this.m = build.count();
        return build;
    }
}
