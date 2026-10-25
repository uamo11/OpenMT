package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: K1PX */
/* renamed from: l.۠ۢۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ActivityC8092 extends AbstractActivityC3346 {

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24923 = 0;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C0452 f24924;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C2448 f24925;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C17264 f24926;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "ApkSelectorActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10214();
        m10241(R.layout.MT_Protector_res_0x7f0d0051);
        m10241(R.string.MT_Protector_res_0x7f120087);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C16558 c16558 = new C16558(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c16558);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC19197(3, this));
        this.f24925 = new C2448(this);
        this.f24926 = new C17264(this);
        TabLayout tabLayout = (TabLayout) m10241(R.id.tabLayout);
        C0452 c0452 = (C0452) m10241(R.id.MT_Protector_res_0x7f0a0685);
        this.f24924 = c0452;
        c0452.m2029(new C10915(this));
        tabLayout.setupWithViewPager(this.f24924);
        this.f24925.f7825.m15199(null);
        final C9504 c9504 = this.f24926.f52916;
        c9504.getClass();
        C1802.f6208.execute(new Runnable() { // from class: l.ܳۢۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C9504 c95042 = C9504.this;
                ActivityC8092 activityC8092 = c95042.f28875;
                PackageManager packageManager = activityC8092.getPackageManager();
                ArrayList arrayList = c95042.f28874;
                arrayList.clear();
                for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                    if ((packageInfo.applicationInfo.flags & 129) == 0) {
                        arrayList.add(new C17970(packageInfo));
                    }
                }
                Collections.sort(arrayList, new C23614());
                activityC8092.runOnUiThread(new Runnable() { // from class: l.ۜۢۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9504.this.notifyDataSetChanged();
                    }
                });
                SystemClock.sleep(100L);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    final C17970 c17970 = (C17970) it.next();
                    final BitmapDrawable m16749 = RunnableC5974.m16749(c17970.f56045);
                    activityC8092.runOnUiThread(new Runnable() { // from class: l.᩷ۢۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C17970 c179702 = C17970.this;
                            boolean z = c179702.f56042;
                            C0734 c0734 = c179702.f56044;
                            BitmapDrawable bitmapDrawable = m16749;
                            if (!z) {
                                c0734.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c0734.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c0734.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
            }
        });
    }
}
