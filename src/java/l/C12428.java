package l;

import java.util.Comparator;
import java.util.HashMap;

/* compiled from: M2AR */
/* renamed from: l.۫۬ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12428 implements Comparator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f37419;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f37420;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f37421;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r8.isDirectory() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r8.isDirectory() != false) goto L27;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            l.ᩳۜܳ r7 = (l.InterfaceC17889) r7
            l.ᩳۜܳ r8 = (l.InterfaceC17889) r8
            if (r7 != r8) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.mo36982()
            r1 = -1000000000(0xffffffffc4653600, float:-916.84375)
            if (r0 == 0) goto L12
            goto L3a
        L12:
            boolean r0 = r8.mo36982()
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            if (r0 == 0) goto L1c
            goto L41
        L1c:
            boolean r0 = r7.mo36972()
            if (r0 == 0) goto L23
            goto L41
        L23:
            boolean r0 = r8.mo36972()
            if (r0 == 0) goto L2a
            goto L3a
        L2a:
            boolean r0 = r6.f37420
            if (r0 == 0) goto L42
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L3b
            boolean r0 = r8.isDirectory()
            if (r0 != 0) goto L42
        L3a:
            return r1
        L3b:
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto L42
        L41:
            return r2
        L42:
            long r2 = r7.getTime()
            long r4 = r8.getTime()
            long r2 = r2 - r4
            int r0 = l.C7489.f23073
            r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L58
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            goto L61
        L58:
            r4 = -1000000000(0xffffffffc4653600, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L60
            goto L61
        L60:
            int r1 = (int) r2
        L61:
            if (r1 != 0) goto L7d
            java.lang.String r7 = r7.getName()
            java.util.HashMap r0 = r6.f37421
            java.lang.Object r7 = r0.get(r7)
            l.ۤ۬ܳ r7 = (l.C10312) r7
            java.lang.String r8 = r8.getName()
            java.lang.Object r8 = r0.get(r8)
            l.ۤ۬ܳ r8 = (l.C10312) r8
            int r1 = r7.compareTo(r8)
        L7d:
            boolean r7 = r6.f37419
            if (r7 == 0) goto L83
            int r7 = -r1
            return r7
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12428.compare(java.lang.Object, java.lang.Object):int");
    }

    public C12428(HashMap hashMap, boolean z, boolean z2) {
        this.f37421 = hashMap;
        this.f37419 = z;
        this.f37420 = z2;
    }
}
