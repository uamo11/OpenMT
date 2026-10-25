package com.tencent.connect.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.m.y.o;
import l.C11073;
import l.C14599;
import l.C18317;
import l.C1900;
import l.C20361;
import l.C20434;
import l.C6839;
import l.C7544;
import l.C9145;
import l.HandlerC16716;
import l.RunnableC17422;
import org.json.JSONObject;

/* compiled from: 51RR */
/* loaded from: classes.dex */
public class AssistActivity extends Activity {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f887;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f890;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14599 f891;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f892 = "openSDK_LOG.AssistActivity_" + hashCode();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f888 = false;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f893 = false;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1900 f889 = new C1900();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Handler f894 = new HandlerC16716(this, Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:38:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.common.AssistActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m919(Intent intent, boolean z) {
        Bundle bundleExtra = intent.getBundleExtra(C6839.f21173);
        if (bundleExtra != null) {
            bundleExtra.putString(o.c, z ? "0" : "1");
            C18317.m42686().m42688(bundleExtra, this.f887, intent.getBooleanExtra(C6839.f21174, false));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        C9145.m23518(this.f892, "-->onStart");
        super.onStart();
        this.f889.m6251(1);
    }

    @Override // android.app.Activity
    public final void onResume() {
        C9145.m23518(this.f892, "-->onResume");
        super.onResume();
        C1900 c1900 = this.f889;
        c1900.m6251(2);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("is_login", false)) {
            return;
        }
        if (!intent.getBooleanExtra("is_qq_mobile_share", false) && this.f888 && !isFinishing()) {
            finish();
        }
        if (this.f893 && c1900.m6252()) {
            Handler handler = this.f894;
            handler.sendMessage(handler.obtainMessage(0));
        } else {
            this.f893 = true;
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        C9145.m23518(this.f892, "-->onPause");
        this.f894.removeMessages(0);
        super.onPause();
        this.f889.m6251(3);
    }

    @Override // android.app.Activity
    public final void onStop() {
        String str = this.f892;
        C9145.m23518(str, "-->onStop");
        super.onStop();
        this.f889.m6251(4);
        try {
            int intExtra = getIntent().getIntExtra("key_request_orientation", -1);
            C9145.m23518(str, "getRequestedOrientation= " + intExtra);
            if (intExtra != -1) {
                setRequestedOrientation(intExtra);
            }
        } catch (Throwable th) {
            C9145.m23514(str, "reset requestedOrientation catch exception", th);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C9145.m23518(this.f892, "-->onDestroy");
        super.onDestroy();
        this.f889.m6251(5);
        C14599 c14599 = this.f891;
        if (c14599 != null) {
            unregisterReceiver(c14599);
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str = "--onNewIntent: " + hashCode();
        String str2 = this.f892;
        C9145.m23518(str2, str);
        super.onNewIntent(intent);
        this.f889.m6251(6);
        if (intent != null) {
            intent.setFlags(intent.getFlags() & (-196));
        }
        int intExtra = intent.getIntExtra("key_request_code", -1);
        C9145.m23518(str2, "--onNewIntent callbackRequestCode= " + intExtra);
        if (intExtra == 10108) {
            intent.putExtra("key_action", "action_request_avatar");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10109) {
            intent.putExtra("key_action", "action_request_set_emotion");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10110) {
            intent.putExtra("key_action", "action_request_dynamic_avatar");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10111) {
            intent.putExtra("key_action", "joinGroup");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10112) {
            intent.putExtra("key_action", "bindGroup");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10113) {
            intent.putExtra("key_action", intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            C9145.m23518(str2, "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        if (intExtra == 10114) {
            intent.putExtra("key_action", intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            C9145.m23518(str2, "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        intent.putExtra("key_action", "action_share");
        setResult(-1, intent);
        if (isFinishing()) {
            return;
        }
        C9145.m23518(str2, "--onNewIntent--activity not finished, finish now");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C9145.m23518(this.f892, "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.f893);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder m46682 = C20361.m46682("--onActivityResult--requestCode: ", i, " | resultCode: ", "data = null ? ", i2);
        m46682.append(intent == null);
        String sb = m46682.toString();
        String str = this.f892;
        C9145.m23518(str, sb);
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            return;
        }
        if (C11073.m27470(this)) {
            C9145.m23516(str, "onActivityResult callPack: " + getCallingPackage());
            finish();
            return;
        }
        if (intent != null) {
            intent.putExtra("key_action", "action_login");
        }
        Bundle extras = intent == null ? null : intent.getExtras();
        if (extras == null) {
            C9145.m23519(str, "--setResultData--bundle is null, setResult ACTIVITY_CANCEL");
            setResult(0);
            if (i == 11101) {
                C7544 m20258 = C7544.m20258();
                String str2 = this.f887;
                m20258.getClass();
                C7544.m20259("", str2, "2");
            }
        } else {
            try {
                String string = extras.getString("key_response");
                C9145.m23513(str, "--setResultDataForLogin-- ");
                Intent intent2 = new Intent();
                intent2.putExtras(extras);
                if (TextUtils.isEmpty(string)) {
                    C9145.m23519(str, "--setResultData--response is empty, setResult ACTIVITY_OK");
                    setResult(-1, intent2);
                } else {
                    JSONObject jSONObject = new JSONObject(string);
                    String optString = jSONObject.optString("openid");
                    String optString2 = jSONObject.optString("access_token");
                    String optString3 = jSONObject.optString("proxy_code");
                    long optLong = jSONObject.optLong("proxy_expires_in");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        C9145.m23518(str, "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                        setResult(-1, intent2);
                        C7544 m202582 = C7544.m20258();
                        String str3 = this.f887;
                        m202582.getClass();
                        C7544.m20259(optString, str3, "0");
                    } else if (TextUtils.isEmpty(optString3) || optLong == 0) {
                        C9145.m23519(str, "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                        setResult(0, intent2);
                        C7544 m202583 = C7544.m20258();
                        String str4 = this.f887;
                        m202583.getClass();
                        C7544.m20259("", str4, "1");
                    } else {
                        C9145.m23518(str, "--setResultData--proxy_code and proxy_expires_in are valid");
                        setResult(-1, intent2);
                    }
                }
            } catch (Exception e) {
                C9145.m23516(str, "--setResultData--parse response failed");
                C9145.m23514(str, "--setResultData--parse response exception", e);
            }
        }
        if (this.f890) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC17422(this), 200L);
        } else {
            C9145.m23518(str, "onActivityResult finish immediate");
            finish();
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        if (C20434.m46834(this)) {
            return;
        }
        super.setRequestedOrientation(i);
    }
}
