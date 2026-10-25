package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: IB3L */
/* renamed from: l.᩻᩶ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23926 extends AbstractC10128 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19944 f77598;

    public C23926(InterfaceC19944 interfaceC19944) {
        super(R.string.MT_Protector_res_0x7f1205ff, R.drawable.MT_Protector_res_0x7f080237);
        this.f77598 = interfaceC19944;
    }

    @Override // l.AbstractC10128
    /* renamed from: ֫ */
    public final void mo5346(final C16560 c16560) {
        if (c16560.m39030()) {
            final List list = (List) C5378.stream(c16560.m39062()).filter(new C18282(0)).map(new C17576(0)).collect(C22976.toList());
            if (!list.isEmpty()) {
                CharSequence[] charSequenceArr = {C4925.m14327(R.string.MT_Protector_res_0x7f1208f8), C4925.m14327(R.string.MT_Protector_res_0x7f1208fa)};
                C19258 buildDialog = c16560.m39056().buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f1205ff);
                buildDialog.m44429(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ܳ᩶ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C23926.m52691(C23926.this, c16560, list, dialogInterface, i);
                    }
                });
                buildDialog.m44438();
                return;
            }
        }
        new C14298(c16560, this.f77598);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52691(C23926 c23926, C16560 c16560, List list, DialogInterface dialogInterface, int i) {
        InterfaceC19944 interfaceC19944 = c23926.f77598;
        if (i == 0) {
            new C14298(c16560, interfaceC19944);
        } else {
            new C14298(c16560, interfaceC19944).m34119(list);
        }
        dialogInterface.dismiss();
    }
}
