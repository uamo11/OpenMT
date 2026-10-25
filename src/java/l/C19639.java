package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.InputStream;

/* compiled from: 195D */
/* renamed from: l.᩵ᩳ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C19639 extends AbstractC6138 {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f63381;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f63382;

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76960;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2d, C9523.m24404(m11556("file")), C4925.m14327(R.string.MT_Protector_res_0x7f120a8d));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120616);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        AbstractC15440 abstractC15440;
        AbstractC15440 m11515 = m11515("file");
        this.f63382 = m11515;
        if (!m11515.mo23120()) {
            abstractC15440 = this.f63382;
        } else {
            abstractC15440 = this.f63382.m36520(".tmp");
        }
        this.f63381 = abstractC15440;
        AbstractC15440[] m39875 = C16999.m39875(m11558("ARG_PATHS"));
        boolean m11552 = m11552("removeSources");
        long j = 0;
        for (AbstractC15440 abstractC154402 : m39875) {
            j += abstractC154402.mo23127();
        }
        C19277 c19277 = new C19277(j);
        c19277.m44459(new C5544(this));
        BufferedOutputStream m36525 = this.f63381.m36525();
        try {
            byte[] bArr = new byte[1024];
            for (AbstractC15440 abstractC154403 : m39875) {
                mo11520(abstractC154403.getName());
                InputStream mo27926 = abstractC154403.mo27926();
                do {
                    try {
                        int read = mo27926.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        c19277.m44460(read);
                        m36525.write(bArr, 0, read);
                    } finally {
                    }
                } while (!mo1526());
                mo27926.close();
            }
            m36525.close();
            if (mo1526()) {
                return C17222.m40521();
            }
            if (m11552) {
                boolean z = m39875.length > 1;
                if (z) {
                    m11536(R.string.MT_Protector_res_0x7f12087d);
                    mo11538(0);
                }
                for (AbstractC15440 abstractC154404 : m39875) {
                    if (z) {
                        mo11520(abstractC154404.getName());
                    }
                    abstractC154404.mo27929();
                }
            }
            AbstractC15440 abstractC154405 = this.f63382;
            AbstractC15440 abstractC154406 = this.f63381;
            if (abstractC154405 != abstractC154406) {
                abstractC154406.m36498(abstractC154405, (Runnable) null);
            }
            return C17222.m40520();
        } catch (Throwable th) {
            try {
                m36525.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (m11542(c16560) && c17222.m40526()) {
            c16560.m39041();
            c16560.m39053(this.f63382.getName());
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440;
        if (!c17222.m40526() && (abstractC15440 = this.f63381) != null) {
            abstractC15440.mo27929();
        }
        C15528.m36596();
    }
}
