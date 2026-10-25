package l;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: Q28R */
/* renamed from: l.ۗ᩺ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3548 extends AbstractC8255 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f11280;

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final boolean mo8847(View view) {
        return true;
    }

    public C3548(AbstractC15440 abstractC15440) {
        this.f11280 = abstractC15440;
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫ */
    public final View mo8845(Main main) {
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00da);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        String[] strArr = {this.f11280.getName()};
        int i = C13425.f40110;
        textView.setText(C4925.m14306(R.string.MT_Protector_res_0x7f120642, strArr));
        return m10216;
    }

    @Override // l.AbstractC8255
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10817(DialogInterfaceC0206 dialogInterfaceC0206) {
        Button m1447 = dialogInterfaceC0206.m1447();
        m1447.setEnabled(false);
        C4925.m14309(800L, new RunnableC6438(3, m1447));
    }
}
