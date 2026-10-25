package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: M74S */
/* renamed from: l.᩻ۙۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23466 implements Runnable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f75297;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f75298;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18528 f75299;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5062 f75300;

    public /* synthetic */ RunnableC23466(C18528 c18528, C5062 c5062, TextView textView, AbstractActivityC3346 abstractActivityC3346) {
        this.f75299 = c18528;
        this.f75300 = c5062;
        this.f75298 = textView;
        this.f75297 = abstractActivityC3346;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.f75299.m43049(this.f75300.m14611().toString().trim()).m34079().size();
        AbstractActivityC3346 abstractActivityC3346 = this.f75297;
        this.f75298.setText(size == 0 ? abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f1206aa) : abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f1209ee, Integer.valueOf(size)));
    }
}
