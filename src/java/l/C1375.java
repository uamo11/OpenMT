package l;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* compiled from: C9Z9 */
/* renamed from: l.֨᩷᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1375 extends AbstractC19721 {
    @Override // l.AbstractC22542
    /* renamed from: ֫ */
    public final void mo2717(C17603 c17603) {
        InetAddress inetAddress = this.f63741;
        if (inetAddress != null) {
            byte[] address = inetAddress.getAddress();
            if (inetAddress instanceof Inet4Address) {
                byte[] bArr = new byte[16];
                for (int i = 0; i < 16; i++) {
                    if (i < 11) {
                        bArr[i] = address[i - 12];
                    } else {
                        bArr[i] = 0;
                    }
                }
                address = bArr;
            }
            c17603.m41142(address.length, address);
        }
    }

    @Override // l.AbstractC19721, l.AbstractC22542
    /* renamed from: ֫ */
    public final C20095 mo2715(boolean z) {
        C20095 mo2715 = super.mo2715(z);
        mo2715.m46325((Inet6Address) this.f63741);
        return mo2715;
    }
}
