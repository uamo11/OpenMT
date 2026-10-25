package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* compiled from: 98AW */
/* renamed from: l.۫ܿ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12561 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916(b.k) && c2450.m7919().m39035("zip");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (r2.mo27924() != false) goto L15;
     */
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1455(l.C2450 r11) {
        /*
            r10 = this;
            l.ܽۢܳ r0 = r11.m7919()
            java.lang.String r1 = "net"
            r11.m7907(r1)
            java.lang.String r1 = "zip"
            r0.m38998(r1)
            l.ܽ᩷ܳ r0 = r0.m39044()
            r7 = r0
            l.ۧۗ᩻ r7 = (l.C10738) r7
            boolean r0 = r7.m26939()
            if (r0 == 0) goto L22
            r11 = 2131888820(0x7f120ab4, float:1.9412286E38)
            l.C21374.m48457(r11)
            return
        L22:
            java.lang.String r4 = r7.m26937()
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            l.ܶ᩵ܿ r1 = l.C16999.m39866(r4, r1)
            boolean r2 = r1.mo27924()
            if (r2 == 0) goto L41
            l.ܶ᩵ܿ r2 = r1.m36536()
            l.C11003.requireNonNull(r2)
            boolean r2 = r2.mo27924()
            if (r2 == 0) goto L41
            goto L5b
        L41:
            boolean r2 = l.C9255.m23780()
            if (r2 != 0) goto L5b
            bin.mt.plus.Main r11 = r11.m7917()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            r2 = 2131889037(0x7f120b8d, float:1.9412726E38)
            java.lang.String r1 = l.C4925.m14306(r2, r1)
            r11.m10221(r1, r0)
            return
        L5b:
            boolean r0 = r7.m26936()
            if (r0 == 0) goto L66
            java.lang.String r0 = l.C22263.m49978(r1)
            goto L67
        L66:
            r0 = 0
        L67:
            r9 = r0
            l.᩹ܿ᩻ r1 = new l.᩹ܿ᩻
            l.ܽۢܳ r3 = r11.m7921()
            boolean r5 = r7.m26936()
            r2 = r10
            r6 = r9
            r8 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12561.mo1455(l.ۖۢܳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30792(C12561 c12561, C2450 c2450, int i, int i2, C11667 c11667, boolean z) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907(b.k);
        m7919.m38998("zip");
        int i3 = C15104.f46193;
        C0994 c0994 = new C0994(C13266.class);
        c0994.m3483(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3481(c2450.m7922());
        c0994.m3476("ARG_STATELESS_VISITOR2", c2450.m7919().m39063().m33350());
        c0994.m3474("ARG_MSG_FROM", c2450.m7912());
        c0994.m3474("ARG_MSG_TO", C4925.m14327(R.string.MT_Protector_res_0x7f12052f).toLowerCase());
        c0994.m3474("targetPath", m7919.m39058());
        c0994.m3470(i, "level");
        c0994.m3470(i2, "update");
        c0994.m3472(c2450.m7917(), c11667);
        c0994.m3475("keepApkSigBlock", z);
        c0994.m3469();
    }
}
