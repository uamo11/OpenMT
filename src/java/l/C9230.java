package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.simpleframework.xml.core.AnnotationHandler;

/* compiled from: G67D */
/* renamed from: l.ۢ֡ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9230 implements Map.Entry, Cloneable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f27935;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f27936;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15578 f27937;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f27931 = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", AnnotationHandler.REQUIRED, "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f27932 = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f27933 = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f27934 = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Pattern f27930 = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    public C9230(String str, String str2, C15578 c15578) {
        C16990.m39822((Object) str);
        String trim = str.trim();
        C16990.m39823(trim);
        this.f27936 = trim;
        this.f27935 = str2;
        this.f27937 = c15578;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f27936;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f27936;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.f27935;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String setValue(String str) {
        String str2;
        int m36736;
        String str3 = this.f27935;
        C15578 c15578 = this.f27937;
        if (c15578 != null && (m36736 = c15578.m36736((str2 = this.f27936))) != -1) {
            str3 = this.f27937.get(str2);
            this.f27937.f47995[m36736] = str;
        }
        this.f27935 = str;
        return str3 == null ? "" : str3;
    }

    public final String toString() {
        StringBuilder m47000 = C20519.m47000();
        try {
            C0056 m2907 = new C0762("").m2907();
            String str = this.f27936;
            String str2 = this.f27935;
            String m23668 = m23668(str, m2907.m984());
            if (m23668 != null) {
                m23669(m23668, str2, m47000, m2907);
            }
            return C20519.m46998(m47000);
        } catch (IOException e) {
            throw new C1468(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23669(String str, String str2, Appendable appendable, C0056 c0056) {
        appendable.append(str);
        if (c0056.m984() == EnumC19108.html) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f27931, C23340.m51750(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        C12757.m31059(appendable, str2, c0056, true, false, false, false);
        appendable.append('\"');
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23668(String str, EnumC19108 enumC19108) {
        if (enumC19108 == EnumC19108.xml) {
            Pattern pattern = f27932;
            if (!pattern.matcher(str).matches()) {
                String replaceAll = f27933.matcher(str).replaceAll("");
                if (pattern.matcher(replaceAll).matches()) {
                    return replaceAll;
                }
                return null;
            }
        }
        if (enumC19108 == EnumC19108.html) {
            Pattern pattern2 = f27934;
            if (!pattern2.matcher(str).matches()) {
                String replaceAll2 = f27930.matcher(str).replaceAll("");
                if (pattern2.matcher(replaceAll2).matches()) {
                    return replaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9230.class == obj.getClass()) {
            C9230 c9230 = (C9230) obj;
            String str = c9230.f27936;
            String str2 = this.f27936;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f27935;
            String str4 = c9230.f27935;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f27936;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27935;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return (C9230) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
