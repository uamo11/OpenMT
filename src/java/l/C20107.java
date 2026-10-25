package l;

import java.util.ArrayList;

/* compiled from: M6OA */
/* renamed from: l.᩶ۤۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20107 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4460 f65105;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f65106;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int[] f65107;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21518[] f65108;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CharSequence f65109;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int[] f65110;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f65111;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21518[] f65112;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f65113;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f65114;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f65115;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65116;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f65117;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19012 f65118;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m46364(int i) {
        return i == 31 || i == 48 || i == 46;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x005c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20107(java.lang.CharSequence r5, java.util.ArrayList r6, java.lang.String r7, java.lang.String r8, int r9, l.C4460 r10, l.C19012 r11) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20107.<init>(java.lang.CharSequence, java.util.ArrayList, java.lang.String, java.lang.String, int, l.ۙۛۢ, l.ᩴ᩷ܿ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r11 > (r8.f69186 + 1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r13 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (((r12 - r16.length()) + r13) > 100) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0181, code lost:
    
        if (((r3 - r4.length()) + r5) > 100) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m46365() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20107.m46365():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m46363(int i) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        if (i == 0) {
            return false;
        }
        C22223 c22223 = (C22223) this.f65117.get(i);
        z = c22223.f72110;
        if (z) {
            return false;
        }
        z2 = c22223.f72114;
        if (z2) {
            return false;
        }
        i2 = c22223.f72111;
        if (m46364(i2)) {
            return false;
        }
        i3 = c22223.f72111;
        if (i3 == 17) {
            return false;
        }
        C21518 c21518 = this.f65108[i];
        z3 = c22223.f72118;
        return z3 || !(c21518 == null || c21518.f69189 || i != c21518.f69185 + 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46362(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        C19012 c19012 = this.f65118;
        if (i4 > 1048576 - c19012.length()) {
            throw C12221.m29712(EnumC19402.LIMIT, "Formatted source length limit exceeded");
        }
        c19012.m43854(i, i2, charSequence);
        int i5 = 0;
        while (i < i2) {
            int i6 = i5 + 1;
            if ((i5 & 1023) == 0) {
                this.f65105.m13206();
            }
            int codePointAt = Character.codePointAt(charSequence, i);
            if (codePointAt == 10 || codePointAt == 13) {
                this.f65111 = 0;
                this.f65114 = 0;
            } else if (codePointAt != 65279) {
                int i7 = this.f65111;
                if (codePointAt == 9) {
                    int i8 = this.f65113;
                    i3 = i8 - (i7 % i8);
                } else {
                    i3 = 1;
                }
                this.f65111 = i7 + i3;
            }
            i += Character.charCount(codePointAt);
            i5 = i6;
        }
    }
}
