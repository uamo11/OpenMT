package l;

import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: 17P5 */
/* renamed from: l.ܿܽۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17463 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f53372;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f53373;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53345 = Pattern.compile("\r\n?");

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC11581 f53363 = AbstractC11581.m28472('\n');

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53347 = Pattern.compile("^[ \t]*\n[ \t]*[*]?[ \t]?");

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53360 = Pattern.compile("^@(param\\s+<\\w+>|[a-z]\\w*)");

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f53365 = Pattern.compile("^<!--\\s*MOE:begin_intracomment_strip\\s*-->");

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f53366 = Pattern.compile("^<!--\\s*MOE:end_intracomment_strip\\s*-->");

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53361 = Pattern.compile("^<!--.*?-->", 32);

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53349 = m40831("pre");

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53354 = m40827("pre");

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53352 = m40831("code");

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53353 = m40827("code");

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53358 = m40831("table");

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f53367 = m40827("table");

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f53351 = m40831("ul|ol|dl");

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f53342 = m40827("ul|ol|dl");

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f53343 = m40831("li|dt|dd");

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53348 = m40827("li|dt|dd");

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53346 = m40831("h[1-6]");

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53344 = m40827("h[1-6]");

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f53356 = m40831(am.ax);

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f53357 = m40827(am.ax);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53350 = m40831("blockquote");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f53368 = m40827("blockquote");

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f53364 = m40831("br");

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53355 = Pattern.compile("^[{]@snippet\\b");

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f53362 = Pattern.compile("^[{]@\\w*");

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53359 = Pattern.compile("^.[^ \t\n@<{}*]*", 32);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20992 f53369 = new C20992();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20992 f53374 = new C20992();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20992 f53370 = new C20992();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20992 f53371 = new C20992();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m40829(String str) {
        boolean z;
        int mo25528;
        EnumC9703 enumC9703;
        EnumC9703 enumC97032;
        C4025.m12107(str, "Missing /**: %s", str.startsWith("/**"));
        C4025.m12107(str, "Missing */: %s", str.endsWith("*/") && str.length() > 4);
        String replaceAll = f53345.matcher(str.substring(3, str.length() - 2)).replaceAll("\n");
        C1941 c1941 = new C1941();
        replaceAll.getClass();
        c1941.f6489 = replaceAll;
        C17463 c17463 = new C17463(c1941);
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        c1846.m16264(new C8997(EnumC9703.BEGIN_JAVADOC, "/**"));
        while (!c1941.f6489.isEmpty()) {
            boolean m40830 = c17463.m40830();
            if (c1941.m6400(f53347)) {
                c17463.f53373 = false;
                enumC97032 = m40830 ? EnumC9703.FORCED_NEWLINE : EnumC9703.WHITESPACE;
            } else if (c1941.m6399(" ") || c1941.m6399("\t")) {
                enumC97032 = m40830 ? EnumC9703.LITERAL : EnumC9703.WHITESPACE;
            } else if (c17463.f53373 || !c1941.m6400(f53360)) {
                c17463.f53373 = true;
                boolean m6400 = c1941.m6400(f53355);
                C20992 c20992 = c17463.f53369;
                if (m6400) {
                    if (c20992.m47800() == 0) {
                        c20992.m47799();
                        c17463.f53372 = true;
                        enumC97032 = EnumC9703.SNIPPET_BEGIN;
                    } else {
                        c20992.m47799();
                        enumC97032 = EnumC9703.LITERAL;
                    }
                } else if (c1941.m6400(f53362)) {
                    c20992.m47799();
                    enumC97032 = EnumC9703.LITERAL;
                } else if (c1941.m6399("{")) {
                    c20992.m47801();
                    enumC97032 = EnumC9703.LITERAL;
                } else if (!c1941.m6399(l.d)) {
                    boolean m47803 = c20992.m47803();
                    Pattern pattern = f53359;
                    if (!m47803) {
                        boolean m64002 = c1941.m6400(f53349);
                        C20992 c209922 = c17463.f53374;
                        if (m64002) {
                            c209922.m47799();
                            enumC97032 = m40830 ? EnumC9703.LITERAL : EnumC9703.PRE_OPEN_TAG;
                        } else if (c1941.m6400(f53354)) {
                            c209922.m47798();
                            enumC97032 = c17463.m40830() ? EnumC9703.LITERAL : EnumC9703.PRE_CLOSE_TAG;
                        } else {
                            boolean m64003 = c1941.m6400(f53352);
                            C20992 c209923 = c17463.f53370;
                            if (m64003) {
                                c209923.m47799();
                                enumC97032 = m40830 ? EnumC9703.LITERAL : EnumC9703.CODE_OPEN_TAG;
                            } else if (c1941.m6400(f53353)) {
                                c209923.m47798();
                                enumC97032 = c17463.m40830() ? EnumC9703.LITERAL : EnumC9703.CODE_CLOSE_TAG;
                            } else {
                                boolean m64004 = c1941.m6400(f53358);
                                C20992 c209924 = c17463.f53371;
                                if (m64004) {
                                    c209924.m47799();
                                    enumC97032 = m40830 ? EnumC9703.LITERAL : EnumC9703.TABLE_OPEN_TAG;
                                } else if (c1941.m6400(f53367)) {
                                    c209924.m47798();
                                    enumC97032 = c17463.m40830() ? EnumC9703.LITERAL : EnumC9703.TABLE_CLOSE_TAG;
                                } else if (m40830) {
                                    if (!c1941.m6400(pattern)) {
                                        throw new C17619();
                                    }
                                    enumC97032 = EnumC9703.LITERAL;
                                } else if (c1941.m6400(f53356)) {
                                    enumC97032 = EnumC9703.PARAGRAPH_OPEN_TAG;
                                } else if (c1941.m6400(f53357)) {
                                    enumC97032 = EnumC9703.PARAGRAPH_CLOSE_TAG;
                                } else if (c1941.m6400(f53351)) {
                                    enumC97032 = EnumC9703.LIST_OPEN_TAG;
                                } else if (c1941.m6400(f53342)) {
                                    enumC97032 = EnumC9703.LIST_CLOSE_TAG;
                                } else if (c1941.m6400(f53343)) {
                                    enumC97032 = EnumC9703.LIST_ITEM_OPEN_TAG;
                                } else if (c1941.m6400(f53348)) {
                                    enumC97032 = EnumC9703.LIST_ITEM_CLOSE_TAG;
                                } else if (c1941.m6400(f53350)) {
                                    enumC97032 = EnumC9703.BLOCKQUOTE_OPEN_TAG;
                                } else if (c1941.m6400(f53368)) {
                                    enumC97032 = EnumC9703.BLOCKQUOTE_CLOSE_TAG;
                                } else if (c1941.m6400(f53346)) {
                                    enumC97032 = EnumC9703.HEADER_OPEN_TAG;
                                } else if (c1941.m6400(f53344)) {
                                    enumC97032 = EnumC9703.HEADER_CLOSE_TAG;
                                } else if (c1941.m6400(f53364)) {
                                    enumC97032 = EnumC9703.BR_TAG;
                                } else if (c1941.m6400(f53365)) {
                                    enumC97032 = EnumC9703.MOE_BEGIN_STRIP_COMMENT;
                                } else if (c1941.m6400(f53366)) {
                                    enumC97032 = EnumC9703.MOE_END_STRIP_COMMENT;
                                } else if (c1941.m6400(f53361)) {
                                    enumC97032 = EnumC9703.HTML_COMMENT;
                                } else {
                                    if (!c1941.m6400(pattern)) {
                                        throw new AssertionError();
                                    }
                                    enumC97032 = EnumC9703.LITERAL;
                                }
                            }
                        }
                    } else {
                        if (!c1941.m6400(pattern)) {
                            throw new C17619();
                        }
                        enumC97032 = EnumC9703.LITERAL;
                    }
                } else if (c17463.f53372 && c20992.m47800() == 1) {
                    c20992.m47798();
                    c17463.f53372 = false;
                    enumC97032 = EnumC9703.SNIPPET_END;
                } else {
                    c20992.m47798();
                    enumC97032 = EnumC9703.LITERAL;
                }
            } else {
                c17463.m40828();
                c17463.f53373 = true;
                enumC97032 = EnumC9703.FOOTER_JAVADOC_TAG_START;
            }
            String substring = c1941.f6489.substring(0, c1941.f6490);
            c1941.f6489 = c1941.f6489.substring(c1941.f6490);
            c1941.f6490 = 0;
            c1846.m16264(new C8997(enumC97032, substring));
        }
        c17463.m40828();
        c1846.m16264(new C8997(EnumC9703.END_JAVADOC, "*/"));
        AbstractC14545 m6131 = c1846.m6131();
        int i2 = AbstractC14545.f44556;
        C1846 c18462 = new C1846();
        StringBuilder sb = new StringBuilder();
        InterfaceC5998 m13612 = C4648.m13612(m6131.listIterator(0));
        while (m13612.hasNext()) {
            if (((C8997) m13612.peek()).m23235() == EnumC9703.LITERAL) {
                sb.append(((C8997) m13612.peek()).m23236());
                m13612.next();
            } else if (sb.length() == 0) {
                c18462.m16264((C8997) m13612.peek());
                m13612.next();
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    EnumC9703 m23235 = ((C8997) m13612.peek()).m23235();
                    enumC9703 = EnumC9703.WHITESPACE;
                    if (m23235 != enumC9703) {
                        break;
                    }
                    sb2.append(((C8997) m13612.next()).m23236());
                }
                EnumC9703 m232352 = ((C8997) m13612.peek()).m23235();
                EnumC9703 enumC97033 = EnumC9703.LITERAL;
                if (m232352 == enumC97033 && ((C8997) m13612.peek()).m23236().startsWith("@")) {
                    sb.append(" ");
                    sb.append(((C8997) m13612.peek()).m23236());
                    m13612.next();
                } else {
                    c18462.m16264(new C8997(enumC97033, sb.toString()));
                    sb.setLength(0);
                    if (sb2.length() > 0) {
                        c18462.m16264(new C8997(enumC9703, sb2.toString()));
                    }
                }
            }
        }
        AbstractC14545 m61312 = c18462.m6131();
        int i3 = AbstractC14545.f44556;
        C1846 c18463 = new C1846();
        InterfaceC5998 m136122 = C4648.m13612(m61312.listIterator(0));
        while (m136122.hasNext()) {
            EnumC9703 m232353 = ((C8997) m136122.peek()).m23235();
            EnumC9703 enumC97034 = EnumC9703.LITERAL;
            if (m232353 == enumC97034) {
                c18463.m16264((C8997) m136122.next());
                if (((C8997) m136122.peek()).m23235() == EnumC9703.WHITESPACE) {
                    if (f53363.mo25529(((C8997) m136122.peek()).m23236()) > 1) {
                        c18463.m16264((C8997) m136122.next());
                        if (((C8997) m136122.peek()).m23235() == enumC97034) {
                            c18463.m16264(new C8997(EnumC9703.PARAGRAPH_OPEN_TAG, "<p>"));
                        }
                    }
                }
            } else {
                c18463.m16264((C8997) m136122.next());
            }
        }
        AbstractC14545 m61313 = c18463.m6131();
        int i4 = AbstractC14545.f44556;
        C1846 c18464 = new C1846();
        InterfaceC5998 m136123 = C4648.m13612(m61313.listIterator(0));
        while (m136123.hasNext()) {
            if (((C8997) m136123.peek()).m23235() == EnumC9703.LITERAL && ((C8997) m136123.peek()).m23236().matches("^href=[^>]*>")) {
                c18464.m16264((C8997) m136123.next());
                if (((C8997) m136123.peek()).m23235() == EnumC9703.WHITESPACE) {
                    c18464.m16264(new C8997(EnumC9703.OPTIONAL_LINE_BREAK, ((C8997) m136123.next()).m23236()));
                }
            } else {
                c18464.m16264((C8997) m136123.next());
            }
        }
        AbstractC14545 m61314 = c18464.m6131();
        int i5 = AbstractC14545.f44556;
        C1846 c18465 = new C1846();
        InterfaceC5998 m136124 = C4648.m13612(m61314.listIterator(0));
        while (m136124.hasNext()) {
            if (((C8997) m136124.peek()).m23235() != EnumC9703.PRE_OPEN_TAG) {
                c18465.m16264((C8997) m136124.next());
            } else {
                c18465.m16264((C8997) m136124.next());
                ArrayList arrayList = new ArrayList();
                while (m136124.hasNext() && ((C8997) m136124.peek()).m23235() == EnumC9703.FORCED_NEWLINE) {
                    arrayList.add((C8997) m136124.next());
                }
                EnumC9703 m232354 = ((C8997) m136124.peek()).m23235();
                EnumC9703 enumC97035 = EnumC9703.LITERAL;
                if (m232354 == enumC97035 && ((C8997) m136124.peek()).m23236().matches("[ \t]*[{]@code")) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    c18465.m16264(new C8997(enumC97035, ((C8997) m136124.next()).m23236().trim()));
                    while (m136124.hasNext() && ((C8997) m136124.peek()).m23235() != EnumC9703.PRE_CLOSE_TAG) {
                        arrayDeque.addLast((C8997) m136124.next());
                    }
                    while (!arrayDeque.isEmpty() && ((C8997) arrayDeque.peekFirst()).m23235() == EnumC9703.FORCED_NEWLINE) {
                        arrayDeque.removeFirst();
                    }
                    while (!arrayDeque.isEmpty() && ((C8997) arrayDeque.peekLast()).m23235() == EnumC9703.FORCED_NEWLINE) {
                        arrayDeque.removeLast();
                    }
                    if (!arrayDeque.isEmpty()) {
                        C8997 c8997 = (C8997) arrayDeque.peekLast();
                        EnumC9703 m232355 = c8997.m23235();
                        EnumC9703 enumC97036 = EnumC9703.LITERAL;
                        if (m232355 == enumC97036 && c8997.m23236().endsWith(l.d)) {
                            arrayDeque.removeLast();
                            if (c8997.m23237() > 1) {
                                arrayDeque.addLast(new C8997(enumC97036, c8997.m23236().substring(0, c8997.m23236().length() - 1)));
                                arrayDeque.addLast(new C8997(EnumC9703.FORCED_NEWLINE, null));
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        Iterator it = arrayDeque.iterator();
                        int i6 = -1;
                        while (it.hasNext()) {
                            C8997 c89972 = (C8997) it.next();
                            if (c89972.m23235() == EnumC9703.LITERAL && (mo25528 = AbstractC11581.m28471().mo25528(0, c89972.m23236())) != -1 && (i6 == -1 || mo25528 < i6)) {
                                i6 = mo25528;
                            }
                        }
                        c18465.m16264(new C8997(EnumC9703.FORCED_NEWLINE, "\n"));
                        Iterator it2 = arrayDeque.iterator();
                        while (it2.hasNext()) {
                            C8997 c89973 = (C8997) it2.next();
                            EnumC9703 m232356 = c89973.m23235();
                            EnumC9703 enumC97037 = EnumC9703.LITERAL;
                            if (m232356 == enumC97037) {
                                c18465.m16264(new C8997(enumC97037, (i6 <= 0 || c89973.m23237() <= i6) ? c89973.m23236() : c89973.m23236().substring(i6)));
                            } else {
                                c18465.m16264(c89973);
                            }
                        }
                        if (z) {
                            c18465.m16264(new C8997(EnumC9703.LITERAL, l.d));
                        } else {
                            c18465.m16264(new C8997(EnumC9703.FORCED_NEWLINE, "\n"));
                        }
                    }
                } else {
                    c18465.m16263((List) arrayList);
                    c18465.m16264((C8997) m136124.next());
                }
            }
        }
        return c18465.m6131();
    }

    public C17463(C1941 c1941) {
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m40830() {
        return this.f53374.m47803() || this.f53371.m47803() || this.f53370.m47803() || this.f53372;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40828() {
        if (this.f53369.m47803() || this.f53374.m47803() || this.f53371.m47803() || this.f53370.m47803()) {
            throw new C18169();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Pattern m40831(String str) {
        return Pattern.compile("^<(?:" + str + ")\\b[^>]*>", 2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern m40827(String str) {
        return Pattern.compile("^</(?:" + str + ")\\b[^>]*>", 2);
    }
}
