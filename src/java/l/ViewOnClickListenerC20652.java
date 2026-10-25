package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 28VT */
/* renamed from: l.᩷ۙܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC20652 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f66427;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22062 f66428;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC20652(ActivityC22062 activityC22062, View view, boolean z) {
        super(view);
        this.f66428 = activityC22062;
        this.f66427 = z;
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector_res_0x7f0a0321);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.MT_Protector_res_0x7f0a0322);
        if (z) {
            textView.setText(activityC22062.getString(R.string.MT_Protector_res_0x7f12048c) + " (MT2/keys)");
            imageView2.setVisibility(8);
            C18934.m43699(imageView, C4925.m14327(R.string.MT_Protector_res_0x7f120b5f));
            imageView.setOnClickListener(this);
            return;
        }
        textView.setText(activityC22062.getString(R.string.MT_Protector_res_0x7f12048b) + " (MT2/keystore)");
        C18934.m43699(imageView, C4925.m14327(R.string.MT_Protector_res_0x7f120b5f));
        C18934.m43699(imageView2, C4925.m14327(R.string.MT_Protector_res_0x7f12041c));
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int id = view.getId();
        ActivityC22062 activityC22062 = this.f66428;
        if (id != R.id.MT_Protector_res_0x7f0a0321) {
            new C14341(activityC22062, new InterfaceC13041() { // from class: l.ۜۙܽ
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    ActivityC22062 activityC220622 = ViewOnClickListenerC20652.this.f66428;
                    activityC220622.f70695 = ((AbstractC15440) obj).getName();
                    ActivityC22062.m49637(activityC220622);
                }
            }).m34223();
            return;
        }
        String mo23554 = C16293.m38327().m36526(this.f66427 ? "keys" : "keystore").mo23554();
        z = activityC22062.f70698;
        Main.m64(activityC22062, mo23554, z);
    }
}
