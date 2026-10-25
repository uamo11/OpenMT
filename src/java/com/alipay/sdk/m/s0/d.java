package com.alipay.sdk.m.s0;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.bo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import l.C15472;
import l.C9045;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class d {
    public static d j;
    public Context a;
    public e c;
    public String d;
    public String e;
    public com.alipay.sdk.m.r0.a f;
    public com.alipay.sdk.m.r0.a g;
    public static final Object i = new Object();
    public static final String k = C9045.m23341(new StringBuilder(".UTSystemConfig"), File.separator, "Global");
    public String b = null;
    public Pattern h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public d(Context context) {
        this.a = null;
        this.c = null;
        this.d = "xx_utdid_key";
        this.e = "xx_utdid_domain";
        this.f = null;
        this.g = null;
        this.a = context;
        this.g = new com.alipay.sdk.m.r0.a(context, k, "Alvin2", false, true);
        this.f = new com.alipay.sdk.m.r0.a(context, ".DataStorage", "ContextData", false, true);
        this.c = new e();
        this.d = String.format("K_%d", Integer.valueOf(com.alipay.sdk.m.q0.f.a(this.d)));
        this.e = String.format("D_%d", Integer.valueOf(com.alipay.sdk.m.q0.f.a(this.e)));
    }

    public final void a() {
        boolean z;
        com.alipay.sdk.m.r0.a aVar = this.g;
        if (aVar != null) {
            if (com.alipay.sdk.m.q0.f.b(aVar.a("UTDID2"))) {
                String a = this.g.a("UTDID");
                if (!com.alipay.sdk.m.q0.f.b(a)) {
                    b(a);
                }
            }
            boolean z2 = true;
            if (com.alipay.sdk.m.q0.f.b(this.g.a("DID"))) {
                z = false;
            } else {
                this.g.b("DID");
                z = true;
            }
            if (!com.alipay.sdk.m.q0.f.b(this.g.a("EI"))) {
                this.g.b("EI");
                z = true;
            }
            if (com.alipay.sdk.m.q0.f.b(this.g.a("SI"))) {
                z2 = z;
            } else {
                this.g.b("SI");
            }
            if (z2) {
                this.g.b();
            }
        }
    }

    public final void b(String str) {
        com.alipay.sdk.m.r0.a aVar;
        if (a(str)) {
            if (str.endsWith("\n")) {
                str = C15472.m36561(1, 0, str);
            }
            if (str.length() != 24 || (aVar = this.g) == null) {
                return;
            }
            aVar.a("UTDID2", str);
            this.g.b();
        }
    }

    public final void c(String str) {
        com.alipay.sdk.m.r0.a aVar;
        if (str == null || (aVar = this.f) == null || str.equals(aVar.a(this.d))) {
            return;
        }
        this.f.a(this.d, str);
        this.f.b();
    }

    public synchronized String d() {
        String f = f();
        this.b = f;
        if (!TextUtils.isEmpty(f)) {
            return this.b;
        }
        try {
            byte[] b = b();
            if (b != null) {
                String c = com.alipay.sdk.m.q0.b.c(b, 2);
                this.b = c;
                b(c);
                String a = this.c.a(b);
                if (a != null) {
                    c(a);
                }
                return this.b;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public synchronized String e() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        return d();
    }

    public synchronized String f() {
        String c = c();
        if (a(c)) {
            c(this.c.a(c));
            this.b = c;
            return c;
        }
        String a = this.f.a(this.d);
        if (!com.alipay.sdk.m.q0.f.b(a)) {
            String a2 = new f().a(a);
            if (!a(a2)) {
                a2 = this.c.b(a);
            }
            if (a(a2) && !com.alipay.sdk.m.q0.f.b(a2)) {
                this.b = a2;
                b(a2);
                return this.b;
            }
        }
        return null;
    }

    public final String c() {
        com.alipay.sdk.m.r0.a aVar = this.g;
        if (aVar == null) {
            return null;
        }
        String a = aVar.a("UTDID2");
        if (com.alipay.sdk.m.q0.f.b(a) || this.c.a(a) == null) {
            return null;
        }
        return a;
    }

    public final byte[] b() {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] a = com.alipay.sdk.m.q0.c.a(currentTimeMillis);
        byte[] a2 = com.alipay.sdk.m.q0.c.a(nextInt);
        byteArrayOutputStream.write(a, 0, 4);
        byteArrayOutputStream.write(a2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = com.alipay.sdk.m.q0.d.a(this.a);
        } catch (Exception unused) {
            str = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(com.alipay.sdk.m.q0.c.a(com.alipay.sdk.m.q0.f.a(str)), 0, 4);
        byteArrayOutputStream.write(com.alipay.sdk.m.q0.c.a(com.alipay.sdk.m.q0.f.a(a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    public static d a(Context context) {
        if (context != null && j == null) {
            synchronized (i) {
                if (j == null) {
                    d dVar = new d(context);
                    j = dVar;
                    dVar.a();
                }
            }
        }
        return j;
    }

    public final boolean a(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = C15472.m36561(1, 0, str);
            }
            if (24 == str.length() && !this.h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, GCMSIVBlockCipher.ADD, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, bo.h, -82, -64, KeyFactorySpi.Ed448_type, 116, -16, -103, 49, -30, 9, -39, PublicSuffixDatabase.EXCEPTION_MARKER, -80, PSSSigner.TRAILER_IMPLICIT, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(com.alipay.sdk.m.q0.e.a(bArr2), mac.getAlgorithm()));
        return com.alipay.sdk.m.q0.b.c(mac.doFinal(bArr), 2);
    }
}
