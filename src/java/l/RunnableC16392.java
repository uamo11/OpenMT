package l;

import java.net.InetAddress;

/* compiled from: C55Y */
/* renamed from: l.ܽۘۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class RunnableC16392 extends AbstractRunnableC21333 implements Runnable {
    public RunnableC16392(C19922 c19922, String str) {
        super(c19922);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19922 c19922 = this.f68752;
        int m45849 = c19922.m45849();
        if (m45849 == 0) {
            c19922.m45860("502 Couldn't open a port\r\n");
            return;
        }
        InetAddress m45859 = c19922.m45859();
        if (m45859 == null) {
            c19922.m45860("502 Couldn't open a port\r\n");
            return;
        }
        if (m45849 < 1) {
            c19922.m45860("502 Couldn't open a port\r\n");
            return;
        }
        String hostAddress = m45859.getHostAddress();
        if (hostAddress != null) {
            hostAddress = hostAddress.replace('.', ',');
        }
        StringBuilder m9834 = C3200.m9834("227 Entering Passive Mode (", hostAddress, ",");
        m9834.append(m45849 / 256);
        m9834.append(",");
        m9834.append(m45849 % 256);
        m9834.append(").\r\n");
        c19922.m45860(m9834.toString());
    }
}
