package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: N673 */
/* renamed from: l.᩹᩶ᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22520 extends AbstractC4944 implements Serializable {
    public static final C22520 c = new C22520();
    public static final long serialVersionUID = 459996390165777884L;

    @Override // l.InterfaceC2765
    public final String k() {
        return "Japanese";
    }

    @Override // l.InterfaceC2765
    public final String o() {
        return "japanese";
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 M(int i, int i2, int i3) {
        return new C4881(C19056.h0(i, i2, i3));
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 q(int i, int i2) {
        return new C4881(C19056.j0(i, i2));
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 j(long j) {
        return new C4881(C19056.i0(j));
    }

    @Override // l.AbstractC4944
    public final InterfaceC13410 m() {
        return new C4881(C19056.X(C19056.g0(AbstractC9178.a())));
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 E(InterfaceC2268 interfaceC2268) {
        if (interfaceC2268 instanceof C4881) {
            return (C4881) interfaceC2268;
        }
        return new C4881(C19056.X(interfaceC2268));
    }

    @Override // l.InterfaceC2765
    public final List x() {
        C3470[] c3470Arr = C3470.e;
        return AbstractC22791.B((C3470[]) Arrays.copyOf(c3470Arr, c3470Arr.length));
    }

    @Override // l.InterfaceC2765
    public final boolean S(long j) {
        return C8409.c.S(j);
    }

    @Override // l.InterfaceC2765
    public final int z(InterfaceC4176 interfaceC4176, int i) {
        if (!(interfaceC4176 instanceof C3470)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = ((C3470) interfaceC4176).b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || interfaceC4176 != C3470.j(C19056.h0(i3, 1, 1)))) {
            throw new C16232("Invalid yearOfEra value");
        }
        return i3;
    }

    @Override // l.InterfaceC2765
    public final InterfaceC4176 y(int i) {
        return C3470.o(i);
    }

    @Override // l.InterfaceC2765
    public final C22729 v(EnumC18496 enumC18496) {
        switch (AbstractC21815.a[enumC18496.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C11441("Unsupported field: " + enumC18496);
            case 5:
                C3470[] c3470Arr = C3470.e;
                int i = c3470Arr[c3470Arr.length - 1].b.a;
                int i2 = BasicLabelFormatter.BILLION - c3470Arr[c3470Arr.length - 1].b.a;
                int i3 = c3470Arr[0].b.a;
                int i4 = 1;
                while (true) {
                    C3470[] c3470Arr2 = C3470.e;
                    if (i4 >= c3470Arr2.length) {
                        return C22729.g(1L, i2, 999999999 - i);
                    }
                    C3470 c3470 = c3470Arr2[i4];
                    i2 = Math.min(i2, (c3470.b.a - i3) + 1);
                    i3 = c3470.b.a;
                    i4++;
                }
            case 6:
                C3470 c34702 = C3470.d;
                long j = EnumC18496.DAY_OF_YEAR.b.c;
                long j2 = j;
                for (C3470 c34703 : C3470.e) {
                    long min = Math.min(j2, (c34703.b.Q() - c34703.b.a0()) + 1);
                    j2 = c34703.k() != null ? Math.min(min, c34703.k().b.a0() - 1) : min;
                }
                return C22729.g(1L, j2, EnumC18496.DAY_OF_YEAR.b.d);
            case 7:
                return C22729.f(C4881.d.a, 999999999L);
            case 8:
                long j3 = C3470.d.a;
                C3470[] c3470Arr3 = C3470.e;
                return C22729.f(j3, c3470Arr3[c3470Arr3.length - 1].a);
            default:
                return enumC18496.b;
        }
    }

    @Override // l.AbstractC4944, l.InterfaceC2765
    public final InterfaceC13410 O(Map map, EnumC17126 enumC17126) {
        return (C4881) super.O(map, enumC17126);
    }

    @Override // l.AbstractC4944
    public final InterfaceC13410 T(Map map, EnumC17126 enumC17126) {
        C19056 j0;
        C4881 c0;
        EnumC18496 enumC18496 = EnumC18496.ERA;
        Long l2 = (Long) map.get(enumC18496);
        C3470 o = l2 != null ? C3470.o(v(enumC18496).a(l2.longValue(), enumC18496)) : null;
        EnumC18496 enumC184962 = EnumC18496.YEAR_OF_ERA;
        Long l3 = (Long) map.get(enumC184962);
        int a = l3 != null ? v(enumC184962).a(l3.longValue(), enumC184962) : 0;
        if (o == null && l3 != null && !map.containsKey(EnumC18496.YEAR) && enumC17126 != EnumC17126.STRICT) {
            C3470[] c3470Arr = C3470.e;
            o = ((C3470[]) Arrays.copyOf(c3470Arr, c3470Arr.length))[((C3470[]) Arrays.copyOf(c3470Arr, c3470Arr.length)).length - 1];
        }
        if (l3 != null && o != null) {
            EnumC18496 enumC184963 = EnumC18496.MONTH_OF_YEAR;
            if (map.containsKey(enumC184963)) {
                EnumC18496 enumC184964 = EnumC18496.DAY_OF_MONTH;
                if (map.containsKey(enumC184964)) {
                    map.remove(enumC18496);
                    map.remove(enumC184962);
                    if (enumC17126 == EnumC17126.LENIENT) {
                        return new C4881(C19056.h0((o.b.a + a) - 1, 1, 1)).a0(AbstractC22791.R(((Long) map.remove(enumC184963)).longValue(), 1L), EnumC8618.MONTHS).a0(AbstractC22791.R(((Long) map.remove(enumC184964)).longValue(), 1L), EnumC8618.DAYS);
                    }
                    int a2 = v(enumC184963).a(((Long) map.remove(enumC184963)).longValue(), enumC184963);
                    int a3 = v(enumC184964).a(((Long) map.remove(enumC184964)).longValue(), enumC184964);
                    if (enumC17126 != EnumC17126.SMART) {
                        C19056 c19056 = C4881.d;
                        C11003.requireNonNull(o, "era");
                        C19056 h0 = C19056.h0((o.b.a + a) - 1, a2, a3);
                        if (h0.c0(o.b) || o != C3470.j(h0)) {
                            throw new C16232("year, month, and day not valid for Era");
                        }
                        return new C4881(o, a, h0);
                    }
                    if (a < 1) {
                        throw new C16232("Invalid YearOfEra: " + a);
                    }
                    int i = (o.b.a + a) - 1;
                    try {
                        c0 = new C4881(C19056.h0(i, a2, a3));
                    } catch (C16232 unused) {
                        c0 = new C4881(C19056.h0(i, a2, 1)).c0(new C8556(3));
                    }
                    if (c0.b == o || AbstractC5796.a(c0, EnumC18496.YEAR_OF_ERA) <= 1 || a <= 1) {
                        return c0;
                    }
                    throw new C16232("Invalid YearOfEra for Era: " + o + " " + a);
                }
            }
            EnumC18496 enumC184965 = EnumC18496.DAY_OF_YEAR;
            if (map.containsKey(enumC184965)) {
                map.remove(enumC18496);
                map.remove(enumC184962);
                if (enumC17126 == EnumC17126.LENIENT) {
                    return new C4881(C19056.j0((o.b.a + a) - 1, 1)).a0(AbstractC22791.R(((Long) map.remove(enumC184965)).longValue(), 1L), EnumC8618.DAYS);
                }
                int a4 = v(enumC184965).a(((Long) map.remove(enumC184965)).longValue(), enumC184965);
                C19056 c190562 = C4881.d;
                C11003.requireNonNull(o, "era");
                if (a == 1) {
                    C19056 c190563 = o.b;
                    j0 = C19056.j0(c190563.a, (c190563.a0() + a4) - 1);
                } else {
                    j0 = C19056.j0((o.b.a + a) - 1, a4);
                }
                if (j0.c0(o.b) || o != C3470.j(j0)) {
                    throw new C16232("Invalid parameters");
                }
                return new C4881(o, a, j0);
            }
        }
        return null;
    }

    @Override // l.InterfaceC2765
    public final InterfaceC22583 P(C4239 c4239, AbstractC5650 abstractC5650) {
        return C9115.W(this, c4239, abstractC5650);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C7766((byte) 1, this);
    }
}
