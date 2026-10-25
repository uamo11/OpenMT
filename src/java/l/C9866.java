package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.Charset;
import java.util.HashMap;

/* compiled from: X8F2 */
/* renamed from: l.ۢ᩸᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9866 extends AbstractC10128 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9160 f29842;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f29843;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9866(C9160 c9160) {
        super(R.string.MT_Protector_res_0x7f120601, R.drawable.MT_Protector_res_0x7f0801e0);
        this.f29842 = c9160;
    }

    @Override // l.AbstractC10128
    /* renamed from: ֫ */
    public final void mo5346(final C16560 c16560) {
        C17626 c17626;
        int i = 1;
        int i2 = C14776.f45125 + 1;
        String[] strArr = new String[i2];
        strArr[0] = C4925.m14327(R.string.MT_Protector_res_0x7f1200fe);
        for (int i3 = 1; i3 < i2; i3++) {
            strArr[i3] = C14776.m35153(i3 - 1);
        }
        this.f29843 = 0;
        c17626 = this.f29842.f27726;
        String m41203 = c17626.m41203();
        if (m41203 != null) {
            while (true) {
                if (i >= i2) {
                    break;
                }
                if (m41203.equals(C14776.m35151(i - 1).name())) {
                    this.f29843 = i;
                    break;
                }
                i++;
            }
        }
        C19258 buildDialog = c16560.m39056().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1205af);
        buildDialog.m44429(strArr, this.f29843, new DialogInterface.OnClickListener() { // from class: l.᩷᩸᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C17626 c176262;
                HashMap hashMap;
                C17626 c176263;
                HashMap hashMap2;
                C9866 c9866 = C9866.this;
                C9160 c9160 = c9866.f29842;
                if (c9866.f29843 != i4) {
                    if (i4 == 0) {
                        c176263 = c9160.f27726;
                        c176263.m41205(null);
                        hashMap2 = C9160.f27722;
                        hashMap2.remove(c9160.m23568());
                    } else {
                        Charset m35151 = C14776.m35151(i4 - 1);
                        c176262 = c9160.f27726;
                        c176262.m41205(m35151.name());
                        hashMap = C9160.f27722;
                        hashMap.put(c9160.m23568(), m35151.name());
                    }
                    c16560.m39055();
                }
                dialogInterface.dismiss();
            }
        });
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44438();
    }
}
