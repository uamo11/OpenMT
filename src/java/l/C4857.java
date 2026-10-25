package l;

import android.os.Build;
import com.alipay.sdk.m.p.a;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.lang.Character;
import java.util.Locale;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.pqc.crypto.newhope.Params;

/* compiled from: G7I1 */
/* renamed from: l.ۙ᩵ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4857 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15353 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC21938 f15354;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC21938 f15355;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC21938 f15356;

    static {
        long[] jArr = new long[2];
        for (int i = 0; i < 128; i++) {
            if (C22165.m49802(i)) {
                int i2 = i >>> 6;
                jArr[i2] = jArr[i2] | (1 << i);
            }
        }
        f15354 = new C14881(jArr);
        f15356 = m14160(new C4152());
        f15355 = m14160(new C18969());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m14160(InterfaceC21938 interfaceC21938) {
        long[] jArr = new long[2];
        for (int i = 0; i < 128; i++) {
            if (interfaceC21938.mo2465(i)) {
                int i2 = i >>> 6;
                jArr[i2] = jArr[i2] | (1 << i);
            }
        }
        return new C14881(jArr);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14166() {
        return C14403.m34422(new C18948(), new C2741(), new C5542(), false);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14167(String str, boolean z) {
        int i;
        str.getClass();
        i = 1;
        switch (str) {
            case "XDIGIT":
                return new C20359().mo2466(new C1308());
            case "ALNUM":
                return C1622.m5503(new C18948(), new C20359());
            case "ALPHA":
                return new C18948();
            case "BLANK":
                return new C18263();
            case "CNTRL":
                return new C9091();
            case "DIGIT":
                return new C20359();
            case "GRAPH":
                return new C23907();
            case "LOWER":
                if (!z) {
                    return new C2035();
                }
                return C14403.m34422(new C2035(), new C15439(), new C15586(i), false);
            case "PRINT":
                InterfaceC10795 m5503 = C1622.m5503(new C23907(), new C18263());
                C9091 c9091 = new C9091();
                C5855 c5855 = C14403.f44164;
                return m5503.mo2464(C7679.m20568(c9091));
            case "PUNCT":
                return new C21086();
            case "SPACE":
                return new C14734();
            case "UPPER":
                if (!z) {
                    return new C15439();
                }
                return C14403.m34422(new C15439(), new C2035(), new C15586(i), false);
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14164(String str, boolean z) {
        InterfaceC10795 c2035;
        InterfaceC10795 c15439;
        C15586 c15586;
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int i = 1;
        char c = 65535;
        switch (upperCase.hashCode()) {
            case -2052843482:
                if (upperCase.equals("LETTER")) {
                    c = 0;
                    break;
                }
                break;
            case -2022879855:
                if (upperCase.equals("LOWERCASE")) {
                    c = 1;
                    break;
                }
                break;
            case -2012114231:
                if (upperCase.equals("HEX_DIGIT")) {
                    c = 2;
                    break;
                }
                break;
            case -1800911568:
                if (upperCase.equals("WHITE_SPACE")) {
                    c = 3;
                    break;
                }
                break;
            case -1725364189:
                if (upperCase.equals("IDEOGRAPHIC")) {
                    c = 4;
                    break;
                }
                break;
            case -1284848974:
                if (upperCase.equals("UPPERCASE")) {
                    c = 5;
                    break;
                }
                break;
            case -1100490541:
                if (upperCase.equals("JOINCONTROL")) {
                    c = 6;
                    break;
                }
                break;
            case -1066768688:
                if (upperCase.equals("EMOJI_MODIFIER")) {
                    c = 7;
                    break;
                }
                break;
            case -725414195:
                if (upperCase.equals("ALPHABETIC")) {
                    c = '\b';
                    break;
                }
                break;
            case -252338886:
                if (upperCase.equals("PUNCTUATION")) {
                    c = '\t';
                    break;
                }
                break;
            case -238378200:
                if (upperCase.equals("JOIN_CONTROL")) {
                    c = '\n';
                    break;
                }
                break;
            case 2670346:
                if (upperCase.equals("WORD")) {
                    c = 11;
                    break;
                }
                break;
            case 66095142:
                if (upperCase.equals("EMOJI")) {
                    c = '\f';
                    break;
                }
                break;
            case 325947122:
                if (upperCase.equals("HEXDIGIT")) {
                    c = '\r';
                    break;
                }
                break;
            case 412745166:
                if (upperCase.equals("ASSIGNED")) {
                    c = 14;
                    break;
                }
                break;
            case 651280744:
                if (upperCase.equals("TITLECASE")) {
                    c = 15;
                    break;
                }
                break;
            case 762004093:
                if (upperCase.equals("WHITESPACE")) {
                    c = 16;
                    break;
                }
                break;
            case 1017360423:
                if (upperCase.equals("NONCHARACTERCODEPOINT")) {
                    c = 17;
                    break;
                }
                break;
            case 1155928513:
                if (upperCase.equals("NONCHARACTER_CODE_POINT")) {
                    c = 18;
                    break;
                }
                break;
            case 1669525821:
                if (upperCase.equals("CONTROL")) {
                    c = 19;
                    break;
                }
                break;
            case 1752109792:
                if (upperCase.equals("EMOJI_MODIFIER_BASE")) {
                    c = 20;
                    break;
                }
                break;
            case 1791047684:
                if (upperCase.equals("EMOJI_COMPONENT")) {
                    c = 21;
                    break;
                }
                break;
            case 1890113289:
                if (upperCase.equals("EXTENDED_PICTOGRAPHIC")) {
                    c = 22;
                    break;
                }
                break;
            case 1919006355:
                if (upperCase.equals("EMOJI_PRESENTATION")) {
                    c = 23;
                    break;
                }
                break;
        }
        InterfaceC10795 interfaceC10795 = null;
        switch (c) {
            case 0:
                interfaceC10795 = new C15418();
                break;
            case 1:
                if (!z) {
                    interfaceC10795 = new C2035();
                    break;
                } else {
                    c2035 = new C2035();
                    c15439 = new C15439();
                    c15586 = new C15586(i);
                    interfaceC10795 = C14403.m34422(c2035, c15439, c15586, false);
                    break;
                }
            case 2:
            case '\r':
                interfaceC10795 = new C20359().mo2466(new C1308());
                break;
            case 3:
            case 16:
                interfaceC10795 = new C14734();
                break;
            case 4:
                interfaceC10795 = new C7658();
                break;
            case 5:
                if (!z) {
                    interfaceC10795 = new C15439();
                    break;
                } else {
                    c2035 = new C15439();
                    c15439 = new C2035();
                    c15586 = new C15586(i);
                    interfaceC10795 = C14403.m34422(c2035, c15439, c15586, false);
                    break;
                }
            case 6:
            case '\n':
                interfaceC10795 = new C5542();
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 36) {
                    interfaceC10795 = new C17557();
                    break;
                }
                break;
            case '\b':
                interfaceC10795 = new C18948();
                break;
            case '\t':
                interfaceC10795 = new C21086();
                break;
            case 11:
                interfaceC10795 = m14166();
                break;
            case '\f':
                if (Build.VERSION.SDK_INT >= 36) {
                    interfaceC10795 = new C16145();
                    break;
                }
                break;
            case 14:
                interfaceC10795 = new C20380();
                break;
            case 15:
                if (!z) {
                    interfaceC10795 = new C15586(i);
                    break;
                } else {
                    interfaceC10795 = C14403.m34422(new C15586(i), new C2035(), new C15439(), false);
                    break;
                }
            case 17:
            case 18:
                interfaceC10795 = new C14175(i);
                break;
            case 19:
                interfaceC10795 = new C9091();
                break;
            case 20:
                if (Build.VERSION.SDK_INT >= 36) {
                    interfaceC10795 = new C9797();
                    break;
                }
                break;
            case 21:
                if (Build.VERSION.SDK_INT >= 36) {
                    interfaceC10795 = new C19654();
                    break;
                }
                break;
            case 22:
                if (Build.VERSION.SDK_INT >= 36) {
                    interfaceC10795 = new C22496();
                    break;
                } else {
                    interfaceC10795 = new C21791();
                    break;
                }
            case 23:
                if (Build.VERSION.SDK_INT >= 36) {
                    interfaceC10795 = new C6974();
                    break;
                }
                break;
        }
        return interfaceC10795 != null ? interfaceC10795 : m14167(upperCase, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14158(String str, boolean z) {
        return m14167(str.toUpperCase(Locale.ENGLISH), z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14157(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                final Character.UnicodeScript forName = Character.UnicodeScript.forName(str);
                return new InterfaceC10795() { // from class: l.֨᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i) {
                        return C4857.m14161(forName, i);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            }
            final EnumC7536 m20221 = EnumC7536.m20221(str);
            return new InterfaceC10795() { // from class: l.۠᩵ܽ
                @Override // l.InterfaceC10795
                /* renamed from: ֫ */
                public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                    return C1622.m5502(this, interfaceC10795);
                }

                @Override // l.InterfaceC10795
                /* renamed from: ۧ */
                public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                    return C1622.m5503(this, interfaceC10795);
                }

                @Override // l.InterfaceC10795
                /* renamed from: ֫ */
                public final boolean mo2465(int i) {
                    return EnumC7536.this == EnumC7536.m20220(i);
                }

                @Override // l.InterfaceC10795
                public final C7679 negate() {
                    C5855 c5855 = C14403.f44164;
                    return C7679.m20568(this);
                }
            };
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m14161(Character.UnicodeScript unicodeScript, int i) {
        return unicodeScript == Character.UnicodeScript.of(i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14162(String str, boolean z) {
        str.getClass();
        final int i = 65;
        final int i2 = 64;
        final int i3 = 57;
        final int i4 = 48;
        final int i5 = 16;
        final int i6 = 1;
        final int i7 = 0;
        final int i8 = 32;
        final int i9 = 14;
        char c = 65535;
        switch (str.hashCode()) {
            case -1709572171:
                if (str.equals("XDigit")) {
                    c = 0;
                    break;
                }
                break;
            case -1447886457:
                if (str.equals("javaDefined")) {
                    c = 1;
                    break;
                }
                break;
            case -1166681342:
                if (str.equals("javaLetterOrDigit")) {
                    c = 2;
                    break;
                }
                break;
            case -1155899042:
                if (str.equals("javaUnicodeIdentifierStart")) {
                    c = 3;
                    break;
                }
                break;
            case -925624088:
                if (str.equals("javaLetter")) {
                    c = 4;
                    break;
                }
                break;
            case -868424661:
                if (str.equals("javaDigit")) {
                    c = 5;
                    break;
                }
                break;
            case -705961562:
                if (str.equals("javaTitleCase")) {
                    c = 6;
                    break;
                }
                break;
            case -453036169:
                if (str.equals("javaUnicodeIdentifierPart")) {
                    c = 7;
                    break;
                }
                break;
            case 67:
                if (str.equals("C")) {
                    c = '\b';
                    break;
                }
                break;
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                if (str.equals("L")) {
                    c = '\t';
                    break;
                }
                break;
            case 77:
                if (str.equals("M")) {
                    c = '\n';
                    break;
                }
                break;
            case 78:
                if (str.equals("N")) {
                    c = 11;
                    break;
                }
                break;
            case 80:
                if (str.equals("P")) {
                    c = '\f';
                    break;
                }
                break;
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                if (str.equals("S")) {
                    c = '\r';
                    break;
                }
                break;
            case 90:
                if (str.equals("Z")) {
                    c = 14;
                    break;
                }
                break;
            case 2176:
                if (str.equals("Cc")) {
                    c = 15;
                    break;
                }
                break;
            case 2179:
                if (str.equals("Cf")) {
                    c = 16;
                    break;
                }
                break;
            case 2187:
                if (str.equals("Cn")) {
                    c = 17;
                    break;
                }
                break;
            case 2188:
                if (str.equals("Co")) {
                    c = 18;
                    break;
                }
                break;
            case 2192:
                if (str.equals("Cs")) {
                    c = 19;
                    break;
                }
                break;
            case 2405:
                if (str.equals("L1")) {
                    c = 20;
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c = 21;
                    break;
                }
                break;
            case 2424:
                if (str.equals("LD")) {
                    c = 22;
                    break;
                }
                break;
            case 2464:
                if (str.equals("Ll")) {
                    c = 23;
                    break;
                }
                break;
            case 2465:
                if (str.equals("Lm")) {
                    c = 24;
                    break;
                }
                break;
            case 2467:
                if (str.equals("Lo")) {
                    c = 25;
                    break;
                }
                break;
            case 2472:
                if (str.equals("Lt")) {
                    c = 26;
                    break;
                }
                break;
            case 2473:
                if (str.equals("Lu")) {
                    c = 27;
                    break;
                }
                break;
            case 2486:
                if (str.equals("Mc")) {
                    c = 28;
                    break;
                }
                break;
            case 2488:
                if (str.equals("Me")) {
                    c = 29;
                    break;
                }
                break;
            case 2497:
                if (str.equals("Mn")) {
                    c = 30;
                    break;
                }
                break;
            case 2518:
                if (str.equals("Nd")) {
                    c = 31;
                    break;
                }
                break;
            case 2526:
                if (str.equals("Nl")) {
                    c = ' ';
                    break;
                }
                break;
            case 2529:
                if (str.equals("No")) {
                    c = '!';
                    break;
                }
                break;
            case 2579:
                if (str.equals("Pc")) {
                    c = '\"';
                    break;
                }
                break;
            case 2580:
                if (str.equals("Pd")) {
                    c = '#';
                    break;
                }
                break;
            case 2581:
                if (str.equals("Pe")) {
                    c = '$';
                    break;
                }
                break;
            case 2582:
                if (str.equals("Pf")) {
                    c = '%';
                    break;
                }
                break;
            case 2585:
                if (str.equals("Pi")) {
                    c = '&';
                    break;
                }
                break;
            case 2591:
                if (str.equals("Po")) {
                    c = '\'';
                    break;
                }
                break;
            case 2595:
                if (str.equals("Ps")) {
                    c = '(';
                    break;
                }
                break;
            case 2672:
                if (str.equals("Sc")) {
                    c = ')';
                    break;
                }
                break;
            case 2680:
                if (str.equals("Sk")) {
                    c = '*';
                    break;
                }
                break;
            case 2682:
                if (str.equals("Sm")) {
                    c = '+';
                    break;
                }
                break;
            case 2684:
                if (str.equals("So")) {
                    c = ',';
                    break;
                }
                break;
            case 2898:
                if (str.equals("Zl")) {
                    c = '-';
                    break;
                }
                break;
            case 2902:
                if (str.equals("Zp")) {
                    c = '.';
                    break;
                }
                break;
            case 2905:
                if (str.equals("Zs")) {
                    c = '/';
                    break;
                }
                break;
            case 96673:
                if (str.equals(ProviderConfigurationPermission.ALL_STR)) {
                    c = '0';
                    break;
                }
                break;
            case 62568241:
                if (str.equals("ASCII")) {
                    c = '1';
                    break;
                }
                break;
            case 63355739:
                if (str.equals("Alnum")) {
                    c = '2';
                    break;
                }
                break;
            case 63357246:
                if (str.equals("Alpha")) {
                    c = '3';
                    break;
                }
                break;
            case 64266548:
                if (str.equals("Blank")) {
                    c = '4';
                    break;
                }
                break;
            case 65268035:
                if (str.equals("Cntrl")) {
                    c = '5';
                    break;
                }
                break;
            case 66029837:
                if (str.equals("Digit")) {
                    c = '6';
                    break;
                }
                break;
            case 69062958:
                if (str.equals("Graph")) {
                    c = '7';
                    break;
                }
                break;
            case 73612001:
                if (str.equals("Lower")) {
                    c = '8';
                    break;
                }
                break;
            case 77382285:
                if (str.equals("Print")) {
                    c = '9';
                    break;
                }
                break;
            case 77476122:
                if (str.equals("Punct")) {
                    c = ':';
                    break;
                }
                break;
            case 80085222:
                if (str.equals("Space")) {
                    c = ';';
                    break;
                }
                break;
            case 81946754:
                if (str.equals("Upper")) {
                    c = '<';
                    break;
                }
                break;
            case 179299983:
                if (str.equals("javaAlphabetic")) {
                    c = a.h;
                    break;
                }
                break;
            case 379124898:
                if (str.equals("javaIdentifierIgnorable")) {
                    c = '>';
                    break;
                }
                break;
            case 434193717:
                if (str.equals("javaJavaIdentifierStart")) {
                    c = '?';
                    break;
                }
                break;
            case 472535264:
                if (str.equals("javaMirrored")) {
                    c = '@';
                    break;
                }
                break;
            case 475906426:
                if (str.equals("javaSpaceChar")) {
                    c = 'A';
                    break;
                }
                break;
            case 550971585:
                if (str.equals("javaIdeographic")) {
                    c = 'B';
                    break;
                }
                break;
            case 914845135:
                if (str.equals("javaLowerCase")) {
                    c = 'C';
                    break;
                }
                break;
            case 1100152026:
                if (str.equals("javaISOControl")) {
                    c = 'D';
                    break;
                }
                break;
            case 1652876016:
                if (str.equals("javaUpperCase")) {
                    c = 'E';
                    break;
                }
                break;
            case 1666718271:
                if (str.equals("javaWhitespace")) {
                    c = 'F';
                    break;
                }
                break;
            case 1953561792:
                if (str.equals("javaJavaIdentifierPart")) {
                    c = 'G';
                    break;
                }
                break;
        }
        final int i10 = 32768;
        final int i11 = 16384;
        final int i12 = 8192;
        final int i13 = 4096;
        final int i14 = 2048;
        final int i15 = 768;
        switch (c) {
            case 0:
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i16) {
                        return i16 < 128 && C22165.m49801(i16, i10);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 1:
                return new C16851();
            case 2:
                return new C21770();
            case 3:
                return new C3425();
            case 4:
                return new C15418();
            case 5:
                return new C20359();
            case 6:
                return z ? new C11208() : new C15586(i6);
            case 7:
                return new C13302();
            case '\b':
                final int i16 = 884737;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i17) {
                        return ((1 << C2164.m7146(i17)) & i16) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '\t':
                final int i17 = 62;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i17) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '\n':
                final int i18 = 448;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i18) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 11:
                final int i19 = 3584;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i19) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '\f':
                final int i20 = 1643118592;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i20) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '\r':
                final int i21 = 503316480;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i21) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 14:
                final int i22 = UMModuleRegister.SHARE_EVENT_VALUE_HIGH;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i22) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 15:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i10) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 16:
                final int i23 = 65536;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i23) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 17:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i6) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 18:
                final int i24 = 262144;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i24) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 19:
                final int i25 = 524288;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i25) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 20:
                final int i26 = 255;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i27) {
                        return i7 <= i27 && i27 <= i26;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 21:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i9) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 22:
                final int i27 = 574;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i27) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 23:
                final int i28 = z ? 14 : 4;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i28) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 24:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i5) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 25:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i8) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 26:
                final int i29 = z ? 14 : 8;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i29) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 27:
                final int i30 = z ? 14 : 2;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i30) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 28:
                final int i31 = 256;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i31) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 29:
                final int i32 = 128;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i32) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 30:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i2) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 31:
                final int i33 = 512;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i33) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ' ':
                final int i34 = 1024;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i34) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '!':
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i14) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '\"':
                final int i35 = 8388608;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i35) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '#':
                final int i36 = 1048576;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i36) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '$':
                final int i37 = 4194304;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i37) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '%':
                final int i38 = 1073741824;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i38) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '&':
                final int i39 = 536870912;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i39) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '\'':
                final int i40 = 16777216;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i40) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '(':
                final int i41 = 2097152;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i41) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ')':
                final int i42 = 67108864;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i42) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '*':
                final int i43 = 134217728;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i43) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '+':
                final int i44 = 33554432;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i44) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ',':
                final int i45 = 268435456;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i45) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i12) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '.':
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i11) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '/':
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i172) {
                        return ((1 << C2164.m7146(i172)) & i13) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '0':
                C5855 c5855 = C14403.f44164;
                return new C14175(i7);
            case '1':
                final int i46 = 127;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i272) {
                        return i7 <= i272 && i272 <= i46;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '2':
                final int i47 = Params.POLY_BYTES;
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i162) {
                        return i162 < 128 && C22165.m49801(i162, i47);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '3':
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i162) {
                        return i162 < 128 && C22165.m49801(i162, i15);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '4':
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i162) {
                        return i162 < 128 && C22165.m49801(i162, i11);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '5':
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i162) {
                        return i162 < 128 && C22165.m49801(i162, i12);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i272) {
                        return i4 <= i272 && i272 <= i3;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                final int i48 = 5888;
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i162) {
                        return i162 < 128 && C22165.m49801(i162, i48);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '8':
                if (z) {
                    return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                        @Override // l.InterfaceC10795
                        /* renamed from: ֫ */
                        public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                            return C21233.m48187(this, interfaceC10795);
                        }

                        @Override // l.InterfaceC10795
                        /* renamed from: ۧ */
                        public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                            return C21233.m48188(this, interfaceC10795);
                        }

                        @Override // l.InterfaceC10795
                        /* renamed from: ֫ */
                        public final boolean mo2465(int i162) {
                            return i162 < 128 && C22165.m49801(i162, i15);
                        }

                        @Override // l.InterfaceC10795
                        public final C7679 negate() {
                            C5855 c58552 = C14403.f44164;
                            return C7679.m20568(this);
                        }
                    };
                }
                final int i49 = 97;
                final int i50 = 122;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i272) {
                        return i49 <= i272 && i272 <= i50;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '9':
                final int i51 = 126;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i272) {
                        return i8 <= i272 && i272 <= i51;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i162) {
                        return i162 < 128 && C22165.m49801(i162, i13);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i162) {
                        return i162 < 128 && C22165.m49801(i162, i14);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '<':
                if (z) {
                    return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
                        @Override // l.InterfaceC10795
                        /* renamed from: ֫ */
                        public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                            return C21233.m48187(this, interfaceC10795);
                        }

                        @Override // l.InterfaceC10795
                        /* renamed from: ۧ */
                        public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                            return C21233.m48188(this, interfaceC10795);
                        }

                        @Override // l.InterfaceC10795
                        /* renamed from: ֫ */
                        public final boolean mo2465(int i162) {
                            return i162 < 128 && C22165.m49801(i162, i15);
                        }

                        @Override // l.InterfaceC10795
                        public final C7679 negate() {
                            C5855 c58552 = C14403.f44164;
                            return C7679.m20568(this);
                        }
                    };
                }
                final int i52 = 90;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C21233.m48187(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C21233.m48188(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* renamed from: ֫ */
                    public final boolean mo2465(int i272) {
                        return i <= i272 && i272 <= i52;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c58552 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case '=':
                return new C18948();
            case '>':
                return new C12597();
            case '?':
                return new C22475();
            case '@':
                return new C23180();
            case 'A':
                return new C10481();
            case 'B':
                return new C7658();
            case 'C':
                return z ? new C8364() : new C2035();
            case 'D':
                return new C11892();
            case 'E':
                return z ? new C14007() : new C15439();
            case 'F':
                return new C6247();
            case 'G':
                return new C4836();
            default:
                return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m14159() {
        return f15354;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m14165() {
        return f15356;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m14163() {
        return f15355;
    }
}
