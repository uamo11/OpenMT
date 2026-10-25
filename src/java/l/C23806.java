package l;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: 6A1V */
/* renamed from: l.᩻ܺ᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23806 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final HashMap f77026;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f77028;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f77029;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f77030;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f77031;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f77032 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f77027 = null;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C2640 f77033 = null;

    static {
        HashMap hashMap = new HashMap();
        f77026 = hashMap;
        hashMap.put("srvsvc", "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0");
        hashMap.put("lsarpc", "12345778-1234-abcd-ef00-0123456789ab:0.0");
        hashMap.put("samr", "12345778-1234-abcd-ef00-0123456789ac:1.0");
        hashMap.put("netdfs", "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0");
        hashMap.put("netlogon", "12345678-1234-abcd-ef00-01234567cffb:1.0");
        hashMap.put("wkssvc", "6BFFD098-A112-3610-9833-46C3F87E345A:1.0");
        hashMap.put("samr", "12345778-1234-ABCD-EF00-0123456789AC:1.0");
    }

    public C23806(String str, String str2) {
        this.f77031 = str;
        this.f77029 = str2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m52487() {
        return this.f77029;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52482() {
        return this.f77027;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2640 m52486() {
        return this.f77033;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52484() {
        return this.f77028;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52485() {
        return this.f77030;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52483(String str, String str2) {
        if (str.equals("endpoint")) {
            String obj = str2.toString();
            this.f77027 = obj;
            String lowerCase = obj.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith("\\pipe\\")) {
                String str3 = (String) f77026.get(lowerCase.substring(6));
                if (str3 != null) {
                    int indexOf = str3.indexOf(58);
                    int i = indexOf + 1;
                    int indexOf2 = str3.indexOf(46, i);
                    this.f77033 = new C2640(str3.substring(0, indexOf));
                    this.f77028 = Integer.parseInt(str3.substring(i, indexOf2));
                    this.f77030 = Integer.parseInt(str3.substring(indexOf2 + 1));
                    return;
                }
            }
            throw new C9696("Bad endpoint: " + this.f77027);
        }
        if (this.f77032 == null) {
            this.f77032 = new HashMap();
        }
        this.f77032.put(str, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m52481(String str) {
        if (str.equals("endpoint")) {
            return this.f77027;
        }
        HashMap hashMap = this.f77032;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    public final String toString() {
        String str = this.f77031 + ":" + this.f77029 + "[" + this.f77027;
        HashMap hashMap = this.f77032;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                StringBuilder m19190 = C7166.m19190(str, ",");
                m19190.append((String) entry.getKey());
                m19190.append("=");
                m19190.append(entry.getValue());
                str = m19190.toString();
            }
        }
        return C16014.m37867(str, "]");
    }
}
