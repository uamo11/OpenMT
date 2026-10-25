package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* compiled from: K6KF */
/* renamed from: l.۬᩶᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13349 extends AbstractC3723 {
    public C13349(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6898((InterfaceC7550) new C7037(context));
    }

    @Override // l.AbstractC3723
    /* renamed from: ֫ */
    public final void mo6161(final AbstractActivityC3346 abstractActivityC3346) {
        final String string = ApplicationC20075.f65008.getString("ais", "");
        String[] strArr = {abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f120aa3), abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f120055), abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12021d)};
        int i = string.isEmpty() ? 0 : string.equals("com.android.vending") ? 1 : 2;
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120054);
        buildDialog.m44439(R.layout.MT_Protector_res_0x7f0d0077);
        buildDialog.m44429(strArr, i, new DialogInterface.OnClickListener() { // from class: l.ۙ᩶᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C13349.this.m32321(abstractActivityC3346, string, dialogInterface, i2);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m32321(AbstractActivityC3346 abstractActivityC3346, String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i != 2) {
            C11356.m28106(i == 0 ? "" : "com.android.vending");
            mo6922();
            return;
        }
        C3472 c3472 = new C3472(this, abstractActivityC3346);
        c3472.m31258(R.string.MT_Protector_res_0x7f120054);
        c3472.m31256(R.string.MT_Protector_res_0x7f120058);
        c3472.m31265(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12072e));
        c3472.m31276(524289);
        c3472.m31250((CharSequence) str);
        c3472.m31244();
        c3472.m31266(true);
    }
}
