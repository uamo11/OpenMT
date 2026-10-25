package l;

import android.view.View;

/* compiled from: NAVX */
/* renamed from: l.ܰᩳܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC13987 implements Runnable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f41701;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1973 f41702;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f41703 = 0;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11146 f41704;

    public RunnableC13987(C11146 c11146, View view, InterfaceC1973 interfaceC1973) {
        this.f41704 = c11146;
        this.f41701 = view;
        this.f41702 = interfaceC1973;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f41701;
        if (view.isPressed()) {
            int i = this.f41703;
            this.f41703 = i + 1;
            if (i > 0) {
                view.performHapticFeedback(0);
            }
            this.f41704.f33466.f46926.mo14040(view, this.f41702);
            if (this.f41703 < 50) {
                C4925.m14316(this, (((50 - r0) * 130) / 50) + 20);
            } else {
                C4925.m14316(this, 20L);
            }
        }
    }
}
