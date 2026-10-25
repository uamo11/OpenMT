package l;

import java.text.StringCharacterIterator;
import java.util.ArrayList;

/* compiled from: YBJ2 */
/* renamed from: l.᩵ܳۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19523 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f63091;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f63092;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m44928(String str) {
        if (!str.equals(this.f63092) || this.f63091 == null) {
            int i = 1;
            while (true) {
                if (i >= str.length()) {
                    i = -1;
                    break;
                }
                char charAt = str.charAt(i);
                if (!Character.isLetterOrDigit(charAt) && charAt != ':' && charAt != '.' && charAt != '-' && charAt != '_') {
                    break;
                }
                i++;
            }
            if (str.length() > 2 && i > 1) {
                this.f63092 = str;
                this.f63091 = str.substring(1, i);
            } else {
                throw new C15993("No element name for the tag:\n\t".concat(str));
            }
        }
        return this.f63091;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2589 m44929(String str) {
        C2589 c2589 = new C2589();
        c2589.m8202(m44928(str));
        ArrayList arrayList = new ArrayList();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str.substring(m44928(str).length() + 2));
        C18817 c18817 = new C18817();
        c18817.m43482();
        char first = stringCharacterIterator.first();
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        char c = '\"';
        while (stringCharacterIterator.getIndex() < stringCharacterIterator.getEndIndex()) {
            if (first != '\"' && first != '\'') {
                if (first != '/') {
                    if (first != '=') {
                        if (first != '>') {
                            if (c18817.m43478()) {
                                sb2.append(first);
                            } else if (c18817.m43479()) {
                                if (!Character.isWhitespace(first)) {
                                    throw new C15993("Unexpected '" + first + "' when parsing:\n\t" + str);
                                }
                            } else if (!Character.isWhitespace(first)) {
                                if (c18817.m43476()) {
                                    c18817.m43477();
                                    sb = new StringBuilder(255);
                                    sb.append(first);
                                } else if (c18817.m43473()) {
                                    sb.append(first);
                                }
                            }
                        }
                    } else if (c18817.m43478()) {
                        sb2.append(first);
                    } else {
                        if (!c18817.m43473()) {
                            throw new C15993("Unexpected '" + first + "' when parsing:\n\t" + str);
                        }
                        c18817.m43481();
                    }
                }
                if (c18817.m43478()) {
                    sb2.append(first);
                } else if (c18817.m43476()) {
                    c18817.m43475();
                } else if (!c18817.m43479()) {
                    throw new C15993("Unexpected '" + first + "' when parsing:\n\t" + str);
                }
            } else if (c18817.m43480()) {
                c18817.m43474();
                sb2 = new StringBuilder(1024);
                c = first;
            } else if (c18817.m43478() && c == first) {
                arrayList.add(new C8939(sb.toString(), sb2.toString(), c));
                c18817.m43482();
            } else {
                if (!c18817.m43478() || c == first) {
                    throw new C15993("Unexpected '" + first + "' when parsing:\n\t" + str);
                }
                sb2.append(first);
            }
            first = stringCharacterIterator.next();
        }
        if (!c18817.m43479()) {
            throw new C15993("Element did not complete normally.");
        }
        c2589.m8203(arrayList);
        c2589.m8204(str.charAt(str.lastIndexOf(62) - 1) == '/');
        return c2589;
    }
}
