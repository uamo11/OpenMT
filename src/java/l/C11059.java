package l;

import android.content.res.AssetManager;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.umeng.analytics.pro.am;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: A6LD */
/* renamed from: l.ۧܳܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11059 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final List f33234;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.۫ܿܳ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.۬ܿܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27445(C13963 c13963, String str, boolean z, AssetManager assetManager, BufferedWriter bufferedWriter, String str2) {
        String str3;
        HashMap hashMap;
        C19814 m12729;
        String str4;
        int m27443;
        String m33414 = c13963.m33414();
        List<InterfaceC2707> list = f33234;
        if (m33414.length() > 1000000) {
            throw new C1886();
        }
        try {
            final C4792 c4792 = new C4792(m33414.length());
            C13602 c13602 = new C13602();
            c13602.m32711(list);
            c13602.m32716(new C15374(m33414));
            c13602.m32715(c4792);
            c13602.m32714((C13258) new InterfaceC22775() { // from class: l.۬ܿܳ
                @Override // l.InterfaceC22775
                /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final InterfaceC11487 mo32166(C4844 c4844) {
                    C4792.this.m13978(c4844);
                    return new C11848(c4844);
                }
            });
            c13602.m32713(EnumC5842.BLOCKS_AND_INLINES);
            AbstractC0197 m5145 = c13602.m32710().m5145(m33414);
            int i = 0;
            AbstractC0197 abstractC0197 = m5145;
            while (abstractC0197 != null) {
                i++;
                if (i > 100000) {
                    throw new C1886();
                }
                if (abstractC0197.m1341() != null) {
                    abstractC0197 = abstractC0197.m1341();
                } else {
                    while (abstractC0197 != m5145 && abstractC0197.m1352() == null) {
                        abstractC0197 = abstractC0197.mo1355();
                    }
                    abstractC0197 = abstractC0197 == m5145 ? null : abstractC0197.m1352();
                }
            }
            final String str5 = "data-mt-" + UUID.randomUUID();
            final String m37867 = C16014.m37867(str5, "-kind");
            final HashMap hashMap2 = new HashMap();
            final StringBuilder sb = new StringBuilder();
            final TreeMap treeMap = new TreeMap();
            C12773 c12773 = new C12773();
            for (InterfaceC2707 interfaceC2707 : list) {
                if (interfaceC2707 instanceof InterfaceC12068) {
                    ((InterfaceC12068) interfaceC2707).mo6576(c12773);
                }
            }
            c12773.m31085();
            c12773.m31084((C12553) new InterfaceC7834() { // from class: l.۫ܿܳ
                /* JADX WARN: Type inference failed for: r0v0, types: [l.ۛܿܳ] */
                @Override // l.InterfaceC7834
                public final C6203 create() {
                    final String str6 = m37867;
                    final String str7 = str5;
                    final HashMap hashMap3 = hashMap2;
                    return new InterfaceC0778() { // from class: l.ۛܿܳ
                        @Override // l.InterfaceC0778
                        /* renamed from: ֫ */
                        public final void mo2959(AbstractC0197 abstractC01972, String str8, LinkedHashMap linkedHashMap) {
                            if (abstractC01972 instanceof C14308) {
                                C14308 c14308 = (C14308) abstractC01972;
                                if ("pre".equals(str8)) {
                                    String str9 = c14308.m34142().trim().split("\\s+", 2)[0];
                                    if (str9.equals("math") || str9.equals("mermaid")) {
                                        linkedHashMap.put(str6, str9);
                                    }
                                }
                            }
                            if ((!(abstractC01972 instanceof AbstractC11342) && !(abstractC01972 instanceof AbstractC10782)) || (abstractC01972 instanceof C20315) || abstractC01972.m1351().isEmpty()) {
                                return;
                            }
                            List m1351 = abstractC01972.m1351();
                            int m46028 = ((C19954) m1351.get(0)).m46028();
                            int m460282 = ((C19954) C7166.m19188(1, m1351)).m46028();
                            linkedHashMap.put(str7, m46028 + ":" + m460282);
                            if ("pre".equals(str8)) {
                                boolean z2 = abstractC01972 instanceof C14308;
                                if (z2 || (abstractC01972 instanceof C15719)) {
                                    hashMap3.put(m46028 + ":" + m460282, Integer.toString(m46028 + (z2 ? 1 : 0)));
                                }
                            }
                        }
                    };
                }
            });
            c12773.m31083(new InterfaceC4307() { // from class: l.ۤܿܳ
                @Override // l.InterfaceC4307
                /* renamed from: ֫ */
                public final InterfaceC5012 mo8836(InterfaceC19830 interfaceC19830) {
                    return new C23136(m37867, interfaceC19830, treeMap, sb);
                }
            });
            c12773.m31082().m16156(m5145, sb);
            C0762 m2906 = C0762.m2906("https://markdown.invalid/");
            C10662 c10662 = new C10662(new C17136());
            c10662.m26765();
            m2906.m2917().m45562(0, c10662.m26757(sb.toString(), m2906.m2917(), m2906.mo25050()));
            Iterator<E> it = C11779.m28821(new C11263(), m2906).iterator();
            while (it.hasNext()) {
                C19814 c19814 = (C19814) it.next();
                if (!c19814.mo25052(str5) && (m27443 = m27443(treeMap, c19814.m28100().m5480().m19131())) >= 0) {
                    int m274432 = m27443(treeMap, c19814.m45578().m5477().m19131() - 1);
                    if (m274432 < m27443) {
                        m274432 = m27443(treeMap, c19814.m28100().m5477().m19131() - 1);
                    }
                    c19814.mo20901(str5, m27443 + ":" + Math.max(m27443, m274432));
                }
            }
            C12484 c12484 = new C12484();
            c12484.m30644(am.av, "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", am.aC, "img", "li", "ol", am.ax, "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", am.aH, "ul");
            c12484.m30643(am.av, "href", "title");
            c12484.m30643("blockquote", "cite");
            c12484.m30643("col", "span", "width");
            c12484.m30643("colgroup", "span", "width");
            c12484.m30643("img", "align", "alt", "height", "src", "title", "width");
            c12484.m30643("ol", "start", "type");
            c12484.m30643("q", "cite");
            c12484.m30643("table", ErrorBundle.SUMMARY_ENTRY, "width");
            String str6 = "span";
            HashMap hashMap3 = hashMap2;
            c12484.m30643("td", "abbr", "axis", "colspan", "rowspan", "width");
            c12484.m30643("th", "abbr", "axis", "colspan", "rowspan", "scope", "width");
            c12484.m30643("ul", "type");
            c12484.m30642(am.av, "href", "ftp", a.s, b.a, "mailto");
            c12484.m30642("blockquote", "cite", a.s, b.a);
            c12484.m30642("cite", "cite", a.s, b.a);
            c12484.m30642("img", "src", a.s, b.a);
            c12484.m30642("q", "cite", a.s, b.a);
            c12484.m30644("div", "span", "del", am.aB, "hr", ErrorBundle.DETAIL_ENTRY, ErrorBundle.SUMMARY_ENTRY, "input");
            c12484.m30643(":all", str5, m37867);
            c12484.m30643(ErrorBundle.DETAIL_ENTRY, "open");
            c12484.m30643("th", "align");
            c12484.m30643("td", "align");
            c12484.m30643("input", "checked");
            c12484.m30641("type", "checkbox");
            c12484.m30641("disabled", "disabled");
            c12484.m30642(am.av, "href", "#");
            c12484.m30640();
            C0762 m48916 = new C21657(c12484).m48916(m2906);
            m48916.m2907().m978();
            Iterator<E> it2 = m48916.m45575("th[align],td[align]").iterator();
            while (it2.hasNext()) {
                C19814 c198142 = (C19814) it2.next();
                String lowerCase = c198142.mo25048("align").toLowerCase(Locale.ROOT);
                if (lowerCase.equals("left") || lowerCase.equals("center") || lowerCase.equals("right")) {
                    c198142.mo20901("align", lowerCase);
                } else {
                    c198142.m45590("align");
                }
            }
            C16990.m39823(m37867);
            Iterator<E> it3 = C11779.m28821(new C16906(m37867.trim()), m48916).iterator();
            while (it3.hasNext()) {
                C19814 c198143 = (C19814) it3.next();
                String mo25048 = c198143.mo25048(m37867);
                c198143.m45590(m37867);
                c198143.mo20901("data-mt-render", mo25048);
                String m45568 = c198143.m45568();
                c198143.m45581();
                c198143.mo2916(m45568);
                c198143.m45573(mo25048.equals("inline-math") ? str6 : "div");
                c198143.m45582("mt-".concat(mo25048));
            }
            C16990.m39823(str5);
            Iterator<E> it4 = C11779.m28821(new C16906(str5.trim()), m48916).iterator();
            while (it4.hasNext()) {
                C19814 c198144 = (C19814) it4.next();
                String mo250482 = c198144.mo25048(str5);
                int indexOf = mo250482.indexOf(58);
                c198144.m45590(str5);
                c198144.mo20901("data-source-start", mo250482.substring(0, indexOf));
                c198144.mo20901("data-source-end", mo250482.substring(indexOf + 1));
                if (c198144.m45588().equals("pre")) {
                    hashMap = hashMap3;
                    if (hashMap.containsKey(mo250482) && (m12729 = C4228.m12729("code", c198144)) != null) {
                        String m455682 = m12729.m45568();
                        m12729.m45581();
                        int parseInt = Integer.parseInt((String) hashMap.get(mo250482));
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 <= m455682.length()) {
                            if (i2 >= m455682.length() || m455682.charAt(i2) == '\n') {
                                if (i2 > i3 || i2 < m455682.length()) {
                                    str4 = str6;
                                    C19814 m45592 = m12729.m45592(str4);
                                    m45592.mo20901("data-source-start", Integer.toString(parseInt));
                                    m45592.mo20901("data-source-end", Integer.toString(parseInt));
                                    m45592.mo2916(m455682.substring(i3, i2));
                                } else {
                                    str4 = str6;
                                }
                                if (i2 < m455682.length()) {
                                    m12729.m45584(new C10787("\n"));
                                }
                                i3 = i2 + 1;
                                parseInt++;
                            } else {
                                str4 = str6;
                            }
                            i2++;
                            str6 = str4;
                        }
                    }
                    str3 = str6;
                } else {
                    str3 = str6;
                    hashMap = hashMap3;
                }
                hashMap3 = hashMap;
                str6 = str3;
            }
            HashSet hashSet = new HashSet();
            Iterator<E> it5 = m48916.m45575("input").iterator();
            while (it5.hasNext()) {
                C19814 c198145 = (C19814) it5.next();
                C19814 mo28099 = c198145.mo28099();
                if (mo28099 != null && mo28099.m45588().equals(am.ax)) {
                    mo28099 = mo28099.mo28099();
                }
                if (mo28099 != null && mo28099.m45588().equals("li")) {
                    mo28099.m45582("task-list-item");
                    c198145.m45582("task-list-item-checkbox");
                }
            }
            Iterator<E> it6 = m48916.m45575("h1,h2,h3,h4,h5,h6").iterator();
            while (it6.hasNext()) {
                C19814 c198146 = (C19814) it6.next();
                String lowerCase2 = c198146.m45576().toLowerCase(Locale.ROOT);
                StringBuilder sb2 = new StringBuilder();
                int i4 = 0;
                while (i4 < lowerCase2.length()) {
                    int codePointAt = lowerCase2.codePointAt(i4);
                    i4 += Character.charCount(codePointAt);
                    if (Character.isLetterOrDigit(codePointAt) || codePointAt == 95 || codePointAt == 45) {
                        sb2.appendCodePoint(codePointAt);
                    } else if (Character.isWhitespace(codePointAt)) {
                        sb2.append('-');
                    }
                }
                String sb3 = sb2.length() == 0 ? "section" : sb2.toString();
                int i5 = 1;
                String str7 = sb3;
                while (!hashSet.add(str7)) {
                    str7 = sb3 + "-" + i5;
                    i5++;
                }
                C16990.m39822((Object) str7);
                c198146.mo20901("id", str7);
            }
            boolean isEmpty = m48916.m45575("[data-mt-render]").isEmpty();
            String uuid = UUID.randomUUID().toString();
            StringBuilder sb4 = new StringBuilder("<!doctype html><html data-theme=\"");
            sb4.append(z ? "dark" : "light");
            sb4.append("\"><head><meta charset=\"utf-8\"><title>");
            C19814 c198147 = new C19814("title");
            c198147.mo2916(str);
            sb4.append(c198147.m45580());
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "</title><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none'; img-src https: http: data:; font-src https://cdn.bootcdn.net/ajax/libs/KaTeX/0.16.47/fonts/; style-src 'self' 'unsafe-inline'; script-src 'unsafe-inline' 'nonce-", uuid, "'; base-uri 'none'; form-action 'none'\"><style nonce=\"", uuid);
            sb4.append("\">");
            bufferedWriter.write(sb4.toString());
            String[] strArr = {"light", "dark"};
            for (int i6 = 0; i6 < 2; i6++) {
                String str8 = strArr[i6];
                bufferedWriter.write(m27444(assetManager, C4860.m14172("github-markdown-", str8, ".css")).replace(".markdown-body", "html[data-theme=\"" + str8 + "\"] .markdown-body"));
            }
            bufferedWriter.write(m27444(assetManager, "preview.css"));
            C19814 c198148 = new C19814("article");
            c198148.m45582("markdown-body");
            c198148.mo20901("data-render-error", str2);
            bufferedWriter.write("</style></head><body><article" + c198148.mo25045().m36737() + ">");
            m48916.m2917().m45563(bufferedWriter);
            bufferedWriter.write("</article><script nonce=\"" + uuid + "\">");
            bufferedWriter.write(m27444(assetManager, "preview.js"));
            bufferedWriter.write("</script>");
            if (!isEmpty) {
                bufferedWriter.write("<script nonce=\"" + uuid + "\">");
                bufferedWriter.write(m27444(assetManager, "enhance.js"));
                bufferedWriter.write("</script>");
            }
            bufferedWriter.write("</body></html>");
        } catch (C7614 unused) {
            throw new C1886();
        }
    }

    static {
        int i = 0;
        Object[] objArr = {new C3412(), new C19641(), new C2022()};
        ArrayList arrayList = new ArrayList(3);
        while (i < 3) {
            Object obj = objArr[i];
            i = C8954.m23073(obj, arrayList, obj, i, 1);
        }
        f33234 = C20195.unmodifiableList(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m27444(AssetManager assetManager, String str) {
        InputStream open = assetManager.open("markdown-preview/" + str);
        try {
            String m49848 = C22194.m49848(open, StandardCharsets.UTF_8);
            if (open != null) {
                open.close();
            }
            return m49848;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27443(TreeMap treeMap, int i) {
        Map.Entry floorEntry = treeMap.floorEntry(Integer.valueOf(i));
        if (floorEntry == null) {
            return -1;
        }
        return ((Integer) floorEntry.getValue()).intValue();
    }
}
