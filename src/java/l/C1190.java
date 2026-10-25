package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: 04UF */
/* renamed from: l.֨ܶ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1190 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f4288;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C22357 f4289;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23193 f4290;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15300 f4291;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10828 f4292;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19150 f4293;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4294;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18444 f4295;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5424 f4296;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23193 f4297;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f4298;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C1116 f4285 = new C1116();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C1116 f4287 = new C1116();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C0225 f4286 = new C0225();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4018() {
        C23193 c23193 = this.f4297;
        C0225 c0225 = f4286;
        c0225.m1477(c23193);
        c0225.m1477(this.f4290);
        ArrayList arrayList = this.f4294;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) it.next();
            if (interfaceC22677 instanceof C1855) {
                C1855 c1855 = (C1855) interfaceC22677;
                c1855.f29163.m31388(c1855);
            } else if (interfaceC22677 instanceof C20472) {
                C20472 c20472 = (C20472) interfaceC22677;
                c20472.f29163.m31390(c20472);
            } else if (interfaceC22677 instanceof C2833) {
                C2833 c2833 = (C2833) interfaceC22677;
                c2833.f29163.m31389(c2833);
            }
        }
        ArrayList arrayList2 = this.f4288;
        C1116 c1116 = f4287;
        c1116.m3827(arrayList2);
        c1116.m3827(arrayList);
    }

    public C1190(C22357 c22357, InterfaceC18444 interfaceC18444, InterfaceC19150 interfaceC19150) {
        boolean z;
        int i;
        boolean z2;
        C5424 c5424 = new C5424();
        c5424.f16915 = new HashMap();
        this.f4296 = c5424;
        this.f4289 = c22357;
        this.f4295 = interfaceC18444;
        this.f4293 = interfaceC19150;
        try {
            C1116 c1116 = f4287;
            ArrayList m3828 = c1116.m3828();
            ArrayList m38282 = c1116.m3828();
            for (InterfaceC22677 interfaceC22677 : interfaceC19150.mo3817()) {
                m3828.add(interfaceC22677);
                m38282.add(interfaceC22677);
            }
            this.f4294 = m3828;
            this.f4288 = m38282;
            this.f4298 = AbstractC14545.copyOf((Collection) interfaceC18444.getParameters());
            C0225 c0225 = f4286;
            C23193 c23193 = (C23193) c0225.m1479();
            if (c23193 == null) {
                c23193 = new C23193();
            } else {
                c23193.m51447();
            }
            this.f4297 = c23193;
            C23193 c231932 = (C23193) c0225.m1479();
            if (c231932 == null) {
                c231932 = new C23193();
            } else {
                c231932.m51447();
            }
            this.f4290 = c231932;
            C10828 c10828 = new C10828(m3828);
            this.f4292 = c10828;
            int m27072 = c10828.m27072(m3828.size() - 1) + ((InterfaceC22677) m3828.get(m3828.size() - 1)).mo3974();
            for (int i2 = 0; i2 < m3828.size(); i2++) {
                InterfaceC22677 interfaceC226772 = (InterfaceC22677) m3828.get(i2);
                EnumC0841 mo3975 = interfaceC226772.mo3975();
                if (mo3975 == EnumC0841.f3293) {
                    int m270722 = this.f4292.m27072(i2);
                    int mo2818 = ((InterfaceC7155) interfaceC226772).mo2818() + m270722;
                    try {
                        mo2818 = m4013(mo2818, EnumC0841.f3269);
                        z2 = true;
                    } catch (C0484 unused) {
                        z2 = false;
                    }
                    if (z2) {
                        if (this.f4297.m51446(mo2818) != -1) {
                            InterfaceC22677 m4017 = m4017(mo2818, EnumC0841.f3269);
                            m38282.set(i2, new C15389(mo3975, ((InterfaceC7423) interfaceC226772).mo1790(), m27072 - m270722));
                            m38282.add(m4017);
                            i = m4017.mo3974() + m27072;
                        } else {
                            i = m27072;
                            m27072 = mo2818;
                        }
                        this.f4297.m51448(m27072, m270722);
                        m27072 = i;
                    }
                } else {
                    if (mo3975 == EnumC0841.f3201) {
                        int m270723 = this.f4292.m27072(i2);
                        int mo28182 = ((InterfaceC7155) interfaceC226772).mo2818() + m270723;
                        try {
                            mo28182 = m4013(mo28182, EnumC0841.f3126);
                            z = true;
                        } catch (C0484 unused2) {
                            z = false;
                        }
                        if (z) {
                            if (this.f4290.m51446(mo28182) != -1) {
                                InterfaceC22677 m40172 = m4017(mo28182, EnumC0841.f3126);
                                m38282.set(i2, new C15389(mo3975, ((InterfaceC7423) interfaceC226772).mo1790(), m27072 - m270723));
                                m38282.add(m40172);
                                i = m40172.mo3974() + m27072;
                            } else {
                                i = m27072;
                                m27072 = mo28182;
                            }
                            this.f4290.m51448(m27072, m270723);
                            m27072 = i;
                        }
                    }
                }
            }
        } catch (Exception e) {
            try {
                throw C15431.m36467(e, "Error while processing method %s", C14354.m34249((InterfaceC5471) interfaceC18444, false));
            } catch (Exception unused3) {
                throw C15431.m36467(e, "Error while processing method", new Object[0]);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4011(C3438 c3438, InterfaceC18444 interfaceC18444, C22357 c22357) {
        c3438.getClass();
        c3438.write(".method ", 0, 8);
        m4009(c3438, interfaceC18444.mo3567(), interfaceC18444.mo3569());
        c3438.write(interfaceC18444.getName());
        c3438.write(MotionUtils.EASING_TYPE_FORMAT_START, 0, 1);
        AbstractC14545 copyOf = AbstractC14545.copyOf((Collection) interfaceC18444.getParameters());
        AbstractC4628 listIterator = copyOf.listIterator(0);
        while (listIterator.hasNext()) {
            c3438.write(((InterfaceC0098) listIterator.next()).getType());
        }
        c3438.write(MotionUtils.EASING_TYPE_FORMAT_END, 0, 1);
        c3438.write(interfaceC18444.mo3568());
        c3438.write(10);
        c3438.m10512();
        m4010(c3438, interfaceC18444, copyOf, c22357);
        c22357.getClass();
        C18625.m43182(c3438, interfaceC18444.getAnnotations());
        c3438.m10508();
        c3438.write(".end method\n", 0, 12);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4009(C3438 c3438, int i, Set set) {
        for (EnumC15657 enumC15657 : EnumC15657.m36858(i)) {
            c3438.write(enumC15657.toString());
            c3438.write(32);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c3438.write(((EnumC18481) it.next()).toString());
            c3438.write(32);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4010(C3438 c3438, InterfaceC18444 interfaceC18444, List list, C22357 c22357) {
        int i = !EnumC15657.STATIC.m36866(interfaceC18444.mo3567()) ? 1 : 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0098 interfaceC0098 = (InterfaceC0098) it.next();
            String type = interfaceC0098.getType();
            String name = interfaceC0098.getName();
            Set annotations = interfaceC0098.getAnnotations();
            if ((c22357.f72440 && name != null) || annotations.size() != 0) {
                c3438.getClass();
                c3438.write(".param p", 0, 8);
                c3438.m10510(i);
                if (name != null && c22357.f72440) {
                    c3438.write(", ", 0, 2);
                    c3438.write(34);
                    C14020.m33624(c3438, name);
                    c3438.write(34);
                }
                c3438.write("  # ", 0, 4);
                c3438.write(type);
                c3438.write("\n", 0, 1);
                if (annotations.size() > 0) {
                    c3438.m10512();
                    C18625.m43182(c3438, annotations);
                    c3438.m10508();
                    c3438.write(".end param\n", 0, 11);
                }
            }
            i = C11250.m27832(type) ? i + 2 : i + 1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4015(C3438 c3438) {
        int mo3974;
        EnumC15657 enumC15657 = EnumC15657.STATIC;
        InterfaceC18444 interfaceC18444 = this.f4295;
        int i = 1;
        int i2 = !enumC15657.m36866(interfaceC18444.mo3567()) ? 1 : 0;
        c3438.getClass();
        boolean z = false;
        c3438.write(".method ", 0, 8);
        m4009(c3438, interfaceC18444.mo3567(), interfaceC18444.mo3569());
        C14354.m34253((Writer) c3438, (InterfaceC5471) interfaceC18444, true);
        AbstractC14545 abstractC14545 = this.f4298;
        AbstractC4628 listIterator = abstractC14545.listIterator(0);
        while (listIterator.hasNext()) {
            i2 = C11250.m27832(((InterfaceC0098) listIterator.next()).getType()) ? i2 + 2 : i2 + 1;
        }
        c3438.write(10);
        c3438.m10512();
        C22357 c22357 = this.f4289;
        c22357.getClass();
        boolean z2 = c22357.f72437;
        InterfaceC19150 interfaceC19150 = this.f4293;
        if (!z2) {
            c3438.write(".registers ", 0, 11);
            c3438.m10510(interfaceC19150.mo3818());
        }
        c3438.write(10);
        m4010(c3438, interfaceC18444, abstractC14545, c22357);
        if (this.f4291 == null) {
            this.f4291 = new C15300(c22357, interfaceC19150.mo3818(), i2);
        }
        C18625.m43182(c3438, interfaceC18444.getAnnotations());
        c3438.write(10);
        C1116 c1116 = f4285;
        ArrayList m3828 = c1116.m3828();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4288;
            if (i3 >= arrayList.size()) {
                break;
            }
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) arrayList.get(i3);
            if (c22357.f72441 && interfaceC22677.mo3975() == EnumC0841.f3065) {
                mo3974 = interfaceC22677.mo3974();
            } else {
                m3828.add(C18124.m42247(this, i4, interfaceC22677));
                if (!c22357.f72439 && i3 != arrayList.size() - 1) {
                    m3828.add(C19331.m44549(i4));
                }
                mo3974 = interfaceC22677.mo3974();
            }
            i4 += mo3974;
            i3++;
        }
        List<InterfaceC5038> mo3811 = interfaceC19150.mo3811();
        if (mo3811.size() != 0) {
            if (c22357.f72443) {
                mo3811 = C18150.m42257(mo3811);
            }
            ArrayList arrayList2 = this.f4294;
            int size = arrayList2.size() - 1;
            C10828 c10828 = this.f4292;
            int mo39742 = ((InterfaceC22677) C18566.m43105(arrayList2, 1)).mo3974() + c10828.m27072(size);
            for (InterfaceC5038 interfaceC5038 : mo3811) {
                int mo14555 = interfaceC5038.mo14555();
                int mo14557 = interfaceC5038.mo14557() + mo14555;
                if (mo14555 >= mo39742) {
                    Object[] objArr = new Object[i];
                    objArr[0] = Integer.valueOf(mo14555);
                    throw new RuntimeException(String.format("Try start offset %d is past the end of the code block.", objArr));
                }
                if (mo14557 > mo39742) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf(mo14557);
                    throw new RuntimeException(String.format("Try end offset %d is past the end of the code block.", objArr2));
                }
                int m27072 = c10828.m27072(c10828.m27073(mo14557 - 1, z));
                for (InterfaceC2216 interfaceC2216 : interfaceC5038.mo14556()) {
                    int mo7391 = interfaceC2216.mo7391();
                    if (mo7391 >= mo39742) {
                        throw new C15431(null, "Exception handler offset %d is past the end of the code block.", Integer.valueOf(mo7391));
                    }
                    C5424 c5424 = this.f4296;
                    String mo7393 = interfaceC2216.mo7393();
                    int i5 = mo14557;
                    int i6 = mo14555;
                    m3828.add(new C0279(this.f4289, c5424, m27072, mo7393, i6, i5, mo7391));
                    mo14555 = i6;
                    mo14557 = i5;
                    i = 1;
                    z = false;
                }
            }
        }
        if (c22357.f72440) {
            Iterator it = interfaceC19150.mo3812().iterator();
            while (it.hasNext()) {
                m3828.add(AbstractC21447.m48582(this.f4291, (InterfaceC7860) it.next()));
            }
        }
        boolean z3 = c22357.f72442;
        C5424 c54242 = this.f4296;
        if (z3) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList3 = new ArrayList(c54242.f16915.values());
            Collections.sort(arrayList3);
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                C19536 c19536 = (C19536) it2.next();
                Integer num = (Integer) hashMap.get(c19536.m44937());
                if (num == null) {
                    num = 0;
                }
                c19536.m44934(num.intValue());
                hashMap.put(c19536.m44937(), Integer.valueOf(num.intValue() + 1));
            }
        }
        Collection values = c54242.f16915.values();
        m3828.ensureCapacity(values.size() + m3828.size());
        Iterator it3 = values.iterator();
        while (it3.hasNext()) {
            m3828.add((C19536) it3.next());
        }
        Collections.sort(m3828);
        Iterator it4 = m3828.iterator();
        while (it4.hasNext()) {
            AbstractC8246 abstractC8246 = (AbstractC8246) it4.next();
            if (abstractC8246.mo1618(c3438)) {
                c3438.write(10);
            }
            abstractC8246.mo12088();
        }
        c1116.m3827(m3828);
        c3438.m10508();
        c3438.write(".end method\n", 0, 12);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22677 m4017(int i, EnumC0841 enumC0841) {
        int i2;
        try {
            int m27073 = this.f4292.m27073(i, true);
            ArrayList arrayList = this.f4294;
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) arrayList.get(m27073);
            if (interfaceC22677.mo3975() == enumC0841) {
                return interfaceC22677;
            }
            if (interfaceC22677.mo3975() == EnumC0841.f3065 && (i2 = m27073 + 1) < arrayList.size()) {
                InterfaceC22677 interfaceC226772 = (InterfaceC22677) arrayList.get(i2);
                if (interfaceC226772.mo3975() == enumC0841) {
                    return interfaceC226772;
                }
            }
            throw new C0484(i);
        } catch (C1655 unused) {
            throw new C0484(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4013(int i, EnumC0841 enumC0841) {
        int i2;
        C10828 c10828 = this.f4292;
        try {
            int m27073 = c10828.m27073(i, true);
            ArrayList arrayList = this.f4294;
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) arrayList.get(m27073);
            if (interfaceC22677.mo3975() == enumC0841) {
                return i;
            }
            if (interfaceC22677.mo3975() == EnumC0841.f3065 && (i2 = m27073 + 1) < arrayList.size() && ((InterfaceC22677) arrayList.get(i2)).mo3975() == enumC0841) {
                return c10828.m27072(i2);
            }
            throw new C0484(i);
        } catch (C1655 unused) {
            throw new C0484(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5424 m4014() {
        return this.f4296;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4012(int i) {
        return this.f4297.m51446(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m4016(int i) {
        return this.f4290.m51446(i);
    }
}
