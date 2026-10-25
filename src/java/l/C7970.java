package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* compiled from: Z72R */
/* renamed from: l.۠ۚܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7970 extends AbstractC10128 {
    public C7970() {
        super(R.string.MT_Protector_res_0x7f1200da, R.drawable.MT_Protector_res_0x7f0801d9);
    }

    @Override // l.AbstractC10128
    /* renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        long j;
        AbstractC16891 m39044 = c16560.m39044();
        AbstractC13921 mo6020 = m39044.mo6020();
        try {
            String m39854 = C16996.m39854(mo6020);
            C11971 m24094 = c16560.m39016().m24094();
            m24094.m29245();
            try {
                j = c16560.m39044().m39733(m39854);
                if (j == 0) {
                    j = c16560.m39026().m39044().m39733(m39854);
                }
                if (j == 0) {
                    Iterator<E> it = m24094.iterator();
                    while (it.hasNext()) {
                        j = ((AbstractC16891) it.next()).m39733(m39854);
                        if (j != 0) {
                            break;
                        }
                    }
                }
            } finally {
                m24094.m29244();
            }
        } catch (Exception unused) {
            j = 0;
        }
        try {
            int i = C15104.f46193;
            C0994 c0994 = new C0994(C0914.class);
            c0994.m3476("ARG_STATELESS_VISITOR", mo6020.m33350());
            c0994.m3474("archiveName", m39044.mo6017().m29744());
            if (j != 0) {
                c0994.m3471(j, "sourceTempLease");
            }
            if (c0994.m3469() != -1) {
            }
        } finally {
            AbstractC16891.m39726(j);
        }
    }
}
