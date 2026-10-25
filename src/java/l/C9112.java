package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.regex.Pattern;

/* compiled from: 251F */
/* renamed from: l.ۡ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9112 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Pattern f27606;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9170 f27607;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f27608;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnClickListenerC16166 f27609;

    public C9112(AbstractViewOnClickListenerC16166 abstractViewOnClickListenerC16166, Pattern pattern, String str) {
        AbstractActivityC3346 abstractActivityC3346;
        this.f27609 = abstractViewOnClickListenerC16166;
        this.f27606 = pattern;
        this.f27608 = str;
        abstractActivityC3346 = abstractViewOnClickListenerC16166.f49801;
        this.f27607 = C9170.m23579(abstractActivityC3346);
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        AbstractActivityC3346 abstractActivityC3346;
        abstractActivityC3346 = this.f27609.f49801;
        m20267(abstractActivityC3346, R.string.MT_Protector_res_0x7f12090c);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        this.f27609.mo2796(this.f27606, this.f27608);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f27607.m23581()) {
            this.f27609.mo2795();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346;
        if (this.f27607.m23581()) {
            abstractActivityC3346 = this.f27609.f49801;
            abstractActivityC3346.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
