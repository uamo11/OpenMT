package l;

import android.view.View;

/* compiled from: P676 */
/* renamed from: l.ۖ᩹ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2825 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9044;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9045;

    public /* synthetic */ ViewOnClickListenerC2825(int i, Object obj) {
        this.f9044 = i;
        this.f9045 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9044) {
            case 0:
                ((ActivityC21107) this.f9045).m48068();
                break;
            case 1:
                C1793.m5974((C1793) this.f9045);
                break;
            default:
                ActivityC10227.m25708((ActivityC10227) this.f9045, view);
                break;
        }
    }
}
