package l;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 28G3 */
/* renamed from: l.ۡ֨ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8550 extends AbstractC3255 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f26140;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f26141;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f26142;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f26143;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8550(C7844 c7844, View view) {
        super(view);
        this.f26143 = c7844;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f26141 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a01b8);
        this.f26142 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a01ce);
        this.f26140 = (ImageView) view.findViewById(R.id.MT_Protector_res_0x7f0a01b6);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۢ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8550 c8550 = C8550.this;
                C7844.m20958(c8550.f26143, c8550.getBindingAdapterPosition());
            }
        });
    }
}
