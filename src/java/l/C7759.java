package l;

import android.os.Handler;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.concurrent.CountDownLatch;

/* compiled from: M1TZ */
/* renamed from: l.۟᩹ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7759 extends Thread {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17574 f23992;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileDescriptor f23993;

    public C7759(C17574 c17574, FileDescriptor fileDescriptor) {
        this.f23992 = c17574;
        this.f23993 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2;
        C11783 c11783;
        Handler handler;
        C17574 c17574 = this.f23992;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f23993);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    c11783 = c17574.f53719;
                    if (!c11783.m28840(read, bArr)) {
                        break;
                    }
                    handler = c17574.f53708;
                    handler.sendEmptyMessage(1);
                }
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            countDownLatch = c17574.f53718;
            countDownLatch.countDown();
            throw th3;
        }
        countDownLatch2 = c17574.f53718;
        countDownLatch2.countDown();
    }
}
