package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* compiled from: Q7RX */
/* renamed from: l.ۙۖ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4356 extends C12158 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f14000;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23168 f14001;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f14002;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f14003;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6136 f14004;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f14005;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f14006;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f14007;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public StringBuilder f14008;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3691 f14009;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4824 f14010;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22364 f14011;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4397 f14012;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC16280 f14013;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC19920 f14014;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m13060(char c) {
        if (c == '!' || c == '-' || c == ':' || c == '^' || c == '|' || c == '~' || c == '%' || c == '&' || c == '*' || c == '+') {
            return true;
        }
        switch (c) {
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4356(l.C3691 r2, java.nio.CharBuffer r3) {
        /*
            r1 = this;
            int r0 = l.C11844.f35338
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L17
            java.nio.CharBuffer r0 = r3.compact()
            java.nio.Buffer r0 = r0.flip()
            java.lang.Object r0 = r0.array()
            char[] r0 = (char[]) r0
            goto L1f
        L17:
            java.lang.String r0 = r3.toString()
            char[] r0 = r0.toCharArray()
        L1f:
            int r3 = r3.limit()
            r1.<init>(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4356.<init>(l.ۘۘ۠, java.nio.CharBuffer):void");
    }

    public C4356(C3691 c3691, char[] cArr, int i) {
        super(c3691, cArr, i);
        this.f14007 = -1;
        this.f14006 = -1;
        this.f14009 = c3691;
        this.f14011 = c3691.f11643;
        this.f14004 = c3691.f11645;
        this.f14012 = c3691.f11644;
        this.f14013 = c3691.f11646;
        this.f14001 = c3691.f11647;
        this.f14010 = c3691.f11642;
        this.f14008 = new StringBuilder(256);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13065(int i, EnumC10637 enumC10637) {
        C23168 c23168 = this.f14001;
        boolean m51351 = c23168.m51351(enumC10637);
        C22364 c22364 = this.f14011;
        if (!m51351 || c23168.m51347()) {
            EnumC16280 enumC16280 = this.f14013;
            if (enumC10637.m26686(enumC16280)) {
                if (c23168.m51351(enumC10637)) {
                    c23168.m51344(new C7342(i), enumC10637);
                    return;
                }
                return;
            }
            c22364.m7279(EnumC20043.SOURCE_LEVEL, i, enumC10637.m26684(enumC16280.f50071));
        } else {
            c22364.m7279(EnumC20043.SOURCE_LEVEL, i, c23168.m51342(enumC10637));
        }
        this.f14006 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13066(int i, C12281 c12281) {
        this.f14011.m7269(i, c12281);
        this.f14014 = EnumC19920.f64415;
        this.f14006 = i;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m13072(char c) {
        this.f14008.append(c);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m13071() {
        if (m29590()) {
            this.f14008.appendCodePoint(m29587());
        } else {
            m13072(m29580());
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m13067() {
        m13071();
        mo9118();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m13063() {
        if (m29591('\\')) {
            m13072(m29580());
            mo9118();
            this.f14002 = true;
            char m29580 = m29580();
            if (m29580 != '\n' && m29580 != '\r') {
                if (m29580 != '\"' && m29580 != '\'' && m29580 != '\\' && m29580 != 'b' && m29580 != 'f' && m29580 != 'n') {
                    switch (m29580) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            char m295802 = m29580();
                            m13067();
                            if (m29589('7')) {
                                m13067();
                                if (m295802 > '3' || !m29589('7')) {
                                    return;
                                }
                                m13067();
                                return;
                            }
                            return;
                        default:
                            switch (m29580) {
                                case 'r':
                                case 't':
                                    break;
                                case 's':
                                    m13065(m29595(), EnumC10637.f31998);
                                    m13067();
                                    break;
                                default:
                                    m13066(m29595(), C6241.f19215);
                                    break;
                            }
                            return;
                    }
                }
                m13067();
                return;
            }
            if (this.f14003) {
                m29582('\r');
                m29582('\n');
                m13072('\n');
                return;
            }
            m13066(m29595(), C6241.f19215);
            return;
        }
        m13067();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13070(char c, char c2) {
        if (!m29583(c, c2)) {
            return false;
        }
        m13072(m29580());
        mo9118();
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m13058(int i) {
        int m29595;
        boolean m29591 = m29591('_');
        int i2 = this.f14007;
        int m295952 = m29591 ? m29595() : i2;
        while (true) {
            if (!m29591('_')) {
                m13071();
                m29595 = i2;
            } else {
                m29595 = m29595();
            }
            mo9118();
            if (m29581(i) < 0 && !m29591('_')) {
                break;
            }
        }
        if (m295952 != i2) {
            m13066(m295952, C6241.f19260);
        } else if (m29595 != i2) {
            m13066(m29595, C6241.f19260);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m13059(int i) {
        if (m13070('p', 'P')) {
            m13056();
            m13070('+', '-');
            m13056();
            if (m29581(10) >= 0) {
                m13058(10);
            } else {
                m13066(i, C6241.f19299);
            }
        } else {
            m13066(i, C6241.f19299);
        }
        if (m13070('f', 'F')) {
            this.f14014 = EnumC19920.f64374;
            this.f14005 = 16;
        } else {
            m13070('d', 'D');
            this.f14014 = EnumC19920.f64469;
            this.f14005 = 16;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m13061(int i) {
        this.f14005 = 10;
        m13056();
        if (m29581(10) >= 0) {
            m13058(10);
        }
        StringBuilder sb = this.f14008;
        int length = sb.length();
        if (m13070('e', 'E')) {
            m13056();
            m13070('+', '-');
            m13056();
            if (m29581(10) >= 0) {
                m13058(10);
            } else {
                m13066(i, C6241.f19299);
                sb.setLength(length);
            }
        }
        if (m13070('f', 'F')) {
            this.f14014 = EnumC19920.f64374;
        } else {
            m13070('d', 'D');
            this.f14014 = EnumC19920.f64469;
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m13056() {
        if (m29591('_')) {
            m13066(m29595(), C6241.f19260);
            while (m29582('_')) {
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13057(int i, int i2) {
        this.f14005 = i2;
        int i3 = i2 == 8 ? 10 : i2;
        int m29581 = m29581(Math.max(10, i3));
        boolean z = false;
        boolean z2 = true;
        boolean z3 = m29581 >= 0;
        boolean z4 = m29581 >= 0 && m29581 < i3;
        if (z3) {
            m13058(i3);
        }
        if (i2 == 16 && m29591('.')) {
            this.f14005 = 16;
            C12171.m29642(m29591('.'));
            m13067();
            m13056();
            if (m29581(16) >= 0) {
                m13058(16);
            } else {
                z2 = z3;
            }
            if (!z2) {
                m13066(i, C6241.f19162);
                return;
            } else {
                m13059(i);
                return;
            }
        }
        if (z3 && i2 == 16 && m29583('p', 'P')) {
            m13059(i);
            return;
        }
        if (i3 != 10 || !m29591('.')) {
            if (i3 == 10) {
                if (m29591('e') || m29591('E') || m29591('f') || m29591('F') || m29591('d') || m29591('D')) {
                    m13061(i);
                    return;
                }
            }
            if (!z4) {
                if (i2 == 2) {
                    m13066(i, C6241.f19124);
                } else if (i2 == 16) {
                    m13066(i, C6241.f19162);
                }
            }
            if (i2 == 8) {
                this.f14008.setLength(0);
                m29588(i);
                m13058(8);
            }
            if (m29583('l', 'L')) {
                mo9118();
                z = true;
            }
            if (z) {
                this.f14014 = EnumC19920.f64442;
                return;
            } else {
                this.f14014 = EnumC19920.f64368;
                return;
            }
        }
        m13067();
        m13061(i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0022. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0013. Please report as an issue. */
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m13062() {
        C4397 c4397;
        StringBuilder sb;
        C6136 c6136;
        boolean z;
        m13067();
        while (true) {
            char m29580 = m29580();
            if (m29580 != '$' && m29580 != '_') {
                if (m29580 != 127) {
                    switch (m29580) {
                    }
                    c4397 = this.f14012;
                    sb = this.f14008;
                    c6136 = this.f14004;
                    switch (m29580) {
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                            break;
                        case 26:
                            if (!m29593()) {
                                break;
                            } else {
                                mo9118();
                            }
                        default:
                            switch (m29580) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case '8':
                                case '9':
                                    break;
                                default:
                                    switch (m29580) {
                                        case 'A':
                                        case 'B':
                                        case 'C':
                                        case 'D':
                                        case 'E':
                                        case 'F':
                                        case 'G':
                                        case 'H':
                                        case 'I':
                                        case 'J':
                                        case 'K':
                                        case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                        case 'M':
                                        case 'N':
                                        case 'O':
                                        case 'P':
                                        case 'Q':
                                        case 'R':
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        case 'T':
                                        case 'U':
                                        case HRSS1373Polynomial.K /* 86 */:
                                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                        case 'X':
                                        case 'Y':
                                        case 'Z':
                                            break;
                                        default:
                                            switch (m29580) {
                                                case 'a':
                                                case 'b':
                                                case q.f /* 99 */:
                                                case 'd':
                                                case 'e':
                                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                                case 'l':
                                                case 'm':
                                                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                                case 'r':
                                                case 's':
                                                case 't':
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                case 'v':
                                                case 'w':
                                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                case 'z':
                                                    break;
                                                default:
                                                    if (m29594()) {
                                                        z = false;
                                                    } else if (Character.isIdentifierIgnorable(m29580())) {
                                                        mo9118();
                                                    } else if (m29590()) {
                                                        z = Character.isJavaIdentifierPart(m29587());
                                                    } else {
                                                        z = Character.isJavaIdentifierPart(m29580());
                                                    }
                                                    if (!z) {
                                                        break;
                                                    }
                                                    break;
                                            }
                                    }
                            }
                    }
                }
                mo9118();
            }
            m13067();
        }
        AbstractC10370 m30652 = c6136.f18880.m30652(sb.toString());
        this.f14000 = m30652;
        this.f14014 = c4397.m13125(m30652);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ef, code lost:
    
        m13062();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0159, code lost:
    
        if (m29591('/') != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:269:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x036d  */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C22036 m13068() {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4356.m13068():l.᩹ۘ۠");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC5102 mo13064(int i, int i2, EnumC0162 enumC0162) {
        return new C19879(enumC0162, this.f14009, m29585(i, i2), i);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC13896 mo13069() {
        return C11265.m27877(m29592(), m29596(), false);
    }
}
