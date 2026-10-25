package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: V7EY */
/* renamed from: l.ᩴܽ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18873 extends AbstractC11817 {

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59494;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59495;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public short f59496;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public boolean f59497;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59498;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C20826 f59499;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59500;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59501;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59502;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C13248 f59503;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59504;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59505;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f59506;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m43593(int i) {
        Iterator it;
        int i2 = i;
        this.f59506 = i2;
        C20826 c20826 = this.f59499;
        C17503 c17503 = (C17503) this.f35257;
        boolean z = c17503.f29354;
        boolean z2 = c17503.f29342;
        boolean z3 = z || z2;
        boolean z4 = z && z2;
        if (z3 && this.f59496 != 0) {
            m24653(1);
            if (z4) {
                String m47639 = c20826.m47639(this.f59496);
                StringBuilder sb = new StringBuilder("// ");
                sb.append((int) this.f59496);
                sb.append(m47639 != null ? "# ".concat(m47639) : "");
                m24665(sb.toString());
            } else {
                C17503 c175032 = (C17503) this.f35257;
                if (c175032.f29354) {
                    m24659("// %d#", Short.valueOf(this.f59496));
                } else if (c175032.f29342) {
                    String m476392 = c20826.m47639(this.f59496);
                    m24665(m476392 != null ? "// ".concat(m476392) : "");
                }
            }
            m24664(1);
        }
        ArrayList arrayList = this.f59502;
        boolean z5 = this.f29343;
        boolean z6 = this.f29326;
        int i3 = 18;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C23126 c23126 = (C23126) it2.next();
                m24654(m24663(i2, m24657(18, EnumC15536.f47699.m36618())));
                if (!z6) {
                    m24666("%s %s;", c23126.m51311(), ((C17503) this.f35257).f35264.m25960(c23126.f74368));
                } else if (z5) {
                    m24666("%s #%d;", c23126.m51311(), Integer.valueOf(c23126.f74368));
                } else {
                    String m51311 = c23126.m51311();
                    int i4 = c23126.f74368;
                    m24654(m24657(this.f29349 - 18, String.format("%s #%d;", m51311, Integer.valueOf(i4))));
                    StringBuilder sb2 = new StringBuilder(" // ");
                    sb2.append(i4 == 0 ? "any" : ((C17503) this.f35257).f35264.m25960(i4));
                    m24662(sb2.toString());
                }
            }
        }
        if (this.f59494 != null) {
            m24654(m24663(i2, m24657(18, EnumC15536.f47483.m36618())));
            m24662(((String) C5378.stream(this.f59494).map(new C16049()).collect(C22976.joining(", "))) + l.b);
        }
        ArrayList arrayList2 = this.f59495;
        boolean z7 = this.f29347;
        if (arrayList2 != null && !z7) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C21695 c21695 = (C21695) it3.next();
                m24654(m24663(i2, m24657(i3, EnumC15536.f47800.m36618())));
                if (!z6) {
                    it = it3;
                    m24666("%d %s:%s;", Short.valueOf(c21695.f47013), ((C17503) this.f35257).f35264.getName(c21695.f47014), ((C17503) this.f35257).f35264.getName(c21695.f47011));
                } else if (z5) {
                    m24666("%d #%d:#%d;", Short.valueOf(c21695.f47013), Short.valueOf(c21695.f47014), Short.valueOf(c21695.f47011));
                    it = it3;
                } else {
                    short s = c21695.f47013;
                    short s2 = c21695.f47011;
                    short s3 = c21695.f47014;
                    it = it3;
                    m24654(m24657(this.f29349 - 18, String.format("%d #%d:#%d;", Short.valueOf(s), Short.valueOf(s3), Short.valueOf(s2))));
                    m24666(" // %s:%s", ((C17503) this.f35257).f35264.getName(s3), ((C17503) this.f35257).f35264.getName(s2));
                }
                i3 = 18;
                it3 = it;
            }
        }
        ArrayList arrayList3 = this.f59498;
        if (arrayList3 == null || z7) {
            return;
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C22400 c22400 = (C22400) it4.next();
            m24654(m24663(i2, m24657(18, EnumC15536.f47591.m36618())));
            if (!z6) {
                m24666("%d %s:%s;", Short.valueOf(c22400.f47013), ((C17503) this.f35257).f35264.getName(c22400.f47014), ((C17503) this.f35257).f35264.getName(c22400.f47011));
            } else if (z5) {
                m24666("%d #%d:#%d;", Short.valueOf(c22400.f47013), Short.valueOf(c22400.f47014), Short.valueOf(c22400.f47011));
            } else {
                short s4 = c22400.f47013;
                short s5 = c22400.f47011;
                short s6 = c22400.f47014;
                m24654(m24657(this.f29349 - 18, String.format("%d #%d:#%d;", Short.valueOf(s4), Short.valueOf(s6), Short.valueOf(s5))));
                m24666(" // %s:%s", ((C17503) this.f35257).f35264.getName(s6), ((C17503) this.f35257).f35264.getName(s5));
            }
            i2 = i;
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m43592(int i) {
        ArrayList arrayList = this.f59501;
        boolean z = this.f29347;
        if (arrayList != null && !z) {
            m24654(m24663(i, m24657(18, EnumC15536.f47538.m36618())));
            m24662(((String) C5378.stream(this.f59501).map(new C2645()).collect(C22976.joining(","))) + l.b);
        }
        if (this.f59500 != null && !z) {
            m24654(m24663(i, m24657(18, EnumC15536.f47517.m36618())));
            m24662(((String) C5378.stream(this.f59500).map(new C4056()).collect(C22976.joining(","))) + l.b);
        }
        if (this.f59505 != null) {
            m24654(m24663(i, m24657(18, EnumC15536.f47780.m36618())));
            m24662(((String) C5378.stream(this.f59505).map(new C16049()).collect(C22976.joining(","))) + l.b);
        }
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m43591(int i) {
        C13248 c13248;
        if (this.f29347 || ((c13248 = this.f59503) == null && this.f59504 == null)) {
            return false;
        }
        if (c13248 != null) {
            if (c13248.m32155()) {
                return m43590(i);
            }
            m43589(i);
            return true;
        }
        if (((C13248) this.f59504.get(0)).m32155()) {
            return m43590(i);
        }
        m43589(i);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43588(C6491 c6491, String str, int i, int i2) {
        boolean z = ((String) c6491.f20042).isEmpty() && ((String) c6491.f20043).isEmpty();
        StringBuilder m15339 = C5368.m15339(str);
        m15339.append(z ? l.b : "");
        m24654(m24663(i, m24657(18, m15339.toString())));
        boolean z2 = this.f29343;
        boolean z3 = this.f29326;
        if (z3) {
            if (z2) {
                m24662((String) c6491.f20042);
            } else {
                m24654(m24657(i2, (String) c6491.f20042));
                i2 = Math.max(i2, ((String) c6491.f20042).length());
                if (!z) {
                    m24654(" // ");
                }
            }
        }
        if (z3 && (!z3 || z2)) {
            return i2;
        }
        m24662((String) c6491.f20043);
        return i2;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m43589(int i) {
        int i2 = this.f29349 - 18;
        m24661(18, EnumC15536.f47602.m36618() + l.b);
        if (this.f29326 && !this.f29343) {
            this.f29325.mo1968(m24657(i2, " "));
            m24662(" // offset " + this.f59503.f39673);
        } else {
            m24667();
        }
        C13248 c13248 = this.f59503;
        int m43588 = m43588(c13248.m32152("", c13248.f39670), EnumC15536.f47781.m36618(), i, i2);
        C13248 c132482 = this.f59503;
        m43588(c132482.m32152("", c132482.f39664), EnumC15536.f47789.m36618(), i, m43588);
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private boolean m43590(int i) {
        int i2;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        String str3;
        String str4;
        int i3;
        int i4;
        String str5;
        int i5;
        String str6;
        boolean z5;
        boolean z6;
        String str7;
        int i6;
        int i7 = this.f29349 - 18;
        boolean z7 = this.f59504 != null;
        String m36618 = EnumC15536.f47569.m36618();
        String str8 = " ";
        boolean z8 = this.f29343;
        boolean z9 = this.f29326;
        String str9 = AbstractC9701.f29321;
        if (z7) {
            int i8 = 0;
            str3 = "";
            String str10 = str9;
            while (i8 < this.f59504.size()) {
                C13248 c13248 = (C13248) this.f59504.get(i8);
                if (i8 > 0) {
                    m36618 = EnumC15536.f47760.m36618();
                    str10 = C16014.m37867(str9, str9);
                    str3 = str9;
                }
                boolean z10 = z7;
                String str11 = m36618;
                m24661(18, str3 + m36618);
                if (!z9 || z8) {
                    str5 = str3;
                    m24662(c13248.f39672.m51154() + l.b);
                } else {
                    this.f29325.mo1968(m24657(i7, c13248.f39672.m51154() + l.b));
                    str5 = str3;
                    m24662(" // " + EnumC15204.f46581.m35967() + str8 + c13248.f39660);
                }
                int[] iArr = c13248.f39674;
                int i9 = this.f29349 - 18;
                if (iArr == null || iArr.length <= 0) {
                    i5 = i7;
                    str6 = str8;
                    z5 = z8;
                    z6 = z9;
                    str7 = str9;
                    i6 = i8;
                } else {
                    int length = iArr.length - 1;
                    C6491 m32153 = this.f59503.m32153(iArr);
                    str6 = str8;
                    i5 = i7;
                    String concat = ((String) C5378.stream((List) m32153.f20042).collect(C22976.joining(", "))).concat(l.b);
                    i6 = i8;
                    String concat2 = ((String) C5378.stream((List) m32153.f20043).collect(C22976.joining(", "))).concat(l.b);
                    StringBuilder m15339 = C5368.m15339(str9);
                    str7 = str9;
                    m15339.append(EnumC15536.f47701.m36618());
                    String m24663 = m24663(i, m24657(18, m15339.toString()));
                    m24654(m24663);
                    String m24660 = m24660(m24663.length());
                    if (z9) {
                        if (z8) {
                            m24662(concat);
                        } else if (length == 0) {
                            this.f29325.mo1968(m24657(i9, concat));
                            m24662(" // " + concat2);
                        } else {
                            this.f29325.mo1968(m24657(i9, ((String) ((List) m32153.f20042).get(0)).concat(",")));
                            StringBuilder sb = new StringBuilder(" // ");
                            z5 = z8;
                            sb.append(((String) ((List) m32153.f20043).get(0)).concat(","));
                            m24662(sb.toString());
                            int i10 = 1;
                            while (i10 <= length) {
                                String str12 = i10 == length ? l.b : ",";
                                String concat3 = ((String) ((List) m32153.f20042).get(i10)).concat(str12);
                                String concat4 = ((String) ((List) m32153.f20043).get(i10)).concat(str12);
                                this.f29325.mo1968(m24660);
                                this.f29325.mo1968(m24657(i9, concat3));
                                m24662(" // " + concat4);
                                i10++;
                                z9 = z9;
                            }
                            z6 = z9;
                        }
                        z5 = z8;
                        z6 = z9;
                    } else {
                        z5 = z8;
                        z6 = z9;
                        if (length == 0) {
                            m24662(concat2);
                        } else {
                            m24662(((String) ((List) m32153.f20043).get(0)).concat(","));
                            int i11 = 1;
                            while (i11 <= length) {
                                String concat5 = ((String) ((List) m32153.f20043).get(i11)).concat(i11 == length ? l.b : ",");
                                this.f29325.mo1968(m24660);
                                m24662(concat5);
                                i11++;
                            }
                        }
                    }
                }
                if (iArr == null || iArr.length == 0) {
                    StringBuilder m153392 = C5368.m15339(str10);
                    m153392.append(EnumC15536.f47701.m36618());
                    m153392.append(l.b);
                    m24662(m24663(i, m153392.toString()));
                }
                m24654(m24663(this.f59506, ""));
                i8 = i6 + 1;
                z7 = z10;
                m36618 = str11;
                str3 = str5;
                str8 = str6;
                z8 = z5;
                i7 = i5;
                str9 = str7;
                z9 = z6;
            }
            i2 = i7;
            z = z7;
            str = str8;
            z2 = z8;
            z3 = z9;
            str2 = str9;
            z4 = true;
        } else {
            i2 = i7;
            z = z7;
            str = " ";
            z2 = z8;
            z3 = z9;
            str2 = str9;
            z4 = true;
            str3 = "";
        }
        String m366182 = EnumC15536.f47569.m36618();
        if (this.f59503 != null) {
            if (z) {
                m366182 = EnumC15536.f47760.m36618();
                str4 = str2;
                str3 = C16014.m37867(str3, str4);
            } else {
                str4 = str2;
            }
            String m37867 = C16014.m37867(str3, str4);
            m24661(18, str3 + m366182);
            if (!z3 || z2) {
                i3 = i2;
                m24662(this.f59503.f39672.m51154() + l.b);
            } else {
                i3 = i2;
                this.f29325.mo1968(m24657(i3, this.f59503.f39672.m51154() + l.b));
                m24662(" // " + EnumC15204.f46581.m35967() + str + this.f59503.f39660);
            }
            C13248 c132482 = this.f59503;
            int[] iArr2 = c132482.f39670;
            if (iArr2 == null || iArr2.length == 0) {
                if (c132482.f39672.m51156()) {
                    StringBuilder m153393 = C5368.m15339(m37867);
                    m153393.append(EnumC15536.f47781.m36618());
                    m153393.append(l.b);
                    m24662(m24663(i, m153393.toString()));
                }
                i4 = i3;
            } else {
                C6491 m32152 = c132482.m32152("", iArr2);
                StringBuilder m153394 = C5368.m15339(m37867);
                m153394.append(EnumC15536.f47781.m36618());
                i4 = m43588(m32152, m153394.toString(), i, i3);
            }
            C13248 c132483 = this.f59503;
            int[] iArr3 = c132483.f39664;
            if (iArr3 != null && iArr3.length != 0) {
                C6491 m321522 = c132483.m32152("", iArr3);
                StringBuilder m153395 = C5368.m15339(m37867);
                m153395.append(EnumC15536.f47789.m36618());
                m43588(m321522, m153395.toString(), i, i4);
            } else if (c132483.f39672.m51158()) {
                StringBuilder m153396 = C5368.m15339(m37867);
                m153396.append(EnumC15536.f47789.m36618());
                m153396.append(l.b);
                m24662(m24663(i, m153396.toString()));
            }
        }
        if (this.f59504 == null && this.f59503 == null) {
            return false;
        }
        return z4;
    }
}
