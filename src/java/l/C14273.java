package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.SkeinEngine;

/* compiled from: K434 */
/* renamed from: l.ܳۘ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14273 {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C11576[][] f42978;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22364 f42979;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6136 f42980;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17013 f42981;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3440 f42982;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC16280 f42983;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f42984;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9378 f42985;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f42987;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC12117 f42989;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8630 f42990;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C22036 f42993;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f42994;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2280 f42997;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f42998;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f42999;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f43000;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23168 f43002;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f43004;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f43006;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2609 f42992 = C2609.m8239();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f43005 = false;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42986 = 0;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f43001 = 0;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f42996 = -1;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f43003 = 0;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ArrayList f42988 = new ArrayList();

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f42995 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18411 f42991 = new C18411(5);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33974(int i, AbstractC12612 abstractC12612, C18837 c18837) {
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C10496 m39953 = c17013.m39953(m34001(abstractC12612));
        AbstractC12117 abstractC12117 = this.f42989;
        c18837.m43511(abstractC12117.mo29524(m39953));
        while (this.f42993.f70640 == EnumC19920.f64384) {
            m34012();
            int i2 = this.f42993.f70641;
            AbstractC12612 m34014 = m34014(1);
            c17013.f52172 = i2;
            c18837.m43511(abstractC12117.mo29524(c17013.m39953(m34001(m34014))));
        }
    }

    public C14273(C15684 c15684, C2280 c2280, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC12117 c22700;
        this.f42997 = c2280;
        m34012();
        C17013 c17013 = c15684.f48345;
        this.f42981 = c17013;
        this.f42979 = c15684.f48346;
        this.f42980 = c15684.f48348;
        EnumC16280 enumC16280 = c15684.f48351;
        this.f42983 = enumC16280;
        this.f43002 = c15684.f48349;
        String m28824 = c15684.f48350.m28824("allowStringFolding");
        this.f42994 = m28824 == null ? true : Boolean.parseBoolean(m28824);
        this.f42984 = z;
        this.f43004 = z4;
        this.f42990 = z ? new C8630(c15684) : null;
        this.f43000 = z2;
        this.f42982 = c17013.m39948();
        if (z3) {
            c22700 = new C17096(this);
        } else {
            c22700 = new C22700(this);
        }
        this.f42989 = c22700;
        this.f42987 = EnumC10637.f32008.m26686(enumC16280);
        this.f42999 = EnumC10637.f32007.m26686(enumC16280);
        this.f42998 = EnumC10637.f31988.m26686(enumC16280);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m33942() {
        this.f42986 = (this.f42986 & 32) | 1;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m33990() {
        this.f42986 = (this.f42986 & 32) | 2;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m34012() {
        C2280 c2280 = this.f42997;
        c2280.m7521();
        this.f42993 = c2280.m7520(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33982(int i, Predicate predicate) {
        return predicate.test(this.f42997.m7520(i + 1).f70640);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33983(int i, Predicate predicate, Predicate predicate2) {
        C2280 c2280 = this.f42997;
        return predicate.test(c2280.m7520(i + 1).f70640) && predicate2.test(c2280.m7520(i + 2).f70640);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33981(boolean z, boolean z2, boolean z3, boolean z4) {
        while (true) {
            switch (C12822.f38471[this.f42993.f70640.ordinal()]) {
                case 1:
                    m34012();
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return;
                case 10:
                    if (!z) {
                        break;
                    } else {
                        return;
                    }
                case 11:
                case 12:
                case 13:
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
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    if (!z2) {
                        break;
                    } else {
                        return;
                    }
                case 31:
                case 32:
                    if (!z3) {
                        break;
                    } else {
                        return;
                    }
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!z4) {
                        break;
                    } else {
                        return;
                    }
                case 51:
                    if (!z4) {
                        break;
                    } else {
                        return;
                    }
            }
            m34012();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3440 m33997(int i, C12281 c12281) {
        return m33952(i, C2609.m8239(), c12281);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3440 m33952(int i, C2609 c2609, C12281 c12281) {
        AbstractC5144 abstractC5144;
        m34004(i);
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C3440 m39949 = c17013.m39949(c2609);
        m33975(m39949, c12281);
        if (c2609 != null && (abstractC5144 = (AbstractC5144) c2609.last()) != null) {
            m33976(abstractC5144, i);
        }
        return (C3440) this.f42989.mo29524(m39949);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33973(int i, C12281 c12281) {
        m33975(new C7342(i), c12281);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33975(InterfaceC3109 interfaceC3109, C12281 c12281) {
        int mo9480 = interfaceC3109.mo9480();
        C2280 c2280 = this.f42997;
        if (mo9480 > c2280.m7517() || mo9480 == -1) {
            EnumC19920 enumC19920 = this.f42993.f70640;
            EnumC19920 enumC199202 = EnumC19920.f64381;
            C22364 c22364 = this.f42979;
            if (enumC19920 == enumC199202) {
                c22364.m7280(EnumC20043.SYNTAX, interfaceC3109, C6241.f19217);
            } else {
                c22364.m7280(EnumC20043.SYNTAX, interfaceC3109, c12281);
            }
        }
        c2280.m7518(mo9480);
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        if (i == this.f42996 && c22036.f70640 != EnumC19920.f64381) {
            int i2 = this.f43003;
            this.f43003 = i2 + 1;
            C12171.m29642(i2 < 50);
        } else {
            this.f43003 = 0;
            this.f42996 = i;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33979(EnumC19920 enumC19920) {
        m33980(enumC19920, new C13216(5));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33980(EnumC19920 enumC19920, Function function) {
        C22036 c22036 = this.f42993;
        if (c22036.f70640 == enumC19920) {
            m34012();
        } else {
            m34004(c22036.f70641);
            m33973(this.f42997.m7523().f70639, (C12281) function.apply(enumC19920));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3440 m33951(int i) {
        m34004(i);
        if ((this.f42986 & 1) != 0) {
            return m33997(i, C6241.f19177);
        }
        return m33997(i, C6241.f19205);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C3440 m33994() {
        return m33951(this.f42993.f70641);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33977(AbstractC5144 abstractC5144, InterfaceC5102 interfaceC5102) {
        if (!this.f42984 || interfaceC5102 == null) {
            return;
        }
        this.f42990.m22392(abstractC5144, interfaceC5102);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33976(AbstractC5144 abstractC5144, int i) {
        this.f42989.mo6595(abstractC5144, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m33929(AbstractC12612 abstractC12612, C2609 c2609, boolean z) {
        EnumC18550 enumC18550;
        EnumC18550 enumC185502;
        AbstractC12117 abstractC12117 = this.f42989;
        int mo6593 = abstractC12117.mo6593(abstractC12612);
        C23901 c23901 = null;
        AbstractC12612 abstractC126122 = abstractC12612;
        while (C7260.m19465(abstractC126122).m14709(EnumC18550.f57518)) {
            c23901 = (C23901) C7260.m19465(abstractC126122);
            abstractC126122 = c23901.f77274;
        }
        C17013 c17013 = this.f42981;
        if (z) {
            c17013.f52172 = this.f42993.f70641;
            abstractC126122 = (AbstractC12612) abstractC12117.mo29523(c17013.m39969(abstractC126122));
            mo6593 = abstractC12117.mo6593(abstractC126122);
        }
        if (c2609.m8249()) {
            AbstractC12612 abstractC126123 = abstractC126122;
            AbstractC12612 abstractC126124 = abstractC126123;
            while (true) {
                AbstractC12612 m19465 = C7260.m19465(abstractC126123);
                enumC18550 = EnumC18550.f57581;
                if (!m19465.m14709(enumC18550)) {
                    AbstractC12612 m194652 = C7260.m19465(abstractC126123);
                    enumC185502 = EnumC18550.f57521;
                    if (!m194652.m14709(enumC185502)) {
                        break;
                    }
                }
                while (C7260.m19465(abstractC126123).m14709(EnumC18550.f57581)) {
                    abstractC126124 = abstractC126123;
                    abstractC126123 = ((C6262) C7260.m19465(abstractC126123)).f19397;
                }
                while (C7260.m19465(abstractC126123).m14709(EnumC18550.f57521)) {
                    abstractC126124 = abstractC126123;
                    abstractC126123 = ((C16432) C7260.m19465(abstractC126123)).f50542;
                }
            }
            c17013.f52172 = ((C17551) c2609.f8240).f16085;
            C18257 m39937 = c17013.m39937(abstractC126123, c2609);
            if (C7260.m19465(abstractC126124).m14709(enumC185502)) {
                ((C16432) C7260.m19465(abstractC126124)).f50542 = m39937;
            } else if (C7260.m19465(abstractC126124).m14709(enumC18550)) {
                ((C6262) C7260.m19465(abstractC126124)).f19397 = m39937;
            } else {
                abstractC126122 = m39937;
            }
        }
        if (c23901 == null) {
            return abstractC126122;
        }
        c23901.f77274 = abstractC126122;
        m33976(abstractC12612, mo6593);
        return abstractC12612;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m33958(boolean z) {
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        int i = c22036.f70641;
        EnumC19920 enumC199202 = EnumC19920.f64412;
        if (enumC19920 == enumC199202) {
            AbstractC10370 mo3194 = c22036.mo3194();
            m34012();
            return mo3194;
        }
        EnumC19920 enumC199203 = EnumC19920.f64394;
        C6136 c6136 = this.f42980;
        C22364 c22364 = this.f42979;
        if (enumC19920 == enumC199203) {
            c22364.m7279(EnumC20043.SYNTAX, i, C6241.f19149);
            m34012();
            return c6136.f18855;
        }
        if (enumC19920 == EnumC19920.f64388) {
            c22364.m7279(EnumC20043.SYNTAX, i, C6241.f19253);
            m34012();
            return c6136.f18855;
        }
        if (enumC19920 == EnumC19920.f64383) {
            if (this.f43006) {
                m33978(EnumC10637.f31996);
                AbstractC10370 mo31942 = this.f42993.mo3194();
                m34012();
                return mo31942;
            }
            c22364.m7279(EnumC20043.SYNTAX, i, C6241.f19159);
            m34012();
            return c6136.f18855;
        }
        if (enumC19920 == EnumC19920.f64437) {
            if (EnumC10637.f31992.m26686(this.f42983)) {
                c22364.m7268(this.f42993.f70641, C14001.f42351);
            } else {
                c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19262);
            }
            AbstractC10370 mo31943 = this.f42993.mo3194();
            m34012();
            return mo31943;
        }
        m33979(enumC199202);
        if (z && this.f42993.f70640 == EnumC19920.f64408) {
            m34012();
            return c6136.f18894;
        }
        return c6136.f18855;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34025(boolean z) {
        int i = this.f42993.f70641;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C7673 m39951 = c17013.m39951(m33958(false));
        AbstractC12117 abstractC12117 = this.f42989;
        AbstractC12612 abstractC12612 = (AbstractC12612) abstractC12117.mo29524(m39951);
        while (true) {
            C22036 c22036 = this.f42993;
            if (c22036.f70640 != EnumC19920.f64405) {
                return abstractC12612;
            }
            int i2 = c22036.f70641;
            m34012();
            C2609 m33949 = z ? m33949(EnumC18550.f57483) : null;
            c17013.f52172 = i2;
            abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c17013.m39912(abstractC12612, m33958(false)));
            if (m33949 != null && m33949.m8249()) {
                c17013.f52172 = ((C17551) m33949.f8240).f16085;
                abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC12612, m33949));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x022b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC12612 m33963(l.AbstractC10370 r27, int r28) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m33963(l.ۤܶ۠, int):l.۫᩵۠");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33930(String str) {
        char c;
        char[] charArray = str.toCharArray();
        int i = (charArray.length <= 1 || Character.toLowerCase(charArray[1]) != 'x') ? 10 : 16;
        int i2 = i == 16 ? 2 : 0;
        while (i2 < charArray.length && ((c = charArray[i2]) == '0' || c == '.')) {
            i2++;
        }
        return i2 >= charArray.length || Character.digit(charArray[i2], i) <= 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m33944(AbstractC10370 abstractC10370) {
        String mo35462 = this.f42993.mo35462();
        if (abstractC10370.isEmpty()) {
            return mo35462;
        }
        return ((Object) abstractC10370) + mo35462;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21932 m33970(int i, C2176 c2176, AbstractC12612 abstractC12612, boolean z) {
        AbstractC21932 abstractC21932;
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC199202 = EnumC19920.f64470;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (enumC19920 == enumC199202 && abstractC12612 == null) {
            int i2 = c22036.f70641;
            m33979(enumC199202);
            AbstractC21932 m33970 = m33970(this.f42993.f70641, (C2176) null, (AbstractC12612) null, false);
            m33979(EnumC19920.f64413);
            c17013.f52172 = i2;
            C21227 c21227 = new C21227();
            c21227.f68420 = m33970;
            c21227.f16085 = c17013.f52172;
            abstractC21932 = (AbstractC21932) abstractC12117.mo29524(c21227);
        } else {
            if (c2176 == null) {
                c2176 = m33945(0L);
            }
            if (abstractC12612 == null) {
                abstractC12612 = m34014(34);
            }
            c17013.f52172 = this.f42993.f70641;
            C9378 c9378 = (C9378) abstractC12117.mo29524(c17013.m39920(c2176, m33958(false), abstractC12612, (AbstractC12612) null));
            c17013.f52172 = i;
            C16139 c16139 = new C16139();
            c16139.f49721 = c9378;
            c16139.f16085 = c17013.f52172;
            abstractC21932 = (AbstractC21932) abstractC12117.mo29524(c16139);
        }
        if (z || this.f42993.f70640 != EnumC19920.f64430) {
            return abstractC21932;
        }
        m33978(EnumC10637.f31989);
        m34012();
        AbstractC12612 m34014 = m34014(33);
        c17013.f52172 = i;
        C14022 c14022 = new C14022();
        c14022.f42404 = abstractC21932;
        c14022.f42403 = m34014;
        c14022.f16085 = c17013.f52172;
        return c14022;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34034(boolean z) {
        AbstractC12612 m34014 = m34014(2);
        AbstractC10370 m33957 = m33957(m34014, !z);
        if (m33957 != null && (!z || m33957 != this.f42980.f18888)) {
            int i = m34014.f16085;
            C12281 c12281 = C6241.f19132;
            m33997(i, new C12281("compiler", "restricted.type.not.allowed.here", m33957));
        }
        return m34014;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34014(int i) {
        int i2 = this.f42986;
        this.f42986 = i;
        AbstractC12612 m33992 = m33992();
        this.f43001 = this.f42986;
        this.f42986 = i2;
        return m33992;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33992() {
        AbstractC12612 m34011 = m34011();
        if ((this.f42986 & 1) == 0) {
            return m34011;
        }
        EnumC19920 enumC19920 = this.f42993.f70640;
        return (enumC19920 == EnumC19920.f64431 || (EnumC19920.f64375.compareTo(enumC19920) <= 0 && this.f42993.f70640.compareTo(EnumC19920.f64467) <= 0)) ? m34010(m34011) : m34011;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34010(AbstractC12612 abstractC12612) {
        int i = C12822.f38471[this.f42993.f70640.ordinal()];
        C17013 c17013 = this.f42981;
        switch (i) {
            case 61:
                int i2 = this.f42993.f70641;
                m34012();
                m33942();
                AbstractC12612 m33992 = m33992();
                c17013.f52172 = i2;
                return (AbstractC12612) this.f42989.mo29524(c17013.m39941(abstractC12612, m33992));
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                C22036 c22036 = this.f42993;
                int i3 = c22036.f70641;
                EnumC19920 enumC19920 = c22036.f70640;
                m34012();
                m33942();
                AbstractC12612 m339922 = m33992();
                c17013.f52172 = i3;
                return c17013.m39924(m33938(enumC19920), (AbstractC5144) abstractC12612, (AbstractC5144) m339922);
            default:
                return abstractC12612;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34023(AbstractC12612 abstractC12612) {
        C22036 c22036 = this.f42993;
        if (c22036.f70640 != EnumC19920.f64440) {
            return abstractC12612;
        }
        int i = c22036.f70641;
        m34012();
        AbstractC12612 m33992 = m33992();
        m33979(EnumC19920.f64377);
        AbstractC12612 m34011 = m34011();
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        return c17013.m39916(abstractC12612, m33992, m34011);
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34011() {
        AbstractC12612 m34030 = m34030();
        if ((this.f42986 & 1) != 0 && m33939(this.f42993.f70640) >= 4) {
            m33942();
            m34030 = m34020(m34030);
        }
        if ((this.f42986 & 1) == 0 || this.f42993.f70640 != EnumC19920.f64440) {
            return m34030;
        }
        m33942();
        return m34023(m34030);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33984(C18837 c18837, C18837 c188372) {
        if (c18837.isEmpty()) {
            return false;
        }
        if (c18837.size() == 1) {
            c188372.m43515((AbstractC12612) c18837.first());
            return false;
        }
        C23342 c23342 = (C23342) c18837.first();
        c23342.getClass();
        int m19455 = C7260.m19455(c23342);
        C17013 c17013 = this.f42981;
        c17013.f52172 = m19455;
        C23342 m39944 = c17013.m39944(EnumC9454.CLASS, C5378.stream(c18837).map(new C7915(6)).collect(C22976.joining()));
        C23342 c233422 = (C23342) c18837.last();
        c233422.getClass();
        m33976(m39944, C7260.m19431(c233422, this.f42989));
        c188372.m43515(m39944);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0.f74996 == l.EnumC9454.CLASS) goto L8;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m33931(l.AbstractC12612 r4, l.C18837 r5, l.C18837 r6, boolean r7) {
        /*
            r3 = this;
            l.ᩴۚ۠ r0 = l.EnumC18550.f57580
            boolean r0 = r4.m14709(r0)
            if (r0 == 0) goto L12
            r0 = r4
            l.᩻֡۠ r0 = (l.C23342) r0
            l.ۢ۠֨ r1 = r0.f74996
            l.ۢ۠֨ r2 = l.EnumC9454.CLASS
            if (r1 != r2) goto L12
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L24
            r5.m43515(r0)
            if (r7 == 0) goto L22
            boolean r4 = r3.m33984(r5, r6)
            if (r4 == 0) goto L22
            r4 = 1
            return r4
        L22:
            r4 = 0
            return r4
        L24:
            boolean r7 = r3.m33984(r5, r6)
            r5.clear()
            r6.m43515(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m33931(l.۫᩵۠, l.ᩴܶ۠, l.ᩴܶ۠, boolean):boolean");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34020(AbstractC12612 abstractC12612) {
        C17013 c17013;
        ArrayList arrayList;
        AbstractC12612[] abstractC12612Arr;
        AbstractC12612 m34034;
        C22036 c22036;
        AbstractC21932 m33970;
        ArrayList arrayList2 = this.f42988;
        boolean z = true;
        AbstractC12612[] abstractC12612Arr2 = arrayList2.isEmpty() ? new AbstractC12612[11] : (AbstractC12612[]) C4248.m12790(arrayList2, 1);
        ArrayList arrayList3 = this.f42995;
        C22036[] c22036Arr = arrayList3.isEmpty() ? new C22036[11] : (C22036[]) C4248.m12790(arrayList3, 1);
        boolean z2 = false;
        abstractC12612Arr2[0] = abstractC12612;
        int i = this.f42993.f70641;
        C22036 c220362 = C4397.f14081;
        int i2 = 0;
        while (true) {
            int m33939 = m33939(this.f42993.f70640);
            c17013 = this.f42981;
            if (m33939 < 4) {
                break;
            }
            c22036Arr[i2] = c220362;
            C22036 c220363 = this.f42993;
            if (c220363.f70640 == EnumC19920.f64385) {
                int i3 = c220363.f70641;
                m34012();
                C22036 c220364 = this.f42993;
                EnumC19920 enumC19920 = c220364.f70640;
                int i4 = c220364.f70641;
                if (enumC19920 == EnumC19920.f64470) {
                    m33972(i4, EnumC10637.f31989);
                    m33970 = m33970(this.f42993.f70641, (C2176) null, (AbstractC12612) null, z);
                } else {
                    C2176 m33945 = m33945(0L);
                    int i5 = this.f42993.f70641;
                    m34034 = m34034(z2);
                    C22036 c220365 = this.f42993;
                    if (c220365.f70640 == EnumC19920.f64412) {
                        m33972(c220365.f70641, EnumC10637.f31990);
                        m33970 = m33970(i4, m33945, m34034, true);
                    } else {
                        long j = m33945.f7169 & (-131073);
                        if (j != 0) {
                            arrayList = arrayList2;
                            abstractC12612Arr = abstractC12612Arr2;
                            long j2 = (-j) & j;
                            EnumC20043 enumC20043 = EnumC20043.SYNTAX;
                            EnumSet m45150 = C19642.m45150(j2);
                            C12281 c12281 = C6241.f19132;
                            c22036 = c220362;
                            this.f42979.m7279(enumC20043, i5, new C12281("compiler", "mod.not.allowed.here", m45150));
                        } else {
                            arrayList = arrayList2;
                            abstractC12612Arr = abstractC12612Arr2;
                            c22036 = c220362;
                        }
                        if (m33945.f7168.m8249()) {
                            m33972(((C17551) m33945.f7168.f8240).f16085, EnumC10637.f31996);
                            m34034 = m33929(m34034, m33945.f7168.m8243(new Function() { // from class: l.ۗۖ۠
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public /* synthetic */ Function mo22274andThen(Function function) {
                                    return C20696.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C20696.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    C17551 c17551 = (C17551) obj;
                                    C14273 c14273 = C14273.this;
                                    C17013 c170132 = c14273.f42981;
                                    c170132.f52172 = c17551.f16085;
                                    C17551 m39966 = c170132.m39966(c17551.f53650, c17551.f53653);
                                    c14273.f42989.mo6594(c17551, m39966);
                                    return m39966;
                                }
                            }), false);
                        }
                        c17013.f52172 = i3;
                        AbstractC12612 abstractC126122 = abstractC12612Arr[i2];
                        C16286 c16286 = new C16286();
                        c16286.f50075 = abstractC126122;
                        c16286.f50076 = m34034;
                        c16286.f16085 = c17013.f52172;
                        abstractC12612Arr[i2] = c16286;
                        c220362 = c22036;
                    }
                }
                arrayList = arrayList2;
                abstractC12612Arr = abstractC12612Arr2;
                m34034 = m33970;
                c22036 = c220362;
                c17013.f52172 = i3;
                AbstractC12612 abstractC1261222 = abstractC12612Arr[i2];
                C16286 c162862 = new C16286();
                c162862.f50075 = abstractC1261222;
                c162862.f50076 = m34034;
                c162862.f16085 = c17013.f52172;
                abstractC12612Arr[i2] = c162862;
                c220362 = c22036;
            } else {
                arrayList = arrayList2;
                abstractC12612Arr = abstractC12612Arr2;
                m34012();
                i2++;
                abstractC12612Arr[i2] = m34030();
                c220362 = c220363;
            }
            while (i2 > 0 && m33939(c220362.f70640) >= m33939(this.f42993.f70640)) {
                int i6 = i2 - 1;
                c17013.f52172 = c220362.f70641;
                abstractC12612Arr[i6] = c17013.m39919(m33938(c220362.f70640), abstractC12612Arr[i6], abstractC12612Arr[i2]);
                i2--;
                c220362 = c22036Arr[i2];
            }
            z = true;
            z2 = false;
            arrayList2 = arrayList;
            abstractC12612Arr2 = abstractC12612Arr;
        }
        ArrayList arrayList4 = arrayList2;
        AbstractC12612[] abstractC12612Arr3 = abstractC12612Arr2;
        C12171.m29642(i2 == 0);
        AbstractC12612 abstractC126123 = abstractC12612Arr3[0];
        if (abstractC126123.m14709(EnumC18550.f57545) && this.f42994) {
            C18837 c18837 = new C18837();
            C18837 c188372 = new C18837();
            boolean z3 = false;
            AbstractC12612 abstractC126124 = abstractC126123;
            while (abstractC126124.m14709(EnumC18550.f57545)) {
                C9085 c9085 = (C9085) abstractC126124;
                z3 |= m33931(c9085.f27532, c188372, c18837, false);
                abstractC126124 = c9085.f27533;
            }
            if (m33931(abstractC126124, c188372, c18837, true) | z3) {
                C2609 m43517 = c18837.m43517();
                AbstractC12612 abstractC126125 = (AbstractC12612) m43517.f8240;
                Iterator it = m43517.f8241.iterator();
                while (it.hasNext()) {
                    AbstractC12612 abstractC126126 = (AbstractC12612) it.next();
                    abstractC126126.getClass();
                    c17013.f52172 = C7260.m19455(abstractC126126);
                    abstractC126125 = c17013.m39919(m33938(EnumC19920.f64403), abstractC126125, abstractC126126);
                    m33976(abstractC126125, this.f42989.mo6593(abstractC126126));
                }
                abstractC126123 = abstractC126125;
            }
        }
        arrayList4.add(abstractC12612Arr3);
        arrayList3.add(c22036Arr);
        return abstractC126123;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x012d, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x040d, code lost:
    
        r2 = l.EnumC16390.EXPLICIT_LAMBDA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0411, code lost:
    
        r2 = l.EnumC16390.CAST;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03b3, code lost:
    
        r2 = l.EnumC16390.CAST;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0481, code lost:
    
        r2 = l.EnumC16390.EXPLICIT_LAMBDA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0815, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0799, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0125, code lost:
    
        if ((r17.f42986 & 16) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0127, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:476:0x08a6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0670  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0184 -> B:76:0x0127). Please report as a decompilation issue!!! */
    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC12612 m34030() {
        /*
            Method dump skipped, instructions count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m34030():l.۫᩵۠");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0157, code lost:
    
        if (r2.isEmpty() != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015b, code lost:
    
        if (r8.f43005 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x015d, code lost:
    
        r8.f42992 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x016a, code lost:
    
        return m33951(((l.C17551) r2.f8240).f16085);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x016b, code lost:
    
        r10 = r8.f42993.f70640;
        r0 = l.EnumC19920.f64420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0171, code lost:
    
        if (r10 == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0175, code lost:
    
        if (r10 != l.EnumC19920.f64471) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a2, code lost:
    
        return (l.AbstractC12612) r7.mo29524(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017a, code lost:
    
        if ((r8.f42986 & 1) == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017c, code lost:
    
        m33942();
        r10 = r8.f42993;
        r6.f52172 = r10.f70641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0187, code lost:
    
        if (r10.f70640 != r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0189, code lost:
    
        r10 = l.EnumC18550.f57499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018e, code lost:
    
        r9 = (l.AbstractC12612) r7.mo29523(r6.m39913(r10, r9));
        m34012();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018c, code lost:
    
        r10 = l.EnumC18550.f57567;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC12612 m34024(l.AbstractC12612 r9, l.C2609 r10) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m34024(l.۫᩵۠, l.ۖܶ۠):l.۫᩵۠");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m33940(int i) {
        int i2 = i + 1;
        while (m33982(i2, EnumC19920.f64405)) {
            i2 += 2;
        }
        if (m33982(i2, EnumC19920.f64470)) {
            i2++;
            int i3 = 0;
            while (true) {
                int i4 = C12822.f38471[this.f42997.m7520(i2).f70640.ordinal()];
                if (i4 == 6) {
                    break;
                }
                if (i4 == 74) {
                    i3++;
                } else if (i4 == 85 && i3 - 1 == 0) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33962(int i, boolean z, boolean z2) {
        C2609 m43517;
        C22364 c22364;
        char c;
        AbstractC10370 m33957;
        C12281 c12281;
        C17013 c17013 = this.f42981;
        boolean z3 = false;
        if (z2) {
            m43517 = m33996(true, false);
        } else {
            if (z) {
                m33979(EnumC19920.f64470);
            }
            C18837 c18837 = new C18837();
            C22036 c22036 = this.f42993;
            EnumC19920 enumC19920 = c22036.f70640;
            if (enumC19920 != EnumC19920.f64413 && enumC19920 != EnumC19920.f64414) {
                c17013.f52172 = c22036.f70641;
                c18837.m43511(m33955(c17013.m39899(8589934592L), (AbstractC12612) null, true, false));
                while (this.f42993.f70640 == EnumC19920.f64384) {
                    m34012();
                    c17013.f52172 = this.f42993.f70641;
                    c18837.m43511(m33955(c17013.m39899(8589934592L), (AbstractC12612) null, true, false));
                }
            }
            if (z) {
                m33979(EnumC19920.f64413);
            }
            m43517 = c18837.m43517();
        }
        if (z2) {
            C1574 c1574 = new C1574(this);
            Iterator it = m43517.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c22364 = this.f42979;
                if (!hasNext) {
                    c = 0;
                    break;
                }
                C9378 c9378 = (C9378) it.next();
                AbstractC12612 abstractC12612 = c9378.f28488;
                if (abstractC12612 == null || (m33957 = m33957(abstractC12612, z3)) == null || !c9378.f28488.m14709(EnumC18550.f57518)) {
                    c = 0;
                } else {
                    EnumC20043 enumC20043 = EnumC20043.SYNTAX;
                    int i2 = c9378.f16085;
                    c = 0;
                    if (EnumC10637.f31985.m26686(this.f42983)) {
                        C12281 c122812 = C6241.f19132;
                        c12281 = new C12281("compiler", "restricted.type.not.allowed.array", m33957);
                    } else {
                        C12281 c122813 = C6241.f19132;
                        c12281 = new C12281("compiler", "restricted.type.not.allowed.here", m33957);
                    }
                    c22364.m7279(enumC20043, i2, c12281);
                }
                c1574.m5391(c9378);
                if (c1574.f5578 == EnumC10747.ERROR) {
                    break;
                }
                z3 = false;
            }
            C11576 c11576 = c1574.f5577;
            if (c11576 != null) {
                EnumC20043 enumC200432 = EnumC20043.SYNTAX;
                C12281 c122814 = C6241.f19132;
                Object[] objArr = new Object[1];
                objArr[c] = c11576;
                c22364.m7279(enumC200432, i, new C12281("compiler", "invalid.lambda.parameter.declaration", objArr));
            }
            Iterator it2 = m43517.iterator();
            while (it2.hasNext()) {
                C9378 c93782 = (C9378) it2.next();
                AbstractC12612 abstractC126122 = c93782.f28488;
                if (abstractC126122 != null && m33957(abstractC126122, true) != null) {
                    m33972(c93782.f16085, EnumC10637.f31985);
                    c93782.f28485 = C7260.m19455(c93782.f28488);
                    c93782.f28488 = null;
                }
            }
        }
        m33978(EnumC10637.f32004);
        m33979(EnumC19920.f64414);
        C22036 c220362 = this.f42993;
        EnumC19920 enumC199202 = c220362.f70640;
        EnumC19920 enumC199203 = EnumC19920.f64392;
        AbstractC12117 abstractC12117 = this.f42989;
        if (enumC199202 == enumC199203) {
            C2735 m33950 = m33950(c220362.f70641, 0L);
            c17013.f52172 = i;
            return (AbstractC12612) abstractC12117.mo29524(c17013.m39955(m33950, m43517));
        }
        AbstractC12612 m34014 = m34014(1);
        c17013.f52172 = i;
        return (AbstractC12612) abstractC12117.mo29524(c17013.m39955((AbstractC5144) m34014, m43517));
    }

    static {
        C11576 c11576 = C11886.f35467;
        C11576 c115762 = C11886.f35464;
        C11576 c115763 = C11886.f35466;
        f42978 = new C11576[][]{new C11576[]{null, c11576, c115762}, new C11576[]{c11576, null, c115763}, new C11576[]{c115762, c115763, null}};
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34016(AbstractC12612 abstractC12612, C2609 c2609) {
        m34012();
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        if (enumC19920 == EnumC19920.f64470 || c2609 != null) {
            return m33965(abstractC12612, c2609);
        }
        EnumC19920 enumC199202 = EnumC19920.f64444;
        if (enumC19920 == enumC199202) {
            if (c2609 != null) {
                return m33994();
            }
            m33979(enumC199202);
            return m34015(abstractC12612);
        }
        int i = c22036.f70641;
        m33979(EnumC19920.f64405);
        C2609 m34008 = this.f42993.f70640 == EnumC19920.f64473 ? m34008(false) : null;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        return m34002((AbstractC12612) this.f42989.mo29524(c17013.m39912(abstractC12612, m33958(false))), m34008);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2882 m34019() {
        EnumC9454 enumC9454;
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        switch (C12822.f38471[c22036.f70640.ordinal()]) {
            case 22:
                enumC9454 = EnumC9454.BYTE;
                break;
            case 23:
                enumC9454 = EnumC9454.SHORT;
                break;
            case 24:
                enumC9454 = EnumC9454.CHAR;
                break;
            case 25:
                enumC9454 = EnumC9454.INT;
                break;
            case 26:
                enumC9454 = EnumC9454.LONG;
                break;
            case 27:
                enumC9454 = EnumC9454.FLOAT;
                break;
            case 28:
                enumC9454 = EnumC9454.DOUBLE;
                break;
            case 29:
                enumC9454 = EnumC9454.BOOLEAN;
                break;
            default:
                enumC9454 = EnumC9454.NONE;
                break;
        }
        C2882 c2882 = (C2882) this.f42989.mo29523(c17013.m39903(enumC9454));
        m34012();
        return c2882;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34002(AbstractC12612 abstractC12612, C2609 c2609) {
        if (((this.f42986 & 1) == 0 || this.f42993.f70640 != EnumC19920.f64470) && c2609 == null) {
            return abstractC12612;
        }
        m33942();
        return m33965(abstractC12612, c2609);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m34013() {
        C18837 c18837 = new C18837();
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC199202 = EnumC19920.f64470;
        if (enumC19920 == enumC199202) {
            m34012();
            if (this.f42993.f70640 != EnumC19920.f64413) {
                c18837.m43511(m34014(1));
                while (this.f42993.f70640 == EnumC19920.f64384) {
                    m34012();
                    c18837.m43511(m34014(1));
                }
            }
            m33979(EnumC19920.f64413);
        } else {
            m33997(c22036.f70641, C6241.m17188(enumC199202));
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33965(AbstractC12612 abstractC12612, C2609 c2609) {
        int i = this.f42993.f70641;
        C2609 m34013 = m34013();
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        AbstractC5144 m39929 = c17013.m39929(abstractC12612, c2609, m34013);
        if (abstractC12612.m14709(EnumC18550.f57566)) {
            C7673 c7673 = (C7673) abstractC12612;
            int i2 = c7673.f16085;
            if (c7673.f23696 == this.f42980.f18799) {
                boolean z = this.f42987;
                C22364 c22364 = this.f42979;
                if (z) {
                    c22364.m7280(EnumC20043.SYNTAX, abstractC12612, C6241.f19237);
                    m39929 = c17013.m39949(C2609.of((Object) m39929));
                } else {
                    c22364.m7268(i2, C14001.f42352);
                }
            }
        }
        return (AbstractC12612) this.f42989.mo29524(m39929);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34033(AbstractC12612 abstractC12612) {
        if (this.f42993.f70640 != EnumC19920.f64473) {
            return abstractC12612;
        }
        int i = this.f42986;
        if ((i & 2) == 0 || (i & 4) != 0) {
            return abstractC12612;
        }
        m33990();
        return m34003(abstractC12612, false);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m34022(int i) {
        if (this.f42993.f70640 != EnumC19920.f64473) {
            return null;
        }
        int i2 = this.f42986;
        if ((i2 & i) == 0 || (i2 & 4) != 0) {
            m33994();
        }
        this.f42986 = i;
        return m34008(false);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2609 m34008(boolean z) {
        EnumC19920 enumC19920;
        C22036 c22036 = this.f42993;
        EnumC19920 enumC199202 = c22036.f70640;
        EnumC19920 enumC199203 = EnumC19920.f64473;
        if (enumC199202 == enumC199203) {
            m34012();
            if (this.f42993.f70640 == EnumC19920.f64454 && z) {
                m33978(EnumC10637.f31994);
                this.f42986 |= 16;
                m34012();
                return C2609.m8239();
            }
            C18837 c18837 = new C18837();
            c18837.m43511((this.f42986 & 1) == 0 ? m34031() : m34017(false));
            while (true) {
                enumC19920 = this.f42993.f70640;
                if (enumC19920 != EnumC19920.f64384) {
                    break;
                }
                m34012();
                c18837.m43511((this.f42986 & 1) == 0 ? m34031() : m34017(false));
            }
            int i = C12822.f38471[enumC19920.ordinal()];
            if (i != 71 && i != 72 && i != 93) {
                switch (i) {
                    case 89:
                    case 90:
                        break;
                    case 91:
                        m34012();
                        break;
                    default:
                        c18837.m43511(m33997(this.f42993.f70641, C6241.m17188(EnumC19920.f64454)));
                        break;
                }
                return c18837.m43517();
            }
            this.f42993 = this.f42997.m7522();
            return c18837.m43517();
        }
        return C2609.of((Object) m33997(c22036.f70641, C6241.m17188(enumC199203)));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16432 m34003(AbstractC12612 abstractC12612, boolean z) {
        int i = this.f42993.f70641;
        C2609 m34008 = m34008(z);
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        return (C16432) this.f42989.mo29524(c17013.m39960(abstractC12612, m34008));
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m33934(AbstractC12612 abstractC12612) {
        return m33941(abstractC12612, C2609.m8239());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m33936(int i, AbstractC12612 abstractC12612, C2609 c2609) {
        m33979(EnumC19920.f64400);
        AbstractC12612 m33934 = m33934(abstractC12612);
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C23901 m39969 = c17013.m39969(m33934);
        AbstractC12117 abstractC12117 = this.f42989;
        AbstractC12612 abstractC126122 = (AbstractC12612) abstractC12117.mo29524(m39969);
        if (!c2609.m8249()) {
            return abstractC126122;
        }
        c17013.f52172 = i;
        return (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC126122, c2609));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33964(AbstractC12612 abstractC12612) {
        AbstractC10370 abstractC10370;
        int i = this.f42986;
        if ((i & 1) == 0 || this.f42993.f70640 != EnumC19920.f64405) {
            if ((i & 2) != 0) {
                if (this.f42993.f70640 != EnumC19920.f64444) {
                    m33990();
                    return abstractC12612;
                }
            } else {
                C22036 c22036 = this.f42993;
                if (c22036.f70640 != EnumC19920.f64444) {
                    m33997(c22036.f70641, C6241.f19209);
                }
            }
            return abstractC12612;
        }
        m33942();
        int i2 = this.f42993.f70641;
        m34012();
        m33979(EnumC19920.f64408);
        C22036 c220362 = this.f42993;
        int i3 = c220362.f70641;
        AbstractC12117 abstractC12117 = this.f42989;
        int i4 = abstractC12117.f36194;
        C17013 c17013 = this.f42981;
        C6136 c6136 = this.f42980;
        if (i3 == i4) {
            if (this.f42991.test(c220362.f70640)) {
                abstractC10370 = this.f42993.mo3194();
                m34012();
            } else {
                abstractC10370 = c6136.f18855;
            }
            c17013.f52172 = i2;
            return c17013.m39949(C2609.of((Object) abstractC12117.mo29524(c17013.m39912(abstractC12612, abstractC10370))));
        }
        EnumC18550 mo989 = abstractC12612.mo989();
        if ((mo989 == EnumC18550.f57518 && C7260.m19460((AbstractC5144) abstractC12612)) || mo989 == EnumC18550.f57497) {
            m33997(this.f42993.f70641, C6241.f19284);
        }
        c17013.f52172 = i2;
        return (AbstractC12612) abstractC12117.mo29524(c17013.m39912(abstractC12612, c6136.f18894));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34015(AbstractC12612 abstractC12612) {
        EnumC11091 enumC11091;
        AbstractC10370 m33958;
        m33978(EnumC10637.f31986);
        m33942();
        C2609 m34008 = this.f42993.f70640 == EnumC19920.f64473 ? m34008(false) : null;
        if (this.f42993.f70640 == EnumC19920.f64416) {
            enumC11091 = EnumC11091.NEW;
            m33958 = this.f42980.f18879;
            m34012();
        } else {
            enumC11091 = EnumC11091.INVOKE;
            m33958 = m33958(false);
        }
        abstractC12612.getClass();
        int m19455 = C7260.m19455(abstractC12612);
        C17013 c17013 = this.f42981;
        c17013.f52172 = m19455;
        C9232 c9232 = new C9232(enumC11091, m33958, abstractC12612, m34008);
        c9232.f16085 = c17013.f52172;
        return (AbstractC12612) this.f42989.mo29524(c9232);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19110 m33969(int i, AbstractC12612 abstractC12612, C2609 c2609, AbstractC12612 abstractC126122) {
        C5557 c5557;
        C2609 m34013 = m34013();
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC199202 = EnumC19920.f64392;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (enumC19920 == enumC199202) {
            int i2 = c22036.f70641;
            C2609 m33948 = m33948(this.f42980.f18867, false, false);
            c17013.f52172 = -1;
            C2176 m39899 = c17013.m39899(0L);
            c17013.f52172 = i2;
            c5557 = (C5557) abstractC12117.mo29524(c17013.m39907(m39899, m33948));
        } else {
            c5557 = null;
        }
        c17013.f52172 = i;
        return (C19110) abstractC12117.mo29524(c17013.m39939(abstractC12612, c2609, abstractC126122, m34013, c5557, false));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34000(int i, AbstractC12612 abstractC12612) {
        C2609 m34021 = m34021();
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        return (AbstractC12612) this.f42989.mo29524(c17013.m39958(abstractC12612, C2609.m8239(), m34021));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m34021() {
        m33979(EnumC19920.f64392);
        C18837 c18837 = new C18837();
        EnumC19920 enumC19920 = this.f42993.f70640;
        if (enumC19920 == EnumC19920.f64384) {
            m34012();
        } else if (enumC19920 != EnumC19920.f64481) {
            c18837.m43511(m34006());
            while (this.f42993.f70640 == EnumC19920.f64384) {
                m34012();
                if (this.f42993.f70640 == EnumC19920.f64481) {
                    break;
                }
                c18837.m43511(m34006());
            }
        }
        m33979(EnumC19920.f64481);
        return c18837.m43517();
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34006() {
        C22036 c22036 = this.f42993;
        return c22036.f70640 == EnumC19920.f64392 ? m34000(c22036.f70641, (AbstractC12612) null) : m34014(1);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33986() {
        int i = this.f42993.f70641;
        m33979(EnumC19920.f64470);
        AbstractC12612 m34014 = m34014(1);
        m33979(EnumC19920.f64413);
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C14875 c14875 = new C14875();
        c14875.f45392 = m34014;
        c14875.f16085 = c17013.f52172;
        return (AbstractC12612) this.f42989.mo29524(c14875);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2735 m33950(int i, long j) {
        m33979(EnumC19920.f64392);
        C2609 m33991 = m33991();
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C2735 m39902 = c17013.m39902(j, m33991);
        while (true) {
            C22036 c22036 = this.f42993;
            EnumC19920 enumC19920 = c22036.f70640;
            int i2 = c22036.f70641;
            if (enumC19920 == EnumC19920.f64479 || enumC19920 == EnumC19920.f64391) {
                C12281 c12281 = C6241.f19132;
                m33997(i2, new C12281("compiler", "orphaned", enumC19920));
                m33943();
            } else {
                m39902.f8520 = i2;
                m33979(EnumC19920.f64481);
                return (C2735) this.f42989.mo29524(m39902);
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2735 m34009() {
        return m33950(this.f42993.f70641, 0L);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2609 m33991() {
        C18837 c18837 = new C18837();
        int i = -1;
        while (true) {
            C2609 m34032 = m34032();
            if (m34032.isEmpty()) {
                return c18837.m43517();
            }
            int i2 = this.f42993.f70641;
            if (i2 == i) {
                return c18837.m43517();
            }
            if (i2 <= this.f42989.f36194) {
                m33981(false, true, true, true);
                i = this.f42993.f70641;
            }
            c18837.addAll(m34032);
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC11349 m34026() {
        C12281 c12281;
        int i = this.f42993.f70641;
        C2609 m34032 = m34032();
        boolean isEmpty = m34032.isEmpty();
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (isEmpty) {
            C3440 m33997 = m33997(i, C6241.f19134);
            c17013.f52172 = i;
            return (AbstractC11349) abstractC12117.mo29524(c17013.m39953(m33997));
        }
        AbstractC11349 abstractC11349 = (AbstractC11349) m34032.f8240;
        int i2 = C12822.f38472[abstractC11349.mo989().ordinal()];
        if (i2 == 3) {
            c12281 = C6241.f19144;
        } else {
            c12281 = i2 != 4 ? null : C6241.f19142;
        }
        if (c12281 == null) {
            return abstractC11349;
        }
        this.f42979.m7280(EnumC20043.SYNTAX, abstractC11349, c12281);
        c17013.f52172 = abstractC11349.f16085;
        C2609 of = C2609.of((Object) c17013.m39902(0L, m34032));
        c17013.f52172 = abstractC11349.f16085;
        return (AbstractC11349) abstractC12117.mo29524(c17013.m39953(c17013.m39949(of)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e8, code lost:
    
        if (r6.m7520(1).f70640 != l.EnumC19920.f64410) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        if (r6.m7520(2).f70640 != l.EnumC19920.f64410) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0125, code lost:
    
        if (r0 != 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0129, code lost:
    
        if (r7 == l.EnumC19920.f64414) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b A[FALL_THROUGH] */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C2609 m34032() {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m34032():l.ۖܶ۠");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m33926(C2176 c2176, AbstractC12612 abstractC12612) {
        C18837 c18837 = new C18837();
        m33971(this.f42993.f70641, c2176, abstractC12612, m33958(false), false, (InterfaceC5102) null, c18837, true);
        m33979(EnumC19920.f64410);
        m33976((AbstractC5144) c18837.last(), this.f42997.m7523().f70639);
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC11349 m33928(int i, EnumC11412 enumC11412, C12281 c12281) {
        C2280 c2280 = this.f42997;
        int m7517 = c2280.m7517();
        AbstractC5144 mo16224 = enumC11412.mo16224(this);
        c2280.m7518(m7517);
        return (AbstractC11349) this.f42989.mo29524(this.f42981.m39953(m33952(i, C2609.of((Object) mo16224), c12281)));
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0617 m34029() {
        AbstractC12612 abstractC12612;
        int i = this.f42993.f70641;
        m33979(EnumC19920.f64398);
        m33979(EnumC19920.f64470);
        C2176 m33945 = m33945(8589934592L);
        C18837 c18837 = new C18837();
        while (true) {
            c18837.m43511(m34017(false));
            if (this.f42993.f70640 != EnumC19920.f64434) {
                break;
            }
            m34012();
        }
        C2609 m43517 = c18837.m43517();
        int m8245 = m43517.m8245();
        C17013 c17013 = this.f42981;
        if (m8245 > 1) {
            AbstractC12612 abstractC126122 = (AbstractC12612) m43517.f8240;
            abstractC126122.getClass();
            c17013.f52172 = C7260.m19455(abstractC126122);
            C23488 c23488 = new C23488();
            c23488.f75416 = m43517;
            c23488.f16085 = c17013.f52172;
            abstractC12612 = (AbstractC12612) this.f42989.mo29524(c23488);
        } else {
            abstractC12612 = (AbstractC12612) m43517.f8240;
        }
        C9378 m33955 = m33955(m33945, abstractC12612, false, false);
        m33979(EnumC19920.f64413);
        C2735 m34009 = m34009();
        c17013.f52172 = i;
        return c17013.m39897(m33955, m34009);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
    
        return r0.m43517();
     */
    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C2609 m33943() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m33943():l.ۖܶ۠");
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private AbstractC19669 m33933() {
        C2280 c2280;
        EnumC17802 enumC17802;
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        if (c22036.f70640 == EnumC19920.f64391) {
            m33972(i, EnumC10637.f31989);
            m34012();
            C17013 c17013 = this.f42981;
            c17013.f52172 = i;
            return (AbstractC19669) this.f42989.mo29524(c17013.m39942());
        }
        int i2 = 0;
        while (true) {
            c2280 = this.f42997;
            if (c2280.m7520(i2).f70640 != EnumC19920.f64470) {
                break;
            }
            i2++;
        }
        C2176 m33945 = m33945(0L);
        if (m33945.f7169 == 0 && !m33945.f7168.m8249()) {
            int i3 = 0;
            while (true) {
                int i4 = C12822.f38471[c2280.m7520(i2).f70640.ordinal()];
                if (i4 != 5) {
                    C18411 c18411 = this.f42991;
                    if (i4 != 9) {
                        if (i4 == 49) {
                            continue;
                        } else if (i4 != 51) {
                            if (i4 == 73) {
                                EnumC19920 enumC19920 = EnumC19920.f64400;
                                if (m33983(i2, enumC19920, c18411)) {
                                    enumC17802 = EnumC17802.PATTERN;
                                } else if (m33982(i2, enumC19920)) {
                                    i2++;
                                } else {
                                    enumC17802 = EnumC17802.EXPRESSION;
                                }
                            } else if (i4 != 75 && i4 != 77 && i4 != 86) {
                                switch (i4) {
                                    case 21:
                                        i3++;
                                        continue;
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        break;
                                    default:
                                        switch (i4) {
                                            case 88:
                                                break;
                                            case 89:
                                                i3--;
                                            case 90:
                                                i3--;
                                            case 91:
                                                i3--;
                                                if (i3 != 0) {
                                                    if (i3 >= 0) {
                                                        break;
                                                    } else {
                                                        enumC17802 = EnumC17802.EXPRESSION;
                                                        break;
                                                    }
                                                } else if (!m33982(i2, c18411)) {
                                                    enumC17802 = EnumC17802.EXPRESSION;
                                                    break;
                                                } else {
                                                    enumC17802 = EnumC17802.PATTERN;
                                                    break;
                                                }
                                            default:
                                                enumC17802 = EnumC17802.EXPRESSION;
                                                break;
                                        }
                                }
                            }
                        }
                    }
                    if (i3 == 0 && m33982(i2, c18411)) {
                        enumC17802 = EnumC17802.PATTERN;
                    }
                } else {
                    i2 = m33940(i2);
                }
                i2++;
            }
            if (enumC17802 != EnumC17802.PATTERN) {
                return m34014(33);
            }
        }
        m33972(this.f42993.f70641, EnumC10637.f31989);
        return m33970(i, m33945, (AbstractC12612) null, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33949(EnumC18550 enumC18550) {
        if (this.f42993.f70640 != EnumC19920.f64432) {
            return C2609.m8239();
        }
        C18837 c18837 = new C18837();
        int i = this.f42986;
        while (true) {
            C22036 c22036 = this.f42993;
            if (c22036.f70640 == EnumC19920.f64432) {
                int i2 = c22036.f70641;
                m34012();
                c18837.m43511(m33967(enumC18550, i2));
            } else {
                this.f43001 = this.f42986;
                this.f42986 = i;
                return c18837.m43517();
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m33941(AbstractC12612 abstractC12612, C2609 c2609) {
        C2609 m33949 = m33949(EnumC18550.f57483);
        C22036 c22036 = this.f42993;
        if (c22036.f70640 == EnumC19920.f64371) {
            int i = c22036.f70641;
            m34012();
            abstractC12612 = m33936(i, abstractC12612, m33949);
        } else if (!m33949.isEmpty()) {
            if (this.f43005) {
                this.f42992 = m33949;
            } else {
                return m33951(((C17551) m33949.f8240).f16085);
            }
        }
        if (c2609.isEmpty()) {
            return abstractC12612;
        }
        int i2 = this.f42993.f70641;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i2;
        return (AbstractC12612) this.f42989.mo29524(c17013.m39937(abstractC12612, c2609));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33961(int i, AbstractC12612 abstractC12612) {
        C22036 c22036;
        EnumC19920 enumC19920;
        C2609 m33949 = m33949(EnumC18550.f57483);
        m33979(EnumC19920.f64371);
        EnumC19920 enumC199202 = this.f42993.f70640;
        EnumC19920 enumC199203 = EnumC19920.f64400;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (enumC199202 == enumC199203) {
            m33979(enumC199203);
            AbstractC12612 m33941 = m33941(abstractC12612, m33949);
            if (this.f42993.f70640 != EnumC19920.f64392) {
                c17013.f52172 = i;
                return m33952(this.f42993.f70641, C2609.of(abstractC12117.mo29524(c17013.m39958(m33941, C2609.m8239(), null))), C6241.f19138);
            }
            C18404 c18404 = (C18404) m34000(i, m33941);
            if (m33949.m8249()) {
                C18257 c18257 = (C18257) m33941;
                c18404.f57137 = c18257.f56778;
                c18404.f57138 = c18257.f56779;
            }
            return c18404;
        }
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        c188372.m43511((Object) m33949);
        c18837.m43511(m34014(1));
        m33979(enumC199203);
        while (true) {
            c22036 = this.f42993;
            enumC19920 = c22036.f70640;
            if (enumC19920 != EnumC19920.f64371 && enumC19920 != EnumC19920.f64432) {
                break;
            }
            C2609 m339492 = m33949(EnumC18550.f57483);
            int i2 = this.f42993.f70641;
            m34012();
            EnumC19920 enumC199204 = this.f42993.f70640;
            EnumC19920 enumC199205 = EnumC19920.f64400;
            if (enumC199204 == enumC199205) {
                abstractC12612 = m33936(i2, abstractC12612, m339492);
            } else {
                c188372.m43511((Object) m339492);
                c18837.m43511(m34014(1));
                m33979(enumC199205);
            }
        }
        int i3 = c22036.f70641;
        C2609 m34021 = enumC19920 == EnumC19920.f64392 ? m34021() : null;
        c17013.f52172 = i;
        C18404 c184042 = (C18404) abstractC12117.mo29524(c17013.m39958(abstractC12612, c18837.m43517(), m34021));
        c184042.f57141 = c188372.m43517();
        return m34021 != null ? m33952(i3, C2609.of((Object) c184042), C6241.f19156) : c184042;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19110 m33968(int i, AbstractC12612 abstractC12612, C2609 c2609) {
        C2609 m33949 = m33949(EnumC18550.f57483);
        int i2 = this.f42993.f70641;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i2;
        C7673 m39951 = c17013.m39951(m33958(false));
        AbstractC12117 abstractC12117 = this.f42989;
        AbstractC12612 abstractC126122 = (AbstractC12612) abstractC12117.mo29524(m39951);
        if (m33949.m8249()) {
            c17013.f52172 = ((C17551) m33949.f8240).f16085;
            abstractC126122 = (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC126122, m33949));
        }
        if (this.f42993.f70640 == EnumC19920.f64473) {
            int i3 = this.f42986;
            abstractC126122 = m34003(abstractC126122, true);
            this.f42986 = i3;
        }
        return m33969(i, abstractC12612, c2609, abstractC126122);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34017(boolean z) {
        C2609 m33949 = m33949(EnumC18550.f57483);
        AbstractC12612 m34034 = m34034(z);
        return m33949.m8249() ? m33929(m34034, m33949, false) : m34034;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34031() {
        AbstractC12612 abstractC12612;
        C2609 m33949 = m33949(EnumC18550.f57483);
        C22036 c22036 = this.f42993;
        if (c22036.f70640 != EnumC19920.f64440) {
            AbstractC12612 m34034 = m34034(false);
            return m33949.m8249() ? m33929(m34034, m33949, false) : m34034;
        }
        int i = c22036.f70641;
        m34012();
        EnumC19920 enumC19920 = this.f42993.f70640;
        EnumC19920 enumC199202 = EnumC19920.f64395;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (enumC19920 == enumC199202) {
            c17013.f52172 = i;
            C19256 c19256 = (C19256) abstractC12117.mo29523(c17013.m39940(EnumC15678.EXTENDS));
            m34012();
            AbstractC12612 m34017 = m34017(false);
            c17013.f52172 = i;
            abstractC12612 = c17013.m39930(c19256, (AbstractC5144) m34017);
        } else {
            EnumC19920 enumC199203 = EnumC19920.f64474;
            if (enumC19920 == enumC199203) {
                c17013.f52172 = i;
                C19256 c192562 = (C19256) abstractC12117.mo29523(c17013.m39940(EnumC15678.SUPER));
                m34012();
                AbstractC12612 m340172 = m34017(false);
                c17013.f52172 = i;
                abstractC12612 = c17013.m39930(c192562, (AbstractC5144) m340172);
            } else if (this.f42991.test(enumC19920)) {
                c17013.f52172 = -1;
                C19256 m39940 = c17013.m39940(EnumC15678.UNBOUND);
                c17013.f52172 = i;
                AbstractC12612 abstractC126122 = (AbstractC12612) abstractC12117.mo29524(c17013.m39930(m39940, (AbstractC5144) null));
                c17013.f52172 = this.f42993.f70641;
                C7673 c7673 = (C7673) abstractC12117.mo29524(c17013.m39951(m33958(false)));
                c17013.f52172 = i;
                abstractC12612 = c17013.m39949(C2609.of((Object) abstractC126122, (Object) c7673));
                m33975(abstractC12612, C6241.m17190(EnumC19920.f64454, enumC199202, enumC199203));
            } else {
                c17013.f52172 = i;
                C19256 c192563 = (C19256) abstractC12117.mo29524(c17013.m39940(EnumC15678.UNBOUND));
                c17013.f52172 = i;
                abstractC12612 = (AbstractC12612) abstractC12117.mo29524(c17013.m39930(c192563, (AbstractC5144) null));
            }
        }
        if (m33949.isEmpty()) {
            return abstractC12612;
        }
        c17013.f52172 = ((C17551) m33949.f8240).f16085;
        return (AbstractC12612) abstractC12117.mo29524(c17013.m39937(abstractC12612, m33949));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2176 m33945(long j) {
        C2176 m33946 = m33946((C2176) null);
        long j2 = m33946.f7169 & (-131089);
        int i = this.f42993.f70641;
        if (j2 != 0) {
            EnumC20043 enumC20043 = EnumC20043.SYNTAX;
            EnumSet m45150 = C19642.m45150(j2 & (-j2));
            C12281 c12281 = C6241.f19132;
            this.f42979.m7279(enumC20043, i, new C12281("compiler", "mod.not.allowed.here", m45150));
        }
        m33946.f7169 = j | m33946.f7169;
        return m33946;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x013b -> B:7:0x0146). Please report as a decompilation issue!!! */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C2176 m33946(l.C2176 r19) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m33946(l.ۖ֡۠):l.ۖ֡۠");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17551 m33967(EnumC18550 enumC18550, int i) {
        C2609 m8239;
        C17551 m39966;
        if (enumC18550 == EnumC18550.f57483) {
            m33978(EnumC10637.f31996);
        }
        AbstractC12612 m34025 = m34025(false);
        EnumC19920 enumC19920 = this.f42993.f70640;
        EnumC19920 enumC199202 = EnumC19920.f64470;
        if (enumC19920 != enumC199202) {
            m8239 = C2609.m8239();
        } else {
            m33979(enumC199202);
            C18837 c18837 = new C18837();
            if (this.f42993.f70640 != EnumC19920.f64413) {
                c18837.m43511(m33960());
                while (this.f42993.f70640 == EnumC19920.f64384) {
                    m34012();
                    c18837.m43511(m33960());
                }
            }
            m33979(EnumC19920.f64413);
            m8239 = c18837.m43517();
        }
        EnumC18550 enumC185502 = EnumC18550.f57490;
        C17013 c17013 = this.f42981;
        if (enumC18550 == enumC185502) {
            c17013.f52172 = i;
            m39966 = c17013.m39932((AbstractC5144) m34025, m8239);
        } else if (enumC18550 == EnumC18550.f57483) {
            c17013.f52172 = i;
            m39966 = c17013.m39966((AbstractC5144) m34025, m8239);
        } else {
            throw new AssertionError("Unhandled annotation kind: " + enumC18550);
        }
        m33976(m39966, this.f42997.m7523().f70639);
        return m39966;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33960() {
        if (this.f42991.test(this.f42993.f70640)) {
            m33942();
            AbstractC12612 m34011 = m34011();
            if (!m34011.m14709(EnumC18550.f57566)) {
                return m34011;
            }
            C22036 c22036 = this.f42993;
            EnumC19920 enumC19920 = c22036.f70640;
            EnumC19920 enumC199202 = EnumC19920.f64431;
            if (enumC19920 != enumC199202) {
                return m34011;
            }
            int i = c22036.f70641;
            m33979(enumC199202);
            AbstractC12612 m33999 = m33999();
            C17013 c17013 = this.f42981;
            c17013.f52172 = i;
            return (AbstractC12612) this.f42989.mo29524(c17013.m39941(m34011, m33999));
        }
        return m33999();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m33999() {
        int i = C12822.f38471[this.f42993.f70640.ordinal()];
        if (i == 5) {
            int i2 = this.f42993.f70641;
            m34012();
            return m33967(EnumC18550.f57490, i2);
        }
        if (i == 11) {
            int i3 = this.f42993.f70641;
            m33979(EnumC19920.f64392);
            C18837 c18837 = new C18837();
            EnumC19920 enumC19920 = this.f42993.f70640;
            if (enumC19920 == EnumC19920.f64384) {
                m34012();
            } else if (enumC19920 != EnumC19920.f64481) {
                c18837.m43511(m33999());
                while (this.f42993.f70640 == EnumC19920.f64384) {
                    m34012();
                    if (this.f42993.f70640 == EnumC19920.f64481) {
                        break;
                    }
                    c18837.m43511(m33999());
                }
            }
            m33979(EnumC19920.f64481);
            C17013 c17013 = this.f42981;
            c17013.f52172 = i3;
            return (AbstractC12612) this.f42989.mo29524(c17013.m39958(null, C2609.m8239(), c18837.m43517()));
        }
        m33942();
        return m34011();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33971(int i, C2176 c2176, AbstractC12612 abstractC12612, AbstractC10370 abstractC10370, boolean z, InterfaceC5102 interfaceC5102, C18837 c18837, boolean z2) {
        c18837.m43511(m33954(i, c2176, abstractC12612, abstractC10370, z, interfaceC5102, z2, false));
        while (this.f42993.f70640 == EnumC19920.f64384) {
            m33976((AbstractC5144) c18837.last(), this.f42993.f70639);
            m34012();
            c18837.m43511(m33954(this.f42993.f70641, c2176, abstractC12612, m33958(false), z, interfaceC5102, z2, true));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m33954(int i, C2176 c2176, AbstractC12612 abstractC12612, AbstractC10370 abstractC10370, boolean z, InterfaceC5102 interfaceC5102, boolean z2, boolean z3) {
        AbstractC12612 abstractC126122;
        int i2;
        AbstractC12612 abstractC126123;
        boolean z4;
        AbstractC12612 m33934 = m33934(abstractC12612);
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC199202 = EnumC19920.f64431;
        if (enumC19920 == enumC199202) {
            m34012();
            abstractC126122 = m34006();
        } else {
            if (z) {
                m33997(c22036.f70641, C6241.m17188(enumC199202));
            }
            abstractC126122 = null;
        }
        AbstractC5144 m19437 = C7260.m19437((AbstractC5144) m33934, true);
        if (m19437.m14709(EnumC18550.f57566)) {
            AbstractC10370 abstractC103702 = ((C7673) m19437).f23696;
            if (m33966(abstractC103702, i, !z3 && z2) != null) {
                if (abstractC103702 != this.f42980.f18888) {
                    int i3 = m19437.f16085;
                    C12281 c12281 = C6241.f19132;
                    m33973(i3, new C12281("compiler", "restricted.type.not.allowed.here", abstractC103702));
                } else if (m33934.m14709(EnumC18550.f57518) && !z3) {
                    int i4 = m19437.f16085;
                    C12281 c122812 = C6241.f19132;
                    m33973(i4, new C12281("compiler", "restricted.type.not.allowed.array", abstractC103702));
                } else {
                    if (z3) {
                        int i5 = m19437.f16085;
                        C12281 c122813 = C6241.f19132;
                        m33973(i5, new C12281("compiler", "restricted.type.not.allowed.compound", abstractC103702));
                    }
                    i2 = C7260.m19455(c2176);
                    if (i2 == -1) {
                        i2 = C7260.m19455(m33934);
                    }
                    abstractC126123 = null;
                    z4 = true;
                    C17013 c17013 = this.f42981;
                    c17013.f52172 = i;
                    C9378 c9378 = (C9378) this.f42989.mo29524(c17013.m39921(c2176, abstractC10370, abstractC126123, abstractC126122, z4));
                    m33977(c9378, interfaceC5102);
                    c9378.f28485 = i2;
                    return c9378;
                }
            }
        }
        i2 = -1;
        abstractC126123 = m33934;
        z4 = false;
        C17013 c170132 = this.f42981;
        c170132.f52172 = i;
        C9378 c93782 = (C9378) this.f42989.mo29524(c170132.m39921(c2176, abstractC10370, abstractC126123, abstractC126122, z4));
        m33977(c93782, interfaceC5102);
        c93782.f28485 = i2;
        return c93782;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m33957(AbstractC12612 abstractC12612, boolean z) {
        int i = C12822.f38472[abstractC12612.mo989().ordinal()];
        if (i != 5) {
            if (i != 6) {
                return null;
            }
            return m33957(((C23901) abstractC12612).f77274, z);
        }
        C7673 c7673 = (C7673) abstractC12612;
        if (m33966(c7673.f23696, abstractC12612.f16085, z) != null) {
            return c7673.f23696;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16280 m33966(AbstractC10370 abstractC10370, int i, boolean z) {
        C6136 c6136 = this.f42980;
        AbstractC10370 abstractC103702 = c6136.f18888;
        C22364 c22364 = this.f42979;
        if (abstractC10370 == abstractC103702) {
            if (EnumC10637.f32000.m26686(this.f42983)) {
                return EnumC16280.JDK10;
            }
            if (z) {
                C11076 c11076 = C14001.f42334;
                c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed", abstractC10370, EnumC16280.JDK10));
            }
        }
        if (abstractC10370 == c6136.f18799) {
            if (this.f42987) {
                return EnumC16280.JDK14;
            }
            if (z) {
                C11076 c110762 = C14001.f42334;
                c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed", abstractC10370, EnumC16280.JDK14));
            }
        }
        if (abstractC10370 == c6136.f18818) {
            if (this.f42999) {
                return EnumC16280.JDK14;
            }
            if (z) {
                C11076 c110763 = C14001.f42334;
                c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed.preview", abstractC10370, EnumC16280.JDK14));
            }
        }
        AbstractC10370 abstractC103703 = c6136.f18864;
        boolean z2 = this.f42998;
        if (abstractC10370 == abstractC103703) {
            if (z2) {
                return EnumC16280.JDK15;
            }
            if (z) {
                C11076 c110764 = C14001.f42334;
                c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed.preview", abstractC10370, EnumC16280.JDK15));
            }
        }
        if (abstractC10370 != c6136.f18872) {
            return null;
        }
        if (z2) {
            return EnumC16280.JDK15;
        }
        if (!z) {
            return null;
        }
        C11076 c110765 = C14001.f42334;
        c22364.m7268(i, new C11076("compiler", "restricted.type.not.allowed.preview", abstractC10370, EnumC16280.JDK15));
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m33955(C2176 c2176, AbstractC12612 abstractC12612, boolean z, boolean z2) {
        AbstractC10370 abstractC10370;
        AbstractC10370 abstractC103702;
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        EnumC19920 enumC19920 = c22036.f70640;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        boolean z3 = false;
        C6136 c6136 = this.f42980;
        C22364 c22364 = this.f42979;
        if (z && enumC19920 == EnumC19920.f64437) {
            c22364.m7269(i, C6241.f19256);
            abstractC103702 = this.f42993.mo3194();
            m34012();
        } else if (this.f43006 || !z || this.f42991.test(enumC19920) || c2176.f7169 != 8589934592L || c2176.f7168.m8249()) {
            AbstractC12612 m34025 = m34025(false);
            if (!m34025.m14709(EnumC18550.f57566) || (abstractC10370 = ((C7673) m34025).f23696) == c6136.f18886) {
                if (this.f43006) {
                    if ((17179869184L & c2176.f7169) != 0) {
                        c22364.m7269(this.f42993.f70641, C6241.f19190);
                    }
                    C22036 c220362 = this.f42993;
                    if (c220362.f70640 == EnumC19920.f64371) {
                        c22364.m7269(c220362.f70641, C6241.f19240);
                    }
                    if (m34025.m14709(EnumC18550.f57581) && ((C6262) m34025).f19395 != c6136.f18886) {
                        c22364.m7269(this.f42993.f70641, C6241.f19274);
                    }
                }
                c17013.f52172 = i;
                return (C9378) abstractC12117.mo29524(c17013.m39922(c2176, m34025, abstractC12612));
            }
            abstractC103702 = abstractC10370;
        } else {
            abstractC103702 = c6136.f18867;
        }
        if ((17179869184L & c2176.f7169) != 0) {
            C22036 c220363 = this.f42993;
            if (c220363.f70640 == EnumC19920.f64371) {
                c22364.m7269(c220363.f70641, C6241.f19196);
            }
        }
        if (z2) {
            C22036 c220364 = this.f42993;
            if (c220364.f70640 == EnumC19920.f64371) {
                c22364.m7269(c220364.f70641, C6241.f19208);
            }
        }
        AbstractC12612 m33934 = m33934(abstractC12612);
        c17013.f52172 = i;
        if (m33934 != null && m33934.m14709(EnumC18550.f57566) && ((C7673) m33934).f23696 == c6136.f18888) {
            z3 = true;
        }
        return (C9378) abstractC12117.mo29524(c17013.m39921(c2176, abstractC103702, m33934, null, z3));
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 m34027() {
        C22036 c22036 = this.f42993;
        int i = c22036.f70641;
        EnumC19920 enumC19920 = c22036.f70640;
        if (enumC19920 == EnumC19920.f64476 || enumC19920 == EnumC19920.f64432) {
            return m33954(this.f42993.f70641, m33945(16L), m34017(true), m33958(false), true, (InterfaceC5102) null, true, false);
        }
        AbstractC12612 m34014 = m34014(3);
        if ((this.f43001 & 2) != 0) {
            if (this.f42991.test(this.f42993.f70640)) {
                C17013 c17013 = this.f42981;
                c17013.f52172 = i;
                return m33954(this.f42993.f70641, (C2176) this.f42989.mo29524(c17013.m39899(16L)), m34014, m33958(false), true, (InterfaceC5102) null, true, false);
            }
        }
        m33978(EnumC10637.f31987);
        if (!m34014.m14709(EnumC18550.f57566) && !m34014.m14709(EnumC18550.f57581)) {
            this.f42979.m7273(m34014, C6241.f19202);
        }
        return m34014;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0216  */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C1323 m33988() {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m33988():l.֨᩵۠");
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x032f, code lost:
    
        r2 = r1;
        r5 = r4;
        r20 = r7;
        r18 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032f A[ADDED_TO_REGION, EDGE_INSN: B:146:0x032f->B:145:0x032f BREAK  A[LOOP:0: B:36:0x011a->B:94:0x031c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC11349 m33959(l.C2176 r32, l.InterfaceC5102 r33) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m33959(l.ۖ֡۠, l.ۚۘ۠):l.ۨ֡۠");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5557 m33998(C2176 c2176, InterfaceC5102 interfaceC5102) {
        C17013 c17013;
        C2609 c2609;
        C2609 c26092;
        int i = this.f42993.f70641;
        m34012();
        c2176.f7169 |= 2305843009213693952L;
        AbstractC10370 m33989 = m33989();
        C2609 m34007 = m34007();
        C2609 m33996 = m33996(false, true);
        C2609 m8239 = C2609.m8239();
        if (this.f42993.f70640 == EnumC19920.f64445) {
            m34012();
            m8239 = m34028();
        }
        C2609 m33948 = m33948(m33989, false, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = m33996.iterator();
        while (it.hasNext()) {
            arrayList.add((C9378) it.next());
        }
        Iterator it2 = m33948.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            c17013 = this.f42981;
            if (!hasNext) {
                break;
            }
            AbstractC5144 abstractC5144 = (AbstractC5144) it2.next();
            if (abstractC5144.m14709(EnumC18550.f57511)) {
                C8526 c8526 = (C8526) abstractC5144;
                if (c8526.f26044 == this.f42980.f18879 && c8526.f26048.isEmpty() && (c8526.f26046.f7169 & 2251799813685248L) != 0) {
                    C18837 c18837 = new C18837();
                    Iterator it3 = m33996.iterator();
                    while (it3.hasNext()) {
                        C9378 c9378 = (C9378) it3.next();
                        c17013.m39946((InterfaceC3109) c9378);
                        C2176 c21762 = c9378.f28486;
                        c18837.m43511(c17013.m39920(c17013.m39947((c21762.f7169 & 17179869184L) | 8606711808L, c21762.f7168), c9378.f28484, c9378.f28488, (AbstractC12612) null));
                        m33996 = m33996;
                        m8239 = m8239;
                    }
                    c2609 = m33996;
                    c26092 = m8239;
                    c8526.f26048 = c18837.m43517();
                    m33996 = c2609;
                    m8239 = c26092;
                }
            }
            c2609 = m33996;
            c26092 = m8239;
            m33996 = c2609;
            m8239 = c26092;
        }
        C2609 c26093 = m8239;
        C2609 c26094 = m33948;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c26094 = c26094.m8246((C9378) arrayList.get(size));
        }
        c17013.f52172 = i;
        C5557 c5557 = (C5557) this.f42989.mo29524(c17013.m39908(c2176, m33989, m34007, (AbstractC12612) null, c26093, c26094));
        m33977(c5557, interfaceC5102);
        return c5557;
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m33989() {
        int i = this.f42993.f70641;
        AbstractC10370 m33958 = m33958(false);
        EnumC16280 m33966 = m33966(m33958, i, true);
        if (m33966 != null) {
            C12281 c12281 = C6241.f19132;
            m33973(i, new C12281("compiler", "restricted.type.not.allowed", m33958, m33966));
        }
        return m33958;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33947(C2176 c2176, String str) {
        if (this.f42998) {
            C22036 c22036 = this.f42993;
            if (c22036.f70640 == EnumC19920.f64412 && c22036.mo3194() == this.f42980.f18872) {
                m33978(EnumC10637.f31988);
                if ((c2176.f7169 & SkeinEngine.UbiTweak.T1_FIRST) == 0) {
                    this.f42979.m7269(this.f42993.f70641, C6241.m17186(new C11576("compiler", "class.is.not.sealed", str)));
                }
                m34012();
                return m34018(false);
            }
        }
        return C2609.m8239();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2609 m34028() {
        C18837 c18837 = new C18837();
        c18837.m43511(m34017(false));
        while (this.f42993.f70640 == EnumC19920.f64384) {
            m34012();
            c18837.m43511(m34017(false));
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33948(AbstractC10370 abstractC10370, boolean z, boolean z2) {
        EnumC19920 enumC19920;
        EnumC19920 enumC199202 = EnumC19920.f64392;
        m33979(enumC199202);
        int i = this.f42993.f70641;
        AbstractC12117 abstractC12117 = this.f42989;
        if (i <= abstractC12117.f36194) {
            m33981(false, true, false, false);
            if (this.f42993.f70640 == enumC199202) {
                m34012();
            } else {
                return C2609.m8239();
            }
        }
        C18837 c18837 = new C18837();
        while (true) {
            EnumC19920 enumC199203 = this.f42993.f70640;
            enumC19920 = EnumC19920.f64481;
            if (enumC199203 == enumC19920 || enumC199203 == EnumC19920.f64381) {
                break;
            }
            c18837.m43512(m33995(abstractC10370, z, z2));
            if (this.f42993.f70641 <= abstractC12117.f36194) {
                m33981(false, true, true, false);
            }
        }
        m33979(enumC19920);
        return c18837.m43517();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m33995(AbstractC10370 abstractC10370, boolean z, boolean z2) {
        EnumC19920 enumC19920;
        AbstractC12612 m34034;
        C2609 of;
        C22036 c22036 = this.f42993;
        EnumC19920 enumC199202 = c22036.f70640;
        EnumC19920 enumC199203 = EnumC19920.f64410;
        if (enumC199202 == enumC199203) {
            m34012();
            return C2609.m8239();
        }
        EnumC0162 enumC0162 = EnumC0162.LINE;
        InterfaceC5102 m49578 = c22036.m49578();
        int i = this.f42993.f70641;
        C2176 m33946 = m33946((C2176) null);
        if (this.f42993.f70640 == EnumC19920.f64408 || ((this.f42999 && m33993()) || (enumC19920 = this.f42993.f70640) == EnumC19920.f64460 || enumC19920 == EnumC19920.f64388)) {
            return C2609.of((Object) m33959(m33946, m49578));
        }
        EnumC19920 enumC199204 = EnumC19920.f64392;
        C22364 c22364 = this.f42979;
        if (enumC19920 == enumC199204 && (m33946.f7169 & 4087) == 0 && m33946.f7168.isEmpty()) {
            if (z) {
                c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19283);
            } else if (z2 && (m33946.f7169 & 8) == 0) {
                c22364.m7279(EnumC20043.SYNTAX, this.f42993.f70641, C6241.f19194);
            }
            return C2609.of((Object) m33950(i, m33946.f7169));
        }
        int i2 = this.f42993.f70641;
        C2609 m34007 = m34007();
        if (m34007.m8249() && m33946.f16085 == -1) {
            m33946.f16085 = i2;
            m33976(m33946, i2);
        }
        C2609 m33949 = m33949(EnumC18550.f57490);
        if (m33949.m8249()) {
            m33972(((C17551) m33949.f8240).f16085, EnumC10637.f31997);
            C2609 c2609 = m33946.f7168;
            c2609.getClass();
            C2609 m8248 = m33949.m8248(c2609);
            m33946.f7168 = m8248;
            if (m33946.f16085 == -1) {
                m33946.f16085 = ((C17551) m8248.f8240).f16085;
            }
        }
        C22036 c220362 = this.f42993;
        int i3 = c220362.f70641;
        boolean z3 = c220362.f70640 == EnumC19920.f64404;
        AbstractC12117 abstractC12117 = this.f42989;
        C17013 c17013 = this.f42981;
        if (z3) {
            c17013.f52172 = i3;
            m34034 = (AbstractC12612) abstractC12117.mo29523(c17013.m39903(EnumC9454.VOID));
            m34012();
        } else {
            m34034 = m34034(false);
        }
        EnumC19920 enumC199205 = this.f42993.f70640;
        EnumC19920 enumC199206 = EnumC19920.f64470;
        C6136 c6136 = this.f42980;
        if (((enumC199205 == enumC199206 && !z) || (z2 && enumC199205 == enumC199204)) && m34034.m14709(EnumC18550.f57566)) {
            if (z || c220362.mo3194() != abstractC10370) {
                c22364.m7279(EnumC20043.SYNTAX, i3, C6241.f19129);
            } else if (m33949.m8249()) {
                m33951(((C17551) m33949.f8240).f16085);
            }
            if (z2 && this.f42993.f70640 == enumC199204) {
                m33946.f7169 |= 2251799813685248L;
            }
            return C2609.of((Object) m33953(i3, m33946, null, c6136.f18879, m34007, z, true, z2, m49578));
        }
        if (z2 && m34034.m14709(EnumC18550.f57566)) {
            C22036 c220363 = this.f42993;
            if (c220363.f70640 == EnumC19920.f64429) {
                EnumC20043 enumC20043 = EnumC20043.SYNTAX;
                int i4 = c220363.f70641;
                C11576 c11576 = C11886.f35486;
                c22364.m7279(enumC20043, i4, C6241.m17187(c11576, abstractC10370, new C11576("compiler", "throws.clause.not.allowed.for.canonical.constructor", c11576)));
                m33981(false, true, false, false);
                return C2609.of((Object) m33953(i3, m33946, null, c6136.f18879, m34007, z, true, z2, m49578));
            }
        }
        int i5 = this.f42993.f70641;
        AbstractC10370 m33958 = m33958(false);
        if (this.f42993.f70640 == enumC199206) {
            return C2609.of((Object) m33953(i5, m33946, m34034, m33958, m34007, z, z3, false, m49578));
        }
        if (z3 || !m34007.isEmpty()) {
            int i6 = this.f42993.f70641;
            if (z3 || m34007.m8249()) {
                c17013.f52172 = i6;
                C8526 c8526 = (C8526) abstractC12117.mo29524(c17013.m39917(m33946, m33958, m34034, m34007, null, C2609.m8239(), C2609.m8239(), null, null));
                m33977(c8526, m49578);
                of = C2609.of((Object) c8526);
            } else {
                of = C2609.m8239();
            }
            return C2609.of((Object) m33952(this.f42993.f70641, of, C6241.m17188(enumC199206)));
        }
        if (!z2 || (z2 && (m33946.f7169 & 8) != 0)) {
            C18837 c18837 = new C18837();
            m33971(i5, m33946, m34034, m33958, z, m49578, c18837, false);
            C2609 m43517 = c18837.m43517();
            m33979(enumC199203);
            m33976((AbstractC5144) m43517.last(), this.f42997.m7523().f70639);
            return m43517;
        }
        C18837 c188372 = new C18837();
        m33971(i5, m33946, m34034, m33958, z, m49578, c188372, false);
        c188372.m43517();
        m33979(enumC199203);
        return C2609.of((Object) m33952(i5, (C2609) null, C6241.f19179));
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m33993() {
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC199202 = EnumC19920.f64412;
        if (enumC19920 != enumC199202 || c22036.mo3194() != this.f42980.f18818 || (!m33983(0, enumC199202, EnumC19920.f64470) && !m33983(0, enumC199202, EnumC19920.f64381) && !m33983(0, enumC199202, EnumC19920.f64473))) {
            return false;
        }
        m33978(EnumC10637.f32007);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33985(C22036 c22036, int i) {
        AbstractC10370 mo3194 = c22036.mo3194();
        C6136 c6136 = this.f42980;
        if (mo3194 != c6136.f18852 || !m33983(i, EnumC19920.f64407, EnumC19920.f64412)) {
            return false;
        }
        C2280 c2280 = this.f42997;
        C22036 m7520 = c2280.m7520(i + 1);
        C22036 m75202 = c2280.m7520(i + 2);
        if (c22036.f70639 != m7520.f70641 || m7520.f70639 != m75202.f70641 || m75202.mo3194() != c6136.f18864) {
            return false;
        }
        m33978(EnumC10637.f31988);
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m34005(boolean z) {
        if (this.f42993.mo3194() != this.f42980.f18864 || !m33932(this.f42997.m7520(1), z, false)) {
            return false;
        }
        m33978(EnumC10637.f31988);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m33932(C22036 c22036, boolean z, boolean z2) {
        C2280 c2280 = this.f42997;
        if (z) {
            int i = C12822.f38471[c22036.f70640.ordinal()];
            if (i != 3 && i != 4) {
                if (i != 5) {
                    if (i != 7 && i != 8 && i != 9 && i != 20) {
                        return false;
                    }
                } else if (c2280.m7520(2).f70640 == EnumC19920.f64460 && !z2) {
                    return false;
                }
            }
        } else {
            int i2 = C12822.f38471[c22036.f70640.ordinal()];
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                if (i2 != 5) {
                    if (i2 != 7 && i2 != 8 && i2 != 9 && i2 != 20) {
                        if (i2 != 32) {
                            switch (i2) {
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                default:
                                    return false;
                            }
                        } else {
                            if (!m33985(c22036, z2 ? 3 : 1) && c22036.mo3194() != this.f42980.f18864) {
                                return false;
                            }
                        }
                    }
                } else if (c2280.m7520(2).f70640 == EnumC19920.f64460 && !z2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #0 {all -> 0x00cc, blocks: (B:11:0x0027, B:13:0x0035, B:15:0x003d, B:20:0x006c, B:23:0x0076, B:24:0x00a6, B:29:0x007d, B:31:0x0081, B:32:0x008a, B:34:0x0097, B:36:0x00a0, B:39:0x004d, B:41:0x0053, B:42:0x005c, B:44:0x0064), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:11:0x0027, B:13:0x0035, B:15:0x003d, B:20:0x006c, B:23:0x0076, B:24:0x00a6, B:29:0x007d, B:31:0x0081, B:32:0x008a, B:34:0x0097, B:36:0x00a0, B:39:0x004d, B:41:0x0053, B:42:0x005c, B:44:0x0064), top: B:10:0x0027 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C8526 m33953(int r17, l.C2176 r18, l.AbstractC12612 r19, l.AbstractC10370 r20, l.C2609 r21, boolean r22, boolean r23, boolean r24, l.InterfaceC5102 r25) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14273.m33953(int, l.ۖ֡۠, l.۫᩵۠, l.ۤܶ۠, l.ۖܶ۠, boolean, boolean, boolean, l.ۚۘ۠):l.ۡ֡۠");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2609 m34018(boolean z) {
        C2609 m8239;
        C2609 m82392;
        C18837 c18837 = new C18837();
        if (z) {
            m8239 = m33949(EnumC18550.f57483);
        } else {
            m8239 = C2609.m8239();
        }
        AbstractC12612 m34025 = m34025(z);
        if (!m8239.isEmpty()) {
            c18837.m43511(m33929(m34025, m8239, false));
        } else {
            c18837.m43511(m34025);
        }
        while (this.f42993.f70640 == EnumC19920.f64384) {
            m34012();
            if (z) {
                m82392 = m33949(EnumC18550.f57483);
            } else {
                m82392 = C2609.m8239();
            }
            AbstractC12612 m340252 = m34025(z);
            if (!m82392.isEmpty()) {
                c18837.m43511(m33929(m340252, m82392, false));
            } else {
                c18837.m43511(m340252);
            }
        }
        return c18837.m43517();
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2609 m34007() {
        if (this.f42993.f70640 == EnumC19920.f64473) {
            C18837 c18837 = new C18837();
            m34012();
            c18837.m43511(m33987());
            while (this.f42993.f70640 == EnumC19920.f64384) {
                m34012();
                c18837.m43511(m33987());
            }
            m33979(EnumC19920.f64454);
            return c18837.m43517();
        }
        return C2609.m8239();
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C14315 m33987() {
        int i = this.f42993.f70641;
        C2609 m33949 = m33949(EnumC18550.f57483);
        AbstractC10370 m33989 = m33989();
        C18837 c18837 = new C18837();
        if (this.f42993.f70640 == EnumC19920.f64395) {
            m34012();
            c18837.m43511(m34017(false));
            while (this.f42993.f70640 == EnumC19920.f64380) {
                m34012();
                c18837.m43511(m34017(false));
            }
        }
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C2609 m43517 = c18837.m43517();
        C14315 c14315 = new C14315();
        c14315.f43169 = m33989;
        c14315.f43170 = m43517;
        c14315.f43168 = m33949;
        c14315.f16085 = c17013.f52172;
        return (C14315) this.f42989.mo29524(c14315);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m33996(boolean z, boolean z2) {
        C18837 c18837 = new C18837();
        m33979(EnumC19920.f64470);
        if (this.f42993.f70640 != EnumC19920.f64413) {
            this.f43006 = (z || z2) ? false : true;
            C9378 m33956 = m33956(z, z2);
            if (m33956.f28483 != null) {
                this.f42985 = m33956;
            } else {
                c18837.m43511(m33956);
            }
            this.f43006 = false;
            while (this.f42993.f70640 == EnumC19920.f64384) {
                if ((m33956.f28486.f7169 & 17179869184L) != 0) {
                    this.f42979.m7280(EnumC20043.SYNTAX, m33956, C6241.f19244);
                }
                m34012();
                m33956 = m33956(z, z2);
                c18837.m43511(m33956);
            }
        }
        C22036 c22036 = this.f42993;
        EnumC19920 enumC19920 = c22036.f70640;
        EnumC19920 enumC199202 = EnumC19920.f64413;
        if (enumC19920 == enumC199202) {
            m34012();
        } else {
            m34004(c22036.f70641);
            m33973(this.f42997.m7523().f70639, C6241.m17190(EnumC19920.f64384, enumC199202, EnumC19920.f64371));
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m33956(boolean z, boolean z2) {
        C2176 m33946;
        if (z2) {
            m33946 = m33946((C2176) null);
        } else {
            m33946 = m33945(8589934592L);
        }
        if (z2 && m33946.f7169 != 0) {
            this.f42979.m7269(m33946.f16085, C6241.f19137);
        }
        if (z2) {
            m33946.f7169 |= 2305843009230471186L;
        }
        this.f43005 = true;
        AbstractC12612 m34017 = m34017(z);
        this.f43005 = false;
        if (this.f42993.f70640 == EnumC19920.f64472) {
            C2609 c2609 = this.f42992;
            this.f42992 = C2609.m8239();
            m33946.f7169 |= 17179869184L;
            m34017 = m33929(m34017, c2609, true);
            m34012();
        } else {
            if (this.f42992.m8249()) {
                m33973(((C17551) this.f42992.f8240).f16085, C6241.f19205);
            }
            this.f42992 = C2609.m8239();
        }
        return m33955(m33946, m34017, z, z2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m34001(AbstractC12612 abstractC12612) {
        if (C7260.m19447(abstractC12612)) {
            return abstractC12612;
        }
        int i = abstractC12612.f16085;
        C17013 c17013 = this.f42981;
        c17013.f52172 = i;
        C3440 m39949 = c17013.m39949(C2609.of((Object) abstractC12612));
        this.f42979.m7280(EnumC20043.SYNTAX, m39949, C6241.f19295);
        return m39949;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m33939(EnumC19920 enumC19920) {
        EnumC18550 m33938 = m33938(enumC19920);
        if (m33938 != EnumC18550.f57495) {
            return C7260.m19433(m33938);
        }
        return -1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC18550 m33938(EnumC19920 enumC19920) {
        int i = C12822.f38471[enumC19920.ordinal()];
        if (i == 21) {
            return EnumC18550.f57539;
        }
        if (i == 82) {
            return EnumC18550.f57545;
        }
        if (i != 83) {
            switch (i) {
                case 62:
                    return EnumC18550.f57573;
                case 63:
                    return EnumC18550.f57526;
                case 64:
                    return EnumC18550.f57508;
                case 65:
                    return EnumC18550.f57487;
                case 66:
                    return EnumC18550.f57542;
                case 67:
                    return EnumC18550.f57579;
                case 68:
                    return EnumC18550.f57510;
                case 69:
                    return EnumC18550.f57525;
                case 70:
                    return EnumC18550.f57486;
                case 71:
                    return EnumC18550.f57552;
                case 72:
                    return EnumC18550.f57574;
                default:
                    switch (i) {
                        case 89:
                            return EnumC18550.f57546;
                        case 90:
                            return EnumC18550.f57527;
                        case 91:
                            return EnumC18550.f57572;
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            return EnumC18550.f57528;
                        case 93:
                            return EnumC18550.f57544;
                        default:
                            switch (i) {
                                case 95:
                                    return EnumC18550.f57479;
                                case 96:
                                    return EnumC18550.f57565;
                                case 97:
                                    return EnumC18550.f57538;
                                case 98:
                                    return EnumC18550.f57484;
                                case q.f /* 99 */:
                                    return EnumC18550.f57559;
                                case 100:
                                    return EnumC18550.f57570;
                                case 101:
                                    return EnumC18550.f57505;
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    return EnumC18550.f57512;
                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    return EnumC18550.f57583;
                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    return EnumC18550.f57547;
                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    return EnumC18550.f57551;
                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    return EnumC18550.f57480;
                                default:
                                    return EnumC18550.f57495;
                            }
                    }
            }
        }
        return EnumC18550.f57485;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33978(EnumC10637 enumC10637) {
        m33972(this.f42993.f70641, enumC10637);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33972(int i, EnumC10637 enumC10637) {
        C23168 c23168 = this.f43002;
        boolean m51351 = c23168.m51351(enumC10637);
        C22364 c22364 = this.f42979;
        if (m51351 && !c23168.m51347()) {
            c22364.m7279(EnumC20043.SOURCE_LEVEL, i, c23168.m51342(enumC10637));
            return;
        }
        EnumC16280 enumC16280 = this.f42983;
        if (!enumC10637.m26686(enumC16280)) {
            c22364.m7279(EnumC20043.SOURCE_LEVEL, i, enumC10637.m26684(enumC16280.f50071));
        } else if (c23168.m51351(enumC10637)) {
            c23168.m51344(new C7342(i), enumC10637);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34004(int i) {
        AbstractC12117 abstractC12117 = this.f42989;
        if (i > abstractC12117.f36194) {
            abstractC12117.f36194 = i;
        }
    }
}
