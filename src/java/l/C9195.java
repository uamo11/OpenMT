package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: U16Z */
/* renamed from: l.ۡ᩺ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9195 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f27870;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f27871 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f27869 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f27868 = new ArrayList();

    public C9195(String str) {
        this.f27870 = str.replace('/', ' ').replace('\\', ' ');
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23630(JSONObject jSONObject) {
        ArrayList arrayList = this.f27871;
        arrayList.clear();
        ArrayList arrayList2 = this.f27869;
        arrayList2.clear();
        ArrayList arrayList3 = this.f27868;
        arrayList3.clear();
        JSONArray jSONArray = jSONObject.getJSONArray(am.av);
        for (int i = 0; i < jSONArray.length(); i++) {
            C21190 c21190 = new C21190();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C19779 c19779 = c21190.f68292;
            JSONObject jSONObject3 = jSONObject2.getJSONObject("b");
            c19779.f63854.m42216(jSONObject3, 'a');
            c19779.f63858.m42216(jSONObject3, 'd');
            c19779.f63856.m42216(jSONObject3, 'g');
            c19779.f63860.m42216(jSONObject3, 'j');
            c19779.f63859 = jSONObject3.getInt("m") != 0;
            c19779.f63855 = jSONObject3.getInt("n") != 0;
            c19779.f63857 = jSONObject3.getInt("o") != 0;
            if (jSONObject2.has("e")) {
                C24011 c24011 = c21190.f68290;
                JSONObject jSONObject4 = jSONObject2.getJSONObject("e");
                c24011.f77813.m42216(jSONObject4, 'a');
                c24011.f77819.m42216(jSONObject4, 'd');
                c24011.f77815.m42216(jSONObject4, 'g');
                c24011.f77814 = jSONObject4.getInt("j") != 0;
                c24011.f77818 = jSONObject4.getInt("k") != 0;
                c24011.f77816 = jSONObject4.getInt("l") != 0;
                c24011.f77817 = jSONObject4.getInt("m") != 0;
            }
            c21190.f68291 = jSONObject2.getInt(am.aF);
            c21190.f68293 = jSONObject2.getInt("d");
            int i2 = c21190.f68291;
            if (i2 != 0 && i2 != 1 && i2 != 2) {
                c21190.f68291 = 0;
            }
            arrayList.add(c21190);
            if (c21190.f68291 != 2) {
                arrayList2.add(c21190);
            } else {
                arrayList3.add(c21190);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final JSONObject m23632() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f27871.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C21190) it.next()).m48141());
            }
            jSONObject.put(am.av, jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23631() {
        Iterator it = this.f27871.iterator();
        while (it.hasNext()) {
            C21190 c21190 = (C21190) it.next();
            if (c21190.f68291 != 2) {
                C19779 c19779 = c21190.f68292;
                c19779.f63854.m42219();
                c19779.f63858.m42219();
                c19779.f63856.m42219();
                c19779.f63860.m42219();
            } else {
                C24011 c24011 = c21190.f68290;
                c24011.f77813.m42219();
                c24011.f77815.m42219();
                c24011.f77819.m42219();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23629() {
        C18095 c18095;
        Iterator it = this.f27871.iterator();
        while (it.hasNext()) {
            C21190 c21190 = (C21190) it.next();
            if (c21190.f68291 != 2) {
                C19779 c19779 = c21190.f68292;
                c19779.f63854.f56346 = null;
                c19779.f63858.f56346 = null;
                c19779.f63856.f56346 = null;
                c18095 = c19779.f63860;
            } else {
                C24011 c24011 = c21190.f68290;
                c24011.f77813.f56346 = null;
                c24011.f77815.f56346 = null;
                c18095 = c24011.f77819;
            }
            c18095.f56346 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:
    
        if (r6.m42218(r7.toString()) == false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[LOOP:2: B:106:0x013c->B:144:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0029 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C19073 m23628(l.AbstractC7479 r11) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9195.m23628(l.۟۬֡):l.ᩴ᩺ܽ");
    }
}
