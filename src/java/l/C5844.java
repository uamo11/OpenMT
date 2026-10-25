package l;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: J8TX */
/* renamed from: l.ۛۚ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5844 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16367(Context context, C10659 c10659) {
        Executor executor;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C10078 c10078 = new C10078(c10659);
            executor = c10659.f32063;
            telephonyManager.registerTelephonyCallback(executor, c10078);
            telephonyManager.unregisterTelephonyCallback(c10078);
        } catch (RuntimeException unused) {
            c10659.m26750(5);
        }
    }
}
