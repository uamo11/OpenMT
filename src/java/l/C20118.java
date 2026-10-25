package l;

import android.window.BackEvent;

/* compiled from: C9BS */
/* renamed from: l.᩶ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20118 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f65150;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f65151;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f65152;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f65153;

    public C20118(BackEvent backEvent) {
        C11233.m27805(backEvent, "backEvent");
        C22234 c22234 = C22234.f72138;
        float m49908 = c22234.m49908(backEvent);
        float m49909 = c22234.m49909(backEvent);
        float m49905 = c22234.m49905(backEvent);
        int m49907 = c22234.m49907(backEvent);
        this.f65152 = m49908;
        this.f65153 = m49909;
        this.f65150 = m49905;
        this.f65151 = m49907;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m46373() {
        return this.f65153;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m46371() {
        return this.f65150;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m46372() {
        return this.f65151;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f65152 + ", touchY=" + this.f65153 + ", progress=" + this.f65150 + ", swipeEdge=" + this.f65151 + '}';
    }
}
