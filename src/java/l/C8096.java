package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: T5RH */
/* renamed from: l.۠ۢܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8096 extends Thread {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20091 f24967;

    public C8096(C20091 c20091) {
        this.f24967 = c20091;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] bArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((C11955) this.f24967.f65055.m37919()).m29186()).openConnection();
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/46.0.2486.0");
            httpURLConnection.setConnectTimeout(OpenAuthTask.Duplex);
            httpURLConnection.setReadTimeout(OpenAuthTask.Duplex);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available() * 2);
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr2);
                    if (read <= 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                }
                inputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
            } else {
                bArr = new byte[0];
            }
            httpURLConnection.disconnect();
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        C20091 c20091 = this.f24967;
        synchronized (c20091) {
            if (c20091.f65055 != null) {
                C11955 c11955 = new C11955();
                c11955.m29154(bArr);
                c20091.f65055.m37918(c11955);
                c20091.f65056 = false;
                c20091.f65055 = null;
            }
        }
    }
}
