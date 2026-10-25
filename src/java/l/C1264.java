package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: D6KU */
/* renamed from: l.֨ܿܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1264 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f4479 = new ConcurrentMapC10942();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f4480;

    public C1264(InterfaceC12344 interfaceC12344) {
        this.f4480 = interfaceC12344;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m4323(C18904 c18904) {
        String m43636;
        String str;
        String str2;
        synchronized (this.f4480) {
            Iterator it = m4321().iterator();
            int i = -1;
            while (it.hasNext()) {
                C5498 c5498 = (C5498) it.next();
                str = c5498.f17053;
                if (str.equals(c18904.f59574)) {
                    str2 = c5498.f17052;
                    i = Math.max(i, c18904.m43635(str2));
                }
            }
            m43636 = i < 0 ? c18904.m43636() : ((C4087) c18904.f59572.get(i)).m12288();
        }
        return m43636;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4324(final C18904 c18904, final String str, final boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (c18904.f59574 == null || c18904.m43635(str) < 0) {
            return;
        }
        synchronized (this.f4480) {
            ArrayList m4321 = m4321();
            Iterator it = m4321.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                C5498 c5498 = (C5498) it.next();
                str4 = c5498.f17053;
                if (str4.equals(c18904.f59574)) {
                    str5 = c5498.f17052;
                    if (str5.equals(str)) {
                        z2 = true;
                    }
                }
            }
            if (z2 || z) {
                C5378.removeIf(m4321, new Predicate() { // from class: l.᩵ܿܳ
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
                        String str6;
                        String str7;
                        String str8;
                        C5498 c54982 = (C5498) obj;
                        str6 = c54982.f17053;
                        C18904 c189042 = C18904.this;
                        if (!str6.equals(c189042.f59574)) {
                            return false;
                        }
                        str7 = c54982.f17052;
                        String str9 = str;
                        if (str7.equals(str9)) {
                            return true;
                        }
                        if (!z) {
                            return false;
                        }
                        str8 = c54982.f17052;
                        return c189042.m43635(str8) > c189042.m43635(str9);
                    }
                });
                m4321.add(0, new C5498(c18904.f59574, str));
                while (m4321.size() > 64) {
                    m4321.remove(m4321.size() - 1);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = m4321.iterator();
                while (it2.hasNext()) {
                    C5498 c54982 = (C5498) it2.next();
                    JSONArray jSONArray2 = new JSONArray();
                    str2 = c54982.f17053;
                    JSONArray put = jSONArray2.put(str2);
                    str3 = c54982.f17052;
                    jSONArray.put(put.put(str3));
                }
                try {
                    f4479.put(this.f4480, new JSONObject().put("version", 1).put("roots", jSONArray).toString());
                    C1802.f6208.execute(new RunnableC0558(0, this));
                } catch (JSONException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4322(C1264 c1264) {
        synchronized (c1264.f4480) {
            String str = (String) f4479.remove(c1264.f4480);
            if (str != null) {
                c1264.f4480.edit().putString("hprt", str).commit();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m4321() {
        ArrayList arrayList = new ArrayList();
        ConcurrentMapC10942 concurrentMapC10942 = f4479;
        InterfaceC12344 interfaceC12344 = this.f4480;
        String str = (String) concurrentMapC10942.get(interfaceC12344);
        if (str == null) {
            str = interfaceC12344.getString("hprt", "");
        }
        if (!str.isEmpty() && str.length() <= 1048576) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("version") == 1) {
                    JSONArray jSONArray = jSONObject.getJSONArray("roots");
                    for (int i = 0; i < jSONArray.length() && arrayList.size() < 64; i++) {
                        JSONArray optJSONArray = jSONArray.optJSONArray(i);
                        if (optJSONArray != null && optJSONArray.length() == 2) {
                            Object opt = optJSONArray.opt(0);
                            if (opt instanceof String) {
                                String str2 = (String) opt;
                                if (!str2.isEmpty()) {
                                    Object opt2 = optJSONArray.opt(1);
                                    if (opt2 instanceof String) {
                                        String str3 = (String) opt2;
                                        try {
                                            if (str3.equals(C18904.m43634(str3))) {
                                                C5498 c5498 = new C5498(str2, str3);
                                                if (!arrayList.contains(c5498)) {
                                                    arrayList.add(c5498);
                                                }
                                            }
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }
}
