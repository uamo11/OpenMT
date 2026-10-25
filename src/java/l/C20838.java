package l;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: PANA */
/* renamed from: l.᩷ۧܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20838 extends AbstractC16876 implements InterfaceC2123 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f67473;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20838(ClassLoader classLoader) {
        super(0);
        this.f67473 = classLoader;
    }

    @Override // l.InterfaceC2123
    /* renamed from: ֫ */
    public final Object mo4049() {
        boolean z;
        C3904 c3904 = C3904.f12479;
        c3904.getClass();
        Class<?> loadClass = this.f67473.loadClass("androidx.window.extensions.layout.FoldingFeature");
        Method method = loadClass.getMethod("getBounds", null);
        Method method2 = loadClass.getMethod("getType", null);
        Method method3 = loadClass.getMethod("getState", null);
        C11233.m27803(method, "getBoundsMethod");
        if (C3904.m11905(c3904, method, C6999.m18935(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
            C11233.m27803(method2, "getTypeMethod");
            Class cls = Integer.TYPE;
            if (C3904.m11905(c3904, method2, C6999.m18935(cls)) && Modifier.isPublic(method2.getModifiers())) {
                C11233.m27803(method3, "getStateMethod");
                if (C3904.m11905(c3904, method3, C6999.m18935(cls)) && Modifier.isPublic(method3.getModifiers())) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
