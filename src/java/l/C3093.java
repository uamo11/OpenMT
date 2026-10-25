package l;

import java.util.Iterator;

/* compiled from: 17NL */
/* renamed from: l.ۗ۟ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3093 implements Iterator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f9668;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9669 = 0;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9670 = 0;

    public C3093(String str) {
        this.f9668 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9669 != -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r1 = r6.f9670 + 1;
        r6.f9670 = r1;
        r6.f9669 = r1;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object next() {
        /*
            r6 = this;
            int r0 = r6.f9669
            r1 = -1
            if (r0 == r1) goto L4e
        L5:
            int r2 = r6.f9670
            java.lang.String r3 = r6.f9668
            int r4 = r3.length()
            if (r2 >= r4) goto L47
            int r2 = r6.f9670
            char r2 = r3.charAt(r2)
            r4 = 10
            if (r2 == r4) goto L3e
            r5 = 13
            if (r2 == r5) goto L24
            int r2 = r6.f9670
            int r2 = r2 + 1
            r6.f9670 = r2
            goto L5
        L24:
            int r1 = r6.f9670
            int r1 = r1 + 1
            int r2 = r3.length()
            if (r1 >= r2) goto L3e
            int r1 = r6.f9670
            int r1 = r1 + 1
            char r1 = r3.charAt(r1)
            if (r1 != r4) goto L3e
            int r1 = r6.f9670
            int r1 = r1 + 1
            r6.f9670 = r1
        L3e:
            int r1 = r6.f9670
            int r1 = r1 + 1
            r6.f9670 = r1
            r6.f9669 = r1
            goto L49
        L47:
            r6.f9669 = r1
        L49:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L4e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3093.next():java.lang.Object");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
