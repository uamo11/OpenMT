package l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: R7YU */
/* renamed from: l.ۜۡ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC6669 extends AbstractActivityC3346 {

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20722 = 0;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C23602 f20723;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "AccountDeletionActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector_res_0x7f0d001c);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ۨۢ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC6669.f20722;
                ActivityC6669.this.finish();
            }
        });
        AbstractC16157 m46962 = C20500.m46962((Context) this, false);
        View m10241 = m10241(R.id.MT_Protector_res_0x7f0a04cc);
        TextView textView = (TextView) m10241(R.id.textView);
        CheckBox checkBox = (CheckBox) m10241(R.id.MT_Protector_res_0x7f0a00da);
        CheckBox checkBox2 = (CheckBox) m10241(R.id.checkBox2);
        Button button = (Button) m10241(R.id.MT_Protector_res_0x7f0a00a2);
        button.setEnabled(false);
        m10241.setVisibility(4);
        new C1730(this, m46962, textView, checkBox, checkBox2, button, m10241).m20274();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18206(ActivityC6669 activityC6669) {
        String str;
        boolean z;
        EditText editText;
        View m10216 = activityC6669.m10216(R.layout.MT_Protector_res_0x7f0d0094);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0397);
        str = activityC6669.f20723.f76515;
        textView.setText(str);
        Button button = (Button) m10216.findViewById(R.id.button1);
        button.setEnabled(false);
        z = activityC6669.f20723.f76511;
        if (z) {
            m10216.findViewById(R.id.MT_Protector_res_0x7f0a023b).setVisibility(8);
            editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
            editText.addTextChangedListener(new C10903(button));
            m10216.findViewById(R.id.button2).setOnClickListener(new ViewOnClickListenerC22396(activityC6669, 1));
        } else {
            m10216.findViewById(R.id.MT_Protector_res_0x7f0a023a).setVisibility(8);
            editText = (EditText) m10216.findViewById(R.id.editText2);
            editText.addTextChangedListener(new C17958(button));
        }
        C19258 buildDialog = activityC6669.buildDialog();
        buildDialog.m44421(m10216);
        button.setOnClickListener(new ViewOnClickListenerC17845(activityC6669, editText, buildDialog.m44438()));
        C4925.m14329(editText);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18204(final ActivityC6669 activityC6669, EditText editText, final DialogInterfaceC0206 dialogInterfaceC0206, final View view) {
        boolean z;
        String str;
        final String obj = editText.getText().toString();
        z = activityC6669.f20723.f76511;
        if (z) {
            if (!obj.matches("\\d{6}")) {
                C21374.m48457(R.string.MT_Protector_res_0x7f120ae3);
                return;
            }
        } else if (obj.length() < 7) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120b16);
            return;
        } else if (!C23343.m51757(obj)) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120b15);
            return;
        }
        C19258 buildDialog = activityC6669.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
        str = activityC6669.f20723.f76512;
        buildDialog.m44424(str);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩺ۢ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC6669.f20722;
                View view2 = view;
                view2.setEnabled(false);
                new C14429(view2, activityC6669, dialogInterfaceC0206, obj).m20274();
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}
