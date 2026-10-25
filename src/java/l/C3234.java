package l;

import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: F6OC */
/* renamed from: l.ۗ۫ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3234 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Set f10169;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Set f10170;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Set f10171;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f10172;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Set f10173;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Set f10174;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Set f10175;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Set f10176;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f10177 = new ArrayList();

    static {
        String[] strArr = {"area", "base", "br", "col", "embed", "hr", "img", "input", "link", "meta", "param", "source", "track", "wbr"};
        HashSet hashSet = new HashSet(14);
        for (int i = 0; i < 14; i++) {
            String str = strArr[i];
            C11003.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f10175 = C20195.unmodifiableSet(hashSet);
        Object[] objArr = {"pre", "textarea", "title", "xmp", "iframe", "noembed", "noframes", "noscript", "plaintext"};
        HashSet hashSet2 = new HashSet(9);
        for (int i2 = 0; i2 < 9; i2++) {
            Object obj = objArr[i2];
            C11003.requireNonNull(obj);
            if (!hashSet2.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f10174 = C20195.unmodifiableSet(hashSet2);
        String[] strArr2 = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", am.aC, "img", "li", "listing", "menu", "meta", "nobr", "ol", am.ax, "pre", "ruby", am.aB, "small", "span", "strong", "strike", "sub", "sup", "table", "tt", am.aH, "ul", "var"};
        HashSet hashSet3 = new HashSet(44);
        for (int i3 = 0; i3 < 44; i3++) {
            String str2 = strArr2[i3];
            C11003.requireNonNull(str2);
            if (!hashSet3.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        f10170 = C20195.unmodifiableSet(hashSet3);
        String[] strArr3 = {"address", "article", "aside", "blockquote", "center", ErrorBundle.DETAIL_ENTRY, "dialog", "dir", "div", "dl", "dt", "dd", "fieldset", "figcaption", "figure", "footer", c.c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "listing", "main", "menu", "nav", "ol", am.ax, "plaintext", "pre", "search", "section", ErrorBundle.SUMMARY_ENTRY, "table", "ul", "xmp"};
        HashSet hashSet4 = new HashSet(41);
        for (int i4 = 0; i4 < 41; i4++) {
            String str3 = strArr3[i4];
            C11003.requireNonNull(str3);
            if (!hashSet4.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        f10173 = C20195.unmodifiableSet(hashSet4);
        Object[] objArr2 = {"applet", "caption", "html", "table", "td", "th", "marquee", "object", "template"};
        HashSet hashSet5 = new HashSet(9);
        for (int i5 = 0; i5 < 9; i5++) {
            Object obj2 = objArr2[i5];
            C11003.requireNonNull(obj2);
            if (!hashSet5.add(obj2)) {
                throw new IllegalArgumentException(C5368.m15337(obj2, "duplicate element: "));
            }
        }
        f10171 = C20195.unmodifiableSet(hashSet5);
        String[] strArr4 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "dd", ErrorBundle.DETAIL_ENTRY, "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", c.c, "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", am.ax, "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", ErrorBundle.SUMMARY_ENTRY, "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};
        HashSet hashSet6 = new HashSet(83);
        for (int i6 = 0; i6 < 83; i6++) {
            String str4 = strArr4[i6];
            C11003.requireNonNull(str4);
            if (!hashSet6.add(str4)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str4));
            }
        }
        f10169 = C20195.unmodifiableSet(hashSet6);
        Object[] objArr3 = {"td", "th"};
        HashSet hashSet7 = new HashSet(2);
        for (int i7 = 0; i7 < 2; i7++) {
            Object obj3 = objArr3[i7];
            C11003.requireNonNull(obj3);
            if (!hashSet7.add(obj3)) {
                throw new IllegalArgumentException(C5368.m15337(obj3, "duplicate element: "));
            }
        }
        f10172 = C20195.unmodifiableSet(hashSet7);
        Object[] objArr4 = {"thead", "tbody", "tfoot"};
        HashSet hashSet8 = new HashSet(3);
        for (int i8 = 0; i8 < 3; i8++) {
            Object obj4 = objArr4[i8];
            C11003.requireNonNull(obj4);
            if (!hashSet8.add(obj4)) {
                throw new IllegalArgumentException(C5368.m15337(obj4, "duplicate element: "));
            }
        }
        f10176 = C20195.unmodifiableSet(hashSet8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4645 m9909() {
        ArrayList arrayList = this.f10177;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C4645) C18566.m43105(arrayList, 1);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m9912() {
        return this.f10177.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a3  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C4645 m9911(java.lang.String r17, java.util.Map r18, boolean r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3234.m9911(java.lang.String, java.util.Map, boolean, java.lang.Object):l.ۙ۫ۢ");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C4645 m9910(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3234.m9910(java.lang.String):l.ۙ۫ۢ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
    
        if (l.C20195.unmodifiableSet(r5).contains(r3) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0126, code lost:
    
        if (r3.equals("button") == false) goto L60;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9907(int r14, java.util.Set r15) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3234.m9907(int, java.util.Set):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C4645 m9906(int i) {
        ArrayList arrayList = this.f10177;
        C4645 c4645 = (C4645) arrayList.get(i);
        arrayList.subList(i, arrayList.size()).clear();
        return c4645;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m9908() {
        while (m9909() != null) {
            C4645 m9909 = m9909();
            if (m9909.f14735 == 0 || m9909.f14732 || m9909.f14734) {
                return;
            } else {
                C18473.m42953(this.f10177, 1);
            }
        }
    }
}
