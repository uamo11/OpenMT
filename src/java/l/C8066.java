package l;

import org.bouncycastle.crypto.generators.Argon2BytesGenerator;

/* compiled from: U7YJ */
/* renamed from: l.۠ۡۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8066 implements InterfaceC1737 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Argon2BytesGenerator f24869;

    @Override // l.InterfaceC1737
    /* renamed from: ֫ */
    public final void mo5811(byte[] bArr) {
        throw new C12651("initWithOpenSSHv1KDFOptions() not supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[Catch: NumberFormatException -> 0x00d4, LOOP:0: B:18:0x007c->B:19:0x007e, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:3:0x0002, B:6:0x0016, B:8:0x001e, B:14:0x0032, B:17:0x004f, B:19:0x007e, B:21:0x0092, B:24:0x00c8, B:25:0x00cd, B:26:0x003c, B:29:0x0046, B:32:0x00ce, B:33:0x00d3), top: B:2:0x0002 }] */
    @Override // l.InterfaceC1737
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5810(java.util.HashMap r12) {
        /*
            r11 = this;
            java.lang.String r0 = "Invalid argon2 params."
            java.lang.String r1 = "Key-Derivation"
            java.lang.Object r1 = r12.get(r1)     // Catch: java.lang.NumberFormatException -> Ld4
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> Ld4
            java.lang.String r2 = "Argon2-Salt"
            java.lang.Object r2 = r12.get(r2)     // Catch: java.lang.NumberFormatException -> Ld4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> Ld4
            if (r1 == 0) goto Lce
            if (r2 == 0) goto Lce
            int r3 = r2.length()     // Catch: java.lang.NumberFormatException -> Ld4
            int r3 = r3 % 2
            if (r3 != 0) goto Lce
            int r3 = r1.hashCode()     // Catch: java.lang.NumberFormatException -> Ld4
            r4 = -1530598888(0xffffffffa4c4ea18, float:-8.539802E-17)
            r5 = 0
            if (r3 == r4) goto L46
            r4 = 920457159(0x36dd0fc7, float:6.58815E-6)
            if (r3 == r4) goto L3c
            r4 = 920457164(0x36dd0fcc, float:6.5881522E-6)
            if (r3 != r4) goto Lc8
            java.lang.String r3 = "Argon2i"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.NumberFormatException -> Ld4
            if (r1 == 0) goto Lc8
            r1 = 1
            goto L4f
        L3c:
            java.lang.String r3 = "Argon2d"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.NumberFormatException -> Ld4
            if (r1 == 0) goto Lc8
            r1 = 0
            goto L4f
        L46:
            java.lang.String r3 = "Argon2id"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.NumberFormatException -> Ld4
            if (r1 == 0) goto Lc8
            r1 = 2
        L4f:
            java.lang.String r3 = "Argon2-Memory"
            java.lang.Object r3 = r12.get(r3)     // Catch: java.lang.NumberFormatException -> Ld4
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> Ld4
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> Ld4
            java.lang.String r4 = "Argon2-Passes"
            java.lang.Object r4 = r12.get(r4)     // Catch: java.lang.NumberFormatException -> Ld4
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> Ld4
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Ld4
            java.lang.String r6 = "Argon2-Parallelism"
            java.lang.Object r12 = r12.get(r6)     // Catch: java.lang.NumberFormatException -> Ld4
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.NumberFormatException -> Ld4
            int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.NumberFormatException -> Ld4
            int r6 = r2.length()     // Catch: java.lang.NumberFormatException -> Ld4
            int r6 = r6 / 2
            byte[] r7 = new byte[r6]     // Catch: java.lang.NumberFormatException -> Ld4
            r8 = 0
        L7c:
            if (r8 >= r6) goto L92
            int r9 = r8 * 2
            int r10 = r9 + 2
            java.lang.String r9 = r2.substring(r9, r10)     // Catch: java.lang.NumberFormatException -> Ld4
            r10 = 16
            int r9 = java.lang.Integer.parseInt(r9, r10)     // Catch: java.lang.NumberFormatException -> Ld4
            byte r9 = (byte) r9     // Catch: java.lang.NumberFormatException -> Ld4
            r7[r8] = r9     // Catch: java.lang.NumberFormatException -> Ld4
            int r8 = r8 + 1
            goto L7c
        L92:
            org.bouncycastle.crypto.params.Argon2Parameters$Builder r2 = new org.bouncycastle.crypto.params.Argon2Parameters$Builder     // Catch: java.lang.NumberFormatException -> Ld4
            r2.<init>(r1)     // Catch: java.lang.NumberFormatException -> Ld4
            org.bouncycastle.crypto.params.Argon2Parameters$Builder r1 = r2.withSalt(r7)     // Catch: java.lang.NumberFormatException -> Ld4
            byte[] r2 = new byte[r5]     // Catch: java.lang.NumberFormatException -> Ld4
            org.bouncycastle.crypto.params.Argon2Parameters$Builder r1 = r1.withAdditional(r2)     // Catch: java.lang.NumberFormatException -> Ld4
            byte[] r2 = new byte[r5]     // Catch: java.lang.NumberFormatException -> Ld4
            org.bouncycastle.crypto.params.Argon2Parameters$Builder r1 = r1.withSecret(r2)     // Catch: java.lang.NumberFormatException -> Ld4
            org.bouncycastle.crypto.params.Argon2Parameters$Builder r1 = r1.withIterations(r4)     // Catch: java.lang.NumberFormatException -> Ld4
            org.bouncycastle.crypto.params.Argon2Parameters$Builder r1 = r1.withMemoryAsKB(r3)     // Catch: java.lang.NumberFormatException -> Ld4
            org.bouncycastle.crypto.params.Argon2Parameters$Builder r12 = r1.withParallelism(r12)     // Catch: java.lang.NumberFormatException -> Ld4
            r1 = 19
            org.bouncycastle.crypto.params.Argon2Parameters$Builder r12 = r12.withVersion(r1)     // Catch: java.lang.NumberFormatException -> Ld4
            org.bouncycastle.crypto.params.Argon2Parameters r12 = r12.build()     // Catch: java.lang.NumberFormatException -> Ld4
            org.bouncycastle.crypto.generators.Argon2BytesGenerator r1 = new org.bouncycastle.crypto.generators.Argon2BytesGenerator     // Catch: java.lang.NumberFormatException -> Ld4
            r1.<init>()     // Catch: java.lang.NumberFormatException -> Ld4
            r11.f24869 = r1     // Catch: java.lang.NumberFormatException -> Ld4
            r1.init(r12)     // Catch: java.lang.NumberFormatException -> Ld4
            return
        Lc8:
            l.۫᩷ۘ r12 = new l.۫᩷ۘ     // Catch: java.lang.NumberFormatException -> Ld4
            r12.<init>(r0)     // Catch: java.lang.NumberFormatException -> Ld4
            throw r12     // Catch: java.lang.NumberFormatException -> Ld4
        Lce:
            l.۫᩷ۘ r12 = new l.۫᩷ۘ     // Catch: java.lang.NumberFormatException -> Ld4
            r12.<init>(r0)     // Catch: java.lang.NumberFormatException -> Ld4
            throw r12     // Catch: java.lang.NumberFormatException -> Ld4
        Ld4:
            r12 = move-exception
            l.۫᩷ۘ r1 = new l.۫᩷ۘ
            r1.<init>(r0, r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8066.mo5810(java.util.HashMap):void");
    }

    @Override // l.InterfaceC1737
    /* renamed from: ۧ */
    public final void mo5813(byte[] bArr) {
        throw new C12651("initWithASN1() not supported");
    }

    @Override // l.InterfaceC1737
    /* renamed from: ֫ */
    public final byte[] mo5812(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f24869.generateBytes(bArr, bArr2);
        return bArr2;
    }
}
