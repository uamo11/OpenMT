package l;

import android.view.View;

/* compiled from: 715M */
/* renamed from: l.֡᩵ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C0621 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f2380;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f2381;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View[] f2382;

    public C0621(View... viewArr) {
        this.f2382 = viewArr;
    }

    @InterfaceC4801
    public void setAlpha(float f) {
        for (View view : this.f2382) {
            view.setAlpha(f);
        }
        if (f == 0.0f) {
            if (this.f2380) {
                m2553(8);
            } else if (this.f2381) {
                m2553(4);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2553(int i) {
        for (View view : this.f2382) {
            view.setVisibility(i);
        }
    }
}
