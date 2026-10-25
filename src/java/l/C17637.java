package l;

import com.alipay.sdk.m.t0.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import java.util.Stack;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: 01T6 */
/* renamed from: l.ܿ᩹ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17637 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f53882;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f53883;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53884;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f53885;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f53888;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean[] f53891;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f53892;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f53893;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C2115 f53894;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f53895;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f53896;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 f53897;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2115 f53898;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f53900;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2115 f53902;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53903;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f53904;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53906;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f53907;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public byte f53908;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f53909;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public byte f53910;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f53913;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f53914;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f53915;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f53916;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53917;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f53918;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Stack f53919 = new Stack();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f53886 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f53911 = new int[16];

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f53905 = new StringBuilder();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18343 f53887 = new C18343();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18343 f53889 = new C18343();

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f53899 = true;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f53901 = 0;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f53912 = new byte[4];

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f53890 = -1;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16931 f53920 = new C16931();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m41230(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 25) {
            return 16;
        }
        if (i == 66) {
            return 32;
        }
        if (i == 69) {
            return 2048;
        }
        if (i == 1000) {
            return 64;
        }
        if (i == 1002) {
            return 128;
        }
        if (i == 1004) {
            return 256;
        }
        if (i == 1006) {
            return 512;
        }
        if (i == 2004) {
            return 1024;
        }
        if (i == 5) {
            return 2;
        }
        if (i != 6) {
            return i != 7 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m41246(int i) {
        return (i & this.f53896) != 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41236(int i, boolean z) {
        if (z) {
            if (i == 64) {
                m41236(128, false);
            } else if (i == 128) {
                m41236(64, false);
            }
        }
        if (z) {
            this.f53896 = i | this.f53896;
        } else {
            this.f53896 = (~i) & this.f53896;
        }
    }

    public C17637(C17574 c17574, int i, int i2) {
        this.f53897 = c17574;
        C2115 c2115 = new C2115(i, 2000, i2);
        this.f53894 = c2115;
        this.f53902 = c2115;
        this.f53898 = new C2115(i, i2, i2);
        this.f53918 = i2;
        this.f53892 = i;
        this.f53891 = new boolean[i];
        m41259();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2115 m41261() {
        return this.f53902;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m41264() {
        return this.f53902 == this.f53898;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41250(int i, int i2) {
        int i3 = this.f53918;
        if (i3 == i2 && this.f53892 == i) {
            return;
        }
        if (i < 2 || i2 < 2) {
            throw new IllegalArgumentException(C18307.m42646("rows=", i2, i, ", columns="));
        }
        if (i3 != i2) {
            this.f53918 = i2;
            this.f53903 = 0;
            this.f53904 = i2;
        }
        int i4 = this.f53892;
        if (i4 != i) {
            this.f53892 = i;
            boolean[] zArr = this.f53891;
            this.f53891 = new boolean[i];
            int i5 = 0;
            while (i5 < this.f53892) {
                this.f53891[i5] = (i5 & 7) == 0 && i5 != 0;
                i5++;
            }
            System.arraycopy(zArr, 0, this.f53891, 0, Math.min(i4, i));
            this.f53883 = 0;
            this.f53917 = this.f53892;
        }
        m41243();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m41243() {
        int[] iArr = {this.f53895, this.f53906};
        C2115 c2115 = this.f53902;
        c2115.m7007(this.f53892, this.f53918, c2115 == this.f53898 ? this.f53918 : this.f53894.f7064, iArr, m41228(), m41264());
        this.f53895 = iArr[0];
        this.f53906 = iArr[1];
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m41260() {
        return this.f53906;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41257() {
        return this.f53895;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m41262() {
        return this.f53886;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m41256() {
        return m41246(2);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m41255() {
        return m41246(16);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m41263() {
        return m41246(32);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m41254() {
        return m41246(1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41252(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            m41226(bArr[i2]);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41226(byte b) {
        byte b2;
        byte b3 = this.f53910;
        byte[] bArr = this.f53912;
        int i = 65533;
        if (b3 <= 0) {
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                m41249((int) b);
                return;
            }
            if ((b & bo.k) == 192) {
                this.f53910 = (byte) 1;
            } else if ((b & 240) == 224) {
                this.f53910 = (byte) 2;
            } else if ((b & 248) == 240) {
                this.f53910 = (byte) 3;
            } else {
                m41249(65533);
                return;
            }
            byte b4 = this.f53908;
            this.f53908 = (byte) (b4 + 1);
            bArr[b4] = b;
            return;
        }
        if ((b & 192) == 128) {
            byte b5 = this.f53908;
            byte b6 = (byte) (b5 + 1);
            this.f53908 = b6;
            bArr[b5] = b;
            byte b7 = (byte) (b3 - 1);
            this.f53910 = b7;
            if (b7 == 0) {
                int i2 = ((byte) (b6 == 2 ? 31 : b6 == 3 ? 15 : 7)) & bArr[0];
                int i3 = 1;
                while (true) {
                    b2 = this.f53908;
                    if (i3 >= b2) {
                        break;
                    }
                    i2 = (i2 << 6) | (bArr[i3] & 63);
                    i3++;
                }
                if ((i2 <= 127 && b2 > 1) || ((i2 < 2047 && b2 > 2) || (i2 < 65535 && b2 > 3))) {
                    i2 = 65533;
                }
                this.f53910 = (byte) 0;
                this.f53908 = (byte) 0;
                if (i2 < 128 || i2 > 159) {
                    int type = Character.getType(i2);
                    if (type != 0 && type != 19) {
                        i = i2;
                    }
                    m41249(i);
                    return;
                }
                return;
            }
            return;
        }
        this.f53910 = (byte) 0;
        this.f53908 = (byte) 0;
        m41238(65533);
        m41226(b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012a, code lost:
    
        if (r26 != 117) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015d, code lost:
    
        if (m41246(r2) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0169, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
    
        if (r25.f53902 == r25.f53898) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04fa  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v45, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m41249(int r26) {
        /*
            Method dump skipped, instructions count: 2228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17637.m41249(int):void");
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m41245(int i) {
        int i2 = this.f53895;
        while (true) {
            i2++;
            if (i2 < this.f53892) {
                if (this.f53891[i2] && i - 1 == 0) {
                    return Math.min(i2, this.f53917);
                }
            } else {
                return this.f53917 - 1;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41251(int i, boolean z) {
        int m41230 = m41230(i);
        if (m41230 != -1) {
            m41236(m41230, z);
        }
        switch (i) {
            case 1:
            case 12:
            case 25:
            case 40:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
            case 66:
            case 1015:
            case 1034:
            case 2004:
                return;
            case 47:
                break;
            case 69:
                if (z) {
                    return;
                }
                this.f53883 = 0;
                this.f53917 = this.f53892;
                return;
            default:
                switch (i) {
                    case 3:
                        this.f53903 = 0;
                        this.f53883 = 0;
                        this.f53904 = this.f53918;
                        this.f53917 = this.f53892;
                        m41236(2048, false);
                        m41235(0, 0, this.f53892, this.f53918);
                        m41240(0, 0);
                        return;
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                        return;
                    case 6:
                        if (z) {
                            m41234(0, 0);
                            return;
                        }
                        return;
                    default:
                        switch (i) {
                            case 1000:
                            case 1001:
                            case b.c /* 1002 */:
                            case b.d /* 1003 */:
                            case 1004:
                            case 1005:
                            case 1006:
                                return;
                            default:
                                switch (i) {
                                    case 1047:
                                    case 1049:
                                        break;
                                    case 1048:
                                        if (z) {
                                            m41224();
                                            break;
                                        } else {
                                            m41244();
                                            break;
                                        }
                                    default:
                                        this.f53913 = 0;
                                        break;
                                }
                                return;
                        }
                }
        }
        C2115 c2115 = this.f53898;
        C2115 c21152 = z ? c2115 : this.f53894;
        if (c21152 != this.f53902) {
            boolean z2 = (c21152.f7063 == this.f53892 && c21152.f7066 == this.f53918) ? false : true;
            if (z) {
                m41224();
            }
            this.f53902 = c21152;
            if (!z) {
                C18343 c18343 = this.f53887;
                int i2 = c18343.f57003;
                int i3 = c18343.f57005;
                m41244();
                if (z2) {
                    this.f53895 = i2;
                    this.f53906 = i3;
                }
            }
            if (z2) {
                m41243();
            }
            if (c21152 == c2115) {
                c21152.m7005(0, 0, this.f53892, this.f53918, 32, m41228());
            }
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m41227() {
        int i = this.f53906;
        int i2 = this.f53904;
        int i3 = i + 1;
        if (i >= i2) {
            if (i != this.f53918 - 1) {
                this.f53906 = i3;
                this.f53884 = false;
                return;
            }
            return;
        }
        if (i3 == i2) {
            m41229();
            i3 = this.f53904 - 1;
        }
        this.f53906 = i3;
        this.f53884 = false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m41239(int i) {
        this.f53913 = i;
        this.f53916 = true;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m41224() {
        C18343 c18343 = this.f53902 == this.f53894 ? this.f53887 : this.f53889;
        c18343.f57005 = this.f53906;
        c18343.f57003 = this.f53895;
        c18343.f57006 = this.f53888;
        c18343.f57004 = this.f53914;
        c18343.f57001 = this.f53909;
        c18343.f57007 = this.f53896;
        c18343.f57009 = this.f53893;
        c18343.f57002 = this.f53885;
        c18343.f57008 = this.f53899;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m41244() {
        C18343 c18343 = this.f53902 == this.f53894 ? this.f53887 : this.f53889;
        m41240(c18343.f57005, c18343.f57003);
        this.f53888 = c18343.f57006;
        this.f53914 = c18343.f57004;
        this.f53909 = c18343.f57001;
        this.f53896 = (this.f53896 & (-13)) | (c18343.f57007 & 12);
        this.f53893 = c18343.f57009;
        this.f53885 = c18343.f57002;
        this.f53899 = c18343.f57008;
    }

    /* JADX WARN: Removed duplicated region for block: B:333:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0223  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m41242(int r15) {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17637.m41242(int):void");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m41241(int i) {
        if (i == 7) {
            m41237("\u0007");
        } else if (i == 27) {
            m41239(11);
        } else {
            m41233(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r18.f53913 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m41237(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17637.m41237(java.lang.String):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41235(int i, int i2, int i3, int i4) {
        this.f53902.m7005(i, i2, i3, i4, 32, m41228());
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private long m41228() {
        return C23924.m52688(this.f53914, this.f53909, this.f53888);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41234(int i, int i2) {
        boolean m41246 = m41246(4);
        int i3 = m41246 ? this.f53903 : 0;
        int i4 = m41246 ? this.f53904 : this.f53918;
        int i5 = m41246 ? this.f53883 : 0;
        m41240(Math.max(i3, Math.min(i2 + i3, i4 - 1)), Math.max(i5, Math.min(i + i5, (m41246 ? this.f53917 : this.f53892) - 1)));
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m41229() {
        this.f53901++;
        int i = this.f53883;
        if (i != 0 || this.f53917 != this.f53892) {
            C2115 c2115 = this.f53902;
            int i2 = this.f53903;
            c2115.m7004(i, i2 + 1, this.f53917 - i, (this.f53904 - i2) - 1, i, i2);
            C2115 c21152 = this.f53902;
            int i3 = this.f53883;
            c21152.m7005(i3, this.f53904 - 1, this.f53917 - i3, 1, 32, this.f53888);
            return;
        }
        this.f53902.m7008(this.f53903, this.f53904, m41228());
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m41232(int i) {
        int[] iArr = this.f53911;
        if (i < 48 || i > 57) {
            if (i == 59) {
                int i2 = this.f53907;
                if (i2 < iArr.length) {
                    this.f53907 = i2 + 1;
                }
                m41239(this.f53913);
                return;
            }
            this.f53913 = 0;
            return;
        }
        int i3 = this.f53907;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            int i5 = i - 48;
            if (i4 >= 0) {
                i5 += i4 * 10;
            }
            iArr[i3] = i5;
        }
        m41239(this.f53913);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41225(int i, int i2, boolean z) {
        int i3 = this.f53911[i];
        return (i3 < 0 || (i3 == 0 && z)) ? i2 : i3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41233(int i) {
        StringBuilder sb = this.f53905;
        if (sb.length() < 8192) {
            sb.appendCodePoint(i);
            m41239(this.f53913);
        } else {
            this.f53913 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e4  */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m41238(int r19) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17637.m41238(int):void");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m41231(int i) {
        this.f53895 = i;
        this.f53884 = false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m41240(int i, int i2) {
        this.f53906 = Math.max(0, Math.min(i, this.f53918 - 1));
        this.f53895 = Math.max(0, Math.min(i2, this.f53892 - 1));
        this.f53884 = false;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m41258() {
        return this.f53901;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41248() {
        this.f53901 = 0;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m41259() {
        this.f53886 = 0;
        this.f53907 = 0;
        this.f53916 = false;
        this.f53913 = 0;
        this.f53882 = false;
        this.f53883 = 0;
        this.f53903 = 0;
        this.f53904 = this.f53918;
        this.f53917 = this.f53892;
        this.f53884 = false;
        C18343 c18343 = this.f53889;
        c18343.f57004 = 256;
        C18343 c183432 = this.f53887;
        c183432.f57004 = 256;
        this.f53914 = 256;
        c18343.f57001 = 257;
        c183432.f57001 = 257;
        this.f53909 = 257;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < this.f53892) {
                boolean[] zArr = this.f53891;
                if ((i & 7) != 0 || i == 0) {
                    z = false;
                }
                zArr[i] = z;
                i++;
            } else {
                this.f53885 = false;
                this.f53893 = false;
                this.f53899 = true;
                c183432.f57007 = 0;
                c183432.f57006 = 0;
                c183432.f57003 = 0;
                c183432.f57005 = 0;
                c18343.f57007 = 0;
                c18343.f57006 = 0;
                c18343.f57003 = 0;
                c18343.f57005 = 0;
                this.f53896 = 0;
                m41236(8, true);
                m41236(16, true);
                int i2 = this.f53896;
                c18343.f57007 = i2;
                c183432.f57007 = i2;
                this.f53915 = i2;
                this.f53910 = (byte) 0;
                this.f53908 = (byte) 0;
                this.f53920.m39774();
                this.f53897.mo8721();
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41247(int i, int i2, int i3, int i4) {
        return this.f53902.m7002(i, i2, i3, i4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41253(String str) {
        String replaceAll = str.replaceAll("(\u001b|[\u0080-\u009f])", "").replaceAll("\r?\n", "\r");
        if (replaceAll.isEmpty()) {
            return;
        }
        boolean m41246 = m41246(1024);
        AbstractC2821 abstractC2821 = this.f53897;
        if (m41246) {
            abstractC2821.m8717("\u001b[200~");
        }
        abstractC2821.m8717(replaceAll);
        if (m41246) {
            abstractC2821.m8717("\u001b[201~");
        }
    }
}
