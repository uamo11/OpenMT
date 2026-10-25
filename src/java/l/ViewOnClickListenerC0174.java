package l;

import android.view.View;

/* compiled from: J7J5 */
/* renamed from: l.֡ۘ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0174 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1396;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1397;

    public /* synthetic */ ViewOnClickListenerC0174(int i, Object obj) {
        this.f1396 = i;
        this.f1397 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1396;
        Object obj = this.f1397;
        switch (i) {
            case 0:
                int i2 = ActivityC19932.f64528;
                ((ActivityC19932) obj).finish();
                break;
            default:
                ((C4278) obj).m12861(view);
                break;
        }
    }
}
