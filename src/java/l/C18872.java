package l;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: 45RK */
/* renamed from: l.ᩴܽ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C18872 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C18872 f59492;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Logger f59493;

    /* renamed from: ֫ */
    public void mo8317(SSLSocket sSLSocket) {
    }

    /* renamed from: ֫ */
    public void mo8318(SSLSocket sSLSocket, String str, List list) {
    }

    /* renamed from: ֫ */
    public void mo24642(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo43585(String str) {
        return true;
    }

    /* renamed from: ۧ */
    public String mo8319(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C18872 m43580() {
        return f59492;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo43584(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo43582(int i, String str, Throwable th) {
        f59493.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object mo43586() {
        if (f59493.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo43583(Object obj, String str) {
        if (obj == null) {
            str = C16014.m37867(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo43582(5, str, (Throwable) obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m43579(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC14386 enumC14386 = (EnumC14386) list.get(i);
            if (enumC14386 != EnumC14386.HTTP_1_0) {
                arrayList.add(enumC14386.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC1232 mo43581(X509TrustManager x509TrustManager) {
        return new C0526(mo43587(x509TrustManager));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    static {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18872.<clinit>():void");
    }

    /* renamed from: ֫ */
    public SSLContext mo24641() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC15342 mo43587(X509TrustManager x509TrustManager) {
        return new C5466(x509TrustManager.getAcceptedIssuers());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
