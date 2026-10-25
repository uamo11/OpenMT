package l;

import java.util.Iterator;
import java.util.Set;

/* compiled from: A5T6 */
/* renamed from: l.ۛ۠֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC5924 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16612(C3438 c3438, Set set) {
        c3438.m10512();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC9272 interfaceC9272 = (InterfaceC9272) it.next();
            c3438.write(interfaceC9272.getName());
            c3438.write(" = ", 0, 3);
            AbstractC11569.m28462(c3438, interfaceC9272.getValue());
            c3438.write(10);
        }
        c3438.m10508();
    }
}
