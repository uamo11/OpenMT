package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.Selection;
import android.text.method.TextKeyListener;
import java.lang.ref.WeakReference;

/* compiled from: X68P */
/* renamed from: l.ܰۛᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class HandlerC13637 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f40655;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f40656;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40657;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f40658;

    public HandlerC13637(C12392 c12392) {
        super(Looper.getMainLooper());
        this.f40658 = false;
        this.f40657 = false;
        this.f40655 = new WeakReference(c12392);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        long j2;
        C12392 c12392 = (C12392) this.f40655.get();
        if (c12392 != null) {
            switch (message.what) {
                case 1:
                    z = c12392.f37304;
                    if (!z) {
                        c12392.m30291(Selection.getSelectionEnd(c12392.f37322), false);
                        break;
                    }
                    break;
                case 2:
                    c12392.m30299(-1);
                    break;
                case 3:
                    z2 = c12392.f37172;
                    if (z2) {
                        c12392.m30240();
                        this.f40658 = true;
                        break;
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        j = c12392.f37314;
                        int i = (int) ((uptimeMillis - j) - 1500);
                        if (i < 0) {
                            int i2 = -i;
                            if (i2 < 1500) {
                                removeMessages(3);
                                sendEmptyMessageDelayed(3, i2);
                            }
                            this.f40658 = true;
                            break;
                        } else if (i < 300) {
                            this.f40658 = true;
                            c12392.invalidate();
                            removeMessages(3);
                            sendEmptyMessage(3);
                            break;
                        } else if (this.f40658) {
                            this.f40658 = false;
                            c12392.invalidate();
                            break;
                        }
                    }
                    break;
                case 4:
                    if (!this.f40656) {
                        c12392.invalidate();
                        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
                        break;
                    }
                    break;
                case 5:
                    z3 = c12392.f37294;
                    if (z3) {
                        c12392.m30187();
                        this.f40657 = true;
                        break;
                    } else {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        j2 = c12392.f37309;
                        int i3 = (int) ((uptimeMillis2 - j2) - 1500);
                        if (i3 < 0) {
                            int i4 = -i3;
                            if (i4 < 1500) {
                                removeMessages(5);
                                sendEmptyMessageDelayed(5, i4);
                            }
                            this.f40657 = true;
                            break;
                        } else if (i3 < 300) {
                            this.f40657 = true;
                            c12392.invalidate();
                            removeMessages(5);
                            sendEmptyMessage(5);
                            break;
                        } else if (this.f40657) {
                            this.f40657 = false;
                            c12392.invalidate();
                            break;
                        }
                    }
                    break;
                case 6:
                    TextKeyListener textKeyListener = C12392.f37169;
                    c12392.invalidate();
                    InterfaceC18702 interfaceC18702 = c12392.f37245.f73253;
                    if (interfaceC18702 != null) {
                        interfaceC18702.mo21666();
                        break;
                    }
                    break;
                case 7:
                    c12392.f37258.mo8173();
                    c12392.m30289();
                    break;
                case 8:
                    C12392.m30218(c12392);
                    break;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32775() {
        if (this.f40656) {
            return;
        }
        removeMessages(4);
        this.f40656 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32776() {
        this.f40656 = false;
        C12392 c12392 = (C12392) this.f40655.get();
        if (c12392 == null || this.f40656) {
            return;
        }
        c12392.invalidate();
        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }
}
