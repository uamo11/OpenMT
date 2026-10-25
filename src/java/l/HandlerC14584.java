package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;

/* compiled from: 763M */
/* renamed from: l.ܳܳۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC14584 extends Handler implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f44650;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44651;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f44652;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f44653;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8941 f44654;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23757 f44655;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Thread f44656;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f44657;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC18113 f44658;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f44659;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14584(C8941 c8941, Looper looper, InterfaceC23757 interfaceC23757, InterfaceC18113 interfaceC18113, int i, long j) {
        super(looper);
        this.f44654 = c8941;
        this.f44655 = interfaceC23757;
        this.f44658 = interfaceC18113;
        this.f44651 = i;
        this.f44652 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34832(int i) {
        IOException iOException = this.f44657;
        if (iOException != null && this.f44650 > i) {
            throw iOException;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34833(long j) {
        HandlerC14584 handlerC14584;
        C8941 c8941 = this.f44654;
        handlerC14584 = c8941.f27183;
        C22632.m50634(handlerC14584 == null);
        c8941.f27183 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            m34831();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34834(boolean z) {
        this.f44653 = z;
        this.f44657 = null;
        if (hasMessages(1)) {
            this.f44659 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.f44659 = true;
                this.f44655.mo6511();
                Thread thread = this.f44656;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f44654.f27183 = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC18113 interfaceC18113 = this.f44658;
            interfaceC18113.getClass();
            interfaceC18113.mo12780(this.f44655, elapsedRealtime, elapsedRealtime - this.f44652, true);
            this.f44658 = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f44659;
                this.f44656 = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f44655.getClass().getSimpleName()));
                try {
                    this.f44655.mo6509();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f44656 = null;
                Thread.interrupted();
            }
            if (this.f44653) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f44653) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f44653) {
                return;
            }
            C19956.m46034("OutOfMemory error loading stream", e2);
            obtainMessage(3, new C9647(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f44653) {
                C19956.m46034("Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f44653) {
                return;
            }
            C19956.m46034("Unexpected exception loading stream", e4);
            obtainMessage(3, new C9647(e4)).sendToTarget();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        long min;
        if (this.f44653) {
            return;
        }
        int i4 = message.what;
        if (i4 == 1) {
            m34831();
            return;
        }
        if (i4 == 4) {
            throw ((Error) message.obj);
        }
        this.f44654.f27183 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.f44652;
        InterfaceC18113 interfaceC18113 = this.f44658;
        interfaceC18113.getClass();
        if (this.f44659) {
            interfaceC18113.mo12780(this.f44655, elapsedRealtime, j2, false);
            return;
        }
        int i5 = message.what;
        if (i5 == 2) {
            try {
                interfaceC18113.mo12778(this.f44655, elapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                C19956.m46034("Unexpected exception handling load completed", e);
                this.f44654.f27185 = new C9647(e);
                return;
            }
        }
        if (i5 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f44657 = iOException;
        int i6 = this.f44650 + 1;
        this.f44650 = i6;
        C17407 mo12777 = interfaceC18113.mo12777(this.f44655, elapsedRealtime, j2, iOException, i6);
        i = mo12777.f53258;
        if (i == 3) {
            this.f44654.f27185 = this.f44657;
            return;
        }
        i2 = mo12777.f53258;
        if (i2 != 2) {
            i3 = mo12777.f53258;
            if (i3 == 1) {
                this.f44650 = 1;
            }
            j = mo12777.f53257;
            if (j != -9223372036854775807L) {
                min = mo12777.f53257;
            } else {
                min = Math.min((this.f44650 - 1) * 1000, OpenAuthTask.Duplex);
            }
            m34833(min);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34831() {
        InterfaceExecutorC8235 interfaceExecutorC8235;
        HandlerC14584 handlerC14584;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f44652;
        InterfaceC18113 interfaceC18113 = this.f44658;
        interfaceC18113.getClass();
        interfaceC18113.mo12779(this.f44655, elapsedRealtime, j, this.f44650);
        this.f44657 = null;
        C8941 c8941 = this.f44654;
        interfaceExecutorC8235 = c8941.f27184;
        handlerC14584 = c8941.f27183;
        handlerC14584.getClass();
        interfaceExecutorC8235.execute(handlerC14584);
    }
}
