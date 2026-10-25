package l;

import com.google.android.material.tabs.TabLayout;

/* compiled from: 4AWI */
/* renamed from: l.ۙܿܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4795 implements TabLayout.OnTabSelectedListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f15196;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C4795(ActivityC0477 activityC0477) {
        this.f15196 = activityC0477;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        C5242 c5242;
        c5242 = this.f15196.f2065;
        c5242.mo1669(Integer.valueOf(tab.getPosition()));
    }
}
