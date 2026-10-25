package l;

import java.util.ArrayList;

/* compiled from: P784 */
/* renamed from: l.۫᩺᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12728 {
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011b, code lost:
    
        if (r0 != null) goto L87;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m31022(l.C11418 r12, l.C1965 r13, l.C23528 r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12728.m31022(l.ۨۖܽ, l.֫ܿۜ, l.᩻ۜۜ):java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31020(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ArrayList arrayList4 = new ArrayList(arrayList3.size() + arrayList2.size() + arrayList.size());
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        if (arrayList4.isEmpty()) {
            return null;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            i2 += ((C13433) arrayList4.get(i3)).f40144;
            if (i3 > 0) {
                i2++;
            }
            if (i2 > i) {
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < arrayList4.size(); i4++) {
            if (i4 > 0) {
                sb.append('\n');
            }
            String str = ((C13433) arrayList4.get(i4)).f40145;
            if (str == null) {
                return null;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31021(CharSequence charSequence, C1965 c1965, C23528 c23528) {
        int max = Math.max(0, Math.min(c1965.f6591, charSequence.length()));
        int codePointCount = Character.codePointCount(charSequence, max, Math.max(max, Math.min(c1965.f6586, charSequence.length())));
        int i = c23528.f75546;
        String m21635 = C8163.m21635(C8163.m21642(max, -(codePointCount >= i ? 0 : Math.min(i - codePointCount, i / 3)), charSequence), charSequence.length(), i, charSequence);
        String[] split = m21635.split("\n", -1);
        StringBuilder sb = new StringBuilder(m21635.length());
        for (String str : split) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(trim);
            }
        }
        String sb2 = sb.toString();
        return sb2.isEmpty() ? m21635.trim() : sb2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13433 m31023(int i, int i2, int i3, CharSequence charSequence) {
        int max = Math.max(0, Math.min(i, charSequence.length()));
        int max2 = Math.max(max, Math.min(i2, charSequence.length()));
        while (max < max2 && charSequence.charAt(max) <= ' ') {
            max++;
        }
        while (max2 > max && charSequence.charAt(max2 - 1) <= ' ') {
            max2--;
        }
        if (max >= max2) {
            return null;
        }
        int codePointCount = Character.codePointCount(charSequence, max, max2);
        return new C13433(codePointCount <= i3 ? C8163.m21635(max, max2, i3, charSequence) : null, codePointCount);
    }
}
