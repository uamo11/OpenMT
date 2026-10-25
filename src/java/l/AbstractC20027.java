package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: X7ON */
/* renamed from: l.᩶۟ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC20027 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C13758 f64849 = C13758.m33067((Integer) (-1), (Integer) (-1));

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC19198 f64850 = AbstractC19198.m44271();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f64851 = AbstractC14545.of();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f64852 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46160(AbstractC14545 abstractC14545) {
        this.f64851 = abstractC14545;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46156() {
        return this.f64851.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m46157(int i) {
        return (String) this.f64851.get(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46158(AbstractC14545 abstractC14545) {
        ArrayList arrayList;
        Iterator it = abstractC14545.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC15086 interfaceC15086 = (InterfaceC15086) it.next();
            String mo35701 = interfaceC15086.mo35701();
            int i2 = C12970.f38870;
            int m13616 = (C4648.m13616(new C3093(mo35701)) - 1) + i;
            int index = interfaceC15086.getIndex();
            if (index >= 0) {
                while (i <= m13616) {
                    while (true) {
                        arrayList = this.f64852;
                        if (arrayList.size() > i) {
                            break;
                        } else {
                            arrayList.add(f64849);
                        }
                    }
                    C13758 c13758 = (C13758) arrayList.get(i);
                    arrayList.set(i, C13758.m33067(Integer.valueOf(c13758.m33072() ? index : ((Integer) c13758.m33075()).intValue()), Integer.valueOf(index + 1)));
                    i++;
                }
            }
            i = m13616;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m46155(C18711 c18711) {
        HashMap hashMap = new HashMap();
        int size = c18711.f64851.size();
        for (int i = 0; i <= size; i++) {
            C13758 m33071 = c18711.m46159(i).m33071(f64850);
            for (int intValue = ((Integer) m33071.m33075()).intValue(); intValue < ((Integer) m33071.m33077()).intValue(); intValue++) {
                if (hashMap.containsKey(Integer.valueOf(intValue))) {
                    hashMap.put(Integer.valueOf(intValue), C13758.m33067((Integer) ((C13758) hashMap.get(Integer.valueOf(intValue))).m33075(), Integer.valueOf(i + 1)));
                } else {
                    hashMap.put(Integer.valueOf(intValue), C13758.m33067(Integer.valueOf(i), Integer.valueOf(i + 1)));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13758 m46159(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f64852;
            if (i < arrayList.size()) {
                return (C13758) arrayList.get(i);
            }
        }
        return f64849;
    }

    public String toString() {
        return "InputOutput{lines=" + this.f64851 + ", ranges=" + this.f64852 + '}';
    }
}
