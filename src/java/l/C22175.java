package l;

import android.app.Activity;

/* compiled from: P1KP */
/* renamed from: l.᩹ۡ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22175 extends C22196 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3125 f71945;

    public C22175(C3125 c3125) {
        this.f71945 = c3125;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        C11233.m27805(activity, "activity");
        this.f71945.m9511();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C11233.m27805(activity, "activity");
        this.f71945.m9512();
    }
}
