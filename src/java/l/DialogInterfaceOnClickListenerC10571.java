package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: X977 */
/* renamed from: l.ۤ᩸᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC10571 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16560 f31722;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f31723;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CheckBox f31724;

    public DialogInterfaceOnClickListenerC10571(Main main, C16560 c16560) {
        RadioButton[] radioButtonArr = {(RadioButton) r8.findViewById(R.id.MT_Protector_res_0x7f0a047e), (RadioButton) r8.findViewById(R.id.MT_Protector_res_0x7f0a047d), (RadioButton) r8.findViewById(R.id.MT_Protector_res_0x7f0a047f), (RadioButton) r8.findViewById(R.id.MT_Protector_res_0x7f0a0480)};
        this.f31723 = radioButtonArr;
        this.f31722 = c16560;
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00f9);
        radioButtonArr[0].setOnClickListener(this);
        radioButtonArr[1].setOnClickListener(this);
        radioButtonArr[2].setOnClickListener(this);
        radioButtonArr[3].setOnClickListener(this);
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0540);
        this.f31724 = checkBox;
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a053f).setVisibility(8);
        radioButtonArr[C7489.m20112(C19890.f64279)].setChecked(true);
        checkBox.setChecked(C7489.m20122(C19890.f64279));
        C19258 buildDialog = main.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, this);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        while (i2 < 4 && !this.f31723[i2].isChecked()) {
            i2++;
        }
        if (this.f31724.isChecked()) {
            i2 += 4;
        }
        C19890.f64279 = i2;
        ApplicationC20075.f65008.edit().mo25852((byte) i2, "rbs").apply();
        this.f31722.m39049();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton[] radioButtonArr = this.f31723;
        radioButtonArr[0].setChecked(false);
        radioButtonArr[1].setChecked(false);
        radioButtonArr[2].setChecked(false);
        radioButtonArr[3].setChecked(false);
        ((RadioButton) view).setChecked(true);
    }
}
