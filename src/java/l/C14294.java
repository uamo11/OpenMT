package l;

import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: E9RE */
/* renamed from: l.ܳۙ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14294 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f43082 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f43083;

    static {
        new HashMap();
        try {
            f43083 = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.getStackTraceString(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IBinder m34080(String str) {
        HashMap hashMap = f43082;
        IBinder iBinder = (IBinder) hashMap.get(str);
        if (iBinder == null) {
            try {
                iBinder = (IBinder) f43083.invoke(null, str);
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.getStackTraceString(e);
            }
            hashMap.put(str, iBinder);
        }
        return iBinder;
    }
}
