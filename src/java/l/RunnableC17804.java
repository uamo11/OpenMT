package l;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: T596 */
/* renamed from: l.ᩳۘۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class RunnableC17804 extends AbstractRunnableC21333 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f54432;

    public RunnableC17804(C19922 c19922, String str) {
        super(c19922);
        this.f54432 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String m48358 = AbstractRunnableC21333.m48358(this.f54432);
        boolean contains = m48358.contains("|");
        C19922 c19922 = this.f68752;
        if (contains && m48358.contains("::")) {
            str = "550 No IPv6 support, reconfigure your client\r\n";
        } else {
            String[] split = m48358.split(",");
            if (split.length != 6) {
                str = "550 Malformed PORT argument\r\n";
            } else {
                int[] iArr = new int[6];
                for (int i = 0; i < split.length; i++) {
                    String str2 = split[i];
                    if (str2.matches("[0-9]+") && str2.length() <= 3) {
                        int parseInt = Integer.parseInt(str2);
                        iArr[i] = parseInt;
                        if (parseInt <= 255) {
                        }
                    }
                    str = C4860.m14172("550 Invalid PORT argument: ", str2, "\r\n");
                }
                byte[] bArr = new byte[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    bArr[i2] = (byte) iArr[i2];
                }
                try {
                    InetAddress byAddress = InetAddress.getByAddress(bArr);
                    InetAddress inetAddress = c19922.m45850().getInetAddress();
                    if (inetAddress == null || byAddress.equals(inetAddress)) {
                        int i3 = (iArr[4] * 256) + iArr[5];
                        if (i3 == 0) {
                            str = "550 Invalid PORT argument: port 0\r\n";
                        } else {
                            c19922.m45843(byAddress, i3);
                            str = null;
                        }
                    } else {
                        str = "550 PORT host must match control connection\r\n";
                    }
                } catch (UnknownHostException unused) {
                    str = "550 Unknown host\r\n";
                }
            }
        }
        if (str == null) {
            c19922.m45860("200 PORT OK\r\n");
        } else {
            c19922.m45860(str);
        }
    }
}
