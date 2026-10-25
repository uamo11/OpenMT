package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import java.util.HashMap;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: C7AH */
/* renamed from: l.ۨۤ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11650 extends AbstractC4708 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C16464 f34741;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C10239 f34742;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f34743;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13765 f34744;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6005 f34745;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f34746;

    public C11650(int i, C10239 c10239, JSONObject jSONObject, C12231 c12231, C16464 c16464, C5267 c5267) {
        super(i);
        JSONValue jSONValue;
        this.f34743 = "/mcp";
        C11003.requireNonNull(c10239, "protocolVersions");
        this.f34742 = c10239;
        String str = "MCP";
        if (jSONObject != null && (jSONValue = jSONObject.get("name")) != null && jSONValue.isString()) {
            String trim = jSONValue.asString().trim();
            if (!trim.isEmpty()) {
                str = trim;
            }
        }
        this.f34746 = str;
        this.f34741 = c16464;
        C11003.requireNonNull(c5267, "requestAuthenticator");
        this.f34745 = c5267;
        this.f34744 = new C13765(c10239, jSONObject, c12231);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0125, code lost:
    
        if ((("127.0.0.1".equals(r3) || "localhost".equalsIgnoreCase(r3)) ? true : l.C17375.m40717().contains(r3)) == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    @Override // l.AbstractC4708
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C8236 mo13796(l.C15996 r18) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11650.mo13796(l.ܺܳܳ):l.۠ܳܳ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m28540(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("jsonrpc");
        JSONValue jSONValue2 = jSONObject.get("id");
        JSONValue jSONValue3 = jSONObject.get(o.c);
        JSONValue jSONValue4 = jSONObject.get(d.O);
        boolean z = jSONValue2 != null && (jSONValue2.isString() || jSONValue2.isNumber() || jSONValue2.isNull());
        boolean z2 = (jSONValue3 == null) != (jSONValue4 == null);
        if (jSONValue != null && jSONValue.isString() && UMCrashManager.CM_VERSION.equals(jSONValue.asString()) && z && z2) {
            if (jSONValue4 == null) {
                return true;
            }
            if (jSONValue4.isObject()) {
                JSONValue jSONValue5 = jSONValue4.asObject().get("code");
                JSONValue jSONValue6 = jSONValue4.asObject().get("message");
                if (jSONValue5 != null && jSONValue5.isNumber() && jSONValue6 != null && jSONValue6.isString()) {
                    try {
                        jSONValue5.asLong();
                        return true;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m28539(C15996 c15996) {
        String str = (String) ((HashMap) c15996.m37811()).get("content-length");
        if (str != null && Long.parseLong(str) > X931RNG.BLOCK128_RESEED_MAX) {
            throw new C15290(EnumC1180.PAYLOAD_TOO_LARGE, "Request body too large");
        }
        if (c15996.m37808()) {
            String m37809 = c15996.m37809();
            m28541(m37809);
            return m37809 == null ? "" : m37809;
        }
        HashMap hashMap = new HashMap();
        c15996.m37802(hashMap);
        String str2 = (String) hashMap.get("postData");
        String str3 = str2 != null ? str2 : "";
        m28541(str3);
        c15996.m37801(str3);
        return str3;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m28541(String str) {
        int i;
        if (str == null) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                i3++;
            } else if (charAt < 2048) {
                i3 += 2;
            } else if (Character.isHighSurrogate(charAt) && (i = i2 + 1) < str.length() && Character.isLowSurrogate(str.charAt(i))) {
                i3 += 4;
                i2 = i;
            } else {
                i3 += 3;
            }
            if (i3 > 8388608) {
                throw new C15290(EnumC1180.PAYLOAD_TOO_LARGE, "Request body too large");
            }
            i2++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28537(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get(e.s);
        if (jSONValue == null || !jSONValue.isString()) {
            return null;
        }
        return jSONValue.asString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28538(C15996 c15996, C8236 c8236) {
        boolean containsKey;
        String str = (String) ((HashMap) c15996.m37811()).get("content-length");
        if (str != null) {
            containsKey = true;
            try {
                if (Long.parseLong(str) <= 0) {
                    containsKey = false;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            containsKey = ((HashMap) c15996.m37811()).containsKey("transfer-encoding");
        }
        if (!containsKey || c15996.m37808()) {
            return;
        }
        c8236.m21803();
    }
}
