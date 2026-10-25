package l;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: 3B3L */
/* renamed from: l.֡ܶᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC0499 implements Callable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15315 f2127;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21667 f2128;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f2129;

    public /* synthetic */ CallableC0499(C15315 c15315, C21667 c21667, Bundle bundle) {
        this.f2127 = c15315;
        this.f2128 = c21667;
        this.f2129 = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C18845 c18845;
        C18845 c188452;
        C18845 c188453;
        C22372 c22372 = this.f2127.f46970;
        c18845 = c22372.f72501;
        Bundle bundle = c22372.f5606;
        C21667 c21667 = this.f2128;
        c188452 = c21667.f69524;
        if (c18845 == c188452) {
            bundle.clear();
            bundle.putAll(this.f2129);
            c22372.f72492 = null;
            c188453 = c21667.f69524;
            c188453.f59442.m2480(bundle);
            c22372.m5425();
        }
        return null;
    }
}
