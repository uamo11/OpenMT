package l;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Handler;

/* compiled from: P6KF */
/* renamed from: l.ᩴۖۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18469 extends ConnectivityManager.NetworkCallback {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0123 f57267;

    public C18469(C0123 c0123) {
        this.f57267 = c0123;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Handler handler;
        RunnableC7968 runnableC7968;
        C0123 c0123 = this.f57267;
        handler = c0123.f1227;
        runnableC7968 = c0123.f1228;
        handler.post(runnableC7968);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Handler handler;
        RunnableC7968 runnableC7968;
        C0123 c0123 = this.f57267;
        handler = c0123.f1227;
        runnableC7968 = c0123.f1228;
        handler.post(runnableC7968);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        Handler handler;
        RunnableC7968 runnableC7968;
        C0123 c0123 = this.f57267;
        handler = c0123.f1227;
        runnableC7968 = c0123.f1228;
        handler.post(runnableC7968);
    }
}
