package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 38V8 */
/* renamed from: l.ܺᩳ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16109 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        Main m7917 = c2450.m7917();
        View m10216 = m7917.m10216(R.layout.MT_Protector_res_0x7f0d00a5);
        final RadioGroup radioGroup = (RadioGroup) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0481);
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        final CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        radioGroup.check(ApplicationC20075.f65008.getBoolean("eflr", true) ? R.id.MT_Protector_res_0x7f0a0479 : R.id.MT_Protector_res_0x7f0a047a);
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("efls", false));
        checkBox2.setChecked(ApplicationC20075.f65008.getBoolean("eflfs", true));
        C19258 buildDialog = m7917.buildDialog();
        buildDialog.m44433(m5610());
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۢᩳ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z = radioGroup.getCheckedRadioButtonId() == R.id.MT_Protector_res_0x7f0a0479;
                boolean isChecked = checkBox.isChecked();
                boolean isChecked2 = checkBox2.isChecked();
                ApplicationC20075.f65008.edit().putBoolean("eflr", z).putBoolean("efls", isChecked).putBoolean("eflfs", isChecked2).apply();
                C2450 c24502 = c2450;
                new C9055(C16109.this, c24502.m7917(), c24502.m7909(), z, isChecked2, isChecked, c24502.m7922().mo6020()).m20274();
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}
