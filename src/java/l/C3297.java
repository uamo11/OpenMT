package l;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: 37C1 */
/* renamed from: l.ۗܳܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3297 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f10343;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f10344 = new Object();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f10341 = {"-lnt:numbers,table", "-lvt"};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f10342 = Pattern.compile("^\\s*//\\s*(\\d+)#(?:.*)?$");

    static {
        Object[] objArr = {"var", "type", "endvar", "endtype", "try", "endtry", "catch", "locals_map", "stack_map"};
        HashSet hashSet = new HashSet(9);
        for (int i = 0; i < 9; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f10343 = C20195.unmodifiableSet(hashSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10094(byte[] bArr) {
        String m10097;
        if (bArr.length == 0) {
            throw new IllegalArgumentException("classBytes must not be empty.");
        }
        synchronized (f10344) {
            try {
                C0428 c0428 = new C0428();
                C21596 c21596 = new C21596();
                if (new C4761(c0428, c21596, new C1840(bArr), f10341).m13927() != 0) {
                    throw m10095("Jdis disassembly failed.", c21596.toString(), null);
                }
                int size = c0428.m1972().size();
                if (size != 1) {
                    throw m10095("Jdis disassembly produced " + size + " jasm outputs, but this API only supports a single output.", c21596.toString(), null);
                }
                String m44895 = ((C19480) c0428.m1972().get(0)).m44895();
                if (m44895 == null || m44895.isEmpty()) {
                    throw m10095("Jdis disassembly succeeded but produced no jasm text.", c21596.toString(), null);
                }
                m10097 = m10097(m44895);
            } catch (RuntimeException e) {
                throw m10095("Unexpected exception while running Jdis.", null, e);
            } catch (C13174 e2) {
                throw e2;
            }
        }
        return m10097;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m10096(String str) {
        byte[] m47722;
        if (str == null) {
            throw new IllegalArgumentException("jasmSource must not be null.");
        }
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("jasmSource must not be blank.");
        }
        synchronized (f10344) {
            try {
                C9602 c9602 = new C9602();
                C21596 c21596 = new C21596();
                if (new C13088(c9602, c21596, new C17362(str.getBytes(StandardCharsets.UTF_8))).m31723() != 0) {
                    throw m10095("Jasm assembly failed.", c21596.toString(), null);
                }
                int size = c9602.m24535().size();
                if (size != 1) {
                    throw m10095("Jasm assembly produced " + size + " class outputs, but this API only supports a single output.", c21596.toString(), null);
                }
                m47722 = ((C20891) c9602.m24535().get(0)).m47722();
                if (m47722 == null || m47722.length == 0) {
                    throw m10095("Jasm assembly succeeded but produced no class data.", c21596.toString(), null);
                }
            } catch (RuntimeException e) {
                throw m10095("Unexpected exception while running Jasm.", null, e);
            } catch (C13174 e2) {
                throw e2;
            }
        }
        return m47722;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13174 m10095(String str, String str2, RuntimeException runtimeException) {
        if ((str2 == null || str2.trim().isEmpty()) && runtimeException != null) {
            str2 = C5368.m15338((Throwable) runtimeException);
        }
        if (str2 != null) {
            str2.trim().isEmpty();
        }
        return new C13174(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m10097(java.lang.String r13) {
        /*
            java.lang.String r0 = "\r\n"
            boolean r1 = r13.contains(r0)
            if (r1 == 0) goto L9
            goto Lb
        L9:
            java.lang.String r0 = "\n"
        Lb:
            java.lang.String r1 = "\\R"
            r2 = -1
            java.lang.String[] r1 = r13.split(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r13 = r13.length()
            int r13 = r13 + 64
            r2.<init>(r13)
            r13 = 0
            r3 = 0
            r4 = 0
            r5 = r3
        L21:
            int r6 = r1.length
            if (r4 >= r6) goto Lda
            r6 = r1[r4]
            java.util.regex.Pattern r7 = l.C3297.f10342
            java.util.regex.Matcher r7 = r7.matcher(r6)
            boolean r8 = r7.matches()
            r9 = 1
            if (r8 == 0) goto L39
            java.lang.String r5 = r7.group(r9)
            goto Ld6
        L39:
            if (r5 == 0) goto Lcc
            java.lang.String r7 = r6.trim()
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto Lc2
            java.lang.String r8 = "//"
            boolean r8 = r7.startsWith(r8)
            if (r8 != 0) goto Lc2
            java.lang.String r8 = ";"
            boolean r8 = r7.endsWith(r8)
            if (r8 != 0) goto L57
            goto Lc2
        L57:
            java.lang.String r8 = "line "
            boolean r8 = r7.startsWith(r8)
            if (r8 != 0) goto Lc2
            java.lang.String r8 = "LineTable"
            boolean r8 = r7.startsWith(r8)
            if (r8 != 0) goto Lc2
            java.lang.String r8 = "SourceFile"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L70
            goto Lc2
        L70:
            r8 = 58
            int r8 = r7.indexOf(r8)
            if (r8 <= 0) goto La5
            java.lang.String r10 = r7.substring(r13, r8)
            java.lang.String r10 = r10.trim()
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto La5
            r11 = 0
        L87:
            int r12 = r10.length()
            if (r11 >= r12) goto L9b
            char r12 = r10.charAt(r11)
            boolean r12 = java.lang.Character.isLetterOrDigit(r12)
            if (r12 != 0) goto L98
            goto La5
        L98:
            int r11 = r11 + 1
            goto L87
        L9b:
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)
            java.lang.String r7 = r7.trim()
        La5:
            r8 = 32
            int r8 = r7.indexOf(r8)
            if (r8 >= 0) goto Lb3
            r8 = 59
            int r8 = r7.indexOf(r8)
        Lb3:
            if (r8 >= 0) goto Lb6
            goto Lc2
        Lb6:
            java.lang.String r7 = r7.substring(r13, r8)
            java.util.Set r8 = l.C3297.f10343
            boolean r7 = r8.contains(r7)
            r7 = r7 ^ r9
            goto Lc3
        Lc2:
            r7 = 0
        Lc3:
            if (r7 == 0) goto Lcc
            java.lang.String r7 = "  // line "
            java.lang.String r6 = l.C22870.m50967(r6, r7, r5)
            r5 = r3
        Lcc:
            r2.append(r6)
            int r6 = r1.length
            int r6 = r6 - r9
            if (r4 >= r6) goto Ld6
            r2.append(r0)
        Ld6:
            int r4 = r4 + 1
            goto L21
        Lda:
            java.lang.String r13 = r2.toString()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3297.m10097(java.lang.String):java.lang.String");
    }
}
