package l;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: A87D */
/* renamed from: l.ܶܿۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC15366 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15366 f47081;

    /* renamed from: ֫ */
    public abstract Object mo2296(Class cls);

    static {
        AbstractC15366 c8312;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            c8312 = new C0550(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    c8312 = new C5490(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    c8312 = new C1256(declaredMethod3);
                }
            } catch (Exception unused3) {
                c8312 = new C8312();
            }
        }
        f47081 = c8312;
    }
}
