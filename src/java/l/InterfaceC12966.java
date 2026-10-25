package l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: parseFeatures */
/* compiled from: BAUW */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: l.۬۟ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public @interface InterfaceC12966 {
    String[] alternateNames() default {};

    boolean deserialize() default true;

    String format() default "";

    String name() default "";

    int ordinal() default 0;

    boolean serialize() default true;

    EnumC20837[] serialzeFeatures() default {};
}
