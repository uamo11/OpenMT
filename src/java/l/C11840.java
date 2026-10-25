package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: 47S6 */
/* renamed from: l.ۨܿۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11840 extends AbstractC8333 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f35323 = new C6195();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f35325 = new HashMap();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f35326 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f35324 = new HashMap();

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        Enum r3 = (Enum) obj;
        c23525.m51984(r3 == null ? null : (String) this.f35324.get(r3));
    }

    public C11840(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r3 = (Enum) field2.get(null);
                String name = r3.name();
                String str = r3.toString();
                InterfaceC22444 interfaceC22444 = (InterfaceC22444) field2.getAnnotation(InterfaceC22444.class);
                if (interfaceC22444 != null) {
                    name = interfaceC22444.value();
                    for (String str2 : interfaceC22444.alternate()) {
                        this.f35325.put(str2, r3);
                    }
                }
                this.f35325.put(name, r3);
                this.f35326.put(str, r3);
                this.f35324.put(r3, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String m40399 = c17175.m40399();
        Enum r0 = (Enum) this.f35325.get(m40399);
        return r0 == null ? (Enum) this.f35326.get(m40399) : r0;
    }
}
