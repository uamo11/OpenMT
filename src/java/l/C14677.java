package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* compiled from: 195F */
/* renamed from: l.ܳܿ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14677 {
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m34979(l.C12582 r16, l.C13992 r17, l.C20344 r18, l.C19277 r19, l.C23674 r20) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14677.m34979(l.۫ᩳ᩻, l.ܰᩳ᩻, l.᩶ᩳ᩻, l.᩵ۛۡ, l.᩻ۨۡ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23165 m34976(C12582 c12582, C20344 c20344, C6232 c6232, C11151 c11151, C19277 c19277, C23674 c23674, String str) {
        C3410 c3410 = null;
        try {
            C3410 c34102 = new C3410(c12582.m30845(), c19277);
            try {
                int i = c6232.f19087;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c34102.read() == -1) {
                        throw new IOException("Unexpected end of file while skipping BOM");
                    }
                }
                CharsetDecoder newDecoder = c6232.f19085.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                C13287 c13287 = c11151 == null ? new C13287() : null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c34102, onUnmappableCharacter));
                    try {
                        C10466 c10466 = new C10466(bufferedReader, c13287);
                        C11151 c4821 = c11151 == null ? new C4821() : null;
                        if (c11151 == null) {
                            c11151 = c4821;
                        }
                        if (c20344.f65671 == 2) {
                            m34978(c10466, c20344, c11151, c23674);
                        } else {
                            m34980(c10466, c20344, c11151, c23674);
                        }
                        if (c13287 != null) {
                            str = c13287.m32248();
                        }
                        C23165 c23165 = new C23165(c11151.mo6490(), str);
                        bufferedReader.close();
                        c34102.close();
                        return c23165;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (CharacterCodingException e) {
                    throw new IOException("Invalid text encoding", e);
                }
            } catch (Throwable th3) {
                th = th3;
                c3410 = c34102;
                if (c3410 != null) {
                    c3410.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r2 = r1.m39525();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r2 == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        r1.m39527(r2 + 1, r8);
        r8.mo6486();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        r1.m39530(r8);
        r8.mo6486();
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m34978(l.C10466 r6, l.C20344 r7, l.InterfaceC1978 r8, l.C23674 r9) {
        /*
            int r0 = r7.f65667
            r1 = 1
            if (r0 < r1) goto L82
            r1 = 999999999(0x3b9ac9ff, float:0.004723787)
            if (r0 > r1) goto L82
            boolean r7 = r7.f65670
            if (r7 != 0) goto L12
            m34977(r6, r0, r8, r9)
            return
        L12:
            int r7 = r0 / 10
            r1 = 4096(0x1000, float:5.74E-42)
            int r7 = java.lang.Math.min(r7, r1)
            if (r7 > 0) goto L20
            m34977(r6, r0, r8, r9)
            return
        L20:
            l.ܽܿ᩻ r1 = new l.ܽܿ᩻
            int r2 = r7 + 1
            r1.<init>(r2)
            r2 = 0
        L28:
            r3 = 0
        L29:
            int r4 = r6.m26345()
            r5 = -1
            if (r4 == r5) goto L6f
            java.lang.Object r2 = r9.f76700
            l.۟ᩳ᩻ r2 = (l.C7643) r2
            boolean r2 = r2.mo1526()
            if (r2 != 0) goto L69
            r1.m39526(r4)
        L3d:
            int r2 = r1.m39529()
            if (r2 <= r7) goto L49
            r1.m39528(r8)
            int r3 = r3 + 1
            goto L3d
        L49:
            int r2 = r1.m39529()
            int r2 = r2 + r3
            if (r2 != r0) goto L67
            int r2 = r1.m39525()
            if (r2 == r5) goto L5f
            int r2 = r2 + 1
            r1.m39527(r2, r8)
            r8.mo6486()
            goto L65
        L5f:
            r1.m39530(r8)
            r8.mo6486()
        L65:
            r2 = 1
            goto L28
        L67:
            r2 = 1
            goto L29
        L69:
            l.ۨᩳ᩻ r6 = new l.ۨᩳ᩻
            r6.<init>()
            throw r6
        L6f:
            if (r2 == 0) goto L7b
            if (r3 > 0) goto L7b
            int r6 = r1.m39529()
            if (r6 <= 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            r1.m39530(r8)
            r8.mo6486()
            return
        L82:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Text length is invalid"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14677.m34978(l.ۤᩳ᩻, l.᩶ᩳ᩻, l.֫ܿ᩻, l.᩻ۨۡ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34977(C10466 c10466, int i, InterfaceC1978 interfaceC1978, C23674 c23674) {
        boolean z = false;
        while (true) {
            int i2 = 0;
            do {
                int m26345 = c10466.m26345();
                if (m26345 == -1) {
                    if (!z || i2 > 0) {
                        interfaceC1978.mo6486();
                        return;
                    }
                    return;
                }
                if (!((C7643) c23674.f76700).mo1526()) {
                    interfaceC1978.mo6488(m26345);
                    i2++;
                    z = true;
                } else {
                    throw new C11877();
                }
            } while (i2 != i);
            interfaceC1978.mo6486();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34980(C10466 c10466, C20344 c20344, InterfaceC1978 interfaceC1978, C23674 c23674) {
        String m34975 = m34975(c20344.f65677);
        StringBuilder sb = new StringBuilder(m34975.length());
        boolean z = false;
        int i = 0;
        while (i < m34975.length()) {
            char charAt = m34975.charAt(i);
            if (charAt == '\r') {
                int i2 = i + 1;
                if (i2 < m34975.length() && m34975.charAt(i2) == '\n') {
                    i = i2;
                }
                sb.append('\n');
            } else {
                sb.append(charAt);
            }
            i++;
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            throw new IOException("Separator is empty");
        }
        C17500 c17500 = new C17500(interfaceC1978, c20344);
        C18206 c18206 = new C18206(sb2, c17500);
        while (true) {
            int m26344 = c10466.m26344();
            if (m26344 == -1) {
                c18206.m42420();
                if (!z) {
                    interfaceC1978.mo6486();
                    return;
                } else {
                    c17500.m40884();
                    return;
                }
            }
            if (!((C7643) c23674.f76700).mo1526()) {
                c18206.m42421((char) m26344);
                z = true;
            } else {
                throw new C11877();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34975(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt != '\\' || (i = i2 + 1) >= str.length()) {
                sb.append(charAt);
            } else {
                char charAt2 = str.charAt(i);
                if (charAt2 == 'n') {
                    sb.append('\n');
                } else if (charAt2 == 'r') {
                    sb.append('\r');
                } else if (charAt2 == 't') {
                    sb.append('\t');
                } else if (charAt2 == '\\') {
                    sb.append('\\');
                } else {
                    sb.append('\\');
                    sb.append(charAt2);
                }
                i2 = i;
            }
            i2++;
        }
        return sb.toString();
    }
}
