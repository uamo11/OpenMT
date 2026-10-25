package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: JAK2 */
/* renamed from: l.۟᩶᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7706 extends AbstractC7548 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f23801;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f23802;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f23803;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18090 f23804;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21818 f23805;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f23806;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f23807;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22022 f23808;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f23809;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC14306 f23810;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11667 f23811;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1607 f23812;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f23813;

    public C7706(C1607 c1607, C11667 c11667, boolean z, HashSet hashSet, ArrayList arrayList, boolean z2, long j, HashSet hashSet2, RunnableC14306 runnableC14306) {
        this.f23812 = c1607;
        this.f23811 = c11667;
        this.f23803 = z;
        this.f23802 = hashSet;
        this.f23809 = arrayList;
        this.f23807 = z2;
        this.f23801 = j;
        this.f23806 = hashSet2;
        this.f23810 = runnableC14306;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        c16560 = this.f23812.f5665;
        C22022 c22022 = new C22022(c16560.m39056());
        c22022.m49558(R.string.MT_Protector_res_0x7f120797);
        c22022.m49556("...");
        c22022.mo49542((Runnable) null);
        c22022.m49548();
        this.f23808 = c22022;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7 A[SYNTHETIC] */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7706.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C16560 c16560;
        if (!this.f23808.m51053()) {
            c16560 = this.f23812.f5665;
            c16560.m39015();
            this.f23810.run();
        } else {
            C21818 c21818 = this.f23805;
            if (c21818 != null) {
                C0349.m1793(c21818.m49176());
                this.f23805.m49174().mo23552();
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        C21818 c21818 = this.f23805;
        if (c21818 != null) {
            C0349.m1793(c21818.m49176());
            this.f23805.m49174().mo23552();
        }
        c16560 = this.f23812.f5665;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C6022.m16849(false);
        C6022.m16846((C11940) null);
        this.f23808.m51051();
        C0349.m1793(this.f23804);
        C15528.m36596();
    }
}
