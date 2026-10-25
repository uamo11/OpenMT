package com.tencent.tauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import java.util.HashMap;
import l.C16220;
import l.C18338;
import l.C5638;
import l.C7733;
import l.C8956;
import l.C9145;
import l.InterfaceC0698;
import l.InterfaceC4227;

/* compiled from: 51RR */
/* loaded from: classes.dex */
public class AuthActivity extends Activity {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f908;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f909 = new HashMap();

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9145.m23518("openSDK_LOG.AuthActivity", "->onCreate");
        C16220 c16220 = new C16220(this);
        HashMap hashMap = this.f909;
        hashMap.put("action_common_channel", c16220);
        hashMap.put("action_auth", new C5638());
        m927();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C9145.m23518("openSDK_LOG.AuthActivity", "->onNewIntent");
        m927();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m927() {
        Uri uri;
        Intent intent = getIntent();
        if (intent == null) {
            C9145.m23519("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
            finish();
            return;
        }
        try {
            uri = intent.getData();
        } catch (Exception e) {
            C9145.m23514("openSDK_LOG.AuthActivity", "onCreate exception: ", e);
            uri = null;
        }
        C9145.m23520("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + uri);
        try {
            m928(intent, uri);
        } catch (Exception e2) {
            C9145.m23514("openSDK_LOG.AuthActivity", "onCreate exception: ", e2);
            finish();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m928(Intent intent, Uri uri) {
        C9145.m23518("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
        if (uri != null && uri.toString() != null) {
            String str = "";
            if (!uri.toString().equals("")) {
                String uri2 = uri.toString();
                Bundle m42734 = C18338.m42734(uri2.substring(uri2.indexOf("#") + 1));
                if (m42734 == null) {
                    C9145.m23519("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
                    finish();
                    return;
                }
                String string = m42734.getString("action");
                C9145.m23518("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + string);
                if (string == null) {
                    finish();
                    return;
                }
                if (string.equals("shareToQQ") || string.equals("shareToQzone") || string.equals("sendToMyComputer") || string.equals("shareToTroopBar")) {
                    if (string.equals("shareToQzone") && C7733.m20714(this, "com.tencent.mobileqq") != null && C7733.m20709(C7733.m20714(this, "com.tencent.mobileqq"), "5.2.0") < 0) {
                        int i = f908 + 1;
                        f908 = i;
                        if (i == 2) {
                            f908 = 0;
                            finish();
                            return;
                        }
                    }
                    C9145.m23518("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
                    Intent intent2 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent2.putExtras(m42734);
                    intent2.setFlags(603979776);
                    startActivity(intent2);
                    finish();
                    return;
                }
                if (string.equals("addToQQFavorites")) {
                    Intent intent3 = getIntent();
                    intent3.putExtras(m42734);
                    intent3.putExtra("key_action", "action_share");
                    InterfaceC4227 m23093 = C8956.m23090().m23093(string);
                    if (m23093 != null) {
                        C8956.m23090().getClass();
                        C8956.m23091(intent3, m23093);
                    }
                    finish();
                    return;
                }
                if (string.equals("sharePrize")) {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                    try {
                        str = C18338.m42748(m42734.getString("response")).getString("activityid");
                    } catch (Exception e) {
                        C9145.m23514("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", e);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        launchIntentForPackage.putExtra("sharePrize", true);
                        Bundle bundle = new Bundle();
                        bundle.putString("activityid", str);
                        launchIntentForPackage.putExtras(bundle);
                    }
                    startActivity(launchIntentForPackage);
                    finish();
                    return;
                }
                if (string.equals("sdkSetAvatar")) {
                    boolean booleanExtra = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent4 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent4.putExtra("key_request_code", 10108);
                    intent4.putExtra("stay_back_stack", booleanExtra);
                    intent4.putExtras(m42734);
                    intent4.setFlags(603979776);
                    startActivity(intent4);
                    finish();
                    return;
                }
                if ("sdkSetDynamicAvatar".equals(string)) {
                    boolean booleanExtra2 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent5 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent5.putExtra("key_request_code", 10110);
                    intent5.putExtra("stay_back_stack", booleanExtra2);
                    intent5.putExtras(m42734);
                    intent5.setFlags(603979776);
                    startActivity(intent5);
                    finish();
                    return;
                }
                if (string.equals("sdkSetEmotion")) {
                    boolean booleanExtra3 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent6 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent6.putExtra("key_request_code", 10109);
                    intent6.putExtra("stay_back_stack", booleanExtra3);
                    intent6.putExtras(m42734);
                    intent6.setFlags(603979776);
                    startActivity(intent6);
                    finish();
                    return;
                }
                if (string.equals("bindGroup")) {
                    C9145.m23518("openSDK_LOG.AuthActivity", "-->handleActionUri--bind group callback.");
                    boolean booleanExtra4 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent7 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent7.putExtra("key_request_code", 10112);
                    intent7.putExtra("stay_back_stack", booleanExtra4);
                    intent7.putExtras(m42734);
                    intent7.setFlags(603979776);
                    startActivity(intent7);
                    finish();
                    return;
                }
                if (string.equals("joinGroup")) {
                    C9145.m23518("openSDK_LOG.AuthActivity", "-->handleActionUri--join group callback. ");
                    boolean booleanExtra5 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent8 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent8.putExtra("key_request_code", 10111);
                    intent8.putExtra("stay_back_stack", booleanExtra5);
                    intent8.putExtras(m42734);
                    intent8.setFlags(603979776);
                    startActivity(intent8);
                    finish();
                    return;
                }
                if ("guildOpen".equals(string)) {
                    Intent intent9 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent9.putExtras(m42734);
                    intent9.putExtra("key_request_code", 10113);
                    intent9.setFlags(603979776);
                    startActivity(intent9);
                    finish();
                    return;
                }
                InterfaceC0698 interfaceC0698 = (InterfaceC0698) this.f909.get(string);
                C9145.m23520("openSDK_LOG.AuthActivity", "actionHandler: " + interfaceC0698);
                if (interfaceC0698 != null) {
                    interfaceC0698.mo2785(intent, m42734);
                }
                finish();
                return;
            }
        }
        C9145.m23519("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        try {
            super.finish();
        } catch (Exception e) {
            C9145.m23514("openSDK_LOG.AuthActivity", "activity finish exception: ", e);
        }
    }
}
