package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: E3QI */
/* renamed from: l.ۧ᩹ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC11291 implements Iterator {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C17577 f33819;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23927 f33820;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC14754 f33821;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f33822 = -1;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f33823;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17577 f33824;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4235 f33825;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AtomicReferenceArray f33826;

    public AbstractC11291(ConcurrentMapC14754 concurrentMapC14754) {
        this.f33821 = concurrentMapC14754;
        this.f33823 = concurrentMapC14754.f45062.length - 1;
        m27903();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27903() {
        this.f33819 = null;
        if (m27906() || m27907()) {
            return;
        }
        while (true) {
            int i = this.f33823;
            if (i < 0) {
                return;
            }
            C4235[] c4235Arr = this.f33821.f45062;
            this.f33823 = i - 1;
            C4235 c4235 = c4235Arr[i];
            this.f33825 = c4235;
            if (c4235.f13743 != 0) {
                this.f33826 = this.f33825.f13737;
                this.f33822 = r0.length() - 1;
                if (m27907()) {
                    return;
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m27906() {
        InterfaceC23927 interfaceC23927 = this.f33820;
        if (interfaceC23927 == null) {
            return false;
        }
        while (true) {
            this.f33820 = interfaceC23927.getNext();
            InterfaceC23927 interfaceC239272 = this.f33820;
            if (interfaceC239272 == null) {
                return false;
            }
            if (m27904(interfaceC239272)) {
                return true;
            }
            interfaceC23927 = this.f33820;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m27907() {
        while (true) {
            int i = this.f33822;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f33826;
            this.f33822 = i - 1;
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(i);
            this.f33820 = interfaceC23927;
            if (interfaceC23927 != null && (m27904(interfaceC23927) || m27906())) {
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        r6.f33819 = new l.C17577(r0, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        r6.f33825.m12759();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        return true;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m27904(l.InterfaceC23927 r7) {
        /*
            r6 = this;
            l.ܳ᩶ܺ r0 = r6.f33821
            l.ᩳ᩸ܺ r1 = r0.f45061     // Catch: java.lang.Throwable -> L3e
            long r1 = r1.mo39766()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r7.getKey()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r7.getKey()     // Catch: java.lang.Throwable -> L3e
            r5 = 0
            if (r4 != 0) goto L14
            goto L27
        L14:
            l.ۗ᩹ܺ r4 = r7.mo17644()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L1f
            goto L27
        L1f:
            boolean r7 = r0.m35062(r7, r1)     // Catch: java.lang.Throwable -> L3e
            if (r7 == 0) goto L26
            goto L27
        L26:
            r5 = r4
        L27:
            if (r5 == 0) goto L37
            l.ܿ᩶ܺ r7 = new l.ܿ᩶ܺ     // Catch: java.lang.Throwable -> L3e
            r7.<init>(r0, r3, r5)     // Catch: java.lang.Throwable -> L3e
            r6.f33819 = r7     // Catch: java.lang.Throwable -> L3e
            l.ۘ᩹ܺ r7 = r6.f33825
            r7.m12759()
            r7 = 1
            return r7
        L37:
            l.ۘ᩹ܺ r7 = r6.f33825
            r7.m12759()
            r7 = 0
            return r7
        L3e:
            r7 = move-exception
            l.ۘ᩹ܺ r0 = r6.f33825
            r0.m12759()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC11291.m27904(l.᩻᩶ܺ):boolean");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33819 != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17577 m27905() {
        C17577 c17577 = this.f33819;
        if (c17577 == null) {
            throw new NoSuchElementException();
        }
        this.f33824 = c17577;
        m27903();
        return this.f33824;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C4025.m12116(this.f33824 != null);
        this.f33821.remove(this.f33824.f53724);
        this.f33824 = null;
    }

    @Override // java.util.Iterator
    public Object next() {
        return m27905();
    }
}
