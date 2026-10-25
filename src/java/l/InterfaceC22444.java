package l;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: E80B */
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: l.᩹ᩳۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public @interface InterfaceC22444 {
    String[] alternate() default {};

    String value();
}
