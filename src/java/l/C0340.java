package l;

import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: W79N */
/* renamed from: l.֡ۢ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0340 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f1745 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C16568 f1747;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C19392 f1749;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C20177 f1750;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C22544 f1751;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object f1746 = new Object();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f1748 = new LinkedHashMap();

    static {
        C16568 c16568 = new C16568();
        C20177 c20177 = new C20177();
        C19392 c19392 = new C19392();
        ExecutorService executorService = C1802.f6208;
        C11003.requireNonNull(executorService);
        C22544 c22544 = new C22544(executorService);
        f1747 = c16568;
        f1750 = c20177;
        f1749 = c19392;
        f1751 = c22544;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1769(AbstractActivityC3346 abstractActivityC3346, final C15862 c15862, final InterfaceC8808 interfaceC8808, final InterfaceC13041 interfaceC13041) {
        String str;
        String[] strArr;
        C22544 c22544;
        final C7727 c7727;
        C5242 c5242;
        String[] strArr2;
        Inet4Address inet4Address;
        int i;
        Inet4Address inet4Address2;
        Iterator it;
        long j;
        Inet4Address inet4Address3;
        if (C6326.m17599(abstractActivityC3346)) {
            View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00cc);
            TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
            textView.setText(R.string.MT_Protector_res_0x7f1208d4);
            final ProgressBar progressBar = (ProgressBar) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0458);
            progressBar.setVisibility(0);
            ListView listView = (ListView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
            C4915.m14284(listView);
            str = c15862.f49031;
            final C6316 c6316 = new C6316(str);
            c6316.f19564 = ((View) textView.getParent()).getPaddingLeft();
            c6316.f19562 = C11266.m27878(8.0f);
            listView.setDivider(null);
            listView.setAdapter((ListAdapter) c6316);
            C19258 buildDialog = abstractActivityC3346.buildDialog();
            buildDialog.m44421(m10216);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
            buildDialog.m44428(false);
            final DialogInterfaceC0206 m44438 = buildDialog.m44438();
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.۠᩷᩻
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                    List list;
                    list = c6316.f19563;
                    InterfaceC13041.this.accept((C10925) list.get(i2));
                    m44438.dismiss();
                }
            });
            final C14076 c14076 = new C14076(m44438);
            ArrayList arrayList = new ArrayList();
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces != null) {
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface nextElement = networkInterfaces.nextElement();
                        try {
                            String name = nextElement.getName();
                            if (!m1778(name) && nextElement.isUp() && !nextElement.isLoopback() && !nextElement.isVirtual() && !m1784(name) && !m1784(nextElement.getDisplayName())) {
                                for (InterfaceAddress interfaceAddress : nextElement.getInterfaceAddresses()) {
                                    InetAddress address = interfaceAddress.getAddress();
                                    if ((address instanceof Inet4Address) && !address.isAnyLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress()) {
                                        arrayList.add(new C17274((Inet4Address) address, interfaceAddress.getNetworkPrefixLength()));
                                    }
                                }
                            }
                        } catch (SocketException unused) {
                        }
                    }
                }
            } catch (SocketException unused2) {
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                inet4Address3 = ((C17274) it2.next()).f52947;
                linkedHashSet.add(Long.valueOf(m1760(inet4Address3)));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C17274 c17274 = (C17274) it3.next();
                i = c17274.f52948;
                char c = 24;
                int max = (i < 0 || i > 32) ? 24 : Math.max(i, 24);
                if (max >= 31) {
                    it = it3;
                } else {
                    inet4Address2 = c17274.f52947;
                    it = it3;
                    long j2 = (4294967295 << (32 - max)) & 4294967295L;
                    long m1760 = m1760(inet4Address2) & j2;
                    long j3 = ((~j2) & 4294967295L) | m1760;
                    long j4 = m1760 + 1;
                    while (j4 < j3) {
                        if (linkedHashSet.contains(Long.valueOf(j4))) {
                            j = j4;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append((j4 >> c) & 255);
                            sb.append(".");
                            j = j4;
                            sb.append((j4 >> 16) & 255);
                            sb.append(".");
                            sb.append((j >> 8) & 255);
                            sb.append(".");
                            sb.append(j & 255);
                            linkedHashSet2.add(sb.toString());
                        }
                        j4 = j + 1;
                        c = 24;
                    }
                }
                it3 = it;
            }
            final ArrayList arrayList2 = new ArrayList(linkedHashSet2);
            strArr = c15862.f49029;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                c22544 = f1751;
                if (i2 >= length) {
                    c7727 = null;
                    break;
                }
                if (m1778(strArr[i2])) {
                    i2++;
                } else {
                    C14076.m33669(c14076, abstractActivityC3346);
                    final C20803 c20803 = new C20803();
                    c7727 = new C7727(c14076, c20803);
                    strArr2 = c15862.f49029;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        }
                        if (m1778(strArr2[i3])) {
                            i3++;
                        } else if (arrayList.isEmpty()) {
                            c22544.f72934.execute(new Runnable() { // from class: l.ۙ᩷᩻
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0340.m1775(C20803.this, c7727, c15862, (Inet4Address) null, "default");
                                }
                            });
                        } else {
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                final C17274 c172742 = (C17274) it4.next();
                                inet4Address = c172742.f52947;
                                final String hostAddress = inet4Address.getHostAddress();
                                c22544.f72934.execute(new Runnable() { // from class: l.ۗ᩷᩻
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C0340.m1776(C20803.this, c7727, c15862, c172742, hostAddress);
                                    }
                                });
                            }
                        }
                    }
                    m44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ܶ᩷᩻
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            c20803.m47597();
                            C14076.m33677(c14076);
                        }
                    });
                }
            }
            final C7727 c77272 = c7727;
            c5242 = c14076.f42504;
            c5242.m1668(m44438, new InterfaceC1008() { // from class: l.᩸᩷᩻
                @Override // l.InterfaceC1008
                /* renamed from: ֫ */
                public final void mo1617(Object obj) {
                    List list = (List) obj;
                    if (list == null) {
                        list = Collections.EMPTY_LIST;
                    }
                    progressBar.setVisibility(list.isEmpty() ? 0 : 8);
                    C6316 c63162 = c6316;
                    c63162.f19563 = list;
                    c63162.notifyDataSetChanged();
                }
            });
            final AtomicInteger atomicInteger = new AtomicInteger();
            int size = arrayList2.size();
            int min = size <= 0 ? 0 : Math.min(size, 32);
            C14076.m33668(c14076, min);
            for (int i4 = 0; i4 < min; i4++) {
                c22544.f72934.execute(new Runnable() { // from class: l.᩶᩷᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0340.m1773(C14076.this, atomicInteger, arrayList2, c15862, interfaceC8808, c77272);
                    }
                });
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1776(C20803 c20803, C7727 c7727, C15862 c15862, C17274 c17274, String str) {
        Inet4Address inet4Address;
        inet4Address = c17274.f52947;
        m1775(c20803, c7727, c15862, inet4Address, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        r8 = r6.f49029;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (m1781(r2, r8) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r4.m47598() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        m1783(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        r8 = r7.f76557;
        r6 = r6.f49029;
        r6 = m1763(r8, r6).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r6.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r8 = (l.C11961) r6.next();
        r0 = r8.f35826;
        r1 = r8.f35824;
        r3 = r8.f35827;
        r8 = r8.f35825;
        r5.m20704(r0, r1, r3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r4.m47598() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        m1783(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        m1783(r7);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1775(l.C20803 r4, l.C7727 r5, l.C15862 r6, java.net.Inet4Address r7, java.lang.String r8) {
        /*
            l.᩻ۢ᩻ r7 = m1767(r4, r7, r8)
            if (r7 != 0) goto L7
            goto L7c
        L7:
            r1 = 0
            java.lang.Object r0 = l.C0340.f1746     // Catch: java.lang.Throwable -> L85
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L85
            boolean r2 = l.C20803.m47594(r4)     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            m1783(r7)
            return
        L16:
            l.ۜۢ᩻ r2 = new l.ۜۢ᩻     // Catch: java.lang.Throwable -> L82
            l.ۢۢ᩻ r3 = l.C23624.m52114(r7)     // Catch: java.lang.Throwable -> L82
            r2.<init>(r4, r3, r8)     // Catch: java.lang.Throwable -> L82
            l.ۤ᩷᩻ r8 = new l.ۤ᩷᩻     // Catch: java.lang.Throwable -> L7f
            r8.<init>(r2, r5)     // Catch: java.lang.Throwable -> L7f
            l.C6691.m18238(r2, r8)     // Catch: java.lang.Throwable -> L7f
            java.util.ArrayList r8 = l.C20803.m47596(r4)     // Catch: java.lang.Throwable -> L7f
            r8.add(r2)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String[] r8 = l.C15862.m37600(r6)     // Catch: java.lang.Throwable -> L7d
            boolean r8 = m1781(r2, r8)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L43
            boolean r4 = r4.m47598()
            if (r4 == 0) goto L7c
            m1783(r7)
            return
        L43:
            l.ۢۢ᩻ r8 = l.C23624.m52114(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String[] r6 = l.C15862.m37600(r6)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r6 = m1763(r8, r6)     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L7d
        L53:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L73
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L7d
            l.ۨ᩷᩻ r8 = (l.C11961) r8     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = l.C11961.m29238(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = l.C11961.m29236(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = l.C11961.m29239(r8)     // Catch: java.lang.Throwable -> L7d
            l.ۧۢ᩻ r8 = l.C11961.m29237(r8)     // Catch: java.lang.Throwable -> L7d
            r5.m20704(r0, r1, r3, r8)     // Catch: java.lang.Throwable -> L7d
            goto L53
        L73:
            boolean r4 = r4.m47598()
            if (r4 == 0) goto L7c
            m1783(r7)
        L7c:
            return
        L7d:
            r5 = move-exception
            goto L87
        L7f:
            r5 = move-exception
            r1 = r2
            goto L83
        L82:
            r5 = move-exception
        L83:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            throw r5     // Catch: java.lang.Throwable -> L85
        L85:
            r5 = move-exception
            r2 = r1
        L87:
            if (r2 == 0) goto L8f
            boolean r4 = r4.m47598()
            if (r4 == 0) goto L92
        L8f:
            m1783(r7)
        L92:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0340.m1775(l.᩷ۢ᩻, l.۟᩷᩻, l.ܺۢ᩻, java.net.Inet4Address, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23624 m1767(C20803 c20803, InetAddress inetAddress, String str) {
        RunnableC13371 runnableC13371;
        C9514 c9514;
        C23624 c23624;
        boolean z;
        boolean z2;
        Object obj;
        RunnableC13371 runnableC133712;
        int i;
        while (true) {
            Object obj2 = f1746;
            synchronized (obj2) {
                runnableC13371 = null;
                if (c20803.f67343) {
                    return null;
                }
                LinkedHashMap linkedHashMap = f1748;
                C9514 c95142 = (C9514) linkedHashMap.get(str);
                if (c95142 != null) {
                    z = c95142.f28890;
                    if (!z) {
                        z2 = c95142.f28892;
                        if (z2) {
                            try {
                                obj2.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return null;
                            }
                        } else {
                            obj = c95142.f28894;
                            if (obj == null) {
                                runnableC133712 = null;
                            } else {
                                C19392 c19392 = f1749;
                                c95142.f28894 = null;
                                runnableC133712 = new RunnableC13371(c19392, obj);
                            }
                            i = c95142.f28887;
                            c95142.f28887 = i + 1;
                            c23624 = new C23624(c95142);
                            c20803.f67344.add(c23624);
                            c9514 = null;
                            runnableC13371 = runnableC133712;
                        }
                    }
                }
                C9514 c95143 = new C9514(str, inetAddress);
                linkedHashMap.put(str, c95143);
                c9514 = c95143;
                c23624 = null;
            }
            if (runnableC13371 != null) {
                runnableC13371.run();
            }
            if (c23624 != null) {
                return c23624;
            }
            if (c9514 != null) {
                return m1768(c20803, c9514);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23624 m1768(C20803 c20803, C9514 c9514) {
        String str;
        String str2;
        InetAddress inetAddress;
        C17980 c17980;
        C8806 c8806;
        String str3;
        boolean z;
        C23624 c23624;
        RunnableC12666 runnableC12666;
        boolean z2;
        int i;
        Object obj;
        RunnableC13371 runnableC13371;
        try {
            C16568 c16568 = f1747;
            inetAddress = c9514.f28886;
            c16568.getClass();
            if (inetAddress == null) {
                c8806 = new C8806(null);
            } else {
                c8806 = new C8806(inetAddress);
            }
            c17980 = new C17980(c8806);
            Object obj2 = f1746;
            synchronized (obj2) {
                LinkedHashMap linkedHashMap = f1748;
                str3 = c9514.f28893;
                Object obj3 = linkedHashMap.get(str3);
                z = true;
                if (obj3 == c9514) {
                    z2 = c9514.f28890;
                    if (!z2) {
                        c9514.f28889 = c17980;
                        c9514.f28892 = false;
                        obj2.notifyAll();
                        if (!c20803.f67343) {
                            i = c9514.f28887;
                            c9514.f28887 = i + 1;
                            c23624 = new C23624(c9514);
                            c20803.f67344.add(c23624);
                            runnableC12666 = null;
                        } else {
                            C19392 c19392 = f1749;
                            obj = c9514.f28894;
                            if (obj == null) {
                                runnableC13371 = null;
                            } else {
                                c9514.f28894 = null;
                                runnableC13371 = new RunnableC13371(c19392, obj);
                            }
                            Object obj4 = new Object();
                            c9514.f28894 = obj4;
                            runnableC12666 = new RunnableC12666(runnableC13371, c19392, obj4, c9514);
                            c23624 = null;
                        }
                        z = false;
                        obj2.notifyAll();
                    }
                }
                c23624 = null;
                runnableC12666 = null;
                obj2.notifyAll();
            }
            if (runnableC12666 != null) {
                runnableC12666.run();
            }
        } catch (IOException | RuntimeException unused) {
            Object obj5 = f1746;
            synchronized (obj5) {
                LinkedHashMap linkedHashMap2 = f1748;
                str = c9514.f28893;
                if (linkedHashMap2.get(str) == c9514) {
                    str2 = c9514.f28893;
                    linkedHashMap2.remove(str2);
                }
                obj5.notifyAll();
            }
        }
        if (c23624 != null) {
            return c23624;
        }
        if (z) {
            try {
                c17980.m42018();
            } catch (IOException | RuntimeException unused2) {
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1781(C6691 c6691, String[] strArr) {
        LinkedHashSet linkedHashSet;
        C9514 c9514;
        InterfaceC14451 interfaceC14451;
        InterfaceC5900 interfaceC5900;
        C9514 c95142;
        InterfaceC14451 interfaceC144512;
        InterfaceC5900 interfaceC59002;
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            String str = strArr[i];
            if (!m1778(str)) {
                synchronized (f1746) {
                    if (!m1785(c6691)) {
                        m1782(c6691);
                        m1787(c6691);
                        return false;
                    }
                    linkedHashSet = c6691.f20795;
                    linkedHashSet.add(str);
                    try {
                        c95142 = c6691.f20792;
                        interfaceC144512 = c95142.f28889;
                        interfaceC59002 = c6691.f20791;
                        ((C17980) interfaceC144512).m42019(str, interfaceC59002);
                    } catch (RuntimeException unused) {
                        z = false;
                    }
                    boolean m1780 = m1780(c6691, str, z);
                    if (!z || m1780) {
                        try {
                            c9514 = c6691.f20792;
                            interfaceC14451 = c9514.f28889;
                            interfaceC5900 = c6691.f20791;
                            ((C17980) interfaceC14451).m42020(str, interfaceC5900);
                        } catch (RuntimeException unused2) {
                        }
                    }
                    if (!z || m1780) {
                        break;
                    }
                }
            }
            i++;
        }
        m1782(c6691);
        m1787(c6691);
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1780(C6691 c6691, String str, boolean z) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        synchronized (f1746) {
            linkedHashSet = c6691.f20795;
            linkedHashSet.remove(str);
            if (!z) {
                return false;
            }
            if (!m1785(c6691)) {
                return true;
            }
            linkedHashSet2 = c6691.f20793;
            linkedHashSet2.add(str);
            return false;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1782(C6691 c6691) {
        C20803 c20803;
        synchronized (f1746) {
            c6691.f20790 = false;
            c20803 = c6691.f20794;
            c20803.f67345.remove(c6691);
        }
        m1786(c6691);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m1787(C6691 c6691) {
        C20803 c20803;
        C23624 c23624;
        C9514 c9514;
        C9514 c95142;
        synchronized (f1746) {
            c20803 = c6691.f20794;
            Iterator it = c20803.f67344.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c23624 = null;
                    break;
                }
                c23624 = (C23624) it.next();
                c9514 = c23624.f76557;
                c95142 = c6691.f20792;
                if (c9514 == c95142) {
                    break;
                }
            }
        }
        if (c23624 != null) {
            m1783(c23624);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m1786(C6691 c6691) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        LinkedHashSet linkedHashSet3;
        LinkedHashSet linkedHashSet4;
        C9514 c9514;
        InterfaceC14451 interfaceC14451;
        InterfaceC5900 interfaceC5900;
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        synchronized (f1746) {
            linkedHashSet = c6691.f20795;
            linkedHashSet5.addAll(linkedHashSet);
            linkedHashSet2 = c6691.f20793;
            linkedHashSet5.addAll(linkedHashSet2);
            linkedHashSet3 = c6691.f20795;
            linkedHashSet3.clear();
            linkedHashSet4 = c6691.f20793;
            linkedHashSet4.clear();
        }
        Iterator it = linkedHashSet5.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                c9514 = c6691.f20792;
                interfaceC14451 = c9514.f28889;
                interfaceC5900 = c6691.f20791;
                ((C17980) interfaceC14451).m42020(str, interfaceC5900);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2.contains(r1) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: all -> 0x00c5, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0017, B:13:0x0027, B:16:0x0029, B:19:0x003d, B:21:0x007b, B:24:0x0094, B:26:0x009d, B:27:0x00a4, B:29:0x00b4, B:30:0x00c0, B:31:0x00c3, B:33:0x0039), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029 A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0017, B:13:0x0027, B:16:0x0029, B:19:0x003d, B:21:0x007b, B:24:0x0094, B:26:0x009d, B:27:0x00a4, B:29:0x00b4, B:30:0x00c0, B:31:0x00c3, B:33:0x0039), top: B:3:0x0003 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11961 m1766(l.C6691 r13, l.AbstractC12955 r14, l.C10925 r15) {
        /*
            java.lang.Object r0 = l.C0340.f1746
            monitor-enter(r0)
            java.lang.String r1 = r14.mo31524()     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = m1785(r13)     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto L23
            java.util.LinkedHashSet r2 = l.C6691.m18245(r13)     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto L21
            java.util.LinkedHashSet r2 = l.C6691.m18243(r13)     // Catch: java.lang.Throwable -> Lc5
            boolean r1 = r2.contains(r1)     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto L23
        L21:
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r2 = 0
            if (r1 != 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc5
            return r2
        L29:
            java.lang.String r1 = l.C6691.m18246(r13)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = r14.mo31524()     // Catch: java.lang.Throwable -> Lc5
            l.ۤۜ᩵ r4 = r14.mo31523()     // Catch: java.lang.Throwable -> Lc5
            if (r4 != 0) goto L39
            r4 = r2
            goto L3d
        L39:
            java.lang.String r4 = r4.mo25455()     // Catch: java.lang.Throwable -> Lc5
        L3d:
            java.lang.String r5 = r14.getName()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = m1762(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = l.C6691.m18246(r13)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r4 = r14.mo31524()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r5 = r14.getName()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = m1762(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> Lc5
            l.ۨ᩷᩻ r3 = new l.ۨ᩷᩻     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = r14.mo31524()     // Catch: java.lang.Throwable -> Lc5
            l.᩶۫᩷ r14 = l.C0340.f1750     // Catch: java.lang.Throwable -> Lc5
            r14.getClass()     // Catch: java.lang.Throwable -> Lc5
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lc5
            r6 = r3
            r8 = r1
            r9 = r2
            r10 = r15
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lc5
            l.ۢۢ᩻ r14 = l.C6691.m18242(r13)     // Catch: java.lang.Throwable -> Lc5
            java.util.LinkedHashMap r14 = l.C9514.m24382(r14)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r14 = r14.put(r1, r3)     // Catch: java.lang.Throwable -> Lc5
            l.ۨ᩷᩻ r14 = (l.C11961) r14     // Catch: java.lang.Throwable -> Lc5
            if (r14 == 0) goto La4
            l.ۢۢ᩻ r15 = l.C6691.m18242(r13)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r4 = l.C11961.m29236(r14)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r14 = l.C11961.m29238(r14)     // Catch: java.lang.Throwable -> Lc5
            java.util.LinkedHashMap r5 = l.C9514.m24385(r15)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> Lc5
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5     // Catch: java.lang.Throwable -> Lc5
            if (r5 != 0) goto L94
            goto La4
        L94:
            r5.remove(r14)     // Catch: java.lang.Throwable -> Lc5
            boolean r14 = r5.isEmpty()     // Catch: java.lang.Throwable -> Lc5
            if (r14 == 0) goto La4
            java.util.LinkedHashMap r14 = l.C9514.m24385(r15)     // Catch: java.lang.Throwable -> Lc5
            r14.remove(r4)     // Catch: java.lang.Throwable -> Lc5
        La4:
            l.ۢۢ᩻ r13 = l.C6691.m18242(r13)     // Catch: java.lang.Throwable -> Lc5
            java.util.LinkedHashMap r14 = l.C9514.m24385(r13)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r14 = r14.get(r2)     // Catch: java.lang.Throwable -> Lc5
            java.util.LinkedHashSet r14 = (java.util.LinkedHashSet) r14     // Catch: java.lang.Throwable -> Lc5
            if (r14 != 0) goto Lc0
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> Lc5
            r14.<init>()     // Catch: java.lang.Throwable -> Lc5
            java.util.LinkedHashMap r13 = l.C9514.m24385(r13)     // Catch: java.lang.Throwable -> Lc5
            r13.put(r2, r14)     // Catch: java.lang.Throwable -> Lc5
        Lc0:
            r14.add(r1)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc5
            return r3
        Lc5:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc5
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0340.m1766(l.ۜۢ᩻, l.۬ۜ᩵, l.ۧۢ᩻):l.ۨ᩷᩻");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r1.contains(r5) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x0057, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0015, B:12:0x0024, B:15:0x0026, B:17:0x003d, B:18:0x0041, B:20:0x0047, B:22:0x0055), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0015, B:12:0x0024, B:15:0x0026, B:17:0x003d, B:18:0x0041, B:20:0x0047, B:22:0x0055), top: B:3:0x0003 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1779(l.C6691 r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.Object r0 = l.C0340.f1746
            monitor-enter(r0)
            boolean r1 = m1785(r4)     // Catch: java.lang.Throwable -> L57
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            java.util.LinkedHashSet r1 = l.C6691.m18245(r4)     // Catch: java.lang.Throwable -> L57
            boolean r1 = r1.contains(r5)     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L1f
            java.util.LinkedHashSet r1 = l.C6691.m18243(r4)     // Catch: java.lang.Throwable -> L57
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L21
        L1f:
            r5 = 1
            goto L22
        L21:
            r5 = 0
        L22:
            if (r5 != 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            return r2
        L26:
            l.ۢۢ᩻ r5 = l.C6691.m18242(r4)     // Catch: java.lang.Throwable -> L57
            m1772(r5, r6)     // Catch: java.lang.Throwable -> L57
            l.ۢۢ᩻ r5 = l.C6691.m18242(r4)     // Catch: java.lang.Throwable -> L57
            java.util.LinkedHashMap r5 = l.C9514.m24385(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.remove(r7)     // Catch: java.lang.Throwable -> L57
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L55
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L57
        L41:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L55
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L57
            l.ۢۢ᩻ r7 = l.C6691.m18242(r4)     // Catch: java.lang.Throwable -> L57
            m1772(r7, r6)     // Catch: java.lang.Throwable -> L57
            goto L41
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            return r3
        L57:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0340.m1779(l.ۜۢ᩻, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m1763(C9514 c9514, String[] strArr) {
        LinkedHashMap linkedHashMap;
        long j;
        String str;
        String str2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str3 : strArr) {
            if (!m1778(str3)) {
                linkedHashSet.add(str3);
            }
        }
        ArrayList arrayList = new ArrayList();
        f1750.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (f1746) {
            ArrayList arrayList2 = new ArrayList();
            linkedHashMap = c9514.f28888;
            for (C11961 c11961 : linkedHashMap.values()) {
                j = c11961.f35828;
                if (uptimeMillis - j > 120000) {
                    str = c11961.f35826;
                    arrayList2.add(str);
                } else {
                    str2 = c11961.f35827;
                    if (linkedHashSet.contains(str2)) {
                        arrayList.add(c11961);
                    }
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m1772(c9514, (String) it.next());
            }
        }
        return arrayList;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m1785(C6691 c6691) {
        boolean z;
        C20803 c20803;
        C9514 c9514;
        boolean z2;
        C9514 c95142;
        boolean z3;
        C9514 c95143;
        String str;
        C9514 c95144;
        z = c6691.f20790;
        if (!z) {
            return false;
        }
        c20803 = c6691.f20794;
        if (c20803.f67343) {
            return false;
        }
        c9514 = c6691.f20792;
        z2 = c9514.f28892;
        if (z2) {
            return false;
        }
        c95142 = c6691.f20792;
        z3 = c95142.f28890;
        if (z3) {
            return false;
        }
        c95143 = c6691.f20792;
        str = c95143.f28893;
        Object obj = f1748.get(str);
        c95144 = c6691.f20792;
        return obj == c95144;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.۫᩷᩻] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1783(C23624 c23624) {
        boolean z;
        C9514 c9514;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        String str;
        Object obj;
        int i3;
        synchronized (f1746) {
            z = c23624.f76556;
            if (z) {
                return;
            }
            c23624.f76556 = true;
            c9514 = c23624.f76557;
            i = c9514.f28887;
            if (i > 0) {
                i3 = c9514.f28887;
                c9514.f28887 = i3 - 1;
            }
            i2 = c9514.f28887;
            RunnableC13371 runnableC13371 = null;
            if (i2 == 0) {
                z2 = c9514.f28892;
                if (!z2) {
                    z3 = c9514.f28890;
                    if (!z3) {
                        LinkedHashMap linkedHashMap = f1748;
                        str = c9514.f28893;
                        if (linkedHashMap.get(str) == c9514) {
                            C19392 c19392 = f1749;
                            obj = c9514.f28894;
                            if (obj != null) {
                                c9514.f28894 = null;
                                runnableC13371 = new RunnableC13371(c19392, obj);
                            }
                            Object obj2 = new Object();
                            c9514.f28894 = obj2;
                            runnableC13371 = new RunnableC12666(runnableC13371, c19392, obj2, c9514);
                        }
                    }
                }
            }
            if (runnableC13371 != null) {
                runnableC13371.run();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1771(C9514 c9514, Object obj) {
        String str;
        int i;
        Object obj2;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        String str2;
        InterfaceC14451 interfaceC14451;
        Object obj3 = f1746;
        synchronized (obj3) {
            LinkedHashMap linkedHashMap3 = f1748;
            str = c9514.f28893;
            if (linkedHashMap3.get(str) == c9514) {
                i = c9514.f28887;
                if (i == 0) {
                    obj2 = c9514.f28894;
                    if (obj2 == obj) {
                        z = c9514.f28892;
                        if (!z) {
                            z2 = c9514.f28890;
                            if (!z2) {
                                c9514.f28890 = true;
                                c9514.f28894 = null;
                                linkedHashMap = c9514.f28888;
                                linkedHashMap.clear();
                                linkedHashMap2 = c9514.f28891;
                                linkedHashMap2.clear();
                                str2 = c9514.f28893;
                                linkedHashMap3.remove(str2);
                                interfaceC14451 = c9514.f28889;
                                obj3.notifyAll();
                                if (interfaceC14451 == null) {
                                    return;
                                }
                                try {
                                    ((C17980) interfaceC14451).m42018();
                                } catch (IOException | RuntimeException unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1772(C9514 c9514, String str) {
        LinkedHashMap linkedHashMap;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        linkedHashMap = c9514.f28888;
        C11961 c11961 = (C11961) linkedHashMap.remove(str);
        if (c11961 == null) {
            return;
        }
        str2 = c11961.f35824;
        str3 = c11961.f35826;
        linkedHashMap2 = c9514.f28891;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap2.get(str2);
        if (linkedHashSet == null) {
            return;
        }
        linkedHashSet.remove(str3);
        if (linkedHashSet.isEmpty()) {
            linkedHashMap3 = c9514.f28891;
            linkedHashMap3.remove(str2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10925 m1764(AbstractC10134 abstractC10134) {
        String hostAddress;
        int indexOf;
        if (abstractC10134 == null) {
            return null;
        }
        String name = abstractC10134.getName();
        if (name != null && (indexOf = name.indexOf(46)) != -1) {
            name = name.substring(0, indexOf);
        }
        Inet4Address mo25461 = abstractC10134.mo25461();
        if (mo25461 != null) {
            hostAddress = mo25461.getHostAddress();
        } else {
            Inet6Address mo25456 = abstractC10134.mo25456();
            if (mo25456 == null) {
                return null;
            }
            hostAddress = mo25456.getHostAddress();
        }
        if (m1778(name)) {
            name = hostAddress;
        }
        return new C10925(name, abstractC10134.mo25454(), hostAddress, abstractC10134.mo25462());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1773(C14076 c14076, AtomicInteger atomicInteger, ArrayList arrayList, C15862 c15862, InterfaceC8808 interfaceC8808, InterfaceC2458 interfaceC2458) {
        boolean m33673;
        int andIncrement;
        while (true) {
            try {
                m33673 = c14076.m33673();
                if (m33673 || (andIncrement = atomicInteger.getAndIncrement()) >= arrayList.size()) {
                    break;
                }
                C10925 m1765 = m1765(c15862, interfaceC8808, interfaceC2458, (String) arrayList.get(andIncrement));
                if (m1765 != null) {
                    C14076.m33670(c14076, m1765);
                }
            } finally {
                C14076.m33676(c14076);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10925 m1765(C15862 c15862, InterfaceC8808 interfaceC8808, InterfaceC2458 interfaceC2458, String str) {
        int i;
        int i2;
        int i3;
        i = c15862.f49030;
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(InetAddress.getByName(str), i), 800);
                socket.close();
            } finally {
            }
        } catch (IOException unused) {
            if (interfaceC2458 != null) {
                i2 = c15862.f49030;
                ((C7727) interfaceC2458).m20701(i2, str);
            }
        }
        try {
            String mo22769 = interfaceC8808.mo22769(str);
            if (mo22769 != null) {
                i3 = c15862.f49030;
                return new C10925(mo22769, i3, str, mo22769);
            }
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1784(String str) {
        if (m1778(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.equals("lo") || lowerCase.contains("rmnet") || lowerCase.equals("br") || lowerCase.matches("br\\d+") || lowerCase.startsWith("br-") || lowerCase.startsWith("br_") || lowerCase.startsWith("ccmni") || lowerCase.startsWith("pdp") || lowerCase.startsWith("wwan") || lowerCase.startsWith("ppp") || lowerCase.startsWith("dummy") || lowerCase.startsWith("ifb") || lowerCase.startsWith("veth") || lowerCase.startsWith("virbr") || lowerCase.startsWith("docker") || lowerCase.startsWith("vbox") || lowerCase.startsWith("vmnet") || lowerCase.startsWith("sit") || lowerCase.startsWith("ip6tnl") || lowerCase.startsWith("gre") || lowerCase.startsWith("gretap") || lowerCase.startsWith("vti") || lowerCase.startsWith("clat") || lowerCase.startsWith("v4-") || lowerCase.startsWith("tun") || lowerCase.startsWith("tap") || lowerCase.startsWith("utun") || lowerCase.startsWith("vpn") || lowerCase.startsWith("wg") || lowerCase.startsWith("ipsec") || lowerCase.startsWith("l2tp") || lowerCase.startsWith("tailscale") || lowerCase.startsWith("zt");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m1762(String str, String str2, String str3, String str4) {
        if (m1778(str3)) {
            str3 = str4;
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("|");
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m1760(Inet4Address inet4Address) {
        byte[] address = inet4Address.getAddress();
        return ((address[0] & 255) << 24) | ((address[1] & 255) << 16) | ((address[2] & 255) << 8) | (255 & address[3]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1778(String str) {
        return str == null || str.isEmpty();
    }
}
