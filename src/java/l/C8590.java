package l;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import bin.mt.plus.R;

/* compiled from: W5L3 */
/* renamed from: l.ۡۖۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8590 implements AdapterView.OnItemClickListener {
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C10235 c10235;
        C10235 c102352;
        C10235 c102353;
        C15635 c15635;
        C10235 c102354;
        C10235 c102355;
        C10235 c102356;
        C15635 c156352;
        C15635 c156353;
        C15635 c156354;
        int i2 = C5062.f15913;
        ViewOnClickListenerC19174 viewOnClickListenerC19174 = (ViewOnClickListenerC19174) view.getTag();
        C5062 c5062 = viewOnClickListenerC19174.f60423;
        int i3 = viewOnClickListenerC19174.f60422;
        if (i3 == 0) {
            c10235 = c5062.f15923;
            c10235.mo25910((CharSequence) viewOnClickListenerC19174.f60425);
            c102352 = c5062.f15923;
            c102353 = c5062.f15923;
            c102352.mo25919(c102353.m30526());
            c15635 = c5062.f15914;
            c15635.dismiss();
            return;
        }
        if (i3 == 1) {
            c102354 = c5062.f15923;
            c102354.mo25910((CharSequence) viewOnClickListenerC19174.f60428.m20293());
            c102355 = c5062.f15923;
            c102356 = c5062.f15923;
            c102355.mo25919(c102356.m30526());
            c156352 = c5062.f15914;
            c156352.dismiss();
            return;
        }
        if (i3 == 2) {
            c5062.f15921 = true;
            c156353 = c5062.f15914;
            ListView mo8540 = c156353.mo8540();
            C11003.requireNonNull(mo8540);
            mo8540.setSelector(new ColorDrawable(0));
            c5062.m14613();
            C4925.m14309(500L, new RunnableC1000(3, mo8540));
            return;
        }
        if (i3 == 3) {
            c5062.getContext().startActivity(new Intent(c5062.getContext(), (Class<?>) ActivityC9296.class));
            c156354 = c5062.f15914;
            c156354.dismiss();
        } else if (i3 != 4) {
            if (i3 != 5) {
                throw new IllegalArgumentException();
            }
            C18468 c18468 = new C18468(viewOnClickListenerC19174, (AbstractActivityC3346) C5350.m15313(c5062.getContext()));
            c18468.m31258(R.string.MT_Protector_res_0x7f1205b2);
            c18468.m31261(R.string.MT_Protector_res_0x7f1204ab);
            c18468.m31265(C4925.m14327(R.string.MT_Protector_res_0x7f1204ac));
            c18468.m31276(2);
            c18468.m31268(2);
            c18468.m31244();
            c18468.m31266(true);
        }
    }
}
