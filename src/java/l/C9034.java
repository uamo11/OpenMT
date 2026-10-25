package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;

/* compiled from: G9AG */
/* renamed from: l.ۡܿ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9034 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        c2450.m7907(b.k);
        AbstractC3577 m15171 = ((C5259) c2450.m7922()).m15171();
        if (m15171 == null) {
            C21374.m48463(R.string.MT_Protector_res_0x7f1206c7);
            return;
        }
        C17534 c17534 = new C17534(m15171, true);
        C17534 c175342 = new C17534(m15171, false);
        final ArrayList arrayList = new ArrayList();
        for (InterfaceC17889 interfaceC17889 : c2450.m7909()) {
            arrayList.add(C9068.m23416(interfaceC17889.getPath(), interfaceC17889.isDirectory() ? c17534 : c175342));
        }
        final C9340 m39016 = c2450.m7921().m39016();
        if (arrayList.size() <= 5) {
            C9068.m23405(arrayList, m39016.m24082());
            C1099.m3771(c2450.m7917());
            return;
        }
        C19258 buildDialog = c2450.m7917().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1205ae);
        buildDialog.m44424(C4925.m14306(R.string.MT_Protector_res_0x7f12002e, Integer.valueOf(arrayList.size())));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۢܿ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C9068.m23405(arrayList, m39016.m24082());
                C1099.m3771(c2450.m7917());
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}
