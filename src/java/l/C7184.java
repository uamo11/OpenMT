package l;

import com.alipay.sdk.m.y.l;
import java.io.Reader;
import java.util.Map;
import org.simpleframework.xml.stream.DocumentReader;

/* compiled from: E5LS */
/* renamed from: l.۟ۖܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7184 {

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Map f21982 = AbstractC9608.m24536();

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f21984;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f21986;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f21988;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21989;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f21991;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Boolean f21992;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f21993;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f21994;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f21995;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f21996;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f21997;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f21998;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f22001;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f22002;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f22003;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f22005;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f22006;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f22007;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f22009;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f22010;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Reader f22011;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f22012;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f22013;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String[] f22014 = new String[16];

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String[] f21983 = new String[8];

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int[] f22008 = new int[4];

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public char[] f21999 = new char[128];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f22004 = new String[16];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16396[] f21985 = new C16396[8];

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f21990 = new int[2];

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19720 f22000 = new C19720();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C16396 f21987 = new C16396();

    public C7184() {
        this.f22012 = new char[Runtime.getRuntime().freeMemory() >= 1048576 ? 8192 : 128];
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m19211(String str) {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C1580(str, this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19205(String str, C16396 c16396) {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C1580(str, c16396);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private int m19207() {
        int m19209 = m19209(0);
        if (m19209 == -1) {
            int i = this.f22001;
            if (i == 0) {
                return 1;
            }
            m19211(C9045.m23341(new StringBuilder("expected: </"), this.f22014[((i - 1) << 2) + 3], ">"));
            throw null;
        }
        if (m19209 == 38) {
            return 6;
        }
        if (m19209 != 60) {
            return 4;
        }
        int m192092 = m19209(1);
        if (m192092 == 33) {
            return EnumC3478.f11008;
        }
        if (m192092 == 47) {
            return 3;
        }
        if (m192092 != 63) {
            return 2;
        }
        return EnumC3478.f11008;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private String m19215(int i) {
        int i2;
        char c;
        char[] cArr = this.f21999;
        int i3 = this.f21996 - i;
        if (i3 > 16) {
            return new String(cArr, i, i3);
        }
        if (i3 == 0) {
            return "";
        }
        if (i3 == 1) {
            i2 = i3 * 31;
            c = cArr[i];
        } else {
            i2 = ((i3 * 31) + cArr[i]) * 31;
            c = cArr[i + 1];
        }
        int i4 = i2 + c;
        C19720 c19720 = this.f22000;
        String str = (String) c19720.get(i4);
        if (str != null && str.length() == i3) {
            for (int i5 = 0; i5 < i3; i5++) {
                if (cArr[i5 + i] == str.charAt(i5)) {
                }
            }
            return str;
        }
        String str2 = new String(cArr, i, i3);
        c19720.mo2318(i4, str2);
        return str2;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m19214(int i) {
        this.f22010 &= i <= 32;
        int i2 = this.f21996;
        char[] cArr = this.f21999;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[C23868.m52580(i2, 4, 3, 4)];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.f21999 = cArr2;
        }
        char[] cArr3 = this.f21999;
        int i3 = this.f21996;
        this.f21996 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16396 m19222() {
        return this.f21987;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x014f, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0152, code lost:
    
        if (r2 >= r14.f21997) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0154, code lost:
    
        r3 = r2 << 2;
        r7 = r2 << 1;
        r10 = r3 + 2;
        r9 = r14.f22004[r10];
        r11 = r9.indexOf(58);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0162, code lost:
    
        if (r11 == 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0164, code lost:
    
        if (r11 == (-1)) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0166, code lost:
    
        r12 = r9.substring(0, r11);
        r9 = r9.substring(r11 + 1);
        r13 = m19218(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0174, code lost:
    
        if (r13 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0176, code lost:
    
        r7 = r14.f22004;
        r7[r3] = r13;
        r7[r3 + 1] = r12;
        r7[r10] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ab, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0181, code lost:
    
        r15 = r14.f21985[r7].m38636clone();
        r15.m38631(r15.m38625() + r11);
        r15.m38633(r15.m38632() + r11);
        m19205("Undefined Prefix: " + r12, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ae, code lost:
    
        m19205("illegal attribute name: ".concat(r9), r14.f21985[r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01bb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01bc, code lost:
    
        r2 = r14.f21988.indexOf(58);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c2, code lost:
    
        if (r2 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c4, code lost:
    
        if (r2 == (-1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c6, code lost:
    
        r14.f22002 = r14.f21988.substring(0, r2);
        r14.f21988 = r14.f21988.substring(r2 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d8, code lost:
    
        r1 = m19218(r14.f22002);
        r14.f22007 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e0, code lost:
    
        if (r1 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e4, code lost:
    
        if (r14.f22002 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e6, code lost:
    
        r14.f22007 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01e9, code lost:
    
        r15 = r0.m38636clone();
        r15.m38631(r15.m38625() + r2);
        r15.m38633(r15.m38632() + r2);
        m19205("undefined prefix: " + r14.f22002, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0210, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0211, code lost:
    
        r0 = r14.f22014;
        r0[r15] = r14.f22007;
        r0[r15 + 1] = r14.f22002;
        r0[r15 + 2] = r14.f21988;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0223, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0224, code lost:
    
        m19205("illegal tag name: " + r14.f21988, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0237, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x009d, code lost:
    
        r15 = r14.f22001;
        r14.f22001 = r15 + 1;
        r15 = r15 << 2;
        r2 = r14.f22014;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00aa, code lost:
    
        if (r2.length < (r15 + 4)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ad, code lost:
    
        r3 = new java.lang.String[r15 + 20];
        java.lang.System.arraycopy(r2, 0, r3, 0, r2.length);
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b6, code lost:
    
        r14.f22014 = r2;
        r2[r15 + 3] = r14.f21988;
        r2 = r14.f22001;
        r3 = r14.f22008;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c3, code lost:
    
        if (r2 < r3.length) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c5, code lost:
    
        r2 = new int[r2 + 4];
        java.lang.System.arraycopy(r3, 0, r2, 0, r3.length);
        r14.f22008 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cf, code lost:
    
        r2 = r14.f22008;
        r3 = r14.f22001;
        r2[r3] = r2[r3 - 1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00de, code lost:
    
        if (r2 >= r14.f21997) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e0, code lost:
    
        r3 = r2 << 2;
        r7 = r2 << 1;
        r9 = r14.f22004[r3 + 2];
        r4 = r9.indexOf(58);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f0, code lost:
    
        if (r4 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f2, code lost:
    
        r11 = r9.substring(0, r4);
        r4 = r9.substring(r4 + 1);
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0109, code lost:
    
        if (r9.equals("xmlns") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010c, code lost:
    
        r9 = r14.f22008;
        r10 = r14.f22001;
        r11 = r9[r10];
        r9[r10] = r11 + 1;
        r9 = r11 << 1;
        r10 = r14.f21983;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011d, code lost:
    
        if (r10.length < (r9 + 2)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0120, code lost:
    
        r11 = new java.lang.String[r9 + 18];
        java.lang.System.arraycopy(r10, 0, r11, 0, r10.length);
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0129, code lost:
    
        r14.f21983 = r10;
        r10[r9] = r4;
        r11 = r14.f22004;
        r3 = r3 + 3;
        r10[r9 + 1] = r11[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0137, code lost:
    
        if (r4 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013f, code lost:
    
        if (r11[r3].equals("") != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0142, code lost:
    
        m19205("illegal empty namespace", r14.f21985[r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x014b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0102, code lost:
    
        if (r9.equals("xmlns") == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0104, code lost:
    
        r4 = null;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m19206(boolean r15) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7184.m19206(boolean):void");
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m19212() {
        m19214(m19213());
        int i = this.f21996;
        while (true) {
            int m19213 = m19213();
            if (m19213 == 59) {
                String m19215 = m19215(i);
                this.f21996 = i - 1;
                if (m19215.charAt(0) == '#') {
                    m19214(m19215.charAt(1) == 'x' ? Integer.parseInt(m19215.substring(2), 16) : Integer.parseInt(m19215.substring(1)));
                    return;
                }
                String str = (String) f21982.get(m19215);
                boolean z = str == null;
                this.f21998 = z;
                if (z) {
                    m19211(C4860.m14172("unresolved: &", m19215, l.b));
                    throw null;
                }
                for (int i2 = 0; i2 < str.length(); i2++) {
                    m19214(str.charAt(i2));
                }
                return;
            }
            if (m19213 < 128 && ((m19213 < 48 || m19213 > 57) && ((m19213 < 97 || m19213 > 122) && ((m19213 < 65 || m19213 > 90) && m19213 != 95 && m19213 != 45 && m19213 != 35)))) {
                m19211("unterminated entity ref");
                throw null;
            }
            m19214(m19213);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19204(int i, boolean z) {
        int m19209 = m19209(0);
        int i2 = 0;
        while (m19209 != -1 && m19209 != i) {
            if (i == 32 && (m19209 <= 32 || m19209 == 62)) {
                return;
            }
            if (m19209 != 38) {
                m19214(m19213());
            } else if (!z) {
                return;
            } else {
                m19212();
            }
            if (m19209 == 62 && i2 >= 2 && i != 93) {
                m19211("Illegal: ]]>");
                throw null;
            }
            i2 = m19209 == 93 ? i2 + 1 : 0;
            m19209 = m19209(0);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19203(char c) {
        int m19213 = m19213();
        if (m19213 == c) {
            return;
        }
        m19211("expected: '" + c + "' actual: '" + ((char) m19213) + "'");
        throw null;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private int m19213() {
        int i;
        if (this.f21984 == 0) {
            i = m19209(0);
        } else {
            int[] iArr = this.f21990;
            int i2 = iArr[0];
            iArr[0] = iArr[1];
            i = i2;
        }
        this.f21984--;
        this.f22006++;
        this.f21993++;
        if (i == 10) {
            this.f21986++;
            this.f22006 = 1;
        }
        return i;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m19209(int i) {
        int i2;
        while (true) {
            int i3 = this.f21984;
            int[] iArr = this.f21990;
            if (i >= i3) {
                char[] cArr = this.f22012;
                if (cArr.length <= 1) {
                    i2 = this.f22011.read();
                } else {
                    int i4 = this.f21989;
                    if (i4 < this.f22009) {
                        this.f21989 = i4 + 1;
                        i2 = cArr[i4];
                    } else {
                        int read = this.f22011.read(cArr, 0, cArr.length);
                        this.f22009 = read;
                        int i5 = read <= 0 ? -1 : cArr[0];
                        this.f21989 = 1;
                        i2 = i5;
                    }
                }
                if (i2 == 13) {
                    this.f22013 = true;
                    int i6 = this.f21984;
                    this.f21984 = i6 + 1;
                    iArr[i6] = 10;
                } else {
                    if (i2 == 10) {
                        if (!this.f22013) {
                            int i7 = this.f21984;
                            this.f21984 = i7 + 1;
                            iArr[i7] = 10;
                        }
                    } else {
                        int i8 = this.f21984;
                        this.f21984 = i8 + 1;
                        iArr[i8] = i2;
                    }
                    this.f22013 = false;
                }
            } else {
                return iArr[i];
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m19210(String str) {
        if (str.isEmpty()) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && !((charAt >= 'A' && charAt <= 'Z') || charAt == '$' || charAt == '_' || charAt == ':' || charAt >= 183)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private String m19202() {
        int i = this.f21996;
        int m19209 = m19209(0);
        if ((m19209 < 97 || m19209 > 122) && !((m19209 >= 65 && m19209 <= 90) || m19209 == 36 || m19209 == 95 || m19209 == 58 || m19209 >= 192)) {
            m19211("name expected");
            throw null;
        }
        while (true) {
            m19214(m19213());
            int m192092 = m19209(0);
            if (m192092 < 97 || m192092 > 122) {
                if (m192092 < 65 || m192092 > 90) {
                    if (m192092 < 48 || m192092 > 57) {
                        if (m192092 != 36 && m192092 != 95 && m192092 != 45 && m192092 != 58 && m192092 != 46 && m192092 < 183) {
                            String m19215 = m19215(i);
                            this.f21996 = i;
                            return m19215;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m19208() {
        while (true) {
            int m19209 = m19209(0);
            if (m19209 > 32 || m19209 == -1) {
                return;
            } else {
                m19213();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19219(Reader reader) {
        this.f22011 = reader;
        this.f21986 = 1;
        this.f22006 = 0;
        this.f21993 = 0;
        this.f21991 = 0;
        this.f21988 = null;
        this.f22007 = null;
        this.f22005 = false;
        this.f21997 = -1;
        this.f21989 = 0;
        this.f22009 = 0;
        this.f21984 = 0;
        this.f22001 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19218(String str) {
        if (DocumentReader.RESERVED.equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        int i = this.f22008[this.f22001] << 1;
        while (true) {
            i -= 2;
            if (i < 0) {
                return null;
            }
            if (str == null) {
                String[] strArr = this.f21983;
                if (strArr[i] == null) {
                    return strArr[i + 1];
                }
            } else if (str.equals(this.f21983[i])) {
                return this.f21983[i + 1];
            }
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m19235() {
        return this.f21994;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m19221() {
        return this.f21995;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m19223() {
        return this.f22003;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m19229() {
        return this.f21986;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m19224() {
        return this.f22006;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m19233() {
        return this.f21993;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m19228() {
        int i = this.f21991;
        if (i < 4) {
            return null;
        }
        if (i == 6 && this.f21998) {
            return null;
        }
        return m19215(0);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m19236() {
        return this.f22007;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m19226() {
        return this.f21988;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m19216() {
        return this.f21997;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m19230(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f22004[i << 2];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19217(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f22004[(i << 2) + 2];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16396 m19225(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f21985[i << 1];
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m19234(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f22004[(i << 2) + 1];
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m19232(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f22004[(i << 2) + 3];
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16396 m19227(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f21985[(i << 1) + 1];
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m19231() {
        return this.f21991;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x011e, code lost:
    
        m19211("version expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0123, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0124, code lost:
    
        m19211("PI must not start with xml");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0129, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0281, code lost:
    
        r4 = r18.f21991;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0283, code lost:
    
        if (r4 >= r3) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0285, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0287, code lost:
    
        if (r3 > 6) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x028a, code lost:
    
        if (r3 < 4) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0290, code lost:
    
        if (m19207() >= 4) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0292, code lost:
    
        r18.f21991 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0294, code lost:
    
        if (r3 <= 4) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0296, code lost:
    
        r18.f21991 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x029a, code lost:
    
        return r18.f21991;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0163 A[LOOP:2: B:28:0x015d->B:30:0x0163, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01db A[LOOP:1: B:8:0x0025->B:48:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0281 A[EDGE_INSN: B:49:0x0281->B:50:0x0281 BREAK  A[LOOP:1: B:8:0x0025->B:48:0x01db], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m19220() {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7184.m19220():int");
    }
}
