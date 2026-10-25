package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.DigitsKeyListener;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* compiled from: 95HF */
/* renamed from: l.᩸ܰܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnLongClickListenerC21624 implements View.OnLongClickListener, View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f69411;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f69412;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ViewGroup f69413;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20213 f69414;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69415;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f69416;

    public ViewOnLongClickListenerC21624(C20213 c20213, int i, int i2) {
        ViewOnClickListenerC5396 viewOnClickListenerC5396;
        this.f69414 = c20213;
        this.f69416 = i;
        this.f69415 = i2;
        viewOnClickListenerC5396 = c20213.f65393;
        ViewGroup viewGroup = (ViewGroup) viewOnClickListenerC5396.m10241(i2);
        this.f69413 = viewGroup;
        viewGroup.setOnClickListener(this);
        viewGroup.setOnLongClickListener(this);
        this.f69411 = (TextView) viewGroup.getChildAt(1);
        this.f69412 = (TextView) viewGroup.getChildAt(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48846(int i) {
        int i2 = this.f69416;
        ViewGroup viewGroup = this.f69413;
        TextView textView = this.f69412;
        TextView textView2 = this.f69411;
        if (i >= i2) {
            textView2.setEnabled(true);
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            viewGroup.setEnabled(true);
            return true;
        }
        textView2.setText("----");
        textView2.setEnabled(false);
        textView2.setAlpha(0.3f);
        textView.setAlpha(0.3f);
        viewGroup.setEnabled(false);
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48845(String str) {
        this.f69411.setText(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m48844(byte[] bArr) {
        CompoundButton compoundButton;
        compoundButton = this.f69414.f65399;
        boolean isChecked = compoundButton.isChecked();
        int i = this.f69416;
        long j = 0;
        if (isChecked) {
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 8) | (bArr[i2] & 255);
            }
            return j;
        }
        while (true) {
            i--;
            if (i < 0) {
                return j;
            }
            j = (j << 8) | (bArr[i] & 255);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ViewOnClickListenerC5396 viewOnClickListenerC5396;
        ViewOnClickListenerC5396 viewOnClickListenerC53962;
        CompoundButton compoundButton;
        C20213 c20213 = this.f69414;
        viewOnClickListenerC5396 = c20213.f65393;
        if (viewOnClickListenerC5396.m15393()) {
            return false;
        }
        viewOnClickListenerC53962 = c20213.f65393;
        final C6807 c6807 = viewOnClickListenerC53962.f16793;
        final C18177 m27414 = c6807.f21109.m27414();
        final long m42385 = m27414.m42385();
        final int m27418 = c6807.f21109.m27418();
        final String charSequence = this.f69411.getText().toString();
        onClick(null);
        View inflate = View.inflate(view.getContext(), R.layout.MT_Protector_res_0x7f0d00b9, null);
        EditText editText = (EditText) inflate.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        TextView textView = (TextView) inflate.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        TextView textView2 = (TextView) inflate.findViewById(R.id.textView1);
        textView.setText(this.f69412.getText());
        editText.setText(charSequence);
        editText.setSelection(0, editText.length());
        int i = this.f69415;
        if (i == R.id.MT_Protector_res_0x7f0a0527 || i == R.id.MT_Protector_res_0x7f0a052a || i == R.id.MT_Protector_res_0x7f0a0528 || i == R.id.MT_Protector_res_0x7f0a0529) {
            editText.setKeyListener(DigitsKeyListener.getInstance(true, false));
        } else if (i == R.id.MT_Protector_res_0x7f0a065f || i == R.id.MT_Protector_res_0x7f0a0662 || i == R.id.MT_Protector_res_0x7f0a0660 || i == R.id.MT_Protector_res_0x7f0a0661) {
            editText.setKeyListener(DigitsKeyListener.getInstance(false, false));
        } else if (i == R.id.MT_Protector_res_0x7f0a025c || i == R.id.MT_Protector_res_0x7f0a025b) {
            editText.setKeyListener(DigitsKeyListener.getInstance("0123456789-.eE"));
        }
        compoundButton = c20213.f65399;
        final C22329 c22329 = new C22329(editText, textView2, i, compoundButton.isChecked());
        Context context = view.getContext();
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(context);
        c19258.m44421(inflate);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = c19258.m44438();
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܶܰܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewOnClickListenerC5396 viewOnClickListenerC53963;
                ViewOnClickListenerC5396 viewOnClickListenerC53964;
                ViewOnLongClickListenerC21624 viewOnLongClickListenerC21624 = ViewOnLongClickListenerC21624.this;
                C20213 c202132 = viewOnLongClickListenerC21624.f69414;
                C22329 c223292 = c22329;
                if (!c223292.f72375 && !c223292.f72372) {
                    C6807 c68072 = c6807;
                    C11041 c11041 = c68072.f21109;
                    C18177 m274142 = c11041.m27414();
                    C18177 c18177 = m27414;
                    DialogInterfaceC0206 dialogInterfaceC0206 = m44438;
                    if (m274142 == c18177 && c18177.m42385() == m42385) {
                        int m274182 = c11041.m27418();
                        int i3 = m27418;
                        if (m274182 == i3) {
                            if (c68072.m18491()) {
                                C21374.m48457(R.string.MT_Protector_res_0x7f1207a7);
                                return;
                            }
                            if (c223292.f72376.getText().toString().equals(charSequence)) {
                                dialogInterfaceC0206.dismiss();
                                return;
                            }
                            byte[] bArr = c223292.f72377;
                            try {
                                c18177.m42388(i3, bArr.length + i3, bArr);
                                c11041.m27401();
                                viewOnClickListenerC53964 = c202132.f65393;
                                viewOnClickListenerC53964.f16793.invalidate();
                                dialogInterfaceC0206.dismiss();
                                c202132.m46453();
                                viewOnLongClickListenerC21624.onClick(null);
                                return;
                            } catch (IOException e) {
                                viewOnClickListenerC53963 = c202132.f65393;
                                viewOnClickListenerC53963.m15384(e);
                                return;
                            }
                        }
                    }
                    dialogInterfaceC0206.dismiss();
                    return;
                }
                C21374.m48458(0, c223292.f72373.getText()).m48468();
            }
        });
        C4925.m14329(editText);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView;
        BackgroundColorSpan backgroundColorSpan;
        TextView textView2;
        C20213 c20213 = this.f69414;
        textView = c20213.f65403;
        SpannableString spannableString = new SpannableString(textView.getText().toString());
        backgroundColorSpan = c20213.f65402;
        spannableString.setSpan(backgroundColorSpan, 0, (this.f69416 * 3) - 1, 33);
        textView2 = c20213.f65403;
        textView2.setText(spannableString);
    }
}
