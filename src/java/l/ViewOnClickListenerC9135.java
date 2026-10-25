package l;

import android.view.View;
import android.widget.TextView;

/* compiled from: 61L9 */
/* renamed from: l.ۡ᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9135 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27662;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27663;

    public /* synthetic */ ViewOnClickListenerC9135(int i, Object obj) {
        this.f27662 = i;
        this.f27663 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f27662;
        Object obj = this.f27663;
        switch (i) {
            case 0:
                ((ActivityC1748) obj).f6050.m37583();
                break;
            case 1:
                C10235 c10235 = (C10235) obj;
                String charSequence = ((TextView) view).getText().toString();
                int m30444 = c10235.m30444();
                int m30448 = c10235.m30448();
                if (m30444 > m30448) {
                    m30448 = m30444;
                    m30444 = m30448;
                }
                c10235.m30436().replace(m30444, m30448, charSequence);
                c10235.mo25919(charSequence.length() + m30444);
                break;
            case 2:
                C1793.m5966((C1793) obj);
                break;
            case 3:
                int i2 = AbstractC6138.f18912;
                ((C22933) obj).m51051();
                break;
            default:
                int i3 = ActivityC6242.f19308;
                ((ActivityC6242) obj).finish();
                break;
        }
    }
}
