package l;

import android.view.View;
import android.widget.TextView;

/* compiled from: QB32 */
/* renamed from: l.ۜۘᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6521 implements InterfaceC1008 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f20152;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f20153;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20154;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20155;

    public /* synthetic */ C6521(Object obj, View view, View view2, int i) {
        this.f20154 = i;
        this.f20155 = obj;
        this.f20153 = view;
        this.f20152 = view2;
    }

    @Override // l.InterfaceC1008
    /* renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f20154) {
            case 0:
                ((C12392) this.f20153).m30314(this.f20152, r3.booleanValue() && !r0.f28373, ((C9344) this.f20155).f28368);
                break;
            default:
                AbstractC12488.m30653((AbstractC12488) this.f20155, (TextView) this.f20153, (TextView) this.f20152);
                break;
        }
    }
}
