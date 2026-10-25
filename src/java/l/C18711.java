package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: 57O6 */
/* renamed from: l.ᩴۧۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18711 extends AbstractC1508 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19854 f59152;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0096 f59155;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f59156;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f59160;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f59157 = new HashMap();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22267 f59158 = C22267.m49988();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59150 = new ArrayList();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f59161 = 0;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f59154 = -1;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f59151 = 0;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public StringBuilder f59153 = new StringBuilder();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public StringBuilder f59159 = new StringBuilder();

    public C18711(String str, C19854 c19854, C0096 c0096) {
        this.f59156 = str;
        this.f59152 = c19854;
        this.f59155 = c0096;
        this.f59160 = c19854.m45664();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43327(int i, AbstractC22848 abstractC22848) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f59157;
        if (hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i), ((AbstractC22848) hashMap.get(Integer.valueOf(i))).mo16575(abstractC22848));
        } else {
            hashMap.put(Integer.valueOf(i), abstractC22848);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43329(InterfaceC21438 interfaceC21438, InterfaceC21438 interfaceC214382) {
        this.f59158.mo3773(C13758.m33063(Integer.valueOf(m43325(interfaceC21438).getIndex()), Integer.valueOf(m43324(interfaceC214382).getIndex())));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43328(C13758 c13758, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (!c13758.m33072()) {
            C19854 c19854 = this.f59152;
            int m46156 = c19854.m46156();
            boolean z = false;
            while (true) {
                int i = this.f59161;
                if (i >= m46156 || (!c19854.m46159(i).m33072() && ((Integer) c19854.m46159(this.f59161).m33077()).intValue() > ((Integer) c13758.m33075()).intValue())) {
                    break;
                }
                if (c19854.m46159(this.f59161).m33072()) {
                    z = true;
                }
                this.f59161++;
            }
            AbstractC22848 abstractC22848 = (AbstractC22848) C13843.getOrDefault(this.f59157, Integer.valueOf(this.f59154), AbstractC22848.f73734);
            if ((z && (str.startsWith("//") || str.startsWith("/*"))) || ((Boolean) abstractC22848.mo16574().orElse(Boolean.valueOf(z))).booleanValue()) {
                this.f59151++;
            }
        }
        if (C12970.m31535(str)) {
            int i2 = this.f59151;
            if (i2 == 0) {
                this.f59151 = i2 + 1;
            }
            this.f59159 = new StringBuilder();
        } else {
            int length = str.length();
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                char charAt = str.charAt(i3);
                if (charAt == '\t') {
                    this.f59159.append('\t');
                } else {
                    if (charAt != '\n') {
                        if (charAt == '\r') {
                            int i4 = i3 + 1;
                            if (i4 < str.length() && str.charAt(i4) == '\n') {
                                i3 = i4;
                            }
                        } else if (charAt == ' ') {
                            this.f59159.append(' ');
                        } else {
                            while (true) {
                                int i5 = this.f59151;
                                arrayList = this.f59150;
                                if (i5 <= 0) {
                                    break;
                                }
                                if (!arrayList.isEmpty() || this.f59153.length() > 0) {
                                    arrayList.add(this.f59153.toString());
                                }
                                this.f59153 = new StringBuilder();
                                this.f59151--;
                                z2 = false;
                            }
                            if (this.f59159.length() > 0) {
                                this.f59153.append((CharSequence) this.f59159);
                                this.f59159 = new StringBuilder();
                            }
                            this.f59153.append(charAt);
                            if (!c13758.m33072() && !z2) {
                                while (true) {
                                    arrayList2 = this.f64852;
                                    if (arrayList2.size() > arrayList.size()) {
                                        break;
                                    } else {
                                        arrayList2.add(C3625.f11473);
                                    }
                                }
                                int size = arrayList.size();
                                C13758 c137582 = (C13758) arrayList2.get(arrayList.size());
                                if (c137582.m33072()) {
                                    c137582 = c13758;
                                } else if (!c13758.m33072()) {
                                    c137582 = c137582.m33079(c13758).m33071(AbstractC19198.m44271());
                                }
                                arrayList2.set(size, c137582);
                                z2 = true;
                            }
                        }
                    }
                    this.f59159 = new StringBuilder();
                    this.f59151++;
                }
                i3++;
            }
        }
        if (c13758.m33072()) {
            return;
        }
        this.f59154 = ((Integer) c13758.m33077()).intValue();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43332(int i) {
        this.f59159.append(C10375.m26177(i, " "));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43330() {
        String sb = this.f59153.toString();
        boolean mo25531 = AbstractC11581.m28473().mo25531(sb);
        ArrayList arrayList = this.f59150;
        if (!mo25531) {
            arrayList.add(sb);
        }
        int size = arrayList.size();
        int i = this.f59160;
        C13758 m33067 = C13758.m33067(Integer.valueOf(i), Integer.valueOf(i + 1));
        while (true) {
            ArrayList arrayList2 = this.f64852;
            if (arrayList2.size() < size) {
                arrayList2.add(C3625.f11473);
            } else {
                arrayList2.add(m33067);
                m46160(AbstractC14545.copyOf((Collection) arrayList));
                return;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10855 m43331() {
        return this.f59155;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m43326(C22267 c22267) {
        String str;
        C13758 c13758;
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        HashMap m46155 = AbstractC20027.m46155(this);
        C22267 m49988 = C22267.m49988();
        C19854 c19854 = this.f59152;
        Iterator it = ((C22267) c22267.mo3774(C13758.m33063((Integer) 0, Integer.valueOf(c19854.m45664())))).mo5516().iterator();
        while (it.hasNext()) {
            C13758 m33071 = ((C13758) it.next()).m33071(AbstractC19198.m44271());
            Integer num = (Integer) m33071.m33075();
            num.getClass();
            int intValue = ((Integer) m33071.m33077()).intValue() - 1;
            C22267 c222672 = this.f59158;
            boolean mo3775 = c222672.mo3775(num);
            C13758 c137582 = AbstractC20027.f64849;
            if (mo3775 && c222672.mo3775(Integer.valueOf(intValue))) {
                Integer num2 = (Integer) c222672.mo3772(num).m33075();
                num2.getClass();
                c13758 = C13758.m33067(num2, Integer.valueOf(((Integer) c222672.mo3772(Integer.valueOf(intValue)).m33077()).intValue() + 1));
            } else {
                c13758 = c137582;
            }
            if (!c13758.equals(c137582)) {
                m49988.mo3773(c13758);
            }
        }
        Iterator it2 = ((AbstractC22020) m49988.mo5516()).iterator();
        while (it2.hasNext()) {
            InterfaceC15086 m43325 = m43325(c19854.m45665(((Integer) ((C13758) it2.next()).m33075()).intValue()));
            InterfaceC15086 m43324 = m43324(c19854.m45665(((Integer) r2.m33077()).intValue() - 1));
            StringBuilder sb = new StringBuilder();
            int position = m43325.getPosition();
            while (position > 0) {
                if (!AbstractC11581.m28473().mo13300(c19854.m45663().charAt(position - 1))) {
                    break;
                }
                position--;
            }
            int intValue2 = ((Integer) ((C13758) m46155.get(Integer.valueOf(m43325.getIndex()))).m33075()).intValue();
            while (intValue2 > 0 && m46157(intValue2 - 1).isEmpty()) {
                intValue2--;
            }
            while (true) {
                int intValue3 = ((Integer) ((C13758) m46155.get(Integer.valueOf(m43324.getIndex()))).m33077()).intValue();
                str = this.f59156;
                if (intValue2 >= intValue3) {
                    break;
                }
                if (intValue2 < m46156()) {
                    if (intValue2 > 0) {
                        sb.append(str);
                    }
                    sb.append(m46157(intValue2));
                }
                intValue2++;
            }
            int min = Math.min(m43324.length() + m43324.getPosition(), c19854.m45663().length());
            if (m43324.getIndex() == c19854.m45664() - 1) {
                min = c19854.m45663().length();
            }
            int i2 = -1;
            while (min < c19854.m45663().length()) {
                if (!AbstractC11581.m28473().mo13300(c19854.m45663().charAt(min))) {
                    break;
                }
                int m31532 = C12970.m31532(min, c19854.m45663());
                if (m31532 != -1) {
                    i2 = min;
                    min = m31532 + min;
                } else {
                    min++;
                }
            }
            if (i2 != -1) {
                min = i2;
            }
            if (i2 == -1) {
                sb.append(str);
            }
            while (true) {
                if (intValue2 >= m46156()) {
                    break;
                }
                String m46157 = m46157(intValue2);
                int mo25530 = AbstractC11581.m28473().mo13299().mo25530(m46157);
                if (mo25530 == -1) {
                    sb.append(str);
                    intValue2++;
                } else if (i2 == -1) {
                    sb.append((CharSequence) m46157, 0, mo25530);
                }
            }
            c1846.m16264(C4599.m13509(position, min, sb.toString()));
        }
        return c1846.m6131();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43323(String str, List list) {
        ArrayList arrayList = new ArrayList(list);
        C6083.sort(arrayList, C15254.reversed(C8200.comparing(new C10985(7))));
        StringBuilder sb = new StringBuilder(str);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4599 c4599 = (C4599) it.next();
            sb.replace(((Integer) c4599.m13510().m33075()).intValue(), ((Integer) c4599.m13510().m33077()).intValue(), c4599.m13511());
        }
        if (!str.endsWith("\n")) {
            while (sb.length() != 0 && sb.charAt(sb.length() - 1) == '\n') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15086 m43325(InterfaceC21438 interfaceC21438) {
        AbstractC4628 listIterator = interfaceC21438.mo48558().listIterator(0);
        while (listIterator.hasNext()) {
            InterfaceC15086 interfaceC15086 = (InterfaceC15086) listIterator.next();
            if (interfaceC15086.getIndex() >= 0) {
                return interfaceC15086;
            }
        }
        return interfaceC21438.mo48557();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC15086 m43324(InterfaceC21438 interfaceC21438) {
        InterfaceC15086 interfaceC15086;
        int size = interfaceC21438.mo48559().size();
        do {
            size--;
            if (size >= 0) {
                interfaceC15086 = (InterfaceC15086) interfaceC21438.mo48559().get(size);
            } else {
                return interfaceC21438.mo48557();
            }
        } while (interfaceC15086.getIndex() < 0);
        return interfaceC15086;
    }

    @Override // l.AbstractC1508, l.AbstractC20027
    public final String toString() {
        C8964 m37871 = C16018.m37871(this);
        m37871.m23111("iLine", this.f59161);
        m37871.m23111("lastK", this.f59154);
        m37871.m23110((Object) this.f59159.toString().replace("\t", "\\t"), "spacesPending");
        m37871.m23111("newlinesPending", this.f59151);
        m37871.m23110(this.f59157, "blankLines");
        m37871.m23110((Object) super.toString(), "super");
        return m37871.toString();
    }
}
