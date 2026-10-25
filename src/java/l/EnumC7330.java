package l;

import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: N673 */
/* renamed from: l.۟۟ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class EnumC7330 {
    public static final EnumC7330 DISTINCT;
    public static final EnumC7330 ORDERED;
    public static final EnumC7330 SHORT_CIRCUIT;
    public static final EnumC7330 SIZED;
    public static final EnumC7330 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f77960l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ EnumC7330[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static EnumC7330 valueOf(String str) {
        return (EnumC7330) Enum.valueOf(EnumC7330.class, str);
    }

    public static EnumC7330[] values() {
        return (EnumC7330[]) v.clone();
    }

    static {
        EnumC22147 enumC22147 = EnumC22147.SPLITERATOR;
        C17022 C = C(enumC22147);
        EnumC22147 enumC221472 = EnumC22147.STREAM;
        C.a(enumC221472);
        EnumC22147 enumC221473 = EnumC22147.OP;
        ((EnumMap) ((Map) C.b)).put((EnumMap) enumC221473, (EnumC22147) 3);
        EnumC7330 enumC7330 = new EnumC7330("DISTINCT", 0, 0, C);
        DISTINCT = enumC7330;
        C17022 C2 = C(enumC22147);
        C2.a(enumC221472);
        ((EnumMap) ((Map) C2.b)).put((EnumMap) enumC221473, (EnumC22147) 3);
        EnumC7330 enumC73302 = new EnumC7330("SORTED", 1, 1, C2);
        SORTED = enumC73302;
        C17022 C3 = C(enumC22147);
        C3.a(enumC221472);
        ((EnumMap) ((Map) C3.b)).put((EnumMap) enumC221473, (EnumC22147) 3);
        EnumC22147 enumC221474 = EnumC22147.TERMINAL_OP;
        ((EnumMap) ((Map) C3.b)).put((EnumMap) enumC221474, (EnumC22147) 2);
        EnumC22147 enumC221475 = EnumC22147.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) C3.b)).put((EnumMap) enumC221475, (EnumC22147) 2);
        EnumC7330 enumC73303 = new EnumC7330("ORDERED", 2, 2, C3);
        ORDERED = enumC73303;
        C17022 C4 = C(enumC22147);
        C4.a(enumC221472);
        ((EnumMap) ((Map) C4.b)).put((EnumMap) enumC221473, (EnumC22147) 2);
        EnumC7330 enumC73304 = new EnumC7330("SIZED", 3, 3, C4);
        SIZED = enumC73304;
        C17022 C5 = C(enumC221473);
        C5.a(enumC221474);
        int i2 = 0;
        EnumC7330 enumC73305 = new EnumC7330("SHORT_CIRCUIT", 4, 12, C5);
        SHORT_CIRCUIT = enumC73305;
        v = new EnumC7330[]{enumC7330, enumC73302, enumC73303, enumC73304, enumC73305};
        f = m(enumC22147);
        g = m(enumC221472);
        h = m(enumC221473);
        m(enumC221474);
        m(enumC221475);
        for (EnumC7330 enumC73306 : values()) {
            i2 |= enumC73306.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        f77960l = i3 | i4;
        EnumC7330 enumC73307 = DISTINCT;
        m = enumC73307.c;
        n = enumC73307.d;
        EnumC7330 enumC73308 = SORTED;
        o = enumC73308.c;
        p = enumC73308.d;
        EnumC7330 enumC73309 = ORDERED;
        q = enumC73309.c;
        r = enumC73309.d;
        EnumC7330 enumC733010 = SIZED;
        s = enumC733010.c;
        t = enumC733010.d;
        u = SHORT_CIRCUIT.c;
    }

    public static C17022 C(EnumC22147 enumC22147) {
        C17022 c17022 = new C17022(15, new EnumMap(EnumC22147.class));
        c17022.a(enumC22147);
        return c17022;
    }

    public EnumC7330(String str, int i2, int i3, C17022 c17022) {
        for (EnumC22147 enumC22147 : EnumC22147.values()) {
            C13843.putIfAbsent((Map) c17022.b, enumC22147, 0);
        }
        this.a = (Map) c17022.b;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public final boolean s(int i2) {
        return (i2 & this.e) == this.c;
    }

    public static int m(EnumC22147 enumC22147) {
        int i2 = 0;
        for (EnumC7330 enumC7330 : values()) {
            i2 |= ((Integer) enumC7330.a.get(enumC22147)).intValue() << enumC7330.b;
        }
        return i2;
    }

    public static int l(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    public static int n(InterfaceC15234 interfaceC15234) {
        int characteristics = interfaceC15234.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || interfaceC15234.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }
}
