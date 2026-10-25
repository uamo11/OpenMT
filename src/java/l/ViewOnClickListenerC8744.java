package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: M1KQ */
/* renamed from: l.ۡ۟᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC8744 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextView f26644;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f26645;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26646;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f26647;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f26648;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8744(C19328 c19328, View view) {
        super(view);
        this.f26645 = c19328;
        this.f26648 = (ImageView) view.findViewById(R.id.icon);
        this.f26644 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f26647 = view.findViewById(R.id.MT_Protector_res_0x7f0a010e);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C19452 c19452;
        if (C13876.f41361.m22793()) {
            return;
        }
        int i = this.f26646;
        final C19328 c19328 = this.f26645;
        if (i == 0) {
            if (((ActivityC17169) c19328.requireActivity()).m40366()) {
                c19328.m44544(R.string.MT_Protector_res_0x7f120808);
                return;
            }
            Context requireContext = c19328.requireContext();
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(requireContext);
            c19258.m44433(R.string.MT_Protector_res_0x7f120491);
            c19258.m44416(R.string.MT_Protector_res_0x7f120807);
            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩷۟᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ViewOnClickListenerC8744.this.f26645.m44544(R.string.MT_Protector_res_0x7f120808);
                }
            });
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        if (i == 1) {
            C19328.m44530(c19328);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((ActivityC17169) c19328.requireActivity()).m40363(new Runnable() { // from class: l.ۢ۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C19328.m44538(C19328.this);
                }
            });
        } else {
            ActivityC17169 activityC17169 = (ActivityC17169) c19328.requireActivity();
            c19452 = c19328.f60766;
            ViewOnClickListenerC6377 viewOnClickListenerC6377 = new ViewOnClickListenerC6377(activityC17169, c19452);
            viewOnClickListenerC6377.m17697(c19328);
            viewOnClickListenerC6377.m17695();
        }
    }
}
