package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 892H */
/* renamed from: l.ᩴ᩶᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18995 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43831(AbstractActivityC3346 abstractActivityC3346) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00cf);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0487);
        C13132 c13132 = (C13132) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0488);
        TextView textView2 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0190);
        textView2.setText("-- " + ((Object) textView2.getText()) + " --");
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a00a2).setOnClickListener(new ViewOnClickListenerC8613(abstractActivityC3346, 2));
        textView.setText(((Object) textView.getText()) + " ↓↓");
        C2767 c2767 = new C2767(abstractActivityC3346);
        c2767.registerAdapterDataObserver(new C9823(c2767, c13132, textView2));
        c2767.notifyDataSetChanged();
        c13132.setAdapter(c2767);
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44438();
    }
}
