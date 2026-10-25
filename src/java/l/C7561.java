package l;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;

/* compiled from: G2VK */
/* renamed from: l.۟ܺ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7561 extends ServerSocketFactory {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SSLContext f23352;

    public C7561(SSLContext sSLContext) {
        this.f23352 = sSLContext;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket() {
        ServerSocket createServerSocket = this.f23352.getServerSocketFactory().createServerSocket();
        ((SSLServerSocket) createServerSocket).setUseClientMode(true);
        return createServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) {
        ServerSocket createServerSocket = this.f23352.getServerSocketFactory().createServerSocket(i);
        ((SSLServerSocket) createServerSocket).setUseClientMode(true);
        return createServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) {
        ServerSocket createServerSocket = this.f23352.getServerSocketFactory().createServerSocket(i, i2);
        ((SSLServerSocket) createServerSocket).setUseClientMode(true);
        return createServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        ServerSocket createServerSocket = this.f23352.getServerSocketFactory().createServerSocket(i, i2, inetAddress);
        ((SSLServerSocket) createServerSocket).setUseClientMode(true);
        return createServerSocket;
    }
}
