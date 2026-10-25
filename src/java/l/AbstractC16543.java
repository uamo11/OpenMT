package l;

import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: M1X3 */
/* renamed from: l.ܽۡᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC16543 extends AbstractC23599 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f50828;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f50829;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10399 f50830;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f50831;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f50832;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f50833;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f50834;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC11810 f50835;

    /* renamed from: ֫ */
    public String mo15148(int i, String str) {
        return str;
    }

    /* renamed from: ֫ */
    public abstract List mo3535(C17249 c17249);

    public AbstractC16543(C17249 c17249, InterfaceC5276 interfaceC5276) {
        super(c17249, interfaceC5276);
        this.f50835 = EnumC11810.STATIC;
        this.f50828 = true;
        this.f50829 = new ArrayList();
        this.f50831 = new ArrayList();
        this.f50834 = new ArrayList();
        this.f50833 = new ArrayList();
        this.f50832 = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a7  */
    @Override // l.AbstractC23599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo38920(l.InterfaceC7397 r31) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC16543.mo38920(l.۟ۤ):boolean");
    }

    /* renamed from: ֫ */
    public int mo24326(C13925 c13925) {
        if (c13925 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        return c13925.m33360();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫ */
    public String mo3534(C1032 c1032, C15152 c15152, C23098 c23098, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        char c;
        String str;
        String mo15148;
        C15859 c15859;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        AbstractC16543 abstractC16543 = this;
        abstractC16543.f50830 = null;
        ArrayList arrayList5 = abstractC16543.f50829;
        arrayList5.clear();
        ArrayList arrayList6 = abstractC16543.f50831;
        arrayList6.clear();
        ArrayList arrayList7 = abstractC16543.f50834;
        arrayList7.clear();
        ArrayList arrayList8 = abstractC16543.f50833;
        arrayList8.clear();
        ArrayList arrayList9 = abstractC16543.f50832;
        arrayList9.clear();
        InterfaceC5471 m51287 = c23098.m51287();
        List mo3565 = m51287.mo3565();
        C15859 c158592 = new C15859();
        InterfaceC6667 m51286 = c23098.m51286();
        int i2 = 0;
        while (true) {
            int size = mo3565.size();
            String str2 = "I";
            InterfaceC5471 interfaceC5471 = m51287;
            C15859 c158593 = c158592;
            ArrayList arrayList10 = arrayList6;
            ArrayList arrayList11 = arrayList8;
            ArrayList arrayList12 = arrayList9;
            ArrayList arrayList13 = arrayList7;
            ArrayList arrayList14 = arrayList5;
            C17249 c17249 = abstractC16543.f76507;
            if (i2 < size) {
                mo15148 = abstractC16543.mo15148(i2, ((CharSequence) mo3565.get(i2)).toString());
                mo15148.getClass();
                switch (mo15148) {
                    case "B":
                    case "C":
                    case "F":
                    case "I":
                    case "S":
                    case "Z":
                        c15859 = c158593;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c15859.add(m51286.nextInt());
                        break;
                    case "D":
                    case "J":
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c15859 = c158593;
                        c15859.add(m51286.nextInt());
                        c15859.add(m51286.nextInt());
                        break;
                    case "[B":
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C4754 c4754 = new C4754(c17249);
                        if (!c4754.m13902(c15152, i, m51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList = arrayList10;
                        arrayList.add(c4754);
                        c15859 = c158593;
                        break;
                    case "[C":
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C3343 c3343 = new C3343(c17249);
                        if (!c3343.m10204(c15152, i, m51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList2 = arrayList11;
                        arrayList2.add(c3343);
                        c15859 = c158593;
                        arrayList = arrayList10;
                        break;
                    case "[I":
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C13220 c13220 = new C13220(c17249);
                        if (!c13220.m32056(c15152, i, m51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList9 = arrayList12;
                        arrayList9.add(c13220);
                        c15859 = c158593;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        break;
                    case "[S":
                        arrayList4 = arrayList14;
                        C7576 c7576 = new C7576(c17249);
                        if (!c7576.m20316(c15152, i, m51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList3 = arrayList13;
                        arrayList3.add(c7576);
                        c15859 = c158593;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        break;
                    case "Ljava/lang/String;":
                        C1541 c1541 = new C1541(c17249);
                        if (!c1541.m5285(c15152, i, m51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList4 = arrayList14;
                        arrayList4.add(c1541);
                        c15859 = c158593;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        break;
                    default:
                        throw new RuntimeException("Unsupported parameter type: ".concat(mo15148));
                }
                i2++;
                c158592 = c15859;
                arrayList6 = arrayList;
                arrayList5 = arrayList4;
                arrayList7 = arrayList3;
                arrayList8 = arrayList2;
                m51287 = interfaceC5471;
            } else {
                if (c158593.isEmpty()) {
                    obj = "C";
                    obj2 = "B";
                } else {
                    obj2 = "B";
                    C10399 c10399 = new C10399();
                    abstractC16543.f50830 = c10399;
                    obj = "C";
                    if (!c10399.m26230(c15152, i, c158593.mo3586())) {
                        C11003.toString(c1032);
                        return null;
                    }
                }
                C10399 c103992 = abstractC16543.f50830;
                Object[] m26231 = c103992 == null ? new Object[0] : c103992.m26231(c17249);
                String m52075 = AbstractC23599.m52075(interfaceC5471.mo3566());
                String name = interfaceC5471.getName();
                C10130 c10130 = new C10130();
                c10130.m25423((CharSequence) m52075);
                c10130.m25423((CharSequence) name);
                c10130.writeByte(mo3565.size());
                InterfaceC6667 m512862 = c23098.m51286();
                Iterator it = arrayList14.iterator();
                Iterator it2 = arrayList10.iterator();
                Iterator it3 = arrayList13.iterator();
                Iterator it4 = arrayList11.iterator();
                Iterator it5 = arrayList12.iterator();
                Object[] objArr = m26231;
                int i3 = 0;
                while (i3 < mo3565.size()) {
                    String charSequence = ((CharSequence) mo3565.get(i3)).toString();
                    List list = mo3565;
                    String mo151482 = abstractC16543.mo15148(i3, charSequence);
                    int nextInt = m512862.nextInt();
                    mo151482.getClass();
                    switch (mo151482.hashCode()) {
                        case 66:
                            obj3 = obj2;
                            if (mo151482.equals(obj3)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 67:
                            Object obj4 = obj;
                            if (mo151482.equals(obj4)) {
                                c = 1;
                                obj = obj4;
                                break;
                            } else {
                                obj = obj4;
                                obj3 = obj2;
                                c = 65535;
                                break;
                            }
                        case 68:
                            if (mo151482.equals("D")) {
                                c = 2;
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case 70:
                            if (mo151482.equals("F")) {
                                c = 3;
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case 73:
                            if (mo151482.equals(str2)) {
                                c = 4;
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case 74:
                            if (mo151482.equals("J")) {
                                c = 5;
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                            if (mo151482.equals("S")) {
                                c = 6;
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case 90:
                            if (mo151482.equals("Z")) {
                                c = 7;
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case 2887:
                            if (mo151482.equals("[B")) {
                                c = '\b';
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case 2888:
                            if (mo151482.equals("[C")) {
                                c = '\t';
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case 2894:
                            if (mo151482.equals("[I")) {
                                c = '\n';
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case 2904:
                            if (mo151482.equals("[S")) {
                                c = 11;
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        case 1379658506:
                            if (mo151482.equals("Ljava/lang/String;")) {
                                c = '\f';
                                break;
                            }
                            obj3 = obj2;
                            c = 65535;
                            break;
                        default:
                            obj3 = obj2;
                            c = 65535;
                            break;
                    }
                    obj3 = obj2;
                    switch (c) {
                        case 0:
                            obj2 = obj3;
                            str = str2;
                            c10130.writeByte(0);
                            c10130.writeInt(((Number) objArr[nextInt]).byteValue());
                            break;
                        case 1:
                            obj2 = obj3;
                            str = str2;
                            c10130.writeByte(2);
                            c10130.mo13227((char) ((Number) objArr[nextInt]).shortValue());
                            break;
                        case 2:
                            obj2 = obj3;
                            str = str2;
                            int nextInt2 = m512862.nextInt();
                            c10130.writeByte(6);
                            c10130.writeInt(((Number) objArr[nextInt]).intValue());
                            c10130.writeInt(((Number) objArr[nextInt2]).intValue());
                            break;
                        case 3:
                            obj2 = obj3;
                            str = str2;
                            c10130.writeByte(5);
                            c10130.writeInt(((Number) objArr[nextInt]).intValue());
                            break;
                        case 4:
                            obj2 = obj3;
                            str = str2;
                            c10130.writeByte(3);
                            c10130.writeInt(((Number) objArr[nextInt]).intValue());
                            break;
                        case 5:
                            obj2 = obj3;
                            str = str2;
                            int nextInt3 = m512862.nextInt();
                            c10130.writeByte(4);
                            c10130.writeInt(((Number) objArr[nextInt]).intValue());
                            c10130.writeInt(((Number) objArr[nextInt3]).intValue());
                            break;
                        case 6:
                            obj2 = obj3;
                            str = str2;
                            c10130.writeByte(1);
                            c10130.writeInt(((Number) objArr[nextInt]).shortValue());
                            break;
                        case 7:
                            obj2 = obj3;
                            str = str2;
                            c10130.writeByte(7);
                            c10130.m25425(((Number) objArr[nextInt]).intValue() != 0);
                            break;
                        case '\b':
                            obj2 = obj3;
                            str = str2;
                            c10130.writeByte(charSequence.equals("[B") ? 10 : 11);
                            c10130.m25434(((C4754) it2.next()).m13903());
                            break;
                        case '\t':
                            obj2 = obj3;
                            str = str2;
                            c10130.writeByte(13);
                            char[] m10205 = ((C3343) it4.next()).m10205();
                            c10130.writeInt(m10205.length);
                            for (char c2 : m10205) {
                                c10130.mo13227(c2);
                            }
                            break;
                        case '\n':
                            obj2 = obj3;
                            str = str2;
                            c10130.writeByte(14);
                            c10130.m25435(((C13220) it5.next()).m32057());
                            break;
                        case 11:
                            c10130.writeByte(12);
                            short[] m20317 = ((C7576) it3.next()).m20317();
                            c10130.writeInt(m20317.length);
                            int length = m20317.length;
                            obj2 = obj3;
                            int i4 = 0;
                            while (true) {
                                str = str2;
                                if (i4 < length) {
                                    c10130.mo13229(m20317[i4]);
                                    i4++;
                                    str2 = str;
                                }
                            }
                            break;
                        case '\f':
                            c10130.writeByte(charSequence.equals("Ljava/lang/String;") ? 8 : 9);
                            c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                            obj2 = obj3;
                            str = str2;
                            break;
                        default:
                            throw new RuntimeException("Unsupported type: ".concat(mo151482));
                    }
                    i3++;
                    abstractC16543 = this;
                    mo3565 = list;
                    str2 = str;
                }
                String m13381 = c17249.f52882.m13381(c10130.m25444());
                if (m13381 == null) {
                    C11003.toString(c1032);
                }
                return m13381;
            }
        }
    }

    /* renamed from: ֫ */
    public void mo3536(C15152 c15152, C0336 c0336, C23098 c23098, C13925 c13925) {
        if (c13925 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        c15152.f46301.m3814(c23098.m51285(), c0336);
        c13925.m33361(c15152);
        C10399 c10399 = this.f50830;
        if (c10399 != null) {
            c10399.m26229(c15152);
        }
        Iterator it = this.f50829.iterator();
        while (it.hasNext()) {
            ((C1541) it.next()).m5284(c15152);
        }
        Iterator it2 = this.f50831.iterator();
        while (it2.hasNext()) {
            ((C4754) it2.next()).m13901(c15152);
        }
        Iterator it3 = this.f50834.iterator();
        while (it3.hasNext()) {
            ((C7576) it3.next()).m20315(c15152);
        }
        Iterator it4 = this.f50833.iterator();
        while (it4.hasNext()) {
            ((C3343) it4.next()).m10203(c15152);
        }
        Iterator it5 = this.f50832.iterator();
        while (it5.hasNext()) {
            ((C13220) it5.next()).m32055(c15152);
        }
    }
}
