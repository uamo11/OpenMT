package l;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: M1TZ */
/* renamed from: l.֫᩶ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2052 extends Thread {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17574 f6856;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileDescriptor f6857;

    public C2052(C17574 c17574, FileDescriptor fileDescriptor) {
        this.f6856 = c17574;
        this.f6857 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C11783 c11783;
        byte[] bArr = new byte[4096];
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f6857);
            while (true) {
                try {
                    c11783 = this.f6856.f53705;
                    int m28838 = c11783.m28838(bArr, true);
                    if (m28838 != -1) {
                        fileOutputStream.write(bArr, 0, m28838);
                    } else {
                        fileOutputStream.close();
                        return;
                    }
                } finally {
                }
            }
        } catch (IOException unused) {
        }
    }
}
