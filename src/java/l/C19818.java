package l;

import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;

/* compiled from: 27BV */
/* renamed from: l.᩶֡ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19818 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2884 f64028;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f64027 = new ConcurrentMapC10942();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f64026 = new AtomicLong(1);

    public C19818(C2884 c2884) {
        this.f64028 = c2884;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7822 m45598(C15996 c15996) {
        JSONObject m17736 = C6411.m17736(c15996);
        C7822 c7822 = new C7822();
        c7822.f24206 = C6411.m17738(m17736);
        c7822.f24205 = C6411.m17742(m17736, "basePath");
        return c7822;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m45599(C15996 c15996) {
        final AbstractC21934 c0766;
        final long uptimeMillis = SystemClock.uptimeMillis();
        ConcurrentMapC10942 concurrentMapC10942 = this.f64027;
        C5378.removeIf(concurrentMapC10942.entrySet(), new Predicate() { // from class: l.֡֡ۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC21934) ((Map.Entry) obj).getValue()).m49408(uptimeMillis);
            }
        });
        EnumC4003 m37807 = c15996.m37807();
        boolean equals = EnumC4003.POST.equals(m37807);
        C2884 c2884 = this.f64028;
        if (!equals) {
            if (EnumC4003.GET.equals(m37807)) {
                String m40234 = C17140.m40234(c15996, "taskId");
                if (TextUtils.isEmpty(m40234)) {
                    EnumC1180 enumC1180 = EnumC1180.BAD_REQUEST;
                    Object[] objArr = {"taskId"};
                    c2884.getClass();
                    return C2884.m8818(enumC1180, C4925.m14306(R.string.MT_Protector_res_0x7f120827, objArr));
                }
                AbstractC21934 abstractC21934 = (AbstractC21934) concurrentMapC10942.get(m40234);
                if (abstractC21934 == null) {
                    EnumC1180 enumC11802 = EnumC1180.NOT_FOUND;
                    c2884.getClass();
                    return C2884.m8818(enumC11802, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]));
                }
                LinkedHashMap m49406 = abstractC21934.m49406();
                c2884.getClass();
                return C2884.m8817(m49406);
            }
            if (!EnumC4003.DELETE.equals(m37807)) {
                EnumC1180 enumC11803 = EnumC1180.METHOD_NOT_ALLOWED;
                c2884.getClass();
                return C2884.m8818(enumC11803, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
            }
            String m402342 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(m402342)) {
                EnumC1180 enumC11804 = EnumC1180.BAD_REQUEST;
                Object[] objArr2 = {"taskId"};
                c2884.getClass();
                return C2884.m8818(enumC11804, C4925.m14306(R.string.MT_Protector_res_0x7f120827, objArr2));
            }
            AbstractC21934 abstractC219342 = (AbstractC21934) concurrentMapC10942.remove(m402342);
            if (abstractC219342 == null) {
                EnumC1180 enumC11805 = EnumC1180.NOT_FOUND;
                c2884.getClass();
                return C2884.m8818(enumC11805, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]));
            }
            abstractC219342.m49409();
            Map map = Collections.EMPTY_MAP;
            c2884.getClass();
            return C2884.m8817(map);
        }
        try {
            C7822 m45598 = m45598(c15996);
            ArrayList arrayList = m45598.f24206;
            if (arrayList == null || arrayList.isEmpty()) {
                EnumC1180 enumC11806 = EnumC1180.BAD_REQUEST;
                Object[] objArr3 = {"paths"};
                c2884.getClass();
                return C2884.m8818(enumC11806, C4925.m14306(R.string.MT_Protector_res_0x7f120827, objArr3));
            }
            if (m45598.f24206.size() > 1 && TextUtils.isEmpty(m45598.f24205)) {
                EnumC1180 enumC11807 = EnumC1180.BAD_REQUEST;
                Object[] objArr4 = {"basePath"};
                c2884.getClass();
                return C2884.m8818(enumC11807, C4925.m14306(R.string.MT_Protector_res_0x7f120827, objArr4));
            }
            ArrayList arrayList2 = new ArrayList(m45598.f24206.size());
            Iterator it = m45598.f24206.iterator();
            while (it.hasNext()) {
                C9555 c9555 = (C9555) C2499.f7958.mo7638((String) it.next());
                if (c9555 == null) {
                    c9555 = null;
                }
                if (c9555 == null || !(c9555.mo36978() || c9555.mo24433().mo23120())) {
                    EnumC1180 enumC11808 = EnumC1180.NOT_FOUND;
                    c2884.getClass();
                    return C2884.m8818(enumC11808, C4925.m14306(R.string.MT_Protector_res_0x7f120822, new Object[0]));
                }
                arrayList2.add(c9555);
            }
            if (arrayList2.size() == 1 && ((C9555) arrayList2.get(0)).mo36969()) {
                C9555 c95552 = (C9555) arrayList2.get(0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("done", Boolean.TRUE);
                LinkedHashMap m45595 = m45595(c95552);
                long size = c95552.getSize();
                long mo36979 = c95552.mo36979();
                if (mo36979 == -1 || mo36979 == size) {
                    m45595.put("sizeBytes", Long.valueOf(size));
                } else {
                    m45595.put("logicalSizeBytes", Long.valueOf(size));
                    m45595.put("actualSizeBytes", Long.valueOf(mo36979));
                }
                m45597(m45595, c95552);
                linkedHashMap.put("property", m45595);
                c2884.getClass();
                return C2884.m8817(linkedHashMap);
            }
            String str = "fp-" + this.f64026.getAndIncrement();
            if (arrayList2.size() == 1) {
                C9555 c95553 = (C9555) arrayList2.get(0);
                LinkedHashMap m455952 = m45595(c95553);
                m455952.put("sizeBytes", 0L);
                m45597(m455952, c95553);
                m455952.put("fileCount", 0);
                m455952.put("folderCount", 0);
                c0766 = new C5000(this, str, m455952, c95553);
            } else {
                String str2 = m45598.f24205;
                String str3 = "/";
                if (!TextUtils.isEmpty(str2) && !"/".equals(str2)) {
                    int length = str2.length();
                    while (length > 1 && str2.charAt(length - 1) == '/') {
                        length--;
                    }
                    str3 = str2.substring(0, length);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("mode", "multi");
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((C9555) it2.next()).getName());
                }
                linkedHashMap2.put("names", arrayList3);
                linkedHashMap2.put("parent", str3);
                linkedHashMap2.put("sizeBytes", 0L);
                linkedHashMap2.put("fileCount", 0);
                linkedHashMap2.put("folderCount", 0);
                c0766 = new C0766(this, str, linkedHashMap2, arrayList2);
            }
            LinkedHashMap m494062 = c0766.m49406();
            concurrentMapC10942.put(str, c0766);
            C1802.f6208.execute(new Runnable() { // from class: l.ܶ֡ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC21934.m49403(AbstractC21934.this);
                }
            });
            c2884.getClass();
            return C2884.m8817(m494062);
        } catch (IOException | C15290 | C23344 unused) {
            EnumC1180 enumC11809 = EnumC1180.BAD_REQUEST;
            c2884.getClass();
            return C2884.m8818(enumC11809, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m45595(C9555 c9555) {
        String m14327;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mode", c9555.isDirectory() ? "single-folder" : "single-file");
        linkedHashMap.put("name", c9555.getName());
        linkedHashMap.put("parent", c9555.getParent());
        if (c9555.mo36978()) {
            m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f12051a);
        } else {
            m14327 = C4925.m14327(c9555.isDirectory() ? R.string.MT_Protector_res_0x7f1203fb : R.string.MT_Protector_res_0x7f120393);
        }
        linkedHashMap.put("typeLabel", m14327);
        return linkedHashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45597(LinkedHashMap linkedHashMap, C9555 c9555) {
        String path;
        linkedHashMap.put("timeLabel", C17283.m40576(c9555.getTime()));
        AbstractC15440 mo24433 = c9555.mo24433();
        if (!c9555.isDirectory() || !c9555.m24435()) {
            if (C9555.m24427(c9555.mo24428())) {
                if (!mo24433.mo35196()) {
                    try {
                        if (mo24433 instanceof C11893) {
                            path = ((C11893) mo24433).m29018();
                        } else {
                            path = c9555.getPath();
                        }
                        c9555.m24429(new C16477(C20402.m46724(path)));
                    } catch (IOException | RuntimeException unused) {
                    }
                }
            }
            C16477 mo24428 = c9555.mo24428();
            linkedHashMap.put("permissionsLabel", mo24428.m38841().toString());
            if (!TextUtils.isEmpty(mo24428.m38837())) {
                linkedHashMap.put("ownerLabel", mo24428.m38837());
            }
            if (!TextUtils.isEmpty(mo24428.m38833())) {
                linkedHashMap.put("groupLabel", mo24428.m38833());
            }
        }
        if (c9555.mo36978()) {
            linkedHashMap.put("linkPath", c9555.mo36977());
        }
    }
}
