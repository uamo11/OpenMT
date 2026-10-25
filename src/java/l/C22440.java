package l;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: OB8N */
/* renamed from: l.᩹ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22440 extends AbstractC21735 {
    @Override // l.AbstractC21735
    /* renamed from: ֫ */
    public final Intent mo2798(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C11233.m27805(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C11233.m27803(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // l.AbstractC21735
    /* renamed from: ۧ */
    public final C15383 mo49059(Context context, Object obj) {
        Map map;
        String[] strArr = (String[]) obj;
        C11233.m27805(strArr, "input");
        if (strArr.length == 0) {
            map = C16023.f49426;
            return new C15383(map);
        }
        for (String str : strArr) {
            if (C0881.m3229(context, str) != 0) {
                return null;
            }
        }
        int m2171 = C0501.m2171(strArr.length);
        if (m2171 < 16) {
            m2171 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m2171);
        for (String str2 : strArr) {
            C15818 c15818 = new C15818(str2, Boolean.TRUE);
            linkedHashMap.put(c15818.m37452(), c15818.m37453());
        }
        return new C15383(linkedHashMap);
    }

    @Override // l.AbstractC21735
    /* renamed from: ֫ */
    public final Object mo2799(Intent intent, int i) {
        Map map;
        Map map2;
        Map map3;
        if (i != -1) {
            map3 = C16023.f49426;
            return map3;
        }
        if (intent == null) {
            map2 = C16023.f49426;
            return map2;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            map = C16023.f49426;
            return map;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Iterator it = arrayList2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList3 = new ArrayList(Math.min(C1913.m6270((Iterable) arrayList2), C1913.m6270((Iterable) arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new C15818(it.next(), it2.next()));
        }
        return C0501.m2173(arrayList3);
    }
}
