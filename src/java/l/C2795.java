package l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.text.format.Time;
import android.util.Log;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* compiled from: 51RR */
/* renamed from: l.ۖ᩸ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2795 extends AbstractC16199 implements Handler.Callback {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public Handler f8716;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public FileWriter f8717;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4206 f8718;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile C0677 f8719;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public HandlerThread f8720;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C0677 f8721;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile C0677 f8722;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public char[] f8723;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public File f8724;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f8725;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile C0677 f8726;

    public C2795(C4206 c4206) {
        String str = C19023.f59932;
        this.f8725 = false;
        this.f8718 = c4206;
        this.f8721 = new C0677();
        this.f8719 = new C0677();
        this.f8722 = this.f8721;
        this.f8726 = this.f8719;
        this.f8723 = new char[c4206.m12700()];
        HandlerThread handlerThread = new HandlerThread("OpenSDK.Client.File.Tracer", 10);
        this.f8720 = handlerThread;
        handlerThread.start();
        if (!handlerThread.isAlive() || handlerThread.getLooper() == null) {
            return;
        }
        this.f8716 = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8634() {
        Handler handler = this.f8716;
        if (handler.hasMessages(1024)) {
            handler.removeMessages(1024);
        }
        handler.sendEmptyMessage(1024);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8636() {
        m8632();
        this.f8720.quit();
    }

    @Override // l.AbstractC16199
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8635(int i, Thread thread, long j, String str, String str2, Throwable th) {
        m38154().getClass();
        long j2 = j % 1000;
        Time time = new Time();
        time.set(j);
        StringBuilder sb = new StringBuilder();
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? "-" : "A" : "E" : "W" : "I" : "D" : "V");
        sb.append('/');
        sb.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb.append('.');
        if (j2 < 10) {
            sb.append(ChipTextInputComboView.TextFormatter.DEFAULT_TEXT);
        } else if (j2 < 100) {
            sb.append('0');
        }
        sb.append(j2);
        sb.append(" [");
        sb.append(Process.myPid());
        sb.append("][");
        if (thread == null) {
            sb.append("N/A");
        } else {
            sb.append(thread.getName());
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, "][", str, "] ", str2);
        sb.append('\n');
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append('\n');
        }
        this.f8722.m2750(sb.toString());
        if (this.f8722.m2751() >= this.f8718.m12700()) {
            m8634();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1024 && Thread.currentThread() == this.f8720 && !this.f8725) {
            this.f8725 = true;
            synchronized (this) {
                if (this.f8722 == this.f8721) {
                    this.f8722 = this.f8719;
                    this.f8726 = this.f8721;
                } else {
                    this.f8722 = this.f8721;
                    this.f8726 = this.f8719;
                }
            }
            try {
                try {
                    this.f8726.m2749(m8633(), this.f8723);
                } catch (IOException e) {
                    C9145.m23514("FileTracer", "flushBuffer exception", e);
                }
                this.f8726.m2752();
                this.f8725 = false;
            } catch (Throwable th) {
                this.f8726.m2752();
                throw th;
            }
        }
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m8632() {
        try {
            FileWriter fileWriter = this.f8717;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f8717.close();
            }
        } catch (IOException e) {
            C9145.m23514("openSDK_LOG", "-->closeAppSpecificFileWriter() exception:", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.FileWriter m8633() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2795.m8633():java.io.FileWriter");
    }
}
