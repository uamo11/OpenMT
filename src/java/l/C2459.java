package l;

import org.bouncycastle.pqc.crypto.newhope.Params;

/* compiled from: S2ZO */
/* renamed from: l.ۖۤ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2459 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f7846 = new byte[Params.POLY_BYTES];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7847;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char f7848;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f7849;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f7850;

    static {
        for (int i = 0; i < 1792; i++) {
            f7846[i] = Character.getDirectionality(i);
        }
    }

    public C2459(CharSequence charSequence) {
        this.f7850 = charSequence;
        this.f7849 = charSequence.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0069, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006c, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0071, code lost:
    
        if (r9.f7847 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0077, code lost:
    
        switch(m7927()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007e, code lost:
    
        if (r1 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0084, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0081, code lost:
    
        if (r1 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0087, code lost:
    
        return 0;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m7928() {
        /*
            r9 = this;
            r0 = 0
            r9.f7847 = r0
            r1 = 0
            r2 = 0
            r3 = 0
        L6:
            int r4 = r9.f7847
            int r5 = r9.f7849
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L69
            if (r1 != 0) goto L69
            java.lang.CharSequence r5 = r9.f7850
            char r4 = r5.charAt(r4)
            r9.f7848 = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L32
            int r4 = r9.f7847
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r9.f7847
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r9.f7847 = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L46
        L32:
            int r4 = r9.f7847
            int r4 = r4 + r7
            r9.f7847 = r4
            char r4 = r9.f7848
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L42
            byte[] r5 = l.C2459.f7846
            r4 = r5[r4]
            goto L46
        L42:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L46:
            if (r4 == 0) goto L64
            if (r4 == r7) goto L61
            r5 = 2
            if (r4 == r5) goto L61
            r5 = 9
            if (r4 == r5) goto L6
            switch(r4) {
                case 14: goto L5d;
                case 15: goto L5d;
                case 16: goto L59;
                case 17: goto L59;
                case 18: goto L55;
                default: goto L54;
            }
        L54:
            goto L67
        L55:
            int r3 = r3 + (-1)
            r2 = 0
            goto L6
        L59:
            int r3 = r3 + 1
            r2 = 1
            goto L6
        L5d:
            int r3 = r3 + 1
            r2 = -1
            goto L6
        L61:
            if (r3 != 0) goto L67
            goto L80
        L64:
            if (r3 != 0) goto L67
            goto L83
        L67:
            r1 = r3
            goto L6
        L69:
            if (r1 != 0) goto L6c
            goto L87
        L6c:
            if (r2 == 0) goto L6f
            return r2
        L6f:
            int r2 = r9.f7847
            if (r2 <= 0) goto L87
            byte r2 = r9.m7927()
            switch(r2) {
                case 14: goto L81;
                case 15: goto L81;
                case 16: goto L7e;
                case 17: goto L7e;
                case 18: goto L7b;
                default: goto L7a;
            }
        L7a:
            goto L6f
        L7b:
            int r3 = r3 + 1
            goto L6f
        L7e:
            if (r1 != r3) goto L84
        L80:
            return r7
        L81:
            if (r1 != r3) goto L84
        L83:
            return r6
        L84:
            int r3 = r3 + (-1)
            goto L6f
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2459.m7928():int");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m7929() {
        this.f7847 = this.f7849;
        int i = 0;
        int i2 = 0;
        while (this.f7847 > 0) {
            byte m7927 = m7927();
            if (m7927 != 0) {
                if (m7927 == 1 || m7927 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (m7927 != 9) {
                    switch (m7927) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            } else {
                                i2 = i;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m7927() {
        int i = this.f7847 - 1;
        CharSequence charSequence = this.f7850;
        char charAt = charSequence.charAt(i);
        this.f7848 = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f7847);
            this.f7847 -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f7847--;
        char c = this.f7848;
        return c < 1792 ? f7846[c] : Character.getDirectionality(c);
    }
}
