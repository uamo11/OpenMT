package l;

import android.app.Application;
import android.content.Context;
import com.umeng.analytics.pro.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: H1JY */
/* renamed from: l.ᩳۡ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17942 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicBoolean f55933 = new AtomicBoolean(false);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m41941(Context context) {
        C11233.m27805(context, d.R);
        if (f55933.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C11233.m27800((Object) applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C16530());
    }
}
