package l;

import java.lang.reflect.AccessibleObject;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: U87V */
/* renamed from: l.ۖܿۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2668 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC9745 m8360(Class cls) {
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            EnumC9745 check = ((InterfaceC9039) it.next()).check();
            if (check != EnumC9745.INDECISIVE) {
                return check;
            }
        }
        return EnumC9745.ALLOW;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8361(Object obj, AccessibleObject accessibleObject) {
        return AbstractC16072.f49542.mo23268(obj, accessibleObject);
    }
}
