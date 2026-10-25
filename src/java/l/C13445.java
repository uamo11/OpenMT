package l;

import android.view.Surface;

/* compiled from: 68R4 */
/* renamed from: l.۬᩻ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13445 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32474(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            C19956.m46034("Failed to call Surface.setFrameRate", e);
        }
    }
}
