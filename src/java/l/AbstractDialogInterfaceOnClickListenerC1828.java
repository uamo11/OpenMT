package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: P5BR */
/* renamed from: l.֫۫ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC1828 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f6263;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final LinearLayout f6264;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f6265;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5062 f6266;

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public abstract void mo6058();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo6059() {
    }

    public AbstractDialogInterfaceOnClickListenerC1828(AbstractActivityC3346 abstractActivityC3346, String str) {
        this(-1, abstractActivityC3346, str);
    }

    public AbstractDialogInterfaceOnClickListenerC1828(int i, AbstractActivityC3346 abstractActivityC3346, String str) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00e6);
        this.f6264 = (LinearLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0680);
        this.f6263 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f6266 = c5062;
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        c19258.m44428(false);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, this);
        if (i != -1) {
            c19258.m44440(i, this);
        }
        DialogInterfaceC0206 m44415 = c19258.m44415();
        this.f6265 = m44415;
        m44415.m1437(new DialogInterface.OnKeyListener() { // from class: l.۟۬ܿ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC1828.this.getClass();
                if (keyEvent.getAction() != 0 || i3 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                return true;
            }
        });
        m44415.m1436(this);
        c5062.m14602(str, (String) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6053(View view) {
        this.f6264.addView(view);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6054(View view, int i) {
        this.f6264.addView(view, i);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m6056() {
        this.f6266.m14610();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            return;
        }
        mo6059();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6051() {
        this.f6265.dismiss();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m6057() {
        return this.f6266.m14611().toString();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m6060() {
        C5062 c5062 = this.f6266;
        c5062.m14615();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f6265;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        C4925.m14329(c5062.m14607());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6052(int i) {
        this.f6263.setText(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo6058();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5062 m6055() {
        return this.f6266;
    }
}
