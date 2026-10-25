package l;

import android.content.DialogInterface;
import android.widget.TextView;
import java.util.List;

/* compiled from: 08W3 */
/* renamed from: l.ۤۜۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10125 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11536 f30470;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f30471;

    public C10125(ActivityC11536 activityC11536, boolean z) {
        this.f30470 = activityC11536;
        this.f30471 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        TextView textView;
        C12346 c12346;
        ActivityC11536 activityC11536 = this.f30470;
        textView = activityC11536.f34445;
        textView.setVisibility(8);
        c12346 = activityC11536.f34442;
        c12346.m29958(true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        this.f30470.f34443 = C13651.m32804(this.f30471);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C13132 c13132;
        c13132 = this.f30470.f34446;
        c13132.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f30470.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C12346 c12346;
        List list;
        TextView textView;
        ActivityC11536 activityC11536 = this.f30470;
        c12346 = activityC11536.f34442;
        c12346.m29958(false);
        list = activityC11536.f34443;
        if (list.isEmpty()) {
            textView = activityC11536.f34445;
            textView.setVisibility(0);
        }
    }
}
