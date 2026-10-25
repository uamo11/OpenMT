package l;

import java.nio.CharBuffer;

/* compiled from: Q6UO */
/* renamed from: l.ܺ᩹ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16231 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9177 f49968;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f49969;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f49970;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f49971;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11999 f49972;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Object f49967 = new Object();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Thread f49973 = Thread.currentThread();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f49966 = true;

    public C16231(C11999 c11999, InterfaceC9177 interfaceC9177) {
        this.f49972 = c11999;
        this.f49968 = interfaceC9177;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38190() {
        if (this.f49973 != Thread.currentThread() || !this.f49966) {
            throw new IllegalStateException("Text transaction is not active on this thread");
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38196() {
        m38190();
        return this.f49972.m29347();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38195(int i, int i2, CharBuffer charBuffer) {
        m38187(i, i2, charBuffer, 0, 0, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38194(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m38187(i, i2, charSequence, i3, i4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:5:0x0013, B:8:0x0026, B:17:0x0078, B:20:0x0096, B:26:0x009c, B:27:0x0094, B:38:0x00ac, B:37:0x00a9, B:10:0x003e, B:13:0x0044, B:16:0x0049, B:28:0x006e, B:32:0x00a3), top: B:4:0x0013, inners: #0, #1 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m38187(int r17, int r18, java.lang.CharSequence r19, int r20, int r21, boolean r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r8 = r18
            r9 = r20
            r16.m38190()
            boolean r2 = r1.f49969
            if (r2 != 0) goto Lb1
            r10 = 1
            r1.f49969 = r10
            r11 = 0
            l.ۨ᩹ᩳ r2 = r1.f49972     // Catch: java.lang.Throwable -> Lad
            int r2 = r2.m29347()     // Catch: java.lang.Throwable -> Lad
            l.C11999.m29337(r0, r8, r2)     // Catch: java.lang.Throwable -> Lad
            int r2 = r19.length()     // Catch: java.lang.Throwable -> Lad
            if (r22 == 0) goto L24
            r12 = r2
            goto L26
        L24:
            r12 = r21
        L26:
            l.C11999.m29337(r9, r12, r2)     // Catch: java.lang.Throwable -> Lad
            l.ۨ᩹ᩳ r2 = r1.f49972     // Catch: java.lang.Throwable -> Lad
            int r2 = r2.m29347()     // Catch: java.lang.Throwable -> Lad
            int r3 = r8 - r0
            int r4 = r12 - r9
            l.C11999.m29338(r2, r3, r4)     // Catch: java.lang.Throwable -> Lad
            l.ۨ᩹ᩳ r2 = r1.f49972     // Catch: java.lang.Throwable -> Lad
            r3 = r19
            l.ۤ᩹ᩳ r13 = r2.m29342(r9, r12, r3)     // Catch: java.lang.Throwable -> Lad
            l.ۡ᩹ᩳ r2 = r1.f49968     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L6e
            if (r0 != r8) goto L49
            int r2 = r13.f31790     // Catch: java.lang.Throwable -> La1
            if (r2 != 0) goto L49
            goto L6e
        L49:
            java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.Throwable -> La1
            r2.<init>()     // Catch: java.lang.Throwable -> La1
            r1.f49967 = r2     // Catch: java.lang.Throwable -> La1
            l.ۨ᩹ᩳ r3 = r1.f49972     // Catch: java.lang.Throwable -> La1
            l.ۨ᩹ᩳ r14 = r3.m29345(r0, r8, r13, r2)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.Throwable -> La1
            r2.<init>()     // Catch: java.lang.Throwable -> La1
            r1.f49967 = r2     // Catch: java.lang.Throwable -> La1
            l.ۡ᩹ᩳ r2 = r1.f49968     // Catch: java.lang.Throwable -> La1
            l.ۨ᩹ᩳ r5 = r1.f49972     // Catch: java.lang.Throwable -> La1
            int r7 = r13.f31790     // Catch: java.lang.Throwable -> La1
            r3 = r17
            r4 = r18
            r6 = r14
            r2.mo23583(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La1
            r1.f49972 = r14     // Catch: java.lang.Throwable -> La1
            goto L78
        L6e:
            l.ۨ᩹ᩳ r2 = r1.f49972     // Catch: java.lang.Throwable -> La1
            java.lang.Object r3 = r1.f49967     // Catch: java.lang.Throwable -> La1
            l.ۨ᩹ᩳ r2 = r2.m29345(r0, r8, r13, r3)     // Catch: java.lang.Throwable -> La1
            r1.f49972 = r2     // Catch: java.lang.Throwable -> La1
        L78:
            r13.close()     // Catch: java.lang.Throwable -> Lad
            long r2 = (long) r8     // Catch: java.lang.Throwable -> Lad
            long r4 = (long) r0     // Catch: java.lang.Throwable -> Lad
            long r2 = r2 - r4
            long r4 = (long) r12     // Catch: java.lang.Throwable -> Lad
            long r2 = r2 + r4
            long r4 = (long) r9     // Catch: java.lang.Throwable -> Lad
            long r2 = r2 - r4
            r4 = 2
            long r2 = r2 * r4
            long r4 = r1.f49971     // Catch: java.lang.Throwable -> Lad
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r13 = r6 - r4
            int r15 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r15 <= 0) goto L94
            goto L96
        L94:
            long r6 = r4 + r2
        L96:
            r1.f49971 = r6     // Catch: java.lang.Throwable -> Lad
            if (r0 != r8) goto L9c
            if (r9 == r12) goto L9e
        L9c:
            r1.f49970 = r10     // Catch: java.lang.Throwable -> Lad
        L9e:
            r1.f49969 = r11
            return
        La1:
            r0 = move-exception
            r2 = r0
            r13.close()     // Catch: java.lang.Throwable -> La7
            goto Lac
        La7:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch: java.lang.Throwable -> Lad
        Lac:
            throw r2     // Catch: java.lang.Throwable -> Lad
        Lad:
            r0 = move-exception
            r1.f49969 = r11
            throw r0
        Lb1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Recursive text source edit"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16231.m38187(int, int, java.lang.CharSequence, int, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m38193() {
        m38190();
        return this.f49971;
    }
}
