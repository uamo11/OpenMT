package l;

import bin.mt.plus.Features;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: T7BL */
/* renamed from: l.ۘܽ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4074 extends AbstractC20250 {

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12935 = 0;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f12939;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f12944;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f12945;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12936 = new AtomicInteger();

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12940 = new AtomicInteger();

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12941 = new AtomicInteger();

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12946 = new AtomicInteger();

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f12938 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f12943 = new ArrayList();

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12942 = new LinkedHashSet();

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12937 = new LinkedHashSet();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized void m12241(C17222 c17222) {
        if (this.f12939) {
            return;
        }
        this.f12939 = true;
        C8381 m21977 = C8381.m21977();
        String m11556 = m11556("remoteTaskId");
        ArrayList m12240 = m12240();
        ArrayList m12238 = m12238();
        List list = Collections.EMPTY_LIST;
        m21977.m21984(m11556, this, c17222, m12240, m12238, list, list);
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private synchronized void m12242(String str) {
        String m43784 = C18965.m43784(str);
        this.f12942.add(m43784);
        this.f12937.add(C18965.m43780(m43784));
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
    }

    @Override // l.AbstractC20250
    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final String mo12244() {
        return "";
    }

    @Override // l.AbstractC3817
    /* renamed from: ܺ */
    public final AbstractActivityC3346 mo11549() {
        return null;
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩹֫ */
    public final boolean mo11562() {
        return false;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76971;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a27, m11531("deleteFrom"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        String m11556 = m11556("remoteTaskId");
        C8381 m21977 = C8381.m21977();
        m21977.m21985(m11556, this, (C18891) null);
        m11536(m11552("recycle") ? R.string.MT_Protector_res_0x7f12063d : R.string.MT_Protector_res_0x7f12087c);
        mo11520("...");
        m21977.m21983(m11556, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x014e, code lost:
    
        r1 = (java.util.List) r0.getOrDefault(r3.get(r4), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0159, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015c, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0164, code lost:
    
        if (r1.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0166, code lost:
    
        r11.f12938.put((l.C2663) r1.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0172, code lost:
    
        r4 = r4 - 1;
     */
    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C17222 mo2780() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4074.mo2780():l.ܿ۠ۢ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12236(C4074 c4074, int i) {
        AtomicInteger atomicInteger = c4074.f12946;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C2663 m12243 = c4074.m12243();
                if (m12243 == null) {
                    return;
                }
                EnumC16580 enumC16580 = m12243.f8366;
                c4074.mo11520(m12243.f8367);
                c4074.m11541(c4074.f12940.incrementAndGet(), Math.max(c4074.f12936.get(), i));
                AbstractC15440 abstractC15440 = m12243.f8365;
                String m43784 = C18965.m43784(abstractC15440.mo23554());
                if (c4074.f12945 && abstractC15440.mo36530()) {
                    boolean deleteFile = Features.deleteFile(abstractC15440.mo23554());
                    if (!abstractC15440.mo23120()) {
                        c4074.m12242(m43784);
                    }
                    if (deleteFile) {
                        enumC16580.m39085(abstractC15440.mo23554());
                    }
                } else {
                    if (!abstractC15440.mo27929() && abstractC15440.mo23120()) {
                        abstractC15440.mo23552();
                    }
                    if (!abstractC15440.mo23120()) {
                        c4074.m12242(m43784);
                        enumC16580.m39085(abstractC15440.mo23554());
                    }
                }
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ܶ */
    public final void mo11546(String str) {
        super.mo11546(str);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo11520(CharSequence charSequence) {
        super.mo11520(charSequence);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final void mo11538(int i) {
        super.mo11538(i);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
        C9068.m23429();
        m12241(c17222);
    }

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m12240() {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f12937);
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
            if (m39866.mo23120() && m39866.mo23113()) {
                linkedHashSet2.add(str);
            }
        }
        return new ArrayList(linkedHashSet2);
    }

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m12238() {
        LinkedHashSet linkedHashSet;
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f12942);
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1493[] m12239(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (String str : strArr) {
            linkedHashSet.add(C18965.m43780(C18965.m43784(str)));
        }
        C1493[] c1493Arr = new C1493[linkedHashSet.size()];
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c1493Arr[i] = C1493.m5161((String) it.next(), EnumC16309.MODIFY_DIRECTORY);
            i++;
        }
        return c1493Arr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12237(AbstractC15440 abstractC15440, String str) {
        String sb;
        if (mo1526()) {
            return;
        }
        if (str.isEmpty()) {
            sb = abstractC15440.getName();
        } else {
            StringBuilder m19190 = C7166.m19190(str, "/");
            m19190.append(abstractC15440.getName());
            sb = m19190.toString();
        }
        boolean mo23113 = abstractC15440.mo23113();
        LinkedBlockingQueue linkedBlockingQueue = this.f12938;
        AtomicInteger atomicInteger = this.f12936;
        if (!mo23113 || abstractC15440.m36533()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C2663(abstractC15440, sb, EnumC16580.EXACT));
            return;
        }
        if (abstractC15440.mo27933()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C2663(abstractC15440, sb, EnumC16580.TREE));
            return;
        }
        if (this.f12945 && abstractC15440.mo36530()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C2663(abstractC15440, sb, EnumC16580.TREE));
            return;
        }
        Iterator it = abstractC15440.mo23549(true).iterator();
        while (it.hasNext()) {
            m12237((AbstractC15440) it.next(), sb);
        }
        if (mo1526()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f12943.add(new C2663(abstractC15440, sb, EnumC16580.NONE));
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final C17222 mo3144(Exception exc) {
        C17222 m40517 = C17222.m40517(exc);
        m12241(m40517);
        return m40517;
    }

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    private C2663 m12243() {
        this.f12941.incrementAndGet();
        do {
            try {
                if (mo1526()) {
                    break;
                }
                try {
                    C2663 c2663 = (C2663) this.f12938.poll(200L, TimeUnit.MILLISECONDS);
                    if (c2663 != null) {
                        return c2663;
                    }
                } catch (InterruptedException unused) {
                }
            } finally {
                this.f12941.decrementAndGet();
            }
        } while (this.f12944);
        this.f12941.decrementAndGet();
        return null;
    }
}
