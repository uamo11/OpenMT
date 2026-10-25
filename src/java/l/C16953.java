package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: E29Y */
/* renamed from: l.ܽ᩺ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C16953 extends AbstractC22366 {

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f52032 = "null";

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f52031 = new ArrayList();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a26, this.f52032);
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
        AbstractC15440 abstractC15440;
        String str;
        int i;
        String str2;
        boolean z;
        String str3 = "/";
        AbstractC15440 m11515 = m11515("outputDir");
        String[] m11558 = m11558("ARG_PATHS");
        String m11556 = m11556("password");
        int m11548 = m11548("level");
        boolean m11552 = m11552("deleteSources");
        int i2 = 0;
        C14836 c14836 = new C14836(this, m11558, false);
        if (mo1526()) {
            return C17222.m40521();
        }
        int length = m11558.length;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f52031;
            if (i3 < length) {
                AbstractC15440 m39866 = C16999.m39866(m11558[i3], new String[i2]);
                AbstractC15440 m36492 = m11515.m36526((m39866.mo23113() ? m39866.getName() : m39866.m36517()) + ".zip").m36492(true);
                this.f52032 = m36492.getName();
                C1764 m35238 = c14836.m35238(i3);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(m36492);
                try {
                    C8918 c8918 = new C8918(m36492);
                    try {
                        c8918.m23026(m11556);
                        boolean m47042 = AbstractC20546.m47042(m11548, c8918);
                        C15313 c15313 = new C15313();
                        if (m47042) {
                            abstractC15440 = m11515;
                            Iterator it = m35238.f6117.iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                C7469 c7469 = (C7469) it.next();
                                str = m11556;
                                if (c7469.f23002) {
                                    i = m11548;
                                } else {
                                    i = m11548;
                                    if (c7469.f22995.equals("AndroidManifest.xml")) {
                                        try {
                                            C15206 m35971 = C15206.m35971(c7469.f22994);
                                            c15313.f46967 = C22263.m49982(m35971);
                                            c15313.f46966 = C22263.m49984(m35971);
                                            break;
                                        } catch (Exception unused) {
                                            c15313.f46967 = false;
                                            c15313.f46966 = false;
                                        }
                                    }
                                }
                                m11556 = str;
                                it = it2;
                                m11548 = i;
                            }
                        } else {
                            abstractC15440 = m11515;
                        }
                        str = m11556;
                        i = m11548;
                        Iterator it3 = m35238.f6117.iterator();
                        while (it3.hasNext()) {
                            C7469 c74692 = (C7469) it3.next();
                            if (mo1526()) {
                                break;
                            }
                            c14836.m35242();
                            mo11546(C4925.m14327(R.string.MT_Protector_res_0x7f1201df) + MotionUtils.EASING_TYPE_FORMAT_START + c14836.m35237() + str3 + c14836.m35241() + MotionUtils.EASING_TYPE_FORMAT_END);
                            boolean z2 = c74692.f23002;
                            Iterator it4 = it3;
                            String[] strArr = m11558;
                            long j = c74692.f22997;
                            int i4 = length;
                            String str4 = c74692.f22995;
                            if (z2) {
                                C3545 c3545 = new C3545(str4 + str3);
                                c3545.setTime(j);
                                c8918.m23013(c3545);
                                str2 = str3;
                                z = m47042;
                            } else {
                                AbstractC15440 abstractC154402 = c74692.f22994;
                                if (m47042) {
                                    str2 = str3;
                                    c8918.m23018(C21665.m48934(str4, c15313));
                                } else {
                                    str2 = str3;
                                }
                                mo11520(str4);
                                C3545 c35452 = new C3545(str4);
                                z = m47042;
                                c35452.m10805(c74692.f23003);
                                c35452.setTime(j);
                                c8918.m23013(c35452);
                                abstractC154402.m36495(c8918.m23007(), new C11310(this, c14836));
                            }
                            m11558 = strArr;
                            it3 = it4;
                            length = i4;
                            str3 = str2;
                            m47042 = z;
                        }
                        String str5 = str3;
                        String[] strArr2 = m11558;
                        int i5 = length;
                        c8918.close();
                        if (mo1526()) {
                            C24009.m52846(arrayList2);
                            return C17222.m40521();
                        }
                        arrayList.addAll(arrayList2);
                        i3++;
                        i2 = 0;
                        m11558 = strArr2;
                        m11515 = abstractC15440;
                        m11556 = str;
                        m11548 = i;
                        length = i5;
                        str3 = str5;
                    } catch (Throwable th) {
                        try {
                            c8918.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    C24009.m52846(arrayList2);
                    throw e;
                }
            } else {
                String[] strArr3 = m11558;
                if (!mo1526() && m11552) {
                    C24009.m52848(this, strArr3, arrayList, c14836.m35241());
                }
                return m11545();
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        boolean m11552 = m11552("compressToAnother");
        C24009.m52849(c17222, m11552, m11552 ? m11525(c165602) : m11542(c16560), c16560, c165602, C24009.m52844((List) this.f52031));
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
