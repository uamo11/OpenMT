package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: O515 */
/* renamed from: l.֡֫᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0112 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f1090;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Spinner f1091;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f1092;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f1093;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f1094;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f1095;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1096;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f1097;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Spinner f1098;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f1099;

    public C0112(final Main main, String str, String str2, boolean z, final Runnable runnable) {
        this.f1095 = z;
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00ad);
        this.f1092 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f1091 = (Spinner) m10216.findViewById(R.id.spinner1);
        this.f1098 = (Spinner) m10216.findViewById(R.id.spinner2);
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0074);
        this.f1090 = checkBox;
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0075);
        this.f1093 = checkBox2;
        if (!z) {
            checkBox.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        C19258 buildDialog = main.buildDialog();
        buildDialog.m44421(m10216);
        this.f1097 = buildDialog.m44415();
        ArrayList m50655 = C22660.m50655();
        this.f1096 = m50655;
        int size = m50655.size();
        String[] strArr = new String[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C11372 c11372 = (C11372) this.f1096.get(i2);
            strArr[i2] = c11372.f34030 + " - " + c11372.f34032;
        }
        C20065 c20065 = new C20065(main, strArr);
        this.f1091.setAdapter((SpinnerAdapter) c20065);
        this.f1098.setAdapter((SpinnerAdapter) c20065);
        this.f1091.setOnClickListener(new View.OnClickListener() { // from class: l.ܺ֫᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0112.m1101(C0112.this, main);
            }
        });
        this.f1098.setOnClickListener(new View.OnClickListener() { // from class: l.ۖ֫᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0112.m1103(C0112.this, main);
            }
        });
        if (str == null) {
            Spinner spinner = this.f1091;
            this.f1094 = 0;
            spinner.setSelection(0);
        } else {
            Spinner spinner2 = this.f1091;
            ArrayList arrayList = this.f1096;
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    i3 = 0;
                    break;
                } else if (((C11372) arrayList.get(i3)).f34030.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            this.f1094 = i3;
            spinner2.setSelection(i3);
        }
        if (str2 == null) {
            Spinner spinner3 = this.f1098;
            this.f1099 = 0;
            spinner3.setSelection(0);
        } else {
            Spinner spinner4 = this.f1098;
            ArrayList arrayList2 = this.f1096;
            int size3 = arrayList2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size3) {
                    break;
                }
                if (((C11372) arrayList2.get(i4)).f34030.equals(str2)) {
                    i = i4;
                    break;
                }
                i4++;
            }
            this.f1099 = i;
            spinner4.setSelection(i);
        }
        this.f1097.m1434(-1, C4925.m14327(R.string.MT_Protector_res_0x7f12070a), new DialogInterface.OnClickListener() { // from class: l.ۘ֫᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                runnable.run();
            }
        });
        this.f1097.m1434(-2, C4925.m14327(R.string.MT_Protector_res_0x7f12015e), null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1101(C0112 c0112, AbstractActivityC3346 abstractActivityC3346) {
        C4779 c4779 = new C4779(abstractActivityC3346, c0112.f1096);
        c4779.m13962(R.string.MT_Protector_res_0x7f120743);
        c4779.m13960(c0112.f1091.getSelectedItemPosition());
        c4779.m13961(new C19164(c0112));
        c4779.m13959();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1103(final C0112 c0112, AbstractActivityC3346 abstractActivityC3346) {
        C4779 c4779 = new C4779(abstractActivityC3346, c0112.f1096);
        c4779.m13962(R.string.MT_Protector_res_0x7f120740);
        c4779.m13960(c0112.f1098.getSelectedItemPosition());
        c4779.m13961(new InterfaceC20302() { // from class: l.ᩴ֫᩻
            @Override // l.InterfaceC20302
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo42938(int i, C11372 c11372) {
                C0112.this.f1098.setSelection(i);
            }
        });
        c4779.m13959();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m1109() {
        return this.f1091.getSelectedItemPosition() != this.f1094 || this.f1098.getSelectedItemPosition() != this.f1099 || m1108() || m1110();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m1108() {
        return this.f1095 && this.f1090.isChecked();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m1110() {
        return this.f1095 && this.f1093.isChecked();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m1106() {
        return ((C11372) this.f1096.get(this.f1091.getSelectedItemPosition())).f34032;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1104() {
        return ((C11372) this.f1096.get(this.f1098.getSelectedItemPosition())).f34032;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m1107() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f1097;
        dialogInterfaceC0206.m1449();
        C8960.m23097(dialogInterfaceC0206);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1105(String str) {
        this.f1092.setText(str);
    }
}
