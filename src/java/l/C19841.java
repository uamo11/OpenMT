package l;

import android.content.DialogInterface;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: E4GI */
/* renamed from: l.᩶֨ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19841 extends AbstractC8255 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12079 f64099;

    public C19841(C12079 c12079) {
        this.f64099 = c12079;
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final View mo8845(Main main) {
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00de);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0397)).setText((CharSequence) null);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        m10216.setTag(editText);
        C4925.m14329(editText);
        return m10216;
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final boolean mo8847(View view) {
        InterfaceC12784 interfaceC12784;
        String obj = ((EditText) view.getTag()).getText().toString();
        if (obj.isEmpty()) {
            C21374.m48462(R.string.MT_Protector_res_0x7f120305, 0).m48468();
            return false;
        }
        interfaceC12784 = this.f64099.f36117;
        interfaceC12784.mo15503(obj);
        return true;
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final void mo8846(C19258 c19258) {
        c19258.m44440(R.string.MT_Protector_res_0x7f1201a8, (DialogInterface.OnClickListener) null);
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final void mo10817(DialogInterfaceC0206 dialogInterfaceC0206) {
        dialogInterfaceC0206.m1448().setOnClickListener(new ViewOnClickListenerC21957());
    }
}
