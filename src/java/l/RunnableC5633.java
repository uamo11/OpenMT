package l;

import java.lang.reflect.Method;

/* compiled from: K22G */
/* renamed from: l.ۚ᩹, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC5633 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17405;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17406;

    public RunnableC5633(Object obj, Object obj2) {
        this.f17405 = obj;
        this.f17406 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C8455.f25870;
            Object obj = this.f17406;
            Object obj2 = this.f17405;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C8455.f25871.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
