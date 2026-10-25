package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 9AJ5 */
/* renamed from: l.᩸ۤܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21520 extends AbstractC8255 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4586 f69191;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69192;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22306 f69193;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69194;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22306 f69195;

    public C21520(C4586 c4586, String str, C22306 c22306, C22306 c223062, boolean z) {
        this.f69191 = c4586;
        this.f69192 = str;
        this.f69193 = c22306;
        this.f69195 = c223062;
        this.f69194 = z;
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final View mo8845(Main main) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00af);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(this.f69192);
        C4667.m13724(m10216, this.f69193, this.f69195);
        final RadioButton[] radioButtonArr = {(RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a), (RadioButton) m10216.findViewById(R.id.radioButton3)};
        C4586 c4586 = this.f69191;
        z = c4586.f14629;
        if (z) {
            radioButtonArr[0].setText(R.string.MT_Protector_res_0x7f1203ab);
            radioButtonArr[2].setText(R.string.MT_Protector_res_0x7f1203ac);
        }
        ((CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֨ۤܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                C21520.this.f69191.f14632 = z3;
            }
        });
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.checkBox2);
        final boolean z3 = this.f69194 && C21939.m49417();
        if (z3) {
            i2 = c4586.f14631;
            checkBox.setVisibility(i2 == 0 ? 0 : 8);
            z2 = c4586.f14628;
            checkBox.setChecked(z2);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۠ۤܳ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    C21520.this.f69191.f14628 = z4;
                }
            });
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܶۤܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadioButton[] radioButtonArr2 = radioButtonArr;
                int length = radioButtonArr2.length;
                for (int i3 = 0; i3 < length; i3++) {
                    RadioButton radioButton = radioButtonArr2[i3];
                    radioButton.setChecked(radioButton == view);
                }
                if (z3) {
                    checkBox.setVisibility(view.getId() != R.id.MT_Protector_res_0x7f0a0479 ? 8 : 0);
                }
            }
        };
        int i3 = 0;
        while (i3 < 3) {
            RadioButton radioButton = radioButtonArr[i3];
            i = c4586.f14631;
            radioButton.setChecked(i3 == i);
            radioButtonArr[i3].setOnClickListener(onClickListener);
            i3++;
        }
        m10216.setTag(radioButtonArr);
        return m10216;
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final boolean mo8847(View view) {
        RadioButton[] radioButtonArr = (RadioButton[]) view.getTag();
        boolean isChecked = radioButtonArr[0].isChecked();
        C4586 c4586 = this.f69191;
        if (isChecked) {
            c4586.f14631 = 0;
            return true;
        }
        if (radioButtonArr[1].isChecked()) {
            c4586.f14631 = 1;
            return true;
        }
        c4586.f14631 = 2;
        return true;
    }
}
