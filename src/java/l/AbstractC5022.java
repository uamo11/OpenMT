package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 28G3 */
/* renamed from: l.ۚ֨ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5022 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f15814;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f15815 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo14515(C2200 c2200);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo14517(String str);

    public AbstractC5022(C7844 c7844) {
        this.f15814 = c7844;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2200(LayoutInflater.from(this.f15814.getContext()).inflate(R.layout.MT_Protector_res_0x7f0d0126, viewGroup, false));
    }

    @Override // l.AbstractC19902
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void onBindViewHolder(C2200 c2200, int i) {
        final InterfaceC1318 interfaceC1318;
        interfaceC1318 = this.f15814.f24265;
        if (interfaceC1318 == null) {
            return;
        }
        if (i == 0) {
            mo14515(c2200);
            return;
        }
        final C19134 c19134 = (C19134) this.f15815.get(i - 1);
        final C13312 m51438 = c19134.f60317.m51438();
        boolean z = interfaceC1318.mo4580().f35552.get(m51438) != null && c19134.f60317.m51441(c19134.f60318);
        c2200.f7229.setText(c19134.f60319);
        c2200.f7228.setVisibility(z ? 0 : 4);
        c2200.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.֡֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PopupWindow popupWindow;
                InterfaceC1318 interfaceC13182 = interfaceC1318;
                if (interfaceC13182.mo4589(29)) {
                    C6257 mo29029 = interfaceC13182.mo4580().mo29029();
                    C19134 c191342 = c19134;
                    interfaceC13182.mo4569(mo29029.mo17264(new C12607(m51438, AbstractC14545.of((Object) Integer.valueOf(c191342.f60318)))).mo17262(c191342.f60317.m51440(), false).mo17266());
                    String str = c191342.f60319;
                    AbstractC5022 abstractC5022 = AbstractC5022.this;
                    abstractC5022.mo14517(str);
                    popupWindow = abstractC5022.f15814.f24281;
                    popupWindow.dismiss();
                }
            }
        });
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        if (this.f15815.isEmpty()) {
            return 0;
        }
        return this.f15815.size() + 1;
    }
}
