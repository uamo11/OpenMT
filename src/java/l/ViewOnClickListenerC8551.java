package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: D1Y9 */
/* renamed from: l.ۡ֨ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC8551 implements View.OnClickListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16560 f26144;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f26145;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f26146;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10235 f26147;

    public ViewOnClickListenerC8551(C16560 c16560) {
        this.f26144 = c16560;
        View m10216 = c16560.m39056().m10216(R.layout.MT_Protector_res_0x7f0d00a0);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120203);
        C10235 c10235 = (C10235) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f26147 = c10235;
        this.f26145 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0199);
        c10235.m30313(new C9257(this));
        C19258 buildDialog = c16560.m39056().buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1203fb, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f120393, (DialogInterface.OnClickListener) null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44428(false);
        DialogInterfaceC0206 m44415 = buildDialog.m44415();
        this.f26146 = m44415;
        C5088.m14637(m44415);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22273() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f26146;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        dialogInterfaceC0206.m1446().setOnClickListener(this);
        C4925.m14329(this.f26147);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String obj = this.f26147.m30436().toString();
        if (obj.isEmpty()) {
            return;
        }
        boolean contains = obj.contains("/");
        boolean z = view.getId() == 16908313;
        boolean contains2 = obj.contains("\\");
        TextView textView = this.f26145;
        if (contains2 || obj.equals("/")) {
            textView.setVisibility(0);
            textView.setText(R.string.MT_Protector_res_0x7f1203ae);
            return;
        }
        C16560 c16560 = this.f26144;
        if (!contains) {
            boolean mo13919 = c16560.m39044().mo6020().mo13919();
            for (InterfaceC17889 interfaceC17889 : c16560.m39028()) {
                String name = interfaceC17889.getName();
                if (mo13919 ? name.equalsIgnoreCase(obj) : name.equals(obj)) {
                    if (interfaceC17889.isDirectory()) {
                        if (z) {
                            textView.setVisibility(0);
                            textView.setText(R.string.MT_Protector_res_0x7f1203fc);
                            return;
                        } else {
                            textView.setVisibility(0);
                            textView.setText(R.string.MT_Protector_res_0x7f1208c2);
                            return;
                        }
                    }
                    if (z) {
                        textView.setVisibility(0);
                        textView.setText(R.string.MT_Protector_res_0x7f1208c1);
                        return;
                    } else {
                        textView.setVisibility(0);
                        textView.setText(R.string.MT_Protector_res_0x7f1203a1);
                        return;
                    }
                }
            }
        }
        try {
            c16560.m39044().mo15161(c16560, obj, z);
            this.f26146.dismiss();
        } catch (C1637 e) {
            String message = e.getMessage();
            textView.setVisibility(0);
            textView.setText(message);
        }
    }
}
