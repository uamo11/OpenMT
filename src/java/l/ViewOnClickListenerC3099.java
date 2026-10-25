package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Stack;

/* compiled from: O1JS */
/* renamed from: l.ۗ۟᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC3099 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f9693;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5921 f9694;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ImageView f9695;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9696;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC3099(C5921 c5921, View view) {
        super(view);
        this.f9694 = c5921;
        this.f9695 = (ImageView) view.findViewById(R.id.icon);
        this.f9693 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Stack stack;
        if (C13876.f41361.m22793()) {
            return;
        }
        int i = this.f9696;
        C5921 c5921 = this.f9694;
        if (i == 0) {
            ((ActivityC17169) c5921.requireActivity()).m40363(new Runnable() { // from class: l.᩸۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    new ViewOnClickListenerC7788(ViewOnClickListenerC3099.this.f9694, null).m20816();
                }
            });
            return;
        }
        if (i == 1) {
            ((ActivityC17169) c5921.requireActivity()).m40363(new Runnable() { // from class: l.᩹۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    Stack stack2;
                    C5921 c59212 = ViewOnClickListenerC3099.this.f9694;
                    ViewOnClickListenerC7788 viewOnClickListenerC7788 = new ViewOnClickListenerC7788(c59212, null);
                    stack2 = c59212.f18158;
                    viewOnClickListenerC7788.m20817((C0941) stack2.peek());
                    viewOnClickListenerC7788.m20816();
                }
            });
            return;
        }
        if (i == 2) {
            ((ActivityC17169) c5921.requireActivity()).m40363(new Runnable() { // from class: l.᩶۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C19452 c19452;
                    Stack stack2;
                    C5921 c59212 = ViewOnClickListenerC3099.this.f9694;
                    ActivityC17169 activityC17169 = (ActivityC17169) c59212.requireActivity();
                    c19452 = c59212.f18162;
                    ViewOnClickListenerC6377 viewOnClickListenerC6377 = new ViewOnClickListenerC6377(activityC17169, c19452);
                    stack2 = c59212.f18158;
                    viewOnClickListenerC6377.m17696((C0941) stack2.peek());
                    viewOnClickListenerC6377.m17695();
                }
            });
            return;
        }
        if (i == 3) {
            stack = c5921.f18158;
            stack.pop();
            c5921.m16603();
            c5921.m16597();
            return;
        }
        if (i != 4) {
            return;
        }
        Context requireContext = c5921.requireContext();
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(requireContext);
        c19258.m44433(R.string.MT_Protector_res_0x7f120b7b);
        c19258.m44416(R.string.MT_Protector_res_0x7f120185);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۙ۟᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C5921.m16601(ViewOnClickListenerC3099.this.f9694);
            }
        });
        c19258.m44438();
    }
}
