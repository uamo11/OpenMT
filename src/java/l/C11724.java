package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: C3A0 */
/* renamed from: l.ۨ۬ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11724 extends C3963 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28619(String str, String str2) {
        C22061.m49621(str, str2);
        Map map = this.f12589;
        if (map == null) {
            map = C16374.m38561();
            this.f12589 = map;
        }
        AbstractC11437 abstractC11437 = (AbstractC11437) ((C16374) map).get(str);
        AbstractC11437 abstractC114372 = abstractC11437;
        if (abstractC11437 == null) {
            int i = AbstractC6079.f18650;
            C22061.m49620(4, "expectedSize");
            C12429 c12429 = new C12429(4);
            c12429.f37422 = new Object[AbstractC6079.m16986(4)];
            Map map2 = this.f12589;
            if (map2 == null) {
                map2 = C16374.m38561();
                this.f12589 = map2;
            }
            ((C16374) map2).put(str, c12429);
            abstractC114372 = c12429;
        }
        abstractC114372.mo6130(str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13839 m28618() {
        Map map = this.f12589;
        if (map == null) {
            return C0146.f1273;
        }
        Collection entrySet = ((C16374) map).entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            return C0146.f1273;
        }
        C22766 c22766 = (C22766) entrySet;
        C6785 c6785 = new C6785(c22766.f73516.size());
        Iterator it = c22766.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC6079 copyOf = AbstractC6079.copyOf((Collection) ((C12429) entry.getValue()).mo30595());
            if (!copyOf.isEmpty()) {
                c6785.mo18428(key, copyOf);
                i += copyOf.size();
            }
        }
        return new C13839(c6785.mo18430(), i);
    }
}
