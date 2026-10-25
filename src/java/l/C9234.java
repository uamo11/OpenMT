package l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: T7B2 */
/* renamed from: l.ۢ֡ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9234 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f27952;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20177 f27953;

    public C9234(Context context, C20177 c20177) {
        this.f27952 = context.getApplicationContext();
        this.f27953 = c20177;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18406 m23676() {
        C18406 c18406;
        C18406 m23673;
        C18406 c184062;
        this.f27953.getClass();
        Inet4Address m31302 = C12865.m31302();
        if (m31302 == null || m31302.isAnyLocalAddress() || m31302.isLoopbackAddress() || m31302.isMulticastAddress() || m31302.isLinkLocalAddress()) {
            return new C18406(null, null, null, Collections.EMPTY_LIST);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f27952.getSystemService("connectivity");
        if (connectivityManager == null) {
            c18406 = new C18406(m31302, null, Collections.EMPTY_LIST);
        } else if (Build.VERSION.SDK_INT < 23 || (m23673 = m23673(connectivityManager, connectivityManager.getActiveNetwork(), m31302)) == null) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks != null) {
                for (Network network : allNetworks) {
                    C18406 m236732 = m23673(connectivityManager, network, m31302);
                    if (m236732 != null) {
                        c18406 = m236732;
                        break;
                    }
                }
            }
            c18406 = new C18406(m31302, null, Collections.EMPTY_LIST);
        } else {
            c18406 = m23673;
        }
        InetAddress inetAddress = c18406.f57144;
        List list = c18406.f57146;
        if (inetAddress != null && !list.isEmpty()) {
            return c18406;
        }
        try {
            c184062 = m23674(m31302);
        } catch (RuntimeException unused) {
            c184062 = new C18406(m31302, null, Collections.EMPTY_LIST);
        }
        if (inetAddress == null) {
            inetAddress = c184062.f57144;
        }
        if (list.isEmpty()) {
            list = c184062.f57146;
        }
        return new C18406(m31302, (inetAddress == null || list.isEmpty() || m23675(list, inetAddress)) ? inetAddress : null, list);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18406 m23673(ConnectivityManager connectivityManager, Network network, Inet4Address inet4Address) {
        LinkProperties linkProperties;
        InetAddress inetAddress;
        if (network != null && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
            ArrayList arrayList = new ArrayList();
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                InetAddress address = linkAddress.getAddress();
                if (address instanceof Inet4Address) {
                    C3589 c3589 = new C3589(address, linkAddress.getPrefixLength());
                    if (c3589.m10985(inet4Address)) {
                        arrayList.add(c3589);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator<RouteInfo> it = linkProperties.getRoutes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        inetAddress = null;
                        break;
                    }
                    RouteInfo next = it.next();
                    if (next.isDefaultRoute() && C19112.m44046(next.getGateway())) {
                        inetAddress = next.getGateway();
                        break;
                    }
                }
                return new C18406(inet4Address, (inetAddress == null || m23675(arrayList, inetAddress)) ? inetAddress : null, arrayList);
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C18406 m23674(Inet4Address inet4Address) {
        InetAddress m44048;
        List singletonList;
        WifiManager wifiManager = (WifiManager) this.f27952.getSystemService("wifi");
        if (wifiManager == null) {
            return new C18406(inet4Address, null, Collections.EMPTY_LIST);
        }
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo == null) {
            return new C18406(inet4Address, null, Collections.EMPTY_LIST);
        }
        m44048 = C19112.m44048(dhcpInfo.ipAddress);
        if (!inet4Address.equals(m44048)) {
            return new C18406(inet4Address, null, Collections.EMPTY_LIST);
        }
        int m44054 = C19112.m44054(dhcpInfo.netmask);
        if (m44054 < 0) {
            singletonList = Collections.EMPTY_LIST;
        } else {
            singletonList = Collections.singletonList(new C3589(inet4Address, m44054));
        }
        InetAddress m44049 = C19112.m44049(dhcpInfo.gateway);
        if (!C19112.m44046(m44049)) {
            m44049 = null;
        }
        if (m44049 != null && !singletonList.isEmpty() && !m23675(singletonList, m44049)) {
            return new C18406(inet4Address, null, Collections.EMPTY_LIST);
        }
        return new C18406(inet4Address, m44049, singletonList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23675(List list, InetAddress inetAddress) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C3589) it.next()).m10985(inetAddress)) {
                return true;
            }
        }
        return false;
    }
}
