package l;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: 592R */
/* renamed from: l.ᩳܰܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18095 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f56345;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Matcher f56346;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f56347;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f56348;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42215(C18095 c18095) {
        this.f56348 = c18095.f56348;
        this.f56345 = c18095.f56345;
        this.f56347 = c18095.f56347;
        this.f56346 = null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42219() {
        if (this.f56345 || !this.f56347) {
            return;
        }
        this.f56346 = Pattern.compile(this.f56348).matcher("");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42218(String str) {
        if (this.f56345) {
            return true;
        }
        if (this.f56347) {
            return this.f56346.reset(str).matches();
        }
        return str.equals(this.f56348);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42217() {
        return this.f56345 || !TextUtils.isEmpty(this.f56348);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m42216(org.json.JSONObject r4, char r5) {
        /*
            r3 = this;
            int r0 = r5 + 1
            char r0 = (char) r0
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r1 = r0 + 1
            char r1 = (char) r1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r2 = r4.has(r5)
            if (r2 == 0) goto L23
            java.lang.Object r5 = r4.get(r5)
            boolean r2 = r5 instanceof java.lang.String
            if (r2 == 0) goto L23
            java.lang.String r5 = (java.lang.String) r5
            goto L24
        L23:
            r5 = 0
        L24:
            r3.f56348 = r5
            int r5 = r4.getInt(r0)
            r0 = 0
            if (r5 == 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            r3.f56347 = r5
            int r4 = r4.getInt(r1)
            if (r4 == 0) goto L39
            r0 = 1
        L39:
            r3.f56345 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18095.m42216(org.json.JSONObject, char):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42220(JSONObject jSONObject, char c) {
        char c2 = (char) (c + 1);
        String valueOf = String.valueOf(c);
        char c3 = (char) (c2 + 1);
        String valueOf2 = String.valueOf(c2);
        String valueOf3 = String.valueOf(c3);
        String str = this.f56348;
        if (str == null) {
            str = "";
        }
        jSONObject.put(valueOf, str);
        jSONObject.put(valueOf2, this.f56347 ? 1 : 0);
        jSONObject.put(valueOf3, this.f56345 ? 1 : 0);
    }

    public final String toString() {
        return this.f56345 ? "*" : this.f56347 ? C9045.m23341(new StringBuilder("/"), this.f56348, "/") : this.f56348;
    }
}
