package l;

import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* compiled from: 64JA */
/* renamed from: l.۫᩶ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12639 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f38077;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38081;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4160 f38082;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f38075 = Pattern.compile("v\\d+");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f38078 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+|\\s([+,-])?\\d+");

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f38076 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+([l,L])?|\\s([+,-])?\\d+([l,L])?");

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f38079 = Pattern.compile("\\s|:|->");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f38080 = Pattern.compile("\\s|\\(|\\)|->");

    public C12639(C4160 c4160) {
        this.f38082 = c4160;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30910(C4849 c4849) {
        int[] iArr;
        int i;
        Object obj;
        Object obj2;
        C4160 c4160 = this.f38082;
        if (c4160 == null) {
            return;
        }
        AbstractC2043[] abstractC2043Arr = c4160.f13573;
        int[] iArr2 = new int[abstractC2043Arr.length];
        Arrays.fill(iArr2, -1);
        C6486 c6486 = new C6486(1);
        HashMap hashMap = new HashMap();
        int length = abstractC2043Arr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C6339 c6339 = abstractC2043Arr[i3];
            switch (C13344.f39919[c6339.mo2742().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    iArr2[i3] = ((InterfaceC14742) c6339).mo4860() + i2;
                    int i4 = C13344.f39920[c6339.f6840.ordinal()];
                    if (i4 != 1 && i4 != 2) {
                        break;
                    } else {
                        hashMap.put(Integer.valueOf(iArr2[i3]), Integer.valueOf(i2));
                        break;
                    }
                case 7:
                case 8:
                    int intValue = ((Integer) hashMap.get(Integer.valueOf(i2))).intValue();
                    for (int i5 : c6339.mo17617()) {
                        c6486.m17879(intValue + i5, 0);
                    }
                    break;
            }
            i2 += c6339.mo6715(i2);
        }
        Arrays.sort(iArr2);
        int[] iArr3 = {-1};
        if (c6486.m17881() > 0) {
            iArr3 = c6486.m17880();
        }
        Arrays.sort(iArr3);
        C2749[] c2749Arr = c4160.f13575;
        if (c2749Arr != null && c2749Arr.length > 0) {
            C6486 c64862 = new C6486(3);
            for (C2749 c2749 : c2749Arr) {
                int m8500 = c2749.m8500();
                int m8501 = c2749.m8501() + m8500;
                c64862.m17879(m8500, 0);
                c64862.m17879(m8501, 0);
                C9099 c9099 = c2749.f8553;
                int m23473 = c9099.m23473();
                if (m23473 != -1) {
                    c64862.m17879(m23473, 0);
                } else {
                    for (C16153 c16153 : c9099.f27575) {
                        c64862.m17879(c16153.m38080(), 0);
                    }
                }
            }
            iArr = c64862.m17880();
        } else {
            iArr = new int[]{-1};
        }
        Arrays.sort(iArr);
        int length2 = abstractC2043Arr.length;
        int i6 = 0;
        int i7 = 0;
        Object[] objArr = abstractC2043Arr;
        while (i6 < length2) {
            C6339 c63392 = objArr[i6];
            if (Arrays.binarySearch(iArr2, i7) >= 0) {
                c4849.write("label_");
                c4849.write(String.valueOf(i7));
                c4849.write(58);
                c4849.write(10);
            } else if (Arrays.binarySearch(iArr, i7) >= 0) {
                c4849.write("label_");
                c4849.write(String.valueOf(i7));
                c4849.write(58);
                c4849.write(10);
            }
            if (Arrays.binarySearch(iArr3, i7) >= 0) {
                c4849.write("switch_");
                c4849.m14115(i7);
                c4849.write(58);
                c4849.write(10);
            }
            int[] iArr4 = C13344.f39919;
            EnumC23957 mo2742 = c63392.mo2742();
            EnumC23915 enumC23915 = c63392.f6840;
            switch (iArr4[mo2742.ordinal()]) {
                case 1:
                    obj = objArr;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    m30902(c4849, ((C21136) c63392).mo4860() + i7);
                    c4849.write(10);
                    break;
                case 2:
                case 5:
                    obj = objArr;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    m30902(c4849, ((InterfaceC14742) c63392).mo4860() + i7);
                    c4849.write(10);
                    break;
                case 3:
                    obj = objArr;
                    C13373 c13373 = (C13373) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c13373.mo2740());
                    c4849.write(32);
                    m30902(c4849, c13373.mo4860() + i7);
                    c4849.write(10);
                    break;
                case 4:
                    obj = objArr;
                    C16922 c16922 = (C16922) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c16922.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c16922.m39769());
                    c4849.write(32);
                    m30902(c4849, c16922.mo4860() + i7);
                    c4849.write(10);
                    break;
                case 6:
                    obj = objArr;
                    C19040 c19040 = (C19040) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c19040.mo2740());
                    c4849.write(32);
                    m30902(c4849, c19040.mo4860() + i7);
                    c4849.write(10);
                    break;
                case 7:
                    obj = objArr;
                    C6339 c63393 = c63392;
                    c4849.write(".pswitch_data ");
                    int m17616 = c63393.m17616();
                    c4849.m14115(m17616);
                    c4849.write(10);
                    c4849.m14117();
                    int intValue2 = ((Integer) hashMap.get(Integer.valueOf(i7))).intValue();
                    int[] mo17617 = c63393.mo17617();
                    int length3 = mo17617.length;
                    int i8 = 0;
                    while (i8 < length3) {
                        int i9 = mo17617[i8] + intValue2;
                        c4849.write(String.valueOf(m17616));
                        c4849.write(" : switch_");
                        c4849.write(String.valueOf(i9));
                        c4849.write(10);
                        i8++;
                        m17616++;
                    }
                    c4849.m14114();
                    c4849.write(".end pswitch_data");
                    c4849.write(10);
                    break;
                case 8:
                    obj = objArr;
                    c4849.write(".sswitch_data");
                    c4849.write(10);
                    int intValue3 = ((Integer) hashMap.get(Integer.valueOf(i7))).intValue();
                    Iterator m33712 = ((C14099) c63392).m33712();
                    c4849.m14117();
                    while (m33712.hasNext()) {
                        C23272 c23272 = (C23272) m33712.next();
                        int i10 = c23272.f74748;
                        int i11 = c23272.f74749 + intValue3;
                        c4849.write(String.valueOf(i10));
                        c4849.write(" : switch_");
                        c4849.write(String.valueOf(i11));
                        c4849.write(10);
                    }
                    c4849.m14114();
                    c4849.write(".end sswitch_data");
                    c4849.write(10);
                    break;
                case 9:
                    obj = objArr;
                    if (enumC23915 == EnumC23915.f77361) {
                        break;
                    } else {
                        c4849.write(enumC23915.f77585);
                        c4849.write(10);
                        break;
                    }
                case 10:
                    obj = objArr;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(((C19019) c63392).mo2740());
                    c4849.write(10);
                    break;
                case 11:
                    obj = objArr;
                    C2791 c2791 = (C2791) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c2791.mo2740());
                    c4849.write(32);
                    c4849.write(String.valueOf(c2791.mo6990()));
                    c4849.write(32);
                    c4849.write(10);
                    break;
                case 12:
                    obj = objArr;
                    C0673 c0673 = (C0673) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c0673.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c0673.m2741());
                    c4849.write(10);
                    break;
                case 13:
                case 14:
                    obj = objArr;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(((InterfaceC21094) c63392).mo2740());
                    c4849.write(32);
                    m30903(c4849, c63392);
                    c4849.write(10);
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    obj = objArr;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(((InterfaceC21094) c63392).mo2740());
                    c4849.write(32);
                    long mo6990 = ((InterfaceC18271) c63392).mo6990();
                    if (mo6990 < 0) {
                        c4849.write("-0x");
                        c4849.m14116(-mo6990);
                        if (mo6990 < -2147483648L) {
                            c4849.write(76);
                        }
                    } else {
                        c4849.write("0x");
                        c4849.m14116(mo6990);
                        if (mo6990 > 2147483647L) {
                            c4849.write(76);
                        }
                    }
                    c4849.write(10);
                    break;
                case 19:
                    obj = objArr;
                    C17628 c17628 = (C17628) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c17628.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c17628.m41218());
                    c4849.write(10);
                    break;
                case 20:
                    obj = objArr;
                    C10552 c10552 = (C10552) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c10552.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c10552.m26533());
                    c4849.write(32);
                    c4849.write(String.valueOf(c10552.mo6990()));
                    c4849.write(10);
                    break;
                case 21:
                    obj = objArr;
                    C11963 c11963 = (C11963) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c11963.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c11963.m29241());
                    c4849.write(32);
                    m30903(c4849, c11963);
                    c4849.write(10);
                    break;
                case 22:
                    obj = objArr;
                    C2106 c2106 = (C2106) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c2106.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c2106.m6991());
                    c4849.write(32);
                    c4849.write(String.valueOf(c2106.mo6990()));
                    c4849.write(10);
                    break;
                case 23:
                    obj = objArr;
                    C23978 c23978 = (C23978) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c23978.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c23978.m52797());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c23978.m52798());
                    c4849.write(10);
                    break;
                case 24:
                    obj = objArr;
                    C0694 c0694 = (C0694) c63392;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c0694.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c0694.m2783());
                    c4849.write(10);
                    break;
                case 25:
                case 26:
                    obj = objArr;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    InterfaceC16901 interfaceC16901 = (InterfaceC16901) c63392;
                    byte mo4894 = interfaceC16901.mo4894();
                    c4849.write(123);
                    if (mo4894 == 1) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                    } else if (mo4894 == 2) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4891());
                    } else if (mo4894 == 3) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4891());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4893());
                    } else if (mo4894 == 4) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4891());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4893());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4890());
                    } else if (mo4894 == 5) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4891());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4893());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4890());
                        c4849.write(",");
                        c4849.write(am.aE);
                        c4849.m14115((int) interfaceC16901.mo4889());
                    }
                    c4849.write(q.h);
                    c4849.write(32);
                    m30903(c4849, c63392);
                    c4849.write(10);
                    break;
                case 27:
                    obj = objArr;
                    C4928 c4928 = (C4928) c63392;
                    c4849.write(enumC23915.f77585);
                    short m14349 = c4928.m14349();
                    int m14348 = c4928.m14348();
                    c4849.write(32);
                    c4849.write(123);
                    c4849.write(118);
                    c4849.m14115(m14348);
                    c4849.write("..");
                    c4849.write(118);
                    c4849.m14115((c4928.m14348() + m14349) - 1);
                    c4849.write(q.h);
                    c4849.write(32);
                    m30903(c4849, c4928);
                    c4849.write(10);
                    break;
                case 28:
                    C14784 c14784 = (C14784) c63392;
                    c4849.write(".array_data");
                    c4849.write(32);
                    c4849.m14115(c14784.m35171());
                    c4849.write(10);
                    c4849.m14117();
                    Iterator m35169 = c14784.m35169();
                    Object obj3 = objArr;
                    while (m35169.hasNext()) {
                        C17607 c17607 = (C17607) m35169.next();
                        int i12 = c17607.f53796;
                        Object obj4 = obj3;
                        while (true) {
                            obj2 = obj4;
                            if (i12 < c17607.f53797 + c17607.f53796) {
                                byte b = c17607.f53795[i12];
                                c4849.write("0x");
                                c4849.m14116(b & 255);
                                c4849.write(116);
                                c4849.write(32);
                                i12++;
                                m35169 = m35169;
                                obj4 = obj2;
                                c17607 = c17607;
                            }
                        }
                        c4849.write(10);
                        obj3 = obj2;
                    }
                    obj = obj3;
                    c4849.m14114();
                    c4849.write(".end array_data");
                    c4849.write(10);
                    break;
                default:
                    obj = objArr;
                    break;
            }
            i7 += c63392.mo6715(i7);
            i6++;
            objArr = obj;
        }
        if (Arrays.binarySearch(iArr2, i7) >= 0) {
            c4849.write("label_");
            c4849.write(String.valueOf(i7));
            c4849.write(58);
            i = 10;
            c4849.write(10);
        } else {
            if (Arrays.binarySearch(iArr, i7) >= 0) {
                c4849.write(10);
                c4849.write("label_");
                c4849.write(String.valueOf(i7));
                c4849.write(58);
                c4849.write(10);
            }
            i = 10;
        }
        if (Arrays.binarySearch(iArr3, i7) >= 0) {
            c4849.write("switch_");
            c4849.write(String.valueOf(i7));
            c4849.write(58);
            c4849.write(i);
        }
        C2749[] c2749Arr2 = c4160.f13575;
        if (c2749Arr2 == null || c2749Arr2.length <= 0) {
            return;
        }
        c4849.write(i);
        c4849.write(i);
        c4849.write("#Handler Exceptions");
        c4849.write(i);
        c4849.write(i);
        int length4 = c2749Arr2.length;
        int i13 = 0;
        while (i13 < length4) {
            C2749 c27492 = c2749Arr2[i13];
            int m85002 = c27492.m8500();
            int m85012 = c27492.m8501() + m85002;
            C9099 c90992 = c27492.f8553;
            int m234732 = c90992.m23473();
            if (m234732 != -1) {
                c4849.write(".catch ");
                c4849.write(ProviderConfigurationPermission.ALL_STR);
                c4849.write(10);
                c4849.m14117();
                c4849.write("start : ");
                c4849.write("label_");
                c4849.m14115(m85002);
                c4849.write(10);
                c4849.write("end : ");
                c4849.write("label_");
                c4849.m14115(m85012);
                c4849.write(10);
                c4849.write("handler : ");
                c4849.write("label_");
                c4849.m14115(m234732);
                c4849.write(10);
                c4849.m14114();
                c4849.write(".end catch");
                c4849.write(10);
                c4849.write(10);
            } else {
                C16153[] c16153Arr = c90992.f27575;
                int length5 = c16153Arr.length;
                int i14 = 0;
                while (i14 < length5) {
                    C16153 c161532 = c16153Arr[i14];
                    c4849.write(".catch ");
                    c4849.write(c161532.f49753.m50835());
                    c4849.write(10);
                    c4849.m14117();
                    c4849.write("start : ");
                    c4849.write("label_");
                    c4849.m14115(m85002);
                    c4849.write(10);
                    c4849.write("end : ");
                    c4849.write("label_");
                    c4849.m14115(m85012);
                    c4849.write(10);
                    c4849.write("handler : ");
                    c4849.write("label_");
                    c4849.m14115(c161532.m38080());
                    c4849.write(10);
                    c4849.m14114();
                    c4849.write(".end catch");
                    c4849.write(10);
                    c4849.write(10);
                    i14++;
                    length4 = length4;
                }
            }
            i13++;
            length4 = length4;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30902(C4849 c4849, int i) {
        c4849.write(58);
        c4849.write("label_");
        c4849.write(String.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30903(C4849 c4849, AbstractC2043 abstractC2043) {
        AbstractC16859 abstractC16859 = (AbstractC16859) abstractC2043;
        int i = C13344.f39921[abstractC2043.f6840.f77584.ordinal()];
        if (i == 1) {
            c4849.write(((C18522) abstractC16859.m39631()).m43043());
            return;
        }
        if (i == 2) {
            c4849.write(((C22050) abstractC16859.m39631()).m49614());
            return;
        }
        if (i == 3) {
            c4849.write(((C22755) abstractC16859.m39631()).m50835());
            return;
        }
        if (i != 4) {
            return;
        }
        C11467 c11467 = (C11467) abstractC16859.m39631();
        c4849.write(34);
        String m28273 = c11467.m28273();
        for (int i2 = 0; i2 < m28273.length(); i2++) {
            char charAt = m28273.charAt(i2);
            if (charAt >= ' ' && charAt < 127) {
                if (charAt == '\'' || charAt == '\"' || charAt == '\\') {
                    c4849.write(92);
                }
                c4849.write(charAt);
            } else {
                if (charAt <= 127) {
                    if (charAt == '\t') {
                        c4849.write("\\t");
                    } else if (charAt == '\n') {
                        c4849.write("\\n");
                    } else if (charAt == '\r') {
                        c4849.write("\\r");
                    }
                }
                c4849.write(charAt);
            }
        }
        c4849.write(34);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x051a, code lost:
    
        r0 = r1.length;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x051d, code lost:
    
        if (r3 >= r0) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x051f, code lost:
    
        r33.f38081 = r3;
        r5 = r1[r3].trim();
        r7 = r18[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x052b, code lost:
    
        if (r7 == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x052d, code lost:
    
        r10 = l.C13344.f39919[r7.f77587.ordinal()];
        r29 = r0;
        r0 = l.C12639.f38075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0542, code lost:
    
        switch(r10) {
            case 1: goto L336;
            case 2: goto L335;
            case 3: goto L334;
            case 4: goto L333;
            case 5: goto L332;
            case 6: goto L331;
            case 7: goto L188;
            case 8: goto L188;
            case 9: goto L330;
            case 10: goto L329;
            case 11: goto L328;
            case 12: goto L327;
            case 13: goto L308;
            case 14: goto L306;
            case 15: goto L304;
            case 16: goto L303;
            case 17: goto L302;
            case 18: goto L233;
            case 19: goto L232;
            case 20: goto L231;
            case 21: goto L223;
            case 22: goto L222;
            case 23: goto L219;
            case 24: goto L218;
            case 25: goto L201;
            case 26: goto L188;
            case 27: goto L189;
            default: goto L188;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0545, code lost:
    
        r30 = r1;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x06fe, code lost:
    
        r3 = r2;
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0bdf, code lost:
    
        r0 = (r7.f77587.f77714 / 2) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0bf7, code lost:
    
        r3 = r16 + 1;
        r19 = r1;
        r12 = r2;
        r11 = r4;
        r9 = r24;
        r1 = r30;
        r6 = r31;
        r2 = r0;
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0552, code lost:
    
        r10 = new int[2];
        r30 = r1;
        r31 = r6;
        r0 = r0.matcher(r5.substring(r5.indexOf(123) + 1, r5.indexOf(com.alipay.sdk.m.y.q.h)));
        r0.find();
        r10[1] = java.lang.Integer.parseInt(r0.group().substring(1));
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0585, code lost:
    
        if (r0.find() == false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0587, code lost:
    
        r1 = java.lang.Integer.parseInt(r0.group().substring(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0594, code lost:
    
        r1 = (r1 - r10[1]) + 1;
        r10[0] = r1;
        l.C12639.f38077 = java.lang.Math.max(l.C12639.f38077, r1);
        r0 = l.C13344.f39921[r7.f77584.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05ae, code lost:
    
        if (r0 == 2) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05b1, code lost:
    
        if (r0 == 3) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05b3, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05be, code lost:
    
        r1 = r19;
        r1.add(new l.C4928(r7, (short) r10[0], r10[1], r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x06f9, code lost:
    
        r16 = r3;
        r24 = r9;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x05b5, code lost:
    
        r6 = m30907(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x05ba, code lost:
    
        r6 = m30908(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x05d1, code lost:
    
        r30 = r1;
        r31 = r6;
        r1 = r19;
        r10 = new byte[5];
        java.util.Arrays.fill(r10, (byte) 0);
        r0 = r0.matcher(r5.substring(r5.indexOf(123) + 1, r5.indexOf(com.alipay.sdk.m.y.q.h)));
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x05f9, code lost:
    
        if (r0.find() == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x05fc, code lost:
    
        if (r6 >= 5) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x05fe, code lost:
    
        r10[r6] = (byte) java.lang.Integer.parseInt(r0.group().substring(1));
        r6 = r6 + 1;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0616, code lost:
    
        r0 = new int[]{r6};
        l.C12639.f38077 = java.lang.Math.max(l.C12639.f38077, r6);
        r6 = l.C13344.f39921[r7.f77584.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x062d, code lost:
    
        if (r6 == 2) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0630, code lost:
    
        if (r6 == 3) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0632, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x063d, code lost:
    
        r1.add(new l.C1400(r7, r0[0], r10[0], r10[1], r10[2], r10[3], r10[4], r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0683, code lost:
    
        throw new java.lang.RuntimeException(r5 + l.EnumC0121.f1143 + r6 + l.EnumC0121.f1143 + r0[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0634, code lost:
    
        r6 = m30907(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0639, code lost:
    
        r6 = m30908(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0684, code lost:
    
        r30 = r1;
        r31 = r6;
        r1 = r19;
        r0 = r0.matcher(r5);
        r0.find();
        r5 = java.lang.Integer.parseInt(r0.group().substring(1));
        r0.find();
        r1.add(new l.C0694(r7, r5, java.lang.Integer.parseInt(r0.group().substring(1))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x06b6, code lost:
    
        r30 = r1;
        r31 = r6;
        r1 = r19;
        r0 = r0.matcher(r5);
        r0.find();
        r5 = (short) java.lang.Integer.parseInt(r0.group().substring(1));
        r0.find();
        r10 = (short) java.lang.Integer.parseInt(r0.group().substring(1));
        r0.find();
        r1.add(new l.C23978(r7, r5, r10, (short) java.lang.Integer.parseInt(r0.group().substring(1))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0702, code lost:
    
        r30 = r1;
        r31 = r6;
        r1 = r19;
        r0 = r0.matcher(r5);
        r0.find();
        r10 = (byte) java.lang.Integer.parseInt(r0.group().substring(1));
        r0.find();
        r1.add(new l.C2106(r7, r10, (byte) java.lang.Integer.parseInt(r0.group().substring(1)), (short) (m30901(r5) & 65535)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x073d, code lost:
    
        r30 = r1;
        r31 = r6;
        r1 = r19;
        r0 = r0.matcher(r5);
        r0.find();
        r6 = (byte) java.lang.Integer.parseInt(r0.group().substring(1));
        r0.find();
        r0 = (byte) java.lang.Integer.parseInt(r0.group().substring(1));
        r10 = l.C13344.f39921[r7.f77584.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0773, code lost:
    
        if (r10 == 1) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0776, code lost:
    
        if (r10 == 3) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0778, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0783, code lost:
    
        r1.add(new l.C11963(r7, r6, r0, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x077a, code lost:
    
        r5 = m30907(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x077f, code lost:
    
        r5 = m30906(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x078d, code lost:
    
        r30 = r1;
        r31 = r6;
        r1 = r19;
        r0 = r0.matcher(r5);
        r0.find();
        r6 = (short) java.lang.Integer.parseInt(r0.group().substring(1));
        r0.find();
        r1.add(new l.C10552(r7, r6, (short) java.lang.Integer.parseInt(r0.group().substring(1)), (byte) (m30901(r5) & 255)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x07c9, code lost:
    
        r30 = r1;
        r31 = r6;
        r1 = r19;
        r0 = r0.matcher(r5);
        r0.find();
        r5 = (short) (java.lang.Integer.parseInt(r0.group().substring(1)) & 65535);
        r0.find();
        r1.add(new l.C17628(r7, r5, java.lang.Integer.parseInt(r0.group().substring(1)) & 65535));
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0801, code lost:
    
        r30 = r1;
        r31 = r6;
        r1 = r19;
        r0 = (short) m30904(r5);
        r6 = l.C12639.f38076.matcher(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0816, code lost:
    
        if (r6.find() == false) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0818, code lost:
    
        r5 = r6.group().trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0820, code lost:
    
        if (r5 == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0826, code lost:
    
        if (r5.length() == 0) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0832, code lost:
    
        if (r5.toUpperCase().endsWith("L") == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0834, code lost:
    
        r10 = 0;
        r6 = r5.substring(0, r5.length() - 1).toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x084d, code lost:
    
        if (r6[r10] != '-') goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x084f, code lost:
    
        r10 = 1;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0854, code lost:
    
        r24 = r9;
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x085c, code lost:
    
        if (r6[r10] != '0') goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x085e, code lost:
    
        r4 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0861, code lost:
    
        if (r4 != r6.length) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0863, code lost:
    
        r32 = r1;
        r28 = r2;
        r16 = r3;
        r23 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0928, code lost:
    
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0937, code lost:
    
        r3 = new l.C10573(r7, r0, r1);
        r1 = r32;
        r1.add(r3);
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x09c4, code lost:
    
        r4 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x09f9, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x086d, code lost:
    
        r9 = r6[r4];
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0873, code lost:
    
        if (r9 == 'x') goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0877, code lost:
    
        if (r9 != 'X') goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0880, code lost:
    
        if (java.lang.Character.digit(r9, 8) < 0) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0882, code lost:
    
        r4 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0895, code lost:
    
        r21 = l.C13132.FOREVER_NS / (r4 / 2);
        r9 = r16;
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x08a3, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x08a8, code lost:
    
        if (r9 >= r6.length) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x08aa, code lost:
    
        r10 = java.lang.Character.digit(r6[r9], r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x08b0, code lost:
    
        if (r10 < 0) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x08b2, code lost:
    
        r23 = r12;
        r11 = r4 * r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x08b9, code lost:
    
        if (r25 > r21) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x08bd, code lost:
    
        if (r11 >= 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x08bf, code lost:
    
        r27 = r4;
        r32 = r1;
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x08c9, code lost:
    
        if (r11 >= (-r10)) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x08d5, code lost:
    
        throw new java.lang.NumberFormatException(r5.concat(" cannot fit into a long"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x08dc, code lost:
    
        r25 = r11 + r10;
        r9 = r9 + 1;
        r3 = r16;
        r12 = r23;
        r4 = r27;
        r2 = r28;
        r1 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x08d6, code lost:
    
        r32 = r1;
        r28 = r2;
        r27 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x08f7, code lost:
    
        throw new java.lang.NumberFormatException(r5.concat(" cannot fit into a long"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0910, code lost:
    
        throw new java.lang.NumberFormatException("The string contains an invalid digit - '" + r6[r9] + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0911, code lost:
    
        r32 = r1;
        r28 = r2;
        r23 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0917, code lost:
    
        if (r15 == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x091d, code lost:
    
        if (r25 != Long.MIN_VALUE) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0922, code lost:
    
        if (r25 < 0) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0924, code lost:
    
        r19 = r25 * (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0934, code lost:
    
        throw new java.lang.NumberFormatException(r5.concat(" cannot fit into a long"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0935, code lost:
    
        r1 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0885, code lost:
    
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0888, code lost:
    
        r16 = r10 + 2;
        r4 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0891, code lost:
    
        r4 = 10;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0852, code lost:
    
        r10 = 0;
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0844, code lost:
    
        r10 = 0;
        r6 = r5.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x094a, code lost:
    
        throw new java.lang.NumberFormatException("string is blank");
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0954, code lost:
    
        throw new java.lang.NumberFormatException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0960, code lost:
    
        throw new java.lang.Exception(l.C20094.m46315("long exception: ", r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0961, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r2 = r12;
        r1 = r19;
        r1.add(new l.C2812(r7, (byte) m30904(r5), m30901(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0981, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r2 = r12;
        r1 = r19;
        r1.add(new l.C4907(r7, (short) m30904(r5), (short) (m30901(r5) & 65535)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x09a3, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r2 = r12;
        r1 = r19;
        r1.add(new l.C22546(r7, (short) m30904(r5), (short) (m30901(r5) & 65535)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x09c7, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r2 = r12;
        r1 = r19;
        r4 = r35;
        r1.add(new l.C9162(r7, (short) m30904(r5), l.C11467.m28270(l.C4303.m12897(r5.substring(r5.indexOf("\"") + 1, r5.lastIndexOf("\""))), r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x09fd, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r2 = r12;
        r1 = r19;
        r0 = (short) m30904(r5);
        r3 = l.C13344.f39921[r7.f77584.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0a1b, code lost:
    
        if (r3 == 1) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0a1e, code lost:
    
        if (r3 == 3) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0a21, code lost:
    
        if (r3 == 4) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0a23, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0a5c, code lost:
    
        r1.add(new l.C15489(r7, r0, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0a25, code lost:
    
        r6 = l.C11467.m28270(l.C4303.m12897(r5.substring(r5.indexOf("\"") + 1, r5.lastIndexOf("\""))), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0a46, code lost:
    
        throw new java.lang.Exception(l.C20094.m46315("String error: ", r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0a47, code lost:
    
        r6 = m30907(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0a57, code lost:
    
        throw new java.lang.Exception(l.C20094.m46315("TypeIdItem error: ", r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0a58, code lost:
    
        r6 = m30906(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0a70, code lost:
    
        throw new java.lang.Exception(l.C20094.m46315("FieldIdItem error: ", r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0a71, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r2 = r12;
        r1 = r19;
        r0 = r0.matcher(r5);
        r0.find();
        r3 = (byte) java.lang.Integer.parseInt(r0.group().substring(1));
        r0.find();
        r1.add(new l.C0673(r7, r3, (byte) java.lang.Integer.parseInt(r0.group().substring(1))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0aae, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r2 = r12;
        r1 = r19;
        r1.add(new l.C2791(r7, (byte) m30904(r5), (byte) m30901(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0ad0, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r2 = r12;
        r1 = r19;
        r1.add(new l.C19019(r7, (short) m30904(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0aed, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r2 = r12;
        r1 = r19;
        r1.add(new l.C9141(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0b05, code lost:
    
        r30 = r1;
        r28 = r2;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r2 = r12;
        r1 = r19;
        r3 = r28;
        r1.add(new l.C19040(r7, (short) m30904(r5), m30900(r3, r5, r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0b28, code lost:
    
        r30 = r1;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r1 = r19;
        r3 = r2;
        r2 = r12;
        r1.add(new l.C21157(r7, m30900(r3, r5, r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0b43, code lost:
    
        r30 = r1;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r1 = r19;
        r3 = r2;
        r2 = r12;
        r0 = r0.matcher(r5);
        r0.find();
        r6 = (byte) java.lang.Integer.parseInt(r0.group().substring(1));
        r0.find();
        r1.add(new l.C16922(r7, r6, (byte) java.lang.Integer.parseInt(r0.group().substring(1)), (short) (m30900(r3, r5, r8) & 65535)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0b86, code lost:
    
        r30 = r1;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r1 = r19;
        r3 = r2;
        r2 = r12;
        r1.add(new l.C13373(r7, (short) m30904(r5), (short) (m30900(r3, r5, r8) & 65535)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0ba8, code lost:
    
        r30 = r1;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r1 = r19;
        r3 = r2;
        r2 = r12;
        r1.add(new l.C1379(r7, (short) (m30900(r3, r5, r8) & 65535)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0bc5, code lost:
    
        r30 = r1;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r1 = r19;
        r3 = r2;
        r2 = r12;
        r1.add(new l.C21136(r7, (byte) m30900(r3, r5, r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0be7, code lost:
    
        r29 = r0;
        r30 = r1;
        r16 = r3;
        r31 = r6;
        r24 = r9;
        r4 = r11;
        r1 = r19;
        r3 = r2;
        r2 = r12;
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0c08, code lost:
    
        r31 = r6;
        r1 = r19;
        r33.f38081 = -1;
        r1.addAll(r9);
        r0 = new l.AbstractC2043[r1.size()];
        r1.toArray(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0c21, code lost:
    
        if (r31 == null) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0c23, code lost:
    
        r3 = (java.util.List) r31.f52322;
        r1 = (java.util.List) r31.f52323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0c31, code lost:
    
        if (r3.size() <= 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0c33, code lost:
    
        r4 = new l.C2749[r3.size()];
        r5 = new l.C9099[r1.size()];
        r3.toArray(r4);
        r1.toArray(r5);
        r1 = r17;
        r1.f13575 = r4;
        r1.f13568 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0c56, code lost:
    
        r3 = r1.getParent();
        r4 = r3.f41402.f70680.f38655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0c60, code lost:
    
        if (r4 != null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0c62, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0c7f, code lost:
    
        if ((r3.f41403 & l.EnumC7233.STATIC.getValue()) != 0) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0c81, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0c83, code lost:
    
        r1.f13574 = r4;
        r1.f13571 = l.C12639.f38077;
        r1.f13573 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0c8b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0c64, code lost:
    
        r4 = r4.f40520;
        r5 = r4.length;
        r6 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0c69, code lost:
    
        if (r6 >= r5) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0c6b, code lost:
    
        r7 = r7 + r4[r6].m50836();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0c75, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0c4c, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0c4f, code lost:
    
        r1 = r17;
        r1.f13575 = null;
        r1.f13568 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0227 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m30909(java.lang.String r34, l.C3454 r35) {
        /*
            Method dump skipped, instructions count: 3300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12639.m30909(java.lang.String, l.ۗ᩶֡):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C18522 m30906(String str, C3454 c3454) {
        String[] split = f38079.split(str);
        int length = split.length;
        int i = length - 1;
        if (i < 2) {
            throw new RuntimeException(C20094.m46315("FieldIdItem error: ", str));
        }
        return C18522.m43041(c3454, C22755.m50831(split[length - 3], c3454), C22755.m50831(split[i], c3454), C11467.m28270(split[length - 2], c3454));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C22050 m30908(String str, C3454 c3454) {
        String[] split = f38080.split(str);
        int length = split.length;
        int i = length - 1;
        if (i < 3) {
            throw new RuntimeException("MethodIdItem error: ".concat(str));
        }
        return C22050.m49611(c3454, C22755.m50831(split[length - 4], c3454), C12877.m31309(c3454, C22755.m50831(split[i], c3454), m30905(split[length - 2], c3454)), C11467.m28270(split[length - 3], c3454));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C22755 m30907(String str, C3454 c3454) {
        String trim = str.trim();
        return C22755.m50831(trim.substring(trim.lastIndexOf(" ") + 1), c3454);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30901(String str) {
        Matcher matcher = f38078.matcher(str);
        if (matcher.find()) {
            return C12610.m30869(matcher.group().trim());
        }
        throw new Exception(C20094.m46315("int exception: ", str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30900(int i, String str, HashMap hashMap) {
        try {
            return ((Integer) hashMap.get(str.split(":")[1].trim())).intValue() - i;
        } catch (Exception unused) {
            throw new IllegalArgumentException(C20094.m46315("unfound label offset: ", str));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m30904(String str) {
        Matcher matcher = f38075.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group().substring(1));
        }
        throw new Exception(C20094.m46315("register exception: ", str));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13582 m30905(String str, C3454 c3454) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt != 'F') {
                if (charAt == 'L') {
                    int i3 = i2;
                    while (true) {
                        int i4 = i3 + 1;
                        if (str.charAt(i4) != ';') {
                            i3 = i4;
                        } else {
                            i = i3 + 2;
                            arrayList.add(C22755.m50831(str.substring(i2, i), c3454));
                        }
                    }
                } else if (charAt != 'S' && charAt != 'I' && charAt != 'J' && charAt != 'Z') {
                    if (charAt != '[') {
                        switch (charAt) {
                            case 'B':
                            case 'C':
                            case 'D':
                                break;
                            default:
                                throw new RuntimeException(C20087.m46305(i2, str, new StringBuilder("Invalid type ")));
                        }
                    } else {
                        int i5 = i2;
                        while (true) {
                            int i6 = i5 + 1;
                            if (str.charAt(i6) == '[') {
                                i5 = i6;
                            } else {
                                i = i5 + 2;
                                if (str.charAt(i6) == 'L') {
                                    while (true) {
                                        int i7 = i + 1;
                                        if (str.charAt(i) != ';') {
                                            i = i7;
                                        } else {
                                            i = i7;
                                        }
                                    }
                                }
                                arrayList.add(C22755.m50831(str.substring(i2, i), c3454));
                            }
                        }
                    }
                }
                i2 = i;
            }
            i = i2 + 1;
            arrayList.add(C22755.m50831(str.substring(i2, i), c3454));
            i2 = i;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return C13582.m32663(c3454, arrayList);
    }
}
