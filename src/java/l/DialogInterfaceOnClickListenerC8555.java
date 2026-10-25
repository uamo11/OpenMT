package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 3B3L */
/* renamed from: l.ۡ֨ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8555 implements DialogInterface.OnClickListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26157;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26158;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f26159;

    public /* synthetic */ DialogInterfaceOnClickListenerC8555(C22372 c22372, Object obj, int i) {
        this.f26158 = i;
        this.f26159 = c22372;
        this.f26157 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f26158) {
            case 0:
                final C4733 c4733 = (C4733) this.f26157;
                final C22372 c22372 = this.f26159;
                if (!c22372.m5426()) {
                    ((ActivityC16315) c22372.requireActivity()).m38448(c22372);
                    break;
                } else {
                    C19258 buildDialog = ((ActivityC16315) c22372.requireActivity()).buildDialog();
                    buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
                    buildDialog.m44416(R.string.MT_Protector_res_0x7f1201ee);
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.֡֨ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            C22372 c223722 = C22372.this;
                            ((ActivityC16315) c223722.requireActivity()).m38448(c223722);
                        }
                    });
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.ۚ֨ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            C22372.this.m50181(c4733);
                        }
                    });
                    buildDialog.m44428(false);
                    buildDialog.m44438();
                    break;
                }
            default:
                ActivityC16315 activityC16315 = (ActivityC16315) this.f26157;
                this.f26159.m50232();
                activityC16315.m38449(false);
                break;
        }
    }
}
