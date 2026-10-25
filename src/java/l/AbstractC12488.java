package l;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: E7TE */
/* renamed from: l.۫ܶۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC12488 extends AbstractC3817 {

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37519 = 0;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public abstract void m30654();

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final DialogInterfaceC0206 mo10130(AbstractActivityC3346 abstractActivityC3346) {
        m11522(abstractActivityC3346);
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00b2);
        TextView textView = (TextView) m10216.findViewById(R.id.textView1);
        TextView textView2 = (TextView) m10216.findViewById(R.id.textView2);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a00a2).setOnClickListener(new View.OnClickListener() { // from class: l.۬ܶۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = AbstractC12488.f37519;
                AbstractC12488 abstractC12488 = AbstractC12488.this;
                abstractC12488.getClass();
                view.setEnabled(false);
                ((Button) view).setTextColor(-7829368);
                abstractC12488.m30654();
            }
        });
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44428(false);
        buildDialog.m44421(m10216);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        m11532().m1668(m44438, new C6521(this, textView, textView2, 1));
        return m44438;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30653(AbstractC12488 abstractC12488, TextView textView, TextView textView2) {
        if (abstractC12488.m11561()) {
            textView.setText(abstractC12488.m11557());
        }
        if (abstractC12488.m11547()) {
            textView2.setText(abstractC12488.m11534());
        }
    }
}
