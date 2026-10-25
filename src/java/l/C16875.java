package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: N673 */
/* renamed from: l.ܽ᩶ᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16875 implements InterfaceC14115, InterfaceC15672, InterfaceC2974, Serializable {
    public static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC13410 a;
    public final transient C7248 b;

    @Override // java.lang.Comparable
    /* renamed from: L */
    public final /* synthetic */ int compareTo(InterfaceC14115 interfaceC14115) {
        return AbstractC22791.c(this, interfaceC14115);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ Object T(C8556 c8556) {
        return AbstractC22791.h(this, c8556);
    }

    @Override // l.InterfaceC14115
    public final /* synthetic */ long r(C18078 c18078) {
        return AbstractC22791.j(this, c18078);
    }

    public static C16875 V(InterfaceC2765 interfaceC2765, InterfaceC15672 interfaceC15672) {
        C16875 c16875 = (C16875) interfaceC15672;
        if (interfaceC2765.equals(c16875.a.a())) {
            return c16875;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC2765.k() + ", actual: " + c16875.a.a().k());
    }

    public C16875(InterfaceC13410 interfaceC13410, C7248 c7248) {
        C11003.requireNonNull(interfaceC13410, "date");
        C11003.requireNonNull(c7248, "time");
        this.a = interfaceC13410;
        this.b = c7248;
    }

    public final C16875 Z(InterfaceC15672 interfaceC15672, C7248 c7248) {
        InterfaceC13410 interfaceC13410 = this.a;
        return (interfaceC13410 == interfaceC15672 && this.b == c7248) ? this : new C16875(AbstractC12000.V(interfaceC13410.a(), interfaceC15672), c7248);
    }

    @Override // l.InterfaceC15672
    /* renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return V(this.a.a(), AbstractC5796.b(this, j, enumC8618));
    }

    @Override // l.InterfaceC14115
    public final InterfaceC2765 a() {
        return this.a.a();
    }

    @Override // l.InterfaceC14115
    public final InterfaceC13410 f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // l.InterfaceC14115
    public final C7248 b() {
        return this.b;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030 != null && interfaceC10030.l(this);
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        return enumC18496.isDateBased() || enumC18496.V();
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (!((EnumC18496) interfaceC10030).V()) {
                return this.a.n(interfaceC10030);
            }
            C7248 c7248 = this.b;
            c7248.getClass();
            return AbstractC5796.d(c7248, interfaceC10030);
        }
        return interfaceC10030.m(this);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return ((EnumC18496) interfaceC10030).V() ? this.b.l(interfaceC10030) : this.a.l(interfaceC10030);
        }
        return n(interfaceC10030).a(G(interfaceC10030), interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return ((EnumC18496) interfaceC10030).V() ? this.b.G(interfaceC10030) : this.a.G(interfaceC10030);
        }
        return interfaceC10030.C(this);
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return Z(c19056, this.b);
    }

    @Override // l.InterfaceC15672
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C16875 c(long j, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (((EnumC18496) interfaceC10030).V()) {
                return Z(this.a, this.b.c(j, interfaceC10030));
            }
            return Z(this.a.c(j, interfaceC10030), this.b);
        }
        return V(this.a.a(), interfaceC10030.G(this, j));
    }

    @Override // l.InterfaceC15672
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C16875 d(long j, InterfaceC3679 interfaceC3679) {
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return V(this.a.a(), interfaceC3679.m(this, j));
        }
        switch (AbstractC2059.a[((EnumC8618) interfaceC3679).ordinal()]) {
            case 1:
                return X(this.a, 0L, 0L, 0L, j);
            case 2:
                C16875 Z = Z(this.a.d(j / 86400000000L, (InterfaceC3679) EnumC8618.DAYS), this.b);
                return Z.X(Z.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C16875 Z2 = Z(this.a.d(j / 86400000, (InterfaceC3679) EnumC8618.DAYS), this.b);
                return Z2.X(Z2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return X(this.a, 0L, 0L, j, 0L);
            case 5:
                return X(this.a, 0L, j, 0L, 0L);
            case 6:
                return X(this.a, j, 0L, 0L, 0L);
            case 7:
                C16875 Z3 = Z(this.a.d(j / 256, (InterfaceC3679) EnumC8618.DAYS), this.b);
                return Z3.X(Z3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return Z(this.a.d(j, interfaceC3679), this.b);
        }
    }

    public final C16875 X(InterfaceC13410 interfaceC13410, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return Z(interfaceC13410, this.b);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long h0 = this.b.h0();
        long j7 = j6 + h0;
        long z = AbstractC22791.z(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long O = AbstractC22791.O(j7, 86400000000000L);
        return Z(interfaceC13410.d(z, (InterfaceC3679) EnumC8618.DAYS), O == h0 ? this.b : C7248.a0(O));
    }

    @Override // l.InterfaceC14115
    public final InterfaceC22583 D(AbstractC5650 abstractC5650) {
        return C9115.V(abstractC5650, null, this);
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        int i;
        C11003.requireNonNull(interfaceC15672, "endExclusive");
        InterfaceC14115 J = this.a.a().J(interfaceC15672);
        if (!(interfaceC3679 instanceof EnumC8618)) {
            C11003.requireNonNull(interfaceC3679, "unit");
            return interfaceC3679.l(this, J);
        }
        EnumC8618 enumC8618 = (EnumC8618) interfaceC3679;
        EnumC8618 enumC86182 = EnumC8618.DAYS;
        if (enumC8618.compareTo(enumC86182) >= 0) {
            InterfaceC13410 f = J.f();
            if (J.b().compareTo(this.b) < 0) {
                f = f.w(1L, enumC86182);
            }
            return this.a.g(f, interfaceC3679);
        }
        EnumC18496 enumC18496 = EnumC18496.EPOCH_DAY;
        long G = J.G(enumC18496) - this.a.G(enumC18496);
        switch (AbstractC2059.a[enumC8618.ordinal()]) {
            case 1:
                G = AbstractC22791.Q(G, 86400000000000L);
                break;
            case 2:
                G = AbstractC22791.Q(G, 86400000000L);
                break;
            case 3:
                G = AbstractC22791.Q(G, 86400000L);
                break;
            case 4:
                i = 86400;
                G = AbstractC22791.Q(G, i);
                break;
            case 5:
                i = 1440;
                G = AbstractC22791.Q(G, i);
                break;
            case 6:
                i = 24;
                G = AbstractC22791.Q(G, i);
                break;
            case 7:
                i = 2;
                G = AbstractC22791.Q(G, i);
                break;
        }
        return AbstractC22791.P(G, this.b.g(J.b(), interfaceC3679));
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(f().H(), EnumC18496.EPOCH_DAY).c(b().h0(), EnumC18496.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new C7766((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC14115) && AbstractC22791.c(this, (InterfaceC14115) obj) == 0;
    }
}
