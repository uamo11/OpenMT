package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: HAFC */
/* renamed from: l.۟ۢۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7381 {

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f22653;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22198 f22654;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public InterfaceC23526 f22656;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1031 f22658;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f22659;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20705 f22660;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C16261 f22661;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C8087 f22662;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public byte[] f22664;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC23526 f22665;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f22673;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public byte[] f22678;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f22681;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public Runnable f22682;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public RunnableC11615 f22684;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f22685;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f22687;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public Socket f22692;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public String f22694;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f22695;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C20413 f22696;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public byte[] f22698;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f22701;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C19708 f22702;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f22703;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f22705;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f22708;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC1031 f22709;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20705 f22715;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18650 f22720;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f22721;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C7381 f22722;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f22713 = "SSH-2.0-JSCH_2.27.6".getBytes(StandardCharsets.UTF_8);

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f22716 = 0;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f22718 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String[] f22671 = null;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f22704 = false;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f22711 = false;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f22691 = true;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f22663 = true;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f22686 = true;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22667 = false;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f22689 = true;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f22710 = false;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f22706 = false;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Thread f22697 = null;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public Object f22714 = new Object();

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f22676 = false;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f22679 = false;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Hashtable f22677 = null;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f22712 = 1;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public volatile String[] f22668 = null;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f22690 = false;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public volatile long f22674 = 0;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f22680 = 6;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f22699 = 0;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public byte[] f22666 = null;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public ThreadFactoryC5970 f22672 = new ThreadFactoryC5970();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f22717 = false;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f22655 = new ArrayList();

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f22669 = new ReentrantReadWriteLock();

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22693 = false;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f22675 = false;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public volatile String[] f22700 = null;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int[] f22688 = new int[1];

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f22657 = new int[1];

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f22670 = 8;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f22707 = 8;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13730 f22683 = new C13730();

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C4185 f22719 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19860(C7381 c7381) {
        this.f22722 = c7381;
    }

    public C7381(C20413 c20413, String str, String str2, int i) {
        String str3 = null;
        this.f22687 = "127.0.0.1";
        this.f22708 = 22;
        this.f22694 = null;
        this.f22696 = c20413;
        C16261 c16261 = new C16261();
        this.f22661 = c16261;
        this.f22662 = new C8087(c16261);
        this.f22694 = str;
        this.f22687 = str2;
        this.f22708 = i;
        if (str == null) {
            try {
                str3 = System.getProperty("user.name");
            } catch (SecurityException unused) {
            }
            this.f22694 = str3;
        }
        if (this.f22694 == null) {
            throw new C12651("username is not given.");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19858(Runnable runnable) {
        this.f22682 = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0266, code lost:
    
        m19877().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0282, code lost:
    
        if (m19856("userauth." + r8) == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0284, code lost:
    
        r8 = (l.AbstractC9478) java.lang.Class.forName(m19856("userauth." + r8)).asSubclass(l.AbstractC9478.class).getDeclaredConstructor(null).newInstance(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02fd, code lost:
    
        if (r14.f22699 < r14.f22680) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ff, code lost:
    
        m19877().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0306, code lost:
    
        r5 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x030d, code lost:
    
        if (r9 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x030f, code lost:
    
        r7 = "Auth cancel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0314, code lost:
    
        r5.append(r7);
        r5.append(" for methods '");
        r5.append(r6);
        r5.append("'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x032b, code lost:
    
        throw new l.C12651(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0312, code lost:
    
        r7 = "Auth fail";
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ae, code lost:
    
        m19877().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03c3, code lost:
    
        r14.f22693 = false;
        r14.f22675 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03c7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0330 A[Catch: all -> 0x042f, Exception -> 0x0431, TryCatch #9 {Exception -> 0x0431, blocks: (B:8:0x0049, B:10:0x0072, B:11:0x0075, B:13:0x00a5, B:15:0x00ac, B:17:0x00b5, B:21:0x00c2, B:23:0x00cc, B:25:0x00d0, B:31:0x00da, B:33:0x00dd, B:36:0x00e3, B:39:0x00e7, B:42:0x00ee, B:48:0x00f5, B:52:0x00fb, B:54:0x0102, B:56:0x0109, B:58:0x0129, B:59:0x012c, B:61:0x0176, B:62:0x0183, B:64:0x0196, B:66:0x01a4, B:69:0x01aa, B:70:0x01c3, B:72:0x01e8, B:74:0x01f8, B:76:0x01fc, B:78:0x0200, B:80:0x0203, B:82:0x020b, B:86:0x022b, B:88:0x023b, B:90:0x0241, B:91:0x0249, B:95:0x0253, B:97:0x0256, B:98:0x025b, B:100:0x025e, B:104:0x0266, B:133:0x02c8, B:132:0x02d2, B:119:0x02d4, B:124:0x02d6, B:163:0x02ae, B:102:0x02f0, B:135:0x02f9, B:137:0x02ff, B:138:0x0306, B:141:0x0314, B:142:0x032b, B:144:0x032c, B:146:0x0330, B:147:0x0333, B:148:0x0337, B:159:0x0379, B:171:0x037b, B:172:0x0384, B:174:0x0386, B:175:0x03a2, B:176:0x03a3, B:177:0x03c1, B:180:0x03c3, B:181:0x03c7, B:184:0x03c8, B:185:0x03e0, B:187:0x03e1, B:188:0x03ff, B:189:0x0400, B:190:0x041e, B:191:0x041f, B:192:0x0426, B:199:0x0427, B:200:0x042e), top: B:7:0x0049, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0338 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19857() {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7381.m19857():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0186, code lost:
    
        r2 = r2 + 1;
        r4 = 0;
        r7 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0184, code lost:
    
        if (r8[r2] == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018d, code lost:
    
        r0 = r7.length;
        r1 = java.nio.charset.StandardCharsets.UTF_8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a1, code lost:
    
        throw new l.C4890(r2, new java.lang.String(r7, 0, r0, r1), new java.lang.String(r5, 0, r5.length, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017b, code lost:
    
        if (r10 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017d, code lost:
    
        r8[r2] = "";
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.AbstractC16553 m19847(l.C16261 r15) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7381.m19847(l.ܺ᩻ۘ):l.ܽۢۘ");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String[] m19866() {
        return this.f22700;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021c  */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m19846() {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7381.m19846():void");
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m19845() {
        C8087 c8087 = this.f22662;
        c8087.m21457();
        this.f22661.m38234((byte) 7);
        this.f22661.m38245(1);
        C16261 c16261 = this.f22661;
        Charset charset = StandardCharsets.UTF_8;
        c16261.m38256(C19356.m44592("ext-info-in-auth@openssh.com", charset));
        this.f22661.m38256(C19356.m44592("0", charset));
        m19872(c8087);
        this.f22696.m46777().getClass();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19841(String str, int i, AbstractC16553 abstractC16553) {
        C19377 c19377;
        int m44639;
        boolean z;
        String m19856 = m19856("StrictHostKeyChecking");
        byte[] bArr = abstractC16553.f50858;
        String m38943 = abstractC16553.m38943();
        InterfaceC2774 interfaceC2774 = null;
        try {
            interfaceC2774 = (InterfaceC2774) Class.forName(abstractC16553.f50859.m19856(abstractC16553.f50859.m19856("FingerprintHash").toLowerCase(Locale.ROOT))).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            abstractC16553.f50859.f22696.m46777().getClass();
        }
        String m44587 = C19356.m44587(interfaceC2774, abstractC16553.f50858);
        String str2 = i != 22 ? "[" + str + "]:" + i : str;
        InterfaceC19002 m46771 = this.f22696.m46771();
        if (m19856("HashKnownHosts").equals("yes") && C12354.m29972(m46771)) {
            C18671 c18671 = new C18671((C19377) m46771, "", str2, 0, bArr, null);
            c18671.m43288();
            this.f22719 = c18671;
        } else {
            this.f22719 = new C4185(str2, 0, bArr);
        }
        synchronized (m46771) {
            c19377 = (C19377) m46771;
            m44639 = c19377.m44639(str2, bArr);
        }
        if ((m19856.equals("ask") || m19856.equals("yes")) && m44639 == 2) {
            synchronized (m46771) {
            }
            if (this.f22720 != null) {
                if (m19856.equals("ask")) {
                    this.f22720.getClass();
                    synchronized (m46771) {
                        c19377.m44642(str2, abstractC16553.m38941());
                    }
                    z = true;
                } else {
                    this.f22720.getClass();
                }
            }
            throw new C13356(C20094.m46315("HostKey has been changed: ", str2));
        }
        z = false;
        if ((m19856.equals("ask") || m19856.equals("yes")) && m44639 != 0 && !z) {
            if (m19856.equals("yes")) {
                throw new C7712(C20094.m46315("reject HostKey: ", str2));
            }
            if (this.f22720 == null) {
                if (m44639 != 1) {
                    throw new C13356(C20094.m46315("HostKey has been changed: ", str2));
                }
                StringBuilder m10501 = C3435.m10501("UnknownHostKey: ", str2, ". ", m38943, " key fingerprint is ");
                m10501.append(m44587);
                throw new C7712(m10501.toString());
            }
            z = true;
        }
        if (m19856.equals("no") && 1 == m44639) {
            z = true;
        }
        if (m44639 == 0) {
            C4185[] m44641 = c19377.m44641(str2, abstractC16553.m38941());
            byte[] m44593 = C19356.m44593(bArr, bArr.length, true);
            String str3 = new String(m44593, 0, m44593.length, StandardCharsets.UTF_8);
            for (int i2 = 0; i2 < m44641.length; i2++) {
                byte[] bArr2 = m44641[i2].f13634;
                byte[] m445932 = C19356.m44593(bArr2, bArr2.length, true);
                if (new String(m445932, 0, m445932.length, StandardCharsets.UTF_8).equals(str3) && m44641[i2].f13635.equals("@revoked")) {
                    this.f22696.m46777().getClass();
                    throw new C11946(C20094.m46315("revoked HostKey: ", str2));
                }
            }
        }
        if (m44639 == 0) {
            this.f22696.m46777().getClass();
        }
        if (z) {
            this.f22696.m46777().getClass();
        }
        if (z) {
            synchronized (m46771) {
                c19377.m44640(this.f22719, this.f22720);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC19791 m19869(String str) {
        if (!this.f22704) {
            throw new C12651("session is down");
        }
        try {
            AbstractC19791 m19852 = m19852(str);
            if (m19852 != null) {
                m19852.mo5591();
                if (m19852 instanceof C13439) {
                    this.f22696.getClass();
                }
                return m19852;
            }
            this.f22696.m46777().getClass();
            return null;
        } catch (Exception unused) {
            this.f22696.m46777().getClass();
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19861(C8087 c8087) {
        InterfaceC1031 interfaceC1031;
        InterfaceC20705 interfaceC20705 = this.f22715;
        boolean z = false;
        if (interfaceC20705 != null) {
            C16261 c16261 = c8087.f24903;
            int i = c16261.f50017;
            int[] iArr = this.f22657;
            iArr[0] = i;
            c16261.f50016 = interfaceC20705.mo24025(c16261.f50016, iArr);
            c8087.f24903.f50017 = iArr[0];
        }
        InterfaceC23526 interfaceC23526 = this.f22665;
        int i2 = interfaceC23526 != null ? this.f22707 : 8;
        boolean z2 = interfaceC23526 != null && interfaceC23526.mo2209();
        InterfaceC23526 interfaceC235262 = this.f22665;
        boolean z3 = interfaceC235262 != null && interfaceC235262.mo2210();
        boolean z4 = (z2 || z3 || this.f22665 == null || (interfaceC1031 = this.f22709) == null || !interfaceC1031.mo3562()) ? false : true;
        if (!z2 && !z3 && !z4) {
            z = true;
        }
        c8087.m21458(i2, z);
        C16261 c162612 = c8087.f24903;
        byte[] bArr = c162612.f50016;
        if (z2) {
            this.f22665.mo2202(this.f22718);
            this.f22665.mo2203(0, bArr, 4, bArr, 0);
            this.f22665.mo2208(0, bArr, c162612.f50017, bArr, 0);
            c162612.m38251(this.f22665.mo2207());
            return;
        }
        if (z3) {
            this.f22665.mo2205(bArr);
            this.f22665.mo2208(4, bArr, c162612.f50017 - 4, bArr, 4);
            c162612.m38251(this.f22665.mo2207());
            return;
        }
        if (z4) {
            this.f22665.mo2203(4, bArr, c162612.f50017 - 4, bArr, 4);
            this.f22709.mo3560(this.f22718);
            this.f22709.mo3561(c162612.f50017, c162612.f50016);
            this.f22709.mo3563(c162612.f50017, c162612.f50016);
            c162612.m38251(this.f22709.getBlockSize());
            return;
        }
        InterfaceC1031 interfaceC10312 = this.f22709;
        if (interfaceC10312 != null) {
            interfaceC10312.mo3560(this.f22718);
            this.f22709.mo3561(c162612.f50017, c162612.f50016);
            this.f22709.mo3563(c162612.f50017, c162612.f50016);
        }
        InterfaceC23526 interfaceC235263 = this.f22665;
        if (interfaceC235263 != null) {
            interfaceC235263.mo2203(0, bArr, c162612.f50017, bArr, 0);
        }
        InterfaceC1031 interfaceC10313 = this.f22709;
        if (interfaceC10313 != null) {
            c162612.m38251(interfaceC10313.getBlockSize());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC19791 m19840(int i) {
        Lock readLock = this.f22669.readLock();
        readLock.lock();
        try {
            Iterator it = this.f22655.iterator();
            while (it.hasNext()) {
                AbstractC19791 abstractC19791 = (AbstractC19791) it.next();
                if (abstractC19791.f63920 == i) {
                    return abstractC19791;
                }
            }
            readLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0100, code lost:
    
        m19842(r27, r26.f22656, r26.f22658, 0, 262144);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x010f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x020f, code lost:
    
        m19842(r27, r26.f22656, r26.f22658, 0, 262144);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x021e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04a2, code lost:
    
        m19842(r27, r26.f22656, r26.f22658, 0, 262144);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0438, code lost:
    
        r4.f50018 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x043a, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c7  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19863(l.C16261 r27) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7381.m19863(l.ܺ᩻ۘ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19842(C16261 c16261, InterfaceC23526 interfaceC23526, InterfaceC1031 interfaceC1031, int i, int i2) {
        IOException e;
        if (interfaceC23526.mo2206() && (interfaceC1031 == null || !interfaceC1031.mo3562())) {
            if (interfaceC1031 != null) {
                interfaceC1031.mo3560(this.f22716);
                interfaceC1031.mo3561(i, c16261.f50016);
            }
            while (i2 > 0) {
                try {
                    c16261.m38242();
                    byte[] bArr = c16261.f50016;
                    int length = i2 > bArr.length ? bArr.length : i2;
                    this.f22702.m45400(0, length, bArr);
                    if (interfaceC1031 != null) {
                        interfaceC1031.mo3561(length, c16261.f50016);
                    }
                    i2 -= length;
                } catch (IOException e2) {
                    e = e2;
                    this.f22696.m46777().getClass();
                }
            }
            e = null;
            if (interfaceC1031 != null) {
                interfaceC1031.mo3563(0, c16261.f50016);
            }
            C12651 c12651 = new C12651("Packet corrupt");
            if (e != null) {
                c12651.addSuppressed(e);
                throw c12651;
            }
            throw c12651;
        }
        throw new C12651("Packet corrupt");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m19873() {
        return this.f22664;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19843(AbstractC16553 abstractC16553) {
        try {
            m19848(abstractC16553);
            C19356.m44596(abstractC16553.f50856);
            abstractC16553.f50856 = null;
            this.f22693 = false;
            if (this.f22667) {
                this.f22716 = 0;
                this.f22696.m46777().getClass();
            }
        } catch (Throwable th) {
            C19356.m44596(abstractC16553.f50856);
            abstractC16553.f50856 = null;
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19848(AbstractC16553 abstractC16553) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = abstractC16553.f50856;
        byte[] bArr4 = abstractC16553.f50855;
        InterfaceC2774 interfaceC2774 = abstractC16553.f50857;
        if (this.f22664 == null) {
            byte[] bArr5 = new byte[bArr4.length];
            this.f22664 = bArr5;
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        }
        this.f22661.m38242();
        this.f22661.m38247(bArr3);
        this.f22661.m38247(bArr4);
        this.f22661.m38234((byte) 65);
        this.f22661.m38247(this.f22664);
        C16261 c16261 = this.f22661;
        interfaceC2774.mo1151(c16261.f50017, c16261.f50016);
        this.f22701 = interfaceC2774.mo1152();
        C16261 c162612 = this.f22661;
        int i = c162612.f50017;
        int length = (i - this.f22664.length) - 1;
        byte[] bArr6 = c162612.f50016;
        bArr6[length] = (byte) (bArr6[length] + 1);
        interfaceC2774.mo1151(i, bArr6);
        this.f22705 = interfaceC2774.mo1152();
        C16261 c162613 = this.f22661;
        byte[] bArr7 = c162613.f50016;
        bArr7[length] = (byte) (bArr7[length] + 1);
        interfaceC2774.mo1151(c162613.f50017, bArr7);
        this.f22659 = interfaceC2774.mo1152();
        C16261 c162614 = this.f22661;
        byte[] bArr8 = c162614.f50016;
        bArr8[length] = (byte) (bArr8[length] + 1);
        interfaceC2774.mo1151(c162614.f50017, bArr8);
        this.f22685 = interfaceC2774.mo1152();
        C16261 c162615 = this.f22661;
        byte[] bArr9 = c162615.f50016;
        bArr9[length] = (byte) (bArr9[length] + 1);
        interfaceC2774.mo1151(c162615.f50017, bArr9);
        this.f22721 = interfaceC2774.mo1152();
        C16261 c162616 = this.f22661;
        byte[] bArr10 = c162616.f50016;
        bArr10[length] = (byte) (bArr10[length] + 1);
        interfaceC2774.mo1151(c162616.f50017, bArr10);
        this.f22673 = interfaceC2774.mo1152();
        try {
            this.f22656 = (InterfaceC23526) Class.forName(m19856(this.f22671[3])).asSubclass(InterfaceC23526.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize = this.f22656.getBlockSize();
                bArr = this.f22685;
                if (blockSize <= bArr.length) {
                    break;
                }
                this.f22661.m38242();
                C16261 c162617 = this.f22661;
                c162617.getClass();
                c162617.m38246(0, bArr3.length, bArr3);
                C16261 c162618 = this.f22661;
                c162618.getClass();
                c162618.m38246(0, bArr4.length, bArr4);
                this.f22661.m38247(this.f22685);
                C16261 c162619 = this.f22661;
                interfaceC2774.mo1151(c162619.f50017, c162619.f50016);
                byte[] mo1152 = interfaceC2774.mo1152();
                byte[] bArr11 = this.f22685;
                byte[] bArr12 = new byte[bArr11.length + mo1152.length];
                System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
                System.arraycopy(mo1152, 0, bArr12, this.f22685.length, mo1152.length);
                this.f22685 = bArr12;
            }
            this.f22656.mo2204(1, bArr, this.f22705);
            this.f22670 = this.f22656.mo2211();
            if (!this.f22656.mo2210()) {
                InterfaceC1031 interfaceC1031 = (InterfaceC1031) Class.forName(m19856(this.f22671[5])).asSubclass(InterfaceC1031.class).getDeclaredConstructor(null).newInstance(null);
                this.f22658 = interfaceC1031;
                byte[] m19844 = m19844(this.f22661, bArr3, bArr4, this.f22673, interfaceC2774, interfaceC1031.getBlockSize());
                this.f22673 = m19844;
                this.f22658.init(m19844);
                this.f22678 = new byte[this.f22658.getBlockSize()];
                this.f22698 = new byte[this.f22658.getBlockSize()];
            }
            this.f22665 = (InterfaceC23526) Class.forName(m19856(this.f22671[2])).asSubclass(InterfaceC23526.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize2 = this.f22665.getBlockSize();
                bArr2 = this.f22659;
                if (blockSize2 <= bArr2.length) {
                    break;
                }
                this.f22661.m38242();
                C16261 c1626110 = this.f22661;
                c1626110.getClass();
                c1626110.m38246(0, bArr3.length, bArr3);
                C16261 c1626111 = this.f22661;
                c1626111.getClass();
                c1626111.m38246(0, bArr4.length, bArr4);
                this.f22661.m38247(this.f22659);
                C16261 c1626112 = this.f22661;
                interfaceC2774.mo1151(c1626112.f50017, c1626112.f50016);
                byte[] mo11522 = interfaceC2774.mo1152();
                byte[] bArr13 = this.f22659;
                byte[] bArr14 = new byte[bArr13.length + mo11522.length];
                System.arraycopy(bArr13, 0, bArr14, 0, bArr13.length);
                System.arraycopy(mo11522, 0, bArr14, this.f22659.length, mo11522.length);
                this.f22659 = bArr14;
            }
            this.f22665.mo2204(0, bArr2, this.f22701);
            this.f22707 = this.f22665.mo2211();
            if (!this.f22665.mo2210()) {
                InterfaceC1031 interfaceC10312 = (InterfaceC1031) Class.forName(m19856(this.f22671[4])).asSubclass(InterfaceC1031.class).getDeclaredConstructor(null).newInstance(null);
                this.f22709 = interfaceC10312;
                byte[] m198442 = m19844(this.f22661, bArr3, bArr4, this.f22721, interfaceC2774, interfaceC10312.getBlockSize());
                this.f22721 = m198442;
                this.f22709.init(m198442);
            }
            m19849(this.f22671[6]);
            m19854(this.f22671[7]);
        } catch (Exception | LinkageError e) {
            if (!(e instanceof C12651)) {
                throw new C12651(e.toString(), e);
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m19844(C16261 c16261, byte[] bArr, byte[] bArr2, byte[] bArr3, InterfaceC2774 interfaceC2774, int i) {
        int blockSize = interfaceC2774.getBlockSize();
        while (bArr3.length < i) {
            c16261.m38242();
            c16261.m38247(bArr);
            c16261.m38247(bArr2);
            c16261.m38246(0, bArr3.length, bArr3);
            interfaceC2774.mo1151(c16261.f50017, c16261.f50016);
            byte[] bArr4 = new byte[bArr3.length + blockSize];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(interfaceC2774.mo1152(), 0, bArr4, bArr3.length, blockSize);
            C19356.m44596(bArr3);
            bArr3 = bArr4;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r20.f63909 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r20.m45489() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r20.f63922 <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        r7 = r20.f63922;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r7 <= r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if (r7 == r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        r9 = (int) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r18.f22665 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        r10 = r18.f22707;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        r11 = r18.f22709;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r11 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        r11 = r11.getBlockSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        r12 = r19.f24903;
        r13 = r9 + 14;
        r15 = (-r13) & (r10 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        if (r15 >= r10) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        r15 = r15 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r10 = l.C19373.m44633(r13, r15, r11, 32);
        r11 = r12.f50016;
        r14 = ((r12.f50017 + r10) - 14) - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        if (r11.length >= r14) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        r14 = new byte[r14];
        java.lang.System.arraycopy(r11, 0, r14, 0, r11.length);
        r12.f50016 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        r11 = r12.f50016;
        java.lang.System.arraycopy(r11, r13, r11, r10, (r12.f50017 - 14) - r9);
        r12.f50017 = 10;
        r12.m38245(r9);
        r12.f50017 = r13;
        r14 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        r9 = r19.f24903.f50016[r14];
        r11 = r20.f63918;
        r6 = r6 - ((int) r7);
        r20.f63922 -= r7;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r7 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        m19851(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        if (r6 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f6, code lost:
    
        r7 = r19.f24903;
        r8 = r7.f50016;
        java.lang.System.arraycopy(r8, r10, r8, 14, r6);
        r7.f50016[r14] = r9;
        r7.f50017 = 6;
        r7.m38245(r11);
        r7.m38245(r6);
        r7.f50017 = r6 + 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r18.f22693 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
    
        if (r20.f63922 < r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0121, code lost:
    
        r20.f63922 -= r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0126, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        m19851(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0117, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009a, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x008f, code lost:
    
        r10 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d5, code lost:
    
        r14 = 5;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e8, code lost:
    
        r14 = 5;
        r11 = -1;
        r7 = false;
        r9 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013b, code lost:
    
        throw new java.io.IOException("channel is broken");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19862(l.C8087 r19, l.AbstractC19791 r20, int r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7381.m19862(l.۠ۢۘ, l.᩵᩻ۘ, int):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19872(C8087 c8087) {
        long j = 0;
        while (this.f22693) {
            if (j <= 0 || System.currentTimeMillis() - this.f22674 <= j || this.f22675) {
                byte b = c8087.f24903.f50016[5];
                if (b == 20 || b == 21 || b == 30 || b == 31 || b == 31 || b == 32 || b == 33 || b == 34 || b == 1) {
                    break;
                } else {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                throw new C12651("timeout in waiting for rekeying process.");
            }
        }
        m19851(c8087);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r9.f22718 = 0;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m19851(l.C8087 r10) {
        /*
            r9 = this;
            boolean r1 = r9.f22686
            boolean r0 = r9.f22667
            boolean r2 = r9.f22689
            boolean r3 = r9.f22710
            l.ܺ᩻ۘ r4 = r10.f24903
            byte[] r4 = r4.f50016
            r5 = 5
            r4 = r4[r5]
            r5 = 21
            r6 = 0
            if (r4 != r5) goto L19
            if (r0 == 0) goto L19
            r0 = 1
            r4 = 1
            goto L1b
        L19:
            r0 = 0
            r4 = 0
        L1b:
            java.lang.Object r0 = r9.f22714
            monitor-enter(r0)
            r9.m19861(r10)     // Catch: java.lang.Throwable -> L61
            l.᩵᩷ۘ r5 = r9.f22702     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L50
            java.io.OutputStream r7 = r5.f63667     // Catch: java.lang.Throwable -> L61
            l.ܺ᩻ۘ r10 = r10.f24903     // Catch: java.lang.Throwable -> L61
            byte[] r8 = r10.f50016     // Catch: java.lang.Throwable -> L61
            int r10 = r10.f50017     // Catch: java.lang.Throwable -> L61
            r7.write(r8, r6, r10)     // Catch: java.lang.Throwable -> L61
            java.io.OutputStream r10 = r5.f63667     // Catch: java.lang.Throwable -> L61
            r10.flush()     // Catch: java.lang.Throwable -> L61
            int r10 = r9.f22718     // Catch: java.lang.Throwable -> L61
            int r10 = r10 + 1
            r9.f22718 = r10     // Catch: java.lang.Throwable -> L61
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L41
            if (r3 == 0) goto L4c
        L41:
            if (r1 != 0) goto L44
            goto L4c
        L44:
            l.ܰ᩷ۘ r10 = new l.ܰ᩷ۘ     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "outgoing sequence number wrapped during initial KEX"
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L61
            throw r10     // Catch: java.lang.Throwable -> L61
        L4c:
            if (r4 == 0) goto L50
            r9.f22718 = r6     // Catch: java.lang.Throwable -> L61
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L60
            l.᩵᩷ۘ r10 = r9.f22702
            if (r10 == 0) goto L60
            l.᩶᩷ۘ r10 = r9.f22696
            l.ۚۢۘ r10 = r10.m46777()
            r10.getClass()
        L60:
            return
        L61:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7381.m19851(l.۠ۢۘ):void");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m19867() {
        AbstractC19791 m19840;
        int i;
        byte b;
        this.f22684 = new RunnableC11615(this);
        C16261 c16261 = new C16261();
        C8087 c8087 = new C8087(c16261);
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        while (true) {
            AbstractC16553 abstractC16553 = null;
            while (true) {
                int i2 = 0;
                while (this.f22704 && this.f22684 != null) {
                    try {
                        try {
                            m19863(c16261);
                            int i3 = c16261.f50016[5] & 255;
                            if (abstractC16553 != null && abstractC16553.mo18945() == i3) {
                                this.f22674 = System.currentTimeMillis();
                                boolean mo18944 = abstractC16553.mo18944(c16261);
                                if (!mo18944) {
                                    throw new C12651("verify: " + mo18944);
                                }
                            } else if (i3 == 20) {
                                abstractC16553 = m19847(c16261);
                            } else if (i3 != 21) {
                                switch (i3) {
                                    case 80:
                                        c16261.m38250();
                                        c16261.m38241();
                                        c16261.m38257();
                                        if (c16261.m38233() == 0) {
                                            break;
                                        } else {
                                            c8087.m21457();
                                            c16261.m38234((byte) 82);
                                            m19872(c8087);
                                            break;
                                        }
                                    case 81:
                                    case 82:
                                        Thread m33031 = this.f22683.m33031();
                                        if (m33031 == null) {
                                            break;
                                        } else {
                                            this.f22683.getClass();
                                            if (i3 == 81 && this.f22683.m33029() == 0) {
                                                c16261.m38250();
                                                c16261.m38241();
                                                this.f22683.m33030(c16261.m38250());
                                            }
                                            m33031.interrupt();
                                            break;
                                        }
                                    default:
                                        switch (i3) {
                                            case 90:
                                                c16261.m38250();
                                                c16261.m38241();
                                                byte[] m38257 = c16261.m38257();
                                                String str = new String(m38257, 0, m38257.length, StandardCharsets.UTF_8);
                                                if (!"forwarded-tcpip".equals(str) && ((!"x11".equals(str) || !this.f22676) && (!"auth-agent@openssh.com".equals(str) || !this.f22679))) {
                                                    this.f22696.m46777().getClass();
                                                    c8087.m21457();
                                                    c16261.m38234((byte) 92);
                                                    c16261.m38245(c16261.m38250());
                                                    c16261.m38245(1);
                                                    byte[] bArr = C19356.f62660;
                                                    c16261.m38256(bArr);
                                                    c16261.m38252(0, bArr.length, bArr);
                                                    m19872(c8087);
                                                    break;
                                                } else {
                                                    final AbstractC19791 m19869 = m19869(str);
                                                    if (m19869 == null) {
                                                        this.f22696.m46777().getClass();
                                                        c8087.m21457();
                                                        c16261.m38234((byte) 92);
                                                        c16261.m38245(c16261.m38250());
                                                        c16261.m38245(4);
                                                        byte[] bArr2 = C19356.f62660;
                                                        c16261.m38256(bArr2);
                                                        c16261.m38252(0, bArr2.length, bArr2);
                                                        m19872(c8087);
                                                        break;
                                                    } else {
                                                        m19869.mo10853(c16261);
                                                        ThreadFactoryC5970 threadFactoryC5970 = this.f22672;
                                                        Runnable runnable = new Runnable() { // from class: l.᩺ۢۘ
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                AbstractC19791.this.mo2847();
                                                            }
                                                        };
                                                        threadFactoryC5970.getClass();
                                                        Thread thread = new Thread(runnable);
                                                        thread.setName("Channel " + str + " " + this.f22687);
                                                        thread.start();
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 91:
                                                c16261.m38250();
                                                c16261.m38241();
                                                AbstractC19791 m198402 = m19840(c16261.m38250());
                                                int m38250 = c16261.m38250();
                                                long m38243 = c16261.m38243();
                                                int m382502 = c16261.m38250();
                                                if (m198402 == null) {
                                                    break;
                                                } else {
                                                    m198402.m45492(m38243);
                                                    m198402.f63911 = m382502;
                                                    m198402.f63914 = true;
                                                    m198402.m45491(m38250);
                                                    break;
                                                }
                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                c16261.m38250();
                                                c16261.m38241();
                                                AbstractC19791 m198403 = m19840(c16261.m38250());
                                                if (m198403 == null) {
                                                    break;
                                                } else {
                                                    c16261.m38250();
                                                    m198403.f63909 = true;
                                                    m198403.m45491(0);
                                                    break;
                                                }
                                            case 93:
                                                c16261.m38250();
                                                c16261.m38241();
                                                AbstractC19791 m198404 = m19840(c16261.m38250());
                                                if (m198404 != null) {
                                                    m198404.m45486(c16261.m38243());
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                c16261.m38250();
                                                c16261.m38233();
                                                c16261.m38233();
                                                m19840 = m19840(c16261.m38250());
                                                int m382503 = c16261.m38250();
                                                int i4 = c16261.f50018;
                                                c16261.f50018 = i4 + m382503;
                                                iArr[0] = i4;
                                                iArr2[0] = m382503;
                                                byte[] bArr3 = c16261.f50016;
                                                if (m19840 != null && m382503 != 0) {
                                                    try {
                                                        try {
                                                            m19840.mo2846(bArr3, iArr[0], m382503);
                                                            m19840.f63913 -= iArr2[0];
                                                            if (m19840.f63913 < m19840.f63924 / 2) {
                                                                c8087.m21457();
                                                                c16261.m38234((byte) 93);
                                                                c16261.m38245(m19840.f63918);
                                                                c16261.m38245(m19840.f63924 - m19840.f63913);
                                                                synchronized (m19840) {
                                                                    if (!m19840.f63909) {
                                                                        m19872(c8087);
                                                                    }
                                                                }
                                                                i = m19840.f63924;
                                                                m19840.f63913 = i;
                                                                break;
                                                            } else {
                                                                continue;
                                                            }
                                                        } catch (Exception unused) {
                                                            continue;
                                                        }
                                                    } catch (Exception unused2) {
                                                        m19840.m45490();
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 95:
                                                c16261.m38250();
                                                c16261.m38241();
                                                m19840 = m19840(c16261.m38250());
                                                c16261.m38250();
                                                int m382504 = c16261.m38250();
                                                int i5 = c16261.f50018;
                                                c16261.f50018 = i5 + m382504;
                                                iArr[0] = i5;
                                                iArr2[0] = m382504;
                                                if (m19840 != null && m382504 != 0) {
                                                    try {
                                                        m19840.f63917.getClass();
                                                        throw null;
                                                        break;
                                                    } catch (NullPointerException unused3) {
                                                        m19840.f63913 -= iArr2[0];
                                                        if (m19840.f63913 < m19840.f63924 / 2) {
                                                            c8087.m21457();
                                                            c16261.m38234((byte) 93);
                                                            c16261.m38245(m19840.f63918);
                                                            c16261.m38245(m19840.f63924 - m19840.f63913);
                                                            synchronized (m19840) {
                                                                if (!m19840.f63909) {
                                                                    m19872(c8087);
                                                                }
                                                                i = m19840.f63924;
                                                                break;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 96:
                                                c16261.m38250();
                                                c16261.m38241();
                                                AbstractC19791 m198405 = m19840(c16261.m38250());
                                                if (m198405 == null) {
                                                    break;
                                                } else {
                                                    m198405.mo2848();
                                                    break;
                                                }
                                            case 97:
                                                c16261.m38250();
                                                c16261.m38241();
                                                AbstractC19791 m198406 = m19840(c16261.m38250());
                                                if (m198406 == null) {
                                                    break;
                                                } else {
                                                    m198406.m45490();
                                                    break;
                                                }
                                            case 98:
                                                c16261.m38250();
                                                c16261.m38241();
                                                int m382505 = c16261.m38250();
                                                byte[] m382572 = c16261.m38257();
                                                boolean z = c16261.m38233() != 0;
                                                AbstractC19791 m198407 = m19840(m382505);
                                                if (m198407 != null) {
                                                    if (new String(m382572, 0, m382572.length, StandardCharsets.UTF_8).equals("exit-status")) {
                                                        c16261.m38250();
                                                        b = 99;
                                                    } else {
                                                        b = 100;
                                                    }
                                                    if (!z) {
                                                        break;
                                                    } else {
                                                        c8087.m21457();
                                                        c16261.m38234(b);
                                                        c16261.m38245(m198407.f63918);
                                                        m19872(c8087);
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            case q.f /* 99 */:
                                                c16261.m38250();
                                                c16261.m38241();
                                                AbstractC19791 m198408 = m19840(c16261.m38250());
                                                if (m198408 != null) {
                                                    m198408.f63910 = 1;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 100:
                                                c16261.m38250();
                                                c16261.m38241();
                                                AbstractC19791 m198409 = m19840(c16261.m38250());
                                                if (m198409 != null) {
                                                    m198409.f63910 = 0;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            default:
                                                throw new IOException("Unknown SSH message type " + i3);
                                        }
                                }
                            }
                        } catch (InterruptedIOException e) {
                            if (!this.f22693 && i2 < this.f22712) {
                                C16261 c162612 = new C16261();
                                C8087 c80872 = new C8087(c162612);
                                c80872.m21457();
                                c162612.m38234(UTF8.S_P4A);
                                c162612.m38256(f22653);
                                c162612.m38234((byte) 1);
                                m19872(c80872);
                            } else if (!this.f22693 || i2 >= this.f22712) {
                                throw e;
                            }
                            i2++;
                        }
                    } catch (Exception unused4) {
                        this.f22693 = false;
                        this.f22696.m46777().getClass();
                    }
                }
                try {
                    m19870();
                } catch (NullPointerException | Exception unused5) {
                }
                this.f22704 = false;
                return;
            }
            C8087 c80873 = this.f22662;
            c80873.m21457();
            this.f22661.m38234((byte) 21);
            m19872(c80873);
            this.f22696.m46777().getClass();
            m19843(abstractC16553);
        }
        throw e;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19865(AbstractC19791 abstractC19791) {
        Lock writeLock = this.f22669.writeLock();
        writeLock.lock();
        try {
            this.f22655.remove(abstractC19791);
        } finally {
            writeLock.unlock();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19870() {
        if (this.f22704) {
            this.f22696.m46777().getClass();
            Lock writeLock = this.f22669.writeLock();
            writeLock.lock();
            try {
                this.f22717 = true;
                ArrayList arrayList = new ArrayList(this.f22655);
                writeLock.unlock();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((AbstractC19791) it.next()).m45490();
                    } catch (Exception unused) {
                        this.f22696.m46777().getClass();
                    }
                }
                this.f22704 = false;
                C21493.m48663(this);
                C3562.m10851(this);
                C14353.m34248(this);
                synchronized (this.f22714) {
                    if (this.f22697 != null) {
                        Thread.yield();
                        this.f22697.interrupt();
                        this.f22697 = null;
                    }
                }
                this.f22684 = null;
                try {
                    C19708 c19708 = this.f22702;
                    if (c19708 != null) {
                        InputStream inputStream = c19708.f63666;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        OutputStream outputStream = this.f22702.f63667;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f22702.getClass();
                    }
                    Socket socket = this.f22692;
                    if (socket != null) {
                        socket.close();
                    }
                } catch (Exception unused2) {
                }
                this.f22702 = null;
                this.f22692 = null;
                writeLock.lock();
                try {
                    this.f22717 = false;
                    this.f22655.clear();
                    writeLock.unlock();
                    this.f22716 = 0;
                    this.f22718 = 0;
                    this.f22686 = true;
                    this.f22667 = false;
                    this.f22711 = false;
                    this.f22668 = null;
                    this.f22696.m46776(this);
                } finally {
                }
            } finally {
            }
        }
        C7381 c7381 = this.f22722;
        if (c7381 != null) {
            c7381.m19870();
            this.f22722 = null;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ThreadFactoryC5970 m19879() {
        return this.f22672;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m19855(String str, int i, int i2, String str2) {
        C21493 m48662 = C21493.m48662(this, str, i, str2, i2);
        RunnableC15141 runnableC15141 = new RunnableC15141(m48662);
        this.f22672.getClass();
        Thread thread = new Thread(runnableC15141);
        thread.setName("PortWatcher Thread for " + str2);
        thread.start();
        return m48662.f69137;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m19849(String str) {
        int i;
        InterfaceC20705 interfaceC20705 = this.f22715;
        if (str.equals("none")) {
            this.f22715 = null;
            if (interfaceC20705 != null) {
                return;
            } else {
                return;
            }
        }
        String m19856 = m19856(str);
        if (m19856 != null) {
            if (str.equals("zlib") || (this.f22706 && str.equals("zlib@openssh.com"))) {
                try {
                    try {
                        this.f22715 = (InterfaceC20705) Class.forName(m19856).asSubclass(InterfaceC20705.class).getDeclaredConstructor(null).newInstance(null);
                        try {
                            i = Integer.parseInt(m19856("compression_level"));
                        } catch (Exception unused) {
                            i = 6;
                        }
                        this.f22715.mo24023(1, i, this);
                        if (interfaceC20705 != null) {
                            interfaceC20705.end();
                        }
                    } catch (Exception e) {
                        throw new C12651(e.toString(), e);
                    }
                } finally {
                    if (interfaceC20705 != null) {
                        interfaceC20705.end();
                    }
                }
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m19854(String str) {
        InterfaceC20705 interfaceC20705 = this.f22660;
        if (str.equals("none")) {
            this.f22660 = null;
            if (interfaceC20705 != null) {
                return;
            } else {
                return;
            }
        }
        String m19856 = m19856(str);
        if (m19856 != null) {
            if (str.equals("zlib") || (this.f22706 && str.equals("zlib@openssh.com"))) {
                try {
                    try {
                        InterfaceC20705 interfaceC207052 = (InterfaceC20705) Class.forName(m19856).asSubclass(InterfaceC20705.class).getDeclaredConstructor(null).newInstance(null);
                        this.f22660 = interfaceC207052;
                        interfaceC207052.mo24023(0, 0, this);
                        if (interfaceC20705 != null) {
                            interfaceC20705.end();
                        }
                    } catch (Exception e) {
                        throw new C12651(e.toString(), e);
                    }
                } finally {
                    if (interfaceC20705 != null) {
                        interfaceC20705.end();
                    }
                }
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private AbstractC19791 m19852(String str) {
        C13439 c13439 = str.equals(d.aw) ? new C13439() : null;
        if (str.equals("shell")) {
            C16470 c16470 = new C16470();
            c16470.f40156 = true;
            c13439 = c16470;
        }
        C13439 c134392 = c13439;
        if (str.equals("exec")) {
            c134392 = new C21907();
        }
        AbstractC19791 abstractC19791 = c134392;
        if (str.equals("x11")) {
            abstractC19791 = new C14353();
        }
        AbstractC19791 abstractC197912 = abstractC19791;
        if (str.equals("auth-agent@openssh.com")) {
            abstractC197912 = new C0739();
        }
        AbstractC19791 abstractC197913 = abstractC197912;
        if (str.equals("direct-tcpip")) {
            abstractC197913 = new C8501();
        }
        AbstractC19791 abstractC197914 = abstractC197913;
        if (str.equals("forwarded-tcpip")) {
            abstractC197914 = new C3562();
        }
        AbstractC19791 abstractC197915 = abstractC197914;
        if (str.equals("sftp")) {
            C1654 c1654 = new C1654();
            c1654.m5590(m19856("use_sftp_write_flush_workaround").equals("yes"));
            abstractC197915 = c1654;
        }
        AbstractC19791 abstractC197916 = abstractC197915;
        if (str.equals("subsystem")) {
            C17176 c17176 = new C17176();
            c17176.f52641 = true;
            c17176.f52642 = "";
            abstractC197916 = c17176;
        }
        AbstractC19791 abstractC197917 = abstractC197916;
        if (str.equals("direct-streamlocal@openssh.com")) {
            abstractC197917 = new C5679();
        }
        if (abstractC197917 == null) {
            return null;
        }
        Lock writeLock = this.f22669.writeLock();
        writeLock.lock();
        try {
            if (this.f22717 || !this.f22704) {
                return null;
            }
            abstractC197917.f63923 = this;
            this.f22655.add(abstractC197917);
            return abstractC197917;
        } finally {
            writeLock.unlock();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String[] m19876() {
        return this.f22668;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19864(InterfaceC18650 interfaceC18650) {
        this.f22720 = interfaceC18650;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18650 m19878() {
        return this.f22720;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19859(String str, String str2) {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2 == null ? null : str2.getBytes();
        C20413 c20413 = this.f22696;
        c20413.m46772(C5596.m15880(c20413.f65869, "builtin", bytes), bytes2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19875(String str) {
        if (str != null) {
            byte[] bArr = C19356.f62660;
            this.f22666 = C19356.m44592(str, StandardCharsets.UTF_8);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19871(String str, String str2) {
        synchronized (this.f22714) {
            if (this.f22677 == null) {
                this.f22677 = new Hashtable();
            }
            if (str.equals("PubkeyAcceptedKeyTypes")) {
                this.f22677.put("PubkeyAcceptedAlgorithms", str2);
            } else {
                this.f22677.put(str, str2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19856(String str) {
        if (str.equals("PubkeyAcceptedKeyTypes")) {
            str = "PubkeyAcceptedAlgorithms";
        }
        Hashtable hashtable = this.f22677;
        if (hashtable != null) {
            Object obj = hashtable.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        String m46768 = C20413.m46768(str);
        if (m46768 != null) {
            return m46768;
        }
        return null;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m19868() {
        return this.f22704;
    }

    static {
        byte[] bArr = C19356.f62660;
        f22653 = "keepalive@jcraft.com".getBytes(StandardCharsets.UTF_8);
        C19356.m44599("no-more-sessions@openssh.com");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m19853(String str) {
        try {
            InterfaceC23526 interfaceC23526 = (InterfaceC23526) Class.forName(str).asSubclass(InterfaceC23526.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC23526.mo2204(0, new byte[interfaceC23526.getBlockSize()], new byte[interfaceC23526.mo2211()]);
            return true;
        } catch (Exception | LinkageError unused) {
            return false;
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m19850() {
        if (m19856("ClearAllForwardings").equals("yes")) {
            return;
        }
        this.f22696.getClass();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5265 m19877() {
        return this.f22696.m46777();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m19874() {
        InterfaceC23526 interfaceC23526 = this.f22665;
        InterfaceC1031 interfaceC1031 = this.f22709;
        int i = 20;
        if (interfaceC23526 != null && (interfaceC23526.mo2209() || interfaceC23526.mo2210())) {
            if (interfaceC23526.mo2207() > 20) {
                i = interfaceC23526.mo2207();
            }
        } else if (interfaceC1031 != null && interfaceC1031.getBlockSize() > 20) {
            i = interfaceC1031.getBlockSize();
        }
        return i + 64;
    }
}
