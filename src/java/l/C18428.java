package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 28G3 */
/* renamed from: l.ᩴ֨ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18428 extends AbstractC5022 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f57186;

    @Override // l.AbstractC5022
    /* renamed from: ۧ */
    public final void mo14517(String str) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18428(C7844 c7844) {
        super(c7844);
        this.f57186 = c7844;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42846(List list) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            C19134 c19134 = (C19134) list.get(i);
            if (c19134.f60317.m51441(c19134.f60318)) {
                z = true;
                break;
            }
            i++;
        }
        C7844 c7844 = this.f57186;
        imageView = c7844.f24254;
        if (imageView != null) {
            imageView2 = c7844.f24254;
            imageView2.setImageDrawable(z ? c7844.f24321 : c7844.f24277);
            imageView3 = c7844.f24254;
            imageView3.setContentDescription(z ? c7844.f24324 : c7844.f24301);
        }
        this.f15815 = list;
    }

    @Override // l.AbstractC5022
    /* renamed from: ֫ */
    public final void mo14515(C2200 c2200) {
        boolean z;
        c2200.f7229.setText(R.string.MT_Protector_res_0x7f120346);
        int i = 0;
        while (true) {
            if (i >= this.f15815.size()) {
                z = true;
                break;
            }
            C19134 c19134 = (C19134) this.f15815.get(i);
            if (c19134.f60317.m51441(c19134.f60318)) {
                z = false;
                break;
            }
            i++;
        }
        c2200.f7228.setVisibility(z ? 0 : 4);
        c2200.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ۘ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC1318 interfaceC1318;
                InterfaceC1318 interfaceC13182;
                InterfaceC1318 interfaceC13183;
                InterfaceC1318 interfaceC13184;
                PopupWindow popupWindow;
                C7844 c7844 = C18428.this.f57186;
                interfaceC1318 = c7844.f24265;
                if (interfaceC1318 != null) {
                    interfaceC13182 = c7844.f24265;
                    if (interfaceC13182.mo4589(29)) {
                        interfaceC13183 = c7844.f24265;
                        C11902 mo4580 = interfaceC13183.mo4580();
                        interfaceC13184 = c7844.f24265;
                        interfaceC13184.mo4569(mo4580.mo29029().mo17261(3).mo17268().mo17269().mo17270().mo17266());
                        popupWindow = c7844.f24281;
                        popupWindow.dismiss();
                    }
                }
            }
        });
    }

    @Override // l.AbstractC5022, l.AbstractC19902
    /* renamed from: ֫ */
    public final void onBindViewHolder(C2200 c2200, int i) {
        super.onBindViewHolder(c2200, i);
        if (i > 0) {
            C19134 c19134 = (C19134) this.f15815.get(i - 1);
            c2200.f7228.setVisibility(c19134.f60317.m51441(c19134.f60318) ? 0 : 4);
        }
    }
}
