package l;

import android.database.DataSetObserver;
import android.widget.TextView;

/* compiled from: G135 */
/* renamed from: l.֨֨ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0792 extends DataSetObserver {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14903 f2907;

    public C0792(ActivityC14903 activityC14903) {
        this.f2907 = activityC14903;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        TextView textView;
        C7848 c7848;
        ActivityC14903 activityC14903 = this.f2907;
        textView = activityC14903.f45465;
        c7848 = activityC14903.f45467;
        textView.setVisibility(c7848.getCount() == 0 ? 0 : 8);
    }
}
