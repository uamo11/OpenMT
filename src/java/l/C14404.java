package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

/* compiled from: 313O */
/* renamed from: l.ܳ۠ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14404 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3822 f44166;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f44167;

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
    }

    public C14404(C3822 c3822, Runnable runnable) {
        this.f44166 = c3822;
        this.f44167 = runnable;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C3822.m11576(this.f44166);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C8776 c8776;
        C8776 c87762;
        DialogInterfaceC0206 dialogInterfaceC0206;
        DialogInterfaceC0206 dialogInterfaceC02062;
        DialogInterfaceC0206 dialogInterfaceC02063;
        C5732 c5732;
        final C3822 c3822 = this.f44166;
        c8776 = c3822.f12234;
        ((C6644) c8776.getAdapter()).m18161();
        c87762 = c3822.f12234;
        c87762.scrollToPosition(0);
        dialogInterfaceC0206 = c3822.f12238;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC02062 = c3822.f12238;
        Button m1448 = dialogInterfaceC02062.m1448();
        if (m1448 != null) {
            m1448.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ۠ܿ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3822.m11571(C3822.this, view);
                }
            });
        }
        dialogInterfaceC02063 = c3822.f12238;
        Button m1446 = dialogInterfaceC02063.m1446();
        if (m1446 != null) {
            c5732 = c3822.f12236;
            if (c5732.m16168()) {
                if (ApplicationC20075.f65008.getBoolean("show_install_file_transfer", false)) {
                    m1446.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۠ܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3822.m11573(C14404.this.f44166, false);
                        }
                    });
                } else {
                    m1446.setVisibility(8);
                    C3822.m11573(c3822, true);
                }
            } else {
                m1446.setVisibility(8);
            }
        }
        Runnable runnable = this.f44167;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346;
        abstractActivityC3346 = this.f44166.f12233;
        abstractActivityC3346.m10223(exc, (DialogInterface.OnDismissListener) null);
    }
}
