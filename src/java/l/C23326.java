package l;

import java.io.InputStream;

/* compiled from: 24MP */
/* renamed from: l.᩺᩻ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23326 extends AbstractC9049 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9425 f74979;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17891[] f74980;

    public C23326(AbstractC15440 abstractC15440) {
        this(abstractC15440.m36506());
    }

    public C23326(InputStream inputStream) {
        this(new C3074(C0349.m1795(inputStream, 0)));
    }

    public C23326(byte[] bArr) {
        this(new C3074(bArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r7.f74979 = new l.C9425(r1);
        r7.f27446 = l.C13944.m33385(r8, r1.m16529());
        r8 = r8.m9400(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r8 >= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r8 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        r2 = new java.util.ArrayList(r8);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r3 >= r8) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        r2.add(new l.C17891(r7, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r3 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r1.m16525() <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r7.f74980 = (l.C17891[]) r2.toArray(new l.C17891[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C23326(l.C3074 r8) {
        /*
            r7 = this;
            r7.<init>()
            r0 = 0
            l.ۛۜܽ r1 = r8.m9403(r0)
            l.֫ᩳܽ r1 = l.C1993.m6523(r1)
            int r1 = r1.f6674
            l.ۛۜܽ r1 = r8.m9403(r1)
        L12:
            int r2 = r1.m16525()
            r3 = 8
            if (r2 < r3) goto L52
            l.֫ᩳܽ r2 = l.C1993.m6523(r1)
            int r4 = r2.f6673
            short r5 = r2.f6676
            r6 = 1
            if (r5 != r6) goto L2a
            r2 = -8
            r1.m16536(r2)
            goto L52
        L2a:
            int r5 = r2.f6674
            if (r5 < r3) goto L3c
            if (r4 < r5) goto L3c
            int r4 = r4 + (-8)
            int r3 = r1.m16525()
            if (r4 > r3) goto L3c
            r1.m16536(r4)
            goto L12
        L3c:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid chunk size before string pool at offset "
            r0.<init>(r1)
            int r1 = r2.f6675
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L52:
            l.ۢۜܽ r2 = new l.ۢۜܽ
            r2.<init>(r1)
            r7.f74979 = r2
            int r2 = r1.m16529()
            l.ۤܽܽ r2 = l.C13944.m33385(r8, r2)
            r7.f27446 = r2
            int r8 = r8.m9400(r3)
            if (r8 >= 0) goto L6b
            r8 = 10
        L6b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r8)
            r3 = 0
        L71:
            if (r3 >= r8) goto L8a
            l.ᩳۜܽ r4 = new l.ᩳۜܽ     // Catch: java.lang.Exception -> L7c
            r4.<init>(r7, r1)     // Catch: java.lang.Exception -> L7c
            r2.add(r4)     // Catch: java.lang.Exception -> L7c
            goto L86
        L7c:
            r4 = move-exception
            if (r3 == 0) goto L89
            int r4 = r1.m16525()
            if (r4 > 0) goto L86
            goto L8a
        L86:
            int r3 = r3 + 1
            goto L71
        L89:
            throw r4
        L8a:
            l.ᩳۜܽ[] r8 = new l.C17891[r0]
            java.lang.Object[] r8 = r2.toArray(r8)
            l.ᩳۜܽ[] r8 = (l.C17891[]) r8
            r7.f74980 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23326.<init>(l.ۗۜܽ):void");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m51731() {
        this.f74979.m24259();
        for (C17891 c17891 : this.f74980) {
            c17891.f54630.m24259();
        }
    }

    @Override // l.InterfaceC9922
    /* renamed from: ᩻ۧ */
    public final C9425 mo14959() {
        return this.f74979;
    }

    @Override // l.InterfaceC9922
    /* renamed from: ᩻ۧ */
    public final InterfaceC12743 mo14959() {
        return this.f74979;
    }

    @Override // l.InterfaceC9922
    /* renamed from: ۚ */
    public final int mo14956() {
        return this.f74980.length;
    }

    @Override // l.InterfaceC9922
    /* renamed from: ۢ */
    public final InterfaceC4277 mo14957(int i) {
        return this.f74980[i];
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m51732() {
        C9028 m23280 = C9028.m23280();
        for (C17891 c17891 : this.f74980) {
            m23280.m23281(c17891.mo12858(), c17891.getPackageName());
        }
    }
}
