package l;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: L8R4 */
/* renamed from: l.֡֨֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0074 implements InterfaceC14723 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f988;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f989;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f990;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f991;

    @Override // l.InterfaceC14723
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo1026(C18252 c18252) {
    }

    @Override // l.InterfaceC14723
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C0074(int i, int i2, String str, byte[] bArr) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                C22632.m50631(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                C22632.m50631(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                C22632.m50631(z);
                break;
            case "auxiliary.tracks.map":
                C22632.m50631(i2 == 0);
                break;
        }
        this.f988 = str;
        this.f991 = bArr;
        this.f989 = i;
        this.f990 = i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m1028() {
        C22632.m50633("Metadata is not an auxiliary tracks map", this.f988.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f991;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0074.class == obj.getClass()) {
            C0074 c0074 = (C0074) obj;
            if (this.f988.equals(c0074.f988) && Arrays.equals(this.f991, c0074.f991) && this.f989 == c0074.f989 && this.f990 == c0074.f990) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f991) + C11010.m27349(527, 31, this.f988)) * 31) + this.f989) * 31) + this.f990;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab A[LOOP:0: B:18:0x00a8->B:20:0x00ab, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r10 = this;
            r0 = 2
            r1 = 4
            java.lang.String r2 = r10.f988
            r3 = 0
            byte[] r4 = r10.f991
            int r5 = r10.f990
            if (r5 == 0) goto L7c
            r6 = 1
            if (r5 == r6) goto L77
            r7 = 23
            r8 = 3
            java.lang.String r9 = "array too small: %s < %s"
            if (r5 == r7) goto L58
            r7 = 67
            if (r5 == r7) goto L3c
            r0 = 75
            if (r5 == r0) goto L32
            r0 = 78
            if (r5 == r0) goto L23
            goto L9e
        L23:
            l.ᩳ֨֫ r0 = new l.ᩳ֨֫
            r0.<init>(r4)
            long r0 = r0.m41466()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L32:
            r0 = r4[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L3c:
            int r5 = r4.length
            if (r5 < r1) goto L41
            r5 = 1
            goto L42
        L41:
            r5 = 0
        L42:
            int r7 = r4.length
            l.C4025.m12108(r9, r7, r1, r5)
            r1 = r4[r3]
            r3 = r4[r6]
            r0 = r4[r0]
            r4 = r4[r8]
            int r0 = l.C13426.m32444(r1, r3, r0, r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L58:
            int r5 = r4.length
            if (r5 < r1) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            int r7 = r4.length
            l.C4025.m12108(r9, r7, r1, r5)
            r1 = r4[r3]
            r3 = r4[r6]
            r0 = r4[r0]
            r4 = r4[r8]
            int r0 = l.C13426.m32444(r1, r3, r0, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L77:
            java.lang.String r0 = l.C3603.m11021(r4)
            goto Lcb
        L7c:
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9e
            java.util.ArrayList r0 = r10.m1028()
            java.lang.String r1 = "track types = "
            java.lang.StringBuilder r1 = l.C5368.m15339(r1)
            l.ۜܶܺ r3 = l.C6847.m18530()
            java.util.Iterator r0 = r0.iterator()
            r3.m18534(r1, r0)
            java.lang.String r0 = r1.toString()
            goto Lcb
        L9e:
            java.lang.String r0 = l.C3603.f11424
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r5 = r4.length
            int r5 = r5 * 2
            r0.<init>(r5)
        La8:
            int r5 = r4.length
            if (r3 >= r5) goto Lc7
            r5 = r4[r3]
            int r5 = r5 >> r1
            r5 = r5 & 15
            r6 = 16
            char r5 = java.lang.Character.forDigit(r5, r6)
            r0.append(r5)
            r5 = r4[r3]
            r5 = r5 & 15
            char r5 = java.lang.Character.forDigit(r5, r6)
            r0.append(r5)
            int r3 = r3 + 1
            goto La8
        Lc7:
            java.lang.String r0 = r0.toString()
        Lcb:
            java.lang.String r1 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = l.C19462.m44858(r1, r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0074.toString():java.lang.String");
    }
}
