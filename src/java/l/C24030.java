package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: W7FQ */
/* renamed from: l.᩻᩻ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C24030 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52874(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder(String.format(Locale.US, C4925.m14327(R.string.MT_Protector_res_0x7f1201b5), "\\u"));
        if (!arrayList.isEmpty()) {
            sb.append('\n');
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C12511 c12511 = (C12511) arrayList.get(i);
            if (i > 0) {
                sb.append('\n');
            }
            sb.append("password=");
            sb.append(m52877(c12511.f37581));
            sb.append("\nremark=");
            String str = c12511.f37580;
            if (str == null) {
                str = "";
            }
            sb.append(m52877(str));
            sb.append('\n');
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m52875(String str) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        String[] split = str.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1);
        int i = 0;
        int i2 = -1;
        String str2 = null;
        while (i < split.length) {
            int i3 = i + 1;
            String str3 = split[i];
            if (i == 0 && !str3.isEmpty() && str3.charAt(0) == 65279) {
                str3 = str3.substring(1);
            }
            if (!str3.isEmpty() && !str3.startsWith("#")) {
                if (str2 == null) {
                    if (!str3.startsWith("password=")) {
                        if (str3.startsWith("remark=")) {
                            throw m52876(i3, R.string.MT_Protector_res_0x7f1201b0);
                        }
                        throw m52876(i3, R.string.MT_Protector_res_0x7f1201ae);
                    }
                    str2 = m52873(i3, str3.substring(9));
                    if (str2.isEmpty()) {
                        throw m52876(i3, R.string.MT_Protector_res_0x7f1201ad);
                    }
                    if (!hashSet.add(str2)) {
                        throw m52876(i3, R.string.MT_Protector_res_0x7f1201ac);
                    }
                    i2 = i3;
                } else {
                    if (!str3.startsWith("remark=")) {
                        if (str3.startsWith("password=")) {
                            throw m52876(i3, R.string.MT_Protector_res_0x7f1201af);
                        }
                        throw m52876(i3, R.string.MT_Protector_res_0x7f1201b1);
                    }
                    arrayList.add(new C12511(str2, m52873(i3, str3.substring(7))));
                    str2 = null;
                    i2 = -1;
                }
            }
            i = i3;
        }
        if (str2 == null) {
            return arrayList;
        }
        throw m52876(i2, R.string.MT_Protector_res_0x7f1201af);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m52877(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\t') {
                sb.append("\\t");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\\') {
                sb.append("\\\\");
            } else if (Character.isISOControl(charAt)) {
                sb.append(String.format(Locale.US, "\\u%04X", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52873(int i, String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt != '\\') {
                sb.append(charAt);
            } else {
                if (i2 == length - 1) {
                    throw m52876(i, R.string.MT_Protector_res_0x7f1201b2);
                }
                int i3 = i2 + 1;
                char charAt2 = str.charAt(i3);
                if (charAt2 != 'U') {
                    if (charAt2 == '\\') {
                        sb.append('\\');
                    } else if (charAt2 == 'n') {
                        sb.append('\n');
                    } else if (charAt2 == 'r') {
                        sb.append('\r');
                    } else if (charAt2 == 't') {
                        sb.append('\t');
                    } else if (charAt2 != 'u') {
                        throw new C7097(i, C4925.m14306(R.string.MT_Protector_res_0x7f1201b4, Character.valueOf(charAt2)));
                    }
                    i2 = i3;
                }
                i3 = i2 + 5;
                if (i3 >= length) {
                    throw m52876(i, R.string.MT_Protector_res_0x7f1201b3);
                }
                String substring = str.substring(i2 + 2, i2 + 6);
                for (int i4 = 0; i4 < substring.length(); i4++) {
                    if (Character.digit(substring.charAt(i4), 16) == -1) {
                        throw m52876(i, R.string.MT_Protector_res_0x7f1201b3);
                    }
                }
                sb.append((char) Integer.parseInt(substring, 16));
                i2 = i3;
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7097 m52876(int i, int i2) {
        return new C7097(i, C4925.m14327(i2));
    }
}
