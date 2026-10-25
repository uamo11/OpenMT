package com.alipay.sdk.m.r;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public final String a;
    public final String b;
    public final String c;

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.r.a$a, reason: collision with other inner class name */
    public class C0022a {
        public static String a = "0";
        public static String b = "1";
        public static String c = "2";
    }

    public a(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String toString() {
        return "updateStrategy: " + this.c + " sha256:" + this.a + " sourceUrl:" + this.b;
    }
}
