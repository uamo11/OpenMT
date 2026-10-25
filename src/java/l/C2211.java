package l;

import com.alipay.sdk.m.p.a;
import java.util.Collections;
import java.util.List;

/* compiled from: E4CH */
/* renamed from: l.ۖ֫֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2211 implements InterfaceC23037 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19511 f7259;

    public C2211(InterfaceC19511 interfaceC19511) {
        this.f7259 = interfaceC19511;
    }

    @Override // l.InterfaceC23037
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 mo7384(C7855 c7855) {
        boolean z;
        C8743 m21045 = c7855.m21045();
        C9449 m22618 = m21045.m22618();
        AbstractC2393 m22616 = m21045.m22616();
        if (m22616 != null) {
            C13864 mo1980 = m22616.mo1980();
            if (mo1980 != null) {
                m22618.m24283("Content-Type", mo1980.toString());
            }
            long mo1976 = m22616.mo1976();
            if (mo1976 != -1) {
                m22618.m24283("Content-Length", Long.toString(mo1976));
                m22618.m24275("Transfer-Encoding");
            } else {
                m22618.m24283("Transfer-Encoding", "chunked");
                m22618.m24275("Content-Length");
            }
        }
        if (m21045.m22615("Host") == null) {
            m22618.m24283("Host", C20032.m46172(m21045.m22622(), false));
        }
        if (m21045.m22615("Connection") == null) {
            m22618.m24283("Connection", "Keep-Alive");
        }
        if (m21045.m22615("Accept-Encoding") == null && m21045.m22615("Range") == null) {
            m22618.m24283("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        InterfaceC19511 interfaceC19511 = this.f7259;
        interfaceC19511.mo43455();
        List list = Collections.EMPTY_LIST;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C3988 c3988 = (C3988) list.get(i);
                sb.append(c3988.m12035());
                sb.append(a.h);
                sb.append(c3988.m12036());
            }
            m22618.m24283("Cookie", sb.toString());
        }
        if (m21045.m22615("User-Agent") == null) {
            m22618.m24283("User-Agent", "okhttp/3.12.13");
        }
        C18621 m21036 = c7855.m21036(m22618.m24274());
        C11749 m22622 = m21045.m22622();
        C10338 m43180 = m21036.m43180();
        int i2 = C0799.f2925;
        if (interfaceC19511 != InterfaceC19511.f63052) {
            C3988.m12034(m22622, m43180).isEmpty();
        }
        C3804 m43172 = m21036.m43172();
        m43172.m11479(m21045);
        if (z && "gzip".equalsIgnoreCase(m21036.m43169("Content-Encoding")) && C0799.m3019(m21036)) {
            C1980 c1980 = new C1980(m21036.m43170().mo1616());
            C12454 m26138 = m21036.m43180().m26138();
            m26138.m30617("Content-Encoding");
            m26138.m30617("Content-Length");
            m43172.m11480(m26138.m30612());
            m43172.m11478(new C14910(m21036.m43169("Content-Type"), -1L, C23852.m52567(c1980)));
        }
        return m43172.m11474();
    }
}
