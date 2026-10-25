package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import java.util.Collections;

/* compiled from: 892H */
/* renamed from: l.ܺ᩶᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC16171 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2767 f49822;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f49823;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f49824;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC16171(C2767 c2767, View view) {
        super(view);
        this.f49822 = c2767;
        view.setOnClickListener(this);
        this.f49823 = (ImageView) view.findViewById(R.id.icon);
        this.f49824 = (TextView) view.findViewById(R.id.text);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C2767 c2767 = this.f49822;
        C19258 buildDialog = c2767.f8596.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1205ca);
        buildDialog.m44424(c2767.f8596.getString(R.string.MT_Protector_res_0x7f120870, ((C4178) c2767.f8597.get(bindingAdapterPosition)).m12625()));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۡ᩶᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2767 c27672 = ViewOnClickListenerC16171.this.f49822;
                String m12624 = ((C4178) c27672.f8597.remove(bindingAdapterPosition)).m12624();
                C16362.m38510(c27672.f8596, Collections.singletonList(m12624));
                ShortcutActivity.m140(m12624);
                c27672.notifyDataSetChanged();
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}
