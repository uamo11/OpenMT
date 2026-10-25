package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 89CO */
/* renamed from: l.ۜ᩻ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC7100 extends AbstractC21212 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextView f21805;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9923 f21806;

    @Override // l.AbstractC21212
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19102(AbstractC13882 abstractC13882) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC7100(ActivityC9923 activityC9923, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC9923).inflate(R.layout.MT_Protector_res_0x7f0d0158, viewGroup, false));
        this.f21806 = activityC9923;
        this.itemView.setOnClickListener(this);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        this.f21805 = textView;
        textView.setText(C7701.m20606().toString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String[] strArr = (String[]) C22311.stream(EnumC12890.values()).map(new C23519(2)).toArray(new C14860());
        C19258 buildDialog = this.f21806.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1203f6);
        buildDialog.m44429(strArr, C7701.m20606().ordinal(), new DialogInterface.OnClickListener() { // from class: l.᩻᩻ܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7701.m20605(EnumC12890.values()[i]);
                ViewOnClickListenerC7100.this.f21805.setText(C7701.m20606().toString());
                dialogInterface.dismiss();
            }
        });
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44438();
    }
}
