package l;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;

/* compiled from: M445 */
/* renamed from: l.ۚ֨۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5019 extends AbstractC15601 {
    public C5019(C11781 c11781, C14602 c14602) {
        super(c14602, new C0079(c11781));
    }

    @Override // l.AbstractC15601
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String mo14514(C16719 c16719, Locale locale) {
        boolean z;
        String valueOf;
        C0079 c0079;
        EnumC18425 enumC18425;
        C14602 c14602 = this.f48058;
        if (locale == null) {
            locale = c14602.m34856();
        }
        C14397 m39355 = c16719.m39355();
        String str = (String) ((C0079) super.getConfiguration()).f1003.get(EnumC18425.DEFAULT_NO_POS_FORMAT);
        if (m39355 != null && m39355 != C14397.f43364) {
            if (c16719.m39358() != -1) {
                c0079 = (C0079) super.getConfiguration();
                enumC18425 = EnumC18425.DEFAULT_POS_FORMAT;
            } else {
                InterfaceC18278 interfaceC18278 = m39355.f43371;
                if (interfaceC18278 != null && interfaceC18278.mo21321() == EnumC16866.CLASS) {
                    c0079 = (C0079) super.getConfiguration();
                    enumC18425 = EnumC18425.DEFAULT_CLASS_FORMAT;
                }
            }
            str = (String) c0079.f1003.get(enumC18425);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '%' || i >= str.length() - 1) {
                z = false;
            } else {
                i++;
                charAt = str.charAt(i);
                z = true;
            }
            if (!z) {
                valueOf = String.valueOf(charAt);
            } else if (charAt != '%') {
                valueOf = "";
                if (charAt == 'L') {
                    EnumC20347 m39357 = c16719.m39357();
                    if (m39357 != null) {
                        valueOf = c14602.m34854(locale, "compiler.warn.lintOption", m39357.f65711);
                    }
                } else if (charAt == '_') {
                    valueOf = " ";
                } else if (charAt == 'b') {
                    valueOf = AbstractC15601.m36772(c16719, false);
                } else if (charAt == 'c') {
                    valueOf = AbstractC15601.m36771(c16719, EnumC2939.COLUMN);
                } else if (charAt == 'e') {
                    valueOf = AbstractC15601.m36771(c16719, EnumC2939.END);
                } else if (charAt == 'f') {
                    valueOf = AbstractC15601.m36772(c16719, true);
                } else if (charAt == 'l') {
                    valueOf = AbstractC15601.m36771(c16719, EnumC2939.LINE);
                } else if (charAt == 'm') {
                    valueOf = mo8640(c16719, locale);
                } else if (charAt == 'o') {
                    valueOf = AbstractC15601.m36771(c16719, EnumC2939.OFFSET);
                } else if (charAt == 'p') {
                    valueOf = m36779(c16719, locale);
                } else if (charAt == 's') {
                    valueOf = AbstractC15601.m36771(c16719, EnumC2939.START);
                } else if (charAt != 't') {
                    valueOf = String.valueOf(charAt);
                } else {
                    int i2 = C3608.f11436[c16719.m39353().ordinal()];
                    if (i2 != 1 && (i2 != 2 || c16719.m39358() == -1)) {
                        valueOf = m36779(c16719, locale);
                    }
                }
            } else {
                valueOf = "%";
            }
            sb.append(valueOf);
            i++;
        }
        if (this.f48056 != 0) {
            return sb.toString();
        }
        String sb2 = sb.toString();
        if (!m36778(c16719)) {
            return sb2;
        }
        String str2 = "\n" + m36776(c16719, ((C0079) super.getConfiguration()).m1039(EnumC21989.SOURCE));
        if (!sb2.contains("\n") || ((C0079) super.getConfiguration()).f1001 == EnumC19131.BOTTOM) {
            return C16014.m37867(sb2, str2);
        }
        return sb2.replaceFirst("\n", Matcher.quoteReplacement(str2) + "\n");
    }

    @Override // l.InterfaceC12816
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo8640(C16719 c16719, Locale locale) {
        StringBuilder sb = new StringBuilder();
        String[] split = this.f48058.m34854(locale, c16719.mo29298(), m36781(c16719, locale).toArray()).split("\n");
        int i = 0;
        if (split.length == 0) {
            split = new String[]{""};
        }
        EnumSet copyOf = EnumSet.copyOf(((C0079) super.getConfiguration()).f26133);
        EnumC21989 enumC21989 = EnumC21989.SUMMARY;
        if (copyOf.contains(enumC21989)) {
            int m1039 = ((C0079) super.getConfiguration()).m1039(enumC21989);
            sb.append(AbstractC15601.m36769(m1039, split[0]));
            i = m1039;
        }
        if (split.length > 1) {
            EnumSet copyOf2 = EnumSet.copyOf(((C0079) super.getConfiguration()).f26133);
            EnumC21989 enumC219892 = EnumC21989.DETAILS;
            if (copyOf2.contains(enumC219892)) {
                i += ((C0079) super.getConfiguration()).m1039(enumC219892);
                for (int i2 = 1; i2 < split.length; i2++) {
                    sb.append("\n" + AbstractC15601.m36769(i, split[i2]));
                }
            }
        }
        if (c16719 instanceof C22864) {
            EnumSet copyOf3 = EnumSet.copyOf(((C0079) super.getConfiguration()).f26133);
            EnumC21989 enumC219893 = EnumC21989.SUBDIAGNOSTICS;
            if (copyOf3.contains(enumC219893)) {
                int m10392 = ((C0079) super.getConfiguration()).m1039(enumC219893) + i;
                Iterator it = m36782(c16719, locale).iterator();
                while (it.hasNext()) {
                    sb.append("\n" + AbstractC15601.m36769(m10392, (String) it.next()));
                }
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC15601, l.InterfaceC12816
    public final InterfaceC4350 getConfiguration() {
        return (C0079) super.getConfiguration();
    }

    @Override // l.AbstractC15601, l.InterfaceC12816
    public final C8547 getConfiguration() {
        return (C0079) super.getConfiguration();
    }
}
