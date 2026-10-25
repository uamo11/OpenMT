package l;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* compiled from: A9AT */
/* renamed from: l.۟֨ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7138 extends SocketFactory {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SocketFactory f21921 = SocketFactory.getDefault();

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket createSocket = this.f21921.createSocket();
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f21921.createSocket(str, i);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f21921.createSocket(str, i, inetAddress, i2);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f21921.createSocket(inetAddress, i);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f21921.createSocket(inetAddress, i, inetAddress2, i2);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }
}
