package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* compiled from: N9TB */
/* renamed from: l.᩸ۙ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C21362 extends AbstractC3723 {
    public C21362(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m6898((InterfaceC7550) new C6576(this));
    }

    public C21362(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6898((InterfaceC7550) new C6576(this));
    }

    public C21362(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6898((InterfaceC7550) new C6576(this));
    }

    public C21362(Context context) {
        super(context);
        m6898((InterfaceC7550) new C6576(this));
    }

    @Override // l.AbstractC3723
    /* renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        m48400(abstractActivityC3346, m6909(), m11313().getString(m6911(), "10MB"), new C12027(2, this));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48401(C21362 c21362, String str) {
        try {
            c21362.m11313().edit().putString(c21362.m6911(), str).apply();
            c21362.mo6922();
            C17897.m41874();
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48400(AbstractActivityC3346 abstractActivityC3346, CharSequence charSequence, String str, InterfaceC13041 interfaceC13041) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00b3);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017a);
        Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        spinner.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, new String[]{"MB", "KB"}));
        if (str.endsWith("KB")) {
            spinner.setSelection(1);
        }
        try {
            editText.setText(String.valueOf(Integer.parseInt(str.substring(0, str.length() - 2))));
        } catch (NumberFormatException unused) {
            editText.setText("10");
            spinner.setSelection(0);
        }
        editText.selectAll();
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44436(charSequence);
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC1723(editText, spinner, interfaceC13041, 1));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
        C4925.m14329(editText);
    }
}
