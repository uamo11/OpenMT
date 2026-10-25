package l;

/* compiled from: QALX */
/* renamed from: l.ۛۖۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class RunnableC5769 extends AbstractC0829 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f17743;

    public RunnableC5769(C19922 c19922, String str) {
        super(c19922, str);
        this.f17743 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f17743
            java.lang.String r0 = l.AbstractRunnableC21333.m48358(r0)
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            l.᩶ۘۢ r2 = r3.f68752
            if (r1 == 0) goto L15
            l.ܶ᩵ܿ r0 = r2.m45852()
            goto L2d
        L15:
            java.lang.String r1 = "*"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L20
            java.lang.String r0 = "550 MLSD does not support wildcards\r\n"
            goto L4a
        L20:
            l.ܶ᩵ܿ r0 = l.AbstractRunnableC21333.m48364(r2, r0)
            boolean r1 = r3.m48366(r0)
            if (r1 == 0) goto L2d
            java.lang.String r0 = "450 MLSD target violates chroot\r\n"
            goto L4a
        L2d:
            boolean r1 = r0.mo23113()
            if (r1 != 0) goto L36
            java.lang.String r0 = "501 Not a directory\r\n"
            goto L4a
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.m3095(r0, r1)
            if (r0 == 0) goto L42
            goto L4a
        L42:
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r3.m3097(r0)
        L4a:
            if (r0 == 0) goto L4f
            r2.m45860(r0)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC5769.run():void");
    }

    @Override // l.AbstractC0829
    /* renamed from: ۧ */
    public final String mo3096(AbstractC15440 abstractC15440) {
        StringBuilder sb = new StringBuilder();
        if (!abstractC15440.mo23120()) {
            return null;
        }
        String name = abstractC15440.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        String[] m45862 = this.f68752.m45862();
        if (m45862 != null) {
            for (String str : m45862) {
                if (str.equalsIgnoreCase("size")) {
                    sb.append("Size=");
                    sb.append(abstractC15440.mo23127());
                    sb.append(';');
                } else if (str.equalsIgnoreCase("modify")) {
                    String m9120 = AbstractC2988.m9120(abstractC15440.mo23117());
                    sb.append("Modify=");
                    sb.append(m9120);
                    sb.append(';');
                } else if (str.equalsIgnoreCase("type")) {
                    if (abstractC15440.mo23119()) {
                        sb.append("Type=file;");
                    } else if (abstractC15440.mo23113()) {
                        sb.append("Type=dir;");
                    }
                } else if (str.equalsIgnoreCase("perm")) {
                    sb.append("Perm=");
                    if (abstractC15440.mo27936()) {
                        if (abstractC15440.mo23119()) {
                            sb.append('r');
                        } else if (abstractC15440.mo23113()) {
                            sb.append("el");
                        }
                    }
                    if (abstractC15440.mo27924()) {
                        if (abstractC15440.mo23119()) {
                            sb.append("adfw");
                        } else if (abstractC15440.mo23113()) {
                            sb.append("fpcm");
                        }
                    }
                    sb.append(';');
                }
            }
        }
        sb.append(' ');
        sb.append(name);
        sb.append("\r\n");
        return sb.toString();
    }
}
