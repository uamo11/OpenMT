package l;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: 014Q */
/* renamed from: l.ܽۗܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C16376 {

    /* renamed from: ۫֫۠, reason: not valid java name and contains not printable characters */
    private static final short[] f50387;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f50388;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f50389;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f50390;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f50391;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50392;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50393;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f50394;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m38570();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public C16376(String str, int i) {
        String str2;
        ArrayList arrayList;
        int i2;
        char c;
        String str3;
        String str4;
        String str5;
        LinkedHashSet linkedHashSet;
        HashMap hashMap;
        C16376 c16376;
        Object obj;
        String str6;
        String str7;
        String str8;
        String str9;
        C7246 c7246;
        Iterator it;
        String m38568;
        C7246 c72462;
        String str10;
        Iterator it2;
        String m385682;
        C7246 c72463;
        String str11;
        C7246 c72464;
        C7246 c72465;
        String str12;
        String str13;
        String str14;
        boolean z;
        Object obj2;
        C12185 c12185;
        char c2;
        String substring;
        int i3;
        this.f50391 = -1;
        C1560 c1560 = new C1560(this);
        try {
            AbstractC4628 listIterator = AbstractC21189.m48137(str).mo48139().listIterator(0);
            int i4 = i;
            boolean z2 = false;
            while (true) {
                String str15 = ".end";
                String str16 = "return";
                String str17 = "if-nez";
                String str18 = "if-ltz";
                String str19 = "if-lez";
                String str20 = "if-gez";
                String str21 = "if-eqz";
                String str22 = "return-wide";
                String str23 = ".end sparse-switch";
                if (!listIterator.hasNext()) {
                    Object obj3 = "if-gtz";
                    String str24 = ".end packed-switch";
                    c1560.m5335();
                    ArrayList arrayList2 = c1560.f5510;
                    String str25 = "goto";
                    C16376 c163762 = this;
                    c163762.f50393 = arrayList2;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    c163762.f50390 = linkedHashSet2;
                    String str26 = ":";
                    HashMap hashMap2 = new HashMap();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        String str27 = str24;
                        C7246 c72466 = (C7246) it3.next();
                        LinkedHashSet linkedHashSet3 = linkedHashSet2;
                        for (Iterator it4 = c72466.f22238.iterator(); it4.hasNext(); it4 = it4) {
                            hashMap2.put((String) it4.next(), c72466);
                        }
                        linkedHashSet2 = linkedHashSet3;
                        str24 = str27;
                    }
                    String str28 = str24;
                    LinkedHashSet linkedHashSet4 = linkedHashSet2;
                    int size = arrayList2.size();
                    int i5 = 0;
                    C7246 c72467 = null;
                    while (i5 < size) {
                        HashMap hashMap3 = hashMap2;
                        C7246 c72468 = (C7246) arrayList2.get(i5);
                        List list = c72468.f22234;
                        String str29 = ((C11480) C7166.m19188(1, list)).f34287;
                        int indexOf = str29.indexOf(32);
                        ArrayList arrayList3 = arrayList2;
                        String substring2 = indexOf == -1 ? str29 : str29.substring(0, indexOf);
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case -1532365807:
                                if (substring2.equals("return-void")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1532341936:
                                if (substring2.equals("return-wide")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1193266018:
                                if (substring2.equals("if-eqz")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1193264468:
                                if (substring2.equals("if-gez")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1193264003:
                                if (substring2.equals(obj3)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1193259663:
                                if (substring2.equals(str19)) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1193259198:
                                if (substring2.equals(str18)) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1193257741:
                                if (substring2.equals(str17)) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -934396624:
                                if (substring2.equals(str16)) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1470957:
                                if (substring2.equals(str15)) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3178851:
                                if (substring2.equals(str25)) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 100054876:
                                if (substring2.equals("if-eq")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 100054926:
                                if (substring2.equals("if-ge")) {
                                    c = '\f';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 100054941:
                                if (substring2.equals("if-gt")) {
                                    c = '\r';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 100055081:
                                if (substring2.equals("if-le")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 100055096:
                                if (substring2.equals("if-lt")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 100055143:
                                if (substring2.equals("if-ne")) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 110339814:
                                if (substring2.equals("throw")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 211916369:
                                if (substring2.equals("goto/16")) {
                                    c = 18;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 211916427:
                                if (substring2.equals("goto/32")) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 302833181:
                                if (substring2.equals("throw-verification-error")) {
                                    c = 20;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 357866108:
                                if (substring2.equals("return-object")) {
                                    c = 21;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 489643561:
                                if (substring2.equals("packed-switch")) {
                                    c = 22;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 750443003:
                                if (substring2.equals("return-void-barrier")) {
                                    c = 23;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1677267841:
                                if (substring2.equals("sparse-switch")) {
                                    c = 24;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2018064103:
                                if (substring2.equals("return-void-no-barrier")) {
                                    c = 25;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                            case '\b':
                            case 17:
                            case 20:
                            case 21:
                            case 23:
                            case 25:
                                str3 = str15;
                                str4 = str16;
                                str5 = str19;
                                linkedHashSet = linkedHashSet4;
                                hashMap = hashMap3;
                                arrayList2 = arrayList3;
                                c16376 = this;
                                obj = obj3;
                                str6 = str18;
                                str7 = str28;
                                str8 = str26;
                                str9 = str17;
                                if (c72467 == null) {
                                    c7246 = new C7246(c16376, arrayList2.size(), new ArrayList(0));
                                    arrayList2.add(c7246);
                                } else {
                                    c7246 = c72467;
                                }
                                linkedHashSet.add(new C5835(c16376, c72468, c7246, 5));
                                c72467 = c7246;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 11:
                            case '\f':
                            case '\r':
                            case 14:
                            case 15:
                            case 16:
                                str3 = str15;
                                str4 = str16;
                                str5 = str19;
                                linkedHashSet = linkedHashSet4;
                                hashMap = hashMap3;
                                arrayList2 = arrayList3;
                                c16376 = this;
                                obj = obj3;
                                str6 = str18;
                                str7 = str28;
                                str8 = str26;
                                str9 = str17;
                                int i6 = i5 + 1;
                                C7246 c72469 = i6 < size ? (C7246) arrayList2.get(i6) : null;
                                if (c72469 != null) {
                                    linkedHashSet.add(new C5835(c16376, c72468, c72469, 0));
                                }
                                C7246 c724610 = (C7246) hashMap.get(m38568(str29));
                                if (c724610 != null) {
                                    linkedHashSet.add(new C5835(c16376, c72468, c724610, 1));
                                    break;
                                } else {
                                    break;
                                }
                            case '\t':
                                str4 = str16;
                                linkedHashSet = linkedHashSet4;
                                arrayList2 = arrayList3;
                                c16376 = this;
                                obj = obj3;
                                str6 = str18;
                                String str30 = str28;
                                str3 = str15;
                                hashMap = hashMap3;
                                str9 = str17;
                                if (str29.startsWith(str30)) {
                                    Iterator it5 = list.iterator();
                                    boolean z3 = true;
                                    while (it5.hasNext()) {
                                        String str31 = str30;
                                        String str32 = ((C11480) it5.next()).f34287;
                                        if (z3) {
                                            it2 = it5;
                                            if (str32.startsWith(".packed-switch ")) {
                                                str11 = str19;
                                                z3 = false;
                                            }
                                            str11 = str19;
                                        } else {
                                            it2 = it5;
                                            String str33 = str26;
                                            if (!str32.startsWith(str33) || (m385682 = m38568(str32)) == null || (c72463 = (C7246) hashMap.get(m385682)) == null) {
                                                str26 = str33;
                                                str11 = str19;
                                            } else {
                                                str26 = str33;
                                                str11 = str19;
                                                linkedHashSet.add(new C5835(c16376, c72468, c72463, 2));
                                            }
                                        }
                                        it5 = it2;
                                        str30 = str31;
                                        str19 = str11;
                                    }
                                    str7 = str30;
                                    str5 = str19;
                                    str8 = str26;
                                    break;
                                } else {
                                    str7 = str30;
                                    str5 = str19;
                                    String str34 = str26;
                                    String str35 = str23;
                                    if (str29.startsWith(str35)) {
                                        Iterator it6 = list.iterator();
                                        boolean z4 = true;
                                        while (it6.hasNext()) {
                                            String str36 = str35;
                                            String str37 = ((C11480) it6.next()).f34287;
                                            if (z4) {
                                                it = it6;
                                                if (str37.startsWith(".sparse-switch")) {
                                                    str10 = str34;
                                                    z4 = false;
                                                }
                                                str10 = str34;
                                            } else {
                                                it = it6;
                                                if (str37.contains("->") && (m38568 = m38568(str37)) != null && (c72462 = (C7246) hashMap.get(m38568)) != null) {
                                                    str10 = str34;
                                                    linkedHashSet.add(new C5835(c16376, c72468, c72462, 2));
                                                }
                                                str10 = str34;
                                            }
                                            it6 = it;
                                            str35 = str36;
                                            str34 = str10;
                                        }
                                        str23 = str35;
                                        str8 = str34;
                                        break;
                                    } else {
                                        str23 = str35;
                                        str8 = str34;
                                        int i7 = i5 + 1;
                                        C7246 c724611 = i7 < size ? (C7246) arrayList2.get(i7) : null;
                                        if (c724611 != null) {
                                            linkedHashSet.add(new C5835(c16376, c72468, c724611, 0));
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            case '\n':
                            case 18:
                            case 19:
                                str3 = str15;
                                str4 = str16;
                                linkedHashSet = linkedHashSet4;
                                hashMap = hashMap3;
                                arrayList2 = arrayList3;
                                c16376 = this;
                                obj = obj3;
                                str6 = str18;
                                str9 = str17;
                                C7246 c724612 = (C7246) hashMap.get(m38568(str29));
                                if (c724612 != null) {
                                    linkedHashSet.add(new C5835(c16376, c72468, c724612, 4));
                                }
                                str5 = str19;
                                str7 = str28;
                                str8 = str26;
                                break;
                            case 22:
                            case 24:
                                int i8 = i5 + 1;
                                if (i8 < size) {
                                    arrayList2 = arrayList3;
                                    c72464 = (C7246) arrayList2.get(i8);
                                } else {
                                    arrayList2 = arrayList3;
                                    c72464 = null;
                                }
                                if (c72464 != null) {
                                    obj = obj3;
                                    str3 = str15;
                                    str4 = str16;
                                    c16376 = this;
                                    str9 = str17;
                                    c72465 = c72468;
                                    C5835 c5835 = new C5835(c16376, c72465, c72464, 0);
                                    linkedHashSet = linkedHashSet4;
                                    linkedHashSet.add(c5835);
                                } else {
                                    obj = obj3;
                                    str3 = str15;
                                    str4 = str16;
                                    linkedHashSet = linkedHashSet4;
                                    c16376 = this;
                                    str9 = str17;
                                    c72465 = c72468;
                                }
                                hashMap = hashMap3;
                                C7246 c724613 = (C7246) hashMap.get(m38568(str29));
                                if (c724613 != null) {
                                    str6 = str18;
                                    linkedHashSet.add(new C5835(c16376, c72465, c724613, 1));
                                } else {
                                    str6 = str18;
                                }
                                str5 = str19;
                                str7 = str28;
                                str8 = str26;
                                break;
                            default:
                                str3 = str15;
                                str4 = str16;
                                str5 = str19;
                                linkedHashSet = linkedHashSet4;
                                hashMap = hashMap3;
                                arrayList2 = arrayList3;
                                c16376 = this;
                                obj = obj3;
                                str6 = str18;
                                str7 = str28;
                                str8 = str26;
                                str9 = str17;
                                int i9 = i5 + 1;
                                C7246 c724614 = i9 < size ? (C7246) arrayList2.get(i9) : null;
                                if (c724614 != null) {
                                    linkedHashSet.add(new C5835(c16376, c72468, c724614, 0));
                                    break;
                                } else {
                                    break;
                                }
                        }
                        i5++;
                        hashMap2 = hashMap;
                        str18 = str6;
                        str26 = str8;
                        str17 = str9;
                        str28 = str7;
                        str15 = str3;
                        obj3 = obj;
                        str19 = str5;
                        linkedHashSet4 = linkedHashSet;
                        c163762 = c16376;
                        str16 = str4;
                    }
                    C16376 c163763 = c163762;
                    LinkedHashSet<C5835> linkedHashSet5 = c163763.f50390;
                    ArrayList arrayList4 = c163763.f50393;
                    int size2 = arrayList4.size();
                    C10733[] c10733Arr = new C10733[size2];
                    for (int i10 = 0; i10 < size2; i10++) {
                        c10733Arr[i10] = new C10733((C7246) arrayList4.get(i10));
                    }
                    for (C5835 c58352 : linkedHashSet5) {
                        c10733Arr[c58352.f17891.f22229].f32346.add(c58352);
                        c10733Arr[c58352.f17887.f22229].f32345.add(c58352);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int i11 = 0;
                    while (i11 < size2) {
                        C10733 c10733 = c10733Arr[i11];
                        boolean z5 = c10733.f32344;
                        ArrayList arrayList6 = c10733.f32346;
                        ArrayList arrayList7 = c10733.f32345;
                        C7246 c724615 = c10733.f32343;
                        if (!z5) {
                            List list2 = c724615.f22234;
                            if (!list2.isEmpty() && c724615.f22238.isEmpty() && list2.size() <= 3 && ((C11480) list2.get(0)).f34287.startsWith(str25) && arrayList7.size() == 1 && arrayList6.size() == 1) {
                                C5835 c58353 = (C5835) arrayList7.get(0);
                                C5835 c58354 = (C5835) arrayList6.get(0);
                                if (c58353.f17889 == 0 && c58354.f17889 == 0) {
                                    C7246 c724616 = c58353.f17891;
                                    C7246 c724617 = c58354.f17887;
                                    C11480 m19355 = c724616.m19355();
                                    ArrayList arrayList8 = c724616.f22237;
                                    str2 = str25;
                                    List list3 = c724616.f22234;
                                    i2 = size2;
                                    C11480 c11480 = (C11480) list2.get(0);
                                    int i12 = m19355.f34288;
                                    arrayList = arrayList4;
                                    int i13 = i12 + 2;
                                    int i14 = c11480.f34288;
                                    if (i13 == i14) {
                                        list3.add(new C11480(i12 + 1, ""));
                                        arrayList8.add(null);
                                    } else if (i13 != i14) {
                                        i11++;
                                        size2 = i2;
                                        str25 = str2;
                                        arrayList4 = arrayList;
                                    }
                                    c10733Arr[c724616.f22229].f32344 = true;
                                    c10733Arr[c724617.f22229].f32344 = true;
                                    list3.addAll(list2);
                                    arrayList8.addAll(c724615.f22237);
                                    linkedHashSet5.remove(c58353);
                                    linkedHashSet5.remove(c58354);
                                    linkedHashSet5.add(new C5835(c163763, c724616, c724617, 0));
                                    arrayList5.add(c724615);
                                    i11++;
                                    size2 = i2;
                                    str25 = str2;
                                    arrayList4 = arrayList;
                                }
                            }
                        }
                        str2 = str25;
                        arrayList = arrayList4;
                        i2 = size2;
                        i11++;
                        size2 = i2;
                        str25 = str2;
                        arrayList4 = arrayList;
                    }
                    ArrayList arrayList9 = arrayList4;
                    if (!arrayList5.isEmpty()) {
                        arrayList9.removeAll(arrayList5);
                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                            ((C7246) arrayList9.get(i15)).f22229 = i15;
                        }
                        ArrayList arrayList10 = new ArrayList(linkedHashSet5);
                        linkedHashSet5.clear();
                        linkedHashSet5.addAll(arrayList10);
                    }
                    ArrayList<C12185> arrayList11 = c1560.f5512;
                    ArrayList arrayList12 = c163763.f50393;
                    if (arrayList11.isEmpty()) {
                        return;
                    }
                    HashMap hashMap4 = new HashMap();
                    Iterator it7 = arrayList12.iterator();
                    while (it7.hasNext()) {
                        C7246 c724618 = (C7246) it7.next();
                        Iterator it8 = c724618.f22238.iterator();
                        while (it8.hasNext()) {
                            hashMap4.put((String) it8.next(), c724618);
                        }
                    }
                    for (C12185 c121852 : arrayList11) {
                        C7246 c724619 = (C7246) hashMap4.get(c121852.f36334);
                        C7246 c724620 = (C7246) hashMap4.get(c121852.f36333);
                        C7246 c724621 = (C7246) hashMap4.get(c121852.f36331);
                        if (c724619 != null && c724620 != null && c724621 != null) {
                            c724621.m19354(c121852.f36332);
                            for (int i16 = c724619.f22229; i16 < c724620.f22229; i16++) {
                                c163763.f50390.add(new C5835(c163763, (C7246) arrayList12.get(i16), c724621, 3));
                            }
                        }
                    }
                    return;
                }
                int i17 = i4 + 1;
                String trim = ((String) listIterator.next()).trim();
                AbstractC4628 abstractC4628 = listIterator;
                if (trim.startsWith(".registers ") || trim.startsWith(".locals ") || trim.startsWith(".param ") || trim.startsWith(".annotation ")) {
                    c1560.m5335();
                } else if (trim.startsWith(".end param") || trim.startsWith(".end annotation")) {
                    c1560.f5511.clear();
                } else {
                    if (trim.startsWith(":") && z2) {
                        ArrayList arrayList13 = new ArrayList();
                        while (true) {
                            if (c1560.f5511.isEmpty()) {
                                str12 = str20;
                                str13 = str21;
                                str14 = str22;
                            } else {
                                str14 = str22;
                                C11480 c114802 = (C11480) C18566.m43105(c1560.f5511, 1);
                                str13 = str21;
                                int indexOf2 = c114802.f34287.indexOf(32);
                                if (indexOf2 == -1) {
                                    substring = c114802.f34287;
                                    i3 = 0;
                                    str12 = str20;
                                } else {
                                    str12 = str20;
                                    substring = c114802.f34287.substring(0, indexOf2);
                                    i3 = 0;
                                }
                                if (!substring.matches("[a-z0-9\\-/]+")) {
                                    arrayList13.add(i3, c114802);
                                    C18473.m42953(c1560.f5511, 1);
                                    str22 = str14;
                                    str21 = str13;
                                    str20 = str12;
                                }
                            }
                        }
                        c1560.m5335();
                        c1560.f5511 = arrayList13;
                        z2 = false;
                    } else {
                        str12 = "if-gez";
                        str13 = "if-eqz";
                        str14 = "return-wide";
                    }
                    if (trim.startsWith(".catch ") || trim.startsWith(".catchall ")) {
                        Matcher matcher = f50388.matcher(trim);
                        if (matcher.find()) {
                            z = z2;
                            obj2 = "if-gtz";
                            c12185 = new C12185(new C11480(i4, trim), matcher.group(1), matcher.group(2), matcher.group(3));
                        } else {
                            z = z2;
                            obj2 = "if-gtz";
                            c12185 = null;
                        }
                        if (c12185 != null) {
                            c1560.f5512.add(c12185);
                        }
                    } else {
                        z = z2;
                        obj2 = "if-gtz";
                    }
                    c1560.f5511.add(new C11480(i4, trim));
                    int indexOf3 = trim.indexOf(32);
                    String substring3 = indexOf3 == -1 ? trim : trim.substring(0, indexOf3);
                    z2 = substring3.matches("[a-z0-9\\-/]+") ? true : z;
                    switch (substring3.hashCode()) {
                        case -1532365807:
                            if (substring3.equals("return-void")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1532341936:
                            if (substring3.equals(str14)) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1193266018:
                            if (substring3.equals(str13)) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1193264468:
                            if (substring3.equals(str12)) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1193264003:
                            if (substring3.equals(obj2)) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1193259663:
                            if (substring3.equals("if-lez")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1193259198:
                            if (substring3.equals("if-ltz")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1193257741:
                            if (substring3.equals("if-nez")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -934396624:
                            if (substring3.equals("return")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1470957:
                            if (substring3.equals(".end")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3178851:
                            if (substring3.equals("goto")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 100054876:
                            if (substring3.equals("if-eq")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 100054926:
                            if (substring3.equals("if-ge")) {
                                c2 = '\f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 100054941:
                            if (substring3.equals("if-gt")) {
                                c2 = '\r';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 100055081:
                            if (substring3.equals("if-le")) {
                                c2 = 14;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 100055096:
                            if (substring3.equals("if-lt")) {
                                c2 = 15;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 100055143:
                            if (substring3.equals("if-ne")) {
                                c2 = 16;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 110339814:
                            if (substring3.equals("throw")) {
                                c2 = 17;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 211916369:
                            if (substring3.equals("goto/16")) {
                                c2 = 18;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 211916427:
                            if (substring3.equals("goto/32")) {
                                c2 = 19;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 302833181:
                            if (substring3.equals("throw-verification-error")) {
                                c2 = 20;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 357866108:
                            if (substring3.equals("return-object")) {
                                c2 = 21;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 489643561:
                            if (substring3.equals("packed-switch")) {
                                c2 = 22;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 750443003:
                            if (substring3.equals("return-void-barrier")) {
                                c2 = 23;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1677267841:
                            if (substring3.equals("sparse-switch")) {
                                c2 = 24;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2018064103:
                            if (substring3.equals("return-void-no-barrier")) {
                                c2 = 25;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            c1560.m5335();
                            z2 = false;
                            break;
                        case '\t':
                            if (!trim.startsWith(".end packed-switch") && !trim.startsWith(str23)) {
                                break;
                            } else {
                                c1560.m5335();
                                z2 = false;
                                break;
                            }
                    }
                    i4 = i17;
                    listIterator = abstractC4628;
                }
                z2 = false;
                i4 = i17;
                listIterator = abstractC4628;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38571() {
        Paint paint = new Paint(1);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(C10069.f30270 * 18.0f);
        Iterator it = this.f50393.iterator();
        while (it.hasNext()) {
            ((C7246) it.next()).m19352(paint);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38568(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return null;
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        int indexOf3 = str.indexOf(35, i);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        if (indexOf3 == -1) {
            indexOf3 = str.length();
        }
        return str.substring(indexOf, Math.min(indexOf2, indexOf3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7246 m38569(PointF pointF) {
        Iterator it = this.f50393.iterator();
        while (it.hasNext()) {
            C7246 c7246 = (C7246) it.next();
            float m19357 = c7246.m19357();
            float m19359 = c7246.m19359() + m19357;
            float m19362 = c7246.m19362();
            float m19349 = c7246.m19349() + m19362;
            float f = pointF.x;
            if (m19357 <= f && f <= m19359) {
                float f2 = pointF.y;
                if (m19362 <= f2 && f2 <= m19349) {
                    return c7246;
                }
            }
        }
        return null;
    }

    static {
        ApplicationC12518.m30701(122);
        f50387 = new short[]{6452, 11161, -3135, 10745, -17128, -17105, -17105, -17102, -17105};
        f50388 = Pattern.compile("\\{\\s*(:[a-zA-Z0-9_$]+)\\s*\\.\\.\\s*(:[a-zA-Z0-9_$]+)\\s*\\}\\s*(:[a-zA-Z0-9_$]+)");
    }

    public C16376(C12951 c12951) {
        this.f50391 = -1;
        if (c12951.readInt() != 1986488099) {
            throw new RuntimeException();
        }
        this.f50394 = c12951.readInt();
        this.f50392 = c12951.readInt();
        this.f50391 = c12951.readInt();
        int readInt = c12951.readInt();
        this.f50393 = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f50393.add(new C7246(this, c12951));
        }
        int readInt2 = c12951.readInt();
        this.f50390 = new LinkedHashSet(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f50390.add(new C5835(this, c12951));
        }
    }
}
