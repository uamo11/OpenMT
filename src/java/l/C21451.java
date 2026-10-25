package l;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONObject;

/* compiled from: 51RR */
/* renamed from: l.᩸۠ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21451 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences f69064;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f69065;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f69066;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f69067 = -1;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22550 f69068;

    public C21451() {
        try {
            new C15099(this).start();
        } catch (Exception unused) {
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m48597() {
        return this.f69065 != null && System.currentTimeMillis() < this.f69067;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m48592() {
        return this.f69065;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48594(String str, String str2) {
        this.f69065 = str;
        this.f69067 = 0L;
        if (str2 != null) {
            this.f69067 = (Long.parseLong(str2) * 1000) + System.currentTimeMillis();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m48596() {
        return this.f69066;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48593(String str) {
        this.f69066 = str;
        C11778.m28815().m28819(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48595(JSONObject jSONObject) {
        try {
            m48589("saveSession");
            return m48588(jSONObject, this.f69068);
        } catch (Exception e) {
            C9145.m23518("openSDK_LOG.QQToken", "login saveSession" + e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public synchronized void m48589(String str) {
        if (this.f69068 == null) {
            C9145.m23518("openSDK_LOG.QQToken", "initAESUtils ".concat(str));
            this.f69068 = new C22550(C22927.m51019());
            C9145.m23518("openSDK_LOG.QQToken", "initAESUtils " + str + " end");
        }
    }

    @TargetApi(11)
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static synchronized SharedPreferences m48591() {
        SharedPreferences sharedPreferences;
        synchronized (C21451.class) {
            if (f69064 == null) {
                f69064 = C22927.m51019().getSharedPreferences("token_info_file", 0);
            }
            sharedPreferences = f69064;
        }
        return sharedPreferences;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m48588(JSONObject jSONObject, C22550 c22550) {
        synchronized (C21451.class) {
            if (C22927.m51019() == null) {
                C9145.m23518("openSDK_LOG.QQToken", "saveJsonPreference context null");
                return false;
            }
            try {
                String string = jSONObject.getString("expires_in");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("expires_time", (Long.parseLong(string) * 1000) + System.currentTimeMillis());
                    String str = Base64.encodeToString(C18338.m42747("101492915"), 2) + "_aes_google";
                    String m50552 = c22550.m50552(jSONObject.toString());
                    if (str.length() > 6 && m50552 != null) {
                        m48591().edit().putString(str, m50552).commit();
                        C9145.m23518("openSDK_LOG.QQToken", "saveJsonPreference sucess");
                        return true;
                    }
                    C9145.m23518("openSDK_LOG.QQToken", "saveJsonPreference keyEncode or josnEncode null");
                    return false;
                }
                C9145.m23518("openSDK_LOG.QQToken", "expires is null");
                return false;
            } catch (Exception e) {
                C9145.m23516("openSDK_LOG.QQToken", "saveJsonPreference exception:" + e.toString());
                return false;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48590(String str) {
        SharedPreferences.Editor edit = m48591().edit();
        edit.remove(Base64.encodeToString(C18338.m42747(str), 2) + "_spkey");
        edit.remove(Base64.encodeToString(C18338.m42747(str), 2) + "_spkey");
        edit.remove(Base64.encodeToString(C18338.m42747(str), 2) + "_aes_google");
        edit.apply();
        C9145.m23518("openSDK_LOG.QQToken", "removeSession sucess");
    }
}
