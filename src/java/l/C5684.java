package l;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: E1KB */
/* renamed from: l.ۚ᩻ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5684 extends C13876 {

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21912 f17540;

    public C5684(C21912 c21912) {
        this.f17540 = c21912;
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemViewType(int i) {
        List list;
        List list2;
        List list3;
        C21912 c21912 = this.f17540;
        list = c21912.f70159;
        if (!list.isEmpty()) {
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            list2 = c21912.f70159;
            if (i2 < list2.size()) {
                return 1;
            }
            list3 = c21912.f70159;
            i = i2 - list3.size();
        }
        if (i == 0) {
            return 2;
        }
        return super.getItemViewType(i - 1);
    }

    @Override // l.C13876, l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View m32583 = C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d015b, viewGroup, false);
            ((TextView) m32583.findViewById(R.id.textView)).setText(R.string.MT_Protector_res_0x7f1207dc);
            m32583.findViewById(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: l.᩵᩻ۢ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C5684 c5684 = C5684.this;
                    C21282 c21282 = new C21282(c5684.f17540.requireContext(), view, 0);
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120181, 0, R.string.MT_Protector_res_0x7f120181);
                    c21282.m48302(new InterfaceC14930() { // from class: l.֡᩻ۢ
                        @Override // l.InterfaceC14930
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C12366 c12366;
                            c12366 = C5684.this.f17540.f70161;
                            c12366.m30060();
                            return true;
                        }
                    });
                    c21282.m48305();
                }
            });
            return new C19090(m32583);
        }
        if (i == 1) {
            return new ViewOnClickListenerC15560(this.f17540, C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d014b, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        View m325832 = C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d015a, viewGroup, false);
        ((TextView) m325832.findViewById(R.id.textView)).setText(R.string.MT_Protector_res_0x7f12062d);
        return new C19090(m325832);
    }

    @Override // l.C13876, l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        List list;
        List list2;
        List list3;
        List list4;
        C21912 c21912 = this.f17540;
        list = c21912.f70159;
        if (!list.isEmpty()) {
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            list2 = c21912.f70159;
            if (i2 < list2.size()) {
                list4 = c21912.f70159;
                ((ViewOnClickListenerC15560) abstractC3255).m36706((String) list4.get(i2));
                return;
            } else {
                list3 = c21912.f70159;
                i = i2 - list3.size();
            }
        }
        if (i > 0) {
            super.onBindViewHolder(abstractC3255, i - 1);
        }
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemCount() {
        List list;
        List list2;
        int itemCount = super.getItemCount();
        if (itemCount > 0) {
            itemCount++;
        }
        C21912 c21912 = this.f17540;
        list = c21912.f70159;
        if (list.isEmpty()) {
            return itemCount;
        }
        list2 = c21912.f70159;
        return list2.size() + 1 + itemCount;
    }

    @Override // l.C13876
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int mo15999() {
        List list;
        List list2;
        C21912 c21912 = this.f17540;
        list = c21912.f70159;
        if (list.isEmpty()) {
            return 1;
        }
        list2 = c21912.f70159;
        return list2.size() + 2;
    }
}
