package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: S57O */
/* renamed from: l.ۡܶۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8960 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23097(DialogInterfaceC0206 dialogInterfaceC0206) {
        ViewGroup viewGroup = (ViewGroup) dialogInterfaceC0206.m1433(R.id.MT_Protector_res_0x7f0a00bb);
        if (viewGroup != null) {
            View childAt = viewGroup.getChildAt(0);
            childAt.setPadding(childAt.getPaddingLeft(), 0, childAt.getPaddingRight(), childAt.getPaddingBottom());
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m23098(DialogInterfaceC0206 dialogInterfaceC0206) {
        TextView textView = (TextView) dialogInterfaceC0206.m1433(android.R.id.message);
        C19890.m45744(textView);
        textView.setOnLongClickListener(new ViewOnLongClickListenerC9666(0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23095(DialogInterfaceC0206 dialogInterfaceC0206) {
        ((TextView) dialogInterfaceC0206.m1433(android.R.id.message)).setLineSpacing(0.0f, 1.1f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23096(AbstractActivityC3346 abstractActivityC3346, SpannableStringBuilder spannableStringBuilder) {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44424(spannableStringBuilder);
        c19258.m44440(R.string.MT_Protector_res_0x7f1205c2, (DialogInterface.OnClickListener) null);
        c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
        DialogInterfaceC0206 m44415 = c19258.m44415();
        m44415.m1449();
        m44415.m1448().setOnClickListener(new ViewOnClickListenerC8183(abstractActivityC3346));
        m23097(m44415);
        ((TextView) m44415.m1433(android.R.id.message)).setTextIsSelectable(true);
    }
}
