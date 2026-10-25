package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: 51RR */
/* renamed from: l.֨ܶۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1194 implements InterfaceC5428 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4324 = 15000;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4325 = 30000;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f4326;

    public C1194(String str) {
        this.f4326 = str;
    }

    @Override // l.InterfaceC5428
    public final void a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f4324 = (int) j;
        this.f4325 = (int) j2;
    }

    @Override // l.InterfaceC5428
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4722 mo4042(String str, String str2) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        String str3;
        C9145.m23520("DefaultHttpServiceImpl", "get. ");
        if (!TextUtils.isEmpty(str2)) {
            int indexOf = str2.indexOf("?");
            if (indexOf == -1) {
                str = C16014.m37867(str, "?");
            } else if (indexOf != str.length() - 1) {
                str = str.concat(a.p);
            }
            str = C16014.m37867(str, str2);
        }
        int length = str2.length();
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                m4040(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        str3 = "请求失败 code:" + httpURLConnection.getResponseCode();
                    } else {
                        str3 = responseMessage;
                    }
                    C8250 c8250 = new C8250(httpURLConnection, "", httpURLConnection.getContentLength(), length, httpURLConnection.getResponseCode(), str3);
                    m4041(httpURLConnection);
                    return c8250;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                C8250 c82502 = new C8250(httpURLConnection, byteArrayOutputStream2.toString(), httpURLConnection.getContentLength(), length, httpURLConnection.getResponseCode(), "");
                                m4039(byteArrayOutputStream2);
                                m4039(inputStream);
                                m4041(httpURLConnection);
                                return c82502;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        m4039(byteArrayOutputStream);
                        m4039(inputStream);
                        m4041(httpURLConnection);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    @Override // l.InterfaceC5428
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4722 mo4044(String str, Map map) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        C9145.m23520("DefaultHttpServiceImpl", "post. ");
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append('&');
            }
            sb.append(C12789.encode((String) entry.getKey(), a.D));
            sb.append(com.alipay.sdk.m.p.a.h);
            sb.append(C12789.encode((String) entry.getValue(), a.D));
        }
        String sb2 = sb.toString();
        int length = sb2.length();
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                m4040(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), a.D);
                outputStreamWriter.write(sb2);
                outputStreamWriter.flush();
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                C8250 c8250 = new C8250(httpURLConnection, byteArrayOutputStream.toString(), contentLength, length, httpURLConnection.getResponseCode(), "");
                                m4039(byteArrayOutputStream);
                                m4039(inputStream);
                                m4041(httpURLConnection);
                                return c8250;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        m4039(byteArrayOutputStream2);
                        m4039(inputStream);
                        m4041(httpURLConnection);
                        throw th;
                    }
                } else {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "Unknown fail: " + httpURLConnection.getResponseCode();
                    }
                    C8250 c82502 = new C8250(httpURLConnection, "", 0, length, httpURLConnection.getResponseCode(), responseMessage);
                    m4041(httpURLConnection);
                    return c82502;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01af A[Catch: all -> 0x0191, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:57:0x0110, B:59:0x0113, B:25:0x01af), top: B:56:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d2 A[Catch: all -> 0x0209, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0209, blocks: (B:22:0x0195, B:51:0x01d2), top: B:21:0x0195 }] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.HashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // l.InterfaceC5428
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC4722 mo4043(java.lang.String r18, java.util.HashMap r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1194.mo4043(java.lang.String, java.util.HashMap, java.util.HashMap):l.ۙܶۘ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4040(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestProperty("User-Agent", this.f4326);
        httpURLConnection.setConnectTimeout(this.f4324);
        httpURLConnection.setReadTimeout(this.f4325);
        httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Charset", a.D);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4039(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m4041(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Exception unused) {
        }
    }
}
