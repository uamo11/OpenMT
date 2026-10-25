package l;

import android.view.View;
import android.widget.Button;
import bin.mt.plus.R;

/* compiled from: U2CZ */
/* renamed from: l.۫ۡۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12303 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36632;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36633;

    public /* synthetic */ ViewOnClickListenerC12303(int i, Object obj) {
        this.f36632 = i;
        this.f36633 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36632) {
            case 0:
                C5953.m16677((C5953) this.f36633);
                break;
            case 1:
                ((C17079) this.f36633).m40090();
                view.setEnabled(false);
                ((Button) view).setTextColor(-7829368);
                break;
            case 2:
                C7864 c7864 = (C7864) this.f36633;
                C21282 c21282 = new C21282(c7864.requireContext(), view, 0);
                C3060 m48304 = c21282.m48304();
                String m18061 = C6554.m18061(30, C9523.m24404(c7864.m21123()) + ".xml");
                String m180612 = C6554.m18061(30, c7864.m21123().concat(".xml"));
                m48304.add(R.string.MT_Protector_res_0x7f1205c2, 0, 0, m18061);
                m48304.add(R.string.MT_Protector_res_0x7f1205c2, 1, 0, m180612);
                m48304.add(0, R.string.MT_Protector_res_0x7f120530, 0, R.string.MT_Protector_res_0x7f120530);
                c21282.m48302(new C21415(c7864));
                c21282.m48305();
                break;
            default:
                ActivityC7365.m19795((ActivityC7365) this.f36633);
                break;
        }
    }
}
