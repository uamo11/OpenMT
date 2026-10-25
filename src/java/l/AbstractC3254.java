package l;

import com.google.android.material.textfield.TextInputLayout;
import java.util.HashMap;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* compiled from: 76QN */
/* renamed from: l.ۗ۬ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC3254 extends AbstractC9637 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f10220;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23695 f10221;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18051 f10222;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f10223;

    public AbstractC3254(C1875 c1875) {
        super(c1875);
        this.f10220 = new HashMap();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9952(boolean z) {
        this.f10223 = z;
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9966() {
        return this.f10223;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9951(C18051 c18051) {
        this.f10222 = c18051;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m9972() {
        C18051 c18051 = this.f10222;
        return c18051 == null || c18051.m42107(this.f29208.mo6211(1).mo2054());
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9967() {
        C18051 c18051 = this.f10222;
        return c18051 == null || c18051.m42110(this.f29208.mo6211(1).mo2054());
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m9954() {
        boolean m9950;
        int mo6203 = this.f29208.mo6203(1);
        if (mo6203 == 40) {
            m9950 = m9967();
        } else {
            if (mo6203 != 44 || !m9972()) {
                return true;
            }
            m9950 = m9950(this.f29208.mo6203(2));
        }
        return !m9950;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m9950(int i) {
        if (i != 5 && i != 6 && i != 7 && i != 100 && i != 101 && i != 125 && i != 126 && i != 133 && i != 134) {
            switch (i) {
                case 11:
                case 16:
                case 23:
                case 25:
                case 28:
                case 30:
                case 32:
                case 35:
                case 37:
                case 89:
                case 91:
                    break;
                case 115:
                    return this.f10223;
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                case 138:
                                case 139:
                                case 140:
                                    break;
                                default:
                                    return i >= 40 && i <= 83 && i != 43;
                            }
                        case 84:
                        case 85:
                        case HRSS1373Polynomial.K /* 86 */:
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                            return true;
                    }
            }
        }
        return true;
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m9956() {
        return m9949(this.f29208.mo6211(1), this.f29208.mo6211(2));
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9969() {
        int i = this.f29208.mo6203(1) == 44 ? 2 : 1;
        return this.f29208.mo6203(i) == 83 && m9949(this.f29208.mo6211(1), this.f29208.mo6211(i + 1));
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m9970() {
        return m9949(this.f29208.mo6211(1), this.f29208.mo6211(2));
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9960() {
        return m9949(this.f29208.mo6211(1), this.f29208.mo6211(2));
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m9973() {
        return this.f10223 && this.f29208.mo6203(1) != 91;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m9965() {
        int i = 3;
        if (this.f29208.mo6203(2) == 89) {
            int i2 = 1;
            while (i2 != 0) {
                int i3 = i + 1;
                int mo6203 = this.f29208.mo6203(i);
                if (mo6203 == -1) {
                    return false;
                }
                if (mo6203 == 89) {
                    i2++;
                } else if (mo6203 == 90) {
                    i2--;
                }
                i = i3;
            }
        }
        return this.f29208.mo6203(i) == 87;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        if (m9950(r2) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7 A[ADDED_TO_REGION, FALL_THROUGH] */
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9953() {
        /*
            r7 = this;
            boolean r0 = r7.f10223
            r1 = 0
            if (r0 == 0) goto Ld2
            l.֫ܳ֡ r0 = r7.f29208
            r2 = 1
            int r0 = r0.mo6203(r2)
            r3 = 115(0x73, float:1.61E-43)
            if (r0 == r3) goto L12
            goto Ld2
        L12:
            l.֫ܳ֡ r0 = r7.f29208
            int r0 = r0.index()
            java.util.HashMap r4 = r7.f10220
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L2b
            boolean r0 = r4.booleanValue()
            return r0
        L2b:
            java.util.HashMap r4 = r7.f10220
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.put(r5, r6)
            l.ۙ۬ۢ r4 = new l.ۙ۬ۢ     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            l.֫ܳ֡ r5 = r7.f29208     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            l.᩻۫ۢ r5 = r7.f10221     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            if (r5 != 0) goto L4a
            l.᩻۫ۢ r5 = new l.᩻۫ۢ     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            l.᩸ܳ֡ r6 = l.C4665.f14830     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r7.f10221 = r5     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
        L4a:
            l.ۡ۫ۢ r5 = new l.ۡ۫ۢ     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            l.᩻۫ۢ r6 = r7.f10221     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.m43457(r5)     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.f10223 = r2     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            l.ᩳ۫ۢ r5 = r7.f10222     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.f10222 = r5     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            java.util.HashMap r5 = r7.f10220     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.f10220 = r5     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            l.᩻۫ۢ r5 = r7.f10221     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.f10221 = r5     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.m24568()     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.m43458()     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            l.ۤܿ֡ r5 = new l.ۤܿ֡     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r5.<init>()     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.m24564(r5)     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4.m13685()     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            l.֫ܳ֡ r4 = r7.f29208     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            int r2 = r4.mo6203(r2)     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            r4 = 87
            if (r2 == r4) goto Lb7
            r4 = 7
            if (r2 != r4) goto L81
            goto Lb7
        L81:
            if (r2 == r3) goto Lc0
            r3 = 116(0x74, float:1.63E-43)
            if (r2 == r3) goto Lc0
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto Lc0
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 != r3) goto L90
            goto Lc0
        L90:
            boolean r3 = r7.m9961()     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            if (r3 != 0) goto L97
            goto Lb7
        L97:
            r3 = 26
            if (r2 == r3) goto Lb7
            r3 = 27
            if (r2 == r3) goto Lb7
            r3 = 64
            if (r2 == r3) goto Lb7
            r3 = 65
            if (r2 == r3) goto Lb7
            r3 = 103(0x67, float:1.44E-43)
            if (r2 == r3) goto Lb7
            switch(r2) {
                case 107: goto Lb7;
                case 108: goto Lb7;
                case 109: goto Lb7;
                case 110: goto Lb7;
                case 111: goto Lb7;
                case 112: goto Lb7;
                case 113: goto Lb7;
                case 114: goto Lb7;
                default: goto Lae;
            }     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
        Lae:
            switch(r2) {
                case 127: goto Lb7;
                case 128: goto Lb7;
                case 129: goto Lb7;
                case 130: goto Lb7;
                case 131: goto Lb7;
                case 132: goto Lb7;
                default: goto Lb1;
            }     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
        Lb1:
            boolean r2 = r7.m9950(r2)     // Catch: java.lang.Throwable -> Lb9 l.C9826 -> Lc0
            if (r2 != 0) goto Lc0
        Lb7:
            r1 = 1
            goto Lc0
        Lb9:
            r1 = move-exception
            l.֫ܳ֡ r2 = r7.f29208
            r2.mo6201(r0)
            throw r1
        Lc0:
            l.֫ܳ֡ r2 = r7.f29208
            r2.mo6201(r0)
            java.util.HashMap r2 = r7.f10220
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2.put(r0, r3)
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC3254.m9953():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[RETURN] */
    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m9957() {
        /*
            r5 = this;
            l.֫ܳ֡ r0 = r5.f29208
            r1 = 1
            int r0 = r0.mo6203(r1)
            r2 = 3
            r3 = 2
            switch(r0) {
                case 5: goto L6a;
                case 6: goto L6a;
                case 7: goto L6a;
                case 8: goto L67;
                case 11: goto L5f;
                case 12: goto L59;
                case 13: goto L67;
                case 16: goto L6a;
                case 17: goto L56;
                case 19: goto L53;
                case 22: goto L56;
                case 23: goto L4b;
                case 24: goto L48;
                case 28: goto L6a;
                case 29: goto L67;
                case 30: goto L6a;
                case 31: goto L45;
                case 32: goto L6a;
                case 33: goto L67;
                case 34: goto L42;
                case 35: goto L6a;
                case 36: goto L5e;
                case 37: goto L6a;
                case 38: goto L56;
                case 41: goto L1b;
                case 84: goto L6a;
                case 85: goto L6a;
                case 86: goto L6a;
                case 87: goto L6a;
                case 89: goto L6a;
                case 91: goto L1a;
                case 100: goto L6a;
                case 101: goto L6a;
                case 125: goto L6a;
                case 126: goto L6a;
                case 133: goto L6a;
                case 134: goto L6a;
                case 138: goto L6a;
                case 139: goto L6a;
                case 140: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L6d
        Ld:
            l.֫ܳ֡ r0 = r5.f29208
            int r0 = r0.mo6203(r3)
            r1 = 95
            if (r0 != r1) goto L6a
            r0 = 70
            return r0
        L1a:
            return r3
        L1b:
            l.֫ܳ֡ r0 = r5.f29208
            int r0 = r0.mo6203(r3)
            r4 = 140(0x8c, float:1.96E-43)
            if (r0 != r4) goto L6d
            l.֫ܳ֡ r0 = r5.f29208
            int r0 = r0.mo6203(r2)
            r4 = 135(0x87, float:1.89E-43)
            if (r0 != r4) goto L6d
            l.֫ܳ֡ r0 = r5.f29208
            l.֡ܳ֡ r0 = r0.mo6211(r1)
            l.֫ܳ֡ r1 = r5.f29208
            l.֡ܳ֡ r1 = r1.mo6211(r3)
            boolean r0 = r5.m9949(r0, r1)
            if (r0 == 0) goto L6d
            goto L5e
        L42:
            r0 = 25
            return r0
        L45:
            r0 = 23
            return r0
        L48:
            r0 = 21
            return r0
        L4b:
            boolean r0 = r5.f10223
            if (r0 == 0) goto L50
            goto L6d
        L50:
            r0 = 13
            return r0
        L53:
            r0 = 33
            return r0
        L56:
            r0 = 22
            return r0
        L59:
            boolean r0 = r5.f10223
            if (r0 == 0) goto L5e
            goto L6d
        L5e:
            return r2
        L5f:
            boolean r0 = r5.f10223
            if (r0 == 0) goto L64
            goto L6d
        L64:
            r0 = 16
            return r0
        L67:
            r0 = 26
            return r0
        L6a:
            r0 = 36
            return r0
        L6d:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC3254.m9957():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0053 A[ADDED_TO_REGION, FALL_THROUGH, REMOVE, RETURN] */
    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9964() {
        /*
            r4 = this;
            l.֫ܳ֡ r0 = r4.f29208
            r1 = 1
            int r0 = r0.mo6203(r1)
            r2 = 125(0x7d, float:1.75E-43)
            r3 = 0
            if (r0 == r2) goto L15
            r2 = 126(0x7e, float:1.77E-43)
            if (r0 == r2) goto L15
            r2 = 127(0x7f, float:1.78E-43)
            if (r0 == r2) goto L15
            return r3
        L15:
            l.֫ܳ֡ r0 = r4.f29208
            r2 = 2
            int r0 = r0.mo6203(r2)
            r2 = 5
            if (r0 == r2) goto L32
            r2 = 6
            if (r0 == r2) goto L32
            r2 = 32
            if (r0 == r2) goto L32
            r2 = 138(0x8a, float:1.93E-43)
            if (r0 == r2) goto L32
            r2 = 140(0x8c, float:1.96E-43)
            if (r0 == r2) goto L32
            switch(r0) {
                case 84: goto L32;
                case 85: goto L32;
                case 86: goto L32;
                default: goto L31;
            }
        L31:
            return r3
        L32:
            l.֫ܳ֡ r0 = r4.f29208
            r2 = 3
            int r0 = r0.mo6203(r2)
            r2 = 88
            if (r0 == r2) goto L53
            r2 = 90
            if (r0 == r2) goto L53
            r2 = 103(0x67, float:1.44E-43)
            if (r0 == r2) goto L53
            r2 = 136(0x88, float:1.9E-43)
            if (r0 == r2) goto L53
            switch(r0) {
                case 92: goto L53;
                case 93: goto L53;
                case 94: goto L53;
                case 95: goto L53;
                default: goto L4c;
            }
        L4c:
            switch(r0) {
                case 107: goto L53;
                case 108: goto L53;
                case 109: goto L53;
                case 110: goto L53;
                case 111: goto L53;
                case 112: goto L53;
                case 113: goto L53;
                case 114: goto L53;
                default: goto L4f;
            }
        L4f:
            switch(r0) {
                case 125: goto L53;
                case 126: goto L53;
                case 127: goto L53;
                case 128: goto L53;
                case 129: goto L53;
                case 130: goto L53;
                case 131: goto L53;
                case 132: goto L53;
                default: goto L52;
            }
        L52:
            return r3
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC3254.m9964():boolean");
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m9959() {
        int mo6203 = this.f29208.mo6203(1);
        if (mo6203 != 7 && mo6203 != 87 && mo6203 != 89) {
            if (mo6203 == 115) {
                return this.f10223 ? 0 : 2;
            }
            if (mo6203 != 133) {
                if (mo6203 != 97 && mo6203 != 98) {
                    return 2;
                }
            } else if (!this.f10223 || !m9961()) {
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m9968(int i) {
        int i2 = 1;
        while (i2 < i) {
            int mo2053 = this.f29208.mo6211(i2).mo2053() + 1;
            i2++;
            if (mo2053 != this.f29208.mo6211(i2).mo2054()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m9971() {
        return this.f29208.mo6203(1) == 45 && m9949(this.f29208.mo6211(1), this.f29208.mo6211(2));
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m9963() {
        int mo6203;
        if (!m9961() || (mo6203 = this.f29208.mo6203(1)) == 93 || mo6203 == 92) {
            return 2;
        }
        return m9950(mo6203) ? 1 : 0;
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m9961() {
        return m9949(this.f29208.mo6211(-1), this.f29208.mo6211(1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m9949(InterfaceC0463 interfaceC0463, InterfaceC0463 interfaceC04632) {
        if (interfaceC0463 != null) {
            for (int mo2052 = interfaceC0463.mo2052() + 1; mo2052 < interfaceC04632.mo2052(); mo2052++) {
                String text = this.f29208.m6213(mo2052).getText();
                for (int i = 0; i < text.length(); i++) {
                    char charAt = text.charAt(i);
                    if (charAt == '\n' || charAt == '\r' || charAt == 8232 || charAt == 8233) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m9962() {
        return this.f29208.mo6203(1) == -1 || this.f29208.mo6203(1) == 92 || !m9961();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9955() {
        return ((this.f29208.mo6203(1) == 45 && this.f29208.mo6203(2) == 23 && m9971()) || this.f29208.mo6203(1) == 91 || this.f29208.mo6203(1) == 23 || this.f29208.mo6203(1) == 11) ? false : true;
    }

    @Override // l.AbstractC9637
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 mo9958() {
        C18757.m43430();
        return super.mo9958();
    }
}
