package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;

/* compiled from: LAQJ */
/* renamed from: l.ۢۚܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9385 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22933 f28503;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22789 f28504 = new C22789();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f28505;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14197 f28506;

    public C9385(C10671 c10671) {
        this.f28505 = c10671;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C10671 c10671 = this.f28505;
        C22933 c22933 = new C22933(c10671.f32087);
        c22933.m51049(R.string.MT_Protector_res_0x7f120797);
        c22933.m51040(c10671.getFileName());
        c22933.mo49541(new View.OnClickListener() { // from class: l.᩷ۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9385.this.f28503.m51051();
            }
        });
        c22933.mo49547();
        this.f28503 = c22933;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d7  */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩺ۚܿ] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.pm.PackageInstaller] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.content.pm.PackageInstaller$Session, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9385.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f28503.m51053()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12008a);
            return;
        }
        if (C3424.m10402()) {
            C22870.m50970(ApplicationC20075.f65008, "show_apks_miui_warning", false);
        }
        C10671 c10671 = this.f28505;
        C20549.m47079(c10671.f32087, c10671.getFileName(), this.f28504.f73581);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (!(exc instanceof C17020) || this.f28503.m51042()) {
            if (exc instanceof CancellationException) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12008a);
                return;
            }
            String message = exc.getMessage();
            boolean m10402 = C3424.m10402();
            C10671 c10671 = this.f28505;
            if (!m10402 || message == null || !message.contains("INSTALL_FAILED_INTERNAL_ERROR")) {
                c10671.m26776(exc);
            } else {
                C22870.m50970(ApplicationC20075.f65008, "show_apks_miui_warning", true);
                c10671.m26774(R.string.MT_Protector_res_0x7f12008b);
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f28503.m51051();
    }
}
