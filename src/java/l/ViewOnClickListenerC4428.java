package l;

import android.view.View;
import android.widget.EditText;

/* compiled from: 8AHX */
/* renamed from: l.ۙۙ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4428 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14161;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14162;

    public /* synthetic */ ViewOnClickListenerC4428(int i, Object obj) {
        this.f14161 = i;
        this.f14162 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14161) {
            case 0:
                C5839.m16354((C5839) this.f14162);
                break;
            case 1:
                EditText editText = (EditText) this.f14162;
                String m14330 = C4925.m14330();
                if (m14330 != null) {
                    editText.setText(m14330.trim());
                    editText.setSelection(editText.length());
                    break;
                }
                break;
            default:
                AbstractActivityC12266.m29781((AbstractActivityC12266) this.f14162);
                break;
        }
    }
}
