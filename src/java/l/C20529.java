package l;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* compiled from: 66S6 */
/* renamed from: l.᩷֡ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20529 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47015(InterfaceC20758 interfaceC20758) {
        return C17229.exists(interfaceC20758, EnumC14406.NOFOLLOW_LINKS);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11915 m47013(InterfaceC20758 interfaceC20758, String str, C6417 c6417, InterfaceC17066 interfaceC17066) {
        InterfaceC20758 m25230 = C10050.m25230(str, interfaceC20758);
        m47014(interfaceC17066);
        boolean z = true;
        boolean z2 = m47015(interfaceC20758.resolve(str.concat(".dat"))) || m47015(interfaceC20758.resolve(str.concat(".tat"))) || m47015(interfaceC20758.resolve(str.concat(".lit")));
        if (!m47015(m25230.resolve("migration.id")) || (m47015(m25230.resolve("app-adopted")) && !z2)) {
            z = false;
        }
        if (!m47015(m25230) || z) {
            C10050 m25221 = C10050.m25221(interfaceC20758, str, c6417.f19851);
            try {
                m47014(interfaceC17066);
                C9240.m23681(m25230, m25221.f30215.f57385.m44358());
                m25221.m25232();
                m25221.close();
            } catch (Throwable th) {
                try {
                    m25221.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m47014(interfaceC17066);
        C11915 m29053 = C11915.m29053(m25230, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, interfaceC17066, str);
        try {
            C9240.m23681(m25230, m29053.f35623.f31452.f19337.m44358());
            m47014(interfaceC17066);
            return m29053;
        } catch (IOException | Error | RuntimeException e) {
            try {
                m29053.m29068().m10930();
            } catch (Throwable th3) {
                e.addSuppressed(th3);
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47014(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new CancellationException("Session startup is canceled");
        }
    }
}
