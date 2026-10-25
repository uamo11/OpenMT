package l;

import java.io.IOException;

/* compiled from: U8SG */
/* renamed from: l.֡֫ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0103 extends IOException {
    public C0103(int i) {
        this(-9223372036854775807L, i, -9223372036854775807L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0103(long r5, int r7, long r8) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal clipping: "
            r0.<init>(r1)
            if (r7 == 0) goto L3e
            r1 = 1
            if (r7 == r1) goto L3b
            r2 = 2
            if (r7 == r2) goto L12
            java.lang.String r5 = "unknown"
            goto L40
        L12:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L20
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 == 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            l.C22632.m50634(r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "start exceeds end. Start time: "
            r7.<init>(r1)
            r7.append(r5)
            java.lang.String r5 = ", End time: "
            r7.append(r5)
            r7.append(r8)
            java.lang.String r5 = r7.toString()
            goto L40
        L3b:
            java.lang.String r5 = "not seekable to start"
            goto L40
        L3e:
            java.lang.String r5 = "invalid period count"
        L40:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0103.<init>(long, int, long):void");
    }
}
