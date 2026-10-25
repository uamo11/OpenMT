package l;

import android.view.MenuItem;
import com.google.android.material.tabs.TabLayout;

/* compiled from: 09LR */
/* renamed from: l.֫ܶ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1914 implements InterfaceC10144 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f6437;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f6438;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f6439;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout f6440;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f6441;

    public C1914(ActivityC16024 activityC16024, TabLayout tabLayout, TabLayout.Tab tab, TabLayout.Tab tab2, TabLayout.Tab tab3) {
        this.f6437 = activityC16024;
        this.f6440 = tabLayout;
        this.f6438 = tab;
        this.f6439 = tab2;
        this.f6441 = tab3;
    }

    @Override // l.InterfaceC10144
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6281(C4499 c4499) {
        mo6278(c4499);
    }

    @Override // l.InterfaceC10144
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6278(C4499 c4499) {
        ActivityC16024 activityC16024 = this.f6437;
        activityC16024.f49437 = c4499;
        activityC16024.m37892();
    }

    @Override // l.InterfaceC10144
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6280(boolean z, boolean z2) {
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        MenuItem menuItem4;
        ActivityC16024 activityC16024 = this.f6437;
        menuItem = activityC16024.f49428;
        if (menuItem != null) {
            menuItem4 = activityC16024.f49428;
            menuItem4.setEnabled(z);
        }
        menuItem2 = activityC16024.f49429;
        if (menuItem2 != null) {
            menuItem3 = activityC16024.f49429;
            menuItem3.setEnabled(z2);
        }
    }

    @Override // l.InterfaceC10144
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6277(int i) {
        TabLayout tabLayout = this.f6440;
        if (i == 0) {
            tabLayout.selectTab(this.f6438);
        } else if (i == 1) {
            tabLayout.selectTab(this.f6439);
        } else {
            if (i != 2) {
                return;
            }
            tabLayout.selectTab(this.f6441);
        }
    }

    @Override // l.InterfaceC10144
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6279(boolean z) {
        MenuItem menuItem;
        MenuItem menuItem2;
        ActivityC16024 activityC16024 = this.f6437;
        activityC16024.f10584.setSubtitle(z ? activityC16024.f49436 : activityC16024.f49432);
        menuItem = activityC16024.f49430;
        if (menuItem != null) {
            menuItem2 = activityC16024.f49430;
            menuItem2.setEnabled(z);
        }
    }
}
