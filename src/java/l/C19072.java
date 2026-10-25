package l;

/* compiled from: S2N2 */
/* renamed from: l.ᩴ᩺ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19072 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60053 = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m43937(double r6) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r1 = 0
            r3 = 0
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 <= 0) goto L11
            boolean r1 = l.C19778.m45463(r6)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            java.lang.String r2 = "x must be positive and finite"
            l.C4025.m12109(r2, r1)
            int r1 = java.lang.Math.getExponent(r6)
            int r2 = java.lang.Math.getExponent(r6)
            r4 = -1022(0xfffffffffffffc02, float:NaN)
            if (r2 < r4) goto L75
            int[] r2 = l.C4255.f13780
            int r0 = r0.ordinal()
            r0 = r2[r0]
            switch(r0) {
                case 1: goto L69;
                case 2: goto L70;
                case 3: goto L62;
                case 4: goto L57;
                case 5: goto L4f;
                case 6: goto L34;
                case 7: goto L34;
                case 8: goto L34;
                default: goto L2e;
            }
        L2e:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L34:
            long r6 = java.lang.Double.doubleToRawLongBits(r6)
            r4 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r6 = r6 & r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r6 = r6 | r4
            double r6 = java.lang.Double.longBitsToDouble(r6)
            double r6 = r6 * r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L70
            r3 = 1
            goto L70
        L4f:
            if (r1 < 0) goto L52
            r3 = 1
        L52:
            boolean r6 = m43936(r6)
            goto L5e
        L57:
            if (r1 >= 0) goto L5a
            r3 = 1
        L5a:
            boolean r6 = m43936(r6)
        L5e:
            r6 = r6 ^ 1
            r3 = r3 & r6
            goto L70
        L62:
            boolean r6 = m43936(r6)
            r3 = r6 ^ 1
            goto L70
        L69:
            boolean r6 = m43936(r6)
            l.C15542.m36642(r6)
        L70:
            if (r3 == 0) goto L74
            int r1 = r1 + 1
        L74:
            return r1
        L75:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r6 = r6 * r0
            int r6 = m43937(r6)
            int r6 = r6 + (-52)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19072.m43937(double):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (java.lang.Math.abs(r8 - r2) == 0.5d) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m43934(double r8, java.math.RoundingMode r10) {
        /*
            boolean r0 = l.C19778.m45463(r8)
            if (r0 == 0) goto Lb3
            int[] r0 = l.C4255.f13780
            int r1 = r10.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1
            r4 = 0
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            switch(r0) {
                case 1: goto L76;
                case 2: goto L67;
                case 3: goto L59;
                case 4: goto L7d;
                case 5: goto L46;
                case 6: goto L41;
                case 7: goto L2d;
                case 8: goto L1e;
                default: goto L18;
            }
        L18:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L1e:
            double r2 = java.lang.Math.rint(r8)
            double r4 = r8 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L7e
            goto L7d
        L2d:
            double r2 = java.lang.Math.rint(r8)
            double r4 = r8 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L7e
            double r2 = java.lang.Math.copySign(r6, r8)
            double r2 = r2 + r8
            goto L7e
        L41:
            double r2 = java.lang.Math.rint(r8)
            goto L7e
        L46:
            boolean r0 = m43935(r8)
            if (r0 == 0) goto L4d
            goto L7d
        L4d:
            long r2 = (long) r8
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L54
            r0 = 1
            goto L55
        L54:
            r0 = -1
        L55:
            long r4 = (long) r0
            long r2 = r2 + r4
            double r2 = (double) r2
            goto L7e
        L59:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7d
            boolean r0 = m43935(r8)
            if (r0 == 0) goto L64
            goto L7d
        L64:
            long r4 = (long) r8
            long r4 = r4 + r2
            goto L74
        L67:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7d
            boolean r0 = m43935(r8)
            if (r0 == 0) goto L72
            goto L7d
        L72:
            long r4 = (long) r8
            long r4 = r4 - r2
        L74:
            double r2 = (double) r4
            goto L7e
        L76:
            boolean r0 = m43935(r8)
            l.C15542.m36642(r0)
        L7d:
            r2 = r8
        L7e:
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r4 = r4 - r2
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L89
            r0 = 1
            goto L8a
        L89:
            r0 = 0
        L8a:
            r4 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L91
            goto L92
        L91:
            r1 = 0
        L92:
            r0 = r0 & r1
            if (r0 == 0) goto L97
            long r8 = (long) r2
            return r8
        L97:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "rounded value is out of range for input "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " and rounding mode "
            r1.append(r8)
            r1.append(r10)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lb3:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "input is infinite or NaN"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19072.m43934(double, java.math.RoundingMode):long");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m43936(double d) {
        if (d > 0.0d && C19778.m45463(d)) {
            long m45462 = C19778.m45462(d);
            if ((m45462 & (m45462 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    static {
        Math.log(2.0d);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43935(double d) {
        if (C19778.m45463(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(C19778.m45462(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
