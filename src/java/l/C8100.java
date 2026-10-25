package l;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;

/* compiled from: B9V6 */
/* renamed from: l.۠ۢ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8100 implements InterfaceC3078 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f24970 = C11321.m27962(C8100.class.getName());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InetAddress[] m21527() {
        InterfaceC2148 interfaceC2148 = f24970;
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    interfaceC2148.mo7090("Found NetworkInterface/InetAddress: {} -- {}", nextElement, nextElement2);
                    try {
                        if (nextElement.isUp() && nextElement.supportsMulticast() && !nextElement.isLoopback()) {
                            hashSet.add(nextElement2);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (SocketException e) {
            interfaceC2148.mo7104("Error while fetching network interfaces addresses: " + e);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }
}
