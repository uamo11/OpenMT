package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: UAXR */
/* renamed from: l.᩹۫᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22292 {
    public static volatile Choreographer choreographer;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Handler m50013(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    static {
        Object m43235;
        try {
            m43235 = new C15235(m50013(Looper.getMainLooper()));
        } catch (Throwable th) {
            m43235 = C18642.m43235(th);
        }
        if (m43235 instanceof C2414) {
            m43235 = null;
        }
    }
}
