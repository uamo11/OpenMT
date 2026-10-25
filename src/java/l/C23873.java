package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: L2E6 */
/* renamed from: l.᩻ᩴ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23873 extends AbstractC11446 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumSet f77196;

    public C23873(EnumC14700... enumC14700Arr) {
        if (enumC14700Arr.length > 0) {
            this.f77196 = EnumSet.copyOf((Collection) Arrays.asList(enumC14700Arr));
        } else {
            this.f77196 = EnumSet.copyOf((Collection) Arrays.asList(EnumC14700.semiColonRequired));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r8.charAt(r2) != ';') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        r0 = 1;
     */
    @Override // l.AbstractC11446
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo16274(java.lang.CharSequence r8, int r9, java.io.StringWriter r10) {
        /*
            r7 = this;
            int r0 = r8.length()
            char r1 = r8.charAt(r9)
            r2 = 38
            r3 = 0
            if (r1 != r2) goto Ld5
            int r1 = r0 + (-2)
            if (r9 >= r1) goto Ld5
            int r1 = r9 + 1
            char r1 = r8.charAt(r1)
            r2 = 35
            if (r1 != r2) goto Ld5
            int r1 = r9 + 2
            char r2 = r8.charAt(r1)
            r4 = 120(0x78, float:1.68E-43)
            r5 = 1
            if (r2 == r4) goto L2d
            r4 = 88
            if (r2 != r4) goto L2b
            goto L2d
        L2b:
            r9 = 0
            goto L34
        L2d:
            int r1 = r9 + 3
            if (r1 != r0) goto L33
            goto Ld5
        L33:
            r9 = 1
        L34:
            r2 = r1
        L35:
            if (r2 >= r0) goto L6a
            char r4 = r8.charAt(r2)
            r6 = 48
            if (r4 < r6) goto L47
            char r4 = r8.charAt(r2)
            r6 = 57
            if (r4 <= r6) goto L67
        L47:
            char r4 = r8.charAt(r2)
            r6 = 97
            if (r4 < r6) goto L57
            char r4 = r8.charAt(r2)
            r6 = 102(0x66, float:1.43E-43)
            if (r4 <= r6) goto L67
        L57:
            char r4 = r8.charAt(r2)
            r6 = 65
            if (r4 < r6) goto L6a
            char r4 = r8.charAt(r2)
            r6 = 70
            if (r4 > r6) goto L6a
        L67:
            int r2 = r2 + 1
            goto L35
        L6a:
            if (r2 == r0) goto L76
            char r0 = r8.charAt(r2)
            r4 = 59
            if (r0 != r4) goto L76
            r0 = 1
            goto L77
        L76:
            r0 = 0
        L77:
            if (r0 != 0) goto L99
            l.ܳᩴ֡ r4 = l.EnumC14700.semiColonRequired
            java.util.EnumSet r6 = r7.f77196
            if (r6 == 0) goto L86
            boolean r4 = r6.contains(r4)
            if (r4 == 0) goto L86
            return r3
        L86:
            l.ܳᩴ֡ r4 = l.EnumC14700.errorIfNoSemiColon
            if (r6 == 0) goto L99
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L91
            goto L99
        L91:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Semi-colon required at end of numeric entity"
            r8.<init>(r9)
            throw r8
        L99:
            if (r9 == 0) goto Laa
            java.lang.CharSequence r8 = r8.subSequence(r1, r2)     // Catch: java.lang.NumberFormatException -> Ld5
            java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> Ld5
            r4 = 16
            int r8 = java.lang.Integer.parseInt(r8, r4)     // Catch: java.lang.NumberFormatException -> Ld5
            goto Lb8
        Laa:
            java.lang.CharSequence r8 = r8.subSequence(r1, r2)     // Catch: java.lang.NumberFormatException -> Ld5
            java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> Ld5
            r4 = 10
            int r8 = java.lang.Integer.parseInt(r8, r4)     // Catch: java.lang.NumberFormatException -> Ld5
        Lb8:
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r8 <= r4) goto Lcc
            char[] r8 = java.lang.Character.toChars(r8)
            char r3 = r8[r3]
            r10.write(r3)
            char r8 = r8[r5]
            r10.write(r8)
            goto Lcf
        Lcc:
            r10.write(r8)
        Lcf:
            int r2 = r2 + 2
            int r2 = r2 - r1
            int r2 = r2 + r9
            int r2 = r2 + r0
            return r2
        Ld5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23873.mo16274(java.lang.CharSequence, int, java.io.StringWriter):int");
    }
}
