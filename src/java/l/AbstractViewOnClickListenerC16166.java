package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: 251F */
/* renamed from: l.ܺ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC16166 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f49797;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f49798;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f49799;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5062 f49800;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC21107 f49801;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f49802;

    /* renamed from: ֫ */
    public abstract void mo2795();

    /* renamed from: ֫ */
    public abstract void mo2796(Pattern pattern, String str);

    public AbstractViewOnClickListenerC16166(ActivityC21107 activityC21107) {
        this.f49801 = activityC21107;
        View m10216 = activityC21107.m10216(R.layout.MT_Protector_res_0x7f0d009d);
        this.f49800 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        this.f49798 = checkBox;
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        this.f49797 = checkBox2;
        this.f49799 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("dex_search_match_case", false));
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۢ᩶ܽ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AbstractViewOnClickListenerC16166.this.f49800.m14609(z);
            }
        });
        checkBox2.setChecked(ApplicationC20075.f65008.getBoolean("dex_search_regex", false));
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC21107);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f49802 = c19258.m44415();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38101(boolean z) {
        this.f49799.setText(z ? R.string.MT_Protector_res_0x7f12090f : R.string.MT_Protector_res_0x7f1208f4);
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f49802;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Pattern compile;
        boolean isChecked = this.f49798.isChecked();
        boolean isChecked2 = this.f49797.isChecked();
        C5062 c5062 = this.f49800;
        String obj = c5062.m14611().toString();
        String m11985 = !isChecked2 ? C3939.m11985(obj) : obj;
        try {
            if (isChecked) {
                compile = Pattern.compile(m11985, 8);
            } else {
                compile = Pattern.compile(m11985, 74);
            }
            ApplicationC20075.f65008.edit().putBoolean("dex_search_match_case", isChecked).putBoolean("dex_search_regex", isChecked2).apply();
            c5062.m14610();
            this.f49802.dismiss();
            new C9112(this, compile, obj).m20274();
        } catch (PatternSyntaxException e) {
            C21374.m48459((CharSequence) e.getMessage());
            c5062.requestFocus();
        }
    }
}
