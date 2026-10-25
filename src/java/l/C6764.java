package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: A940 */
/* renamed from: l.ۜ۫ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6764 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18413(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList, RunnableC18457 runnableC18457) {
        final ArrayList arrayList2 = new ArrayList(arrayList);
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00a7);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        ImageView imageView = (ImageView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0640);
        final C13132 c13132 = (C13132) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
        textView.setText(R.string.MT_Protector_res_0x7f1209b5);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080221);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.֫۫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC19902 adapter = c13132.getAdapter();
                boolean z = view.getTag(R.id.MT_Protector_res_0x7f0a0540) != null;
                C21282 c21282 = new C21282(view.getContext(), view, 0);
                C3060 m48304 = c21282.m48304();
                m48304.add(0, R.string.MT_Protector_res_0x7f1209b7, 0, R.string.MT_Protector_res_0x7f1209b7);
                m48304.add(0, R.string.MT_Protector_res_0x7f1209b6, 0, R.string.MT_Protector_res_0x7f1209b6);
                m48304.add(0, R.string.MT_Protector_res_0x7f1209b8, 0, R.string.MT_Protector_res_0x7f1209b8);
                m48304.add(0, R.string.MT_Protector_res_0x7f1209b9, 0, R.string.MT_Protector_res_0x7f1209b9);
                m48304.add(0, R.string.MT_Protector_res_0x7f1209ba, 0, R.string.MT_Protector_res_0x7f1209ba).setCheckable(true).setChecked(z);
                c21282.m48302(new C17347(arrayList2, z, view, adapter));
                c21282.m48305();
            }
        });
        C4915.m14286(c13132);
        C1556 c1556 = new C1556(new C16641(arrayList2));
        c13132.setAdapter(new C14524(abstractActivityC3346, arrayList2, c1556));
        c1556.m5322(c13132);
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC10998(arrayList, arrayList2, runnableC18457, 0));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}
