package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: 89CO */
/* renamed from: l.ۤܳܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10356 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9923 f31171;

    public C10356(ActivityC9923 activityC9923) {
        this.f31171 = activityC9923;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ArrayList arrayList;
        arrayList = this.f31171.f29997;
        ((AbstractC21212) abstractC3255).mo19102((AbstractC13882) arrayList.get(i));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ArrayList arrayList;
        arrayList = this.f31171.f29997;
        return arrayList.size();
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        ArrayList arrayList;
        arrayList = this.f31171.f29997;
        return ((AbstractC13882) arrayList.get(i)).mo17036();
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC9923 activityC9923 = this.f31171;
        if (i == 0) {
            return new ViewOnClickListenerC7100(activityC9923, viewGroup);
        }
        if (i == 1) {
            return new C23055(activityC9923, viewGroup);
        }
        if (i == 2) {
            return new ViewOnTouchListenerC18389(activityC9923, viewGroup);
        }
        throw new RuntimeException();
    }
}
