package l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: F4DQ */
/* renamed from: l.ۢ֫֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9267 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4965 f28069;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9078 f28070;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16687 f28071;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28072;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC20216 f28073;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f28074;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f28075;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f28076;

    public C9267(C4965 c4965, C9078 c9078, InterfaceC16687 interfaceC16687, AbstractC20216 abstractC20216) {
        List list = Collections.EMPTY_LIST;
        this.f28076 = list;
        this.f28075 = list;
        this.f28072 = new ArrayList();
        this.f28069 = c4965;
        this.f28070 = c9078;
        this.f28071 = interfaceC16687;
        this.f28073 = abstractC20216;
        C11749 m14405 = c4965.m14405();
        Proxy m14408 = c4965.m14408();
        if (m14408 != null) {
            this.f28076 = Collections.singletonList(m14408);
        } else {
            List<Proxy> select = c4965.m14404().select(m14405.m28768());
            this.f28076 = (select == null || select.isEmpty()) ? C20032.m46176(Proxy.NO_PROXY) : C20032.m46175(select);
        }
        this.f28074 = 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20556 m23791() {
        ArrayList arrayList;
        String m28773;
        int m28771;
        if (!m23790()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        do {
            int i = this.f28074;
            int size = this.f28076.size();
            arrayList = this.f28072;
            if (i >= size) {
                break;
            }
            int i2 = this.f28074;
            int size2 = this.f28076.size();
            C4965 c4965 = this.f28069;
            if (i2 >= size2) {
                throw new SocketException("No route to " + c4965.m14405().m28773() + "; exhausted proxy configurations: " + this.f28076);
            }
            int i3 = this.f28074;
            this.f28074 = i3 + 1;
            Proxy proxy = (Proxy) this.f28076.get(i3);
            this.f28075 = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                m28773 = c4965.m14405().m28773();
                m28771 = c4965.m14405().m28771();
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    m28773 = inetSocketAddress.getHostName();
                } else {
                    m28773 = address2.getHostAddress();
                }
                m28771 = inetSocketAddress.getPort();
            }
            if (m28771 < 1 || m28771 > 65535) {
                throw new SocketException("No route to " + m28773 + ":" + m28771 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f28075.add(InetSocketAddress.createUnresolved(m28773, m28771));
            } else {
                this.f28073.getClass();
                List mo3965 = c4965.m14409().mo3965(m28773);
                if (mo3965.isEmpty()) {
                    throw new UnknownHostException(c4965.m14409() + " returned no addresses for " + m28773);
                }
                int size3 = mo3965.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f28075.add(new InetSocketAddress((InetAddress) mo3965.get(i4), m28771));
                }
            }
            int size4 = this.f28075.size();
            for (int i5 = 0; i5 < size4; i5++) {
                C5215 c5215 = new C5215(c4965, proxy, (InetSocketAddress) this.f28075.get(i5));
                if (this.f28070.m23437(c5215)) {
                    arrayList.add(c5215);
                } else {
                    arrayList2.add(c5215);
                }
            }
        } while (arrayList2.isEmpty());
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return new C20556(arrayList2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23789(C5215 c5215, IOException iOException) {
        if (c5215.m14992().type() != Proxy.Type.DIRECT) {
            C4965 c4965 = this.f28069;
            if (c4965.m14404() != null) {
                c4965.m14404().connectFailed(c4965.m14405().m28768(), c5215.m14992().address(), iOException);
            }
        }
        this.f28070.m23436(c5215);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23790() {
        return this.f28074 < this.f28076.size() || !this.f28072.isEmpty();
    }
}
