package l;

import com.google.android.material.color.MaterialColors;
import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: 2B08 */
/* renamed from: l.ܿۜۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C17175 implements Closeable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int[] f52625;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String[] f52630;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f52632;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f52633;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f52635;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final StringReader f52639;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f52640;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public EnumC16093 f52636 = EnumC16093.LEGACY_STRICT;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f52634 = 255;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f52638 = new char[1024];

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f52629 = 0;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52637 = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52627 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f52626 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f52628 = 0;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f52631 = 1;

    public C17175(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f52625 = iArr;
        iArr[0] = 6;
        this.f52630 = new String[32];
        this.f52633 = new int[32];
        this.f52639 = stringReader;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m40405() {
        return this.f52636 == EnumC16093.LENIENT;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40392(EnumC16093 enumC16093) {
        C11003.requireNonNull(enumC16093);
        this.f52636 = enumC16093;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC16093 m40395() {
        return this.f52636;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40391() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 3) {
            m40382(1);
            this.f52633[this.f52631 - 1] = 0;
            this.f52628 = 0;
            return;
        }
        throw m40381("BEGIN_ARRAY");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m40400() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 4) {
            int i2 = this.f52631;
            this.f52631 = i2 - 1;
            int[] iArr = this.f52633;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.f52628 = 0;
            return;
        }
        throw m40381("END_ARRAY");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m40402() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 1) {
            m40382(3);
            this.f52628 = 0;
            return;
        }
        throw m40381("BEGIN_OBJECT");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m40410() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 2) {
            int i2 = this.f52631;
            int i3 = i2 - 1;
            this.f52631 = i3;
            this.f52630[i3] = null;
            int[] iArr = this.f52633;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.f52628 = 0;
            return;
        }
        throw m40381("END_OBJECT");
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m40404() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC14352 m40398() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        switch (i) {
            case 1:
                return EnumC14352.BEGIN_OBJECT;
            case 2:
                return EnumC14352.END_OBJECT;
            case 3:
                return EnumC14352.BEGIN_ARRAY;
            case 4:
                return EnumC14352.END_ARRAY;
            case 5:
            case 6:
                return EnumC14352.BOOLEAN;
            case 7:
                return EnumC14352.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC14352.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC14352.NAME;
            case 15:
            case 16:
                return EnumC14352.NUMBER;
            case 17:
                return EnumC14352.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0217, code lost:
    
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021d, code lost:
    
        if (m40383(r14) != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x021f, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0220, code lost:
    
        if (r6 != 2) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0222, code lost:
    
        if (r9 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0228, code lost:
    
        if (r4 != Long.MIN_VALUE) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x022a, code lost:
    
        if (r10 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022e, code lost:
    
        if (r4 != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0230, code lost:
    
        if (r10 != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0232, code lost:
    
        if (r10 == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0235, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0236, code lost:
    
        r22.f52632 = r4;
        r22.f52629 += r21;
        r1 = 15;
        r22.f52628 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0243, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0244, code lost:
    
        if (r6 == r1) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0247, code lost:
    
        if (r6 == 4) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x024a, code lost:
    
        if (r6 != 7) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x024c, code lost:
    
        r22.f52640 = r21;
        r1 = 16;
        r22.f52628 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0275 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0276  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m40403() {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17175.m40403():int");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m40383(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m40385();
        return false;
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m40396() {
        String m40386;
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 14) {
            m40386 = m40379();
        } else if (i == 12) {
            m40386 = m40386('\'');
        } else if (i == 13) {
            m40386 = m40386('\"');
        } else {
            throw m40381("a name");
        }
        this.f52628 = 0;
        this.f52630[this.f52631 - 1] = m40386;
        return m40386;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String m40399() {
        String str;
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 10) {
            str = m40379();
        } else if (i == 8) {
            str = m40386('\'');
        } else if (i == 9) {
            str = m40386('\"');
        } else if (i == 11) {
            str = this.f52635;
            this.f52635 = null;
        } else if (i == 15) {
            str = Long.toString(this.f52632);
        } else if (i == 16) {
            str = new String(this.f52638, this.f52629, this.f52640);
            this.f52629 += this.f52640;
        } else {
            throw m40381("a string");
        }
        this.f52628 = 0;
        int[] iArr = this.f52633;
        int i2 = this.f52631 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean m40401() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 5) {
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i2 = this.f52631 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.f52628 = 0;
            int[] iArr2 = this.f52633;
            int i3 = this.f52631 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw m40381("a boolean");
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public void m40394() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 7) {
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i2 = this.f52631 - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw m40381("null");
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double m40407() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 15) {
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i2 = this.f52631 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f52632;
        }
        if (i == 16) {
            this.f52635 = new String(this.f52638, this.f52629, this.f52640);
            this.f52629 += this.f52640;
        } else if (i == 8 || i == 9) {
            this.f52635 = m40386(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f52635 = m40379();
        } else if (i != 11) {
            throw m40381("a double");
        }
        this.f52628 = 11;
        double parseDouble = Double.parseDouble(this.f52635);
        if (this.f52636 != EnumC16093.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            m40377("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f52635 = null;
        this.f52628 = 0;
        int[] iArr2 = this.f52633;
        int i3 = this.f52631 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long m40406() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 15) {
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i2 = this.f52631 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f52632;
        }
        if (i == 16) {
            this.f52635 = new String(this.f52638, this.f52629, this.f52640);
            this.f52629 += this.f52640;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f52635 = m40379();
            } else {
                this.f52635 = m40386(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f52635);
                this.f52628 = 0;
                int[] iArr2 = this.f52633;
                int i3 = this.f52631 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw m40381("a long");
        }
        this.f52628 = 11;
        double parseDouble = Double.parseDouble(this.f52635);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f52635 + m40390());
        }
        this.f52635 = null;
        this.f52628 = 0;
        int[] iArr3 = this.f52633;
        int i4 = this.f52631 - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.f52629 = r8;
        r8 = r8 - r2;
        r3 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r2) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r7, r2, r4 - r2);
        r11.f52629 = r4;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m40386(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f52629
            int r3 = r11.f52637
        L6:
            r4 = r2
        L7:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f52638
            if (r4 >= r3) goto L6b
            int r8 = r4 + 1
            char r4 = r7[r4]
            l.ܺᩳۖ r9 = r11.f52636
            l.ܺᩳۖ r10 = l.EnumC16093.STRICT
            if (r9 != r10) goto L23
            r9 = 32
            if (r4 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.m40377(r12)
            throw r0
        L23:
            if (r4 != r12) goto L39
            r11.f52629 = r8
            int r8 = r8 - r2
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r2, r8)
            return r12
        L31:
            r1.append(r7, r2, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r4 != r9) goto L5e
            r11.f52629 = r8
            int r8 = r8 - r2
            int r3 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r2, r3)
            char r2 = r11.m40384()
            r1.append(r2)
            int r2 = r11.f52629
            int r3 = r11.f52637
            goto L6
        L5e:
            r5 = 10
            if (r4 != r5) goto L69
            int r4 = r11.f52627
            int r4 = r4 + r6
            r11.f52627 = r4
            r11.f52626 = r8
        L69:
            r4 = r8
            goto L7
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r4 - r2
            int r1 = r1 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r3.<init>(r1)
            r1 = r3
        L7b:
            int r3 = r4 - r2
            r1.append(r7, r2, r3)
            r11.f52629 = r4
            boolean r2 = r11.m40378(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.m40377(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17175.m40386(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        m40385();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m40379() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r7.f52629
            int r4 = r3 + r2
            int r5 = r7.f52637
            char[] r6 = r7.f52638
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.m40385()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m40378(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f52629
            r0.append(r6, r3, r2)
            int r3 = r7.f52629
            int r3 = r3 + r2
            r7.f52629 = r3
            r2 = 1
            boolean r2 = r7.m40378(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f52629
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f52629
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f52629
            int r2 = r2 + r1
            r7.f52629 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17175.m40379():java.lang.String");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m40388(char c) {
        do {
            int i = this.f52629;
            int i2 = this.f52637;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f52638[i];
                if (c2 == c) {
                    this.f52629 = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f52629 = i3;
                    m40384();
                    i = this.f52629;
                    i2 = this.f52637;
                } else {
                    if (c2 == '\n') {
                        this.f52627++;
                        this.f52626 = i3;
                    }
                    i = i3;
                }
            }
            this.f52629 = i;
        } while (m40378(1));
        m40377("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m40385();
     */
    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m40387() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f52629
            int r2 = r1 + r0
            int r3 = r4.f52637
            if (r2 >= r3) goto L51
            char[] r2 = r4.f52638
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m40385()
        L4b:
            int r1 = r4.f52629
            int r1 = r1 + r0
            r4.f52629 = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f52629 = r1
            r0 = 1
            boolean r0 = r4.m40378(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17175.m40387():void");
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int m40408() {
        int i = this.f52628;
        if (i == 0) {
            i = m40403();
        }
        if (i == 15) {
            long j = this.f52632;
            int i2 = (int) j;
            if (j != i2) {
                throw new NumberFormatException("Expected an int but was " + this.f52632 + m40390());
            }
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i3 = this.f52631 - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.f52635 = new String(this.f52638, this.f52629, this.f52640);
            this.f52629 += this.f52640;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f52635 = m40379();
            } else {
                this.f52635 = m40386(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f52635);
                this.f52628 = 0;
                int[] iArr2 = this.f52633;
                int i4 = this.f52631 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw m40381("an int");
        }
        this.f52628 = 11;
        double parseDouble = Double.parseDouble(this.f52635);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f52635 + m40390());
        }
        this.f52635 = null;
        this.f52628 = 0;
        int[] iArr3 = this.f52633;
        int i6 = this.f52631 - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52628 = 0;
        this.f52625[0] = 8;
        this.f52631 = 1;
        this.f52639.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m40409() {
        int i = 0;
        do {
            int i2 = this.f52628;
            if (i2 == 0) {
                i2 = m40403();
            }
            switch (i2) {
                case 1:
                    m40382(3);
                    i++;
                    this.f52628 = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f52630[this.f52631 - 1] = null;
                    }
                    this.f52631--;
                    i--;
                    this.f52628 = 0;
                    break;
                case 3:
                    m40382(1);
                    i++;
                    this.f52628 = 0;
                    break;
                case 4:
                    this.f52631--;
                    i--;
                    this.f52628 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f52628 = 0;
                    break;
                case 8:
                    m40388('\'');
                    this.f52628 = 0;
                    break;
                case 9:
                    m40388('\"');
                    this.f52628 = 0;
                    break;
                case 10:
                    m40387();
                    this.f52628 = 0;
                    break;
                case 12:
                    m40388('\'');
                    if (i == 0) {
                        this.f52630[this.f52631 - 1] = "<skipped>";
                    }
                    this.f52628 = 0;
                    break;
                case 13:
                    m40388('\"');
                    if (i == 0) {
                        this.f52630[this.f52631 - 1] = "<skipped>";
                    }
                    this.f52628 = 0;
                    break;
                case 14:
                    m40387();
                    if (i == 0) {
                        this.f52630[this.f52631 - 1] = "<skipped>";
                    }
                    this.f52628 = 0;
                    break;
                case 16:
                    this.f52629 += this.f52640;
                    this.f52628 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f52633;
        int i3 = this.f52631 - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40382(int i) {
        int i2 = this.f52631;
        int i3 = i2 - 1;
        int i4 = this.f52634;
        if (i3 >= i4) {
            StringBuilder m32308 = C13325.m32308(i4, "Nesting limit ", " reached");
            m32308.append(m40390());
            throw new C6592(m32308.toString());
        }
        int[] iArr = this.f52625;
        if (i2 == iArr.length) {
            int i5 = i2 * 2;
            this.f52625 = Arrays.copyOf(iArr, i5);
            this.f52633 = Arrays.copyOf(this.f52633, i5);
            this.f52630 = (String[]) Arrays.copyOf(this.f52630, i5);
        }
        int[] iArr2 = this.f52625;
        int i6 = this.f52631;
        this.f52631 = i6 + 1;
        iArr2[i6] = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40378(int i) {
        int i2;
        int i3;
        int i4 = this.f52626;
        int i5 = this.f52629;
        this.f52626 = i4 - i5;
        int i6 = this.f52637;
        char[] cArr = this.f52638;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f52637 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f52637 = 0;
        }
        this.f52629 = 0;
        do {
            int i8 = this.f52637;
            int read = this.f52639.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f52637 + read;
            this.f52637 = i2;
            if (this.f52627 == 0 && (i3 = this.f52626) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f52629++;
                this.f52626 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m40380(boolean z) {
        char c;
        int i = this.f52629;
        int i2 = this.f52637;
        while (true) {
            if (i == i2) {
                this.f52629 = i;
                if (!m40378(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m40390());
                }
                i = this.f52629;
                i2 = this.f52637;
            }
            int i3 = i + 1;
            char[] cArr = this.f52638;
            c = cArr[i];
            if (c == '\n') {
                this.f52627++;
                this.f52626 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f52629 = i3;
                    if (i3 == i2) {
                        this.f52629 = i;
                        boolean m40378 = m40378(2);
                        this.f52629++;
                        if (!m40378) {
                            break;
                        }
                    }
                    m40385();
                    int i4 = this.f52629;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f52629 = i4 + 1;
                        while (true) {
                            if (this.f52629 + 2 > this.f52637 && !m40378(2)) {
                                m40377("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f52629;
                            if (cArr[i5] != '\n') {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (cArr[this.f52629 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                }
                                i = this.f52629 + 2;
                                i2 = this.f52637;
                                break;
                            }
                            this.f52627++;
                            this.f52626 = i5 + 1;
                            this.f52629++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.f52629 = i4 + 1;
                        m40389();
                        i = this.f52629;
                        i2 = this.f52637;
                    }
                } else if (c == '#') {
                    this.f52629 = i3;
                    m40385();
                    m40389();
                    i = this.f52629;
                    i2 = this.f52637;
                } else {
                    this.f52629 = i3;
                    return c;
                }
            }
            i = i3;
        }
        return c;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m40385() {
        if (this.f52636 == EnumC16093.LENIENT) {
            return;
        }
        m40377("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m40389() {
        char c;
        do {
            if (this.f52629 >= this.f52637 && !m40378(1)) {
                return;
            }
            int i = this.f52629;
            int i2 = i + 1;
            this.f52629 = i2;
            c = this.f52638[i];
            if (c == '\n') {
                this.f52627++;
                this.f52626 = i2;
                return;
            }
        } while (c != '\r');
    }

    public String toString() {
        return getClass().getSimpleName() + m40390();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m40390() {
        StringBuilder m46682 = C20361.m46682(" at line ", this.f52627 + 1, " column ", " path ", (this.f52629 - this.f52626) + 1);
        m46682.append(m40397());
        return m46682.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m40376(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f52631;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f52625[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f52633[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f52630[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(C19370.m44628(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String m40397() {
        return m40376(false);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String m40393() {
        return m40376(true);
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private char m40384() {
        int i;
        if (this.f52629 == this.f52637 && !m40378(1)) {
            m40377("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f52629;
        int i3 = i2 + 1;
        this.f52629 = i3;
        char[] cArr = this.f52638;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c == 'u') {
                            if (i2 + 5 > this.f52637 && !m40378(4)) {
                                m40377("Unterminated escape sequence");
                                throw null;
                            }
                            int i4 = this.f52629;
                            int i5 = i4 + 4;
                            int i6 = 0;
                            while (i4 < i5) {
                                char c2 = cArr[i4];
                                int i7 = i6 << 4;
                                if (c2 >= '0' && c2 <= '9') {
                                    i = c2 - '0';
                                } else if (c2 >= 'a' && c2 <= 'f') {
                                    i = c2 - 'W';
                                } else {
                                    if (c2 < 'A' || c2 > 'F') {
                                        m40377("Malformed Unicode escape \\u".concat(new String(cArr, this.f52629, 4)));
                                        throw null;
                                    }
                                    i = c2 - '7';
                                }
                                i6 = i7 + i;
                                i4++;
                            }
                            this.f52629 += 4;
                            return (char) i6;
                        }
                        m40377("Invalid escape sequence");
                        throw null;
                    }
                }
            }
            return c;
        }
        if (this.f52636 == EnumC16093.STRICT) {
            m40377("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f52627++;
        this.f52626 = i3;
        if (this.f52636 == EnumC16093.STRICT) {
            m40377("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40377(String str) {
        StringBuilder m15339 = C5368.m15339(str);
        m15339.append(m40390());
        m15339.append("\nSee ");
        m15339.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new C6592(m15339.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public IllegalStateException m40381(String str) {
        String str2 = m40398() == EnumC14352.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder m9834 = C3200.m9834("Expected ", str, " but was ");
        m9834.append(m40398());
        m9834.append(m40390());
        m9834.append("\nSee ");
        m9834.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(m9834.toString());
    }

    static {
        AbstractC23149.f74411 = new C17881();
    }
}
