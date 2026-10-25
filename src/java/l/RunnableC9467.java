package l;

import android.widget.ImageView;

/* compiled from: 313O */
/* renamed from: l.ۢ۠ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC9467 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8761 f28788;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f28789 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f28790;

    public RunnableC9467(C8761 c8761) {
        this.f28788 = c8761;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1315 c1315;
        C1315 c13152;
        C8761 c8761 = this.f28788;
        C2910 c2910 = c8761.f26709;
        c8761.f26712 = c2910.m8891(c8761.f26713);
        String m8898 = c2910.m8898();
        c1315 = C3822.f12232;
        synchronized (c1315) {
            c13152 = C3822.f12232;
            c13152.m4554(m8898, this.f28788.f26712);
        }
        C4925.m14315(new Runnable() { // from class: l.᩷۠ܿ
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC9467 runnableC9467 = RunnableC9467.this;
                C8761 c87612 = runnableC9467.f28788;
                C2910 c29102 = c87612.f26709;
                ImageView imageView = runnableC9467.f28790;
                if (imageView.getTag() == c29102) {
                    imageView.setImageDrawable(c87612.f26712);
                }
            }
        });
    }
}
