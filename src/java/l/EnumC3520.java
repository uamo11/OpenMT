package l;

import com.umeng.analytics.pro.am;

/* compiled from: H52L */
/* renamed from: l.ۗ᩹ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC3520 {
    BOOLEAN("Z", true),
    INT("I", true),
    FLOAT("F", true),
    DOUBLE("D", true),
    LONG("J", true),
    OBJECT("L", true),
    VOID("V", true),
    UNKNOWN("?"),
    ZIL(am.aB),
    ZIFL(am.aD),
    ZIF("m"),
    ZI("n"),
    IF(am.aC),
    JD("w");


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f11198;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f11199;

    EnumC3520(String str, boolean z) {
        this.f11199 = str;
        this.f11198 = z;
    }

    EnumC3520(String str) {
        this.f11199 = str;
        this.f11198 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3520 m10714(String str) {
        char charAt = str.charAt(0);
        if (charAt == 'F') {
            return FLOAT;
        }
        if (charAt != 'L') {
            if (charAt != 'S') {
                if (charAt == 'V') {
                    return VOID;
                }
                if (charAt == 'i') {
                    return IF;
                }
                if (charAt == 's') {
                    return ZIL;
                }
                if (charAt == 'w') {
                    return JD;
                }
                if (charAt == 'z') {
                    return ZIFL;
                }
                if (charAt != 'I') {
                    if (charAt == 'J') {
                        return LONG;
                    }
                    if (charAt == 'Z') {
                        return BOOLEAN;
                    }
                    if (charAt != '[') {
                        if (charAt == 'm') {
                            return ZIF;
                        }
                        if (charAt != 'n') {
                            switch (charAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    return DOUBLE;
                                default:
                                    return UNKNOWN;
                            }
                        } else {
                            return ZI;
                        }
                    }
                }
            }
            return INT;
        }
        return OBJECT;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3520 m10715(EnumC3520 enumC3520, EnumC3520 enumC35202) {
        if (enumC3520 != enumC35202) {
            EnumC3520 enumC35203 = UNKNOWN;
            if (enumC3520 == enumC35203) {
                return enumC35202;
            }
            if (enumC35202 != enumC35203) {
                if (!enumC3520.f11198) {
                    return enumC35202.f11198 ? enumC35202 : m10717(enumC3520, enumC35202);
                }
                if (!enumC35202.f11198) {
                    return enumC3520;
                }
                EnumC3520 enumC35204 = INT;
                if ((enumC3520 == enumC35204 && enumC35202 == BOOLEAN) || enumC3520 == BOOLEAN || enumC35202 == enumC35204) {
                    return enumC35204;
                }
                throw new RuntimeException("Can't merge " + enumC3520 + " and " + enumC35202);
            }
        }
        return enumC3520;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004d A[RETURN] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.EnumC3520 m10717(l.EnumC3520 r3, l.EnumC3520 r4) {
        /*
            l.ۗ᩹ۖ r0 = l.EnumC3520.JD
            if (r3 == r0) goto L4e
            if (r4 == r0) goto L4e
            int r3 = r3.ordinal()
            switch(r3) {
                case 8: goto L3c;
                case 9: goto L4d;
                case 10: goto L21;
                case 11: goto L32;
                case 12: goto L13;
                default: goto Ld;
            }
        Ld:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>()
            throw r3
        L13:
            int r3 = r4.ordinal()
            switch(r3) {
                case 8: goto L1e;
                case 9: goto L1b;
                case 10: goto L1b;
                case 11: goto L1e;
                default: goto L1a;
            }
        L1a:
            goto L21
        L1b:
            l.ۗ᩹ۖ r3 = l.EnumC3520.IF
            return r3
        L1e:
            l.ۗ᩹ۖ r3 = l.EnumC3520.INT
            return r3
        L21:
            int r3 = r4.ordinal()
            switch(r3) {
                case 8: goto L2f;
                case 9: goto L2c;
                case 10: goto L28;
                case 11: goto L2f;
                case 12: goto L29;
                default: goto L28;
            }
        L28:
            goto L32
        L29:
            l.ۗ᩹ۖ r3 = l.EnumC3520.IF
            return r3
        L2c:
            l.ۗ᩹ۖ r3 = l.EnumC3520.ZIF
            return r3
        L2f:
            l.ۗ᩹ۖ r3 = l.EnumC3520.ZI
            return r3
        L32:
            l.ۗ᩹ۖ r3 = l.EnumC3520.IF
            if (r4 != r3) goto L39
            l.ۗ᩹ۖ r3 = l.EnumC3520.INT
            return r3
        L39:
            l.ۗ᩹ۖ r3 = l.EnumC3520.ZI
            return r3
        L3c:
            int r3 = r4.ordinal()
            switch(r3) {
                case 9: goto L4a;
                case 10: goto L47;
                case 11: goto L47;
                case 12: goto L44;
                default: goto L43;
            }
        L43:
            goto L4d
        L44:
            l.ۗ᩹ۖ r3 = l.EnumC3520.INT
            return r3
        L47:
            l.ۗ᩹ۖ r3 = l.EnumC3520.ZI
            return r3
        L4a:
            l.ۗ᩹ۖ r3 = l.EnumC3520.ZIL
            return r3
        L4d:
            return r4
        L4e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't merge "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " and "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.EnumC3520.m10717(l.ۗ᩹ۖ, l.ۗ᩹ۖ):l.ۗ᩹ۖ");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11199;
    }
}
