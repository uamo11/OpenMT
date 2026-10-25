package l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: M1KQ */
/* renamed from: l.֡ۜۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0247 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f1532 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f1533;

    public C0247(C15063 c15063) {
        this.f1533 = c15063;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1504() {
        this.f1532 = true;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int m1503 = m1503();
        if (i2 < m1503) {
            return 1;
        }
        return i2 - m1503 == 0 ? 0 : 2;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C15063 c15063 = this.f1533;
        if (i == 0) {
            return new C2365(LayoutInflater.from(c15063.requireContext()).inflate(R.layout.MT_Protector_res_0x7f0d015a, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC19299(c15063, LayoutInflater.from(c15063.requireContext()).inflate(R.layout.MT_Protector_res_0x7f0d0131, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC8009(c15063, LayoutInflater.from(c15063.requireContext()).inflate(R.layout.MT_Protector_res_0x7f0d0132, viewGroup, false));
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, @SuppressLint({"RecyclerView"}) int i) {
        List list;
        boolean z;
        int[] iArr;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        int i2;
        if (i == 0) {
            ((C2365) abstractC3255).f7557.setText(R.string.MT_Protector_res_0x7f120413);
            return;
        }
        int i3 = i - 1;
        int m1503 = m1503();
        C15063 c15063 = this.f1533;
        if (i3 >= m1503) {
            int i4 = i3 - m1503;
            if (i4 == 0) {
                C2365 c2365 = (C2365) abstractC3255;
                z2 = c15063.f45994;
                if (!z2) {
                    c2365.f7557.setText(R.string.MT_Protector_res_0x7f120a00);
                    return;
                }
                TextView textView = c2365.f7557;
                str = c15063.f45996;
                textView.setText(c15063.getString(R.string.MT_Protector_res_0x7f1203de, str));
                return;
            }
            int i5 = i4 - 1;
            ViewOnClickListenerC8009 viewOnClickListenerC8009 = (ViewOnClickListenerC8009) abstractC3255;
            list = c15063.f45998;
            z = c15063.f45994;
            if (z) {
                iArr = c15063.f45991;
                i5 = iArr[i5];
            }
            C15769 c15769 = (C15769) list.get(i5);
            viewOnClickListenerC8009.f24735 = c15769;
            TextView textView2 = viewOnClickListenerC8009.f24736;
            textView2.setText(C6554.m18061(150, c15769.m37186()));
            if (c15769.f48614) {
                textView2.setTextColor(C21943.f70291);
                return;
            } else {
                textView2.setTextColor(C21943.f70275);
                return;
            }
        }
        ViewOnClickListenerC19299 viewOnClickListenerC19299 = (ViewOnClickListenerC19299) abstractC3255;
        viewOnClickListenerC19299.f60705 = i3;
        ImageView imageView = viewOnClickListenerC19299.f60707;
        TextView textView3 = viewOnClickListenerC19299.f60703;
        z3 = c15063.f45994;
        if (z3) {
            i2 = c15063.f45997;
            if (i2 == 0 && i3 == 2) {
                viewOnClickListenerC19299.f60705 = 3;
                i3 = 3;
            }
        }
        if (i3 == 0) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f08022b);
            textView3.setText(R.string.MT_Protector_res_0x7f120805);
            return;
        }
        if (i3 == 1) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f0801f9);
            textView3.setText(R.string.MT_Protector_res_0x7f1203d7);
            return;
        }
        if (i3 == 2) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080232);
            z4 = c15063.f45994;
            if (z4) {
                textView3.setText(R.string.MT_Protector_res_0x7f120898);
                return;
            } else {
                textView3.setText(R.string.MT_Protector_res_0x7f1205fa);
                return;
            }
        }
        if (i3 != 3) {
            throw new RuntimeException(C19370.m44628(i3, "MenuType = "));
        }
        if (this.f1532) {
            this.f1532 = false;
            C0471 c0471 = new C0471(C21943.f70286);
            c0471.m2074(1000);
            View view = viewOnClickListenerC19299.f60706;
            int i6 = C17648.f53953;
            view.setBackground(c0471);
        }
        imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080223);
        textView3.setText(R.string.MT_Protector_res_0x7f1200cf);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        List list2;
        boolean z;
        List list3;
        int size;
        C15063 c15063 = this.f1533;
        list = c15063.f45998;
        if (list == null) {
            return 0;
        }
        list2 = c15063.f45998;
        if (list2.isEmpty()) {
            return m1503() + 1;
        }
        int m1503 = m1503() + 2;
        z = c15063.f45994;
        if (z) {
            size = c15063.f45997;
        } else {
            list3 = c15063.f45998;
            size = list3.size();
        }
        return m1503 + size;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m1503() {
        List list;
        List list2;
        boolean z;
        boolean z2;
        int i;
        C15063 c15063 = this.f1533;
        list = c15063.f45998;
        int i2 = 1;
        if (list == null) {
            return 1;
        }
        list2 = c15063.f45998;
        if (list2.isEmpty()) {
            return 1;
        }
        z = c15063.f45994;
        if (z) {
            i = c15063.f45997;
            if (i == 0) {
                i2 = 0;
            }
        }
        z2 = c15063.f46000;
        return !z2 ? i2 + 2 : i2 + 3;
    }
}
