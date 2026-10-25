package l;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import bin.mt.plus.R;

/* compiled from: X53D */
/* renamed from: l.ۙ᩸ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4915 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14286(final C13132 c13132) {
        ViewGroup viewGroup = (ViewGroup) c13132.getParent();
        final View findViewById = viewGroup.findViewById(R.id.MT_Protector_res_0x7f0a04cb);
        final View findViewById2 = viewGroup.findViewById(R.id.MT_Protector_res_0x7f0a04ca);
        if (Build.VERSION.SDK_INT >= 23) {
            C17648.m41314(c13132, 3, 3);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        c13132.addOnScrollListener(new C8443(findViewById, findViewById2));
        c13132.post(new Runnable() { // from class: l.ۚ᩸ۡ
            @Override // java.lang.Runnable
            public final void run() {
                C4915.m14282((View) C13132.this, findViewById, findViewById2);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14284(final ListView listView) {
        ViewGroup viewGroup = (ViewGroup) listView.getParent();
        final View findViewById = viewGroup.findViewById(R.id.MT_Protector_res_0x7f0a04cb);
        final View findViewById2 = viewGroup.findViewById(R.id.MT_Protector_res_0x7f0a04ca);
        if (Build.VERSION.SDK_INT >= 23) {
            C17648.m41314(listView, 3, 3);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        listView.setOnScrollListener(new C15497(findViewById, findViewById2));
        listView.post(new Runnable() { // from class: l.֨᩸ۡ
            @Override // java.lang.Runnable
            public final void run() {
                C4915.m14282((View) listView, findViewById, findViewById2);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14282(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }
}
