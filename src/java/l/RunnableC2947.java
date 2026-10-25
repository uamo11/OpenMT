package l;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: N585 */
/* renamed from: l.ۗۖۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class RunnableC2947 extends AbstractC0829 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f9348;

    public RunnableC2947(C19922 c19922, String str) {
        super(c19922, str);
        this.f9348 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f9348
            java.lang.String r0 = l.AbstractRunnableC21333.m48358(r0)
        L6:
            java.lang.String r1 = "-"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L13
            java.lang.String r0 = l.AbstractRunnableC21333.m48358(r0)
            goto L6
        L13:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            l.᩶ۘۢ r2 = r3.f68752
            if (r1 == 0) goto L22
            l.ܶ᩵ܿ r0 = r2.m45852()
            goto L3a
        L22:
            java.lang.String r1 = "*"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L2d
            java.lang.String r0 = "550 LIST does not support wildcards\r\n"
            goto L5e
        L2d:
            l.ܶ᩵ܿ r0 = l.AbstractRunnableC21333.m48364(r2, r0)
            boolean r1 = r3.m48366(r0)
            if (r1 == 0) goto L3a
            java.lang.String r0 = "450 Listing target violates chroot\r\n"
            goto L5e
        L3a:
            boolean r1 = r0.mo23113()
            if (r1 == 0) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.m3095(r0, r1)
            if (r0 == 0) goto L4c
            goto L5e
        L4c:
            java.lang.String r0 = r1.toString()
            goto L5a
        L51:
            java.lang.String r0 = r3.mo3096(r0)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "450 Couldn't list that file\r\n"
            goto L5e
        L5a:
            java.lang.String r0 = r3.m3097(r0)
        L5e:
            if (r0 == 0) goto L63
            r2.m45860(r0)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC2947.run():void");
    }

    @Override // l.AbstractC0829
    /* renamed from: ۧ */
    public final String mo3096(AbstractC15440 abstractC15440) {
        SimpleDateFormat simpleDateFormat;
        StringBuilder sb = new StringBuilder();
        if (!abstractC15440.mo23120()) {
            return null;
        }
        String name = abstractC15440.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        if (abstractC15440.mo23113()) {
            sb.append("drwxr-xr-x 1 owner group");
        } else {
            sb.append("-rw-r--r-- 1 owner group");
        }
        String l2 = Long.toString(abstractC15440.mo23127());
        int length = 13 - l2.length();
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                break;
            }
            sb.append(' ');
            length = i;
        }
        sb.append(l2);
        if (System.currentTimeMillis() - abstractC15440.mo23117() < 15552000000L) {
            simpleDateFormat = new SimpleDateFormat(" MMM dd HH:mm ", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat(" MMM dd  yyyy ", Locale.US);
        }
        sb.append(simpleDateFormat.format(new Date(abstractC15440.mo23117())));
        sb.append(name);
        sb.append("\r\n");
        return sb.toString();
    }
}
