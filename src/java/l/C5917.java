package l;

import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* compiled from: X4M8 */
/* renamed from: l.ۛ۟ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5917 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16586(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == 11 || c == '\f' || c == '\r';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3095 m16583(final C6807 c6807, final C12972 c12972, CharSequence charSequence, int i, final C8034 c8034) {
        C11003.requireNonNull(c6807, "editView");
        int i2 = c12972.f38876;
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        InterfaceC17066 m38504 = C16360.m38504(new InterfaceC17066() { // from class: l.֨۟ܿ
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                boolean m48562;
                m48562 = C8034.this.f24774.m48562();
                return m48562 || !c12972.m31539(c6807);
            }
        });
        m16589(m38504);
        C18177 c18177 = c12972.f38873;
        C16765 m42397 = c18177.m42397();
        try {
            if (m42397.m39441() != c12972.f38874) {
                throw new C23821();
            }
            try {
                C16059 m39444 = m42397.m39444(m38504);
                try {
                    C11122 m42379 = c18177.m42379(m39444);
                    try {
                        C10151 c10151 = new C10151(m42379, i2, c12972.f38875, m38504);
                        int m16582 = m16582(charSequence, i, m38504, c10151);
                        if (m16582 < 0) {
                            C3095 m9443 = C3095.m9443();
                            m42379.close();
                            m39444.close();
                            return m9443;
                        }
                        c10151.m25489();
                        long j = i2 + m16582;
                        int i3 = (int) j;
                        if (j != i3) {
                            throw new ArithmeticException();
                        }
                        m42379.m27601(i3, i3);
                        if (!m42379.m27600(m38504)) {
                            throw new C23821();
                        }
                        C3095 m9444 = C3095.m9444(m16582, c18177.m42385());
                        m42379.close();
                        m39444.close();
                        return m9444;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        m39444.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IllegalStateException e) {
                if (m38504.mo1526()) {
                    throw new C23821();
                }
                throw e;
            }
        } finally {
            m42397.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c5, code lost:
    
        if (r3 < 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m16582(java.lang.CharSequence r6, int r7, l.InterfaceC17066 r8, l.C10151 r9) {
        /*
            java.lang.String r0 = "text"
            l.C11003.requireNonNull(r6, r0)
            l.ܿۖ᩷ r8 = l.C16360.m38504(r8)
            l.᩶۟ܿ r0 = new l.᩶۟ܿ
            r0.<init>(r9, r8)
            r9 = -1
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L95
            if (r7 == r2) goto L8e
            r3 = 2
            if (r7 == r3) goto L89
            r3 = 3
            if (r7 == r3) goto L54
            r2 = 4
            if (r7 != r2) goto L48
            r7 = 1048576(0x100000, float:1.469368E-39)
            byte[] r7 = new byte[r7]
            android.util.Base64InputStream r2 = new android.util.Base64InputStream     // Catch: android.util.Base64DataException -> Lc8
            l.ۙ۟ܿ r3 = new l.ۙ۟ܿ     // Catch: android.util.Base64DataException -> Lc8
            r3.<init>(r6, r8)     // Catch: android.util.Base64DataException -> Lc8
            r2.<init>(r3, r1)     // Catch: android.util.Base64DataException -> Lc8
        L2c:
            int r6 = r2.read(r7)     // Catch: java.lang.Throwable -> L3e
            if (r6 == r9) goto L36
            r0.m46164(r6, r7)     // Catch: java.lang.Throwable -> L3e
            goto L2c
        L36:
            m16589(r8)     // Catch: java.lang.Throwable -> L3e
            r2.close()     // Catch: android.util.Base64DataException -> Lc8
            goto Lc7
        L3e:
            r6 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: android.util.Base64DataException -> Lc8
        L47:
            throw r6     // Catch: android.util.Base64DataException -> Lc8
        L48:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "which = "
            java.lang.String r7 = l.C19370.m44628(r7, r8)
            r6.<init>(r7)
            throw r6
        L54:
            int r7 = r6.length()
        L58:
            if (r1 >= r7) goto L85
            m16588(r1, r8)
            char r3 = r6.charAt(r1)
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 > r4) goto L69
            r0.m46163(r3)
            goto L83
        L69:
            r4 = 63
            r0.m46163(r4)
            boolean r3 = java.lang.Character.isHighSurrogate(r3)
            if (r3 == 0) goto L83
            int r3 = r1 + 1
            if (r3 >= r7) goto L83
            char r4 = r6.charAt(r3)
            boolean r4 = java.lang.Character.isLowSurrogate(r4)
            if (r4 == 0) goto L83
            r1 = r3
        L83:
            int r1 = r1 + r2
            goto L58
        L85:
            m16589(r8)
            goto Lc9
        L89:
            boolean r2 = m16587(r6, r3, r8, r0)
            goto Lc9
        L8e:
            r7 = 10
            boolean r2 = m16587(r6, r7, r8, r0)
            goto Lc9
        L95:
            int r7 = r6.length()
            r2 = 0
            r3 = -1
        L9b:
            if (r2 >= r7) goto Lc2
            m16588(r2, r8)
            char r4 = r6.charAt(r2)
            boolean r5 = m16586(r4)
            if (r5 == 0) goto Lab
            goto Lbf
        Lab:
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)
            if (r4 >= 0) goto Lb4
            goto Lc8
        Lb4:
            if (r3 >= 0) goto Lb8
            r3 = r4
            goto Lbf
        Lb8:
            int r3 = r3 << 4
            r3 = r3 | r4
            r0.m46163(r3)
            r3 = -1
        Lbf:
            int r2 = r2 + 1
            goto L9b
        Lc2:
            m16589(r8)
            if (r3 >= 0) goto Lc8
        Lc7:
            r1 = 1
        Lc8:
            r2 = r1
        Lc9:
            if (r2 == 0) goto Lcf
            int r9 = r0.m46162()
        Lcf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5917.m16582(java.lang.CharSequence, int, l.ܿۖ᩷, l.ۤ۟ܿ):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r4 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        r4 = r2;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m16587(java.lang.CharSequence r7, int r8, l.InterfaceC17066 r9, l.C20029 r10) {
        /*
            int r0 = r7.length()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = -1
        L8:
            r5 = 1
            if (r2 > r0) goto L33
            m16588(r2, r9)     // Catch: java.lang.NumberFormatException -> L39
            if (r2 == r0) goto L1c
            char r6 = r7.charAt(r2)     // Catch: java.lang.NumberFormatException -> L39
            boolean r6 = m16586(r6)     // Catch: java.lang.NumberFormatException -> L39
            if (r6 == 0) goto L1b
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r5 != 0) goto L22
            if (r4 >= 0) goto L22
            r4 = r2
            goto L30
        L22:
            if (r5 == 0) goto L30
            if (r4 < 0) goto L30
            int r4 = m16581(r7, r4, r2, r8, r9)     // Catch: java.lang.NumberFormatException -> L39
            r10.m46163(r4)     // Catch: java.lang.NumberFormatException -> L39
            int r3 = r3 + 1
            r4 = -1
        L30:
            int r2 = r2 + 1
            goto L8
        L33:
            m16589(r9)     // Catch: java.lang.NumberFormatException -> L39
            if (r3 == 0) goto L39
            return r5
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5917.m16587(java.lang.CharSequence, int, l.ܿۖ᩷, l.᩶۟ܿ):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16581(CharSequence charSequence, int i, int i2, int i3, InterfaceC17066 interfaceC17066) {
        boolean z;
        if (i >= i2) {
            throw new NumberFormatException();
        }
        char charAt = charSequence.charAt(i);
        int i4 = 0;
        if (charAt == '-' || charAt == '+') {
            z = charAt == '-';
            i++;
            if (i == i2) {
                throw new NumberFormatException();
            }
        } else {
            z = false;
        }
        int i5 = z ? Integer.MIN_VALUE : SecP160R1Field.PInv;
        int i6 = i5 / i3;
        while (i < i2) {
            m16588(i, interfaceC17066);
            int i7 = i + 1;
            int digit = Character.digit(charSequence.charAt(i), i3);
            if (digit < 0 || i4 < i6) {
                throw new NumberFormatException();
            }
            int i8 = i4 * i3;
            if (i8 < i5 + digit) {
                throw new NumberFormatException();
            }
            i4 = i8 - digit;
            i = i7;
        }
        return z ? i4 : -i4;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16588(int i, InterfaceC17066 interfaceC17066) {
        if ((i & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) == 0) {
            m16589(interfaceC17066);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16589(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066 != null && interfaceC17066.mo1526()) {
            throw new C23821();
        }
    }
}
