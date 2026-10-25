package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: N6VA */
/* renamed from: l.᩹ۖܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22002 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f70515;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Executor f70523;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f70525;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20798 f70526;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11440 f70527;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC21297 f70529;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f70531;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70522 = new ArrayList();

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f70518 = new ConcurrentLinkedQueue();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile int f70520 = Integer.MAX_VALUE;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f70521 = 1;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f70517 = -1;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f70528 = -1;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile long f70514 = -1;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile long f70530 = -1;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f70519 = -1;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f70516 = -1;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f70524 = Collections.EMPTY_LIST;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m49501(C22002 c22002, int i, int i2, RunnableC7890 runnableC7890) {
        c22002.getClass();
        int i3 = runnableC7890.f24447;
        if (i3 > i) {
            return false;
        }
        if (runnableC7890.f24443 && runnableC7890.f24442 <= i2 && i2 < i3) {
            if (!runnableC7890.f24446) {
                return false;
            }
            c22002.f70516 = runnableC7890.f24442;
            c22002.f70524 = runnableC7890.f24439;
        }
        runnableC7890.m21179();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49502(C22002 c22002, int i, RunnableC7890 runnableC7890) {
        c22002.getClass();
        if (!runnableC7890.f24443) {
            int i2 = runnableC7890.f24442;
            C11003.checkIndex(i, c22002.f70526.f67332.f74675);
            if (i2 != ((int) (i * r3.f74676))) {
                return false;
            }
        }
        runnableC7890.m21179();
        return true;
    }

    public C22002(C20798 c20798, Executor executor, InterfaceC17066 interfaceC17066, C11440 c11440) {
        this.f70526 = c20798;
        this.f70523 = executor;
        this.f70515 = interfaceC17066;
        this.f70527 = c11440;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e6, code lost:
    
        r1.m21180();
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m49516(final int r14, int r15) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22002.m49516(int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49497(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i < 0 || i >= i2 || i2 > this.f70526.f67335) {
            return;
        }
        int min = (int) Math.min(i2, i + 65536);
        int min2 = Math.min(10000, (65536 - (min - i)) / 2);
        int i3 = min2 / 2;
        int max = Math.max(0, i - i3);
        long j2 = min;
        int min3 = (int) Math.min(this.f70526.f67335, i3 + j2);
        long j3 = this.f70514;
        if (j3 == -1 || ((int) (j3 >>> 32)) > max || min3 > ((int) j3)) {
            int max2 = Math.max(0, i - min2);
            int min4 = (int) Math.min(this.f70526.f67335, j2 + min2);
            synchronized (this.f70522) {
                this.f70514 = (min4 & 4294967295L) | (max2 << 32);
                this.f70531 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m49498(List list, long j, InterfaceC17066 interfaceC17066) {
        C13035 c13035;
        C23097 c23097;
        int i;
        Iterator it;
        synchronized (this.f70522) {
            if (!this.f70525 && this.f70514 == j && (this.f70519 != j || this.f70531 != list)) {
                C23097 c230972 = this.f70526.f67334;
                int i2 = (int) (j >>> 32);
                int i3 = (int) j;
                if (!list.isEmpty()) {
                    int max = Math.max(i2, ((C14945) list.get(0)).f45550);
                    int min = (int) Math.min(Math.min(i3, ((C14945) C7166.m19188(1, list)).f45549), max + 65536);
                    if (max < min) {
                        C9302 m23868 = C9302.m23868(min - max, c230972.f74319, false);
                        C10008 c10008 = c230972.m51276() ? null : new C10008(m23868, c230972.f74319, max);
                        long nanoTime = System.nanoTime();
                        Iterator it2 = list.iterator();
                        int i4 = 0;
                        loop0: while (true) {
                            if (it2.hasNext()) {
                                C14945 c14945 = (C14945) it2.next();
                                if (c230972.m51276()) {
                                    int max2 = Math.max(max, c14945.f45550);
                                    c23097 = c230972;
                                    int min2 = Math.min(min, c14945.f45549);
                                    if (max2 < min2) {
                                        i = min;
                                        it = it2;
                                        int i5 = i4;
                                        C9302 c9302 = c14945.f45548;
                                        int i6 = c14945.f45550;
                                        m23868 = m23868.m23881(max2 - max, min2 - max, c9302.m23886(max2 - i6, min2 - i6));
                                        i4 = i5;
                                    } else {
                                        i = min;
                                        it = it2;
                                    }
                                } else {
                                    c23097 = c230972;
                                    i = min;
                                    it = it2;
                                    Iterator it3 = c14945.f45552.iterator();
                                    while (it3.hasNext()) {
                                        C12829 m25175 = c10008.m25175((C5774) it3.next());
                                        do {
                                            i4++;
                                            if (i4 > 65536 || ((i4 & 255) == 0 && (m49503(this, interfaceC17066, j) || System.nanoTime() - nanoTime > 8000000))) {
                                                break loop0;
                                            } else if (m25175 == null) {
                                                break;
                                            }
                                        } while (!m25175.m31205());
                                        if (m25175 != null) {
                                            c10008.m25177(m25175);
                                        }
                                    }
                                }
                                c230972 = c23097;
                                min = i;
                                it2 = it;
                            } else {
                                if (c10008 != null) {
                                    m23868 = c10008.m25174();
                                }
                                C16356 c16356 = new C16356();
                                m23868.getClass();
                                C17768 c17768 = new C17768();
                                c17768.m41620(m23868);
                                while (c17768.m41625()) {
                                    C21834 m41624 = c17768.m41624();
                                    c16356.m38503(c17768.m41619() - c17768.m41622(), new C21834(null, m41624.m49210(), 0, m41624.m49212(), 0, 0), false);
                                }
                                if (!m49503(this, interfaceC17066, j)) {
                                    c13035 = new C13035(max, c16356.m38502());
                                }
                            }
                        }
                    }
                }
                c13035 = null;
                if (c13035 != null) {
                    this.f70530 = j;
                    C15130 c15130 = (C15130) this.f70529;
                    C16747.m39395(c15130.f46250, c15130.f46251, c13035);
                } else {
                    if (interfaceC17066.mo1526() || !this.f70526.m47593()) {
                        return;
                    }
                    synchronized (this.f70522) {
                        if (!this.f70525 && this.f70514 == j) {
                            this.f70519 = j;
                            this.f70531 = list;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m49503(C22002 c22002, InterfaceC17066 interfaceC17066, long j) {
        return c22002.f70525 || interfaceC17066.mo1526() || !c22002.f70526.m47593() || c22002.f70514 != j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14945 m49514(int i) {
        C14945 c14945 = null;
        if (this.f70525 || i < this.f70520) {
            return null;
        }
        synchronized (this.f70522) {
            Iterator it = this.f70522.iterator();
            int i2 = Integer.MAX_VALUE;
            while (it.hasNext()) {
                RunnableC7890 runnableC7890 = (RunnableC7890) it.next();
                if (!runnableC7890.f24443) {
                    for (C14945 c149452 : runnableC7890.f24439) {
                        int i3 = c149452.f45550;
                        if (i3 == i) {
                            c14945 = c149452;
                        }
                        if (i3 > i) {
                            i2 = Math.min(i2, i3);
                        }
                    }
                }
            }
            this.f70520 = i2;
        }
        return c14945;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49515() {
        this.f70525 = true;
        synchronized (this.f70522) {
            Iterator it = this.f70522.iterator();
            while (it.hasNext()) {
                ((RunnableC7890) it.next()).m21179();
            }
            this.f70522.clear();
            this.f70524 = Collections.EMPTY_LIST;
            this.f70516 = -1;
            this.f70531 = null;
        }
        m49507();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m49507() {
        while (true) {
            C7744 c7744 = (C7744) this.f70518.poll();
            if (c7744 == null) {
                return;
            } else {
                try {
                    c7744.close();
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
