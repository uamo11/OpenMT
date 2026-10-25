package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: O60D */
/* renamed from: l.ۗ۠ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC3113 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C10235 f9728;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f9729;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2978 f9730;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Spinner f9731;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Spinner f9732;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f9733;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f9734;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View f9735;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public AbstractDialogInterfaceOnClickListenerC3113(C16560 c16560, String str, boolean z, String str2) {
        Main m39056 = c16560.m39056();
        View m10216 = m39056.m10216(R.layout.MT_Protector_res_0x7f0d0114);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f1205ad);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        editText.setText(str);
        editText.setKeyListener(null);
        this.f9735 = m10216.findViewById(R.id.header3);
        this.f9728 = (C10235) m10216.findViewById(R.id.editTextView);
        Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner1);
        this.f9732 = spinner;
        Spinner spinner2 = (Spinner) m10216.findViewById(R.id.spinner2);
        this.f9731 = spinner2;
        this.f9729 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a04ac);
        this.f9733 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a02d4);
        String[] stringArray = m39056.getResources().getStringArray(R.array.MT_Protector_res_0x7f030028);
        String[] stringArray2 = m39056.getResources().getStringArray(R.array.MT_Protector_res_0x7f030027);
        spinner.setAdapter((SpinnerAdapter) new C20065(m39056, stringArray));
        spinner2.setAdapter((SpinnerAdapter) new C20065(m39056, stringArray2));
        final String str3 = z ? "zacl" : "zcl";
        spinner.setSelection(Math.max(0, Math.min(ApplicationC20075.f65008.getInt(str3, z ? 6 : 3), stringArray.length - 1)));
        this.f9730 = (C2978) m10216.findViewById(R.id.switch1);
        C19258 buildDialog = m39056.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44428(false);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, this);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, this);
        if (z) {
            buildDialog.m44440(R.string.MT_Protector_res_0x7f120104, (DialogInterface.OnClickListener) null);
        }
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        this.f9734 = m44438;
        m44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.᩶۠ܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractDialogInterfaceOnClickListenerC3113 abstractDialogInterfaceOnClickListenerC3113 = AbstractDialogInterfaceOnClickListenerC3113.this;
                C2978 c2978 = abstractDialogInterfaceOnClickListenerC3113.f9730;
                InterfaceC13049 edit = ApplicationC20075.f65008.edit();
                if (abstractDialogInterfaceOnClickListenerC3113.f9733.getVisibility() == 0) {
                    edit.mo25853(abstractDialogInterfaceOnClickListenerC3113.f9732.getSelectedItemPosition(), str3);
                }
                if (c2978.getVisibility() == 0) {
                    edit.putBoolean("dzds", c2978.isChecked());
                }
                edit.apply();
            }
        });
        m44438.m1437(new DialogInterface.OnKeyListener() { // from class: l.ۙ۠ܳ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC3113 abstractDialogInterfaceOnClickListenerC3113 = AbstractDialogInterfaceOnClickListenerC3113.this;
                abstractDialogInterfaceOnClickListenerC3113.getClass();
                if (keyEvent.getAction() != 0 || i != 4) {
                    return false;
                }
                abstractDialogInterfaceOnClickListenerC3113.f9734.dismiss();
                return true;
            }
        });
        if (z) {
            C10025.m25199(c16560, m44438, str2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9490(String str) {
        this.f9729.setVisibility(0);
        this.f9728.mo25910((CharSequence) str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m9491() {
        return this.f9728.m30436().toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9489(int i) {
        String quantityString = C4925.m14338().getQuantityString(R.plurals.MT_Protector_res_0x7f110001, i);
        C2978 c2978 = this.f9730;
        c2978.setText(quantityString);
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("dzds", false));
        c2978.setVisibility(0);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m9494() {
        this.f9733.setVisibility(8);
        this.f9731.setTranslationY(0.0f);
        this.f9735.setTranslationY(0.0f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9488() {
        return this.f9732.getSelectedItemPosition();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m9492() {
        return this.f9731.getSelectedItemPosition();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m9493() {
        return this.f9730.isChecked();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9487(int i, C8918 c8918) {
        switch (i) {
            case 0:
                c8918.m23018(0);
                return false;
            case 1:
                c8918.m23009(1);
                return false;
            case 2:
                c8918.m23009(3);
                return false;
            case 3:
                c8918.m23009(-1);
                return false;
            case 4:
                c8918.m23009(9);
                return false;
            case 5:
                c8918.m23009(10);
                return false;
            case 6:
                c8918.m23009(-1);
                c8918.m23025();
                return true;
            default:
                return false;
        }
    }
}
