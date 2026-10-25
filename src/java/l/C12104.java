package l;

import android.widget.BaseAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.List;

/* compiled from: L58U */
/* renamed from: l.۫֫ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12104 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC22687 f36177;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12104(AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f36177 = abstractDialogInterfaceOnClickListenerC22687;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        List list;
        DialogInterfaceC0206 dialogInterfaceC0206;
        BaseAdapter baseAdapter;
        AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687 = this.f36177;
        String m31260 = m31260();
        if (m31260.length() == 0) {
            m31262();
            return;
        }
        AbstractC15440 m5957 = C1789.m5957(m31260);
        if (m5957.mo23120()) {
            m31263(R.string.MT_Protector_res_0x7f1202a8);
            return;
        }
        try {
            m5957.mo35195();
            if (!m5957.mo23545()) {
                throw new IOException("Can not create file: " + m5957.mo23554());
            }
            abstractDialogInterfaceOnClickListenerC22687.f73310 = C1789.m5956();
            list = abstractDialogInterfaceOnClickListenerC22687.f73310;
            if (!list.isEmpty()) {
                baseAdapter = abstractDialogInterfaceOnClickListenerC22687.f73314;
                baseAdapter.notifyDataSetChanged();
            } else {
                dialogInterfaceC0206 = abstractDialogInterfaceOnClickListenerC22687.f73304;
                dialogInterfaceC0206.dismiss();
            }
            m31262();
        } catch (IOException e) {
            m31251(e.getMessage());
        }
    }
}
