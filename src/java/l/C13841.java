package l;

import android.view.View;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: K7A7 */
/* renamed from: l.ܰ۬ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13841 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33200(final AbstractActivityC3346 abstractActivityC3346, TextInputLayout textInputLayout, final EditText editText, final RunnableC20884 runnableC20884) {
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector_res_0x7f080221);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.᩺۬ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13841.m33201(AbstractActivityC3346.this, runnableC20884, editText);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33201(AbstractActivityC3346 abstractActivityC3346, Runnable runnable, EditText editText) {
        C9340 m132;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if ((abstractActivityC3346 instanceof Main) && (m132 = ((Main) abstractActivityC3346).m132()) != null) {
            m33199(arrayList, arrayList2, m132.m24091(), R.string.MT_Protector_res_0x7f12020c);
            m33199(arrayList, arrayList2, m132.m24072(), R.string.MT_Protector_res_0x7f12020d);
        }
        arrayList2.add(C4925.m14327(R.string.MT_Protector_res_0x7f1209e3));
        arrayList.add(C16293.f50120);
        Iterator it = ((ArrayList) C19739.m45451()).iterator();
        while (it.hasNext()) {
            C4216 c4216 = (C4216) it.next();
            arrayList2.add(c4216.f13686);
            arrayList.add(C16999.m39864(c4216.f13687));
        }
        if (runnable != null) {
            arrayList2.add(C4925.m14327(R.string.MT_Protector_res_0x7f120927));
        }
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44430((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterfaceOnClickListenerC23725(runnable, arrayList, editText, 1));
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33199(ArrayList arrayList, ArrayList arrayList2, C16560 c16560, int i) {
        if (c16560.m39035("local")) {
            AbstractC15440 m39866 = C16999.m39866(c16560.m39020(), new String[0]);
            String name = m39866.getName();
            if (name.isEmpty()) {
                name = C4925.m14327(R.string.MT_Protector_res_0x7f1208bf);
            }
            arrayList2.add(C4925.m14306(i, name));
            arrayList.add(m39866);
        }
    }
}
