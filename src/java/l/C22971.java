package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: E29Y */
/* renamed from: l.᩺ۨܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C22971 extends AbstractC22366 {

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f73976 = "null";

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f73975 = new ArrayList();

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final C17222 mo3144(Exception exc) {
        if (!mo1526()) {
            return C17222.m40517(exc);
        }
        return C17222.m40521();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a26, this.f73976);
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
        EnumC6434 enumC6434;
        int i;
        ArrayList arrayList;
        OutputStream m17794;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        byte b;
        String str3;
        long j;
        byte b2;
        AbstractC15440 m11515 = m11515("outputDir");
        String[] m11558 = m11558("ARG_PATHS");
        int m11548 = m11548("level");
        EnumC6434 enumC64342 = EnumC6434.values()[m11548("format")];
        boolean m11552 = m11552("deleteSources");
        boolean z = true;
        C14836 c14836 = new C14836(this, m11558, true);
        if (mo1526()) {
            return C17222.m40521();
        }
        int length = m11558.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = this.f73975;
            if (i6 >= length) {
                if (!mo1526() && m11552) {
                    C24009.m52848(this, m11558, arrayList2, c14836.m35241());
                }
                return m11545();
            }
            AbstractC15440 m39866 = C16999.m39866(m11558[i6], new String[i5]);
            if (enumC64342.f19900 && m39866.mo23113()) {
                throw new Exception(C4153.m12552(m39866, new StringBuilder("Can not compress directory: ")));
            }
            StringBuilder m15339 = C5368.m15339((m39866.mo23113() || enumC64342.f19900) ? m39866.getName() : m39866.m36517());
            m15339.append(enumC64342.f19899);
            AbstractC15440 m36492 = m11515.m36526(m15339.toString()).m36492(z);
            this.f73976 = m36492.getName();
            C1764 m35238 = c14836.m35238(i6);
            if (enumC64342.f19900 && m35238.f6117.size() != z) {
                throw new RuntimeException("Expected to be a single file, but file size = " + m35238.f6117.size());
            }
            try {
                boolean z2 = enumC64342.f19900;
                String str4 = MotionUtils.EASING_TYPE_FORMAT_END;
                String str5 = MotionUtils.EASING_TYPE_FORMAT_START;
                String str6 = "/";
                if (z2) {
                    C7469 c7469 = (C7469) m35238.f6117.get(0);
                    CharSequence charSequence = c7469.f22995;
                    AbstractC15440 abstractC154402 = c7469.f22994;
                    mo11520(charSequence);
                    c14836.m35242();
                    StringBuilder sb = new StringBuilder();
                    abstractC15440 = m11515;
                    sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1201df));
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                    sb.append(c14836.m35237());
                    sb.append("/");
                    sb.append(c14836.m35241());
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                    mo11546(sb.toString());
                    OutputStream m177942 = enumC64342.m17794(m36492.mo23555(false), m11548, abstractC154402.mo23127());
                    try {
                        abstractC154402.m36495(m177942, new C6038(this, c14836));
                        if (m177942 != null) {
                            m177942.close();
                        }
                        i2 = m11548;
                        enumC6434 = enumC64342;
                        i3 = length;
                        i = i6;
                        arrayList = arrayList2;
                    } finally {
                    }
                } else {
                    abstractC15440 = m11515;
                    EnumC6434 enumC64343 = enumC64342.f19902;
                    if (enumC64343 == null) {
                        m17794 = m36492.m36525();
                        enumC6434 = enumC64342;
                        i = i6;
                        arrayList = arrayList2;
                    } else {
                        enumC6434 = enumC64342;
                        i = i6;
                        arrayList = arrayList2;
                        m17794 = enumC64343.m17794(m36492.mo23555(false), m11548, -1L);
                    }
                    C21820 c21820 = new C21820(m17794);
                    try {
                        c21820.m49188();
                        c21820.m49186();
                        Iterator it = m35238.f6117.iterator();
                        while (it.hasNext()) {
                            C7469 c74692 = (C7469) it.next();
                            if (mo1526()) {
                                break;
                            }
                            c14836.m35242();
                            mo11546(C4925.m14327(R.string.MT_Protector_res_0x7f1201df) + str5 + c14836.m35237() + str6 + c14836.m35241() + str4);
                            boolean z3 = c74692.f23002;
                            String str7 = c74692.f22999;
                            long j2 = c74692.f22997;
                            Iterator it2 = it;
                            String str8 = c74692.f22995;
                            int i7 = m11548;
                            boolean z4 = c74692.f23001;
                            if (z3) {
                                String str9 = str8 + str6;
                                if (z4) {
                                    i4 = length;
                                    b2 = 50;
                                } else {
                                    i4 = length;
                                    b2 = 53;
                                }
                                C1358 c1358 = new C1358(b2, str9);
                                c1358.m4737(C4529.fromMillis(j2));
                                if (c74692.f23000) {
                                    c1358.m4732(c74692.f23004 | 16384);
                                    c1358.m4763(c74692.f22996);
                                    c1358.m4734(c74692.f22998);
                                }
                                if (z4) {
                                    c1358.m4752(str7);
                                }
                                c21820.m49185(c1358);
                                c21820.m49187();
                                str = str4;
                                str2 = str5;
                                str3 = str6;
                            } else {
                                i4 = length;
                                AbstractC15440 abstractC154403 = c74692.f22994;
                                mo11520(str8);
                                str = str4;
                                if (z4) {
                                    str2 = str5;
                                    b = 50;
                                } else {
                                    str2 = str5;
                                    b = UTF8.S_P3A;
                                }
                                C1358 c13582 = new C1358(b, str8);
                                if (z4) {
                                    str3 = str6;
                                    j = 0;
                                } else {
                                    str3 = str6;
                                    j = c74692.f23003;
                                }
                                c13582.m4751(j);
                                c13582.m4737(C4529.fromMillis(j2));
                                if (c74692.f23000) {
                                    c13582.m4732(c74692.f23004 | 32768);
                                    c13582.m4763(c74692.f22996);
                                    c13582.m4734(c74692.f22998);
                                }
                                if (z4) {
                                    c13582.m4752(str7);
                                }
                                c21820.m49185(c13582);
                                if (!z4) {
                                    abstractC154403.m36495(c21820, new C11683(this, c14836));
                                }
                                c21820.m49187();
                            }
                            str6 = str3;
                            str4 = str;
                            it = it2;
                            m11548 = i7;
                            length = i4;
                            str5 = str2;
                        }
                        i2 = m11548;
                        i3 = length;
                        c21820.close();
                    } finally {
                    }
                }
                if (mo1526()) {
                    m36492.mo27929();
                    return C17222.m40521();
                }
                arrayList.add(m36492);
                i6 = i + 1;
                z = true;
                i5 = 0;
                m11515 = abstractC15440;
                enumC64342 = enumC6434;
                m11548 = i2;
                length = i3;
            } catch (Exception e) {
                m36492.mo27929();
                throw e;
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        boolean m11552 = m11552("compressToAnother");
        C24009.m52849(c17222, m11552, m11552 ? m11525(c165602) : m11542(c16560), c16560, c165602, C24009.m52844((List) this.f73975));
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
