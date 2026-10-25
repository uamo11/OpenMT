package l;

import android.util.Base64;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: U6V6 */
/* renamed from: l.ܺۘۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15683 {

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f48328;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f48330;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f48331;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f48332;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f48333;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f48334;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f48335;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f48336;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f48337;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f48338;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f48339;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f48341;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f48342;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f48343;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f48340 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f48329 = -1;

    static {
        byte[] bArr = new byte[32];
        f48328 = bArr;
        new SecureRandom().nextBytes(bArr);
    }

    public C15683(String str, String str2, String str3, long j, long j2, String str4) {
        this.f48334 = str;
        this.f48337 = str2;
        this.f48339 = str3;
        this.f48341 = j;
        this.f48343 = j2;
        this.f48330 = str4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m36958() {
        byte[] bytes = JSON.object().add(am.aE, 1).add(MotionUtils.EASING_TYPE_PATH, this.f48334).add("query", this.f48337).add("encoding", this.f48339).add("size", this.f48341).add("modified", this.f48343).add("sample", this.f48330).add("anchorLine", this.f48338).add("anchorByte", this.f48335).add("line", this.f48336).add("pending", this.f48333).add("outputLine", this.f48342).add("outputColumn", this.f48332).add("delivered", this.f48340).add("afterThrough", this.f48329).add("searched", this.f48331).toString().getBytes(StandardCharsets.UTF_8);
        return Base64.encodeToString(bytes, 11) + "." + Base64.encodeToString(m36957(bytes), 11);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15683 m36956(String str, String str2) {
        try {
            if (str.length() > 32768) {
                throw new IllegalArgumentException();
            }
            int indexOf = str.indexOf(46);
            if (indexOf <= 0 || indexOf != str.lastIndexOf(46)) {
                throw new IllegalArgumentException();
            }
            byte[] decode = Base64.decode(str.substring(0, indexOf), 11);
            if (!MessageDigest.isEqual(m36957(decode), Base64.decode(str.substring(indexOf + 1), 11))) {
                throw new IllegalArgumentException();
            }
            JSONObject asObject = JSON.parse(new String(decode, StandardCharsets.UTF_8)).asObject();
            if (asObject.getInt(am.aE) != 1 || !str2.equals(asObject.getString(MotionUtils.EASING_TYPE_PATH))) {
                throw new IllegalArgumentException();
            }
            C15683 c15683 = new C15683(str2, asObject.getString("query"), asObject.getString("encoding"), asObject.getLong("size"), asObject.getLong("modified"), asObject.getString("sample"));
            c15683.f48338 = asObject.getLong("anchorLine");
            c15683.f48335 = asObject.getLong("anchorByte");
            c15683.f48336 = asObject.getLong("line");
            c15683.f48333 = asObject.getBoolean("pending");
            c15683.f48342 = asObject.getLong("outputLine");
            c15683.f48332 = asObject.getLong("outputColumn");
            c15683.f48340 = asObject.getLong("delivered");
            c15683.f48329 = asObject.getLong("afterThrough");
            c15683.f48331 = asObject.getLong("searched");
            return c15683;
        } catch (RuntimeException unused) {
            throw C3059.m9365("FILE_INVALID_CURSOR", "The text search cursor is invalid or does not match this request. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m36957(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(f48328, "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("HmacSHA256 unavailable", e);
        }
    }
}
