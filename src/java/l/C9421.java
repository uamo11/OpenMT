package l;

import bin.mt.plus.R;

/* compiled from: M1KQ */
/* renamed from: l.ۢۜۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9421 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28577;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f28578;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18076 f28579;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f28580;

    public C9421(C15063 c15063, String str, C18076 c18076) {
        this.f28580 = c15063;
        this.f28577 = str;
        this.f28579 = c18076;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933((AbstractActivityC3346) this.f28580.requireActivity());
        c22933.m51049(R.string.MT_Protector_res_0x7f120528);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f28578 = c22933;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0 < r2.size()) goto L6;
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0033 */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f28577
            l.ܶۜۢ r1 = r6.f28580
            l.C15063.m35607(r1, r0)
            int[] r0 = l.C15063.m35627(r1)
            if (r0 == 0) goto L1c
            int[] r0 = l.C15063.m35627(r1)
            int r0 = r0.length
            java.util.List r2 = l.C15063.m35624(r1)
            int r2 = r2.size()
            if (r0 >= r2) goto L29
        L1c:
            java.util.List r0 = l.C15063.m35624(r1)
            int r0 = r0.size()
            int[] r0 = new int[r0]
            l.C15063.m35611(r1, r0)
        L29:
            r0 = 0
            r2 = 0
        L2b:
            java.util.List r3 = l.C15063.m35624(r1)
            int r3 = r3.size()
            if (r0 >= r3) goto L70
            java.util.List r3 = l.C15063.m35624(r1)
            java.lang.Object r3 = r3.get(r0)
            l.ܺۜۢ r3 = (l.C15769) r3
            java.lang.String r3 = r3.m37186()
            l.ᩳ۬ܿ r4 = r6.f28579
            boolean r3 = r4.m42137(r3)
            if (r3 == 0) goto L54
            int[] r3 = l.C15063.m35627(r1)
            int r4 = r2 + 1
            r3[r2] = r0
            r2 = r4
        L54:
            l.᩺ۤܿ r3 = r6.f28578
            int r4 = r2 * 100
            java.util.List r5 = l.C15063.m35624(r1)
            int r5 = r5.size()
            int r4 = r4 / r5
            r3.m51045(r4)
            l.᩺ۤܿ r3 = r6.f28578
            boolean r3 = r3.m51053()
            if (r3 == 0) goto L6d
            return
        L6d:
            int r0 = r0 + 1
            goto L2b
        L70:
            l.C15063.m35606(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9421.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C0247 c0247;
        if (this.f28578.m51053()) {
            return;
        }
        C15063 c15063 = this.f28580;
        c15063.f45994 = true;
        C15063.m35612(c15063);
        c0247 = c15063.f45999;
        c0247.notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3764 c3764;
        c3764 = this.f28580.f46001;
        c3764.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f28578.m51051();
    }
}
