package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import java.util.HashMap;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: HBJ7 */
/* renamed from: l.ܽ֨ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16305 implements Cloneable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final String[] f50150;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String[] f50151;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f50152;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f50153;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f50154;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f50155 = new HashMap();

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final String[] f50156;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f50159;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f50162;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f50157 = true;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f50158 = true;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f50164 = false;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f50160 = false;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f50161 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50165 = false;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f50163 = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", am.ax, "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", c.c, "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", ErrorBundle.DETAIL_ENTRY, "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        f50150 = new String[]{"object", "base", "font", "tt", am.aC, "b", am.aH, "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", am.av, "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", AnnotatedPrivateKey.LABEL, "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", ErrorBundle.SUMMARY_ENTRY, "command", e.p, "area", "basefont", "bgsound", "menuitem", "param", "source", "track", e.m, "bdi", am.aB, "strike", "nobr"};
        f50153 = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", e.p, "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        f50151 = new String[]{"title", am.av, am.ax, "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", am.aB};
        f50152 = new String[]{"pre", "plaintext", "title", "textarea"};
        f50156 = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        f50154 = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i = 0; i < 69; i++) {
            C16305 c16305 = new C16305(strArr[i]);
            f50155.put(c16305.f50159, c16305);
        }
        for (String str : f50150) {
            C16305 c163052 = new C16305(str);
            c163052.f50157 = false;
            c163052.f50158 = false;
            f50155.put(c163052.f50159, c163052);
        }
        for (String str2 : f50153) {
            C16305 c163053 = (C16305) f50155.get(str2);
            C16990.m39822(c163053);
            c163053.f50164 = true;
        }
        for (String str3 : f50151) {
            C16305 c163054 = (C16305) f50155.get(str3);
            C16990.m39822(c163054);
            c163054.f50158 = false;
        }
        for (String str4 : f50152) {
            C16305 c163055 = (C16305) f50155.get(str4);
            C16990.m39822(c163055);
            c163055.f50161 = true;
        }
        for (String str5 : f50156) {
            C16305 c163056 = (C16305) f50155.get(str5);
            C16990.m39822(c163056);
            c163056.f50165 = true;
        }
        for (String str6 : f50154) {
            C16305 c163057 = (C16305) f50155.get(str6);
            C16990.m39822(c163057);
            c163057.f50163 = true;
        }
    }

    public C16305(String str) {
        this.f50159 = str;
        this.f50162 = C23340.m51750(str);
    }

    public final String getName() {
        return this.f50159;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m38362() {
        return this.f50162;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16305 m38357(String str, C1489 c1489) {
        C16990.m39822((Object) str);
        HashMap hashMap = f50155;
        C16305 c16305 = (C16305) hashMap.get(str);
        if (c16305 != null) {
            return c16305;
        }
        String m5156 = c1489.m5156(str);
        C16990.m39823(m5156);
        String m51750 = C23340.m51750(m5156);
        C16305 c163052 = (C16305) hashMap.get(m51750);
        if (c163052 == null) {
            C16305 c163053 = new C16305(m5156);
            c163053.f50157 = false;
            return c163053;
        }
        if (!c1489.m5157() || m5156.equals(m51750)) {
            return c163052;
        }
        try {
            C16305 c163054 = (C16305) super.clone();
            c163054.f50159 = m5156;
            return c163054;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m38365() {
        return this.f50157;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38359() {
        return this.f50158;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m38363() {
        return !this.f50157;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m38367() {
        return this.f50164;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m38368() {
        return this.f50164 || this.f50160;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m38360() {
        return f50155.containsKey(this.f50159);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38358(String str) {
        return f50155.containsKey(str);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m38361() {
        return this.f50161;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m38366() {
        return this.f50165;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m38364() {
        this.f50160 = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16305)) {
            return false;
        }
        C16305 c16305 = (C16305) obj;
        return this.f50159.equals(c16305.f50159) && this.f50164 == c16305.f50164 && this.f50158 == c16305.f50158 && this.f50157 == c16305.f50157 && this.f50161 == c16305.f50161 && this.f50160 == c16305.f50160 && this.f50165 == c16305.f50165 && this.f50163 == c16305.f50163;
    }

    public final int hashCode() {
        return (((((((((((((this.f50159.hashCode() * 31) + (this.f50157 ? 1 : 0)) * 31) + (this.f50158 ? 1 : 0)) * 31) + (this.f50164 ? 1 : 0)) * 31) + (this.f50160 ? 1 : 0)) * 31) + (this.f50161 ? 1 : 0)) * 31) + (this.f50165 ? 1 : 0)) * 31) + (this.f50163 ? 1 : 0);
    }

    public final String toString() {
        return this.f50159;
    }

    public final Object clone() {
        try {
            return (C16305) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
