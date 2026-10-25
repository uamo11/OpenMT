package l;

import java.util.Comparator;
import java.util.HashMap;

/* compiled from: M2AR */
/* renamed from: l.᩺۬ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23011 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f74083;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f74084;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r8.isDirectory() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        if (r8.isDirectory() != false) goto L25;
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
            goto L36
        L12:
            boolean r0 = r8.mo36982()
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            if (r0 == 0) goto L1c
            goto L3d
        L1c:
            boolean r0 = r7.mo36972()
            if (r0 == 0) goto L23
            goto L3d
        L23:
            boolean r0 = r8.mo36972()
            if (r0 == 0) goto L2a
            goto L36
        L2a:
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L37
            boolean r0 = r8.isDirectory()
            if (r0 != 0) goto L3e
        L36:
            return r1
        L37:
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto L3e
        L3d:
            return r2
        L3e:
            long r2 = r7.getSize()
            long r4 = r8.getSize()
            long r2 = r2 - r4
            int r0 = l.C7489.f23073
            r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L54
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            goto L5d
        L54:
            r4 = -1000000000(0xffffffffc4653600, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L5c
            goto L5d
        L5c:
            int r1 = (int) r2
        L5d:
            if (r1 != 0) goto L79
            java.lang.String r7 = r7.getName()
            java.util.HashMap r0 = r6.f74083
            java.lang.Object r7 = r0.get(r7)
            l.ۤ۬ܳ r7 = (l.C10312) r7
            java.lang.String r8 = r8.getName()
            java.lang.Object r8 = r0.get(r8)
            l.ۤ۬ܳ r8 = (l.C10312) r8
            int r1 = r7.compareTo(r8)
        L79:
            boolean r7 = r6.f74084
            if (r7 == 0) goto L7f
            int r7 = -r1
            return r7
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23011.compare(java.lang.Object, java.lang.Object):int");
    }

    public C23011(HashMap hashMap, boolean z) {
        this.f74083 = hashMap;
        this.f74084 = z;
    }
}
