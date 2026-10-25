package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: H88J */
/* renamed from: l.ۚܳۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5406 implements InterfaceC15387 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List f16870;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13955 f16871;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC15345 f16872;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20328 f16873;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3394 f16874;

    public C5406(C20328 c20328, InterfaceC15345 interfaceC15345, C3394 c3394, C13955 c13955) {
        List list = Collections.EMPTY_LIST;
        this.f16873 = c20328;
        this.f16872 = interfaceC15345;
        this.f16874 = c3394;
        this.f16871 = c13955;
        this.f16870 = list;
    }

    @Override // l.InterfaceC15387
    /* renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Class m38778 = c16469.m38778();
        if (!Object.class.isAssignableFrom(m38778)) {
            return null;
        }
        int i = C13438.f40152;
        if (!Modifier.isStatic(m38778.getModifiers()) && (m38778.isAnonymousClass() || m38778.isLocalClass())) {
            return new C8934();
        }
        List list = Collections.EMPTY_LIST;
        EnumC9745 m8360 = C2668.m8360(m38778);
        if (m8360 == EnumC9745.BLOCK_ALL) {
            throw new C13934(C21639.m48905(m38778, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = m8360 == EnumC9745.BLOCK_INACCESSIBLE;
        return C13438.m32472(m38778) ? new C0466(m38778, m15474(c12524, c16469, m38778, z, true), z) : new C18812(this.f16873.m46639(c16469, true), m15474(c12524, c16469, m38778, z, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15476(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!C2668.m8361(obj, accessibleObject)) {
            throw new C13934(C16014.m37867(C13438.m32463(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15475(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + C13438.m32465(field) + " and " + C13438.m32465(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.List] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19518 m15474(C12524 c12524, C16469 c16469, Class cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        Method method;
        String value;
        List asList;
        ArrayList<String> arrayList;
        C16469 c164692;
        String str;
        Field field;
        int i;
        AbstractC8333 abstractC8333;
        int i2;
        if (cls.isInterface()) {
            return C19518.f63080;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C16469 c164693 = c16469;
        boolean z5 = z;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z6 = true;
            boolean z7 = false;
            if (cls2 == cls || declaredFields.length <= 0) {
                z3 = z5;
            } else {
                List list = Collections.EMPTY_LIST;
                EnumC9745 m8360 = C2668.m8360(cls2);
                if (m8360 == EnumC9745.BLOCK_ALL) {
                    throw new C13934("ReflectionAccessFilter does not permit using reflection for " + cls2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z3 = m8360 == EnumC9745.BLOCK_INACCESSIBLE;
            }
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field2 = declaredFields[i3];
                C3394 c3394 = this.f16874;
                boolean m10351 = c3394.m10351(field2, z6);
                boolean m103512 = c3394.m10351(field2, z7);
                boolean z8 = !m103512;
                if (m10351 && m103512) {
                    i = i3;
                    i2 = length;
                } else {
                    if (!z2) {
                        z4 = z8;
                        method = null;
                    } else if (Modifier.isStatic(field2.getModifiers())) {
                        method = null;
                        z4 = false;
                    } else {
                        Method m32467 = C13438.m32467(cls2, field2);
                        if (!z3) {
                            C13438.m32468(m32467);
                        }
                        if (m32467.getAnnotation(InterfaceC22444.class) != null && field2.getAnnotation(InterfaceC22444.class) == null) {
                            throw new C13934(C4860.m14172("@SerializedName on ", C13438.m32463(m32467, z7), " is not supported"));
                        }
                        z4 = z8;
                        method = m32467;
                    }
                    if (!z3 && method == null) {
                        C13438.m32468((AccessibleObject) field2);
                    }
                    Type m17130 = C6216.m17130(cls2, c164693.m38779(), field2.getGenericType());
                    InterfaceC22444 interfaceC22444 = (InterfaceC22444) field2.getAnnotation(InterfaceC22444.class);
                    if (interfaceC22444 == null) {
                        InterfaceC15345 interfaceC15345 = this.f16872;
                        value = interfaceC15345.mo2248(field2);
                        asList = interfaceC15345.mo2247(field2);
                    } else {
                        value = interfaceC22444.value();
                        asList = Arrays.asList(interfaceC22444.alternate());
                    }
                    if (asList.isEmpty()) {
                        arrayList = Collections.singletonList(value);
                    } else {
                        ArrayList arrayList2 = new ArrayList(asList.size() + 1);
                        arrayList2.add(value);
                        arrayList2.addAll(asList);
                        arrayList = arrayList2;
                    }
                    String str2 = (String) arrayList.get(0);
                    C16469 m38776 = C16469.m38776(m17130);
                    Class m38778 = m38776.m38778();
                    boolean z9 = m38778 != null && m38778.isPrimitive();
                    int modifiers = field2.getModifiers();
                    boolean z10 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                    InterfaceC21739 interfaceC21739 = (InterfaceC21739) field2.getAnnotation(InterfaceC21739.class);
                    if (interfaceC21739 != null) {
                        str = str2;
                        c164692 = m38776;
                        field = field2;
                        i = i3;
                        abstractC8333 = this.f16871.m33403(this.f16873, c12524, m38776, interfaceC21739, false);
                    } else {
                        c164692 = m38776;
                        str = str2;
                        field = field2;
                        i = i3;
                        abstractC8333 = null;
                    }
                    boolean z11 = abstractC8333 != null;
                    C16469 c164694 = c164692;
                    if (abstractC8333 == null) {
                        abstractC8333 = c12524.m30728(c164694);
                    }
                    AbstractC8333 c21634 = m10351 ? abstractC8333 : z11 ? abstractC8333 : new C21634(c12524, abstractC8333, c164694.m38779());
                    i2 = length;
                    C15988 c15988 = new C15988(str, field, z3, method, c21634, abstractC8333, z9, z10);
                    if (z4) {
                        for (String str3 : arrayList) {
                            AbstractC3995 abstractC3995 = (AbstractC3995) linkedHashMap.put(str3, c15988);
                            if (abstractC3995 != null) {
                                m15475(cls, str3, abstractC3995.f12662, field);
                                throw null;
                            }
                        }
                    }
                    Field field3 = field;
                    if (m10351) {
                        continue;
                    } else {
                        String str4 = str;
                        AbstractC3995 abstractC39952 = (AbstractC3995) linkedHashMap2.put(str4, c15988);
                        if (abstractC39952 != null) {
                            m15475(cls, str4, abstractC39952.f12662, field3);
                            throw null;
                        }
                    }
                }
                i3 = i + 1;
                z6 = true;
                length = i2;
                z7 = false;
            }
            c164693 = C16469.m38776(C6216.m17130(cls2, c164693.m38779(), cls2.getGenericSuperclass()));
            cls2 = c164693.m38778();
            z5 = z3;
        }
        return new C19518(new ArrayList(linkedHashMap2.values()), linkedHashMap);
    }
}
