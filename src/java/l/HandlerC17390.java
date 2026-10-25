package l;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* compiled from: D5GW */
/* renamed from: l.ܿܰܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC17390 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53226;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakReference f53227;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f53228 = false;

    public HandlerC17390(C6807 c6807) {
        this.f53227 = new WeakReference(c6807);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40745() {
        this.f53226 = false;
        removeMessages(0);
        sendEmptyMessageDelayed(0, 500L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40744() {
        removeMessages(0);
        this.f53226 = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long j;
        C6807 c6807 = (C6807) this.f53227.get();
        if (c6807 == null) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            if (this.f53226) {
                return;
            }
            if (c6807.f21118.m13757()) {
                c6807.invalidate();
            }
            sendEmptyMessageDelayed(0, 500L);
            return;
        }
        if (i == 2) {
            C6807.m18467(c6807);
            return;
        }
        if (i != 3) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        j = c6807.f21108;
        int i2 = (int) ((uptimeMillis - j) - 1500);
        if (i2 < 0) {
            int i3 = -i2;
            if (i3 < 1500) {
                removeMessages(3);
                sendEmptyMessageDelayed(3, i3);
            }
            this.f53228 = true;
            return;
        }
        if (i2 < 300) {
            this.f53228 = true;
            c6807.invalidate();
            removeMessages(3);
            sendEmptyMessage(3);
            return;
        }
        if (this.f53228) {
            this.f53228 = false;
            c6807.invalidate();
        }
    }
}
