package l;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: K22G */
/* renamed from: l.۠᩹, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8455 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Class f25866;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Handler f25867 = new Handler(Looper.getMainLooper());

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Method f25868;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Field f25869;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Method f25870;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Method f25871;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Field f25872;

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            l.C8455.f25867 = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            l.C8455.f25866 = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            l.C8455.f25869 = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            l.C8455.f25872 = r0
            java.lang.Class r0 = l.C8455.f25866
            r3 = 3
            r4 = 2
            r5 = 0
            java.lang.Class r6 = java.lang.Boolean.TYPE
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            java.lang.String r8 = "performStopActivity"
            if (r0 != 0) goto L41
            goto L53
        L41:
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L53
            r9[r5] = r7     // Catch: java.lang.Throwable -> L53
            r9[r2] = r6     // Catch: java.lang.Throwable -> L53
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r4] = r10     // Catch: java.lang.Throwable -> L53
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> L53
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L53
            goto L54
        L53:
            r0 = r1
        L54:
            l.C8455.f25870 = r0
            java.lang.Class r0 = l.C8455.f25866
            if (r0 != 0) goto L5b
            goto L69
        L5b:
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L69
            r9[r5] = r7     // Catch: java.lang.Throwable -> L69
            r9[r2] = r6     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> L69
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L69
            goto L6a
        L69:
            r0 = r1
        L6a:
            l.C8455.f25871 = r0
            java.lang.Class r0 = l.C8455.f25866
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r8 == r9) goto L78
            r9 = 27
            if (r8 != r9) goto La7
        L78:
            if (r0 != 0) goto L7b
            goto La7
        L7b:
            java.lang.String r8 = "requestRelaunchActivity"
            r9 = 9
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> La7
            r9[r5] = r7     // Catch: java.lang.Throwable -> La7
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r9[r2] = r5     // Catch: java.lang.Throwable -> La7
            r9[r4] = r5     // Catch: java.lang.Throwable -> La7
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La7
            r9[r3] = r4     // Catch: java.lang.Throwable -> La7
            r3 = 4
            r9[r3] = r6     // Catch: java.lang.Throwable -> La7
            java.lang.Class<android.content.res.Configuration> r3 = android.content.res.Configuration.class
            r4 = 5
            r9[r4] = r3     // Catch: java.lang.Throwable -> La7
            r4 = 6
            r9[r4] = r3     // Catch: java.lang.Throwable -> La7
            r3 = 7
            r9[r3] = r6     // Catch: java.lang.Throwable -> La7
            r3 = 8
            r9[r3] = r6     // Catch: java.lang.Throwable -> La7
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> La7
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> La7
            r1 = r0
        La7:
            l.C8455.f25868 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8455.<clinit>():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22136(Activity activity) {
        Object obj;
        Handler handler = f25867;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
            return true;
        }
        Method method = f25868;
        if (((i != 26 && i != 27) || method != null) && (f25871 != null || f25870 != null)) {
            try {
                Object obj2 = f25872.get(activity);
                if (obj2 != null && (obj = f25869.get(activity)) != null) {
                    Application application = activity.getApplication();
                    C1399 c1399 = new C1399(activity);
                    application.registerActivityLifecycleCallbacks(c1399);
                    handler.post(new RunnableC19745(c1399, obj2));
                    try {
                        if (i == 26 || i == 27) {
                            Boolean bool = Boolean.FALSE;
                            method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                        } else {
                            activity.recreate();
                        }
                        return true;
                    } finally {
                        handler.post(new RunnableC0693(application, c1399));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22137(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f25872.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f25867.postAtFrontOfQueue(new RunnableC5633(f25869.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
