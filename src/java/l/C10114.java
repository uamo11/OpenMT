package l;

import android.app.Activity;
import android.os.SystemClock;

/* compiled from: W52J */
/* renamed from: l.ۤۛ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10114 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f30454;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30455 = true;

    public C10114(Activity activity) {
        C10975.m27286();
        activity.runOnUiThread(new RunnableC8425(3, this, activity));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25395(C10114 c10114) {
        c10114.f30455 = false;
        c10114.f30454 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25394(C10114 c10114) {
        c10114.f30455 = false;
        c10114.f30454 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25396() {
        C10975.m27286();
        while (this.f30455) {
            SystemClock.sleep(100L);
        }
        return this.f30454;
    }
}
