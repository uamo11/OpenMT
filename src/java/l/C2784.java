package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: W9TA */
/* renamed from: l.ۖ᩷ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2784 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f8668;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f8669;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f8670;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List f8671;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f8672;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f8673;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f8674;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f8675;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f8676;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f8677;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f8678;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f8679;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C7225 f8667 = C7225.m19319("0");

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C7225 f8666 = C7225.m19319("0123456789");

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C7225 f8665 = C7225.m19319(".0123456789");

    public C2784(String str, String str2, String str3) {
        List asList = Arrays.asList(str.toLowerCase().split("\\|"));
        this.f8675 = asList.contains("2");
        this.f8677 = asList.contains("8");
        this.f8668 = asList.contains("10");
        this.f8672 = asList.contains("16");
        this.f8673 = asList.contains("f");
        this.f8676 = asList.contains("e");
        this.f8679 = asList.contains(am.ax);
        this.f8678 = asList.contains("_");
        this.f8669 = asList.contains("'");
        String[] split = str2.toLowerCase().split("\\|");
        String[] split2 = str3.toLowerCase().split("\\|");
        Arrays.sort(split, new C13281(1));
        Arrays.sort(split2, new C16188());
        ArrayList arrayList = new ArrayList(split.length);
        for (String str4 : split) {
            C11003.requireNonNull(str4);
            arrayList.add(str4);
        }
        this.f8674 = C20195.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList(split2.length);
        for (String str5 : split2) {
            C11003.requireNonNull(str5);
            arrayList2.add(str5);
        }
        this.f8671 = C20195.unmodifiableList(arrayList2);
    }

    public C2784(C2784 c2784) {
        this.f8675 = c2784.f8675;
        this.f8677 = c2784.f8677;
        this.f8668 = c2784.f8668;
        this.f8672 = c2784.f8672;
        this.f8673 = c2784.f8673;
        this.f8676 = c2784.f8676;
        this.f8679 = c2784.f8679;
        this.f8678 = c2784.f8678;
        this.f8669 = c2784.f8669;
        this.f8674 = c2784.f8674;
        this.f8671 = c2784.f8671;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2784 m8605() {
        return new C2784(this);
    }

    public C2784(C12951 c12951) {
        int m31494 = c12951.m31494();
        this.f8675 = (m31494 & 1) != 0;
        this.f8677 = (m31494 & 2) != 0;
        this.f8668 = (m31494 & 4) != 0;
        this.f8672 = (m31494 & 8) != 0;
        this.f8673 = (m31494 & 16) != 0;
        this.f8676 = (m31494 & 32) != 0;
        this.f8679 = (m31494 & 64) != 0;
        this.f8678 = (m31494 & 128) != 0;
        this.f8669 = (m31494 & 256) != 0;
        String[] split = c12951.m31499().split("\\|");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            C11003.requireNonNull(str);
            arrayList.add(str);
        }
        this.f8674 = C20195.unmodifiableList(arrayList);
        String[] split2 = c12951.m31499().split("\\|");
        ArrayList arrayList2 = new ArrayList(split2.length);
        for (String str2 : split2) {
            C11003.requireNonNull(str2);
            arrayList2.add(str2);
        }
        this.f8671 = C20195.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8606(C10130 c10130) {
        boolean z = this.f8677;
        boolean z2 = this.f8675;
        int i = z2;
        if (z) {
            i = (z2 ? 1 : 0) | 2;
        }
        int i2 = i;
        if (this.f8668) {
            i2 = (i == true ? 1 : 0) | 4;
        }
        int i3 = i2;
        if (this.f8672) {
            i3 = (i2 == true ? 1 : 0) | 8;
        }
        int i4 = i3;
        if (this.f8673) {
            i4 = (i3 == true ? 1 : 0) | 16;
        }
        int i5 = i4;
        if (this.f8676) {
            i5 = (i4 == true ? 1 : 0) | 32;
        }
        int i6 = i5;
        if (this.f8679) {
            i6 = (i5 == true ? 1 : 0) | 64;
        }
        int i7 = i6;
        if (this.f8678) {
            i7 = (i6 == true ? 1 : 0) | 128;
        }
        int i8 = i7;
        if (this.f8669) {
            i8 = (i7 == true ? 1 : 0) | 256;
        }
        c10130.mo13231(i8);
        c10130.m25442(C9679.m24609(this.f8674, "|"));
        c10130.m25442(C9679.m24609(this.f8671, "|"));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m8609() {
        ArrayList arrayList = new ArrayList();
        if (this.f8675) {
            arrayList.add("2");
        }
        if (this.f8677) {
            arrayList.add("8");
        }
        if (this.f8668) {
            arrayList.add("10");
        }
        if (this.f8672) {
            arrayList.add("16");
        }
        if (this.f8673) {
            arrayList.add("F");
        }
        if (this.f8676) {
            arrayList.add("E");
        }
        if (this.f8679) {
            arrayList.add("P");
        }
        if (this.f8678) {
            arrayList.add("_");
        }
        if (this.f8669) {
            arrayList.add("'");
        }
        return C9679.m24609(arrayList, "|");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m8611() {
        return C9679.m24609(this.f8674, "|");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m8607() {
        return C9679.m24609(this.f8671, "|");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m8608() {
        return this.f8670;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7225 m8610() {
        if (this.f8673 || this.f8676) {
            return f8665;
        }
        if (this.f8668) {
            return f8666;
        }
        if (this.f8675 || this.f8677 || this.f8672 || this.f8679) {
            return f8667;
        }
        return C7225.f22117;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0137, code lost:
    
        if (r4 != r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0122, code lost:
    
        if (r3 != 'P') goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0128, code lost:
    
        if (r3 == (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        if (r4 != (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        r4 = r4 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b2, code lost:
    
        if (r4 != (-1)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0185  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m8604(int r18, java.lang.CharSequence r19) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2784.m8604(int, java.lang.CharSequence):int");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m8603(int i, CharSequence charSequence) {
        char charAt;
        int i2 = (i >= charSequence.length() || !((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) ? 0 : 1;
        int m8597 = m8597(charSequence, i + i2, 10, false);
        if (m8597 == -1) {
            return -1;
        }
        int i3 = m8597 + i2;
        return i3 + m8598(this.f8671, charSequence, i + i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r6 != false) goto L7;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m8596(int r4, java.lang.CharSequence r5, boolean r6) {
        /*
            r3 = this;
            r0 = 10
            r1 = 0
            int r0 = r3.m8597(r5, r4, r0, r1)
            r2 = -1
            if (r0 != r2) goto Ld
            if (r6 == 0) goto L45
            goto Le
        Ld:
            r1 = r0
        Le:
            int r4 = r4 + r1
            boolean r6 = r3.f8676
            if (r6 == 0) goto L39
            int r6 = r5.length()
            if (r4 >= r6) goto L39
            char r6 = r5.charAt(r4)
            r0 = 101(0x65, float:1.42E-43)
            if (r6 == r0) goto L25
            r0 = 69
            if (r6 != r0) goto L39
        L25:
            int r6 = r5.length()
            r0 = 1
            int r6 = r6 - r0
            if (r4 >= r6) goto L37
            int r4 = r4 + r0
            int r4 = r3.m8602(r4, r5)
            if (r4 != r2) goto L35
            goto L45
        L35:
            int r1 = r1 + r0
            goto L43
        L37:
            r3.f8670 = r0
        L39:
            boolean r6 = r3.f8673
            if (r6 == 0) goto L45
            java.util.List r6 = r3.f8671
            int r4 = r3.m8598(r6, r5, r4)
        L43:
            int r1 = r1 + r4
            return r1
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2784.m8596(int, java.lang.CharSequence, boolean):int");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m8602(int i, CharSequence charSequence) {
        char charAt;
        int i2 = (i >= charSequence.length() || !((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) ? 0 : 1;
        int m8597 = m8597(charSequence, i + i2, 10, false);
        if (m8597 == -1) {
            return -1;
        }
        int i3 = m8597 + i2;
        return i3 + m8598(this.f8671, charSequence, i + i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0055, code lost:
    
        if (r1 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0057, code lost:
    
        if (r2 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005b, code lost:
    
        return -1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m8597(java.lang.CharSequence r6, int r7, int r8, boolean r9) {
        /*
            r5 = this;
            int r0 = r6.length()
            r1 = 0
            r2 = 0
        L6:
            r3 = 1
            if (r7 >= r0) goto L53
            int r3 = r7 + 1
            char r7 = r6.charAt(r7)
            r4 = 48
            if (r4 > r7) goto L1b
            r4 = 57
            if (r7 > r4) goto L1b
            int r4 = r7 + (-48)
            if (r4 < r8) goto L33
        L1b:
            r4 = 97
            if (r4 > r7) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r7 > r4) goto L27
            int r4 = r7 + (-87)
            if (r4 < r8) goto L33
        L27:
            r4 = 65
            if (r4 > r7) goto L38
            r4 = 70
            if (r7 > r4) goto L38
            int r4 = r7 + (-55)
            if (r4 >= r8) goto L38
        L33:
            int r1 = r1 + 1
            r7 = 0
            r2 = 0
            goto L51
        L38:
            boolean r4 = r5.f8678
            if (r4 == 0) goto L40
            r4 = 95
            if (r7 == r4) goto L48
        L40:
            boolean r4 = r5.f8669
            if (r4 == 0) goto L55
            r4 = 39
            if (r7 != r4) goto L55
        L48:
            if (r9 != 0) goto L4d
            if (r1 != 0) goto L4d
            goto L5b
        L4d:
            int r1 = r1 + 1
            r7 = 1
            r2 = 1
        L51:
            r7 = r3
            goto L6
        L53:
            r5.f8670 = r3
        L55:
            if (r1 == 0) goto L5b
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            return r1
        L5b:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2784.m8597(java.lang.CharSequence, int, int, boolean):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m8598(List list, CharSequence charSequence, int i) {
        if (list.isEmpty() || ((String) list.get(0)).isEmpty() || i == charSequence.length()) {
            return 0;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            int length = str.length();
            if (i >= 0 && i <= charSequence.length()) {
                int length2 = charSequence.length() - i;
                int min = Math.min(length, length2);
                int i3 = 0;
                while (true) {
                    if (i3 < min) {
                        if (Character.toLowerCase(charSequence.charAt(i + i3)) != str.charAt(i3)) {
                            break;
                        }
                        i3++;
                    } else {
                        if (length <= length2) {
                            return str.length();
                        }
                        this.f8670 = true;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e A[RETURN] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m8601(int r6, java.lang.CharSequence r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = m8600(r6, r7)
            int r1 = r7.length()
            r2 = 1
            r3 = 0
            if (r6 >= r1) goto L50
            int r1 = java.lang.Character.codePointAt(r7, r6)
            if (r8 == 0) goto L22
            int r8 = r7.length()
            int r8 = r8 - r2
            if (r6 != r8) goto L22
            char r8 = (char) r1
            boolean r8 = java.lang.Character.isHighSurrogate(r8)
            if (r8 == 0) goto L22
            r5.f8670 = r2
        L22:
            r8 = 95
            if (r1 == r8) goto L4e
            r8 = 46
            if (r1 == r8) goto L4e
            boolean r8 = m8599(r1)
            if (r8 == 0) goto L31
            goto L4e
        L31:
            int r8 = java.lang.Character.getType(r1)
            r1 = 6
            if (r8 != r1) goto L5a
        L38:
            if (r6 < 0) goto L5a
            int r8 = java.lang.Character.codePointAt(r7, r6)
            boolean r4 = m8599(r8)
            if (r4 == 0) goto L45
            goto L4e
        L45:
            int r8 = java.lang.Character.getType(r8)
            if (r8 != r1) goto L5a
            int r6 = r6 + (-1)
            goto L38
        L4e:
            r6 = 1
            goto L5b
        L50:
            if (r8 == 0) goto L5a
            int r7 = r7.length()
            if (r6 != r7) goto L5a
            r5.f8670 = r2
        L5a:
            r6 = 0
        L5b:
            if (r0 == r6) goto L5e
            return r2
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2784.m8601(int, java.lang.CharSequence, boolean):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8600(int i, CharSequence charSequence) {
        if (i <= 0) {
            return false;
        }
        int codePointBefore = Character.codePointBefore(charSequence, i);
        if (codePointBefore == 95 || codePointBefore == 46 || m8599(codePointBefore)) {
            return true;
        }
        if (Character.getType(codePointBefore) != 6) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            if (m8599(codePointAt)) {
                return true;
            }
            if (Character.getType(codePointAt) != 6) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8599(int i) {
        if (i > 127) {
            return Character.isLetterOrDigit(i);
        }
        if (97 <= i && i <= 122) {
            return true;
        }
        if (65 > i || i > 90) {
            return 48 <= i && i <= 57;
        }
        return true;
    }
}
