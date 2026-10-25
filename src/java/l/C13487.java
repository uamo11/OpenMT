package l;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: A9AU */
/* renamed from: l.ܰ֨ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13487 extends SSLSocketFactory {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory f40276;

    public C13487(SSLSocketFactory sSLSocketFactory) {
        this.f40276 = sSLSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f40276.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f40276.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket createSocket = this.f40276.createSocket();
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f40276.createSocket(socket, str, i, z);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f40276.createSocket(str, i);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f40276.createSocket(str, i, inetAddress, i2);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f40276.createSocket(inetAddress, i);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f40276.createSocket(inetAddress, i, inetAddress2, i2);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }
}
