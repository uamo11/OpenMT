package l;

import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GBIX */
/* renamed from: l.ܺ᩹ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16221 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f49946 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f49947;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3606 f49948;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f49945 = {",", ">", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "~", " "};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f49944 = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f49943 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f49942 = Pattern.compile("([+-])?(\\d+)");

    public C16221(String str) {
        C16990.m39823(str);
        String trim = str.trim();
        this.f49947 = trim;
        this.f49948 = new C3606(trim);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC21162 m38169(String str) {
        try {
            return new C16221(str).m38178();
        } catch (IllegalArgumentException e) {
            throw new C2817(e.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21162 m38178() {
        C3606 c3606 = this.f49948;
        c3606.m11069();
        String[] strArr = f49945;
        boolean m11065 = c3606.m11065(strArr);
        ArrayList arrayList = this.f49946;
        if (m11065) {
            arrayList.add(new C15515());
            m38170(c3606.m11063());
        } else {
            m38175();
        }
        while (!c3606.m11066()) {
            boolean m11069 = c3606.m11069();
            if (c3606.m11065(strArr)) {
                m38170(c3606.m11063());
            } else if (m11069) {
                m38170(' ');
            } else {
                m38175();
            }
        }
        if (arrayList.size() == 1) {
            return (AbstractC21162) arrayList.get(0);
        }
        return new C23067(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m38170(char r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16221.m38170(char):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38175() {
        C3606 c3606 = this.f49948;
        boolean m11064 = c3606.m11064("#");
        ArrayList arrayList = this.f49946;
        if (m11064) {
            String m11067 = c3606.m11067();
            C16990.m39823(m11067);
            arrayList.add(new C1384(m11067));
            return;
        }
        if (c3606.m11064(".")) {
            String m110672 = c3606.m11067();
            C16990.m39823(m110672);
            arrayList.add(new C16200(m110672.trim()));
            return;
        }
        if (c3606.m11071() || c3606.m11068("*|")) {
            String m51751 = C23340.m51751(c3606.m11070());
            C16990.m39823(m51751);
            if (!m51751.startsWith("*|")) {
                if (m51751.contains("|")) {
                    m51751 = m51751.replace("|", ":");
                }
                arrayList.add(new C23983(m51751));
                return;
            }
            List asList = Arrays.asList(new C23983(m51751.substring(2)), new C7050(m51751.replace("*|", ":")));
            C13894 c13894 = new C13894();
            int i = c13894.f23312;
            ArrayList arrayList2 = c13894.f23311;
            if (i > 1) {
                arrayList2.add(new C23067(asList));
            } else {
                arrayList2.addAll(asList);
            }
            c13894.f23312 = arrayList2.size();
            arrayList.add(c13894);
            return;
        }
        boolean m11068 = c3606.m11068("[");
        String str = this.f49947;
        if (m11068) {
            C3606 c36062 = new C3606(c3606.m11059('[', ']'));
            String m11060 = c36062.m11060(f49944);
            C16990.m39823(m11060);
            c36062.m11069();
            if (c36062.m11066()) {
                if (m11060.startsWith("^")) {
                    arrayList.add(new C17612(m11060.substring(1)));
                    return;
                } else {
                    arrayList.add(new C16906(m11060));
                    return;
                }
            }
            if (c36062.m11064("=")) {
                arrayList.add(new C14789(m11060, c36062.m11062(), true));
                return;
            }
            if (c36062.m11064("!=")) {
                arrayList.add(new C9852(m11060, c36062.m11062(), true));
                return;
            }
            if (c36062.m11064("^=")) {
                arrayList.add(new C9146(m11060, c36062.m11062(), false));
                return;
            }
            if (c36062.m11064("$=")) {
                arrayList.add(new C7029(m11060, c36062.m11062(), false));
                return;
            }
            if (c36062.m11064("*=")) {
                arrayList.add(new C23962(m11060, c36062.m11062(), true));
                return;
            }
            if (!c36062.m11064("~=")) {
                throw new C2817("Could not parse attribute query '%s': unexpected token at '%s'", str, c36062.m11062());
            }
            Pattern compile = Pattern.compile(c36062.m11062());
            C21141 c21141 = new C21141();
            c21141.f68168 = C23340.m51751(m11060);
            c21141.f68169 = compile;
            arrayList.add(c21141);
            return;
        }
        if (c3606.m11064("*")) {
            arrayList.add(new C11263());
            return;
        }
        if (c3606.m11064(":lt(")) {
            arrayList.add(new C22551(m38173()));
            return;
        }
        if (c3606.m11064(":gt(")) {
            arrayList.add(new C21846(m38173()));
            return;
        }
        if (c3606.m11064(":eq(")) {
            arrayList.add(new C8440(m38173()));
            return;
        }
        if (c3606.m11068(":has(")) {
            c3606.m11061(":has");
            String m11059 = c3606.m11059('(', ')');
            C16990.m39824(m11059, ":has(selector) sub-select must not be empty");
            arrayList.add(new C19045(m38169(m11059)));
            return;
        }
        if (c3606.m11068(":contains(")) {
            m38171(false);
            return;
        }
        if (c3606.m11068(":containsOwn(")) {
            m38171(true);
            return;
        }
        if (c3606.m11068(":containsWholeText(")) {
            m38174(false);
            return;
        }
        if (c3606.m11068(":containsWholeOwnText(")) {
            m38174(true);
            return;
        }
        if (c3606.m11068(":containsData(")) {
            c3606.m11061(":containsData");
            String m11057 = C3606.m11057(c3606.m11059('(', ')'));
            C16990.m39824(m11057, ":containsData(text) query must not be empty");
            arrayList.add(new C2796(m11057));
            return;
        }
        if (c3606.m11068(":matches(")) {
            m38176(false);
            return;
        }
        if (c3606.m11068(":matchesOwn(")) {
            m38176(true);
            return;
        }
        if (c3606.m11068(":matchesWholeText(")) {
            m38177(false);
            return;
        }
        if (c3606.m11068(":matchesWholeOwnText(")) {
            m38177(true);
            return;
        }
        if (c3606.m11068(":not(")) {
            c3606.m11061(":not");
            String m110592 = c3606.m11059('(', ')');
            C16990.m39824(m110592, ":not(selector) subselect must not be empty");
            AbstractC21162 m38169 = m38169(m110592);
            C5639 c5639 = new C5639();
            c5639.f70032 = m38169;
            arrayList.add(c5639);
            return;
        }
        if (c3606.m11064(":nth-child(")) {
            m38172(false, false);
            return;
        }
        if (c3606.m11064(":nth-last-child(")) {
            m38172(true, false);
            return;
        }
        if (c3606.m11064(":nth-of-type(")) {
            m38172(false, true);
            return;
        }
        if (c3606.m11064(":nth-last-of-type(")) {
            m38172(true, true);
            return;
        }
        if (c3606.m11064(":first-child")) {
            arrayList.add(new C4912());
            return;
        }
        if (c3606.m11064(":last-child")) {
            arrayList.add(new C13378());
            return;
        }
        if (c3606.m11064(":first-of-type")) {
            arrayList.add(new C3501(0, 1));
            return;
        }
        if (c3606.m11064(":last-of-type")) {
            arrayList.add(new C12673(0, 1));
            return;
        }
        if (c3606.m11064(":only-child")) {
            arrayList.add(new C14083());
            return;
        }
        if (c3606.m11064(":only-of-type")) {
            arrayList.add(new C7734());
            return;
        }
        if (c3606.m11064(":empty")) {
            arrayList.add(new C20435());
        } else if (c3606.m11064(":root")) {
            arrayList.add(new C2111());
        } else {
            if (!c3606.m11064(":matchText")) {
                throw new C2817("Could not parse query '%s': unexpected token at '%s'", str, c3606.m11062());
            }
            arrayList.add(new C11284());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38172(boolean z, boolean z2) {
        String m51751 = C23340.m51751(this.f49948.m11058());
        Matcher matcher = f49943.matcher(m51751);
        Matcher matcher2 = f49942.matcher(m51751);
        int i = 2;
        int i2 = 1;
        if (!"odd".equals(m51751)) {
            if ("even".equals(m51751)) {
                i2 = 0;
            } else if (matcher.matches()) {
                int parseInt = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = parseInt;
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            } else {
                throw new C2817("Could not parse nth-index '%s': unexpected format", m51751);
            }
        }
        ArrayList arrayList = this.f49946;
        if (z2) {
            if (z) {
                arrayList.add(new C11968(i, i2));
                return;
            } else {
                arrayList.add(new C23256(i, i2));
                return;
            }
        }
        if (z) {
            arrayList.add(new C6323(i, i2));
        } else {
            arrayList.add(new C10557(i, i2));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m38173() {
        String trim = this.f49948.m11058().trim();
        int i = C20519.f66111;
        boolean z = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                }
                if (!Character.isDigit(trim.codePointAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        if (!z) {
            throw new C14167("Index must be numeric");
        }
        return Integer.parseInt(trim);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38171(boolean z) {
        Object c19024;
        String str = z ? ":containsOwn" : ":contains";
        C3606 c3606 = this.f49948;
        c3606.m11061(str);
        String m11057 = C3606.m11057(c3606.m11059('(', ')'));
        C16990.m39824(m11057, str.concat("(text) query must not be empty"));
        if (z) {
            c19024 = new C4207(m11057);
        } else {
            c19024 = new C19024(m11057);
        }
        this.f49946.add(c19024);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m38174(boolean z) {
        Object c0678;
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        C3606 c3606 = this.f49948;
        c3606.m11061(str);
        String m11057 = C3606.m11057(c3606.m11059('(', ')'));
        C16990.m39824(m11057, str.concat("(text) query must not be empty"));
        if (z) {
            c0678 = new C19730(m11057);
        } else {
            c0678 = new C0678(m11057);
        }
        this.f49946.add(c0678);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38176(boolean z) {
        Object c16927;
        String str = z ? ":matchesOwn" : ":matches";
        C3606 c3606 = this.f49948;
        c3606.m11061(str);
        String m11059 = c3606.m11059('(', ')');
        C16990.m39824(m11059, str.concat("(regex) query must not be empty"));
        if (z) {
            c16927 = new C18339(Pattern.compile(m11059));
        } else {
            c16927 = new C16927(Pattern.compile(m11059));
        }
        this.f49946.add(c16927);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m38177(boolean z) {
        Object c14810;
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        C3606 c3606 = this.f49948;
        c3606.m11061(str);
        String m11059 = c3606.m11059('(', ')');
        C16990.m39824(m11059, str.concat("(regex) query must not be empty"));
        if (z) {
            c14810 = new C17633(Pattern.compile(m11059));
        } else {
            c14810 = new C14810(Pattern.compile(m11059));
        }
        this.f49946.add(c14810);
    }

    public final String toString() {
        return this.f49947;
    }
}
