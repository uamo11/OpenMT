package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: H8ZV */
/* renamed from: l.᩷ۨۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC20850 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9561 f67504;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17321 f67505;

    public RunnableC20850(C9561 c9561, C17321 c17321) {
        this.f67504 = c9561;
        this.f67505 = c17321;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Rect bounds;
        String scheme;
        Map map;
        Map map2;
        C9561 c9561 = this.f67504;
        C17321 c17321 = this.f67505;
        String m40639 = c17321.m40639();
        Drawable drawable = null;
        try {
            scheme = Uri.parse(m40639).getScheme();
        } catch (Throwable unused) {
        }
        if (scheme == null || scheme.length() == 0) {
            throw new IllegalStateException("No scheme is found: " + m40639);
        }
        map = c9561.f29013;
        AbstractC12382 abstractC12382 = (AbstractC12382) ((HashMap) map).get(scheme);
        if (abstractC12382 != null) {
            C1093 mo19978 = abstractC12382.mo19978(m40639);
            try {
                map2 = c9561.f29016;
                AbstractC13087 abstractC13087 = (AbstractC13087) ((HashMap) map2).get(mo19978.m3763());
                if (abstractC13087 == null) {
                    abstractC13087 = c9561.f29011;
                }
                if (abstractC13087 != null) {
                    drawable = abstractC13087.mo15264(mo19978.m3764());
                    mo19978.m3764().close();
                    if (drawable != null && ((bounds = drawable.getBounds()) == null || bounds.isEmpty())) {
                        drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
                    }
                    handler = c9561.f29014;
                    handler.postAtTime(new RunnableC6738(this, drawable), c17321, SystemClock.uptimeMillis());
                    return;
                }
                throw new IllegalStateException("No media-decoder is found: " + m40639);
            } catch (Throwable th) {
                try {
                    mo19978.m3764().close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        }
        throw new IllegalStateException("No scheme-handler is found: " + m40639);
    }
}
