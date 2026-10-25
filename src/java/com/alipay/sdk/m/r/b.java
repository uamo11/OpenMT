package com.alipay.sdk.m.r;

import android.text.TextUtils;
import com.alipay.sdk.m.r.a;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.y.e;
import com.alipay.sdk.m.y.f;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.q;
import com.alipay.sdk.m.y.r;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l.C16014;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public com.alipay.sdk.m.w.a b;
    public final String a = "LocalWebPayManager";
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = "0";
    public Map h = null;
    public com.alipay.sdk.m.r.a i = null;
    public volatile boolean j = false;

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.r.b$b, reason: collision with other inner class name */
    public class RunnableC0023b implements Runnable {
        public final /* synthetic */ com.alipay.sdk.m.r.a a;
        public final /* synthetic */ a.InterfaceC0024a b;

        public RunnableC0023b(com.alipay.sdk.m.r.a aVar, a.InterfaceC0024a interfaceC0024a) {
            this.a = aVar;
            this.b = interfaceC0024a;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = b.this.f;
            File file = new File(str);
            if (file.exists()) {
                e.b(str);
            }
            file.mkdir();
            com.alipay.sdk.m.s.a.a(this.a.b(), b.this.f + "/downloading.zip", this.b);
        }
    }

    /* compiled from: N673 */
    public final class c {
        public static final b a = new b();
    }

    public static b e() {
        return c.a;
    }

    public final boolean b() {
        File file = new File(this.c);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(this.d);
            if (!file2.exists()) {
                file2.mkdir();
            }
            File file3 = new File(this.d);
            File file4 = new File(this.e);
            if (file3.exists()) {
                return file4.exists();
            }
            return false;
        } catch (Throwable th) {
            g.a(th);
            return false;
        }
    }

    public boolean c() {
        if (this.i == null || this.j) {
            return false;
        }
        return TextUtils.equals(this.i.c(), a.C0022a.b) || TextUtils.equals(this.i.c(), a.C0022a.c);
    }

    public void d() {
        g.b(com.alipay.sdk.m.n.a.B, "LocalWebPayManager clearData");
        this.b = null;
        this.g = "0";
        this.i = null;
        this.h = null;
    }

    public String f() {
        g.d("LocalWebPayManager", "getLocalConfigVersion=" + this.g);
        return this.g;
    }

    public final void g() {
        JSONObject d = e.d(this.e);
        g.b(com.alipay.sdk.m.n.a.B, "readContentFromConfigJson jsonConfigJson=" + d);
        if (d != null) {
            try {
                String string = d.getString("version");
                JSONObject jSONObject = d.getJSONObject("homeHtml");
                JSONObject jSONObject2 = d.getJSONObject("fileList");
                this.g = string;
                JSONObject a2 = f.a(jSONObject, jSONObject2);
                Iterator<String> keys = a2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        this.h.put(next, a2.getString(next));
                    } catch (Throwable th) {
                        g.a(th);
                    }
                }
            } catch (Throwable th2) {
                g.c("LocalWebPayManager", "readContentFromConfigJson fileContent error");
                g.a(th2);
                com.alipay.sdk.m.m.a.a(this.b, com.alipay.sdk.m.m.b.f77909l, "LocalWebPayManager.readContentFromConfigJsonError", th2);
            }
        }
    }

    /* compiled from: N673 */
    public class a implements a.InterfaceC0024a {
        public final /* synthetic */ com.alipay.sdk.m.r.a a;

        public a(com.alipay.sdk.m.r.a aVar) {
            this.a = aVar;
        }

        @Override // com.alipay.sdk.m.s.a.InterfaceC0024a
        public void a(File file) {
            g.d("LocalWebPayManager", "checkAndUpdateLocalData downloadListener onSuccess");
            b.this.b(this.a);
            b.this.j = false;
        }

        @Override // com.alipay.sdk.m.s.a.InterfaceC0024a
        public void a(Throwable th) {
            g.a(th);
            b.this.j = false;
        }
    }

    public void a(com.alipay.sdk.m.w.a aVar) {
        if (this.b != null) {
            g.c(com.alipay.sdk.m.n.a.B, "LocalWebPayManager.init mBizContext not null");
            com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.f77909l, "LocalWebPayManager.init", "mBizContext not null");
            d();
        }
        this.b = aVar;
        String absolutePath = aVar.b().getFilesDir().getAbsolutePath();
        this.c = C16014.m37867(absolutePath, "/localWebPay");
        this.d = C16014.m37867(absolutePath, "/localWebPay/localWebFiles");
        this.e = C16014.m37867(absolutePath, "/localWebPay/localWebFiles/sdkConfig.json");
        this.f = C16014.m37867(absolutePath, "/localWebPay/localWebPayDownloadingFiles");
        this.h = new HashMap();
        boolean b = b();
        g.b(com.alipay.sdk.m.n.a.B, "LocalWebPayManager init checkConfigFile=" + b);
        if (b) {
            g();
        }
    }

    public final void b(com.alipay.sdk.m.r.a aVar) {
        if (aVar == null) {
            return;
        }
        g.e("LocalWebPayManager", "unzipAndCheckSHA256 dataSHA256:" + aVar.a());
        try {
            File[] listFiles = new File(this.f).listFiles();
            File file = null;
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].getName().endsWith(".zip")) {
                    file = listFiles[i];
                }
            }
            String a2 = q.a(file);
            g.e("LocalWebPayManager", "unzipAndCheckSHA256 fileSha256:" + a2);
            if (TextUtils.equals(a2, aVar.a())) {
                g.e("LocalWebPayManager", "unzipAndCheckSHA256 unzip");
                r.a(file.getAbsolutePath(), this.f);
                File file2 = new File(this.d);
                File file3 = new File(this.f);
                if (file2.exists()) {
                    e.b(this.d);
                }
                g.e("LocalWebPayManager", "unzipAndCheckSHA256 resultReNameTo:" + file3.renameTo(file2));
            }
        } catch (Throwable th) {
            g.a(th);
            com.alipay.sdk.m.m.a.a(this.b, com.alipay.sdk.m.m.b.f77909l, "LocalWebPayManager.unzipAndCheckSHA256Error", th);
        }
    }

    public void a(com.alipay.sdk.m.r.a aVar) {
        g.d("LocalWebPayManager", "h5LocalData :" + aVar);
        this.i = aVar;
    }

    public void a() {
        g.d("LocalWebPayManager", "checkAndUpdateLocalData isDownloading=" + this.j);
        com.alipay.sdk.m.r.a aVar = this.i;
        if (aVar != null && !this.j && ((TextUtils.equals(aVar.c(), a.C0022a.a) || TextUtils.equals(aVar.c(), a.C0022a.b)) && !TextUtils.isEmpty(aVar.b()))) {
            this.j = true;
            new Thread(new RunnableC0023b(aVar, new a(aVar))).start();
        } else {
            g.d("LocalWebPayManager", "checkAndUpdateLocalData return");
        }
    }

    public String b(String str) {
        String str2;
        if (c()) {
            String a2 = a(str);
            if (TextUtils.isEmpty((String) this.h.get(a2))) {
                g.e("LocalWebPayManager", "getLocalFilePath get null, url：" + str);
            } else {
                str2 = this.d + "/" + ((String) this.h.get(a2));
                g.b("LocalWebPayManager", "getLocalFilePath result:" + str2);
                return str2;
            }
        }
        str2 = "";
        g.b("LocalWebPayManager", "getLocalFilePath result:" + str2);
        return str2;
    }

    public final String a(String str) {
        int indexOf;
        return (TextUtils.isEmpty(str) || (indexOf = str.indexOf(63)) == -1) ? str : str.substring(0, indexOf);
    }
}
