package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: 67L9 */
/* renamed from: l.ۤᩴ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10469 implements Iterator {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6235 f31417;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC21101 f31419;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Set f31421 = null;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Iterator f31418 = Arrays.asList(EnumC21101.MODULE_SOURCE_PATH, EnumC21101.UPGRADE_MODULE_PATH, EnumC21101.SYSTEM_MODULES, EnumC21101.MODULE_PATH).iterator();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f31420 = null;

    public C10469(C6235 c6235) {
        this.f31417 = c6235;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        r4.f31421 = (java.util.Set) r4.f31420.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r4.f31420.hasNext() == false) goto L29;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r4 = this;
        L0:
            java.util.Set r0 = r4.f31421
            if (r0 != 0) goto L66
        L4:
            java.util.Iterator r0 = r4.f31420
            if (r0 == 0) goto L22
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lf
            goto L22
        Lf:
            java.util.Iterator r0 = r4.f31420
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L0
            java.util.Iterator r0 = r4.f31420
            java.lang.Object r0 = r0.next()
            java.util.Set r0 = (java.util.Set) r0
            r4.f31421 = r0
            goto L0
        L22:
            java.util.Iterator r0 = r4.f31418
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r0 = r0.next()
            l.᩷᩶۠ r0 = (l.EnumC21101) r0
            r4.f31419 = r0
            l.ۛᩴ֨ r0 = r4.f31417     // Catch: java.io.IOException -> L45
            l.ۧ᩶۠ r0 = l.C6235.m17166(r0)     // Catch: java.io.IOException -> L45
            l.᩷᩶۠ r1 = r4.f31419     // Catch: java.io.IOException -> L45
            java.lang.Iterable r0 = r0.mo1713(r1)     // Catch: java.io.IOException -> L45
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L45
            r4.f31420 = r0     // Catch: java.io.IOException -> L45
            goto L4
        L45:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error listing module locations for "
            r2.<init>(r3)
            l.᩷᩶۠ r3 = r4.f31419
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            goto L4
        L64:
            r0 = 0
            return r0
        L66:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10469.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final Object next() {
        hasNext();
        Set set = this.f31421;
        if (set != null) {
            this.f31421 = null;
            return set;
        }
        throw new NoSuchElementException();
    }
}
