package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: D7B1 */
/* renamed from: l.֫۬᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC1853 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C20864 f6330;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f6331;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11026 f6332;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f6333;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f6334;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC1853(C11026 c11026, View view) {
        super(view);
        int m27366;
        this.f6332 = c11026;
        this.f6331 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f6334 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a04f1);
        m27366 = C11026.m27366(view);
        this.f6333 = m27366;
        view.setOnClickListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6162(C20864 c20864) {
        AbstractActivityC3346 abstractActivityC3346;
        AbstractActivityC3346 abstractActivityC33462;
        AbstractActivityC3346 abstractActivityC33463;
        this.f6330 = c20864;
        String str = c20864.f67522;
        C11026 c11026 = this.f6332;
        TextView textView = this.f6331;
        if (str != null) {
            textView.setText(str);
            abstractActivityC33463 = c11026.f33146;
            textView.setTextColor(C0881.m3228(abstractActivityC33463, R.color.MT_Protector_res_0x7f06039c));
        } else {
            String str2 = c20864.f67518;
            boolean z = c20864.f67525;
            abstractActivityC3346 = c11026.f33146;
            String string = abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12007d);
            if (z) {
                SpannableString spannableString = new SpannableString(C16014.m37867(str2, string));
                spannableString.setSpan(new ForegroundColorSpan(C21943.f70269), str2.length(), spannableString.length(), 33);
                str2 = spannableString;
            }
            textView.setText(str2);
            textView.setTextColor(this.f6333);
        }
        abstractActivityC33462 = c11026.f33146;
        this.f6334.setText(abstractActivityC33462.getString(R.string.MT_Protector_res_0x7f12007b, C22927.m51028(c20864.f67524), C17283.m40572(c20864.f67523)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C20864 c20864 = this.f6330;
        if (c20864 != null) {
            C11026.m27363(this.f6332, c20864);
        }
    }
}
