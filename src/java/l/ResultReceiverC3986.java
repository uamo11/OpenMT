package l;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;

/* compiled from: C2CV */
/* renamed from: l.ۘܰᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ResultReceiverC3986 extends ResultReceiver {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f12636;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile int f12637;

    public ResultReceiverC3986() {
        super(null);
        this.f12637 = -1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12027() {
        this.f12637 = -1;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f12637 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12026() {
        if (f12636 > 10) {
            return -1;
        }
        for (int i = 0; this.f12637 == -1 && i < 60; i += 5) {
            SystemClock.sleep(5L);
        }
        if (this.f12637 == -1) {
            f12636++;
        } else {
            f12636 = 0;
        }
        return this.f12637;
    }
}
