package l;

import java.util.EnumSet;

/* compiled from: O416 */
/* renamed from: l.ܶᩴ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15406 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47178;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47179;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47180;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47181;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47182;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47183;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47184 = new C15406(0);

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47185;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47186;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47187;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47188;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C15406 f47189;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C15406 f47190;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte f47191;

    static {
        C15406 c15406 = new C15406(1);
        f47190 = c15406;
        C15406 c154062 = new C15406(2);
        f47189 = c154062;
        f47179 = new C15406(4);
        C15406 c154063 = new C15406(12);
        f47181 = c154063;
        C15406 c154064 = new C15406(16);
        f47187 = c154064;
        C15406 c154065 = new C15406(32);
        f47180 = c154065;
        f47188 = new C15406(64);
        f47186 = new C15406(127);
        f47183 = new C15406(132);
        f47182 = m36455(c154062, c15406);
        f47185 = m36455(c154063, c154064);
        m36455(c154063, c154065);
        f47178 = m36455(c154063, c154062);
        m36455(c154063, c154062, c15406);
    }

    public C15406(int i) {
        this.f47191 = (byte) i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15406 m36455(C15406... c15406Arr) {
        byte b = 0;
        for (C15406 c15406 : c15406Arr) {
            b = (byte) (b | c15406.f47191);
        }
        return new C15406(b);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m36458(C15406 c15406) {
        return ((~c15406.f47191) & this.f47191) == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36457(C15406 c15406) {
        return (c15406.f47191 & this.f47191) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet m36456() {
        EnumSet noneOf = EnumSet.noneOf(EnumC8352.class);
        byte b = f47181.f47191;
        byte b2 = this.f47191;
        int i = b & b2;
        if (i != 0) {
            if (i == f47179.f47191) {
                noneOf.add(EnumC8352.VAR);
            } else {
                noneOf.add(EnumC8352.VAL);
            }
        }
        if ((f47187.f47191 & b2) != 0) {
            noneOf.add(EnumC8352.METHOD);
        }
        if ((f47189.f47191 & b2) != 0) {
            noneOf.add(EnumC8352.CLASS);
        }
        if ((f47190.f47191 & b2) != 0) {
            noneOf.add(EnumC8352.PACKAGE);
        }
        if ((f47188.f47191 & b2) != 0) {
            noneOf.add(EnumC8352.MODULE);
        }
        return noneOf;
    }
}
