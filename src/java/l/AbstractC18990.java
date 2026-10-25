package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 34R9 */
/* renamed from: l.ᩴ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC18990 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f59869;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f59870;

    public AbstractC18990(final ActivityC21107 activityC21107) {
        View m10216 = activityC21107.m10216(R.layout.MT_Protector_res_0x7f0d009f);
        final C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final C5062 c50622 = (C5062) m10216.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner1);
        this.f59870 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        spinner.setAdapter((SpinnerAdapter) new C20065(activityC21107, activityC21107.getResources().getStringArray(R.array.MT_Protector_res_0x7f03000e)));
        spinner.setSelection(Math.min(1, ApplicationC20075.f65008.getInt("dex_search_type_class", 0)));
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC21107);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۖ᩶ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InterfaceC13049 edit = ApplicationC20075.f65008.edit();
                Spinner spinner2 = spinner;
                edit.mo25853(spinner2.getSelectedItemPosition(), "dex_search_type_class").apply();
                C5062 c50623 = c5062;
                c50623.m14610();
                C5062 c50624 = c50622;
                c50624.m14610();
                String trim = c50623.m14611().toString().trim();
                String trim2 = c50624.m14611().toString().trim();
                int selectedItemPosition = spinner2.getSelectedItemPosition();
                if (trim.isEmpty()) {
                    return;
                }
                new C4173(AbstractC18990.this, activityC21107, trim, trim2, selectedItemPosition).m20274();
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f59869 = c19258.m44415();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43825(boolean z) {
        this.f59870.setText(z ? R.string.MT_Protector_res_0x7f12090f : R.string.MT_Protector_res_0x7f1208f7);
        this.f59869.m1449();
    }
}
