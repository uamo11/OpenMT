package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: E29Y */
/* renamed from: l.֫᩺ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C2137 extends AbstractC22366 {

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f7101;

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
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a26, m11517("output"));
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
        OutputStream m17794;
        String[] strArr;
        boolean z;
        C22142 c22142;
        boolean z2;
        C22142 c221422;
        this.f7101 = m11515("output");
        String[] m11558 = m11558("ARG_PATHS");
        EnumC6434 enumC6434 = EnumC6434.values()[m11548("format")];
        int m11548 = m11548("level");
        boolean m11552 = m11552("deleteSources");
        boolean m115522 = m11552("replaceExisting");
        C1764 m52845 = C24009.m52845((AbstractC3817) this, m11558, true);
        ArrayList arrayList = m52845.f6117;
        if (mo1526()) {
            return C17222.m40521();
        }
        if (enumC6434.f19900 && arrayList.size() != 1) {
            throw new RuntimeException("Expected to be a single file, but file size = " + arrayList.size());
        }
        C22142 m49744 = C22142.m49744(this.f7101, m115522);
        AbstractC15440 m49751 = m49744.m49751();
        if (enumC6434.f19900) {
            C7469 c7469 = (C7469) arrayList.get(0);
            mo11546(C4925.m14327(R.string.MT_Protector_res_0x7f1201df));
            CharSequence charSequence = c7469.f22995;
            AbstractC15440 abstractC15440 = c7469.f22994;
            mo11520(charSequence);
            try {
                OutputStream m177942 = enumC6434.m17794(m49751.mo23555(false), m11548, abstractC15440.mo23127());
                try {
                    abstractC15440.m36495(m177942, new C13798(this, c7469));
                    if (m177942 != null) {
                        m177942.close();
                    }
                    strArr = m11558;
                    z = m11552;
                    c22142 = m49744;
                } finally {
                }
            } catch (Exception e) {
                m49751.mo27929();
                throw e;
            }
        } else {
            EnumC6434 enumC64342 = enumC6434.f19902;
            try {
                if (enumC64342 == null) {
                    m17794 = m49751.m36525();
                } else {
                    m17794 = enumC64342.m17794(m49751.mo23555(false), m11548, -1L);
                }
                C21820 c21820 = new C21820(m17794);
                try {
                    c21820.m49188();
                    c21820.m49186();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C7469 c74692 = (C7469) it.next();
                        if (mo1526()) {
                            break;
                        }
                        m52845.m5895();
                        boolean z3 = c74692.f23002;
                        long j = c74692.f23003;
                        String str = c74692.f22999;
                        long j2 = c74692.f22997;
                        String str2 = c74692.f22995;
                        Iterator it2 = it;
                        boolean z4 = c74692.f23001;
                        String[] strArr2 = m11558;
                        if (z3) {
                            C1358 c1358 = new C1358(z4 ? (byte) 50 : (byte) 53, str2 + "/");
                            c1358.m4737(C4529.fromMillis(j2));
                            if (c74692.f23000) {
                                c1358.m4732(c74692.f23004 | 16384);
                                c1358.m4763(c74692.f22996);
                                c1358.m4734(c74692.f22998);
                            }
                            if (z4) {
                                c1358.m4752(str);
                            }
                            c21820.m49185(c1358);
                            c21820.m49187();
                            z2 = m11552;
                            c221422 = m49744;
                        } else {
                            AbstractC15440 abstractC154402 = c74692.f22994;
                            z2 = m11552;
                            StringBuilder sb = new StringBuilder();
                            c221422 = m49744;
                            sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1201df));
                            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                            sb.append(m52845.m5889());
                            sb.append("/");
                            sb.append(m52845.m5894());
                            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                            mo11546(sb.toString());
                            mo11520(str2);
                            C1358 c13582 = new C1358(z4 ? (byte) 50 : UTF8.S_P3A, str2);
                            c13582.m4751(z4 ? 0L : j);
                            c13582.m4737(C4529.fromMillis(j2));
                            if (c74692.f23000) {
                                c13582.m4732(c74692.f23004 | 32768);
                                c13582.m4763(c74692.f22996);
                                c13582.m4734(c74692.f22998);
                            }
                            if (z4) {
                                c13582.m4752(str);
                            }
                            c21820.m49185(c13582);
                            if (!z4) {
                                abstractC154402.m36495(c21820, new C7449(this, m52845));
                            }
                            c21820.m49187();
                            m52845.m5890(j);
                        }
                        it = it2;
                        m11558 = strArr2;
                        m11552 = z2;
                        m49744 = c221422;
                    }
                    strArr = m11558;
                    z = m11552;
                    c22142 = m49744;
                    c21820.close();
                } finally {
                }
            } catch (Exception e2) {
                m49751.mo27929();
                throw e2;
            }
        }
        if (mo1526()) {
            m49751.mo27929();
            return C17222.m40521();
        }
        List m49750 = c22142.m49750(Collections.singletonList(m49751), EnumC21437.NONE);
        if (mo1526()) {
            return C17222.m40521();
        }
        if (z) {
            C24009.m52848(this, strArr, m49750, m52845.m5894());
        }
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        boolean m11552 = m11552("compressToAnother");
        C24009.m52849(c17222, m11552, m11552 ? m11525(c165602) : m11542(c16560), c16560, c165602, Collections.singletonList(this.f7101.getName()));
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
