package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: 21XP */
/* renamed from: l.᩺ܰܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C23031 extends AbstractC6138 {

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74117 = 0;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f74118;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f74119;

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76956;
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f1205cd);
        m11555(R.string.MT_Protector_res_0x7f120528);
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        List<AbstractC15440> list = (List) C22311.stream(m11558("ARG_PATHS")).map(new C16599(1)).collect(C22976.toList());
        C7897 m21184 = C7897.m21184(15);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BufferedInputStream m36518 = ((AbstractC15440) it.next()).m36518();
            try {
                C7897 m21186 = C7897.m21186(C10619.m26650(m36518));
                m36518.close();
                if (m21184.f24463 < m21186.f24463) {
                    m21184 = m21186;
                }
            } catch (Throwable th) {
                try {
                    m36518.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        boolean z = ApplicationC20075.f65008.getBoolean("delete_dex_files_after_merged", false);
        C19357 c19357 = new C19357(m21184);
        for (AbstractC15440 abstractC15440 : list) {
            mo11538(0);
            mo11520(C4925.m14306(R.string.MT_Protector_res_0x7f1207a8, abstractC15440.getName()));
            InputStream mo27926 = abstractC15440.mo27926();
            try {
                C12918 m31380 = C12918.m31380(mo27926);
                int m31408 = m31380.m31408();
                Iterator it2 = ((AbstractC18605) m31380.mo27438()).iterator();
                int i = 0;
                while (it2.hasNext()) {
                    C7980 c7980 = (C7980) it2.next();
                    if (mo1526()) {
                        C17222 m40521 = C17222.m40521();
                        mo27926.close();
                        return m40521;
                    }
                    mo11538(i / m31408);
                    c19357.m44606((InterfaceC8566) c7980);
                    i += 100;
                    if (c19357.f68923.getItemCount() > 65536) {
                        throw new C1637(R.string.MT_Protector_res_0x7f120288);
                    }
                    if (c19357.f68924.getItemCount() > 65536) {
                        throw new C1637(R.string.MT_Protector_res_0x7f120287);
                    }
                    if (c19357.f68957.getItemCount() > 65536) {
                        throw new C1637("Merge failed, too many type references in Dex, you can try to merge fewer dex files.");
                    }
                }
                mo27926.close();
            } catch (Throwable th3) {
                if (mo27926 != null) {
                    try {
                        mo27926.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        m11555(R.string.MT_Protector_res_0x7f120b85);
        AbstractC15440 m39866 = C16999.m39866(m11556("outputPath"), new String[0]);
        this.f74119 = m39866;
        if (!z || !m39866.mo23120()) {
            c19357.m48535(this.f74119);
            if (z) {
                m51169(list);
            }
        } else {
            AbstractC15440 m36520 = this.f74119.m36520(".tmp");
            this.f74118 = m36520;
            c19357.m48535(m36520);
            m51169(list);
            this.f74118.m36498(this.f74119, (Runnable) null);
        }
        return C17222.m40520();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51169(List list) {
        boolean z = list.size() > 1;
        if (z) {
            m11536(R.string.MT_Protector_res_0x7f12087d);
            mo11538(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            if (z) {
                mo11520(abstractC15440.getName());
            }
            abstractC15440.mo23552();
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
            c16560.m39053(this.f74119.getName());
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440 = this.f74118;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
        C15528.m36596();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14327(R.string.MT_Protector_res_0x7f1205cd);
    }
}
