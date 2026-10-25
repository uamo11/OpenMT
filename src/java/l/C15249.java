package l;

import android.os.Build;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.function.Predicate;

/* compiled from: D4TJ */
/* renamed from: l.ܶ۬ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15249 extends C20876 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f46799;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f46800;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f46802;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f46803;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Predicate f46805;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21601 f46806;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f46807;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC19485 f46809;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C2538 f46798 = new C2538(1);

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C18779 f46797 = new C18779();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46804 = new ArrayList();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f46808 = new ArrayList();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f46801 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15249 m36216(String str, C4586 c4586, InterfaceC19485 interfaceC19485) {
        return m36217(str, c4586, interfaceC19485, f46798);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15249 m36217(String str, InterfaceC21601 interfaceC21601, InterfaceC19485 interfaceC19485, Predicate predicate) {
        boolean z = !C16999.m39887(str) && C19739.m45449(str) == null;
        return new C15249(str, interfaceC21601, z, z, interfaceC19485, predicate);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15249 m36215(String str, AbstractC3163 abstractC3163, InterfaceC21601 interfaceC21601, InterfaceC19485 interfaceC19485) {
        C15249 c15249 = new C15249(str, interfaceC21601, abstractC3163.mo9708(), false, interfaceC19485, f46798);
        c15249.f46801 = true;
        return c15249;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15249 m36218(InterfaceC19485 interfaceC19485) {
        return new C15249("", null, true, true, interfaceC19485, f46798);
    }

    public C15249(String str, InterfaceC21601 interfaceC21601, boolean z, boolean z2, InterfaceC19485 interfaceC19485, Predicate predicate) {
        this.f46807 = str;
        this.f46806 = interfaceC21601;
        this.f46802 = z;
        this.f46803 = z2;
        this.f46809 = interfaceC19485;
        this.f46805 = predicate;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m36246() {
        this.f46802 = false;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m36247() {
        this.f46803 = false;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36249() {
        this.f46800 = true;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m36245() {
        this.f46801 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36236(String str) {
        this.f46799 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36228(String[] strArr, AbstractC13921 abstractC13921, boolean z) {
        for (String str : strArr) {
            InterfaceC17889 m33351 = abstractC13921.m33351(str);
            m36227(m33351, ((C15688) m33351).getName(), abstractC13921, z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36227(InterfaceC17889 interfaceC17889, String str, AbstractC13921 abstractC13921, boolean z) {
        boolean z2 = false;
        boolean z3 = z && interfaceC17889.mo36978();
        try {
            if (interfaceC17889.isDirectory() && !z3) {
                z2 = true;
            }
            String m39860 = C16999.m39860(str, z2);
            if (z3) {
                String mo36977 = interfaceC17889.mo36977();
                if (mo36977 == null) {
                    throw new IOException(C20094.m46315("Archive symbolic link target is missing: ", str));
                }
                C16999.m39881(m39860, mo36977);
            }
            if (interfaceC17889.isDirectory()) {
                Iterator it = abstractC13921.mo7637(interfaceC17889.getPath(), true).iterator();
                while (it.hasNext()) {
                    InterfaceC17889 interfaceC178892 = (InterfaceC17889) it.next();
                    String name = interfaceC178892.getName();
                    if (!m39860.isEmpty()) {
                        name = C22870.m50967(m39860, "/", name);
                    }
                    m36227(interfaceC178892, name, abstractC13921, z);
                }
            }
        } catch (IOException e) {
            String path = interfaceC17889.getPath();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            throw new IOException(C20094.m46315("Unsafe archive entry path: ", path), e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36242(String[] strArr, AbstractC13921 abstractC13921, boolean z, boolean z2) {
        String str;
        AbstractC1139 c5373;
        int i;
        C16477 mo24428;
        String[] strArr2 = strArr;
        AbstractC13921 abstractC139212 = abstractC13921;
        String str2 = this.f46799;
        if (str2 != null && strArr2.length != 1) {
            throw new IllegalStateException();
        }
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f46804;
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (i2 < length) {
                String str3 = strArr2[i2];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                InterfaceC17889 m33351 = abstractC139212.m33351(str3);
                String name = str2 != null ? str2 : ((C15688) m33351).getName();
                C15688 c15688 = (C15688) m33351;
                boolean isDirectory = c15688.isDirectory();
                if (z) {
                    name = C16999.m39860(name, isDirectory);
                }
                AbstractC15440 m39866 = C16999.m39866(this.f46807, name);
                boolean mo23120 = m39866.mo23120();
                boolean z3 = this.f46803 && c15688.mo36978();
                boolean z4 = mo23120 && z3 && this.f46800;
                if (mo23120 && z3) {
                    str = str2;
                    if (!this.f46800) {
                        m36230(m39866.mo23554());
                        throw null;
                    }
                } else {
                    str = str2;
                }
                if (c15688.isDirectory()) {
                    c5373 = new C0433();
                    if (mo23120 && !z4) {
                        m36226(m39866);
                    }
                    i = length;
                } else {
                    c5373 = new C5373();
                    if (!mo23120 || z4) {
                        i = length;
                    } else {
                        m36233(m39866);
                        int m36214 = m36214(m39866, m33351, name);
                        i = length;
                        InterfaceC21601 interfaceC21601 = this.f46806;
                        if (interfaceC21601.mo1526()) {
                            interfaceC19485.mo4330();
                            return;
                        }
                        if (m36214 != 1) {
                            if (m36214 == 2) {
                                c5373.m3911();
                            } else if (this.f46802) {
                                C17558 c17558 = new C17558();
                                c17558.m41050(m39866);
                                c5373.m3885(c17558.m41049());
                            }
                            if (m36214 == 0 && interfaceC21601.mo13494() && m39866.mo29016()) {
                                c5373.m3897(true);
                            }
                        } else {
                            i2++;
                            strArr2 = strArr;
                            abstractC139212 = abstractC13921;
                            str2 = str;
                            length = i;
                        }
                    }
                    c5373.m3881(c15688.getSize());
                    this.f67560 = c5373.m3913() + this.f67560;
                }
                c5373.m3907(name);
                c5373.m3894(c15688.getTime());
                c5373.m3886(z3);
                if (c5373.m3909()) {
                    c5373.m3882(c15688.mo36977());
                }
                if (this.f46802 && c5373.m3904() == null && (mo24428 = m33351.mo24428()) != null) {
                    if (m33351 instanceof C9555) {
                        if (C9555.m24427(mo24428)) {
                            if (!((C9555) m33351).mo24433().mo35196()) {
                                try {
                                    c5373.m3885(new C18264(C20402.m46724(((C15688) m33351).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c5373.m3885(new C18264(mo24428.m38843(), mo24428.m38840(), mo24428.m38838()));
                        }
                    } else {
                        c5373.m3885(new C18264(mo24428.m38843(), -1, -1));
                    }
                }
                c5373.m3902(str3);
                c5373.m3896(m39866);
                c5373.m3895(name);
                c5373.m3903(mo23120);
                arrayList.add(c5373);
                this.f67559++;
                i2++;
                strArr2 = strArr;
                abstractC139212 = abstractC13921;
                str2 = str;
                length = i;
            } else {
                interfaceC19485.mo4331();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC1139 abstractC1139 = (AbstractC1139) it.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (m36229(abstractC1139)) {
                        m36224(abstractC1139.mo1983(), abstractC13921, z);
                    }
                }
                if (z2) {
                    interfaceC19485.mo4331();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AbstractC1139 abstractC11392 = (AbstractC1139) it2.next();
                        if (abstractC11392.m3888()) {
                            m36234(abstractC11392.mo1983());
                        }
                    }
                }
                Collections.sort(arrayList, f46797);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    AbstractC1139 abstractC11393 = (AbstractC1139) it3.next();
                    if (abstractC11393.m3888()) {
                        abstractC11393.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [l.֨۬ܳ, l.ۚ۬ܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36224(C0433 c0433, AbstractC13921 abstractC13921, boolean z) {
        C0433 c04332;
        C16477 mo24428;
        String m3898 = c0433.m3898();
        Iterator it = abstractC13921.mo7637(c0433.m3910(), true).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!hasNext) {
                interfaceC19485.mo4331();
                Iterator it2 = c0433.f1916.iterator();
                while (it2.hasNext()) {
                    AbstractC1139 abstractC1139 = (AbstractC1139) it2.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (m36229(abstractC1139)) {
                        m36224(abstractC1139.mo1983(), abstractC13921, z);
                    }
                }
                return;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            String name = interfaceC17889.getName();
            if (!m3898.isEmpty()) {
                name = C22870.m50967(m3898, "/", name);
            }
            boolean isDirectory = interfaceC17889.isDirectory();
            if (z) {
                name = C16999.m39860(name, isDirectory);
            }
            AbstractC15440 m39866 = C16999.m39866(this.f46807, name);
            boolean z2 = false;
            boolean z3 = c0433.m3879() && m39866.mo23120();
            boolean z4 = this.f46803 && interfaceC17889.mo36978();
            if (z3 && z4 && this.f46800) {
                z2 = true;
            }
            if (interfaceC17889.isDirectory()) {
                c04332 = new C0433();
                if (z3 && !z2) {
                    m36226(m39866);
                }
            } else {
                ?? c5373 = new C5373();
                if (z3 && !z2) {
                    m36233(m39866);
                    int m36214 = m36214(m39866, interfaceC17889, name);
                    InterfaceC21601 interfaceC21601 = this.f46806;
                    if (interfaceC21601.mo1526()) {
                        interfaceC19485.mo4330();
                        return;
                    }
                    if (m36214 == 1) {
                        c0433.f1917 = true;
                    } else {
                        if (m36214 == 2) {
                            c5373.m3911();
                        } else {
                            C17558 c17558 = new C17558();
                            c17558.m41050(m39866);
                            c5373.m3885(c17558.m41049());
                        }
                        if (m36214 == 0 && interfaceC21601.mo13494() && m39866.mo29016()) {
                            c5373.m3897(true);
                        }
                    }
                }
                c5373.m3881(interfaceC17889.getSize());
                this.f67560 = c5373.m3913() + this.f67560;
                c04332 = c5373;
            }
            c04332.m3894(interfaceC17889.getTime());
            c04332.m3886(z4);
            if (c04332.m3909()) {
                c04332.m3882(interfaceC17889.mo36977());
            }
            if (this.f46802 && c04332.m3904() == null && (mo24428 = interfaceC17889.mo24428()) != null) {
                if (!(interfaceC17889 instanceof C9555)) {
                    c04332.m3885(new C18264(mo24428.m38843(), -1, -1));
                } else if (!C9555.m24427(mo24428)) {
                    c04332.m3885(new C18264(mo24428.m38843(), mo24428.m38840(), mo24428.m38838()));
                } else if (!interfaceC17889.mo24433().mo35196()) {
                    try {
                        c04332.m3885(new C18264(C20402.m46724(interfaceC17889.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c04332.m3902(interfaceC17889.getPath());
            c04332.m3896(m39866);
            c04332.m3895(name);
            c04332.m3903(z3);
            c0433.f1916.add(c04332);
            this.f67559++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m36214(AbstractC15440 abstractC15440, InterfaceC17889 interfaceC17889, String str) {
        boolean test = this.f46805.test(abstractC15440);
        if (!this.f46806.mo13492(test)) {
            C22306 c22306 = C22306.f72317;
            return this.f46806.mo13490(str, c22306, c22306, false, test);
        }
        return this.f46806.mo13490(str, C22306.m50049(interfaceC17889), C22306.m50048(abstractC15440), abstractC15440.mo29016(), test);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m36229(AbstractC1139 abstractC1139) {
        if (!abstractC1139.m3888()) {
            return false;
        }
        if (!abstractC1139.m3909() || this.f46801) {
            return (this.f46800 && abstractC1139.m3909() && abstractC1139.m3879()) ? false : true;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36238(String[] strArr) {
        AbstractC1139 c5373;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        int length = strArr.length;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f46804;
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
                String name = m39866.getName();
                AbstractC15440 m398662 = C16999.m39866(this.f46807, name);
                if (!C16999.m39878(m39866.mo23554(), m398662.mo23554())) {
                    boolean mo23120 = m398662.mo23120();
                    if (m39866.mo23113()) {
                        if (m398662.m36504(m39866)) {
                            throw new C19401(C4925.m14306(R.string.MT_Protector_res_0x7f120617, m39866.mo23554()));
                        }
                        c5373 = new C0433();
                    } else {
                        c5373 = new C5373();
                        c5373.m3881(m39866.mo23127());
                    }
                    c5373.m3907(m39866.getName());
                    c5373.m3894(m39866.mo23117());
                    c5373.m3886(this.f46803 && m39866.m36533());
                    c5373.m3884(m39866);
                    c5373.m3896(m398662);
                    c5373.m3895(name);
                    c5373.m3903(mo23120);
                    if (!mo23120) {
                        interfaceC19485.mo4332(name);
                        if (m39866.mo23551(m398662)) {
                            if (c5373.m3888()) {
                                m398662.mo18537(c5373.m3887());
                            }
                            this.f46808.add(c5373);
                            this.f67559++;
                            m47715();
                        }
                    } else {
                        z = c5373.f4125;
                        if (z) {
                            if (m398662.mo23113() && !m398662.m36533()) {
                                m36230(m398662.mo23554());
                                throw null;
                            }
                        } else if (c5373.m3888()) {
                            m36226(m398662);
                        } else {
                            m36233(m398662);
                        }
                    }
                    z2 = c5373.f4125;
                    if (z2 || !c5373.m3888()) {
                        C5373 mo1987 = c5373.mo1987();
                        if (mo23120) {
                            mo1987.m3912();
                            InterfaceC21601 interfaceC21601 = this.f46806;
                            if (interfaceC21601.mo13496()) {
                                interfaceC21601.mo13491(name, C22306.m50048(m39866), C22306.m50048(m398662), m398662.mo29016());
                            }
                            if (interfaceC21601.mo1526()) {
                                interfaceC19485.mo4330();
                                return;
                            }
                            if (interfaceC21601.mo13493() != 1) {
                                if (interfaceC21601.mo13493() == 2) {
                                    mo1987.m3911();
                                } else {
                                    z4 = c5373.f4125;
                                    if (!z4) {
                                        C17558 c17558 = new C17558();
                                        c17558.m41050(m398662);
                                        mo1987.m3885(c17558.m41049());
                                    }
                                }
                                if (interfaceC21601.mo13493() == 0 && interfaceC21601.mo13494() && m398662.mo29016()) {
                                    mo1987.m3897(true);
                                }
                            }
                        }
                        z3 = c5373.f4125;
                        if (!z3) {
                            long j2 = this.f67560;
                            j = c5373.f4124;
                            this.f67560 = j2 + j;
                        }
                    }
                    arrayList.add(c5373);
                    this.f67559++;
                }
                i++;
            } else {
                interfaceC19485.mo4331();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC1139 abstractC1139 = (AbstractC1139) it.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && !abstractC1139.m3909()) {
                        m36220(abstractC1139.mo1983());
                    }
                }
                interfaceC19485.mo4331();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC1139 abstractC11392 = (AbstractC1139) it2.next();
                    if (abstractC11392.m3888()) {
                        m36234(abstractC11392.mo1983());
                    }
                }
                Collections.sort(arrayList, f46797);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    AbstractC1139 abstractC11393 = (AbstractC1139) it3.next();
                    if (abstractC11393.m3888()) {
                        abstractC11393.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36220(C0433 c0433) {
        AbstractC1139 c5373;
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        AbstractC15440 m3890 = c0433.m3890();
        String str = c0433.m3898() + "/";
        Iterator it = m3890.mo23549(true).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!hasNext) {
                interfaceC19485.mo4331();
                Iterator it2 = c0433.f1916.iterator();
                while (it2.hasNext()) {
                    AbstractC1139 abstractC1139 = (AbstractC1139) it2.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && !abstractC1139.m3909()) {
                        m36220(abstractC1139.mo1983());
                    }
                }
                return;
            }
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(abstractC15440.getName());
            String sb = m15339.toString();
            AbstractC15440 m39866 = C16999.m39866(this.f46807, sb);
            if (!C16999.m39878(abstractC15440.mo23554(), m39866.mo23554())) {
                boolean z5 = false;
                boolean z6 = c0433.m3879() && m39866.mo23120();
                if (abstractC15440.mo23113()) {
                    c5373 = new C0433();
                } else {
                    c5373 = new C5373();
                    c5373.m3881(abstractC15440.mo23127());
                }
                c5373.m3894(abstractC15440.mo23117());
                if (this.f46803 && abstractC15440.m36533()) {
                    z5 = true;
                }
                c5373.m3886(z5);
                c5373.m3884(abstractC15440);
                c5373.m3896(m39866);
                c5373.m3895(sb);
                c5373.m3903(z6);
                if (c0433.m3879() && !z6) {
                    interfaceC19485.mo4332(sb);
                    if (abstractC15440.mo23551(m39866)) {
                        if (c5373.m3888()) {
                            m39866.mo18537(c5373.m3887());
                        }
                        this.f46808.add(c5373);
                        this.f67559++;
                        m47715();
                    }
                }
                if (z6) {
                    z4 = c5373.f4125;
                    if (z4) {
                        if (m39866.mo23113() && !m39866.m36533()) {
                            m36230(m39866.mo23554());
                            throw null;
                        }
                    } else if (c5373.m3888()) {
                        m36226(m39866);
                    } else {
                        m36233(m39866);
                    }
                }
                z = c5373.f4125;
                if (z || !c5373.m3888()) {
                    C5373 mo1987 = c5373.mo1987();
                    if (z6) {
                        if (c0433.m3879()) {
                            mo1987.m3912();
                        }
                        InterfaceC21601 interfaceC21601 = this.f46806;
                        if (interfaceC21601.mo13496()) {
                            interfaceC21601.mo13491(sb, C22306.m50048(abstractC15440), C22306.m50048(m39866), m39866.mo29016());
                        }
                        if (interfaceC21601.mo1526()) {
                            interfaceC19485.mo4330();
                            return;
                        }
                        if (interfaceC21601.mo13493() == 1) {
                            c0433.f1917 = true;
                        } else {
                            if (interfaceC21601.mo13493() == 2) {
                                mo1987.m3911();
                            } else {
                                z3 = c5373.f4125;
                                if (!z3) {
                                    C17558 c17558 = new C17558();
                                    c17558.m41050(m39866);
                                    mo1987.m3885(c17558.m41049());
                                }
                            }
                            if (interfaceC21601.mo13493() == 0 && interfaceC21601.mo13494() && m39866.mo29016()) {
                                mo1987.m3897(true);
                            }
                        }
                    }
                    z2 = c5373.f4125;
                    if (!z2) {
                        long j2 = this.f67560;
                        j = c5373.f4124;
                        this.f67560 = j2 + j;
                    }
                }
                c0433.f1916.add(c5373);
                this.f67559++;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36241(String[] strArr, AbstractC13921 abstractC13921, AbstractC3163 abstractC3163, InterfaceC1025 interfaceC1025) {
        int i;
        AbstractC1139 abstractC1139;
        C16477 mo24428;
        C22306 c22306;
        C16477 mo244282;
        String[] strArr2 = strArr;
        AbstractC13921 abstractC139212 = abstractC13921;
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f46804;
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (i2 < length) {
                String str = strArr2[i2];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                InterfaceC17889 m33351 = abstractC139212.m33351(str);
                C15688 c15688 = (C15688) m33351;
                String name = c15688.getName();
                String m24393 = C9523.m24393(this.f46807, name);
                boolean mo9703 = abstractC3163.mo9703(m24393);
                if (mo9703 && this.f46803 && c15688.mo36978()) {
                    m36230(m24393);
                    throw null;
                }
                if (c15688.isDirectory()) {
                    interfaceC1025.setName(name);
                    abstractC1139 = new C0433();
                    if (mo9703) {
                        m36225(abstractC3163, m24393);
                    }
                    i = length;
                } else {
                    C5373 c5373 = new C5373();
                    if (mo9703) {
                        m36232(abstractC3163, m24393);
                        InterfaceC21601 interfaceC21601 = this.f46806;
                        if (interfaceC21601.mo13496()) {
                            C22306 m50049 = C22306.m50049(m33351);
                            try {
                                c22306 = C22306.m50049(abstractC3163.m33351(m24393));
                            } catch (Exception unused) {
                                c22306 = C22306.f72317;
                            }
                            i = length;
                            interfaceC21601.mo13491(name, m50049, c22306, false);
                        } else {
                            i = length;
                        }
                        if (interfaceC21601.mo1526()) {
                            interfaceC19485.mo4330();
                            return;
                        }
                        if (interfaceC21601.mo13493() == 1) {
                            i2++;
                            strArr2 = strArr;
                            abstractC139212 = abstractC13921;
                            length = i;
                        } else if (interfaceC21601.mo13493() == 2) {
                            c5373.m3911();
                        } else if (this.f46802 && (mo24428 = abstractC3163.m33351(m24393).mo24428()) != null) {
                            c5373.m3885(new C18264(mo24428.m38843(), -1, -1));
                        }
                    } else {
                        i = length;
                    }
                    c5373.m3881(c15688.getSize());
                    this.f67560 += c5373.m3913();
                    abstractC1139 = c5373;
                }
                abstractC1139.m3907(name);
                abstractC1139.m3894(c15688.getTime());
                abstractC1139.m3886(this.f46803 && c15688.mo36978());
                if (abstractC1139.m3909()) {
                    abstractC1139.m3882(c15688.mo36977());
                }
                if (this.f46802 && abstractC1139.m3904() == null && (mo244282 = m33351.mo24428()) != null) {
                    int m38843 = mo244282.m38843();
                    if ((m33351 instanceof C9555) && C9555.m24427(mo244282) && !((C9555) m33351).mo24433().mo35196()) {
                        try {
                            m38843 = C20402.m46724(((C15688) m33351).getPath()).m41291();
                        } catch (IOException unused2) {
                        }
                    }
                    abstractC1139.m3885(new C18264(m38843, -1, -1));
                }
                abstractC1139.m3902(c15688.getPath());
                abstractC1139.m3905(m24393);
                abstractC1139.m3895(name);
                abstractC1139.m3903(mo9703);
                arrayList.add(abstractC1139);
                this.f67559++;
                i2++;
                strArr2 = strArr;
                abstractC139212 = abstractC13921;
                length = i;
            } else {
                interfaceC19485.mo4331();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC1139 abstractC11392 = (AbstractC1139) it.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC11392.m3888() && (!abstractC11392.m3909() || this.f46801)) {
                        m36223(abstractC11392.mo1983(), abstractC13921, abstractC3163, interfaceC1025);
                    }
                }
                interfaceC19485.mo4331();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC1139 abstractC11393 = (AbstractC1139) it2.next();
                    if (abstractC11393.m3888()) {
                        m36234(abstractC11393.mo1983());
                    }
                }
                Collections.sort(arrayList, f46797);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    AbstractC1139 abstractC11394 = (AbstractC1139) it3.next();
                    if (abstractC11394.m3888()) {
                        abstractC11394.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [l.֨۬ܳ, l.ۚ۬ܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36223(C0433 c0433, AbstractC13921 abstractC13921, AbstractC3163 abstractC3163, InterfaceC1025 interfaceC1025) {
        C0433 c04332;
        C16477 mo24428;
        C16477 mo244282;
        C22306 c22306;
        String str = c0433.m3898() + "/";
        Iterator it = abstractC13921.mo7637(c0433.m3910(), true).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!hasNext) {
                interfaceC19485.mo4331();
                Iterator it2 = c0433.f1916.iterator();
                while (it2.hasNext()) {
                    AbstractC1139 abstractC1139 = (AbstractC1139) it2.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36223(abstractC1139.mo1983(), abstractC13921, abstractC3163, interfaceC1025);
                    }
                }
                return;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(interfaceC17889.getName());
            String sb = m15339.toString();
            String m24393 = C9523.m24393(this.f46807, sb);
            boolean z = false;
            boolean z2 = c0433.m3879() && abstractC3163.mo9703(m24393);
            if (interfaceC17889.isDirectory()) {
                interfaceC1025.setName(sb);
                c04332 = new C0433();
                if (z2) {
                    m36225(abstractC3163, m24393);
                }
            } else {
                ?? c5373 = new C5373();
                if (z2) {
                    m36232(abstractC3163, m24393);
                    InterfaceC21601 interfaceC21601 = this.f46806;
                    if (interfaceC21601.mo13496()) {
                        C22306 m50049 = C22306.m50049(interfaceC17889);
                        try {
                            c22306 = C22306.m50049(abstractC3163.m33351(m24393));
                        } catch (Exception unused) {
                            c22306 = C22306.f72317;
                        }
                        interfaceC21601.mo13491(sb, m50049, c22306, false);
                    }
                    if (interfaceC21601.mo1526()) {
                        interfaceC19485.mo4330();
                        return;
                    } else if (interfaceC21601.mo13493() == 1) {
                        c0433.f1917 = true;
                    } else if (interfaceC21601.mo13493() == 2) {
                        c5373.m3911();
                    } else if (this.f46802 && (mo244282 = abstractC3163.m33351(m24393).mo24428()) != null) {
                        c5373.m3885(new C18264(mo244282.m38843(), -1, -1));
                    }
                }
                c5373.m3881(interfaceC17889.getSize());
                this.f67560 += c5373.m3913();
                c04332 = c5373;
            }
            c04332.m3894(interfaceC17889.getTime());
            if (this.f46803 && interfaceC17889.mo36978()) {
                z = true;
            }
            c04332.m3886(z);
            if (c04332.m3909()) {
                c04332.m3882(interfaceC17889.mo36977());
            }
            if (this.f46802 && c04332.m3904() == null && (mo24428 = interfaceC17889.mo24428()) != null) {
                int m38843 = mo24428.m38843();
                if ((interfaceC17889 instanceof C9555) && C9555.m24427(mo24428) && !interfaceC17889.mo24433().mo35196()) {
                    try {
                        m38843 = C20402.m46724(interfaceC17889.getPath()).m41291();
                    } catch (IOException unused2) {
                    }
                }
                c04332.m3885(new C18264(m38843, -1, -1));
            }
            c04332.m3902(interfaceC17889.getPath());
            c04332.m3905(m24393);
            c04332.m3895(sb);
            c04332.m3903(z2);
            c0433.f1916.add(c04332);
            this.f67559++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36239(String[] strArr, AbstractC3163 abstractC3163, InterfaceC22192 interfaceC22192) {
        boolean z;
        int i;
        AbstractC1139 abstractC1139;
        C16477 mo24428;
        C22306 c22306;
        C16477 mo244282;
        String[] strArr2 = strArr;
        InterfaceC22192 interfaceC221922 = interfaceC22192;
        boolean mo13919 = abstractC3163.mo13919();
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f46804;
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (i2 < length) {
                String str = strArr2[i2];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                InterfaceC17889 m33351 = abstractC3163.m33351(str);
                C15688 c15688 = (C15688) m33351;
                String name = c15688.getName();
                String m24393 = C9523.m24393(this.f46807, name);
                String path = c15688.getPath();
                if (!mo13919 ? path.equals(m24393) : path.equalsIgnoreCase(m24393)) {
                    boolean mo9703 = abstractC3163.mo9703(m24393);
                    if (mo9703 && this.f46803 && c15688.mo36978()) {
                        m36230(m24393);
                        throw null;
                    }
                    if (c15688.isDirectory()) {
                        interfaceC221922.setName(name);
                        abstractC1139 = new C0433();
                        if (mo9703) {
                            m36225(abstractC3163, m24393);
                        }
                        z = mo13919;
                        i = length;
                    } else {
                        C5373 c5373 = new C5373();
                        if (mo9703) {
                            m36232(abstractC3163, m24393);
                            InterfaceC21601 interfaceC21601 = this.f46806;
                            if (interfaceC21601.mo13496()) {
                                z = mo13919;
                                C22306 m50049 = C22306.m50049(m33351);
                                try {
                                    c22306 = C22306.m50049(abstractC3163.m33351(m24393));
                                } catch (Exception unused) {
                                    c22306 = C22306.f72317;
                                }
                                i = length;
                                interfaceC21601.mo13491(name, m50049, c22306, false);
                            } else {
                                z = mo13919;
                                i = length;
                            }
                            if (interfaceC21601.mo1526()) {
                                interfaceC19485.mo4330();
                                return;
                            } else if (interfaceC21601.mo13493() != 1) {
                                if (interfaceC21601.mo13493() == 2) {
                                    c5373.m3911();
                                } else if (this.f46802 && (mo24428 = abstractC3163.m33351(m24393).mo24428()) != null) {
                                    c5373.m3885(new C18264(mo24428.m38843(), -1, -1));
                                }
                            }
                        } else {
                            z = mo13919;
                            i = length;
                        }
                        c5373.m3881(c15688.getSize());
                        this.f67560 = c5373.m3913() + this.f67560;
                        abstractC1139 = c5373;
                    }
                    abstractC1139.m3907(name);
                    abstractC1139.m3894(c15688.getTime());
                    abstractC1139.m3886(this.f46803 && c15688.mo36978());
                    if (abstractC1139.m3909()) {
                        abstractC1139.m3882(c15688.mo36977());
                    }
                    if (this.f46802 && abstractC1139.m3904() == null && (mo244282 = m33351.mo24428()) != null) {
                        int m38843 = mo244282.m38843();
                        if ((m33351 instanceof C9555) && C9555.m24427(mo244282) && !((C9555) m33351).mo24433().mo35196()) {
                            try {
                                m38843 = C20402.m46724(((C15688) m33351).getPath()).m41291();
                            } catch (IOException unused2) {
                            }
                        }
                        abstractC1139.m3885(new C18264(m38843, -1, -1));
                    }
                    abstractC1139.m3902(path);
                    abstractC1139.m3905(m24393);
                    abstractC1139.m3895(name);
                    abstractC1139.m3903(mo9703);
                    if (!mo9703 && abstractC1139.m3888()) {
                        try {
                            if (abstractC3163.mo9696(abstractC1139.m3910(), abstractC1139.m3900())) {
                                this.f46808.add(abstractC1139);
                                this.f67559++;
                                m47715();
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    arrayList.add(abstractC1139);
                    this.f67559++;
                } else {
                    z = mo13919;
                    i = length;
                }
                i2++;
                strArr2 = strArr;
                interfaceC221922 = interfaceC22192;
                mo13919 = z;
                length = i;
            } else {
                interfaceC19485.mo4331();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC1139 abstractC11392 = (AbstractC1139) it.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC11392.m3888() && (!abstractC11392.m3909() || this.f46801)) {
                        m36221(abstractC11392.mo1983(), abstractC3163, interfaceC22192);
                    }
                }
                interfaceC19485.mo4331();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC1139 abstractC11393 = (AbstractC1139) it2.next();
                    if (abstractC11393.m3888()) {
                        m36234(abstractC11393.mo1983());
                    }
                }
                Collections.sort(arrayList, f46797);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    AbstractC1139 abstractC11394 = (AbstractC1139) it3.next();
                    if (abstractC11394.m3888()) {
                        abstractC11394.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [l.֨۬ܳ, l.ۚ۬ܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36221(C0433 c0433, AbstractC3163 abstractC3163, InterfaceC22192 interfaceC22192) {
        C0433 c04332;
        C16477 mo24428;
        C16477 mo244282;
        C22306 c22306;
        String str = c0433.m3898() + "/";
        Iterator it = abstractC3163.mo7637(c0433.m3910(), true).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!hasNext) {
                interfaceC19485.mo4331();
                Iterator it2 = c0433.f1916.iterator();
                while (it2.hasNext()) {
                    AbstractC1139 abstractC1139 = (AbstractC1139) it2.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36221(abstractC1139.mo1983(), abstractC3163, interfaceC22192);
                    }
                }
                return;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(interfaceC17889.getName());
            String sb = m15339.toString();
            String m24393 = C9523.m24393(this.f46807, sb);
            boolean z = false;
            boolean z2 = c0433.m3879() && abstractC3163.mo9703(m24393);
            if (interfaceC17889.isDirectory()) {
                interfaceC22192.setName(sb);
                c04332 = new C0433();
                if (z2) {
                    m36225(abstractC3163, m24393);
                }
            } else {
                ?? c5373 = new C5373();
                if (z2) {
                    m36232(abstractC3163, m24393);
                    InterfaceC21601 interfaceC21601 = this.f46806;
                    if (interfaceC21601.mo13496()) {
                        C22306 m50049 = C22306.m50049(interfaceC17889);
                        try {
                            c22306 = C22306.m50049(abstractC3163.m33351(m24393));
                        } catch (Exception unused) {
                            c22306 = C22306.f72317;
                        }
                        interfaceC21601.mo13491(sb, m50049, c22306, false);
                    }
                    if (interfaceC21601.mo1526()) {
                        interfaceC19485.mo4330();
                        return;
                    } else if (interfaceC21601.mo13493() == 1) {
                        c0433.f1917 = true;
                    } else if (interfaceC21601.mo13493() == 2) {
                        c5373.m3911();
                    } else if (this.f46802 && (mo244282 = abstractC3163.m33351(m24393).mo24428()) != null) {
                        c5373.m3885(new C18264(mo244282.m38843(), -1, -1));
                    }
                }
                c5373.m3881(interfaceC17889.getSize());
                this.f67560 += c5373.m3913();
                c04332 = c5373;
            }
            c04332.m3894(interfaceC17889.getTime());
            if (this.f46803 && interfaceC17889.mo36978()) {
                z = true;
            }
            c04332.m3886(z);
            if (c04332.m3909()) {
                c04332.m3882(interfaceC17889.mo36977());
            }
            if (this.f46802 && c04332.m3904() == null && (mo24428 = interfaceC17889.mo24428()) != null) {
                int m38843 = mo24428.m38843();
                if ((interfaceC17889 instanceof C9555) && C9555.m24427(mo24428) && !interfaceC17889.mo24433().mo35196()) {
                    try {
                        m38843 = C20402.m46724(interfaceC17889.getPath()).m41291();
                    } catch (IOException unused2) {
                    }
                }
                c04332.m3885(new C18264(m38843, -1, -1));
            }
            c04332.m3902(interfaceC17889.getPath());
            c04332.m3905(m24393);
            c04332.m3895(sb);
            c04332.m3903(z2);
            c0433.f1916.add(c04332);
            this.f67559++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36240(String[] strArr, AbstractC13921 abstractC13921) {
        AbstractC1139 c5373;
        C16477 mo24428;
        int length = strArr.length;
        int i = 0;
        while (true) {
            InterfaceC19485 interfaceC19485 = this.f46809;
            ArrayList arrayList = this.f46804;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                InterfaceC17889 m33351 = abstractC13921.m33351(str);
                C15688 c15688 = (C15688) m33351;
                String name = c15688.getName();
                if (c15688.isDirectory()) {
                    c5373 = new C0433();
                } else {
                    c5373 = new C5373();
                    c5373.m3881(c15688.getSize());
                    this.f67560 = c5373.m3913() + this.f67560;
                }
                c5373.m3907(name);
                c5373.m3894(c15688.getTime());
                c5373.m3886(this.f46803 && c15688.mo36978());
                if (c5373.m3909()) {
                    c5373.m3882(c15688.mo36977());
                }
                if (this.f46802 && (mo24428 = m33351.mo24428()) != null) {
                    if (m33351 instanceof C9555) {
                        if (C9555.m24427(mo24428)) {
                            if (!((C9555) m33351).mo24433().mo35196()) {
                                try {
                                    c5373.m3885(new C18264(C20402.m46724(((C15688) m33351).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c5373.m3885(new C18264(mo24428.m38843(), mo24428.m38840(), mo24428.m38838()));
                        }
                    } else {
                        c5373.m3885(new C18264(mo24428.m38843(), -1, -1));
                    }
                }
                c5373.m3902(str);
                c5373.m3905(this.f46807 + name);
                c5373.m3895(name);
                c5373.m3903(false);
                arrayList.add(c5373);
                this.f67559++;
                i++;
            } else {
                interfaceC19485.mo4331();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC1139 abstractC1139 = (AbstractC1139) it.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36222(abstractC1139.mo1983(), abstractC13921);
                    }
                }
                Collections.sort(arrayList, f46797);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC1139 abstractC11392 = (AbstractC1139) it2.next();
                    if (abstractC11392.m3888()) {
                        abstractC11392.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36222(C0433 c0433, AbstractC13921 abstractC13921) {
        AbstractC1139 c5373;
        C16477 mo24428;
        String str = c0433.m3898() + "/";
        Iterator it = abstractC13921.mo7637(c0433.m3910(), true).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!hasNext) {
                interfaceC19485.mo4331();
                Iterator it2 = c0433.f1916.iterator();
                while (it2.hasNext()) {
                    AbstractC1139 abstractC1139 = (AbstractC1139) it2.next();
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36222(abstractC1139.mo1983(), abstractC13921);
                    }
                }
                return;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            String m37867 = C16014.m37867(str, interfaceC17889.getName());
            if (interfaceC17889.isDirectory()) {
                c5373 = new C0433();
            } else {
                c5373 = new C5373();
                c5373.m3881(interfaceC17889.getSize());
                this.f67560 = c5373.m3913() + this.f67560;
            }
            c5373.m3894(interfaceC17889.getTime());
            c5373.m3886(this.f46803 && interfaceC17889.mo36978());
            if (c5373.m3909()) {
                c5373.m3882(interfaceC17889.mo36977());
            }
            if (this.f46802 && (mo24428 = interfaceC17889.mo24428()) != null) {
                if (!(interfaceC17889 instanceof C9555)) {
                    c5373.m3885(new C18264(mo24428.m38843(), -1, -1));
                } else if (!C9555.m24427(mo24428)) {
                    c5373.m3885(new C18264(mo24428.m38843(), mo24428.m38840(), mo24428.m38838()));
                } else if (!interfaceC17889.mo24433().mo35196()) {
                    try {
                        c5373.m3885(new C18264(C20402.m46724(interfaceC17889.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c5373.m3902(interfaceC17889.getPath());
            c5373.m3905(this.f46807 + m37867);
            c5373.m3895(m37867);
            c5373.m3903(false);
            c0433.f1916.add(c5373);
            this.f67559++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36230(String str) {
        throw new IOException(C20094.m46315("Cannot create symbolic link because it already exists: ", str));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36232(AbstractC3163 abstractC3163, String str) {
        if (abstractC3163.mo9691(str)) {
            throw new IOException(C4860.m14172("File '", str, "' exists but is a directory"));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36225(AbstractC3163 abstractC3163, String str) {
        if (!abstractC3163.mo9691(str)) {
            throw new IOException(C4860.m14172("File '", str, "' exists but is not a directory"));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36233(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23113()) {
            throw new IOException("File '" + abstractC15440 + "' exists but is a directory");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36226(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23113()) {
            return;
        }
        throw new IOException("File '" + abstractC15440 + "' exists but is not a directory");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m36234(C0433 c0433) {
        if (c0433.m3909()) {
            return;
        }
        if (!c0433.m3879()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            c0433.f4129 = countDownLatch;
            Iterator it = c0433.m1988().iterator();
            while (it.hasNext()) {
                ((AbstractC1139) it.next()).mo1984(countDownLatch);
            }
        }
        Iterator it2 = c0433.m1988().iterator();
        while (it2.hasNext()) {
            AbstractC1139 abstractC1139 = (AbstractC1139) it2.next();
            if (abstractC1139.m3888()) {
                m36234(abstractC1139.mo1983());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36237(C20323 c20323) {
        m36219(this.f46804, c20323);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36219(ArrayList arrayList, InterfaceC8195 interfaceC8195) {
        long j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1139 abstractC1139 = (AbstractC1139) it.next();
            C20323 c20323 = (C20323) interfaceC8195;
            String str = c20323.f65628;
            C19247 c19247 = c20323.f65629;
            int i = c20323.f65630;
            int i2 = C13266.f39727;
            if (!abstractC1139.m3888()) {
                StringBuilder m15339 = C5368.m15339(str);
                m15339.append(abstractC1139.m3898());
                C3545 entry = c19247.getEntry(m15339.toString());
                if (entry != null && (i == 2 || abstractC1139.m3887() <= entry.getTime())) {
                    it.remove();
                    this.f67559--;
                    if (abstractC1139.m3888()) {
                        m36231(abstractC1139.mo1983());
                    } else {
                        long j2 = this.f67560;
                        j = abstractC1139.f4124;
                        this.f67560 = j2 - j;
                    }
                }
            }
            if (abstractC1139.m3888()) {
                m36219(abstractC1139.mo1983().f1916, interfaceC8195);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m36231(C0433 c0433) {
        long j;
        Iterator it = c0433.f1916.iterator();
        while (it.hasNext()) {
            AbstractC1139 abstractC1139 = (AbstractC1139) it.next();
            this.f67559--;
            if (abstractC1139.m3888()) {
                m36231(abstractC1139.mo1983());
            } else {
                long j2 = this.f67560;
                j = abstractC1139.f4124;
                this.f67560 = j2 - j;
            }
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m36248() {
        return C20195.unmodifiableList(this.f46804);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m36244() {
        return C20195.unmodifiableList(this.f46808);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36243(boolean z) {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        C8055 c8055 = new C8055();
        Iterator it = C20195.unmodifiableList(this.f46804).iterator();
        while (it.hasNext()) {
            ((AbstractC1139) it.next()).m3883(c8055, z);
        }
        return c8055.m21437();
    }
}
