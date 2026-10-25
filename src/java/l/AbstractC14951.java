package l;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: Z4TG */
/* renamed from: l.ܶۗ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC14951 {
    /* renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
    public abstract void m35416(int i);

    /* renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
    public abstract void m35417(Typeface typeface);

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        m35415(handler).post(new RunnableC20004(1, this, typeface));
    }

    public final void callbackFailAsync(final int i, Handler handler) {
        m35415(handler).post(new Runnable() { // from class: l.۠ۗ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC14951.this.m35416(i);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Handler m35415(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }
}
