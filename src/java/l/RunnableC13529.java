package l;

/* compiled from: N569 */
/* renamed from: l.ܰۖۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class RunnableC13529 extends AbstractC0829 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f40349;

    public RunnableC13529(C19922 c19922, String str) {
        super(c19922, str);
        this.f40349 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f40349
            java.lang.String r0 = l.AbstractRunnableC21333.m48358(r0)
            java.lang.String r1 = "-"
            boolean r1 = r0.startsWith(r1)
            java.lang.String r2 = ""
            if (r1 == 0) goto L11
            r0 = r2
        L11:
            boolean r1 = r0.equals(r2)
            l.᩶ۘۢ r2 = r3.f68752
            if (r1 == 0) goto L1e
            l.ܶ᩵ܿ r0 = r2.m45852()
            goto L3f
        L1e:
            java.lang.String r1 = "*"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L29
            java.lang.String r0 = "550 NLST does not support wildcards\r\n"
            goto L63
        L29:
            l.ܶ᩵ܿ r0 = l.AbstractRunnableC21333.m48364(r2, r0)
            boolean r1 = r3.m48366(r0)
            if (r1 == 0) goto L36
            java.lang.String r0 = "450 Listing target violates chroot\r\n"
            goto L63
        L36:
            boolean r1 = r0.mo23119()
            if (r1 == 0) goto L3f
            java.lang.String r0 = "550 NLST for regular files is unsupported\r\n"
            goto L63
        L3f:
            boolean r1 = r0.mo23113()
            if (r1 == 0) goto L56
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.m3095(r0, r1)
            if (r0 == 0) goto L51
            goto L63
        L51:
            java.lang.String r0 = r1.toString()
            goto L5f
        L56:
            java.lang.String r0 = r3.mo3096(r0)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "450 Couldn't list that file\r\n"
            goto L63
        L5f:
            java.lang.String r0 = r3.m3097(r0)
        L63:
            if (r0 == 0) goto L68
            r2.m45860(r0)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC13529.run():void");
    }

    @Override // l.AbstractC0829
    /* renamed from: ۧ */
    public final String mo3096(AbstractC15440 abstractC15440) {
        if (!abstractC15440.mo23120()) {
            return null;
        }
        String name = abstractC15440.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        return name.concat("\r\n");
    }
}
