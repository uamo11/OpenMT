package com.alipay.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class q implements Callable {
    public static final HttpRequestRetryHandler e = new af();
    public l a;
    public Context b;
    public o c;
    public String d;
    public HttpUriRequest f;
    public CookieManager i;
    public AbstractHttpEntity j;
    public HttpHost k;

    /* renamed from: l, reason: collision with root package name */
    public URL f77905l;
    public String q;
    public HttpContext g = new BasicHttpContext();
    public CookieStore h = new BasicCookieStore();
    public int m = 0;
    public boolean n = false;
    public boolean o = false;
    public String p = null;

    public q(l lVar, o oVar) {
        this.a = lVar;
        this.b = lVar.a;
        this.c = oVar;
    }

    private HttpUriRequest f() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        AbstractHttpEntity b = b();
        if (b != null) {
            HttpPost httpPost = new HttpPost(a());
            httpPost.setEntity(b);
            this.f = httpPost;
        } else {
            this.f = new HttpGet(a());
        }
        return this.f;
    }

    private void g() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private ae h() {
        return this.c.f();
    }

    private HttpResponse i() {
        return j();
    }

    private HttpResponse j() {
        k();
        this.f.getURI().toString();
        l().getParams().setParameter("http.route.default-proxy", q());
        HttpHost n = n();
        if (o() == 80) {
            n = new HttpHost(p().getHost());
        }
        return l().execute(n, this.f, this.g);
    }

    private String k() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        String b = this.c.b("operationType");
        this.q = b;
        return b;
    }

    private b l() {
        return this.a.a();
    }

    private void m() {
        ArrayList c = c();
        if (c != null && !c.isEmpty()) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                f().addHeader((Header) it.next());
            }
        }
        b.a((HttpRequest) f());
        b.b(f());
        f().addHeader("cookie", r().getCookie(this.c.a()));
    }

    private HttpHost n() {
        HttpHost httpHost = this.k;
        if (httpHost != null) {
            return httpHost;
        }
        URL p = p();
        HttpHost httpHost2 = new HttpHost(p.getHost(), o(), p.getProtocol());
        this.k = httpHost2;
        return httpHost2;
    }

    private int o() {
        URL p = p();
        return p.getPort() == -1 ? p.getDefaultPort() : p.getPort();
    }

    private URL p() {
        URL url = this.f77905l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.c.a());
        this.f77905l = url2;
        return url2;
    }

    private HttpHost q() {
        HttpHost a = t.a(this.b);
        if (a != null && TextUtils.equals(a.getHostName(), "127.0.0.1") && a.getPort() == 8087) {
            return null;
        }
        return a;
    }

    private CookieManager r() {
        CookieManager cookieManager = this.i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.i = cookieManager2;
        return cookieManager2;
    }

    public long a(String[] strArr) {
        String str;
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i]) && (str = strArr[i + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    public HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    public v a(HttpResponse httpResponse, int i, String str) {
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.getStatusLine().getStatusCode();
            }
            return null;
        }
        Thread.currentThread().getId();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                a(entity, 0L, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.o = false;
                this.a.c(System.currentTimeMillis() - currentTimeMillis);
                this.a.a(byteArray.length);
                p pVar = new p(a(httpResponse), i, str, byteArray);
                a(pVar, httpResponse);
                try {
                    byteArrayOutputStream2.close();
                    return pVar;
                } catch (IOException e2) {
                    throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        throw new RuntimeException("ArrayOutputStream close error!", e3.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public v a(HttpResponse httpResponse, o oVar) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
        if (statusCode == 200 || a(statusCode, reasonPhrase)) {
            return a(httpResponse, statusCode, reasonPhrase);
        }
        throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
    }

    public URI a() {
        String a = this.c.a();
        String str = this.d;
        if (str != null) {
            a = str;
        }
        if (a != null) {
            return new URI(a);
        }
        throw new RuntimeException("url should not be null");
    }

    public HashMap a(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(com.alipay.sdk.m.y.l.b)) {
            String[] split = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    public void a(p pVar, HttpResponse httpResponse) {
        String str;
        String str2;
        long b = b(httpResponse);
        Header contentType = httpResponse.getEntity().getContentType();
        if (contentType != null) {
            HashMap a = a(contentType.getValue());
            str = (String) a.get("charset");
            str2 = (String) a.get("Content-Type");
        } else {
            str = null;
            str2 = null;
        }
        pVar.b(str2);
        pVar.a(str);
        pVar.a(System.currentTimeMillis());
        pVar.b(b);
    }

    public void a(HttpEntity httpEntity, long j, OutputStream outputStream) {
        if (outputStream == null) {
            httpEntity.consumeContent();
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream a = b.a(httpEntity);
        long contentLength = httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = a.read(bArr);
                    if (read == -1 || this.c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    j += read;
                    if (h() != null && contentLength > 0) {
                        h().a(this.c, j / contentLength);
                    }
                }
                outputStream.flush();
            } catch (Exception e2) {
                e2.getCause();
                throw new IOException("HttpWorker Request Error!" + e2.getLocalizedMessage());
            }
        } finally {
            r.a(a);
        }
    }

    public boolean a(int i, String str) {
        return i == 304;
    }

    public long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    public AbstractHttpEntity b() {
        AbstractHttpEntity abstractHttpEntity = this.j;
        if (abstractHttpEntity != null) {
            return abstractHttpEntity;
        }
        byte[] b = this.c.b();
        String b2 = this.c.b("gzip");
        if (b != null) {
            if (TextUtils.equals(b2, "true")) {
                this.j = b.a(b, (ContentResolver) null);
            } else {
                this.j = new ByteArrayEntity(b);
            }
            this.j.setContentType(this.c.c());
        }
        return this.j;
    }

    public ArrayList c() {
        return this.c.d();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public v call() {
        try {
            if (!t.c(this.b)) {
                throw new HttpException(1, "The network is not available");
            }
            if (h() != null) {
                h().b(this.c);
            }
            m();
            this.g.setAttribute("http.cookie-store", this.h);
            l().a(e);
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse i = i();
            this.a.b(System.currentTimeMillis() - currentTimeMillis);
            List<Cookie> cookies = this.h.getCookies();
            if (this.c.e()) {
                r().removeAllCookie();
            }
            if (!cookies.isEmpty()) {
                for (Cookie cookie : cookies) {
                    if (cookie.getDomain() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(cookie.getName());
                        sb.append("=");
                        sb.append(cookie.getValue());
                        sb.append("; domain=");
                        sb.append(cookie.getDomain());
                        sb.append(cookie.isSecure() ? "; Secure" : "");
                        r().setCookie(this.c.a(), sb.toString());
                        CookieSyncManager.getInstance().sync();
                    }
                }
            }
            v a = a(i, this.c);
            if (((a == null || a.b() == null) ? -1L : a.b().length) == -1 && (a instanceof p)) {
                try {
                    Long.parseLong(((p) a).a().getHead("Content-Length"));
                } catch (Exception unused) {
                }
            }
            if (this.c.a() != null && !TextUtils.isEmpty(k())) {
                k();
            }
            return a;
        } catch (HttpException e2) {
            g();
            if (h() != null) {
                h().a(this.c, e2.getCode(), e2.getMsg());
            }
            e2.toString();
            throw e2;
        } catch (NullPointerException e3) {
            g();
            int i2 = this.m;
            if (i2 < 1) {
                this.m = i2 + 1;
                return call();
            }
            e3.toString();
            throw new HttpException(0, e3 + "");
        } catch (SocketTimeoutException e4) {
            g();
            if (h() != null) {
                h().a(this.c, 4, e4 + "");
            }
            e4.toString();
            throw new HttpException(4, e4 + "");
        } catch (URISyntaxException e5) {
            throw new RuntimeException("Url parser error!", e5.getCause());
        } catch (UnknownHostException e6) {
            g();
            if (h() != null) {
                h().a(this.c, 9, e6 + "");
            }
            e6.toString();
            throw new HttpException(9, e6 + "");
        } catch (SSLHandshakeException e7) {
            g();
            if (h() != null) {
                h().a(this.c, 2, e7 + "");
            }
            e7.toString();
            throw new HttpException(2, e7 + "");
        } catch (SSLPeerUnverifiedException e8) {
            g();
            if (h() != null) {
                h().a(this.c, 2, e8 + "");
            }
            e8.toString();
            throw new HttpException(2, e8 + "");
        } catch (SSLException e9) {
            g();
            if (h() != null) {
                h().a(this.c, 6, e9 + "");
            }
            e9.toString();
            throw new HttpException(6, e9 + "");
        } catch (NoHttpResponseException e10) {
            g();
            if (h() != null) {
                h().a(this.c, 5, e10 + "");
            }
            e10.toString();
            throw new HttpException(5, e10 + "");
        } catch (ConnectionPoolTimeoutException e11) {
            g();
            if (h() != null) {
                h().a(this.c, 3, e11 + "");
            }
            e11.toString();
            throw new HttpException(3, e11 + "");
        } catch (ConnectTimeoutException e12) {
            g();
            if (h() != null) {
                h().a(this.c, 3, e12 + "");
            }
            e12.toString();
            throw new HttpException(3, e12 + "");
        } catch (HttpHostConnectException e13) {
            g();
            if (h() != null) {
                h().a(this.c, 8, e13 + "");
            }
            throw new HttpException(8, e13 + "");
        } catch (IOException e14) {
            g();
            if (h() != null) {
                h().a(this.c, 6, e14 + "");
            }
            e14.toString();
            throw new HttpException(6, e14 + "");
        } catch (Exception e15) {
            g();
            if (h() != null) {
                h().a(this.c, 0, e15 + "");
            }
            throw new HttpException(0, e15 + "");
        }
    }

    public o e() {
        return this.c;
    }
}
