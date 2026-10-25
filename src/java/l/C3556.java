package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: X785 */
/* renamed from: l.ۗ᩺᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3556 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f11291;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11292 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11293 = new ArrayList();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f11294;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f11295;

    public C3556(String str) {
        C18373.m42806(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3556 m10822(String str, String str2) {
        ArrayList arrayList;
        C3556 c3556 = new C3556(str);
        String[] split = C8163.m21638(str2).split("\n", -1);
        int i = 0;
        C20490 c20490 = null;
        C20490 c204902 = null;
        while (true) {
            int length = split.length;
            arrayList = c3556.f11293;
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            String trim = m10821(split[i]).trim();
            if (c204902 == null) {
                if (c20490 != null) {
                    if (trim.equals(".end field")) {
                        c20490.f66059 = i2;
                        c20490 = null;
                    } else if (m10820(trim, ".class") != null || m10820(trim, ".super") != null || m10820(trim, ".source") != null || m10820(trim, ".implements") != null || m10820(trim, ".field") != null || m10820(trim, ".method") != null) {
                        c20490.f66059 = c20490.f66056;
                        c20490 = null;
                    }
                }
                if (m10820(trim, ".class") != null) {
                    c3556.f11291 = trim;
                } else {
                    String m10820 = m10820(trim, ".super");
                    if (m10820 != null) {
                        c3556.f11294 = m10820;
                    } else {
                        String m108202 = m10820(trim, ".source");
                        if (m108202 != null) {
                            if (m108202.length() >= 2 && m108202.charAt(0) == '\"' && C7416.m19937(1, m108202) == '\"') {
                                m108202 = C10035.f30194.m28254(C15472.m36561(1, 1, m108202));
                            }
                            c3556.f11295 = m108202;
                        } else {
                            String m108203 = m10820(trim, ".implements");
                            if (m108203 != null) {
                                c3556.f11292.add(m108203);
                            } else if (m10820(trim, ".field") != null) {
                                c20490 = C20490.m46947(i2, trim);
                                arrayList.add(c20490);
                            } else if (m10820(trim, ".method") != null) {
                                c204902 = C20490.m46950(i2, trim);
                                arrayList.add(c204902);
                            }
                        }
                    }
                }
            } else if (trim.equals(".end method")) {
                c204902.f66059 = i2;
                c204902 = null;
            }
            i = i2;
        }
        if (c20490 != null) {
            c20490.f66059 = c20490.f66056;
        }
        if (c204902 != null) {
            c204902.f66059 = split.length;
        }
        C6083.sort(arrayList, new C23300(2));
        return c3556;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10820(String str, String str2) {
        if (str.startsWith(str2) && str.length() != str2.length() && Character.isWhitespace(str.charAt(str2.length()))) {
            return str.substring(str2.length()).trim();
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m10821(String str) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (z) {
                z = false;
            } else if (z2 || z3) {
                if (charAt == '\\') {
                    z = true;
                } else if (z2 && charAt == '\"') {
                    z2 = false;
                } else if (z3 && charAt == '\'') {
                    z3 = false;
                }
            } else if (charAt == '\"') {
                z2 = true;
            } else if (charAt == '\'') {
                z3 = true;
            } else if (charAt == '#') {
                return str.substring(0, i);
            }
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20490 m10823(String str) {
        Iterator it = this.f11293.iterator();
        while (it.hasNext()) {
            C20490 c20490 = (C20490) it.next();
            if (e.s.equals(c20490.f66061) && str.equals(c20490.f66062)) {
                return c20490;
            }
        }
        return null;
    }
}
