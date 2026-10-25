package l;

import android.widget.TextView;
import java.util.List;

/* compiled from: K7HV */
/* renamed from: l.᩵᩻ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19798 extends AbstractC2968 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4980 f63946;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f63947;

    public C19798(ActivityC4980 activityC4980, TextView textView) {
        this.f63946 = activityC4980;
        this.f63947 = textView;
    }

    @Override // l.AbstractC2968
    public final void onChanged() {
        List list;
        list = this.f63946.f15688;
        this.f63947.setVisibility(list.isEmpty() ? 0 : 8);
    }

    @Override // l.AbstractC2968
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }
}
