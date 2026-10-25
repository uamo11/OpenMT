package l;

import android.os.Build;
import android.view.View;

/* compiled from: 95QI */
/* renamed from: l.᩶ۨ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC20139 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f65206;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f65207;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f65208;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Class f65209;

    /* renamed from: ֫ */
    public abstract Object mo3754(View view);

    /* renamed from: ֫ */
    public abstract void mo3755(View view, Object obj);

    /* renamed from: ֫ */
    public abstract boolean mo3756(Object obj, Object obj2);

    public AbstractC20139(int i, int i2, int i3, Class cls) {
        this.f65208 = i;
        this.f65209 = cls;
        this.f65206 = i2;
        this.f65207 = i3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m46385(View view) {
        if (Build.VERSION.SDK_INT >= this.f65207) {
            return mo3754(view);
        }
        Object tag = view.getTag(this.f65208);
        if (this.f65209.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46386(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.f65207) {
            mo3755(view, obj);
            return;
        }
        if (mo3756(m46385(view), obj)) {
            C16445 m41323 = C17648.m41323(view);
            if (m41323 == null) {
                m41323 = new C16445();
            }
            C17648.m41309(view, m41323);
            view.setTag(this.f65208, obj);
            C17648.m41300(this.f65206, view);
        }
    }
}
