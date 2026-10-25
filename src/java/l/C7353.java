package l;

import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: 09LR */
/* renamed from: l.۟۠᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7353 implements TabLayout.OnTabSelectedListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f22569;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f22570;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f22571;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f22572;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C7353(ActivityC16024 activityC16024, TabLayout.Tab tab, TabLayout.Tab tab2, TabLayout.Tab tab3) {
        this.f22569 = activityC16024;
        this.f22570 = tab;
        this.f22571 = tab2;
        this.f22572 = tab3;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        C13670 c13670;
        C13670 c136702;
        C13670 c136703;
        C13670 c136704;
        C13670 c136705;
        C13670 c136706;
        TabLayout.Tab tab2 = this.f22570;
        ActivityC16024 activityC16024 = this.f22569;
        if (tab == tab2) {
            c136705 = activityC16024.f49434;
            c136705.m32865(0);
            c136706 = activityC16024.f49434;
            if (c136706.m32885()) {
                return;
            }
            C21374.m48465();
            return;
        }
        if (tab == this.f22571) {
            c136703 = activityC16024.f49434;
            c136703.m32865(1);
            c136704 = activityC16024.f49434;
            if (c136704.m32885()) {
                return;
            }
            C21374.m48457(R.string.MT_Protector_res_0x7f1201f0);
            return;
        }
        if (tab == this.f22572) {
            c13670 = activityC16024.f49434;
            c13670.m32865(2);
            c136702 = activityC16024.f49434;
            if (c136702.m32885()) {
                return;
            }
            C21374.m48465();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        C13670 c13670;
        C13670 c136702;
        ActivityC16024 activityC16024 = this.f22569;
        c13670 = activityC16024.f49434;
        c136702 = activityC16024.f49434;
        c13670.m32880(!c136702.m32884());
    }
}
