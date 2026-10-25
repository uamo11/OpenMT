package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: E5GV */
/* renamed from: l.۟ܶ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7540 extends AbstractC5116 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C23062[] f23300;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13889[] f23301;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13889[] f23302;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23062[] f23303;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11258 f23304;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7540 c7540 = (C7540) obj;
        C11258 c11258 = this.f23304;
        if (c11258 == null) {
            return c7540.f23304 == null ? 0 : -1;
        }
        C11258 c112582 = c7540.f23304;
        if (c112582 == null) {
            return 1;
        }
        return c11258.f16030 - c112582.f16030;
    }

    public C7540(C3454 c3454) {
        super(c3454);
        this.f23304 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7540 m20240(C3454 c3454) {
        C23062[] c23062Arr;
        C23062[] c23062Arr2;
        C13889[] c13889Arr;
        C13889[] c13889Arr2;
        C23062[] c23062Arr3 = this.f23303;
        if (c23062Arr3 == null || c23062Arr3.length == 0) {
            c23062Arr = null;
        } else {
            c23062Arr = new C23062[c23062Arr3.length];
            int length = c23062Arr3.length;
            for (int i = 0; i < length; i++) {
                C23062 c23062 = this.f23303[i];
                c23062Arr[i] = new C23062(c23062.f74187.m43042(c3454), c23062.f74186);
            }
        }
        C23062[] c23062Arr4 = this.f23300;
        if (c23062Arr4 == null || c23062Arr4.length == 0) {
            c23062Arr2 = null;
        } else {
            c23062Arr2 = new C23062[c23062Arr4.length];
            int length2 = c23062Arr4.length;
            for (int i2 = 0; i2 < length2; i2++) {
                C23062 c230622 = this.f23300[i2];
                c23062Arr2[i2] = new C23062(c230622.f74187.m43042(c3454), c230622.f74186);
            }
        }
        C13889[] c13889Arr3 = this.f23301;
        if (c13889Arr3 == null || c13889Arr3.length == 0) {
            c13889Arr = null;
        } else {
            c13889Arr = new C13889[c13889Arr3.length];
            int length3 = c13889Arr3.length;
            for (int i3 = 0; i3 < length3; i3++) {
                C13889 c13889 = this.f23301[i3];
                C22050 m49613 = c13889.f41402.m49613(c3454);
                int i4 = c13889.f41403;
                C4160 c4160 = c13889.f41404;
                c13889Arr[i3] = new C13889(m49613, i4, c4160 != null ? c4160.m12581(c3454) : null);
            }
        }
        C13889[] c13889Arr4 = this.f23302;
        if (c13889Arr4 == null || c13889Arr4.length == 0) {
            c13889Arr2 = null;
        } else {
            c13889Arr2 = new C13889[c13889Arr4.length];
            int length4 = c13889Arr4.length;
            for (int i5 = 0; i5 < length4; i5++) {
                C13889 c138892 = this.f23302[i5];
                C22050 m496132 = c138892.f41402.m49613(c3454);
                int i6 = c138892.f41403;
                C4160 c41602 = c138892.f41404;
                c13889Arr2[i5] = new C13889(m496132, i6, c41602 != null ? c41602.m12581(c3454) : null);
            }
        }
        C7540 c7540 = new C7540(c3454);
        c7540.f23304 = null;
        if (c23062Arr == null) {
            c23062Arr = new C23062[0];
        }
        c7540.f23303 = c23062Arr;
        if (c23062Arr2 == null) {
            c23062Arr2 = new C23062[0];
        }
        c7540.f23300 = c23062Arr2;
        if (c13889Arr == null) {
            c13889Arr = new C13889[0];
        }
        c7540.f23301 = c13889Arr;
        if (c13889Arr2 == null) {
            c13889Arr2 = new C13889[0];
        }
        c7540.f23302 = c13889Arr2;
        return (C7540) c3454.f10944.m25237(c7540);
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        C3454 c3454;
        this.f23303 = new C23062[c10720.m26903()];
        this.f23300 = new C23062[c10720.m26903()];
        this.f23301 = new C13889[c10720.m26903()];
        this.f23302 = new C13889[c10720.m26903()];
        int length = this.f23303.length;
        C13889 c13889 = null;
        int i = 0;
        int i2 = 0;
        C23062 c23062 = null;
        while (true) {
            c3454 = this.f16031;
            if (i2 >= length) {
                break;
            }
            try {
                C23062[] c23062Arr = this.f23303;
                C23062 c230622 = new C23062(c3454, c10720, c23062);
                c23062Arr[i2] = c230622;
                i2++;
                c23062 = c230622;
            } catch (Exception e) {
                throw C16363.m38521("Error while reading static field at index " + i2, e);
            }
        }
        int length2 = this.f23300.length;
        int i3 = 0;
        C23062 c230623 = null;
        while (i3 < length2) {
            try {
                C23062[] c23062Arr2 = this.f23300;
                C23062 c230624 = new C23062(c3454, c10720, c230623);
                c23062Arr2[i3] = c230624;
                i3++;
                c230623 = c230624;
            } catch (Exception e2) {
                throw C16363.m38521("Error while reading instance field at index " + i3, e2);
            }
        }
        int length3 = this.f23301.length;
        int i4 = 0;
        C13889 c138892 = null;
        while (i4 < length3) {
            try {
                C13889[] c13889Arr = this.f23301;
                C13889 c138893 = new C13889(c3454, c12172, c10720, c138892);
                c13889Arr[i4] = c138893;
                i4++;
                c138892 = c138893;
            } catch (Exception e3) {
                throw C16363.m38521("Error while reading direct method at index " + i4, e3);
            }
        }
        int length4 = this.f23302.length;
        while (i < length4) {
            try {
                C13889[] c13889Arr2 = this.f23302;
                C13889 c138894 = new C13889(c3454, c12172, c10720, c13889);
                c13889Arr2[i] = c138894;
                i++;
                c13889 = c138894;
            } catch (Exception e4) {
                throw C16363.m38521("Error while reading virtual method at index " + i, e4);
            }
        }
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final int mo10104(int i) {
        int m27697 = C11166.m27697(this.f23302.length) + C11166.m27697(this.f23301.length) + C11166.m27697(this.f23300.length) + C11166.m27697(this.f23303.length) + i;
        C23062[] c23062Arr = this.f23303;
        int length = c23062Arr.length;
        C13889 c13889 = null;
        int i2 = 0;
        int i3 = 0;
        C23062 c23062 = null;
        while (i3 < length) {
            C23062 c230622 = c23062Arr[i3];
            m27697 = C23062.m51220(c230622, m27697, c23062);
            i3++;
            c23062 = c230622;
        }
        C23062[] c23062Arr2 = this.f23300;
        int length2 = c23062Arr2.length;
        int i4 = 0;
        C23062 c230623 = null;
        while (i4 < length2) {
            C23062 c230624 = c23062Arr2[i4];
            m27697 = C23062.m51220(c230624, m27697, c230623);
            i4++;
            c230623 = c230624;
        }
        C13889[] c13889Arr = this.f23301;
        int length3 = c13889Arr.length;
        int i5 = 0;
        C13889 c138892 = null;
        while (i5 < length3) {
            C13889 c138893 = c13889Arr[i5];
            m27697 = C13889.m33298(c138893, m27697, c138892);
            i5++;
            c138892 = c138893;
        }
        C13889[] c13889Arr2 = this.f23302;
        int length4 = c13889Arr2.length;
        while (i2 < length4) {
            C13889 c138894 = c13889Arr2[i2];
            m27697 = C13889.m33298(c138894, m27697, c13889);
            i2++;
            c13889 = c138894;
        }
        return m27697;
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5301(this.f23303.length);
        c1547.m5301(this.f23300.length);
        c1547.m5301(this.f23301.length);
        c1547.m5301(this.f23302.length);
        C23062[] c23062Arr = this.f23303;
        int length = c23062Arr.length;
        C13889 c13889 = null;
        int i = 0;
        int i2 = 0;
        C23062 c23062 = null;
        while (i2 < length) {
            C23062 c230622 = c23062Arr[i2];
            C23062.m51221(c230622, c1547, c23062);
            i2++;
            c23062 = c230622;
        }
        C23062[] c23062Arr2 = this.f23300;
        int length2 = c23062Arr2.length;
        int i3 = 0;
        C23062 c230623 = null;
        while (i3 < length2) {
            C23062 c230624 = c23062Arr2[i3];
            C23062.m51221(c230624, c1547, c230623);
            i3++;
            c230623 = c230624;
        }
        C13889[] c13889Arr = this.f23301;
        int length3 = c13889Arr.length;
        int i4 = 0;
        C13889 c138892 = null;
        while (i4 < length3) {
            C13889 c138893 = c13889Arr[i4];
            C13889.m33299(c138893, c1547, c138892);
            i4++;
            c138892 = c138893;
        }
        C13889[] c13889Arr2 = this.f23302;
        int length4 = c13889Arr2.length;
        while (i < length4) {
            C13889 c138894 = c13889Arr2[i];
            C13889.m33299(c138894, c1547, c13889);
            i++;
            c13889 = c138894;
        }
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final String mo10106() {
        if (this.f23304 == null) {
            return C13540.m32584(new StringBuilder("class_data_item @0x"), this.f16030);
        }
        return "class_data_item @0x" + Integer.toHexString(this.f16030) + " (" + this.f23304.m27862() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20244(C11258 c11258) {
        this.f23304 = c11258;
    }

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final C23062[] m20250() {
        return this.f23303;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20243(int i, C23062 c23062, String str) {
        if (i >= -1) {
            C23062[] c23062Arr = this.f23303;
            if (i > c23062Arr.length - 1) {
                return;
            }
            c23062Arr[i] = c23062;
            C6276 m32314 = this.f23304.m27861().m32314();
            AbstractC16404 abstractC16404 = null;
            if (!c23062.m51222()) {
                AbstractC16404[] abstractC16404Arr = m32314.f19421;
                if (i < abstractC16404Arr.length) {
                    abstractC16404Arr[i] = null;
                    return;
                }
                return;
            }
            AbstractC16404[] abstractC16404Arr2 = m32314.f19421;
            int length = abstractC16404Arr2.length;
            C23062[] c23062Arr2 = this.f23303;
            if (length < c23062Arr2.length) {
                AbstractC16404[] abstractC16404Arr3 = new AbstractC16404[c23062Arr2.length];
                m32314.f19421 = abstractC16404Arr3;
                System.arraycopy(abstractC16404Arr2, 0, abstractC16404Arr3, 0, abstractC16404Arr2.length);
            }
            AbstractC16404[] abstractC16404Arr4 = this.f23304.m27861().m32314().f19421;
            String m50835 = c23062.f74187.f57397.m50835();
            C3454 c3454 = this.f16031;
            if (!m50835.startsWith("[")) {
                try {
                    int hashCode = m50835.hashCode();
                    if (hashCode != 70) {
                        if (hashCode != 83) {
                            if (hashCode != 90) {
                                if (hashCode != 1379658506) {
                                    if (hashCode != 73) {
                                        if (hashCode != 74) {
                                            switch (hashCode) {
                                                case 66:
                                                    if (m50835.equals("B")) {
                                                        abstractC16404 = new C14036(Integer.valueOf(str).byteValue());
                                                        break;
                                                    }
                                                    break;
                                                case 67:
                                                    if (m50835.equals("C")) {
                                                        abstractC16404 = new C7687(str.charAt(0));
                                                        break;
                                                    }
                                                    break;
                                                case 68:
                                                    if (m50835.equals("D")) {
                                                        abstractC16404 = new C1588(Double.valueOf(str).doubleValue());
                                                        break;
                                                    }
                                                    break;
                                            }
                                        } else if (m50835.equals("J")) {
                                            abstractC16404 = new C6527(Long.valueOf(str).longValue());
                                        }
                                    } else if (m50835.equals("I")) {
                                        abstractC16404 = new C23460(Integer.valueOf(str).intValue());
                                    }
                                } else if (m50835.equals("Ljava/lang/String;")) {
                                    abstractC16404 = new C15698(new C11467(c3454, C5822.m16320(str, c3454)));
                                }
                            } else if (m50835.equals("Z")) {
                                abstractC16404 = new C23209(str.equals("true"));
                            }
                        } else if (m50835.equals("S")) {
                            abstractC16404 = new C8644(Short.valueOf(str).shortValue());
                        }
                    } else if (m50835.equals("F")) {
                        abstractC16404 = new C14287(Float.valueOf(str).floatValue());
                    }
                } catch (Throwable unused) {
                    abstractC16404 = m20239(m50835, c3454);
                }
            }
            abstractC16404Arr4[i] = abstractC16404;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20242(int i, C23062 c23062) {
        if (i >= -1) {
            C23062[] c23062Arr = this.f23300;
            if (i > c23062Arr.length - 1) {
                return;
            }
            c23062Arr[i] = c23062;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20241(int i, C13889 c13889) {
        if (i >= -1) {
            C13889[] c13889Arr = this.f23301;
            if (i > c13889Arr.length - 1) {
                return;
            }
            c13889Arr[i] = c13889;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20248(int i, C13889 c13889) {
        if (i >= -1) {
            C13889[] c13889Arr = this.f23302;
            if (i > c13889Arr.length - 1) {
                return;
            }
            c13889Arr[i] = c13889;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20246(C23062 c23062) {
        if (c23062.m51223()) {
            C23062[] c23062Arr = this.f23303;
            int length = c23062Arr.length;
            int i = length + 1;
            C23062[] c23062Arr2 = new C23062[i];
            this.f23303 = c23062Arr2;
            System.arraycopy(c23062Arr, 0, c23062Arr2, 0, length);
            this.f23303[length] = c23062;
            C6276 m32314 = this.f23304.m27861().m32314();
            AbstractC16404[] abstractC16404Arr = m32314.f19421;
            AbstractC16404[] abstractC16404Arr2 = new AbstractC16404[i];
            m32314.f19421 = abstractC16404Arr2;
            System.arraycopy(abstractC16404Arr, 0, abstractC16404Arr2, 0, abstractC16404Arr.length);
            if (c23062.m51222()) {
                m32314.f19421[length] = m20239(c23062.f74187.f57397.m50835(), this.f16031);
                return;
            }
            return;
        }
        C23062[] c23062Arr3 = this.f23300;
        int length2 = c23062Arr3.length;
        C23062[] c23062Arr4 = new C23062[length2 + 1];
        this.f23300 = c23062Arr4;
        System.arraycopy(c23062Arr3, 0, c23062Arr4, 0, length2);
        this.f23300[length2] = c23062;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20245(C13889 c13889) {
        if (c13889.m33300()) {
            C13889[] c13889Arr = this.f23301;
            int length = c13889Arr.length;
            C13889[] c13889Arr2 = new C13889[length + 1];
            this.f23301 = c13889Arr2;
            System.arraycopy(c13889Arr, 0, c13889Arr2, 0, length);
            this.f23301[length] = c13889;
            return;
        }
        C13889[] c13889Arr3 = this.f23302;
        int length2 = c13889Arr3.length;
        C13889[] c13889Arr4 = new C13889[length2 + 1];
        this.f23302 = c13889Arr4;
        System.arraycopy(c13889Arr3, 0, c13889Arr4, 0, length2);
        this.f23302[length2] = c13889;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20247(int i) {
        C13889[] c13889Arr = this.f23301;
        C13889[] c13889Arr2 = new C13889[c13889Arr.length - 1];
        this.f23301 = c13889Arr2;
        System.arraycopy(c13889Arr, i + 1, c13889Arr2, i, (r1 - i) - 1);
        System.arraycopy(c13889Arr, 0, this.f23301, 0, i);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m20252(int i) {
        C13889[] c13889Arr = this.f23302;
        C13889[] c13889Arr2 = new C13889[c13889Arr.length - 1];
        this.f23302 = c13889Arr2;
        System.arraycopy(c13889Arr, i + 1, c13889Arr2, i, (r1 - i) - 1);
        System.arraycopy(c13889Arr, 0, this.f23302, 0, i);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m20253(int i) {
        C6276 m32314 = this.f23304.m27861().m32314();
        int length = this.f23303.length;
        AbstractC16404[] abstractC16404Arr = m32314.f19421;
        if (abstractC16404Arr.length < length) {
            AbstractC16404[] abstractC16404Arr2 = new AbstractC16404[length];
            m32314.f19421 = abstractC16404Arr2;
            System.arraycopy(abstractC16404Arr, 0, abstractC16404Arr2, 0, abstractC16404Arr.length);
        }
        C23062[] c23062Arr = this.f23303;
        AbstractC16404[] abstractC16404Arr3 = m32314.f19421;
        int i2 = length - 1;
        C23062[] c23062Arr2 = new C23062[i2];
        this.f23303 = c23062Arr2;
        m32314.f19421 = new AbstractC16404[i2];
        int i3 = i + 1;
        int i4 = (length - i) - 1;
        System.arraycopy(c23062Arr, i3, c23062Arr2, i, i4);
        System.arraycopy(c23062Arr, 0, this.f23303, 0, i);
        System.arraycopy(abstractC16404Arr3, i3, m32314.f19421, i, i4);
        System.arraycopy(abstractC16404Arr3, 0, m32314.f19421, 0, i);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20255(int i) {
        C23062[] c23062Arr = this.f23300;
        C23062[] c23062Arr2 = new C23062[c23062Arr.length - 1];
        this.f23300 = c23062Arr2;
        System.arraycopy(c23062Arr, i + 1, c23062Arr2, i, (r1 - i) - 1);
        System.arraycopy(c23062Arr, 0, this.f23300, 0, i);
    }

    /* renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public final C23062[] m20251() {
        return this.f23300;
    }

    /* renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public final C13889[] m20249() {
        return this.f23301;
    }

    /* renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public final C13889[] m20254() {
        return this.f23302;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16404 m20239(String str, C3454 c3454) {
        if (str.startsWith("[")) {
            return null;
        }
        switch (str) {
            case "B":
                return new C14036((byte) 0);
            case "C":
                return new C7687('C');
            case "D":
                return new C1588(0.0d);
            case "F":
                return new C14287(0.0f);
            case "I":
                return new C23460(0);
            case "J":
                return new C6527(0L);
            case "S":
                return new C8644((short) 0);
            case "Z":
                return new C23209(false);
            case "Ljava/lang/String;":
                return new C15698(new C11467(c3454, C5822.m16320("", c3454)));
            default:
                return null;
        }
    }
}
