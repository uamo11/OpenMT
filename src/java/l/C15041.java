package l;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* compiled from: 418A */
/* renamed from: l.ܶۛۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15041 extends SocketFactory {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public SocketFactory f45923 = SocketFactory.getDefault();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f45922 = 65536;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket createSocket = this.f45923.createSocket();
        createSocket.setSendBufferSize(this.f45922);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f45923.createSocket(str, i);
        createSocket.setSendBufferSize(this.f45922);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f45923.createSocket(inetAddress, i);
        createSocket.setSendBufferSize(this.f45922);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f45923.createSocket(str, i, inetAddress, i2);
        createSocket.setSendBufferSize(this.f45922);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f45923.createSocket(inetAddress, i, inetAddress2, i2);
        createSocket.setSendBufferSize(this.f45922);
        return createSocket;
    }
}
