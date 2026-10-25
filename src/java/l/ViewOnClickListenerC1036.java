package l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: K1PX */
/* renamed from: l.֨ۢۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC1036 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8092 f3781;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f3782;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f3783;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15852 f3784;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f3785;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC1036(ActivityC8092 activityC8092, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC8092).inflate(R.layout.MT_Protector_res_0x7f0d0135, viewGroup, false));
        this.f3781 = activityC8092;
        this.f3785 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f3782 = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a03d6);
        this.f3783 = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a028b);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2448 c2448;
        C2448 c24482;
        C2448 c24483;
        C15852 c15852 = this.f3784;
        boolean z = c15852.f48971;
        ActivityC8092 activityC8092 = this.f3781;
        if (z) {
            if (c15852.f48969.equals("..")) {
                c24483 = activityC8092.f24925;
                c24483.f7825.m15198();
                return;
            }
            c2448 = activityC8092.f24925;
            c2448.f7825.f16483 = this.f3784.f48968.mo23554();
            c24482 = activityC8092.f24925;
            c24482.f7825.m15199(null);
            return;
        }
        ApplicationC20075.f65008.edit().putString("apk_selector_path", this.f3784.f48968.getParent()).apply();
        String mo23554 = this.f3784.f48968.mo23554();
        int i = ActivityC8092.f24923;
        Intent intent = new Intent();
        intent.putExtra("apkPath", mo23554);
        activityC8092.setResult(-1, intent);
        activityC8092.finish();
    }
}
