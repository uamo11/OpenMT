package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import l.C20094;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends AsyncTask {
    public OAuthListener k;
    public String n;
    public int t;
    public String url;

    public final class a {
        public OAuthErrCode m;
        public String u;
        public int v;

        public static a b(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String message;
            StringBuilder sb;
            OAuthErrCode oAuthErrCode2;
            a aVar = new a();
            Log.d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
            if (bArr != null && bArr.length != 0) {
                try {
                } catch (Exception e) {
                    message = e.getMessage();
                    sb = new StringBuilder("parse fail, build String fail, ex = ");
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                    int i = jSONObject.getInt("wx_errcode");
                    aVar.v = i;
                    Log.d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i)));
                    int i2 = aVar.v;
                    if (i2 != 408) {
                        if (i2 != 500) {
                            switch (i2) {
                                case 402:
                                    oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Timeout;
                                    aVar.m = oAuthErrCode2;
                                    break;
                                case 403:
                                    oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Cancel;
                                    aVar.m = oAuthErrCode2;
                                    break;
                                case 405:
                                    aVar.m = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.u = jSONObject.getString("wx_code");
                                    break;
                            }
                            return aVar;
                        }
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.m = oAuthErrCode2;
                        return aVar;
                    }
                    oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_OK;
                    aVar.m = oAuthErrCode2;
                    return aVar;
                } catch (Exception e2) {
                    message = e2.getMessage();
                    sb = new StringBuilder("parse json fail, ex = ");
                    sb.append(message);
                    Log.e("MicroMsg.SDK.NoopingResult", sb.toString());
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.m = oAuthErrCode;
                    return aVar;
                }
            }
            Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            aVar.m = oAuthErrCode;
            return aVar;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str2 = this.n;
        if (str2 == null || str2.length() == 0) {
            Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
        } else {
            Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
            while (!isCancelled()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.url);
                if (this.t == 0) {
                    str = "";
                } else {
                    str = "&last=" + this.t;
                }
                sb.append(str);
                String sb2 = sb.toString();
                long currentTimeMillis = System.currentTimeMillis();
                byte[] a2 = e.a(sb2);
                long currentTimeMillis2 = System.currentTimeMillis();
                a b = a.b(a2);
                Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", sb2, b.m.toString(), Integer.valueOf(b.v), Long.valueOf(currentTimeMillis2 - currentTimeMillis)));
                OAuthErrCode oAuthErrCode2 = b.m;
                if (oAuthErrCode2 != OAuthErrCode.WechatAuth_Err_OK) {
                    Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode2.toString(), Integer.valueOf(b.v)));
                    return b;
                }
                int i = b.v;
                this.t = i;
                if (i == g.UUID_SCANED.getCode()) {
                    this.k.onQrcodeScanned();
                } else if (b.v != g.UUID_KEEP_CONNECT.getCode() && b.v == g.UUID_CONFIRM.getCode()) {
                    String str3 = b.u;
                    if (str3 != null && str3.length() != 0) {
                        return b;
                    }
                    Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                    b.m = OAuthErrCode.WechatAuth_Err_NormalErr;
                    return b;
                }
            }
            Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        }
        aVar.m = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        a aVar = (a) obj;
        this.k.onAuthFinish(aVar.m, aVar.u);
    }

    public f(String str, OAuthListener oAuthListener) {
        this.n = str;
        this.k = oAuthListener;
        this.url = C20094.m46315("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=", str);
    }
}
