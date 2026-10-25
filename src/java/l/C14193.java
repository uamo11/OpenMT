package l;

import android.view.View;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import java.util.AbstractCollection;
import java.util.List;

/* compiled from: 28G3 */
/* renamed from: l.ܳ֨ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14193 extends AbstractC5022 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f42845;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14193(C7844 c7844) {
        super(c7844);
        this.f42845 = c7844;
    }

    @Override // l.AbstractC5022
    /* renamed from: ֫ */
    public final void mo14515(C2200 c2200) {
        InterfaceC1318 interfaceC1318;
        c2200.f7229.setText(R.string.MT_Protector_res_0x7f120345);
        interfaceC1318 = this.f42845.f24265;
        interfaceC1318.getClass();
        c2200.f7228.setVisibility(m33861(interfaceC1318.mo4580()) ? 4 : 0);
        c2200.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC1318 interfaceC13182;
                InterfaceC1318 interfaceC13183;
                InterfaceC1318 interfaceC13184;
                InterfaceC1318 interfaceC13185;
                C15604 c15604;
                PopupWindow popupWindow;
                C7844 c7844 = C14193.this.f42845;
                interfaceC13182 = c7844.f24265;
                if (interfaceC13182 != null) {
                    interfaceC13183 = c7844.f24265;
                    if (interfaceC13183.mo4589(29)) {
                        interfaceC13184 = c7844.f24265;
                        C11902 mo4580 = interfaceC13184.mo4580();
                        interfaceC13185 = c7844.f24265;
                        String str = C3603.f11424;
                        interfaceC13185.mo4569(mo4580.mo29029().mo17261(1).mo17262(1, false).mo17266());
                        c15604 = c7844.f24328;
                        c15604.m36789(1, c7844.getResources().getString(R.string.MT_Protector_res_0x7f120345));
                        popupWindow = c7844.f24281;
                        popupWindow.dismiss();
                    }
                }
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m33861(C11902 c11902) {
        for (int i = 0; i < this.f15815.size(); i++) {
            if (c11902.f35552.containsKey(((C19134) this.f15815.get(i)).f60317.m51438())) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC5022
    /* renamed from: ۧ */
    public final void mo14517(String str) {
        C15604 c15604;
        c15604 = this.f42845.f24328;
        c15604.m36789(1, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33862(List list) {
        InterfaceC1318 interfaceC1318;
        C15604 c15604;
        C15604 c156042;
        C15604 c156043;
        this.f15815 = list;
        C7844 c7844 = this.f42845;
        interfaceC1318 = c7844.f24265;
        interfaceC1318.getClass();
        C11902 mo4580 = interfaceC1318.mo4580();
        if (((AbstractCollection) list).isEmpty()) {
            c156043 = c7844.f24328;
            c156043.m36789(1, c7844.getResources().getString(R.string.MT_Protector_res_0x7f120346));
            return;
        }
        if (!m33861(mo4580)) {
            c156042 = c7844.f24328;
            c156042.m36789(1, c7844.getResources().getString(R.string.MT_Protector_res_0x7f120345));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            C19134 c19134 = (C19134) list.get(i);
            if (c19134.f60317.m51441(c19134.f60318)) {
                c15604 = c7844.f24328;
                c15604.m36789(1, c19134.f60319);
                return;
            }
        }
    }
}
