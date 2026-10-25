package l;

import android.window.BackEvent;

/* compiled from: C9BS */
/* renamed from: l.᩹ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22234 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C22234 f72138 = new C22234();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m49905(BackEvent backEvent) {
        C11233.m27805(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m49907(BackEvent backEvent) {
        C11233.m27805(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m49908(BackEvent backEvent) {
        C11233.m27805(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m49909(BackEvent backEvent) {
        C11233.m27805(backEvent, "backEvent");
        return backEvent.getTouchY();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BackEvent m49906(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }
}
