package l;

import android.net.wifi.WifiManager;
import android.widget.TextView;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: W79N */
/* renamed from: l.ܰ᩷᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14076 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f42503;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public WifiManager.MulticastLock f42505;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5242 f42504 = new C5242();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f42506 = new LinkedHashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f42502 = new LinkedHashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f42501 = new AtomicInteger();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m33665(String str) {
        if (this.f42506.remove(str) != null) {
            m33675();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m33666(String str, C10925 c10925) {
        this.f42506.put(str, c10925);
        m33675();
    }

    public C14076(DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f42503 = new WeakReference(dialogInterfaceC0206);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33669(C14076 c14076, AbstractActivityC3346 abstractActivityC3346) {
        try {
            WifiManager wifiManager = (WifiManager) abstractActivityC3346.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                return;
            }
            WifiManager.MulticastLock createMulticastLock = wifiManager.createMulticastLock(abstractActivityC3346.getPackageName() + ":NetworkServiceScanner");
            createMulticastLock.setReferenceCounted(false);
            createMulticastLock.acquire();
            c14076.f42505 = createMulticastLock;
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m33677(C14076 c14076) {
        WifiManager.MulticastLock multicastLock = c14076.f42505;
        c14076.f42505 = null;
        if (multicastLock == null || !multicastLock.isHeld()) {
            return;
        }
        try {
            multicastLock.release();
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33672(C14076 c14076, C20803 c20803, String str, C10925 c10925) {
        synchronized (c14076) {
            if (!c20803.m47598() && !c14076.m33673()) {
                c14076.m33666(str, c10925);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33671(C14076 c14076, C20803 c20803, String str) {
        synchronized (c14076) {
            if (!c20803.m47598() && !c14076.m33673()) {
                c14076.m33665(str);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33670(C14076 c14076, C10925 c10925) {
        String str;
        String str2;
        synchronized (c14076) {
            LinkedHashMap linkedHashMap = c14076.f42502;
            str = c10925.f32831;
            if (!linkedHashMap.containsKey(str)) {
                LinkedHashMap linkedHashMap2 = c14076.f42502;
                str2 = c10925.f32831;
                linkedHashMap2.put(str2, c10925);
                c14076.m33675();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m33675() {
        String str;
        String str2;
        Collection<C10925> values = this.f42506.values();
        Collection<C10925> values2 = this.f42502.values();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10925 c10925 : values) {
            str2 = c10925.f32831;
            if (linkedHashSet.add(str2)) {
                arrayList.add(c10925);
            }
        }
        for (C10925 c109252 : values2) {
            str = c109252.f32831;
            if (linkedHashSet.add(str)) {
                arrayList.add(c109252);
            }
        }
        this.f42504.mo1664(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m33673() {
        DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) this.f42503.get();
        return dialogInterfaceC0206 == null || !dialogInterfaceC0206.m1442();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m33676(C14076 c14076) {
        if (c14076.f42501.decrementAndGet() == 0) {
            C4925.m14315(new RunnableC23249(c14076));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33668(C14076 c14076, int i) {
        if (i != 0) {
            c14076.f42501.set(i);
        } else {
            C4925.m14315(new RunnableC23249(c14076));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33667(C14076 c14076) {
        TextView textView;
        DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) c14076.f42503.get();
        if (dialogInterfaceC0206 == null || !dialogInterfaceC0206.m1442() || (textView = (TextView) dialogInterfaceC0206.m1433(R.id.MT_Protector_res_0x7f0a0631)) == null) {
            return;
        }
        textView.setText(R.string.MT_Protector_res_0x7f1208d3);
    }
}
