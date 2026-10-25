package l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: C3Y1 */
/* renamed from: l.ۘۛܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3758 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11381(InterfaceC0353 interfaceC0353, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(interfaceC0353.mo1226().size());
        for (Map.Entry entry : interfaceC0353.mo1226().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2347 m11380(Class cls, String str) {
        try {
            return new C2347(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }
}
