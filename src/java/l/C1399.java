package l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: K22G */
/* renamed from: l.֨᩹, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1399 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object f5039;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Activity f5040;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f5044;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f5043 = false;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f5042 = false;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f5041 = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public C1399(Activity activity) {
        this.f5040 = activity;
        this.f5044 = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f5040 == activity) {
            this.f5043 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f5042 || this.f5041 || this.f5043 || !C8455.m22137(this.f5039, this.f5044, activity)) {
            return;
        }
        this.f5041 = true;
        this.f5039 = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f5040 == activity) {
            this.f5040 = null;
            this.f5042 = true;
        }
    }
}
