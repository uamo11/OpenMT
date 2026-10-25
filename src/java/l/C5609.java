package l;

import java.net.Inet4Address;
import java.net.InetAddress;

/* compiled from: C9Z9 */
/* renamed from: l.ۚ᩷᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5609 extends AbstractC19721 {
    @Override // l.AbstractC22542
    /* renamed from: ֫ */
    public final void mo2717(C17603 c17603) {
        InetAddress inetAddress = this.f63741;
        if (inetAddress != null) {
            byte[] address = inetAddress.getAddress();
            if (!(inetAddress instanceof Inet4Address)) {
                byte[] bArr = new byte[4];
                System.arraycopy(address, 12, bArr, 0, 4);
                address = bArr;
            }
            c17603.m41142(address.length, address);
        }
    }

    @Override // l.AbstractC19721, l.AbstractC22542
    /* renamed from: ֫ */
    public final C20095 mo2715(boolean z) {
        C20095 mo2715 = super.mo2715(z);
        mo2715.m46324((Inet4Address) this.f63741);
        return mo2715;
    }
}
