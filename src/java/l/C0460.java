package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: I1KV */
/* renamed from: l.֡ܰ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0460 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f2020;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2021;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f2022;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2023;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f2024;

    public C0460(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str, String str2) {
        this.f2024 = viewOnClickListenerC21628;
        this.f2020 = abstractActivityC3346;
        this.f2023 = str;
        this.f2021 = str2;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f2020, R.string.MT_Protector_res_0x7f120528);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        String m36489 = C16999.m39866(this.f2023, new String[0]).m36489();
        this.f2022 = m36489;
        C20631.m47203(m36489);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        this.f2024.m48867(R.string.MT_Protector_res_0x7f1205e1, this.f2021, this.f2022);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f2020.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
