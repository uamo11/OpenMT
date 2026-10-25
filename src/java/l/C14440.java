package l;

import android.os.SystemClock;
import android.widget.AbsListView;

/* compiled from: J5HS */
/* renamed from: l.ܳۢۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14440 implements AbsListView.OnScrollListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9503 f44261;

    public C14440(C9503 c9503) {
        this.f44261 = c9503;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        HandlerC6680 handlerC6680;
        AbsListView.OnScrollListener onScrollListener;
        AbsListView.OnScrollListener onScrollListener2;
        C9503 c9503 = this.f44261;
        if (i != 0) {
            c9503.f28861 = true;
            c9503.f28853 = SystemClock.uptimeMillis();
        } else {
            c9503.f28869 = SystemClock.uptimeMillis();
            handlerC6680 = c9503.f28864;
            handlerC6680.sendEmptyMessageDelayed(0, 1500L);
            c9503.f28861 = false;
        }
        onScrollListener = c9503.f28873;
        if (onScrollListener != null) {
            onScrollListener2 = c9503.f28873;
            onScrollListener2.onScrollStateChanged(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AbsListView.OnScrollListener onScrollListener;
        AbsListView.OnScrollListener onScrollListener2;
        long uptimeMillis = SystemClock.uptimeMillis();
        C9503 c9503 = this.f44261;
        c9503.f28853 = uptimeMillis;
        onScrollListener = c9503.f28873;
        if (onScrollListener != null) {
            onScrollListener2 = c9503.f28873;
            onScrollListener2.onScroll(absListView, i, i2, i3);
        }
    }
}
