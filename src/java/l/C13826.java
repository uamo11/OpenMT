package l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: Y6Y9 */
/* renamed from: l.ܰ۫᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13826 implements TabLayout.OnTabSelectedListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f41241;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f41242;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC8889 f41243;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC14532 f41244;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f41245;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View[] f41246;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f41247;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC15943 f41248;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    public C13826(View view, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206, RunnableC14532 runnableC14532, RunnableC15943 runnableC15943, View[] viewArr, C3264 c3264, RunnableC8889 runnableC8889) {
        this.f41242 = view;
        this.f41241 = abstractActivityC3346;
        this.f41247 = dialogInterfaceC0206;
        this.f41244 = runnableC14532;
        this.f41248 = runnableC15943;
        this.f41246 = viewArr;
        this.f41245 = c3264;
        this.f41243 = runnableC8889;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        View view = this.f41242;
        View findFocus = view.findFocus();
        if (findFocus != null) {
            findFocus.clearFocus();
            ((InputMethodManager) this.f41241.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        int position = tab.getPosition();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f41247;
        dialogInterfaceC0206.m1448().setVisibility(position < 2 ? 8 : 0);
        dialogInterfaceC0206.m1448().setText(position == 3 ? R.string.MT_Protector_res_0x7f12057b : R.string.MT_Protector_res_0x7f12056d);
        if (position == 1) {
            this.f41244.run();
        }
        View[] viewArr = this.f41246;
        if (position == 2) {
            this.f41248.run();
            ((C2447) viewArr[2].findViewById(R.id.MT_Protector_res_0x7f0a04c3)).m7903();
        }
        if (position == 3) {
            this.f41245.m10007();
            ((C2447) viewArr[3].findViewById(R.id.MT_Protector_res_0x7f0a007d)).m7903();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        if (tab.getPosition() == 0) {
            this.f41243.run();
        }
    }
}
