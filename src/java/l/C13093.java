package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: E29Y */
/* renamed from: l.۬ۨܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13093 extends AbstractC22366 {

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f39194 = "null";

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f39193 = new ArrayList();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a26, this.f39194);
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
        ArrayList arrayList;
        AbstractC15440 abstractC15440;
        int i;
        boolean z;
        int i2;
        AbstractC15440 m11515 = m11515("outputDir");
        String[] m11558 = m11558("ARG_PATHS");
        String m11556 = m11556("password");
        int m11548 = m11548("level");
        boolean m11552 = m11552("headerEncryption");
        boolean m115522 = m11552("deleteSources");
        long m11527 = m11527("splitSize");
        int length = m11558.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.f39193;
            if (i3 < length) {
                StringBuilder sb = new StringBuilder();
                sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1201df));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                int i5 = i3 + 1;
                sb.append(i5);
                sb.append("/");
                sb.append(length);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                mo11546(sb.toString());
                m11541(i5, length);
                AbstractC15440 m39866 = C16999.m39866(m11558[i3], new String[0]);
                AbstractC15440 m36492 = m11515.m36526((m39866.mo23113() ? m39866.getName() : m39866.m36517()) + ".7z").m36492(true);
                this.f39194 = m36492.getName();
                C1764 m52845 = C24009.m52845((AbstractC3817) this, new String[]{m11558[i3]}, false);
                int m5894 = m52845.m5894() + i4;
                if (mo1526()) {
                    return C17222.m40521();
                }
                C22351 c22351 = new C22351();
                c22351.f72421 = m52845.f6117.size();
                c22351.f72419 = m11548;
                c22351.f72420 = m11552;
                ArrayList arrayList3 = new ArrayList();
                try {
                    abstractC15440 = m11515;
                    i = m11548;
                    z = m11552;
                    i2 = length;
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList3;
                }
                try {
                    C13178.m32002(c22351, new C3216(this, m11527, m36492, arrayList3, m11556, m52845));
                    if (mo1526()) {
                        C24009.m52846(arrayList3);
                        return C17222.m40521();
                    }
                    arrayList2.addAll(arrayList3);
                    i3 = i5;
                    i4 = m5894;
                    m11515 = abstractC15440;
                    m11548 = i;
                    m11552 = z;
                    length = i2;
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList3;
                    C24009.m52846(arrayList);
                    throw e;
                }
            } else {
                if (!mo1526() && m115522) {
                    C24009.m52848(this, m11558, arrayList2, i4);
                }
                return m11545();
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        boolean m11552 = m11552("compressToAnother");
        C24009.m52849(c17222, m11552, m11552 ? m11525(c165602) : m11542(c16560), c16560, c165602, C24009.m52844((List) this.f39193));
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
