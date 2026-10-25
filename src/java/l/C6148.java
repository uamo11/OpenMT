package l;

import bin.mt.plus.R;
import java.util.Arrays;

/* compiled from: R8F6 */
/* renamed from: l.ۛܶ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6148 extends C3695 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C6148 f18925 = new C6148();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C6148 m17063() {
        return f18925;
    }

    @Override // l.C3695
    /* renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        return m17062(((C11793) interfaceC17889).m28851());
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ۧ */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        if (!interfaceC17889.mo36969()) {
            return 0;
        }
        String mo36971 = ((C11793) interfaceC17889).mo36971();
        if (mo36971.equals("image/svg+xml")) {
            return 2;
        }
        if (mo36971.equals("text/xml")) {
            return 3;
        }
        return mo36971.startsWith("image/") ? 1 : 0;
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ֫ */
    public final C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        C10531 m26448;
        String m17062;
        C10382 c10382;
        C9160 c9160 = (C9160) abstractC16891;
        C1358 m28851 = ((C11793) interfaceC17889).m28851();
        try {
            m26448 = C10531.m26448(C16999.m39866(c9160.m23568(), new String[0]));
            try {
                m17062 = m17062(m28851);
                c10382 = new C10382(m26448, m28851);
            } finally {
            }
        } catch (Throwable unused) {
        }
        if (i == 1 || i == 2) {
            C11813 m11250 = C3695.m11250(m17062, C19883.f64215, true, new C17245(2, c10382));
            m26448.close();
            return m11250;
        }
        if (i == 3) {
            C19883 c19883 = C19883.f64196;
            C11813 m112502 = C3695.m11250(m17062, c19883, true, new C5975(1, c10382));
            if (m112502 != c19883.f64250) {
                interfaceC17889.mo36975(R.id.MT_Protector_res_0x7f0a02a4, Boolean.TRUE);
            }
            m26448.close();
            return m112502;
        }
        m26448.close();
        throw new RuntimeException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17062(C1358 c1358) {
        return C14460.m34530("tar:" + Long.toHexString(Arrays.hashCode(new long[]{c1358.m4765(), c1358.m4758().getTime(), c1358.m4741().hashCode()}) & 4294967295L) + c1358.m4729()).toLowerCase();
    }
}
