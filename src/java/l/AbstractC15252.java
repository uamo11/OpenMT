package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* compiled from: H5EO */
/* renamed from: l.ܶ۬ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC15252 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f46822;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f46823;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView f46824;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f46826;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46827 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f46825 = true;

    /* renamed from: ܽ */
    public abstract boolean mo4060();

    public AbstractC15252(AbstractActivityC3346 abstractActivityC3346) {
        this.f46822 = abstractActivityC3346;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00ca);
        this.f46826 = (LinearLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02da);
        this.f46824 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f46823 = c19258.m44415();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36262() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f46823;
        dialogInterfaceC0206.m1449();
        if (this.f46825) {
            this.f46825 = false;
            dialogInterfaceC0206.m1447().setOnClickListener(new ViewOnClickListenerC10940(1, this));
            dialogInterfaceC0206.m1446().setOnClickListener(new ViewOnClickListenerC2205(1, this));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36251(AbstractC15252 abstractC15252) {
        if (abstractC15252.mo4060()) {
            abstractC15252.f46823.dismiss();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36252(AbstractC15252 abstractC15252) {
        ArrayList arrayList = abstractC15252.f46827;
        if (arrayList.isEmpty()) {
            return;
        }
        EditText editText = ((TextInputLayout) arrayList.get(0)).getEditText();
        C11003.requireNonNull(editText);
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Button m36258() {
        if (this.f46825) {
            throw new NullPointerException("Please call show la least once");
        }
        return this.f46823.m1447();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36260(int i) {
        this.f46824.setText(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36257(int... iArr) {
        for (int i : iArr) {
            m36256(i, null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36256(int i, String str) {
        AbstractActivityC3346 abstractActivityC3346 = this.f46822;
        LayoutInflater from = LayoutInflater.from(abstractActivityC3346);
        ViewGroup viewGroup = this.f46826;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.MT_Protector_res_0x7f0d00cb, viewGroup, false);
        viewGroup.addView(textInputLayout);
        this.f46827.add(textInputLayout);
        EditText editText = textInputLayout.getEditText();
        if (str != null && editText != null) {
            editText.setText(str);
        }
        textInputLayout.setHint(abstractActivityC3346.getString(i));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout m36259(int i) {
        return (TextInputLayout) this.f46827.get(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EditText m36254(int i) {
        EditText editText = ((TextInputLayout) this.f46827.get(i)).getEditText();
        C11003.requireNonNull(editText);
        return editText;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m36261() {
        return this.f46827.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36255() {
        this.f46823.dismiss();
    }
}
