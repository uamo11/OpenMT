package l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: D14B */
/* renamed from: l.᩸ۘܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21335 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f68758 = Executors.newSingleThreadExecutor();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48368(C10402 c10402, C16828 c16828) {
        C11813 m39590 = c16828.m39590();
        if (m39590 != null) {
            c10402.m26232(m39590);
            c10402.setTag(null);
            return;
        }
        C17534 m39598 = c16828.m39598();
        if (m39598 != null) {
            C19883 m9975 = m39598.m40975() ? C19883.f64181 : C3256.m9975(new C15688(C9523.m24404(c16828.m39588()), "/", null, 0L, 0L, true));
            C11813 c11813 = m9975.f64250;
            c16828.m39585(m9975, c11813);
            c10402.m26232(c11813);
            c10402.setTag(null);
            return;
        }
        AbstractC15440 m39866 = C16999.m39866(c16828.m39588(), new String[0]);
        if (!m39866.mo36530()) {
            C19883 m39597 = c16828.m39597();
            if (m39597 == null) {
                m39597 = C19883.f64236;
            }
            c10402.m26232(m39597.f64250);
            C22040 m45867 = C19924.m45867(c16828);
            c10402.setTag(m45867.m49585());
            C19924.m45869(c16828, m45867, c10402);
            if (m45867.m49587()) {
                C1802.f6208.submit(new RunnableC14983(c16828, m39866, m45867));
                return;
            }
            return;
        }
        C9555 c9555 = m39866.mo23120() ? new C9555(m39866) : null;
        if (c9555 == null) {
            C19883 c19883 = C19883.f64236;
            C11813 c118132 = c19883.f64250;
            c16828.m39585(c19883, c118132);
            c10402.m26232(c118132);
            c10402.setTag(null);
            return;
        }
        C20844 c20844 = C20844.f67485;
        C19883 mo11258 = c20844.mo11258(c9555);
        c16828.m39584(mo11258);
        C11813 c118133 = mo11258.f64250;
        c10402.m26232(c118133);
        int mo9351 = c20844.mo9351(c9555);
        if (mo9351 == 0) {
            c16828.m39585(mo11258, c118133);
            c10402.setTag(null);
            return;
        }
        C22040 m458672 = C19924.m45867(c16828);
        c10402.setTag(m458672.m49585());
        C19924.m45869(c16828, m458672, c10402);
        if (m458672.m49587()) {
            f68758.submit(new RunnableC5106(c16828, c9555, mo9351, mo11258, m458672));
        }
    }
}
