package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: J1IP */
/* renamed from: l.᩶۬᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20197 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11005 f65355;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11005 f65356;

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m46431(l.C11005 r5) {
        /*
            java.lang.String r0 = "state"
            l.ܶ᩵ܿ r0 = r5.m27330(r0)
            r1 = 1
            java.util.List r0 = r0.mo23549(r1)
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r0.next()
            l.ܶ᩵ܿ r2 = (l.AbstractC15440) r2
            r2.mo23552()
            goto Lf
        L1f:
            java.lang.String r0 = "dex/smali"
            l.ܶ᩵ܿ r0 = r5.m27330(r0)
            java.util.List r0 = r0.mo23549(r1)
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            l.ܶ᩵ܿ r2 = (l.AbstractC15440) r2
            r2.mo23552()
            goto L2d
        L3d:
            java.lang.String r0 = "arsc/xml"
            l.ܶ᩵ܿ r0 = r5.m27330(r0)
            java.util.List r0 = r0.mo23549(r1)
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r0.next()
            l.ܶ᩵ܿ r2 = (l.AbstractC15440) r2
            r2.mo23552()
            goto L4b
        L5b:
            java.lang.String r0 = "dex/config"
            l.ܶ᩵ܿ r0 = r5.m27330(r0)
            java.util.List r0 = r0.mo23549(r1)
            java.util.Iterator r0 = r0.iterator()
        L69:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r0.next()
            l.ܶ᩵ܿ r2 = (l.AbstractC15440) r2
            boolean r3 = r2.mo23119()
            if (r3 == 0) goto L96
            java.lang.String r3 = r2.getName()
            r3.getClass()
            java.lang.String r4 = "dex_name_map"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L93
            java.lang.String r4 = "map"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L93
            goto L96
        L93:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L98
        L96:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L98:
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L69
            r2.mo23552()
            goto L69
        La2:
            java.lang.String r0 = "arsc/config"
            l.ܶ᩵ܿ r5 = r5.m27330(r0)
            java.util.List r5 = r5.mo23549(r1)
            java.util.Iterator r5 = r5.iterator()
        Lb0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Le9
            java.lang.Object r0 = r5.next()
            l.ܶ᩵ܿ r0 = (l.AbstractC15440) r0
            boolean r1 = r0.mo23119()
            if (r1 == 0) goto Ldd
            java.lang.String r1 = r0.getName()
            r1.getClass()
            java.lang.String r2 = "pkgsort"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lda
            java.lang.String r2 = "name"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lda
            goto Ldd
        Lda:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto Ldf
        Ldd:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        Ldf:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lb0
            r0.mo23552()
            goto Lb0
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20197.m46431(l.ۧ۫᩷):void");
    }

    public C20197(C11005 c11005) {
        this.f65356 = c11005;
        this.f65355 = new C11005(c11005, "backup");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46434(String str) {
        C11005 c11005 = this.f65355;
        if (c11005.m27340().mo23119()) {
            c11005.m27333();
        }
        if (!c11005.m27336()) {
            c11005.m27340().mo23546();
        }
        long currentTimeMillis = System.currentTimeMillis();
        c11005.m27330(currentTimeMillis + ".info").m36510(str);
        C8918 c8918 = new C8918(c11005.m27330(currentTimeMillis + ".zip"));
        Charset charset = StandardCharsets.UTF_8;
        c8918.m23027();
        C11005 c110052 = this.f65356;
        m46432(c110052.m27330("state"), c8918, "");
        m46432(c110052.m27330("dex/config"), c8918, "dex/");
        m46432(c110052.m27330("dex/smali"), c8918, "dex/");
        m46432(c110052.m27330("arsc/config"), c8918, "arsc/");
        m46432(c110052.m27330("arsc/xml"), c8918, "arsc/");
        c8918.close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46435(AbstractC15440 abstractC15440) {
        C11005 c11005 = this.f65356;
        C11005 c110052 = new C11005(c11005, "temp");
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                for (C3545 c3545 : c18090.m42210()) {
                    C16999.m39860(c3545.getName(), c3545.isDirectory());
                }
                c110052.m27333();
                c110052.m27340().m36508();
                for (C3545 c35452 : c18090.m42210()) {
                    AbstractC15440 m27330 = c110052.m27330(C16999.m39860(c35452.getName(), c35452.isDirectory()));
                    if (c35452.isDirectory()) {
                        m27330.m36508();
                    } else {
                        m27330.mo35195();
                        m27330.m36493(c18090.m42189(c35452));
                    }
                    m27330.mo18537(c35452.getTime());
                }
                c18090.close();
                AbstractC15440 m273302 = c110052.m27330("state");
                AbstractC15440 m273303 = c11005.m27330("state");
                m273303.mo23552();
                if (m273302.mo23120()) {
                    m273302.m36498(m273303, (Runnable) null);
                }
                AbstractC15440 m273304 = c110052.m27330("dex/config");
                AbstractC15440 m273305 = c11005.m27330("dex/config");
                m273305.mo23552();
                if (m273304.mo23120()) {
                    m273304.m36498(m273305, (Runnable) null);
                }
                AbstractC15440 m273306 = c110052.m27330("dex/smali");
                AbstractC15440 m273307 = c11005.m27330("dex/smali");
                m273307.mo23552();
                if (m273306.mo23120()) {
                    m273306.m36498(m273307, (Runnable) null);
                }
                AbstractC15440 m273308 = c110052.m27330("arsc/config");
                AbstractC15440 m273309 = c11005.m27330("arsc/config");
                m273309.mo23552();
                if (m273308.mo23120()) {
                    m273308.m36498(m273309, (Runnable) null);
                }
                AbstractC15440 m2733010 = c110052.m27330("arsc/xml");
                AbstractC15440 m2733011 = c11005.m27330("arsc/xml");
                m2733011.mo23552();
                if (m2733010.mo23120()) {
                    m2733010.m36498(m2733011, (Runnable) null);
                }
            } finally {
            }
        } finally {
            c110052.m27333();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m46433() {
        List<AbstractC15440> list = (List) C5378.stream(this.f65355.m27340().mo23549(true)).filter(new C21608(0)).collect(C22976.toList());
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC15440 abstractC15440 : list) {
            AbstractC15440 m39866 = C16999.m39866(abstractC15440.mo23554().substring(0, r2.length() - 3) + "info", new String[0]);
            if (m39866.mo23120()) {
                try {
                    String m36489 = m39866.m36489();
                    if (!m36489.isEmpty()) {
                        arrayList.add(new C22313(abstractC15440, m39866, m36489, Long.parseLong(abstractC15440.getName().substring(0, r3.length() - 4))));
                    }
                } catch (IOException | NumberFormatException unused) {
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46432(AbstractC15440 abstractC15440, C8918 c8918, String str) {
        if (abstractC15440.mo23120()) {
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(abstractC15440.getName());
            m15339.append("/");
            String sb = m15339.toString();
            C3545 c3545 = new C3545(sb);
            c3545.setTime(abstractC15440.mo23117());
            c8918.m23013(c3545);
            c8918.m23023();
            for (AbstractC15440 abstractC154402 : abstractC15440.mo23549(true)) {
                if (abstractC154402.mo23113()) {
                    m46432(abstractC154402, c8918, sb);
                } else {
                    StringBuilder m153392 = C5368.m15339(sb);
                    m153392.append(abstractC154402.getName());
                    C3545 c35452 = new C3545(m153392.toString());
                    c35452.setTime(abstractC154402.mo23117());
                    c8918.m23013(c35452);
                    c8918.m23011(abstractC154402.mo27926());
                    c8918.m23023();
                }
            }
        }
    }
}
