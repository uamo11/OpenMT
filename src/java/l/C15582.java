package l;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: T7B2 */
/* renamed from: l.ܺ֡ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15582 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36751(InetAddress inetAddress, InetAddress inetAddress2) {
        byte[] bArr;
        byte[] bArr2;
        DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
        try {
            datagramSocket.setBroadcast(true);
            datagramSocket.bind(new InetSocketAddress(inetAddress, 0));
            bArr = C19112.f60203;
            bArr2 = C19112.f60203;
            datagramSocket.send(new DatagramPacket(bArr, bArr2.length, inetAddress2, 9));
            datagramSocket.close();
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
