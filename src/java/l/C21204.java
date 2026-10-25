package l;

import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: Q78Q */
/* renamed from: l.᩷᩻ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21204 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15799 f68333;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10247 f68334;

    public C21204(C8420 c8420, C11691 c11691, C15799 c15799, C10247 c10247) {
        this.f68333 = c15799;
        this.f68334 = c10247;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20001 m48145(C14852 c14852, C12031 c12031) {
        ArrayList arrayList = new ArrayList();
        String str = c12031.f35990;
        int i = c12031.f35991;
        Iterator it = this.f68333.m37430(c14852, str).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C13874 c13874 = (C13874) it.next();
            if (c13874.f41355.startsWith(c12031.f35996)) {
                if (i2 >= i && arrayList.size() < c12031.f35992) {
                    arrayList.add(c13874);
                }
                i2++;
            }
        }
        int size = arrayList.size() + i;
        C20001 c20001 = new C20001(c14852.f45300, "zip_entries", c12031.f35996, arrayList.size(), i2, c12031.f35992, size < i2, size, null, null, null, 0);
        c20001.f64739.addAll(arrayList);
        try {
            c20001.f64738.putAll(C3191.m9810(c14852.f45298.m36526("cache"), c14852.f45291, c14852.f45312, arrayList));
            return c20001;
        } catch (IOException unused) {
            throw C18081.m42149(c14852.f45311, c14852.f45296);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20001 m48143(C14852 c14852, C12031 c12031) {
        ArrayList m37409;
        String str = c12031.f35996;
        String replace = str == null ? "" : str.replace('.', '/');
        ArrayList arrayList = new ArrayList();
        C15799 c15799 = this.f68333;
        String str2 = c12031.f35990;
        synchronized (c15799) {
            m37409 = c15799.m37409(c14852, str2, false, (C15923) null);
        }
        Iterator it = m37409.iterator();
        int i = 0;
        while (it.hasNext()) {
            C17667 c17667 = (C17667) it.next();
            if (!replace.isEmpty()) {
                String m35246 = C14844.m35246(c17667.f54033);
                String m42806 = C18373.m42806(m35246);
                if (!m35246.startsWith(replace) && !m42806.replace('.', '/').startsWith(replace)) {
                }
            }
            if (i >= c12031.f35991 && arrayList.size() < c12031.f35992) {
                C7980 m37413 = this.f68333.m37413(c14852, c12031.f35990, c17667);
                int i2 = 0;
                for (InterfaceC3627 interfaceC3627 : m37413.getFields()) {
                    i2++;
                }
                int i3 = 0;
                for (InterfaceC18444 interfaceC18444 : m37413.getMethods()) {
                    i3++;
                }
                String type = m37413.getType();
                arrayList.add(new C22979(type, i2, i3, C18373.m42806(type)));
            }
            i++;
        }
        int size = c12031.f35991 + arrayList.size();
        C20001 c20001 = new C20001(c14852.f45300, "dex_classes", c12031.f35996, arrayList.size(), i, c12031.f35992, size < i, size, null, null, null, 0);
        c20001.f64734.addAll(arrayList);
        return c20001;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20001 m48144(C14852 c14852, C12031 c12031, C15923 c15923) {
        String str = c12031.f35988;
        int i = c12031.f35993;
        C15549 m37427 = this.f68333.m37427(c14852, c12031.f35990, str, c15923);
        C3556 m10822 = C3556.m10822(str, m37427.f47942);
        LinkedHashMap linkedHashMap = m37427.f47941;
        LinkedHashMap linkedHashMap2 = m37427.f47940;
        ArrayList arrayList = m10822.f11293;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20490 c20490 = (C20490) it.next();
            String str2 = c20490.f66061;
            String str3 = c20490.f66062;
            if (e.s.equals(str2)) {
                C4967 c4967 = (C4967) linkedHashMap.get(str3);
                if (c4967 != null) {
                    c20490.f66060 = c4967;
                }
            } else if ("field".equals(c20490.f66061)) {
                c20490.f66057 = (C21901) linkedHashMap2.get(str3);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (int i3 = i; i3 < size && i2 < c12031.f35994; i3++) {
            C20490 c204902 = (C20490) arrayList.get(i3);
            if ("field".equals(c204902.f66061)) {
                arrayList2.add(c204902);
            } else {
                arrayList3.add(c204902);
            }
            i2++;
        }
        int i4 = i + i2;
        C20001 c20001 = new C20001(c14852.f45300, "dex_class_outline", "", i2, size, c12031.f35994, i4 < size, 0, str, C18373.m42806(str), m10822, i4);
        c20001.f64735.addAll(arrayList2);
        c20001.f64742.addAll(arrayList3);
        return c20001;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20001 m48146(C14852 c14852, C12031 c12031) {
        String str = c12031.f35990;
        C10247 c10247 = this.f68334;
        C15799 c15799 = this.f68333;
        C9042 m25979 = c10247.m25979(c14852, c15799, str);
        try {
            String str2 = c12031.f35996;
            int i = c12031.f35991;
            int i2 = c12031.f35992;
            HashSet hashSet = new HashSet();
            Iterator it = c15799.m37430(c14852, str).iterator();
            while (it.hasNext()) {
                hashSet.add(((C13874) it.next()).f41355);
            }
            C6177 m23330 = m25979.m23330(i, i2, str2, hashSet);
            ArrayList arrayList = m23330.f18972;
            C20001 c20001 = new C20001(c14852.f45300, "resource_table", c12031.f35996, arrayList.size(), m23330.f18974, c12031.f35992, m23330.f18971, m23330.f18973, null, null, null, 0);
            c20001.f64729.addAll(arrayList);
            return c20001;
        } catch (C3059 e) {
            if (C15799.m37396(str)) {
                C10247.m25972(c14852, e);
            }
            throw e;
        }
    }
}
