package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: 795C */
/* renamed from: l.۫ܽ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C12540 extends AbstractC6138 {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f37666 = new ArrayList();

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f37667 = new ArrayList();

    @Override // l.AbstractC3817
    /* renamed from: ۡ */
    public final boolean mo3145() {
        return false;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        String[] m11558 = m11558("ARG_PATHS");
        String m11556 = m11556("targetPath");
        C17721.m41503(m11556, EnumC16309.MODIFY_DIRECTORY);
        SystemClock.sleep(200L);
        C19277 c19277 = new C19277(m11558.length);
        c19277.m44459(new C23310(this));
        int length = 1000 / m11558.length;
        if (length > 200) {
            length = 200;
        }
        for (String str : m11558) {
            AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
            String name = m39866.getName();
            c19277.m44460(1);
            mo11520(name);
            if (length > 0) {
                SystemClock.sleep(length);
            }
            try {
                C16999.m39866(C9523.m24393(m11556, name), new String[0]).mo27934(m39866.mo32031());
                this.f37666.add(name);
            } catch (IOException unused) {
                this.f37667.add(name);
            }
            if (mo1526()) {
                return C17222.m40521();
            }
        }
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76964;
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f12051c);
        m11555(R.string.MT_Protector_res_0x7f120797);
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo3270(AbstractActivityC3346 abstractActivityC3346, C17222 c17222, boolean z) {
        ArrayList arrayList = this.f37667;
        if (arrayList.isEmpty()) {
            return;
        }
        abstractActivityC3346.m10218(R.string.MT_Protector_res_0x7f12051b, C9679.m24609(arrayList, "\n"), false);
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        ArrayList arrayList = this.f37666;
        if (arrayList.isEmpty() || !m11525(c165602)) {
            return;
        }
        c165602.m39000((Collection) arrayList);
        c165602.m39015();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14327(R.string.MT_Protector_res_0x7f120a89);
    }
}
