package l;

import android.content.ComponentName;
import android.content.Intent;
import bin.mt.plus.Main;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.strategy.Name;

/* compiled from: 59SA */
/* renamed from: l.ۤ֨ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9966 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25123(C16560 c16560, InterfaceC17889 interfaceC17889) {
        if (!c16560.m39035(b.k)) {
            return false;
        }
        String mo36971 = interfaceC17889.mo36971();
        return mo36971.startsWith("video/") || mo36971.startsWith("audio/");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25122(C16560 c16560, InterfaceC17889 interfaceC17889, ComponentName componentName) {
        int i = ServiceC9390.f28512;
        Main m39056 = c16560.m39056();
        AbstractC3163 abstractC3163 = (AbstractC3163) c16560.m39044().mo6020();
        Intent intent = new Intent(m39056, (Class<?>) ServiceC9390.class);
        intent.setAction("bin.mt.plus.NetworkStreamingService.ACTION_PLAY");
        intent.putExtra("componentName", componentName);
        intent.putExtra("statelessVisitor", abstractC3163.m33350());
        intent.putExtra(MotionUtils.EASING_TYPE_PATH, interfaceC17889.getPath());
        intent.putExtra("mime", interfaceC17889.mo36971());
        intent.putExtra("time", interfaceC17889.getTime());
        intent.putExtra(Name.LENGTH, interfaceC17889.getSize());
        C0881.m3232(m39056, intent);
    }
}
