package l;

import bin.mt.json.JSON;
import java.util.ArrayList;

/* compiled from: L79Z */
/* renamed from: l.۠ۨ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8163 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21638(String str) {
        return str.replace("\r\n", "\n").replace('\r', '\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C1107 m21639(java.lang.String r16, int r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8163.m21639(java.lang.String, int, int, int, int):l.֨ۨ᩻");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m21640(int i) {
        return C3059.m9364("Invalid lineCharOffset", "lineCharOffset", JSON.value(i), JSON.array(0, Integer.MAX_VALUE), JSON.object());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21637(int i, int i2, String str) {
        C19453[] m21641 = m21641((CharSequence) str);
        int max = Math.max(1, i);
        int min = Math.min(i2, m21641.length);
        if (max > min) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = max - 1; i3 < min; i3++) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            C19453 c19453 = m21641[i3];
            sb.append(c19453.f62926, c19453.f62928, c19453.f62929);
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21636(int i, int i2, CharSequence charSequence) {
        return m21635(i, charSequence.length(), i2, charSequence);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21635(int i, int i2, int i3, CharSequence charSequence) {
        int m21634 = m21634(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        int m216342 = m21634(Math.max(m21634, Math.min(i2, charSequence.length())), charSequence);
        if (i3 <= 0 || m21634 >= m216342) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(i3 * 2, m216342 - m21634));
        for (int i4 = 0; m21634 < m216342 && i4 < i3; i4++) {
            int i5 = m21634 + 1;
            char charAt = charSequence.charAt(m21634);
            sb.append(charAt);
            if (Character.isHighSurrogate(charAt) && i5 < m216342) {
                char charAt2 = charSequence.charAt(i5);
                if (Character.isLowSurrogate(charAt2)) {
                    sb.append(charAt2);
                    m21634 += 2;
                }
            }
            m21634 = i5;
        }
        return sb.toString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m21642(int i, int i2, CharSequence charSequence) {
        int m21634 = m21634(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        if (i2 < 0) {
            for (int i3 = -i2; m21634 > 0 && i3 > 0; i3--) {
                int i4 = m21634 - 1;
                m21634 = (i4 > 0 && Character.isLowSurrogate(charSequence.charAt(i4)) && Character.isHighSurrogate(charSequence.charAt(m21634 + (-2)))) ? m21634 - 2 : i4;
            }
            return m21634;
        }
        if (i2 > 0) {
            while (m21634 < charSequence.length() && i2 > 0) {
                int i5 = m21634 + 1;
                m21634 = (Character.isHighSurrogate(charSequence.charAt(m21634)) && i5 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i5))) ? m21634 + 2 : i5;
                i2--;
            }
        }
        return m21634;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m21644(int i, CharSequence charSequence) {
        int m21634 = m21634(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        do {
            m21634--;
            if (m21634 < 0) {
                return 0;
            }
        } while (charSequence.charAt(m21634) != '\n');
        return m21634 + 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m21643(int i, CharSequence charSequence) {
        for (int m21634 = m21634(Math.max(0, Math.min(i, charSequence.length())), charSequence); m21634 < charSequence.length(); m21634++) {
            if (charSequence.charAt(m21634) == '\n') {
                return m21634;
            }
        }
        return charSequence.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21634(int i, CharSequence charSequence) {
        if (i > 0 && i < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i))) {
            int i2 = i - 1;
            if (Character.isHighSurrogate(charSequence.charAt(i2))) {
                return i2;
            }
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19453[] m21641(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return new C19453[]{new C19453(charSequence, 0, 0, false)};
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) == '\n') {
                arrayList.add(new C19453(charSequence, i, i2, true));
                i = i2 + 1;
            }
        }
        if (i < charSequence.length()) {
            arrayList.add(new C19453(charSequence, i, charSequence.length(), false));
        }
        return (C19453[]) arrayList.toArray(new C19453[0]);
    }
}
