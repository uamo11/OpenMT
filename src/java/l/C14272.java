package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: 46YI */
/* renamed from: l.ܳۘۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14272 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C17801[] f42975 = {new C17801("utf-32be-bom", C14776.f45123, new byte[]{0, 0, -2, -1}), new C17801("utf-32le-bom", C14776.f45133, new byte[]{-1, -2, 0, 0}), new C17801("utf-8-bom", C14776.f45134, new byte[]{-17, -69, -65}), new C17801("utf-16be-bom", C14776.f45129, new byte[]{-2, -1}), new C17801("utf-16le-bom", C14776.f45122, new byte[]{-1, -2})};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final List f42976;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Map f42977;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (i < C14776.f45125) {
            int i2 = C14776.f45120;
            int i3 = i == i2 ? C14776.f45134 : i;
            C13843.putIfAbsent(linkedHashMap, m33919(i3), Integer.valueOf(i3));
            if (i == i2) {
                linkedHashMap.put("utf-8-bom", Integer.valueOf(C14776.f45134));
            } else if (i == C14776.f45129) {
                linkedHashMap.put("utf-16be-bom", Integer.valueOf(i));
            } else if (i == C14776.f45122) {
                linkedHashMap.put("utf-16le-bom", Integer.valueOf(i));
            } else if (i == C14776.f45123) {
                linkedHashMap.put("utf-32be-bom", Integer.valueOf(i));
            } else if (i == C14776.f45133) {
                linkedHashMap.put("utf-32le-bom", Integer.valueOf(i));
            }
            i++;
        }
        f42977 = C20195.unmodifiableMap(linkedHashMap);
        f42976 = C20195.unmodifiableList(new ArrayList(linkedHashMap.keySet()));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17801 m33924(byte[] bArr) {
        boolean m27836 = C11250.m27836(bArr.length, bArr);
        C17801[] c17801Arr = f42975;
        if (!m27836) {
            if (!C11250.m27838(bArr.length, bArr)) {
                if (!C11250.m27837(bArr.length, bArr)) {
                    if (!C11250.m27830(bArr.length, bArr)) {
                        if (C11250.m27834(bArr.length, bArr)) {
                            return c17801Arr[4];
                        }
                        return null;
                    }
                    return c17801Arr[3];
                }
                return c17801Arr[2];
            }
            return c17801Arr[1];
        }
        return c17801Arr[0];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17095 m33920(String str, byte[] bArr) {
        int i;
        if (str == null) {
            throw m33923((String) null);
        }
        int i2 = 0;
        if (!str.isEmpty()) {
            if (!str.equals(str.trim())) {
                throw m33923(str);
            }
            Integer num = (Integer) f42977.get(str);
            if (num == null) {
                throw m33923(str);
            }
            C17801 m33924 = m33924(bArr);
            if (m33924 != null && m33924.f54425 == num.intValue()) {
                i2 = m33924.f54424.length;
            }
            return new C17095(C14776.m35151(num.intValue()), i2 == 0 ? m33919(num.intValue()) : m33924.f54426, i2, i2 != 0 ? m33924.f54424 : null);
        }
        C17801 m339242 = m33924(bArr);
        if (m339242 != null) {
            Charset m35151 = C14776.m35151(m339242.f54425);
            String str2 = m339242.f54426;
            byte[] bArr2 = m339242.f54424;
            return new C17095(m35151, str2, bArr2.length, bArr2);
        }
        int i3 = C14776.f45134;
        if (bArr.length > 0) {
            String m38652 = C16398.m38652(bArr.length, bArr);
            i = m38652 == null ? -1 : C14776.m35149(m38652);
            if (i == -1) {
                i = C14776.m35152(bArr.length, bArr);
            }
        } else {
            i = i3;
        }
        if (i != C14776.f45120) {
            i3 = i;
        }
        return new C17095(C14776.m35151(i3), m33919(i3), 0, null);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C17095 m33925(String str) {
        C17801 c17801;
        if (str == null || str.isEmpty() || !str.equals(str.trim())) {
            throw m33923(str);
        }
        Integer num = (Integer) f42977.get(str);
        if (num == null) {
            throw m33923(str);
        }
        C17801[] c17801Arr = f42975;
        int length = c17801Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c17801 = null;
                break;
            }
            c17801 = c17801Arr[i];
            if (c17801.f54426.equals(str)) {
                break;
            }
            i++;
        }
        return new C17095(C14776.m35151(num.intValue()), str, c17801 != null ? c17801.f54424.length : 0, c17801 != null ? c17801.f54424 : null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17801 m33921(String str) {
        for (C17801 c17801 : f42975) {
            if (c17801.f54426.equals(str)) {
                return c17801;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33919(int i) {
        if (i == C14776.f45120) {
            i = C14776.f45134;
        }
        return C14776.m35153(i).toLowerCase(Locale.ROOT).replace('_', '-');
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m33923(String str) {
        JSONArray array = JSON.array();
        Iterator it = f42976.iterator();
        while (it.hasNext()) {
            array.add((String) it.next());
        }
        return C3059.m9364("Unsupported text encoding token", "encoding", str == null ? JSON.NULL : JSON.value(str), array, JSON.object().add("encoding", "utf-8"));
    }
}
