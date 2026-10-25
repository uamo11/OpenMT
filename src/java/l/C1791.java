package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: N673 */
/* renamed from: l.֫ۧ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1791 extends AbstractC13158 {
    public final AbstractC12725 h;
    public final IntFunction i;
    public final boolean j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f77959l;

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC13158 abstractC13158 = this.d;
        if (abstractC13158 != null) {
            if (this.j) {
                C1791 c1791 = (C1791) abstractC13158;
                long j = c1791.f77959l;
                this.f77959l = j;
                if (j == c1791.k) {
                    this.f77959l = j + ((C1791) this.e).f77959l;
                }
            }
            C1791 c17912 = (C1791) abstractC13158;
            long j2 = c17912.k;
            C1791 c17913 = (C1791) this.e;
            this.k = j2 + c17913.k;
            InterfaceC5214 L = c17912.k == 0 ? (InterfaceC5214) c17913.f : c17913.k == 0 ? (InterfaceC5214) c17912.f : AbstractC9198.L(this.h.m0(), (InterfaceC5214) ((C1791) this.d).f, (InterfaceC5214) ((C1791) this.e).f);
            if (b() && this.j) {
                L = L.j(this.f77959l, L.count(), this.i);
            }
            this.f = L;
        }
        super.onCompletion(countedCompleter);
    }

    public C1791(AbstractC12725 abstractC12725, AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        super(abstractC9198, interfaceC15234);
        this.h = abstractC12725;
        this.i = intFunction;
        this.j = EnumC7330.ORDERED.s(((AbstractC12725) abstractC9198).m);
    }

    public C1791(C1791 c1791, InterfaceC15234 interfaceC15234) {
        super(c1791, interfaceC15234);
        this.h = c1791.h;
        this.i = c1791.i;
        this.j = c1791.j;
    }

    @Override // l.AbstractC13158
    public final AbstractC13158 c(InterfaceC15234 interfaceC15234) {
        return new C1791(this, interfaceC15234);
    }

    @Override // l.AbstractC13158
    public final Object a() {
        long j;
        boolean b = b();
        if (!b && this.j) {
            EnumC7330 enumC7330 = EnumC7330.SIZED;
            AbstractC12725 abstractC12725 = this.h;
            int i = abstractC12725.j;
            int i2 = enumC7330.e;
            if ((i & i2) == i2) {
                j = abstractC12725.R(this.b);
                InterfaceC8948 c0 = this.a.c0(j, this.i);
                InterfaceC19868 d = ((InterfaceC2228) this.h).d(c0, (this.j || b) ? false : true);
                this.a.f0(this.b, d);
                InterfaceC5214 build = c0.build();
                this.k = build.count();
                this.f77959l = d.h();
                return build;
            }
        }
        j = -1;
        InterfaceC8948 c02 = this.a.c0(j, this.i);
        InterfaceC19868 d2 = ((InterfaceC2228) this.h).d(c02, (this.j || b) ? false : true);
        this.a.f0(this.b, d2);
        InterfaceC5214 build2 = c02.build();
        this.k = build2.count();
        this.f77959l = d2.h();
        return build2;
    }
}
