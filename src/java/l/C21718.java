package l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: 8827 */
/* renamed from: l.᩸ܿۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C21718 implements InterfaceC15387 {
    @Override // l.InterfaceC15387
    /* renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Type componentType;
        Type m38779 = c16469.m38779();
        boolean z = m38779 instanceof GenericArrayType;
        if (!z && (!(m38779 instanceof Class) || !((Class) m38779).isArray())) {
            return null;
        }
        if (z) {
            componentType = ((GenericArrayType) m38779).getGenericComponentType();
        } else {
            componentType = ((Class) m38779).getComponentType();
        }
        return new C22423(c12524, c12524.m30728(C16469.m38776(componentType)), C6216.m17138(componentType));
    }
}
