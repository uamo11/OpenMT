package l;

import java.util.Arrays;

/* compiled from: F9EF */
/* renamed from: l.ܽۧۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16594 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f50989;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f50990;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f50991;

    public C16594(String str, String str2, String str3) {
        this.f50991 = str2;
        this.f50989 = str;
        this.f50990 = m39091(str3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39091(String str) {
        if (!C3395.m10361(str)) {
            return str;
        }
        String replace = str.replace('/', '\\');
        if (replace.charAt(0) != '\\') {
            return replace;
        }
        if (replace.length() > 1 && replace.charAt(1) == '\\') {
            return replace.substring(2);
        }
        return replace.substring(1);
    }

    public C16594(C16594 c16594, String str) {
        this.f50989 = c16594.f50989;
        if (C3395.m10361(c16594.f50991)) {
            this.f50991 = c16594.f50991;
            if (C3395.m10361(c16594.f50990)) {
                this.f50990 = c16594.f50990 + "\\" + m39091(str);
                return;
            }
            this.f50990 = m39091(str);
            return;
        }
        throw new IllegalArgumentException("Can only make child SmbPath of fully specified SmbPath");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m39097() {
        StringBuilder sb = new StringBuilder("\\\\");
        sb.append(this.f50989);
        String str = this.f50991;
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) != '\\') {
                sb.append("\\");
            }
            sb.append(str);
            String str2 = this.f50990;
            if (C3395.m10361(str2)) {
                sb.append("\\");
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return m39097();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16594.class == obj.getClass()) {
            C16594 c16594 = (C16594) obj;
            if (C19893.m45753(this.f50989, c16594.f50989) && C19893.m45753(this.f50991, c16594.f50991) && C19893.m45753(this.f50990, c16594.f50990)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50989, this.f50991, this.f50990});
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m39092() {
        return this.f50989;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m39096() {
        return this.f50991;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m39094() {
        return this.f50990;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39093(C16594 c16594) {
        return C19893.m45753(this.f50989, c16594.f50989);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m39095(C16594 c16594) {
        return m39093(c16594) && C19893.m45753(this.f50991, c16594.f50991);
    }
}
