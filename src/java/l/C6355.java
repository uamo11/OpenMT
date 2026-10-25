package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: N673 */
/* renamed from: l.ۛ᩹ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6355 extends AbstractC12000 {
    public static final long serialVersionUID = 1300372329181994526L;
    public final transient C19056 a;

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC14115 I(C7248 c7248) {
        return new C16875(this, c7248);
    }

    public C6355(C19056 c19056) {
        C11003.requireNonNull(c19056, "isoDate");
        this.a = c19056;
    }

    @Override // l.InterfaceC13410
    public final InterfaceC2765 a() {
        return C3533.c;
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final int hashCode() {
        C3533.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC4176 K() {
        return a0() >= 1 ? EnumC23288.ROC : EnumC23288.BEFORE_ROC;
    }

    @Override // l.AbstractC12000, l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.m(this);
        }
        if (!AbstractC22791.f(this, interfaceC10030)) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        int i = AbstractC12705.a[enumC18496.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.n(interfaceC10030);
        }
        if (i != 4) {
            return C3533.c.v(enumC18496);
        }
        C22729 c22729 = EnumC18496.YEAR.b;
        return C22729.f(1L, a0() <= 0 ? (-c22729.a) + 1912 : c22729.d - 1911);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            int i = AbstractC12705.a[((EnumC18496) interfaceC10030).ordinal()];
            if (i == 4) {
                int a0 = a0();
                if (a0 < 1) {
                    a0 = 1 - a0;
                }
                return a0;
            }
            if (i == 5) {
                return ((a0() * 12) + this.a.b) - 1;
            }
            if (i == 6) {
                return a0();
            }
            if (i != 7) {
                return this.a.G(interfaceC10030);
            }
            return a0() < 1 ? 0 : 1;
        }
        return interfaceC10030.C(this);
    }

    public final int a0() {
        return this.a.a - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // l.AbstractC12000, l.InterfaceC15672
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C6355 c(long r8, l.InterfaceC10030 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof l.EnumC18496
            if (r0 == 0) goto La0
            r0 = r10
            l.ᩴۗᩴ r0 = (l.EnumC18496) r0
            long r1 = r7.G(r0)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L10
            return r7
        L10:
            int[] r1 = l.AbstractC12705.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L4a
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L4a
            if (r2 == r3) goto L4a
            goto L60
        L25:
            l.ۗ᩹ᩴ r10 = l.C3533.c
            l.᩺ۗᩴ r10 = r10.v(r0)
            r10.b(r8, r0)
            int r10 = r7.a0()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            l.ᩴ᩹ᩴ r10 = r7.a
            short r2 = r10.b
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            l.ᩴ᩹ᩴ r8 = r10.m0(r8)
            l.ۛ᩹ᩴ r8 = r7.c0(r8)
            return r8
        L4a:
            l.ۗ᩹ᩴ r2 = l.C3533.c
            l.᩺ۗᩴ r2 = r2.v(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L89
            if (r0 == r4) goto L7c
            if (r0 == r3) goto L6b
        L60:
            l.ᩴ᩹ᩴ r0 = r7.a
            l.ᩴ᩹ᩴ r8 = r0.c(r8, r10)
            l.ۛ᩹ᩴ r8 = r7.c0(r8)
            return r8
        L6b:
            l.ᩴ᩹ᩴ r8 = r7.a
            int r9 = r7.a0()
            int r9 = 1912 - r9
            l.ᩴ᩹ᩴ r8 = r8.s0(r9)
            l.ۛ᩹ᩴ r8 = r7.c0(r8)
            return r8
        L7c:
            l.ᩴ᩹ᩴ r8 = r7.a
            int r2 = r2 + 1911
            l.ᩴ᩹ᩴ r8 = r8.s0(r2)
            l.ۛ᩹ᩴ r8 = r7.c0(r8)
            return r8
        L89:
            l.ᩴ᩹ᩴ r8 = r7.a
            int r9 = r7.a0()
            r10 = 1
            if (r9 < r10) goto L95
            int r2 = r2 + 1911
            goto L97
        L95:
            int r2 = 1912 - r2
        L97:
            l.ᩴ᩹ᩴ r8 = r8.s0(r2)
            l.ۛ᩹ᩴ r8 = r7.c0(r8)
            return r8
        La0:
            l.۬᩹ᩴ r8 = super.c(r8, r10)
            l.ۛ᩹ᩴ r8 = (l.C6355) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6355.c(long, l.ۤۗᩴ):l.ۛ᩹ᩴ");
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    /* renamed from: B */
    public final InterfaceC13410 m(InterfaceC2974 interfaceC2974) {
        return (C6355) super.m(interfaceC2974);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return (C6355) super.m(c19056);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC13410 N(InterfaceC12146 interfaceC12146) {
        return (C6355) super.N(interfaceC12146);
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 Z(long j) {
        return c0(this.a.o0(j));
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 Y(long j) {
        return c0(this.a.m0(j));
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 X(long j) {
        return c0(this.a.l0(j));
    }

    @Override // l.AbstractC12000, l.InterfaceC13410, l.InterfaceC15672
    public final InterfaceC13410 d(long j, InterfaceC3679 interfaceC3679) {
        return (C6355) super.d(j, interfaceC3679);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    public final InterfaceC15672 d(long j, InterfaceC3679 interfaceC3679) {
        return (C6355) super.d(j, interfaceC3679);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    /* renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return (C6355) super.w(j, enumC8618);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC13410 w(long j, InterfaceC3679 interfaceC3679) {
        return (C6355) super.w(j, interfaceC3679);
    }

    public final C6355 c0(C19056 c19056) {
        return c19056.equals(this.a) ? this : new C6355(c19056);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final long H() {
        return this.a.H();
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6355) {
            return this.a.equals(((C6355) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C7766((byte) 7, this);
    }
}
