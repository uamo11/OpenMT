package l;

/* compiled from: 66T2 */
/* renamed from: l.᩶᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20403 {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw new java.io.IOException("Legacy text reader made invalid progress");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11999 m46730(java.io.Reader r9, l.C21605 r10, int r11, l.C22519 r12) {
        /*
            if (r11 < 0) goto L5b
            l.ۜ᩹ᩳ r0 = new l.ۜ᩹ᩳ
            r0.<init>(r10)
            r1 = 1024(0x400, float:1.435E-42)
            int r2 = r10.f69369
            int r1 = java.lang.Math.min(r1, r2)
            l.᩺᩹ᩳ r2 = new l.᩺᩹ᩳ
            r2.<init>(r10, r1)
            char[] r10 = r2.m51607()     // Catch: java.lang.Throwable -> L51
        L18:
            r3 = 0
            int r3 = r9.read(r10, r3, r1)     // Catch: java.lang.Throwable -> L51
            r4 = -1
            if (r3 != r4) goto L28
            l.ۨ᩹ᩳ r9 = r0.m19038()     // Catch: java.lang.Throwable -> L51
            r2.close()
            return r9
        L28:
            if (r3 <= 0) goto L49
            if (r3 > r1) goto L49
            int r4 = r0.m19040()     // Catch: java.lang.Throwable -> L51
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L51
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L51
            long r4 = r4 + r6
            long r6 = (long) r11     // Catch: java.lang.Throwable -> L51
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L41
            if (r12 == 0) goto L3d
            r12.m50494(r10, r3)     // Catch: java.lang.Throwable -> L51
        L3d:
            r0.m19039(r10, r3)     // Catch: java.lang.Throwable -> L51
            goto L18
        L41:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "Legacy text exceeds migration coordinate limit"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L51
            throw r9     // Catch: java.lang.Throwable -> L51
        L49:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "Legacy text reader made invalid progress"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L51
            throw r9     // Catch: java.lang.Throwable -> L51
        L51:
            r9 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r10 = move-exception
            r9.addSuppressed(r10)
        L5a:
            throw r9
        L5b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Invalid legacy text length limit"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20403.m46730(java.io.Reader, l.᩸۬ᩳ, int, l.᩹᩶ᩳ):l.ۨ᩹ᩳ");
    }
}
