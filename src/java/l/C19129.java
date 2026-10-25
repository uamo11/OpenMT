package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.o;
import java.util.Arrays;

/* compiled from: JBJ2 */
/* renamed from: l.᩵֨ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19129 {

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final char[] f60278;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f60279 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, o.a.B, o.a.C, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17842 f60280;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17011 f60282;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f60283;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f60284;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9251 f60285;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23361 f60286;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC8545 f60287;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7258 f60288;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20540 f60289;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f60290;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14188 f60291;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f60294;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f60296;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int[] f60297;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC19541 f60281 = EnumC19541.f63120;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC2195 f60298 = null;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f60292 = false;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f60295 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f60293 = new StringBuilder(1024);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public StringBuilder f60299 = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f60278 = cArr;
        Arrays.sort(cArr);
    }

    public C19129(C17842 c17842, C7258 c7258) {
        C9251 c9251 = new C9251();
        this.f60285 = c9251;
        this.f60289 = new C20540();
        this.f60287 = c9251;
        this.f60282 = new C17011();
        this.f60286 = new C23361();
        this.f60291 = new C14188();
        this.f60290 = -1;
        this.f60294 = new int[1];
        this.f60297 = new int[2];
        this.f60280 = c17842;
        this.f60288 = c7258;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC2195 m44169() {
        while (!this.f60292) {
            this.f60281.mo1032(this, this.f60280);
        }
        StringBuilder sb = this.f60293;
        int length = sb.length();
        C17011 c17011 = this.f60282;
        if (length != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            c17011.m39894(sb2);
            this.f60295 = null;
            return c17011;
        }
        String str = this.f60295;
        if (str != null) {
            c17011.m39894(str);
            this.f60295 = null;
            return c17011;
        }
        this.f60292 = false;
        return this.f60298;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44166(AbstractC2195 abstractC2195) {
        if (!this.f60292) {
            this.f60298 = abstractC2195;
            this.f60292 = true;
            abstractC2195.m7253(this.f60296);
            abstractC2195.m7251(this.f60280.m41777());
            this.f60290 = -1;
            EnumC15599 enumC15599 = abstractC2195.f7214;
            if (enumC15599 == EnumC15599.StartTag) {
                this.f60284 = ((C9251) abstractC2195).f26117;
                this.f60283 = null;
                return;
            } else {
                if (enumC15599 == EnumC15599.EndTag) {
                    C20540 c20540 = (C20540) abstractC2195;
                    if (c20540.m22252()) {
                        m44164("Attributes incorrectly present on end tag [/%s]", c20540.f26122);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new C14167("Must be false");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44163(String str) {
        if (this.f60295 == null) {
            this.f60295 = str;
        } else {
            StringBuilder sb = this.f60293;
            if (sb.length() == 0) {
                sb.append(this.f60295);
            }
            sb.append(str);
        }
        int i = this.f60290;
        C17011 c17011 = this.f60282;
        c17011.m7253(i);
        c17011.m7251(this.f60280.m41777());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44165(StringBuilder sb) {
        if (this.f60295 == null) {
            this.f60295 = sb.toString();
        } else {
            StringBuilder sb2 = this.f60293;
            if (sb2.length() == 0) {
                sb2.append(this.f60295);
            }
            sb2.append((CharSequence) sb);
        }
        int i = this.f60290;
        C17011 c17011 = this.f60282;
        c17011.m7253(i);
        c17011.m7251(this.f60280.m41777());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44162(char c) {
        if (this.f60295 == null) {
            this.f60295 = String.valueOf(c);
        } else {
            StringBuilder sb = this.f60293;
            if (sb.length() == 0) {
                sb.append(this.f60295);
            }
            sb.append(c);
        }
        int i = this.f60290;
        C17011 c17011 = this.f60282;
        c17011.m7253(i);
        c17011.m7251(this.f60280.m41777());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44177(EnumC19541 enumC19541) {
        int i = C18423.f57171[enumC19541.ordinal()];
        C17842 c17842 = this.f60280;
        if (i == 1) {
            this.f60296 = c17842.m41777();
        } else if (i == 2 && this.f60290 == -1) {
            this.f60290 = c17842.m41777();
        }
        this.f60281 = enumC19541;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44167(EnumC19541 enumC19541) {
        m44177(enumC19541);
        this.f60280.m41782();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m44168(Character ch, boolean z) {
        int i;
        C17842 c17842 = this.f60280;
        if (!c17842.m41785() && ((ch == null || ch.charValue() != c17842.m41799()) && !c17842.m41806(f60278))) {
            c17842.m41807();
            boolean m41796 = c17842.m41796("#");
            int[] iArr = this.f60294;
            if (m41796) {
                boolean m41801 = c17842.m41801("X");
                String m41797 = m41801 ? c17842.m41797() : c17842.m41803();
                if (m41797.length() == 0) {
                    m44159("numeric reference with no numerals", new Object[0]);
                    c17842.m41788();
                    return null;
                }
                c17842.m41810();
                if (!c17842.m41796(l.b)) {
                    m44159("missing semicolon on [&#%s]", m41797);
                }
                try {
                    i = Integer.valueOf(m41797, m41801 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i = -1;
                }
                if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                    m44159("character [%s] outside of valid range", Integer.valueOf(i));
                    iArr[0] = 65533;
                } else {
                    if (i >= 128 && i < 160) {
                        m44159("character [%s] is not a valid unicode code point", Integer.valueOf(i));
                        i = f60279[i + a.g];
                    }
                    iArr[0] = i;
                }
                return iArr;
            }
            String m41787 = c17842.m41787();
            boolean m41795 = c17842.m41795(';');
            if (!C12757.m31062(m41787) && (!C12757.m31063(m41787) || !m41795)) {
                c17842.m41788();
                if (m41795) {
                    m44159("invalid named reference [%s]", m41787);
                }
            } else {
                if (z && (c17842.m41786() || c17842.m41776() || c17842.m41802(a.h, '-', '_'))) {
                    c17842.m41788();
                    return null;
                }
                c17842.m41810();
                if (!c17842.m41796(l.b)) {
                    m44159("missing semicolon on [&%s]", m41787);
                }
                int[] iArr2 = this.f60297;
                int m31058 = C12757.m31058(m41787, iArr2);
                if (m31058 == 1) {
                    iArr[0] = iArr2[0];
                    return iArr;
                }
                if (m31058 == 2) {
                    return iArr2;
                }
                throw new C14167("Unexpected characters returned for ".concat(m41787));
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8545 m44161(boolean z) {
        AbstractC8545 abstractC8545;
        if (z) {
            abstractC8545 = this.f60285;
            abstractC8545.mo7259();
        } else {
            abstractC8545 = this.f60289;
            abstractC8545.mo7259();
        }
        this.f60287 = abstractC8545;
        return abstractC8545;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m44172() {
        this.f60287.m22258();
        m44166(this.f60287);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44176() {
        m44166(this.f60291);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44175() {
        m44166(this.f60286);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44173() {
        AbstractC2195.m7249(this.f60299);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m44178() {
        return this.f60284 != null && this.f60287.m22251().equalsIgnoreCase(this.f60284);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m44160() {
        return this.f60284;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m44170() {
        if (this.f60283 == null) {
            this.f60283 = C20094.m46315("</", this.f60284);
        }
        return this.f60283;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44174(EnumC19541 enumC19541) {
        C7258 c7258 = this.f60288;
        if (c7258.m19424()) {
            C17842 c17842 = this.f60280;
            c7258.add(new C13607(c17842, "Unexpected character '%s' in input state [%s]", Character.valueOf(c17842.m41799()), enumC19541));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44171(EnumC19541 enumC19541) {
        C7258 c7258 = this.f60288;
        if (c7258.m19424()) {
            c7258.add(new C13607(this.f60280, "Unexpectedly reached end of file (EOF) in input state [%s]", enumC19541));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m44159(String str, Object... objArr) {
        C7258 c7258 = this.f60288;
        if (c7258.m19424()) {
            c7258.add(new C13607(this.f60280, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44164(String str, Object... objArr) {
        C7258 c7258 = this.f60288;
        if (c7258.m19424()) {
            c7258.add(new C13607(this.f60280, str, objArr));
        }
    }
}
