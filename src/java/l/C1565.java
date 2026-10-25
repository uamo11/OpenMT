package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.Charset;
import java.util.HashMap;

/* compiled from: Z202 */
/* renamed from: l.֫ۗ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1565 extends AbstractC10128 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f5521;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f5522;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565(C10738 c10738) {
        super(R.string.MT_Protector_res_0x7f120601, R.drawable.MT_Protector_res_0x7f0801e0);
        this.f5521 = c10738;
    }

    @Override // l.AbstractC10128
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5346(final C16560 c16560) {
        C19247 c19247;
        int i = 1;
        int i2 = C14776.f45125 + 1;
        String[] strArr = new String[i2];
        strArr[0] = C4925.m14327(R.string.MT_Protector_res_0x7f1200fe);
        for (int i3 = 1; i3 < i2; i3++) {
            strArr[i3] = C14776.m35153(i3 - 1);
        }
        this.f5522 = 0;
        c19247 = this.f5521.f32357;
        String m44382 = c19247.m44382();
        if (m44382 != null) {
            while (true) {
                if (i >= i2) {
                    break;
                }
                if (m44382.equals(C14776.m35151(i - 1).name())) {
                    this.f5522 = i;
                    break;
                }
                i++;
            }
        }
        C19258 buildDialog = c16560.m39056().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1205af);
        buildDialog.m44429(strArr, this.f5522, new DialogInterface.OnClickListener() { // from class: l.۟ۙ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C19247 c192472;
                HashMap hashMap;
                C19247 c192473;
                HashMap hashMap2;
                C1565 c1565 = C1565.this;
                C10738 c10738 = c1565.f5521;
                if (c1565.f5522 != i4) {
                    if (i4 == 0) {
                        c192473 = c10738.f32357;
                        c192473.m44387((Charset) null);
                        hashMap2 = C10738.f32352;
                        hashMap2.remove(c10738.m26937());
                    } else {
                        Charset m35151 = C14776.m35151(i4 - 1);
                        c192472 = c10738.f32357;
                        c192472.m44387(m35151);
                        hashMap = C10738.f32352;
                        hashMap.put(c10738.m26937(), m35151.name());
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
