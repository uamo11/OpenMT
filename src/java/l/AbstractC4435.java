package l;

import java.util.ArrayList;

/* compiled from: 88A4 */
/* renamed from: l.ۙۚۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4435 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f14172 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3024 f14173;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C10080 mo13158(Long l2);

    public AbstractC4435(C3024 c3024) {
        this.f14173 = c3024;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m13160() {
        return this.f14172;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.۬ۚۘ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13159() {
        C11491 m47030;
        C17010 m5149;
        C17716[] m33846;
        C16027 c16027 = new C16027();
        while (true) {
            m47030 = this.f14173.m47030(mo13158(c16027.getValue()), EnumC22074.ERROR_MORE_DATA, EnumC22074.ERROR_SUCCESS);
            AbstractC1488 m50851 = m47030.m50851();
            if (m50851 != null && (m5149 = m50851.m5149()) != null && (m33846 = m5149.m33846()) != null) {
                for (C17716 c17716 : m33846) {
                    C16304 c16304 = (C16304) c17716;
                    if (c16304 != null) {
                        C23360 m41495 = c16304.m41495();
                        String m17788 = m41495 == null ? null : m41495.m17788();
                        int m38356 = c16304.m38356();
                        C23360 m38355 = c16304.m38355();
                        r6 = new C12901(m17788, m38356, m38355 != null ? m38355.m17788() : null);
                    }
                    this.f14172.add(r6);
                }
            }
            if (EnumC22074.ERROR_SUCCESS.m49668(m47030.m35552())) {
                return;
            }
            Long m50850 = m47030.m50850();
            if (m50850 == null) {
                throw new C2380("NetrShareEnum resume handle null.");
            }
            if (m50850.longValue() == c16027.getValue().longValue()) {
                throw new C2380("NetrShareEnum resume handle not updated.");
            }
            c16027.m37894(m50850);
        }
    }
}
