package l;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: H74F */
/* renamed from: l.ܽۛۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16452 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m38760(Resources resources, C14017 c14017) {
        int i;
        int i2;
        String str;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        AbstractC4628 listIterator = c14017.m33608().listIterator(0);
        int i4 = 0;
        while (listIterator.hasNext()) {
            C23190 c23190 = (C23190) listIterator.next();
            if (c23190.m51440() == 2) {
                for (int i5 = 0; i5 < c23190.f74548; i5++) {
                    C8353 m51437 = c23190.m51437(i5);
                    if (c23190.m51439(i5, false) && (m51437.f25608 & 16384) == 0) {
                        arrayList.add(new C1636(c23190, i5, m51437, i4));
                        i4++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        C6083.sort(arrayList, new C13753());
        C21507 c21507 = new C21507(resources);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c21507.m48673(((C1636) it.next()).m5512()));
        }
        HashMap m38759 = m38759(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int i6 = 0;
        while (true) {
            i = 1;
            if (i6 >= arrayList.size()) {
                break;
            }
            String str2 = (String) arrayList2.get(i6);
            C8353 m5512 = ((C1636) arrayList.get(i6)).m5512();
            String str3 = m5512.f25619;
            String str4 = m5512.f25614;
            if (TextUtils.isEmpty(str3)) {
                if (!TextUtils.isEmpty(str4)) {
                    int lastIndexOf = str4.lastIndexOf(47);
                    if (lastIndexOf >= 0) {
                        str4 = str4.substring(lastIndexOf + 1);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str = str4.toUpperCase(Locale.ROOT);
                    }
                }
                str = null;
            } else {
                str = m5512.f25619;
            }
            if (((Integer) C13843.getOrDefault(m38759, str2.trim().toLowerCase(Locale.ROOT), 0)).intValue() > 1 && !TextUtils.isEmpty(str)) {
                str2 = C22870.m50967(str2, " · ", str);
            }
            arrayList3.add(str2);
            i6++;
        }
        HashMap m387592 = m38759(arrayList3);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        while (i3 < arrayList.size()) {
            C1636 c1636 = (C1636) arrayList.get(i3);
            String str5 = (String) arrayList3.get(i3);
            String lowerCase = str5.trim().toLowerCase(Locale.ROOT);
            if (((Integer) C13843.getOrDefault(m387592, lowerCase, 0)).intValue() > i) {
                int intValue = ((Integer) C13843.getOrDefault(hashMap, lowerCase, 0)).intValue() + i;
                hashMap.put(lowerCase, Integer.valueOf(intValue));
                StringBuilder sb = new StringBuilder();
                sb.append(str5);
                sb.append(" (");
                str5 = C3200.m9831(intValue, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            }
            String str6 = str5;
            C23190 m5514 = c1636.m5514();
            int m5513 = c1636.m5513();
            C8353 m55122 = c1636.m5512();
            C8353 m55123 = c1636.m5512();
            int i7 = m55123.f25633;
            int min = (i7 <= 0 || (i2 = m55123.f25609) <= 0) ? -1 : Math.min(i7, i2);
            arrayList4.add(new C7404(m5514, m5513, m55122, str6, min > 0 ? min + "P" : c21507.m48673(m55123)));
            i3++;
            i = 1;
        }
        return C20195.unmodifiableList(arrayList4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11902 m38761(C11902 c11902, C7404 c7404) {
        return c11902.mo29029().mo17262(2, false).mo17261(2).mo17264(new C12607(c7404.m19924().m51438(), AbstractC14545.of((Object) Integer.valueOf(c7404.m19927())))).mo17266();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38758(List list, C11902 c11902) {
        AbstractC20151 it = c11902.f35552.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C12607 c12607 = (C12607) it.next();
            C13312 c13312 = c12607.f38012;
            AbstractC14545 abstractC14545 = c12607.f38013;
            if (c13312.f39853 == 2 && abstractC14545.size() == 1) {
                int intValue = ((Integer) abstractC14545.get(0)).intValue();
                for (int i = 0; i < list.size(); i++) {
                    C7404 c7404 = (C7404) list.get(i);
                    if (c7404.m19927() == intValue && c7404.m19924().m51438().equals(c12607.f38012)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m38759(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).trim().toLowerCase(Locale.ROOT);
            hashMap.put(lowerCase, Integer.valueOf(((Integer) C13843.getOrDefault(hashMap, lowerCase, 0)).intValue() + 1));
        }
        return hashMap;
    }
}
