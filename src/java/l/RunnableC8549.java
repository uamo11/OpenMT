package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: D98Y */
/* renamed from: l.ۡ֨ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC8549 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InputStream f26138;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ByteArrayOutputStream f26139;

    public RunnableC8549(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        this.f26138 = inputStream;
        this.f26139 = byteArrayOutputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = this.f26138.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    this.f26139.write(bArr, 0, read);
                }
            } catch (IOException unused) {
                return;
            }
        }
    }
}
