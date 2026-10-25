package l;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.alipay.sdk.m.u0.c;
import com.alipay.sdk.m.w.a;
import com.umeng.analytics.pro.am;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: 51RR */
/* renamed from: l.᩺᩸ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23255 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Map f74694 = C20195.synchronizedMap(new HashMap());

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String f74695 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Context f74696;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f74697;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public JSONObject f74698;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f74700 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74699 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23255 m51569(Context context, String str) {
        C23255 c23255;
        Map map = f74694;
        synchronized (map) {
            C9145.m23520("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                f74695 = str;
            }
            if (str == null && (str = f74695) == null) {
                str = "0";
            }
            c23255 = (C23255) map.get(str);
            if (c23255 == null) {
                c23255 = new C23255(context, str);
                map.put(str, c23255);
            }
            C9145.m23520("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return c23255;
    }

    public C23255(Context context, String str) {
        String concat;
        InputStream open;
        this.f74696 = null;
        this.f74697 = null;
        this.f74698 = null;
        Context applicationContext = context.getApplicationContext();
        this.f74696 = applicationContext;
        this.f74697 = str;
        String str2 = "";
        try {
            if (str != null) {
                try {
                    concat = "com.tencent.open.config.json.".concat(str);
                } catch (FileNotFoundException unused) {
                    open = applicationContext.getAssets().open("com.tencent.open.config.json");
                }
            } else {
                concat = "com.tencent.open.config.json";
            }
            open = applicationContext.openFileInput(concat);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charset.forName(a.D)));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        stringBuffer.append(readLine);
                    }
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    try {
                        open.close();
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            }
            str2 = stringBuffer.toString();
            open.close();
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        try {
            this.f74698 = new JSONObject(str2);
        } catch (JSONException unused5) {
            this.f74698 = new JSONObject();
        }
        m51570();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51570() {
        C10556 c10556;
        if (this.f74699 != 0) {
            m51574("update thread is running, return");
            return;
        }
        this.f74699 = 1;
        HashMap hashMap = new HashMap();
        hashMap.put(c.d, this.f74697);
        hashMap.put("status_os", Build.VERSION.RELEASE);
        c10556 = C12672.f38187;
        hashMap.put("status_machine", c10556.m26539());
        hashMap.put("status_version", Build.VERSION.SDK);
        hashMap.put("sdkv", "3.5.18.lite");
        hashMap.put("sdkp", am.av);
        try {
            C16926.f51987.execute(new RunnableC11967(this, hashMap));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51572(C23255 c23255, JSONObject jSONObject) {
        String concat;
        c23255.m51574("cgi back, do update");
        c23255.f74698 = jSONObject;
        String jSONObject2 = jSONObject.toString();
        String str = c23255.f74697;
        if (str != null) {
            try {
                concat = "com.tencent.open.config.json.".concat(str);
            } catch (IOException unused) {
            }
        } else {
            concat = "com.tencent.open.config.json";
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c23255.f74696.openFileOutput(concat, 0), Charset.forName(a.D));
        outputStreamWriter.write(jSONObject2);
        outputStreamWriter.flush();
        outputStreamWriter.close();
        c23255.f74700 = SystemClock.elapsedRealtime();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51573() {
        int optInt = this.f74698.optInt("Common_frequency");
        if (optInt == 0) {
            optInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f74700 >= optInt * 3600000) {
            m51570();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51575(String str) {
        m51574("get ".concat(str));
        m51573();
        return this.f74698.optInt(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51576(String str) {
        m51574("get ".concat(str));
        m51573();
        Object opt = this.f74698.opt(str);
        if (opt != null) {
            if (opt instanceof Integer) {
                return !opt.equals(0);
            }
            if (opt instanceof Boolean) {
                return ((Boolean) opt).booleanValue();
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51574(String str) {
        StringBuilder m19190 = C7166.m19190(str, "; appid: ");
        m19190.append(this.f74697);
        C9145.m23520("openSDK_LOG.OpenConfig", m19190.toString());
    }
}
