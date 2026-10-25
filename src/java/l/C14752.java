package l;

import android.view.Choreographer;

/* compiled from: 79M1 */
/* renamed from: l.ܳ᩶ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14752 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35058(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: l.ܿ᩶ۧ
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
