package l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* compiled from: 2AKO */
/* renamed from: l.᩹ۘۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22038 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InetAddress f70643;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f70644;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ServerSocket f70645 = null;

    public C22038() {
        m49580();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m49580() {
        ServerSocket serverSocket = this.f70645;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
        this.f70645 = null;
        this.f70643 = null;
        this.f70644 = 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m49583() {
        m49580();
        try {
            ServerSocket serverSocket = new ServerSocket(0, 5);
            this.f70645 = serverSocket;
            serverSocket.setSoTimeout(30000);
            return this.f70645.getLocalPort();
        } catch (IOException unused) {
            m49580();
            return 0;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49582(InetAddress inetAddress, int i) {
        m49580();
        this.f70643 = inetAddress;
        this.f70644 = i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Socket m49584() {
        ServerSocket serverSocket = this.f70645;
        Socket socket = null;
        if (serverSocket == null) {
            if (this.f70643 == null || this.f70644 == 0) {
                m49580();
                return null;
            }
            try {
                Socket socket2 = new Socket(this.f70643, this.f70644);
                try {
                    socket2.setSoTimeout(30000);
                    return socket2;
                } catch (Exception unused) {
                    m49580();
                    return null;
                }
            } catch (IOException unused2) {
                m49580();
                return null;
            }
        }
        try {
            socket = serverSocket.accept();
        } catch (Exception unused3) {
        }
        m49580();
        return socket;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49581() {
        m49580();
    }
}
