package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BAIG */
/* renamed from: l.᩷ۜ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20720 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f66716;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f66723;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f66726;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f66727;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f66717 = new AtomicInteger();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f66725 = new AtomicInteger();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f66722 = new AtomicInteger();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f66721 = new AtomicInteger();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f66724 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66720 = true;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f66719 = true;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f66718 = true;

    public C20720(AbstractC3163 abstractC3163, InterfaceC17066 interfaceC17066) {
        this.f66727 = abstractC3163;
        this.f66716 = interfaceC17066;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47322() {
        this.f66726 = this.f66718;
        this.f66723 = new ArrayList();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47324(boolean z) {
        this.f66719 = z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47326(boolean z) {
        this.f66718 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47325(String[] strArr, C18912 c18912) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            InterfaceC17889 mo7638 = this.f66727.mo7638(str);
            if (mo7638 != null) {
                arrayList.add(mo7638);
            }
        }
        m47323(arrayList, c18912);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        r0 = ((java.util.List) r8.getOrDefault(r9.get(r1), null)).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r0.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        r7.f66724.put((l.C6608) r0.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        r1 = r1 - 1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m47323(java.util.List r8, l.InterfaceC23541 r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20720.m47323(java.util.List, l.᩻ۜ᩻):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47320(C20720 c20720, InterfaceC23541 interfaceC23541) {
        AtomicInteger atomicInteger = c20720.f66721;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C6608 m47321 = c20720.m47321();
                if (m47321 == null) {
                    break;
                } else {
                    interfaceC23541.mo14971(m47321, c20720.f66725.incrementAndGet(), c20720.f66717.get());
                }
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
        if (c20720.f66716.mo1526()) {
            c20720.f66724.clear();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C6608 m47321() {
        this.f66722.incrementAndGet();
        do {
            try {
                if (this.f66716.mo1526()) {
                    break;
                }
                try {
                    C6608 c6608 = (C6608) this.f66724.poll(200L, TimeUnit.MILLISECONDS);
                    if (c6608 != null) {
                        return c6608;
                    }
                } catch (InterruptedException unused) {
                }
            } finally {
                this.f66722.decrementAndGet();
            }
        } while (this.f66720);
        this.f66722.decrementAndGet();
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47319(InterfaceC17889 interfaceC17889, String str) {
        InterfaceC17066 interfaceC17066 = this.f66716;
        if (interfaceC17066.mo1526()) {
            return;
        }
        String name = interfaceC17889.getName();
        String path = interfaceC17889.getPath();
        if (!str.isEmpty()) {
            name = C22870.m50967(str, "/", name);
        }
        boolean isDirectory = interfaceC17889.isDirectory();
        LinkedBlockingQueue linkedBlockingQueue = this.f66724;
        AtomicInteger atomicInteger = this.f66717;
        if (!isDirectory) {
            if (this.f66719 || str.isEmpty()) {
                atomicInteger.incrementAndGet();
                linkedBlockingQueue.put(new C6608(path, name, true));
                return;
            }
            return;
        }
        if ((this.f66719 || this.f66718) && !interfaceC17889.mo36978()) {
            Iterator it = this.f66727.mo7637(path, true).iterator();
            while (it.hasNext()) {
                m47319((InterfaceC17889) it.next(), name);
            }
            if (interfaceC17066.mo1526()) {
                return;
            }
        }
        if (this.f66718 || str.isEmpty()) {
            atomicInteger.incrementAndGet();
            if (this.f66726) {
                this.f66723.add(new C6608(path, name, false));
            } else {
                linkedBlockingQueue.put(new C6608(path, name, false));
            }
        }
    }
}
