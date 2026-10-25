package l;

import bin.mt.plus.Features;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Q28R */
/* renamed from: l.۬᩺ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13425 extends AbstractC6138 {

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40110 = 0;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f40116;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40115 = new AtomicInteger();

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40114 = new AtomicInteger();

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40112 = new AtomicInteger();

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40118 = new AtomicInteger();

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public LinkedBlockingQueue f40117 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f40113 = new ArrayList();

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f40111 = false;

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        r1 = ((java.util.List) r0.getOrDefault(r3.get(r4), null)).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0163, code lost:
    
        if (r1.hasNext() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0165, code lost:
    
        r10.f40117.put((l.C22598) r1.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0171, code lost:
    
        r4 = r4 - 1;
     */
    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.C17222 mo2780() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13425.mo2780():l.ܿ۠ۢ");
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
        m11536(m11552("recycle") ? R.string.MT_Protector_res_0x7f12063d : R.string.MT_Protector_res_0x7f12087c);
        mo11520("...");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32441(C13425 c13425, int i) {
        AtomicInteger atomicInteger = c13425.f40118;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C22598 m32443 = c13425.m32443();
                if (m32443 == null) {
                    return;
                }
                EnumC16580 enumC16580 = m32443.f73044;
                c13425.mo11520(m32443.f73045);
                c13425.m11541(c13425.f40114.incrementAndGet(), Math.max(c13425.f40115.get(), i));
                AbstractC15440 abstractC15440 = m32443.f73043;
                if (c13425.f40111 && abstractC15440.mo36530()) {
                    if (Features.deleteFile(abstractC15440.mo23554())) {
                        enumC16580.m39085(abstractC15440.mo23554());
                    }
                } else {
                    boolean mo27929 = abstractC15440.mo27929();
                    if (!mo27929) {
                        mo27929 = abstractC15440.mo23120() ? abstractC15440.mo23552() : true;
                    }
                    if (mo27929) {
                        enumC16580.m39085(abstractC15440.mo23554());
                    }
                }
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32442(AbstractC15440 abstractC15440, String str) {
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
        LinkedBlockingQueue linkedBlockingQueue = this.f40117;
        AtomicInteger atomicInteger = this.f40115;
        if (!mo23113 || abstractC15440.m36533()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C22598(abstractC15440, sb, EnumC16580.EXACT));
            return;
        }
        if (abstractC15440.mo27933()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C22598(abstractC15440, sb, EnumC16580.TREE));
            return;
        }
        if (this.f40111 && abstractC15440.mo36530()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C22598(abstractC15440, sb, EnumC16580.TREE));
            return;
        }
        Iterator it = abstractC15440.mo23549(true).iterator();
        while (it.hasNext()) {
            m32442((AbstractC15440) it.next(), sb);
        }
        if (mo1526()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f40113.add(new C22598(abstractC15440, sb, EnumC16580.NONE));
    }

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    private C22598 m32443() {
        this.f40112.incrementAndGet();
        do {
            try {
                if (mo1526()) {
                    break;
                }
                try {
                    C22598 c22598 = (C22598) this.f40117.poll(200L, TimeUnit.MILLISECONDS);
                    if (c22598 != null) {
                        return c22598;
                    }
                } catch (InterruptedException unused) {
                }
            } finally {
                this.f40112.decrementAndGet();
            }
        } while (this.f40116);
        this.f40112.decrementAndGet();
        return null;
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
        C9068.m23429();
    }
}
