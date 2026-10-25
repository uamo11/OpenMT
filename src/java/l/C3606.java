package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: EBIJ */
/* renamed from: l.ۘ֨ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3606 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f11431 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f11432;

    public C3606(String str) {
        C16990.m39822((Object) str);
        this.f11432 = str;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m11066() {
        return this.f11432.length() - this.f11431 == 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11068(String str) {
        return this.f11432.regionMatches(true, this.f11431, str, 0, str.length());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11065(String... strArr) {
        for (String str : strArr) {
            if (m11068(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11064(String str) {
        if (!m11068(str)) {
            return false;
        }
        this.f11431 = str.length() + this.f11431;
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m11069() {
        boolean z = false;
        while (!m11066() && C20519.m47003(this.f11432.charAt(this.f11431))) {
            this.f11431++;
            z = true;
        }
        return z;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m11071() {
        return !m11066() && Character.isLetterOrDigit(this.f11432.charAt(this.f11431));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m11063() {
        int i = this.f11431;
        this.f11431 = i + 1;
        return this.f11432.charAt(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11061(String str) {
        if (!m11068(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f11432.length();
        int i = this.f11431;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f11431 = i + length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m11058() {
        String m11062;
        int i = this.f11431;
        String str = this.f11432;
        int indexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END, i);
        if (indexOf != -1) {
            m11062 = str.substring(this.f11431, indexOf);
            this.f11431 = m11062.length() + this.f11431;
        } else {
            m11062 = m11062();
        }
        m11064(MotionUtils.EASING_TYPE_FORMAT_END);
        return m11062;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m11060(String... strArr) {
        int i = this.f11431;
        while (!m11066() && !m11065(strArr)) {
            this.f11431++;
        }
        return this.f11432.substring(i, this.f11431);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[LOOP:0: B:2:0x0008->B:24:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[EDGE_INSN: B:25:0x0055->B:26:0x0055 BREAK  A[LOOP:0: B:2:0x0008->B:24:0x0071], SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m11059(char r11, char r12) {
        /*
            r10 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
        L8:
            boolean r8 = r10.m11066()
            if (r8 == 0) goto Lf
            goto L55
        Lf:
            char r8 = r10.m11063()
            r9 = 92
            if (r1 == r9) goto L41
            r9 = 39
            if (r8 != r9) goto L22
            if (r8 == r11) goto L22
            if (r2 != 0) goto L22
            r3 = r3 ^ 1
            goto L2c
        L22:
            r9 = 34
            if (r8 != r9) goto L2c
            if (r8 == r11) goto L2c
            if (r3 != 0) goto L2c
            r2 = r2 ^ 1
        L2c:
            if (r3 != 0) goto L53
            if (r2 != 0) goto L53
            if (r7 == 0) goto L33
            goto L53
        L33:
            if (r8 != r11) goto L3c
            int r6 = r6 + 1
            if (r4 != r0) goto L4c
            int r4 = r10.f11431
            goto L4c
        L3c:
            if (r8 != r12) goto L4c
            int r6 = r6 + (-1)
            goto L4c
        L41:
            r9 = 81
            if (r8 != r9) goto L47
            r7 = 1
            goto L4c
        L47:
            r9 = 69
            if (r8 != r9) goto L4c
            r7 = 0
        L4c:
            if (r6 <= 0) goto L53
            if (r1 == 0) goto L53
            int r1 = r10.f11431
            r5 = r1
        L53:
            if (r6 > 0) goto L71
        L55:
            if (r5 < 0) goto L5e
            java.lang.String r11 = r10.f11432
            java.lang.String r11 = r11.substring(r4, r5)
            goto L60
        L5e:
            java.lang.String r11 = ""
        L60:
            if (r6 > 0) goto L63
            return r11
        L63:
            java.lang.String r12 = "Did not find balanced marker at '"
            java.lang.String r0 = "'"
            java.lang.String r11 = l.C4860.m14172(r12, r11, r0)
            l.ܳ֡ۚ r12 = new l.ܳ֡ۚ
            r12.<init>(r11)
            throw r12
        L71:
            r1 = r8
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3606.m11059(char, char):java.lang.String");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m11057(String str) {
        StringBuilder m47000 = C20519.m47000();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                m47000.append(c2);
            } else if (c == '\\') {
                m47000.append(c2);
            }
            i++;
            c = c2;
        }
        return C20519.m46998(m47000);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m11070() {
        int i = this.f11431;
        while (!m11066() && (m11071() || m11065("*|", "|", "_", "-"))) {
            this.f11431++;
        }
        return this.f11432.substring(i, this.f11431);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m11067() {
        String str;
        int i = this.f11431;
        loop0: while (true) {
            boolean m11066 = m11066();
            str = this.f11432;
            if (m11066) {
                break;
            }
            if (!m11071()) {
                char[] cArr = {'-', '_'};
                if (!m11066()) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        if (str.charAt(this.f11431) == cArr[i2]) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            this.f11431++;
        }
        return str.substring(i, this.f11431);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m11062() {
        int i = this.f11431;
        String str = this.f11432;
        String substring = str.substring(i);
        this.f11431 = str.length();
        return substring;
    }

    public final String toString() {
        return this.f11432.substring(this.f11431);
    }
}
