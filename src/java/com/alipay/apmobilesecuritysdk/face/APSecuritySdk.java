package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.sdk.m.f0.f;
import java.util.HashMap;
import java.util.Map;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class APSecuritySdk implements f {
    public static APSecuritySdk a;
    public static APSecBgCheckerInterface bgChecker;
    public static IDeviceInfo c;
    public static Object d = new Object();
    public Context b;

    /* compiled from: N673 */
    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    /* compiled from: N673 */
    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    public APSecuritySdk(Context context) {
        this.b = context;
    }

    public static IDeviceInfo getDeviceInfo() {
        return c;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (a == null) {
            synchronized (d) {
                if (a == null) {
                    a = new APSecuritySdk(context);
                }
            }
        }
        return a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        bgChecker = aPSecBgCheckerInterface;
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        c = iDeviceInfo;
    }

    @Override // com.alipay.sdk.m.f0.f
    public String getAndroidId() {
        IDeviceInfo iDeviceInfo = c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getAndroidId();
        }
        return null;
    }

    public String getApdidToken() {
        String a2 = a.a(this.b, "");
        if (com.alipay.sdk.m.d0.a.a(a2)) {
            initToken(0, new HashMap(), null);
        }
        return a2;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202507280853";
    }

    @Override // com.alipay.sdk.m.f0.f
    public String getSubscriberId() {
        IDeviceInfo iDeviceInfo = c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getSubscriberId();
        }
        return null;
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = a.a(this.b, "");
            tokenResult.clientKey = h.f(this.b);
            tokenResult.apdid = a.b(this.b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.b);
            if (com.alipay.sdk.m.d0.a.a(tokenResult.apdid) || com.alipay.sdk.m.d0.a.a(tokenResult.apdidToken) || com.alipay.sdk.m.d0.a.a(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i, Map map, final InitResultListener initResultListener) {
        com.alipay.apmobilesecuritysdk.b.a.a().a(i);
        String b = h.b(this.b);
        String c2 = com.alipay.apmobilesecuritysdk.b.a.a().c();
        if (com.alipay.sdk.m.d0.a.b(b) && !com.alipay.sdk.m.d0.a.a(b, c2)) {
            com.alipay.apmobilesecuritysdk.e.a.b(this.b);
            d.a(this.b);
            g.a(this.b);
            i.h();
        }
        if (!com.alipay.sdk.m.d0.a.a(b, c2)) {
            h.c(this.b, c2);
        }
        String a2 = com.alipay.sdk.m.d0.a.a(map, "utdid", "");
        String a3 = com.alipay.sdk.m.d0.a.a(map, "tid", "");
        String a4 = com.alipay.sdk.m.d0.a.a(map, "userId", "");
        if (com.alipay.sdk.m.d0.a.a(a2)) {
            a2 = UtdidWrapper.getUtdid(this.b);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("utdid", a2);
        hashMap.put("tid", a3);
        hashMap.put("userId", a4);
        hashMap.put("appName", "");
        hashMap.put("appKeyClient", "");
        hashMap.put("appchannel", "");
        hashMap.put("rpcVersion", "8");
        b.a().a(new Runnable(this) { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            public final /* synthetic */ APSecuritySdk c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                new a(this.c.b).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(this.c.getTokenResult());
                }
            }
        });
    }

    @Override // com.alipay.sdk.m.f0.f
    public boolean isBackgroundRunning() {
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }
}
