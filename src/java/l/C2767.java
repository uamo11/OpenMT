package l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: 892H */
/* renamed from: l.ۖ᩶᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2767 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f8596;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f8597;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ImageView imageView;
        TextView textView;
        ViewOnClickListenerC16171 viewOnClickListenerC16171 = (ViewOnClickListenerC16171) abstractC3255;
        C4178 c4178 = (C4178) this.f8597.get(i);
        imageView = viewOnClickListenerC16171.f49823;
        imageView.setImageBitmap(c4178.m12623());
        textView = viewOnClickListenerC16171.f49824;
        textView.setText(c4178.m12625());
    }

    public C2767(AbstractActivityC3346 abstractActivityC3346) {
        this.f8596 = abstractActivityC3346;
        ArrayList arrayList = new ArrayList();
        this.f8597 = new ArrayList();
        Iterator it = C16362.m38507(abstractActivityC3346).iterator();
        while (it.hasNext()) {
            C7232 c7232 = (C7232) it.next();
            Bitmap m139 = ShortcutActivity.m139(c7232.m19332());
            if (m139 != null) {
                this.f8597.add(0, new C4178(c7232.m19332(), c7232.m19334(), m139));
            } else {
                arrayList.add(c7232.m19332());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C16362.m38510(abstractActivityC3346, (List) arrayList);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC16171(this, C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d016b, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f8597.size();
    }
}
