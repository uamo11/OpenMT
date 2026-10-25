package l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: Y5PI */
/* renamed from: l.ᩳ۬ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18073 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f56294;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f56295;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f56296;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f56297;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f56298;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f56299;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8901 f56300;

    public C18073(C8901 c8901, Spinner spinner, Main main, C2978 c2978, C2978 c29782, C16560 c16560) {
        this.f56300 = c8901;
        this.f56295 = spinner;
        this.f56294 = main;
        this.f56299 = c2978;
        this.f56296 = c29782;
        this.f56298 = c16560;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        ApplicationC20075.f65008.edit().mo25853(this.f56295.getSelectedItemPosition(), "dex_fixer_dex_version");
        C22933 c22933 = new C22933(this.f56294);
        c22933.mo49542((Runnable) null);
        c22933.m51049(R.string.MT_Protector_res_0x7f120298);
        c22933.m51038(R.string.MT_Protector_res_0x7f120797);
        c22933.mo49547();
        this.f56297 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440;
        AbstractC15440 abstractC154402;
        InterfaceC14544 interfaceC14544;
        C16661 c16661 = new C16661(this);
        C8901 c8901 = this.f56300;
        c8901.f27071 = c16661;
        abstractC15440 = c8901.f27070;
        abstractC154402 = c8901.f27072;
        int selectedItemPosition = this.f56295.getSelectedItemPosition();
        boolean isChecked = this.f56299.isChecked();
        boolean isChecked2 = this.f56296.isChecked();
        interfaceC14544 = c8901.f27071;
        C8901.m22977(abstractC15440, abstractC154402, selectedItemPosition, isChecked, isChecked2, interfaceC14544);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        AbstractC15440 abstractC15440;
        AbstractC15440 abstractC154402;
        AbstractC15440 abstractC154403;
        AbstractC15440 abstractC154404;
        AbstractC15440 abstractC154405;
        AbstractC15440 abstractC154406;
        boolean m51053 = this.f56297.m51053();
        C8901 c8901 = this.f56300;
        if (m51053) {
            abstractC154406 = c8901.f27072;
            abstractC154406.mo23552();
            return;
        }
        if (ApplicationC20075.f65008.getBoolean("dfb", true)) {
            abstractC154405 = c8901.f27070;
            abstractC154405.m36529();
        } else {
            abstractC15440 = c8901.f27070;
            abstractC15440.mo27929();
        }
        abstractC154402 = c8901.f27072;
        abstractC154403 = c8901.f27070;
        abstractC154402.m36498(abstractC154403, (Runnable) null);
        abstractC154404 = c8901.f27070;
        this.f56298.m39053(abstractC154404.getName());
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractC15440 abstractC15440;
        boolean isChecked = this.f56296.isChecked();
        Main main = this.f56294;
        if (!isChecked) {
            Throwable th = exc;
            while (true) {
                if (th != null) {
                    String message = th.getMessage();
                    if (message != null && message.contains("Invalid element width")) {
                        exc = new Exception(main.getString(R.string.MT_Protector_res_0x7f120299, main.getString(R.string.MT_Protector_res_0x7f12029e)), exc);
                        break;
                    }
                    th = th.getCause();
                } else {
                    break;
                }
            }
        }
        main.m10223(exc, (DialogInterface.OnDismissListener) null);
        abstractC15440 = this.f56300.f27072;
        abstractC15440.mo23552();
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f56297.m51051();
        C15528.m36596();
    }
}
