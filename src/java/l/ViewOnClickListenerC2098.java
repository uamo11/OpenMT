package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: G1PO */
/* renamed from: l.֫᩸ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2098 implements View.OnClickListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7025;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f7026;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7027 = 1;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7028;

    public /* synthetic */ ViewOnClickListenerC2098(C2450 c2450, C16560 c16560, EditText editText) {
        this.f7028 = c2450;
        this.f7025 = c16560;
        this.f7026 = editText;
    }

    public /* synthetic */ ViewOnClickListenerC2098(C7309 c7309, EditText editText, EditText editText2) {
        this.f7028 = c7309;
        this.f7026 = editText;
        this.f7025 = editText2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f7027;
        final EditText editText = this.f7026;
        Object obj = this.f7025;
        Object obj2 = this.f7028;
        switch (i) {
            case 0:
                C7309 c7309 = (C7309) obj2;
                c7309.m19594();
                C2079.m6836(c7309.f22440, c7309.f22438, editText, (EditText) obj);
                break;
            default:
                C2450 c2450 = (C2450) obj2;
                C16560 c16560 = (C16560) obj;
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                AbstractC15440 m39866 = C16999.m39866(c2450.m7926(), new String[0]);
                String name = m39866.getName();
                if (name.isEmpty()) {
                    name = C4925.m14327(R.string.MT_Protector_res_0x7f1208bf);
                }
                if (c2450.m7921().m39064()) {
                    arrayList2.add(C4925.m14306(R.string.MT_Protector_res_0x7f12020c, name));
                } else {
                    arrayList2.add(C4925.m14306(R.string.MT_Protector_res_0x7f12020d, name));
                }
                arrayList.add(m39866);
                AbstractC15440 m398662 = C16999.m39866(c16560.m39058(), new String[0]);
                String name2 = m398662.getName();
                if (name2.isEmpty()) {
                    name2 = C4925.m14327(R.string.MT_Protector_res_0x7f1208bf);
                }
                if (c16560.m39064()) {
                    arrayList2.add(0, C4925.m14306(R.string.MT_Protector_res_0x7f12020c, name2));
                    arrayList.add(0, m398662);
                } else {
                    arrayList2.add(C4925.m14306(R.string.MT_Protector_res_0x7f12020d, name2));
                    arrayList.add(m398662);
                }
                C19258 buildDialog = c2450.m7917().buildDialog();
                buildDialog.m44430((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: l.۬ܽ᩻
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String mo23554 = ((AbstractC15440) arrayList.get(i2)).mo23554();
                        EditText editText2 = editText;
                        editText2.setText(mo23554);
                        editText2.setSelection(editText2.length());
                    }
                });
                buildDialog.m44438();
                break;
        }
    }
}
