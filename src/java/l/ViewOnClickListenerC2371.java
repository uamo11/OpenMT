package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: T5WJ */
/* renamed from: l.ۖۜᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2371 implements View.OnClickListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7567;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7568;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7569;

    public /* synthetic */ ViewOnClickListenerC2371(int i, Object obj, Object obj2) {
        this.f7568 = i;
        this.f7569 = obj;
        this.f7567 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7568) {
            case 0:
                boolean[] zArr = (boolean[]) this.f7569;
                BaseAdapter baseAdapter = (BaseAdapter) this.f7567;
                for (int i = 0; i < zArr.length; i++) {
                    zArr[i] = !zArr[i];
                }
                baseAdapter.notifyDataSetChanged();
                break;
            default:
                Main main = (Main) this.f7569;
                final EditText editText = (EditText) this.f7567;
                ArrayList arrayList = new ArrayList(C14776.f45125 + 1);
                arrayList.add(main.getString(R.string.MT_Protector_res_0x7f1200fe));
                int i2 = editText.length() == 0 ? 0 : -1;
                String obj = editText.getText().toString();
                for (int i3 = 0; i3 < C14776.f45125; i3++) {
                    String m35153 = C14776.m35153(i3);
                    if (m35153.equalsIgnoreCase(obj)) {
                        i2 = arrayList.size();
                    }
                    arrayList.add(m35153);
                }
                final String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C19258 buildDialog = main.buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f1206b6);
                buildDialog.m44429(strArr, i2, new DialogInterface.OnClickListener() { // from class: l.۠ᩳ᩻
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        editText.setText(i4 == 0 ? "" : strArr[i4]);
                        dialogInterface.dismiss();
                    }
                });
                buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
                buildDialog.m44438();
                break;
        }
    }
}
