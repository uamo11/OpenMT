package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* compiled from: J5HS */
/* renamed from: l.ۜۢۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class HandlerC6680 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f20763;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f20764;

    public HandlerC6680(C9503 c9503) {
        super(Looper.getMainLooper());
        this.f20764 = false;
        this.f20763 = new WeakReference(c9503);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean m24347;
        C9503 c9503 = (C9503) this.f20763.get();
        if (c9503 == null) {
            return;
        }
        m24347 = c9503.m24347();
        if (m24347) {
            c9503.f28869 = SystemClock.uptimeMillis();
            removeMessages(0);
            sendEmptyMessageDelayed(0, 1500L);
            return;
        }
        int uptimeMillis = (int) ((SystemClock.uptimeMillis() - c9503.f28869) - 1500);
        if (uptimeMillis < 0) {
            int i = -uptimeMillis;
            if (i < 1500) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, i);
            }
            this.f20764 = true;
            return;
        }
        if (uptimeMillis < 300) {
            this.f20764 = true;
            c9503.invalidate();
            removeMessages(0);
            sendEmptyMessage(0);
            return;
        }
        if (this.f20764) {
            this.f20764 = false;
            c9503.invalidate();
        }
    }
}
