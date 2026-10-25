package l;

import android.content.DialogInterface;

/* compiled from: P1ZZ */
/* renamed from: l.۠᩹᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8475 extends AbstractDialogInterfaceOnClickListenerC3113 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20470 f25907;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25908;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f25909;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f25910;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8475(C20470 c20470, C16560 c16560, String str, boolean z, String str2, C10738 c10738, C2450 c2450, String str3) {
        super(c16560, str, z, str2);
        this.f25907 = c20470;
        this.f25909 = c10738;
        this.f25910 = c2450;
        this.f25908 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            boolean m26936 = this.f25909.m26936();
            final C2450 c2450 = this.f25910;
            if (m26936) {
                C10025.m25197(new InterfaceC12846() { // from class: l.֨᩹᩻
                    @Override // l.InterfaceC12846
                    public final /* synthetic */ void onCanceled() {
                    }

                    @Override // l.InterfaceC12846
                    /* renamed from: ֫ */
                    public final void mo3776(C11667 c11667, boolean z) {
                        C20470.m46863(r0.f25907, c2450, C8475.this.m9492(), c11667, z);
                    }

                    @Override // l.InterfaceC12846
                    /* renamed from: ֫ */
                    public final /* synthetic */ boolean mo3777(Exception exc) {
                        return false;
                    }
                }, c2450.m7917(), this.f25908);
            } else {
                C20470.m46863(this.f25907, c2450, m9492(), null, false);
            }
        }
    }
}
