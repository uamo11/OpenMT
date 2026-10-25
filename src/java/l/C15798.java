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
/* renamed from: l.ܺ۟᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15798 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f48728 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f48729;

    public C15798(C19328 c19328) {
        this.f48729 = c19328;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37255() {
        this.f48728 = true;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int m37254 = m37254();
        if (i2 < m37254) {
            return 1;
        }
        return i2 - m37254 == 0 ? 0 : 2;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19328 c19328 = this.f48729;
        if (i == 0) {
            return new C6627(LayoutInflater.from(c19328.requireContext()).inflate(R.layout.MT_Protector_res_0x7f0d015a, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC8744(c19328, LayoutInflater.from(c19328.requireContext()).inflate(R.layout.MT_Protector_res_0x7f0d0131, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC18622(c19328, LayoutInflater.from(c19328.requireContext()).inflate(R.layout.MT_Protector_res_0x7f0d0132, viewGroup, false));
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
            ((C6627) abstractC3255).f20398.setText(R.string.MT_Protector_res_0x7f120413);
            return;
        }
        int i3 = i - 1;
        int m37254 = m37254();
        C19328 c19328 = this.f48729;
        if (i3 >= m37254) {
            int i4 = i3 - m37254;
            if (i4 == 0) {
                C6627 c6627 = (C6627) abstractC3255;
                z2 = c19328.f60760;
                if (!z2) {
                    c6627.f20398.setText(R.string.MT_Protector_res_0x7f120a00);
                    return;
                }
                TextView textView = c6627.f20398;
                str = c19328.f60762;
                textView.setText(c19328.getString(R.string.MT_Protector_res_0x7f1203de, str));
                return;
            }
            int i5 = i4 - 1;
            ViewOnClickListenerC18622 viewOnClickListenerC18622 = (ViewOnClickListenerC18622) abstractC3255;
            list = c19328.f60758;
            z = c19328.f60760;
            if (z) {
                iArr = c19328.f60757;
                i5 = iArr[i5];
            }
            C23560 c23560 = (C23560) list.get(i5);
            viewOnClickListenerC18622.f57749 = c23560;
            TextView textView2 = viewOnClickListenerC18622.f57750;
            textView2.setText(C6554.m18061(150, c23560.m52025()));
            if (c23560.f75636) {
                textView2.setTextColor(C21943.f70291);
                return;
            } else {
                textView2.setTextColor(C21943.f70275);
                return;
            }
        }
        ViewOnClickListenerC8744 viewOnClickListenerC8744 = (ViewOnClickListenerC8744) abstractC3255;
        viewOnClickListenerC8744.f26646 = i3;
        ImageView imageView = viewOnClickListenerC8744.f26648;
        TextView textView3 = viewOnClickListenerC8744.f26644;
        z3 = c19328.f60760;
        if (z3) {
            i2 = c19328.f60763;
            if (i2 == 0 && i3 == 2) {
                viewOnClickListenerC8744.f26646 = 3;
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
            z4 = c19328.f60760;
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
        if (this.f48728) {
            this.f48728 = false;
            C0471 c0471 = new C0471(C21943.f70286);
            c0471.m2074(1000);
            View view = viewOnClickListenerC8744.f26647;
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
        C19328 c19328 = this.f48729;
        list = c19328.f60758;
        if (list == null) {
            return 0;
        }
        list2 = c19328.f60758;
        if (list2.isEmpty()) {
            return m37254() + 1;
        }
        int m37254 = m37254() + 2;
        z = c19328.f60760;
        if (z) {
            size = c19328.f60763;
        } else {
            list3 = c19328.f60758;
            size = list3.size();
        }
        return m37254 + size;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m37254() {
        List list;
        List list2;
        boolean z;
        boolean z2;
        int i;
        C19328 c19328 = this.f48729;
        list = c19328.f60758;
        int i2 = 1;
        if (list == null) {
            return 1;
        }
        list2 = c19328.f60758;
        if (list2.isEmpty()) {
            return 1;
        }
        z = c19328.f60760;
        if (z) {
            i = c19328.f60763;
            if (i == 0) {
                i2 = 0;
            }
        }
        z2 = c19328.f60764;
        return !z2 ? i2 + 2 : i2 + 3;
    }
}
