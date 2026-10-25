package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 89CO */
/* renamed from: l.᩺ܳܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23055 extends AbstractC21212 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ImageView f74167;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9923 f74168;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f74169;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23055(ActivityC9923 activityC9923, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC9923).inflate(R.layout.MT_Protector_res_0x7f0d0157, viewGroup, false));
        this.f74168 = activityC9923;
        this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a0216).setVisibility(8);
        ((ImageView) this.itemView.findViewById(R.id.drag)).setImageResource(R.drawable.MT_Protector_res_0x7f080202);
        this.itemView.setFocusable(false);
        this.itemView.setClickable(false);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a0217);
        this.f74169 = textView;
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a050b);
        this.f74167 = imageView;
        imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080204);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۨܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19258 buildDialog = C23055.this.f74168.buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f1203f5);
                buildDialog.m44416(R.string.MT_Protector_res_0x7f1203f2);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
                buildDialog.m44438();
            }
        });
    }

    @Override // l.AbstractC21212
    /* renamed from: ֫ */
    public final void mo19102(AbstractC13882 abstractC13882) {
        abstractC13882.getClass();
        if (abstractC13882 instanceof C6122) {
            C6122 mo17035 = abstractC13882.mo17035();
            this.f74169.setText(mo17035.f18759);
            int i = mo17035.f18758;
            ImageView imageView = this.f74167;
            if (i == 1) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
    }
}
