package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 657B */
/* renamed from: l.۠ۙ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7956 extends AbstractC3255 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f24595;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f24596;

    public C7956(View view) {
        super(view);
        this.f24595 = (ImageView) view.findViewById(R.id.icon);
        this.f24596 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21264(int i, int i2) {
        this.f24596.setText(i);
        this.f24595.setImageResource(i2);
    }
}
