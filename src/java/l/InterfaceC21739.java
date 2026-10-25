package l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: 4831 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: l.᩸ᩳۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public @interface InterfaceC21739 {
    boolean nullSafe() default true;

    Class value();
}
