package org.bouncycastle.i18n.filter;

/* loaded from: classes.dex */
public class SQLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i;
        String str2;
        StringBuilder sb = new StringBuilder(str);
        int i2 = 0;
        while (i2 < sb.length()) {
            char charAt = sb.charAt(i2);
            if (charAt == '\n') {
                i = i2 + 1;
                str2 = "\\n";
            } else if (charAt == '\r') {
                i = i2 + 1;
                str2 = "\\r";
            } else if (charAt == '\"') {
                i = i2 + 1;
                str2 = "\\\"";
            } else if (charAt == '\'') {
                i = i2 + 1;
                str2 = "\\'";
            } else if (charAt == '-') {
                i = i2 + 1;
                str2 = "\\-";
            } else if (charAt == '/') {
                i = i2 + 1;
                str2 = "\\/";
            } else if (charAt == ';') {
                i = i2 + 1;
                str2 = "\\;";
            } else if (charAt == '=') {
                i = i2 + 1;
                str2 = "\\=";
            } else if (charAt != '\\') {
                i2++;
            } else {
                i = i2 + 1;
                str2 = "\\\\";
            }
            sb.replace(i2, i, str2);
            i2 = i;
            i2++;
        }
        return sb.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
