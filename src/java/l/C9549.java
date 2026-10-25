package l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: PANA */
/* renamed from: l.ۢۧܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9549 extends AbstractC16876 implements InterfaceC2123 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f28965;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9549(ClassLoader classLoader) {
        super(0);
        this.f28965 = classLoader;
    }

    @Override // l.InterfaceC2123
    /* renamed from: ֫ */
    public final Object mo4049() {
        boolean z;
        C3904.f12479.getClass();
        ClassLoader classLoader = this.f28965;
        Method method = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
        Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C11233.m27803(method, "getWindowLayoutComponentMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            C11233.m27803(loadClass, "windowLayoutComponentClass");
            if (method.getReturnType().equals(loadClass)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
