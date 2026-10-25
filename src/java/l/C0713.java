package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: M1ZN */
/* renamed from: l.֡᩹᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0713 extends AbstractC22366 {

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2686 = 0;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f2687;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public long f2688;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public String f2690;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public C21818 f2692;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public Collection f2695;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C18090 f2696;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C1764 f2694 = new C1764();

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f2693 = new ArrayList();

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public HashSet f2689 = new HashSet();

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public HashSet f2691 = new HashSet();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76967;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a23, m11517("zipPath"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        HashMap hashMap;
        Iterator it;
        String[] strArr;
        HashSet hashSet;
        boolean z;
        AbstractC15440 abstractC15440;
        C11667 c11667;
        C15313 c15313;
        String m50967;
        C1764 c1764;
        HashSet hashSet2;
        C15313 c153132;
        boolean z2;
        int i;
        String str;
        C0713 c0713;
        C15313 c153133;
        InputStream mo27926;
        String str2;
        C1764 c17642;
        HashSet hashSet3;
        C0713 c07132 = this;
        AbstractC15440 m11515 = c07132.m11515("zipPath");
        String[] m11558 = c07132.m11558("ARG_PATHS");
        c07132.f2690 = c07132.m11556("rename");
        int m11548 = c07132.m11548("level");
        int m115482 = c07132.m11548("update");
        boolean m11552 = c07132.m11552("deleteSources");
        String m11556 = c07132.m11556("basePath");
        C11667 m11533 = m11533();
        boolean m115522 = c07132.m11552("keepApkSigBlock");
        C17721.m41504(m11515, EnumC16309.MODIFY_FILE);
        C19059 c19059 = new C19059(c07132);
        C1764 c17643 = c07132.f2694;
        c17643.m5892(m11558, false, c19059);
        if (mo1526()) {
            return C17222.m40521();
        }
        C18090 c18090 = new C18090(m11515);
        c07132.f2696 = c18090;
        c07132.f2695 = c18090.m42210();
        C21818 m50499 = C22523.m50499(m11515, m11533 != null);
        c07132.f2692 = m50499;
        C8918 m49176 = m50499.m49176();
        if (m11533 == null && m115522 && c07132.f2696.m42201()) {
            m49176.m23016(c07132.f2696);
        }
        if (c07132.f2696.m42212()) {
            m49176.m23025();
        }
        boolean m9487 = AbstractDialogInterfaceOnClickListenerC3113.m9487(m11548, m49176);
        C15313 c153134 = new C15313();
        if (m9487) {
            c153134.m36337(c07132.f2696);
        }
        HashSet hashSet4 = c07132.f2691;
        if (m11552) {
            hashSet4.add(m11515);
        }
        C8918 m491762 = c07132.f2692.m49176();
        if (m115482 == 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            Iterator it2 = c07132.f2695.iterator();
            while (it2.hasNext()) {
                C3545 c3545 = (C3545) it2.next();
                if (c3545.isDirectory()) {
                    it = it2;
                } else {
                    it = it2;
                    hashMap.put(c3545.getName(), c3545);
                }
                it2 = it;
            }
        }
        String str3 = c07132.f2690;
        Iterator it3 = c17643.f6117.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            strArr = m11558;
            hashSet = c07132.f2689;
            z = m11552;
            abstractC15440 = m11515;
            c11667 = m11533;
            if (!hasNext) {
                break;
            }
            Iterator it4 = it3;
            C7469 c7469 = (C7469) it3.next();
            if (mo1526()) {
                break;
            }
            c17643.m5895();
            C8918 c8918 = m49176;
            String str4 = c7469.f22995;
            AbstractC15440 abstractC154402 = c7469.f22994;
            long j = c7469.f22997;
            C1764 c17644 = c17643;
            HashSet hashSet5 = hashSet4;
            long j2 = c7469.f23003;
            if (str3.isEmpty()) {
                c15313 = c153134;
            } else {
                int indexOf = str4.indexOf(47);
                c15313 = c153134;
                str4 = indexOf == -1 ? str3 : C20087.m46305(indexOf, str4, C5368.m15339(str3));
            }
            if (c7469.f23002) {
                m50967 = C22870.m50967(m11556, str4, "/");
                C3545 c35452 = new C3545(m50967);
                c35452.setTime(j);
                m491762.m23013(c35452);
                c1764 = c17644;
                hashSet2 = hashSet5;
                c153132 = c15313;
                z2 = m9487;
                i = m115482;
                str = m11556;
                c0713 = this;
            } else {
                String m37867 = C16014.m37867(m11556, str4);
                try {
                    if (m115482 != 0) {
                        C11003.requireNonNull(hashMap);
                        C3545 c35453 = (C3545) hashMap.get(m37867);
                        if (c35453 != null) {
                            if (m115482 != 1) {
                                c17642 = c17644;
                                hashSet3 = hashSet5;
                                c17642.m5890(j2);
                                hashSet3.add(abstractC154402);
                            } else if (c35453.getTime() >= abstractC154402.mo23117()) {
                                c17642 = c17644;
                                c17642.m5890(j2);
                                hashSet3 = hashSet5;
                                hashSet3.add(abstractC154402);
                            }
                            c07132 = this;
                            c17643 = c17642;
                            hashSet4 = hashSet3;
                            m49176 = c8918;
                            m11558 = strArr;
                            m11552 = z;
                            m11515 = abstractC15440;
                            m11533 = c11667;
                            it3 = it4;
                            c153134 = c15313;
                        }
                    }
                    C3545 c35454 = new C3545(m37867);
                    c35454.m10805(j2);
                    c35454.setTime(j);
                    m491762.m23013(c35454);
                    byte[] bArr = new byte[4096];
                    long j3 = 0;
                    while (true) {
                        int read = mo27926.read(bArr);
                        if (read <= 0) {
                            str2 = m37867;
                            str = m11556;
                            m491762.m23023();
                            break;
                        }
                        str2 = m37867;
                        m491762.write(bArr, 0, read);
                        byte[] bArr2 = bArr;
                        long j4 = j3 + read;
                        str = m11556;
                        c0713.m50130(j4, c35454.getSize());
                        c0713.m11541(c1764.m5893() + j4, c1764.m5896());
                        if (mo1526()) {
                            break;
                        }
                        m37867 = str2;
                        m11556 = str;
                        bArr = bArr2;
                        j3 = j4;
                    }
                    mo27926.close();
                    c1764.m5890(j2);
                    m50967 = str2;
                } finally {
                }
                c1764 = c17644;
                hashSet2 = hashSet5;
                z2 = m9487;
                i = m115482;
                if (m9487) {
                    c153133 = c15313;
                    m491762.m23018(C21665.m48934(m37867, c153133));
                } else {
                    c153133 = c15313;
                }
                StringBuilder sb = new StringBuilder();
                c153132 = c153133;
                sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f120032));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                sb.append(c1764.m5889());
                sb.append("/");
                sb.append(c1764.m5894());
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                String sb2 = sb.toString();
                c0713 = this;
                c0713.mo11546(sb2);
                c0713.mo11520(m37867);
                mo27926 = abstractC154402.mo27926();
            }
            hashSet.add(m50967);
            if (!hashSet2.contains(abstractC154402)) {
                c0713.f2687++;
            }
            if (str4.indexOf(47) == -1) {
                c0713.f2693.add(str4);
            }
            c07132 = c0713;
            c17643 = c1764;
            hashSet4 = hashSet2;
            m49176 = c8918;
            m11558 = strArr;
            m11552 = z;
            m11515 = abstractC15440;
            m11533 = c11667;
            it3 = it4;
            m9487 = z2;
            m115482 = i;
            m11556 = str;
            c153134 = c153132;
        }
        C0713 c07133 = c07132;
        C8918 c89182 = m49176;
        if (mo1526()) {
            return C17222.m40521();
        }
        C8918 m491763 = c07133.f2692.m49176();
        C19765 c19765 = new C19765(c07133, C22523.m50496(c07133.f2695));
        int i2 = 0;
        for (C3545 c35455 : c07133.f2695) {
            if (mo1526()) {
                break;
            }
            i2++;
            if (!hashSet.contains(c35455.getName())) {
                c07133.mo11546(C4925.m14327(R.string.MT_Protector_res_0x7f120ac0) + MotionUtils.EASING_TYPE_FORMAT_START + i2 + "/" + c07133.f2695.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                c07133.mo11520(c35455.getName());
                if (c35455.isDirectory()) {
                    m491763.m23013(c35455);
                } else {
                    C22523.m50503(c35455, c07133.f2696, m491763, c19765);
                    c07133.f2688 = c35455.m10793() + c07133.f2688;
                }
            } else if (!c35455.isDirectory()) {
                c07133.f2688 = c35455.m10793() + c07133.f2688;
            }
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        c89182.close();
        if (c11667 != null) {
            C10025.m25200(c07133.f2692, c11667, c07133);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        C18838.m43524(abstractC15440);
        C17558 c17558 = new C17558();
        c17558.m41050(abstractC15440);
        c07133.f2692.m49175(abstractC15440, new RunnableC11377(c07133, abstractC15440, 1), c07133.f2696);
        c17558.m41052(abstractC15440);
        if (z) {
            boolean z3 = c07133.f2687 > 1;
            if (z3) {
                c07133.m11536(R.string.MT_Protector_res_0x7f12087d);
                c07133.mo11538(0);
                c07133.m50129(0);
            }
            for (String str5 : strArr) {
                AbstractC15440 m39866 = C16999.m39866(str5, new String[0]);
                EnumC16580 m39083 = EnumC16580.m39083(m39866.mo23113());
                if (z3 && m39866.mo23113() && !m39866.m36533()) {
                    c07133.mo11520(m39866.getName());
                }
                if (c07133.m2800(m39866, z3)) {
                    m39083.m39085(str5);
                }
            }
        }
        return C17222.m40520();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m2800(AbstractC15440 abstractC15440, boolean z) {
        if (abstractC15440.mo23113() && !abstractC15440.m36533()) {
            boolean z2 = true;
            Iterator it = abstractC15440.mo23549(true).iterator();
            while (it.hasNext()) {
                if (!m2800((AbstractC15440) it.next(), z)) {
                    z2 = false;
                }
            }
            if (z2) {
                if (z) {
                    mo11520(abstractC15440.getName());
                }
                return abstractC15440.mo27929();
            }
        } else if (!this.f2691.contains(abstractC15440)) {
            if (z) {
                mo11520(abstractC15440.getName());
            }
            return abstractC15440.mo27929();
        }
        return false;
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526()) {
            if (m11542(c16560)) {
                c16560.m39041();
            }
            if (m11525(c165602)) {
                c165602.m39000((Collection) this.f2693);
                c165602.m39015();
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21818 c21818;
        if (!c17222.m40526() && (c21818 = this.f2692) != null) {
            C0349.m1793(c21818.m49176());
            this.f2692.m49174().mo23552();
        }
        C0349.m1793(this.f2696);
        C15528.m36596();
    }
}
