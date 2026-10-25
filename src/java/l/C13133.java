package l;

import java.util.Comparator;
import java.util.HashMap;

/* compiled from: M2AR */
/* renamed from: l.۬۬ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13133 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f39280;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f39281;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r6.isDirectory() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003b, code lost:
    
        if (r6.isDirectory() != false) goto L25;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            l.ᩳۜܳ r5 = (l.InterfaceC17889) r5
            l.ᩳۜܳ r6 = (l.InterfaceC17889) r6
            if (r5 != r6) goto L8
            r5 = 0
            return r5
        L8:
            boolean r0 = r5.mo36982()
            r1 = -1000000000(0xffffffffc4653600, float:-916.84375)
            if (r0 == 0) goto L12
            goto L36
        L12:
            boolean r0 = r6.mo36982()
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            if (r0 == 0) goto L1c
            goto L3d
        L1c:
            boolean r0 = r5.mo36972()
            if (r0 == 0) goto L23
            goto L3d
        L23:
            boolean r0 = r6.mo36972()
            if (r0 == 0) goto L2a
            goto L36
        L2a:
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L37
            boolean r0 = r6.isDirectory()
            if (r0 != 0) goto L3e
        L36:
            return r1
        L37:
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L3e
        L3d:
            return r2
        L3e:
            boolean r0 = r5.isDirectory()
            java.util.HashMap r2 = r4.f39280
            if (r0 != 0) goto L7c
            java.lang.String r0 = r5.getName()
            boolean r0 = m31851(r0)
            java.lang.String r3 = r6.getName()
            boolean r3 = m31851(r3)
            if (r0 == 0) goto L5b
            if (r3 != 0) goto L5b
            goto L94
        L5b:
            if (r0 != 0) goto L63
            if (r3 == 0) goto L63
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            goto L94
        L63:
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r2.get(r5)
            l.ۤ۬ܳ r5 = (l.C10312) r5
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r2.get(r6)
            l.ۤ۬ܳ r6 = (l.C10312) r6
            int r1 = r5.compareTo(r6)
            goto L94
        L7c:
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r2.get(r5)
            l.ۤ۬ܳ r5 = (l.C10312) r5
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r2.get(r6)
            l.ۤ۬ܳ r6 = (l.C10312) r6
            int r1 = r5.compareTo(r6)
        L94:
            boolean r5 = r4.f39281
            if (r5 == 0) goto L9a
            int r5 = -r1
            return r5
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13133.compare(java.lang.Object, java.lang.Object):int");
    }

    public C13133(HashMap hashMap, boolean z) {
        this.f39280 = hashMap;
        this.f39281 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31851(String str) {
        if (str.equals("AndroidManifest.xml") || str.equals("resources.arsc")) {
            return true;
        }
        if (!str.startsWith("classes") || !str.endsWith(".dex")) {
            return false;
        }
        String m36561 = C15472.m36561(4, 7, str);
        int length = m36561.length();
        for (int i = 0; i < length; i++) {
            char charAt = m36561.charAt(i);
            if (i != 0) {
                if (charAt < '0' || charAt > '9') {
                    return false;
                }
            } else if (length == 1) {
                if (charAt < '2' || charAt > '9') {
                    return false;
                }
            } else if (charAt < '1' || charAt > '9') {
                return false;
            }
        }
        return true;
    }
}
