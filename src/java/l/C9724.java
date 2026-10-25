package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* compiled from: U87V */
/* renamed from: l.ۢܿۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9724 extends AbstractC16072 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f29470;

    public C9724(Method method) {
        this.f29470 = method;
    }

    @Override // l.AbstractC16072
    /* renamed from: ֫ */
    public final boolean mo23268(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f29470.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
