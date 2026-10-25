package l;

import java.util.ArrayList;

/* compiled from: M1ME */
/* renamed from: l.᩷ܿۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21014 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3290 m47826(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C4701 c4701) {
        InterfaceC6818 m30808 = C12567.m30808(charSequence, new C14850(charSequence2, charSequence3), c4701);
        int length = charSequence2.length();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C22340 c22340 : m30808.mo6219()) {
            int i = c22340.f72396;
            int i2 = c22340.f72398;
            int i3 = c22340.f72395;
            int i4 = c22340.f72397;
            if (i <= length) {
                arrayList.add(new C22340(i4, i3, i2, i));
            } else if (i2 >= length) {
                arrayList2.add(new C22340(i4, i3, i2 - length, i - length));
            } else {
                int i5 = (length - i2) + i4;
                arrayList.add(new C22340(i4, i5, i2, length));
                arrayList2.add(new C22340(i5, i3, 0, c22340.f72396 - length));
            }
        }
        return new C3290(C23751.m52403(C23751.m52399(charSequence.length(), charSequence2.length(), arrayList)), C23751.m52403(C23751.m52399(charSequence.length(), charSequence3.length(), arrayList2)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47827(int i, CharSequence charSequence) {
        char charAt;
        if (i >= 0 && i != charSequence.length() && C11250.m27828(charSequence.charAt(i))) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                char charAt2 = charSequence.charAt(i2);
                if (charAt2 == '\n') {
                    return true;
                }
                if (C11250.m27828(charAt2)) {
                }
            }
            return true;
        }
        if (i < 0 || i == charSequence.length() || !C11250.m27828(charSequence.charAt(i))) {
            return false;
        }
        while (i < charSequence.length() && (charAt = charSequence.charAt(i)) != '\n') {
            if (!C11250.m27828(charAt)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r8 != l.EnumC7536.JAVANESE) goto L33;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m47825(java.lang.CharSequence r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length()
            r2 = -1
            r3 = 0
            r4 = -1
            r5 = 0
        Ld:
            if (r3 >= r1) goto L8d
            int r6 = java.lang.Character.codePointAt(r11, r3)
            int r7 = java.lang.Character.charCount(r6)
            r8 = 128(0x80, float:1.8E-43)
            if (r6 >= r8) goto L24
            char r9 = (char) r6
            boolean r9 = l.C11250.m27828(r9)
            if (r9 == 0) goto L24
            r9 = 0
            goto L2a
        L24:
            boolean r9 = l.C3374.m10308(r6)
            r9 = r9 ^ 1
        L2a:
            if (r9 == 0) goto L67
            if (r6 >= r8) goto L2f
            goto L5f
        L2f:
            boolean r8 = java.lang.Character.isDigit(r6)
            if (r8 == 0) goto L36
            goto L5f
        L36:
            int r8 = l.C2164.f7153
            int r8 = r6 >>> 16
            if (r8 != 0) goto L67
            boolean r8 = java.lang.Character.isIdeographic(r6)
            if (r8 == 0) goto L43
            goto L67
        L43:
            boolean r8 = java.lang.Character.isAlphabetic(r6)
            if (r8 != 0) goto L4a
            goto L67
        L4a:
            l.۟ܳ᩵ r8 = l.EnumC7536.m20220(r6)
            l.۟ܳ᩵ r10 = l.EnumC7536.HIRAGANA
            if (r8 == r10) goto L67
            l.۟ܳ᩵ r10 = l.EnumC7536.KATAKANA
            if (r8 == r10) goto L67
            l.۟ܳ᩵ r10 = l.EnumC7536.THAI
            if (r8 == r10) goto L67
            l.۟ܳ᩵ r10 = l.EnumC7536.JAVANESE
            if (r8 != r10) goto L5f
            goto L67
        L5f:
            if (r4 != r2) goto L63
            r5 = 0
            r4 = r3
        L63:
            int r5 = r5 * 31
            int r5 = r5 + r6
            goto L8b
        L67:
            if (r4 == r2) goto L72
            l.ۜܿۘ r8 = new l.ۜܿۘ
            r8.<init>(r4, r3, r5, r11)
            r0.add(r8)
            r4 = -1
        L72:
            if (r9 == 0) goto L7f
            l.ۜܿۘ r8 = new l.ۜܿۘ
            int r9 = r3 + r7
            r8.<init>(r3, r9, r6, r11)
            r0.add(r8)
            goto L8b
        L7f:
            r8 = 10
            if (r6 != r8) goto L8b
            l.ܳܿۘ r6 = new l.ܳܿۘ
            r6.<init>(r3)
            r0.add(r6)
        L8b:
            int r3 = r3 + r7
            goto Ld
        L8d:
            if (r4 == r2) goto L97
            l.ۜܿۘ r2 = new l.ۜܿۘ
            r2.<init>(r4, r1, r5, r11)
            r0.add(r2)
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21014.m47825(java.lang.CharSequence):java.util.ArrayList");
    }
}
