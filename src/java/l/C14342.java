package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: Q7Z8 */
/* renamed from: l.ܳۛܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14342 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f43248;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f43249;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15518 f43250;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f43251;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f43252;

    public C14342(Main main, AbstractC15440 abstractC15440, C16560 c16560) {
        this.f43248 = main;
        this.f43251 = abstractC15440;
        this.f43249 = c16560;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f43248, R.string.MT_Protector_res_0x7f120528);
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
            r4 = this;
            java.lang.String r0 = "resources.arsc"
            l.ܶ᩵ܿ r1 = r4.f43251
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
            r3 = 0
            l.ܶ᩹ۡ r0 = l.C15518.m36587(r0, r2, r3)
            r4.f43250 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.m36517()
            r0.append(r1)
            java.lang.String r1 = ".png"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            l.ܽۢܳ r1 = r4.f43249
            l.ܶ᩵ܿ r0 = r1.m38993(r0, r3)
            r1 = 1
            l.ܶ᩵ܿ r0 = r0.m36492(r1)
            r4.f43252 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14342.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        new C17165(this, this.f43248, this.f43250.getIntrinsicWidth(), this.f43250.getIntrinsicHeight());
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f43248.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
