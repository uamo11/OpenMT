package l;

import java.lang.annotation.Annotation;

/* compiled from: UB5A */
/* renamed from: l.ᩳܿᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18202 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Annotation m42417(Class cls) {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (InterfaceC21751.class.equals(annotation.annotationType())) {
                return (Annotation) InterfaceC21751.class.cast(annotation);
            }
        }
        return null;
    }
}
