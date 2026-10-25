package com.alipay.sdk.m.s;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.s.a$a, reason: collision with other inner class name */
    public interface InterfaceC0024a {
        void a(File file);

        void a(Throwable th);
    }

    public static void a(String str, String str2, InterfaceC0024a interfaceC0024a) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                throw new IOException("Server returned HTTP " + httpURLConnection.getResponseCode());
            }
            httpURLConnection.getContentLength();
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            interfaceC0024a.a(file);
                            fileOutputStream.close();
                            inputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            interfaceC0024a.a(th);
        }
    }
}
