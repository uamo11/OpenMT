package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: Y6Y9 */
/* renamed from: l.᩻۫᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23705 implements View.OnClickListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76768;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76769;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23586 f76770;

    public /* synthetic */ ViewOnClickListenerC23705(EditText editText, AbstractActivityC3346 abstractActivityC3346) {
        this.f76769 = 2;
        this.f76768 = editText;
        this.f76770 = abstractActivityC3346;
    }

    public /* synthetic */ ViewOnClickListenerC23705(InterfaceC23586 interfaceC23586, Object obj, int i) {
        this.f76769 = i;
        this.f76770 = interfaceC23586;
        this.f76768 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f76769) {
            case 0:
                final AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f76770;
                final RunnableC14532 runnableC14532 = (RunnableC14532) this.f76768;
                View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d007e);
                ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f12007f);
                final InterfaceC23679 m22890 = C8863.m22890(abstractActivityC3346, m10216, C19911.m45806());
                C19258 buildDialog = abstractActivityC3346.buildDialog();
                buildDialog.m44421(m10216);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                final DialogInterfaceC0206 m16343 = C5834.m16343(buildDialog, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f120634, (DialogInterface.OnClickListener) null);
                final TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0524);
                m22890.mo28354(new Runnable() { // from class: l.ۚ۫᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8863.m22892(textView, m22890.mo28356());
                        m16343.m1447().setEnabled(!r0.mo28357());
                    }
                });
                final C14506 c14506 = new C14506(m10216);
                m16343.m1448().setOnClickListener(new ViewOnClickListenerC3619(abstractActivityC3346, 1));
                m16343.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨۫᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DialogInterfaceC0206 dialogInterfaceC0206 = DialogInterfaceC0206.this;
                        if (dialogInterfaceC0206.m1442()) {
                            InterfaceC23679 interfaceC23679 = m22890;
                            if (interfaceC23679.mo28355()) {
                                return;
                            }
                            C16955 mo28353 = interfaceC23679.mo28353();
                            AbstractC13262 m22889 = C8863.m22889(mo28353.m39780());
                            if (m22889 == null) {
                                m22889 = (AbstractC13262) C8863.f26982.get(0);
                            }
                            boolean z = m22889 instanceof C22435;
                            C14506 c145062 = c14506;
                            if (!z || c145062.m34619(dialogInterfaceC0206)) {
                                RunnableC14532 runnableC145322 = runnableC14532;
                                TextView textView2 = textView;
                                AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                                C10025.m25196(abstractActivityC33462, mo28353, true, (InterfaceC12846) new C10945(z, c145062, dialogInterfaceC0206, mo28353, runnableC145322, textView2, abstractActivityC33462));
                            }
                        }
                    }
                });
                break;
            case 1:
                ActivityC14946.m35403((ActivityC14946) this.f76770, (DialogInterfaceC0206) this.f76768);
                break;
            case 2:
                EditText editText = (EditText) this.f76768;
                AbstractActivityC3346 abstractActivityC33462 = (AbstractActivityC3346) this.f76770;
                String obj = editText.getText().toString();
                ArrayList arrayList = new ArrayList(C14776.f45125 - 1);
                int i = -1;
                for (int i2 = 0; i2 < C14776.f45125; i2++) {
                    String m35153 = C14776.m35153(i2);
                    if (!m35153.equals("UTF-8-BOM")) {
                        if (m35153.equalsIgnoreCase(obj)) {
                            i = arrayList.size();
                        }
                        arrayList.add(m35153);
                    }
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C19258 buildDialog2 = abstractActivityC33462.buildDialog();
                buildDialog2.m44433(R.string.MT_Protector_res_0x7f1206b6);
                buildDialog2.m44429(strArr, i, new DialogInterfaceOnClickListenerC14086(2, editText, strArr));
                buildDialog2.m44442(R.string.MT_Protector_res_0x7f120189, null);
                buildDialog2.m44438();
                break;
            default:
                C21100.m48035((DialogInterfaceC0206) this.f76770, (C8817) this.f76768);
                break;
        }
    }
}
