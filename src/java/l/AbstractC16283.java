package l;

import android.view.animation.Interpolator;

/* compiled from: 21VS */
/* renamed from: l.ܽ֡ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC16283 implements Cloneable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f50073;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Interpolator f50072 = null;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50074 = false;

    @Override // 
    public abstract AbstractC16283 clone();

    /* renamed from: ֫ */
    public abstract void mo26697(Object obj);

    /* renamed from: ܽ */
    public abstract Float mo26698();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Interpolator m38306() {
        return this.f50072;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38307(Interpolator interpolator) {
        this.f50072 = interpolator;
    }
}
