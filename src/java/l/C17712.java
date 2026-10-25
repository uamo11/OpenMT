package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: D7S4 */
/* renamed from: l.ᩳ֨֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17712 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f54196 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17712 m41443(ArrayList arrayList) {
        C17712 c17712 = new C17712();
        c17712.f54196.addAll(arrayList);
        return c17712;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41445(C16300 c16300) {
        this.f54196.add(c16300);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m41446() {
        return this.f54196;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m41448() {
        return this.f54196.isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41444() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f54196;
            if (i < arrayList.size()) {
                if (i != 0) {
                    sb.append('\n');
                }
                sb.append(((C16300) arrayList.get(i)).m38335());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m41447() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f54196.iterator();
        while (it.hasNext()) {
            C19954 m38337 = ((C16300) it.next()).m38337();
            if (m38337 != null) {
                arrayList.add(m38337);
            }
        }
        return arrayList;
    }
}
