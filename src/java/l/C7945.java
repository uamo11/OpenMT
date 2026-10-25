package l;

import android.content.Context;
import android.widget.OverScroller;

/* compiled from: 14SR */
/* renamed from: l.۠ۙ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7945 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final OverScroller f24568;

    public C7945(Context context) {
        this.f24568 = new OverScroller(context);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21245() {
        return this.f24568.computeScrollOffset();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21244(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f24568.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21246() {
        this.f24568.forceFinished(true);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m21248() {
        return this.f24568.isFinished();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m21247() {
        return this.f24568.getCurrX();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m21249() {
        return this.f24568.getCurrY();
    }
}
