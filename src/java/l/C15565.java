package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: A7IB */
/* renamed from: l.ܶ᩻ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15565 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6394 f47973;

    public C15565(ActivityC6394 activityC6394) {
        this.f47973 = activityC6394;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ArrayList arrayList;
        arrayList = this.f47973.f19792;
        ((AbstractC10628) abstractC3255).mo26658((AbstractC20506) arrayList.get(i));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ArrayList arrayList;
        arrayList = this.f47973.f19792;
        return arrayList.size();
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        ArrayList arrayList;
        arrayList = this.f47973.f19792;
        return ((AbstractC20506) arrayList.get(i)).mo14471();
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC6394 activityC6394 = this.f47973;
        if (i == 1) {
            return new C22622(activityC6394, viewGroup);
        }
        if (i == 2) {
            return new ViewOnTouchListenerC12744(activityC6394, viewGroup);
        }
        throw new RuntimeException();
    }
}
