package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 22BV */
/* renamed from: l.۟ۧ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7437 extends AbstractC10128 {
    @Override // l.AbstractC10128
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo19969(C16560 c16560) {
        return c16560.m39030();
    }

    @Override // l.AbstractC10128
    /* renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        String lowerCase = C4925.m14327(R.string.MT_Protector_res_0x7f12044a).toLowerCase();
        final List m39062 = c16560.m39062();
        String m14306 = m39062.size() == 1 ? C4925.m14306(R.string.MT_Protector_res_0x7f1203b2, lowerCase, ((InterfaceC17889) m39062.get(0)).mo36985()) : C4925.m14306(R.string.MT_Protector_res_0x7f1203b1, lowerCase, Integer.valueOf(m39062.size()));
        StringBuilder m19190 = C7166.m19190(m14306, "\n\n");
        m19190.append(C4925.m14327(R.string.MT_Protector_res_0x7f12044d));
        SpannableString spannableString = new SpannableString(m19190.toString());
        spannableString.setSpan(new ForegroundColorSpan(C21943.f70269), m14306.length(), spannableString.length(), 17);
        spannableString.setSpan(new RelativeSizeSpan(0.25f), m14306.length(), m14306.length() + 2, 17);
        spannableString.setSpan(new RelativeSizeSpan(0.9f), m14306.length() + 2, spannableString.length(), 17);
        C19258 buildDialog = c16560.m39056().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f12044a);
        buildDialog.m44424(spannableString);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ܰۧ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C17315.m40624((List) C5378.stream(m39062).map(new C1775(1)).collect(C22976.toList()));
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        C8960.m23097(buildDialog.m44438());
    }
}
