package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: Q8SB */
/* renamed from: l.᩺ܿۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23135 implements InterfaceC11058 {
    @Override // l.InterfaceC11058
    /* renamed from: ֫ */
    public final int mo27440(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // l.InterfaceC11058
    /* renamed from: ֫ */
    public final C7613 mo27442(C13962 c13962, C1885 c1885) {
        IOException iOException = c1885.f6396;
        if (!(iOException instanceof C23770)) {
            return null;
        }
        int i = ((C23770) iOException).f76941;
        if ((i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) && c13962.f41669 - c13962.f41668 > 1) {
            return new C7613(2, 60000L);
        }
        return null;
    }

    @Override // l.InterfaceC11058
    /* renamed from: ֫ */
    public long mo27441(C1885 c1885) {
        Throwable th = c1885.f6396;
        if ((th instanceof C9080) || (th instanceof FileNotFoundException) || (th instanceof C18126) || (th instanceof C9647)) {
            return -9223372036854775807L;
        }
        int i = C22154.f71900;
        while (th != null) {
            if ((th instanceof C22154) && ((C22154) th).f71901 == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return Math.min((c1885.f6395 - 1) * 1000, OpenAuthTask.Duplex);
    }
}
