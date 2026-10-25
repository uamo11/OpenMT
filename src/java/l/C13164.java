package l;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.alipay.sdk.m.u0.c;

/* compiled from: OBMG */
/* renamed from: l.۬ܳ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13164 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile C13164 f39363;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static Handler f39364;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String f39365;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile C23714 f39366;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Object f39367 = new Object();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Context f39368;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C12459 f39369;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f39370;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String f39371;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static HandlerThread f39372;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13164 m31898(Context context) {
        if (f39363 == null) {
            synchronized (C13164.class) {
                f39368 = context.getApplicationContext();
                f39363 = new C13164();
            }
        }
        if (f39366 == null) {
            synchronized (C13164.class) {
                f39368 = context.getApplicationContext();
                HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
                f39372 = handlerThread;
                handlerThread.start();
                f39364 = new HandlerC3287(f39372.getLooper());
                f39366 = new C23714(f39368);
                m31903();
            }
        }
        return f39363;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31901() {
        return f39370;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m31902() {
        if (!f39370) {
            return null;
        }
        String str = f39365;
        if (str != null) {
            return str;
        }
        m31899(0);
        if (f39369 == null) {
            Context context = f39368;
            f39369 = new C12459(f39363, 0);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f39369);
        }
        return f39365;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31899(int i) {
        Object obj = f39367;
        synchronized (obj) {
            Message obtainMessage = f39364.obtainMessage();
            obtainMessage.what = 11;
            Bundle bundle = new Bundle();
            bundle.putInt("type", i);
            if (i == 1 || i == 2) {
                bundle.putString(c.d, null);
            }
            obtainMessage.setData(bundle);
            f39364.sendMessage(obtainMessage);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                obj.wait(2000L);
            } catch (InterruptedException unused) {
            }
            if (SystemClock.uptimeMillis() - uptimeMillis < 2000) {
                if (i == 0) {
                    f39365 = f39371;
                    f39371 = null;
                } else if (i == 1) {
                    if (f39371 != null) {
                        f39371 = null;
                    }
                } else {
                    if (i != 2) {
                        if (i != 4) {
                        }
                    } else if (f39371 != null) {
                        f39371 = null;
                    }
                    f39371 = null;
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m31903() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, c.c, "unknown");
        } catch (Throwable unused) {
            str = "0";
        }
        f39370 = "1".equals(str);
    }
}
