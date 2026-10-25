package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: Q7Z8 */
/* renamed from: l.ܽۛܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16459 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f50595;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f50596;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f50597;

    public C16459(C16560 c16560, AbstractC15440 abstractC15440) {
        this.f50595 = c16560;
        this.f50597 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f50595.m39056(), R.string.MT_Protector_res_0x7f1207a7);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            r5 = this;
            java.lang.String r0 = "resources.arsc"
            l.ܶ᩵ܿ r1 = r5.f50597
            l.ܶ᩵ܿ r0 = r1.m36524(r0)
            boolean r2 = r0.mo23120()
            if (r2 == 0) goto L14
            l.۫ܽܽ r2 = new l.۫ܽܽ     // Catch: java.lang.Exception -> L14
            r2.<init>(r0)     // Catch: java.lang.Exception -> L14
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 != 0) goto L1c
            l.۫ܽܽ r2 = new l.۫ܽܽ
            r2.<init>()
        L1c:
            byte[] r0 = r1.m36506()
            l.ܶۨۡ r0 = l.C15206.m35978(r0)
            l.ۤۨۡ r0 = r0.m35994()
            r3 = 1
            l.ܶ᩹ۡ r0 = l.C15518.m36587(r0, r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.m36517()
            r2.append(r1)
            java.lang.String r1 = ".svg"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            l.ܽۢܳ r4 = r5.f50595
            l.ܶ᩵ܿ r1 = r4.m38993(r1, r2)
            l.ܶ᩵ܿ r1 = r1.m36492(r3)
            r5.f50596 = r1
            java.lang.String r0 = r0.m36589()
            r1.m36510(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16459.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        this.f50595.m39005(this.f50596);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f50595.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C15528.m36596();
    }
}
