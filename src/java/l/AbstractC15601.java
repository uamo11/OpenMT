package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: U410 */
/* renamed from: l.ܺ֨۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC15601 implements InterfaceC12816 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8547 f48055;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14602 f48058;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48056 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2609 f48054 = C2609.m8239();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC13995 f48057 = new C20542(this);

    /* renamed from: ܿ */
    public abstract String mo14514(C16719 c16719, Locale locale);

    public AbstractC15601(C14602 c14602, C8547 c8547) {
        this.f48058 = c14602;
        this.f48055 = c8547;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m36779(C16719 c16719, Locale locale) {
        int i = C9253.f28035[c16719.m39353().ordinal()];
        if (i == 1) {
            return "";
        }
        C14602 c14602 = this.f48058;
        if (i == 2) {
            return c14602.m34854(locale, "compiler.note.note", new Object[0]);
        }
        if (i == 3) {
            return c14602.m34854(locale, "compiler.warn.warning", new Object[0]);
        }
        if (i != 4) {
            throw new AssertionError("Unknown diagnostic type: " + c16719.m39353());
        }
        return c14602.m34854(locale, "compiler.err.error", new Object[0]);
    }

    @Override // l.InterfaceC12816
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo8643(C16719 c16719, Locale locale) {
        this.f48054 = C2609.m8239();
        return mo14514(c16719, locale);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36772(C16719 c16719, boolean z) {
        InterfaceC18278 m39350 = c16719.m39350();
        if (m39350 == null) {
            throw new IllegalArgumentException();
        }
        if (z) {
            return m39350.getName();
        }
        if (m39350 instanceof AbstractC12465) {
            return ((AbstractC12465) m39350).mo30626();
        }
        int i = AbstractC12465.f37474;
        String schemeSpecificPart = m39350.toUri().getSchemeSpecificPart();
        return schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m36781(C16719 c16719, Locale locale) {
        C18837 c18837 = new C18837();
        for (Object obj : c16719.m39354()) {
            c18837.m43511(mo36777(c16719, obj, locale));
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo36777(C16719 c16719, Object obj, Locale locale) {
        if (obj instanceof C16719) {
            C16719 c167192 = (C16719) obj;
            this.f48056++;
            try {
                return mo8640(c167192, locale);
            } finally {
                this.f48056--;
            }
        }
        if (obj instanceof AbstractC12612) {
            return m36770((AbstractC12612) obj);
        }
        if (obj instanceof Iterable) {
            Iterable iterable = (Iterable) obj;
            if (!(obj instanceof InterfaceC20758)) {
                StringBuilder sb = new StringBuilder();
                String str = "";
                for (Object obj2 : iterable) {
                    sb.append(str);
                    sb.append(mo36777(c16719, obj2, locale));
                    str = ",";
                }
                return sb.toString();
            }
        }
        if (obj instanceof AbstractC4308) {
            AbstractC13995 abstractC13995 = this.f48057;
            abstractC13995.getClass();
            return (String) ((AbstractC4308) obj).mo2962(abstractC13995, locale);
        }
        if (obj instanceof AbstractC5698) {
            AbstractC13995 abstractC139952 = this.f48057;
            abstractC139952.getClass();
            return (String) ((AbstractC5698) obj).mo2899(abstractC139952, locale);
        }
        if (obj instanceof InterfaceC18278) {
            return ((InterfaceC18278) obj).getName();
        }
        if (obj instanceof EnumC5973) {
            return ((EnumC5973) obj).f18325;
        }
        if (obj instanceof EnumC0121) {
            return ((EnumC0121) obj).f1214;
        }
        boolean z = obj instanceof InterfaceC9995;
        C14602 c14602 = this.f48058;
        if (z) {
            return ((InterfaceC9995) obj).mo21946(locale, c14602);
        }
        if (obj instanceof EnumC10892) {
            return ((EnumC10892) obj).f32755;
        }
        if (obj instanceof EnumC16280) {
            return ((EnumC16280) obj).f50071;
        }
        if (obj instanceof EnumC18550) {
            return c14602.m34854(locale, "compiler.misc.tree.tag." + ((EnumC18550) obj).name().toLowerCase(Locale.US), new Object[0]);
        }
        return String.valueOf(obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36770(AbstractC12612 abstractC12612) {
        int i = C9253.f28034[abstractC12612.mo989().ordinal()];
        if (i == 1) {
            return m36770(((C14875) abstractC12612).f45392);
        }
        if (i != 2 && i != 3 && i != 4) {
            C12171.m29640("unexpected tree kind " + abstractC12612.mo987());
            throw null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            new C21372(stringWriter, false).m48445(abstractC12612, 0);
            String replaceAll = stringWriter.toString().trim().replaceAll("\\s+", " ").replaceAll("/\\*missing\\*/", "");
            if (replaceAll.length() < 20) {
                return replaceAll;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(replaceAll.substring(0, 10));
            sb.append("[...]");
            return C20087.m46305(replaceAll.length() - 5, replaceAll, sb);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2609 m36782(C16719 c16719, Locale locale) {
        C2609 m8239 = C2609.m8239();
        EnumC19873 enumC19873 = EnumC19873.DEPTH;
        C8547 c8547 = this.f48055;
        int intValue = ((Integer) c8547.f26132.get(enumC19873)).intValue();
        if (intValue != -1 && this.f48056 >= intValue) {
            return m8239;
        }
        this.f48056++;
        try {
            int intValue2 = ((Integer) c8547.f26132.get(EnumC19873.LENGTH)).intValue();
            Iterator it = c16719.mo39349().iterator();
            int i = 0;
            while (it.hasNext()) {
                C16719 c167192 = (C16719) it.next();
                if (intValue2 != -1 && i >= intValue2) {
                    break;
                }
                m8239 = m8239.m8242((Object) mo8640(c167192, locale));
                i++;
            }
            return m8239;
        } finally {
            this.f48056--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [char[]] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m36776(C16719 c16719, int i) {
        char c;
        StringBuilder sb = new StringBuilder();
        C14397 m39355 = c16719.m39355();
        int m39358 = c16719.m39358();
        if (c16719.m39358() == -1) {
            throw new AssertionError();
        }
        String str = 0;
        str = 0;
        if (m39355 != null) {
            try {
                if (m39355.mo34391(m39358)) {
                    int i2 = m39355.f43368;
                    while (i2 < m39355.f43367 && (c = m39355.f43365[i2]) != '\r' && c != '\n') {
                        i2++;
                    }
                    int i3 = m39355.f43368;
                    int i4 = i2 - i3;
                    if (i4 != 0) {
                        String str2 = new String(m39355.f43365, i3, i4);
                        m39355.f43365 = null;
                        str = str2;
                    }
                }
            } finally {
                m39355.f43365 = null;
            }
        }
        if (str == 0) {
            return "";
        }
        sb.append(m36769(i, str));
        int m34389 = m39355.m34389(m39358, false);
        if (this.f48055.f26131) {
            sb.append("\n");
            for (int i5 = 0; i5 < m34389 - 1; i5++) {
                sb.append(str.charAt(i5) == '\t' ? "\t" : " ");
            }
            sb.append(m36769(i, "^"));
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo36775(Locale locale, String str, Object... objArr) {
        return this.f48058.m34854(locale, str, objArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36778(C16719 c16719) {
        return (!EnumSet.copyOf(this.f48055.f26133).contains(EnumC21989.SOURCE) || c16719.m39353() == EnumC12986.FRAGMENT || c16719.m39358() == -1) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36768(int i) {
        if (i <= 24) {
            return "                        ".substring(0, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36769(int i, String str) {
        String m36768 = m36768(i);
        StringBuilder sb = new StringBuilder();
        String[] split = str.split("\n");
        int length = split.length;
        String str2 = "";
        int i2 = 0;
        while (i2 < length) {
            String str3 = split[i2];
            sb.append(str2);
            sb.append(m36768 + str3);
            i2++;
            str2 = "\n";
        }
        return sb.toString();
    }

    @Override // l.InterfaceC12816
    public C8547 getConfiguration() {
        return this.f48055;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36771(C16719 c16719, EnumC2939 enumC2939) {
        int m39348;
        long j;
        C12171.m29642(((long) c16719.m39358()) != -1);
        int i = C9253.f28033[enumC2939.ordinal()];
        if (i == 1) {
            m39348 = c16719.m39348();
        } else {
            if (i != 2) {
                if (i == 3) {
                    j = c16719.getLineNumber();
                } else if (i == 4) {
                    j = c16719.getColumnNumber();
                } else if (i == 5) {
                    m39348 = c16719.m39358();
                } else {
                    throw new AssertionError("Unknown diagnostic position: " + enumC2939);
                }
                return String.valueOf(j);
            }
            m39348 = c16719.m39352();
        }
        j = m39348;
        return String.valueOf(j);
    }
}
