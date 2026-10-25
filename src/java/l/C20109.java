package l;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 9AJ5 */
/* renamed from: l.᩶ۤܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20109 extends AbstractC8255 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22306 f65120;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f65121;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Button f65122;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4586 f65123;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public TextView f65124;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22306 f65125;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65126;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f65127;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f65128 = new RadioButton[3];

    public C20109(C4586 c4586, String str, C22306 c22306, C22306 c223062, int i, int[] iArr) {
        this.f65123 = c4586;
        this.f65121 = str;
        this.f65120 = c22306;
        this.f65125 = c223062;
        this.f65126 = i;
        this.f65127 = iArr;
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final View mo8845(Main main) {
        boolean z;
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00af);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(this.f65121);
        C4667.m13724(m10216, this.f65120, this.f65125);
        RadioButton radioButton = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479);
        RadioButton[] radioButtonArr = this.f65128;
        radioButtonArr[0] = radioButton;
        radioButtonArr[1] = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a);
        radioButtonArr[2] = (RadioButton) m10216.findViewById(R.id.radioButton3);
        z = this.f65123.f14629;
        if (z) {
            radioButtonArr[0].setText(R.string.MT_Protector_res_0x7f1203ab);
            radioButtonArr[2].setText(R.string.MT_Protector_res_0x7f1203ac);
        }
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da).setVisibility(8);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0543).setVisibility(8);
        m10216.findViewById(R.id.checkBox2).setVisibility(8);
        this.f65124 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a01e7);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩹ۤܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20109.m46367(C20109.this, view);
            }
        };
        int i = 0;
        while (i < radioButtonArr.length) {
            radioButtonArr[i].setChecked(i == this.f65126);
            radioButtonArr[i].setOnClickListener(onClickListener);
            i++;
        }
        m46366();
        return m10216;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46367(C20109 c20109, View view) {
        RadioButton[] radioButtonArr = c20109.f65128;
        int length = radioButtonArr.length;
        for (int i = 0; i < length; i++) {
            RadioButton radioButton = radioButtonArr[i];
            radioButton.setChecked(radioButton == view);
        }
        c20109.m46366();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46366() {
        boolean isChecked = this.f65128[0].isChecked();
        this.f65124.setVisibility(isChecked ? 0 : 8);
        Button button = this.f65122;
        if (button != null) {
            button.setEnabled(!isChecked);
        }
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final void mo10817(DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f65122 = dialogInterfaceC0206.m1447();
        m46366();
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final boolean mo8847(View view) {
        RadioButton[] radioButtonArr = this.f65128;
        if (radioButtonArr[0].isChecked()) {
            return false;
        }
        this.f65127[0] = radioButtonArr[1].isChecked() ? 1 : 2;
        return true;
    }
}
