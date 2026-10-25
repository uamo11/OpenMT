package l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: H1CY */
/* renamed from: l.᩻֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23355 extends AbstractC19123 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f75035;

    @Override // l.AbstractC19123
    /* renamed from: ֫ */
    public final void mo5144(float f, View view) {
        Method method;
        if (view instanceof C10075) {
            ((C10075) view).m25321(m44146(f));
            return;
        }
        if (this.f75035) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f75035 = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m44146(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
