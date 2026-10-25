package l;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: 93Z4 */
/* renamed from: l.᩶ۚ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19956 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f64623 = new Object();

    @Pure
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46031(String str) {
        synchronized (f64623) {
            m46032(str, null);
        }
    }

    @Pure
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m46035(String str) {
        synchronized (f64623) {
            m46032(str, null);
        }
    }

    @Pure
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m46037(String str) {
        synchronized (f64623) {
            m46032(str, null);
        }
    }

    @Pure
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m46036(String str, Throwable th) {
        synchronized (f64623) {
            m46032(str, th);
        }
    }

    @Pure
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m46033(String str) {
        synchronized (f64623) {
            m46032(str, null);
        }
    }

    @Pure
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m46034(String str, Throwable th) {
        synchronized (f64623) {
            m46032(str, th);
        }
    }

    @Pure
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46032(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (f64623) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", ASN1Dump.TAB);
                        break;
                    } else {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        }
                        th2 = th2.getCause();
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return;
        }
        replace.replace("\n", "\n  ");
    }
}
