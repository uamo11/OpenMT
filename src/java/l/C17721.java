package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: C5F4 */
/* renamed from: l.ᩳ֨ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17721 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f54213 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized void m41507() {
        synchronized (C17721.class) {
            f54213 = m41501();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m41506(AbstractC15440 abstractC15440) {
        return abstractC15440.mo35196() ? abstractC15440 instanceof C6849 : ((abstractC15440 instanceof C12993) || abstractC15440.mo36530()) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41504(AbstractC15440 abstractC15440, EnumC16309 enumC16309) {
        C1493 m5162 = C1493.m5162(abstractC15440, enumC16309);
        if (m5162 == null) {
            return;
        }
        m41505(m5162);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41503(String str, EnumC16309 enumC16309) {
        m41505(C1493.m5161(str, enumC16309));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m41505(C1493... c1493Arr) {
        C10666 m41502;
        C10666 m415022;
        String m24406;
        C10666 m415023;
        synchronized (C17721.class) {
            m41507();
            HashSet hashSet = new HashSet(c1493Arr.length);
            HashSet hashSet2 = new HashSet(c1493Arr.length);
            for (C1493 c1493 : c1493Arr) {
                if (c1493 != null) {
                    String str = c1493.f5334;
                    EnumC16309 enumC16309 = c1493.f5335;
                    if (enumC16309.f50180) {
                        try {
                            str = C20402.m46728(str);
                        } catch (IOException unused) {
                        }
                    }
                    String m50489 = C22518.m50489(str);
                    if (m41506(C16999.m39866(m50489, new String[0])) && (m415022 = m41502(m50489)) != null && !m415022.f32081) {
                        hashSet.add(m415022);
                        if (enumC16309.f50181 && (m24406 = C9523.m24406(m50489)) != null && (m415023 = m41502(m24406)) != null && !m415023.f32081 && !m415023.equals(m415022)) {
                            hashSet2.add(m415023);
                        }
                    }
                }
            }
            hashSet2.removeAll(hashSet);
            if (hashSet.isEmpty()) {
                return;
            }
            if (C9255.m23780()) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C9255.m23761((C10666) it.next());
                }
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    C9255.m23761((C10666) it2.next());
                }
                m41507();
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                C10666 c10666 = (C10666) it3.next();
                if (!c10666.f32081 && (m41502 = m41502(c10666.f32079)) != null && !m41502.f32081) {
                    throw new C1637(C4925.m14327(R.string.MT_Protector_res_0x7f12086c) + "\n" + m41502.f32083);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m41501() {
        ArrayList arrayList = new ArrayList(f54213.size());
        for (String str : C9255.m23769().f36415) {
            String[] split = str.split(" ", 4);
            if (split.length == 4 && (split[3].startsWith("ro") || split[3].startsWith("rw"))) {
                C10666 c10666 = new C10666();
                c10666.f32082 = split[0];
                c10666.f32083 = split[1];
                c10666.f32080 = split[2];
                c10666.f32081 = split[3].startsWith("rw");
                String lowerCase = c10666.f32083.toLowerCase();
                c10666.f32079 = lowerCase;
                if (!lowerCase.endsWith("/")) {
                    c10666.f32079 = C9045.m23341(new StringBuilder(), c10666.f32079, "/");
                }
                arrayList.add(c10666);
            }
        }
        if (C9886.m24978()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C10666) it.next()).f32081 = true;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10666 m41502(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        Iterator it = f54213.iterator();
        while (it.hasNext()) {
            C10666 c10666 = (C10666) it.next();
            if (lowerCase.startsWith(c10666.f32079)) {
                return c10666;
            }
        }
        return null;
    }
}
