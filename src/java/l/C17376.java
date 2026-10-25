package l;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* compiled from: R9NW */
/* renamed from: l.ܿܰ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17376 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18082 f53192;

    public C17376(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f53192 = new C16670(C14119.m33723(i, interpolator, j));
        } else {
            this.f53192 = new C23292(i, interpolator, j);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m40725() {
        return this.f53192.mo39192();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m40724() {
        return this.f53192.mo39191();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m40722() {
        return this.f53192.mo39189();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40723(float f) {
        this.f53192.mo39190(f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17376 m40721(WindowInsetsAnimation windowInsetsAnimation) {
        C17376 c17376 = new C17376(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            c17376.f53192 = new C16670(windowInsetsAnimation);
        }
        return c17376;
    }
}
