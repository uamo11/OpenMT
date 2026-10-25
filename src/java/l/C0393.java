package l;

import java.util.HashMap;

/* compiled from: G73R */
/* renamed from: l.֡ۨܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0393 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f1842 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1887() {
        this.f1842.clear();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1888(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str2 = str.substring(0, lastIndexOf + 1) + str2;
        }
        boolean equals = str.equals(str2);
        HashMap hashMap = this.f1842;
        if (equals) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, str2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m1889(String str, String str2) {
        int i = 0;
        String m39860 = C16999.m39860(str, false);
        String m39881 = C16999.m39881(m39860, str2);
        int lastIndexOf = m39860.lastIndexOf(47);
        String str3 = (String) this.f1842.get(C16999.m39860(lastIndexOf == -1 ? m39881 : m39860.substring(0, lastIndexOf + 1) + m39881, true));
        if (str3 == null) {
            return m39881;
        }
        String m398602 = C16999.m39860(str3, true);
        int lastIndexOf2 = m39860.lastIndexOf(47);
        String substring = lastIndexOf2 == -1 ? "" : m39860.substring(0, lastIndexOf2);
        String[] split = substring.isEmpty() ? new String[0] : substring.split("/");
        String[] split2 = m398602.isEmpty() ? new String[0] : m398602.split("/");
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = i; i2 < split.length; i2++) {
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append("..");
        }
        while (i < split2.length) {
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append(split2[i]);
            i++;
        }
        return sb.length() == 0 ? "." : sb.toString();
    }
}
