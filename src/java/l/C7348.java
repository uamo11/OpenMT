package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 097X */
/* renamed from: l.۟۠ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7348 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19710(final C16560 c16560, final C7309 c7309) {
        Main m39056 = c16560.m39056();
        View m10216 = m39056.m10216(R.layout.MT_Protector_res_0x7f0d00a9);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        EditText editText2 = (EditText) m10216.findViewById(R.id.editText2);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f1205b8);
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        final CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox.setText(R.string.MT_Protector_res_0x7f120466);
        checkBox2.setText(R.string.MT_Protector_res_0x7f120462);
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("aciad", true));
        checkBox2.setChecked(ActivityC16315.m38430());
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C2079.m6836(c7309.f22440, c7309.f22438, editText, editText2);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(m39056);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۛ۠ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C7309 c73092 = C7309.this;
                c73092.m19592();
                InterfaceC13049 edit = ApplicationC20075.f65008.edit();
                CheckBox checkBox3 = checkBox;
                edit.putBoolean("aciad", checkBox3.isChecked()).apply();
                CheckBox checkBox4 = checkBox2;
                boolean isChecked = checkBox4.isChecked();
                int i3 = ActivityC16315.f50233;
                C22870.m50970(ApplicationC20075.f65008, "axml_id_2_name", isChecked);
                AbstractC15440 abstractC15440 = c73092.f22436;
                AbstractC15440 abstractC154402 = c73092.f22437;
                boolean isChecked2 = checkBox4.isChecked();
                boolean isChecked3 = checkBox3.isChecked();
                AbstractC15440 m51761 = C23346.m51761(c16560, R.string.MT_Protector_res_0x7f1205b8, "mtcr");
                int i4 = C15104.f46193;
                C0994 c0994 = new C0994(C13697.class);
                c0994.m3474("saveAsPath", m51761.mo23554());
                c0994.m3474("inputPath1", abstractC15440.mo23554());
                c0994.m3474("inputPath2", abstractC154402.mo23554());
                c0994.m3475("id2name", isChecked2);
                c0994.m3475("ignoreAddOrDel", isChecked3);
                c0994.m3469();
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector_res_0x7f12030f, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new ViewOnClickListenerC11582(c7309, editText, editText2, 0));
    }
}
