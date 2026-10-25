package l;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: HAVQ */
/* renamed from: l.ܺۧܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15896 implements Comparable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f49113;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Class f49114;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f49115;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f49116;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f49117;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f49118;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f49119;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f49120;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Type f49121;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f49122;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f49123;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Field f49124;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String[] f49125;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Class f49126;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Method f49127;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12966 m37672() {
        return null;
    }

    public C15896(String str, Class cls, Class cls2, Type type, Field field, int i, int i2) {
        this.f49113 = 0;
        i = i < 0 ? 0 : i;
        this.f49123 = str;
        this.f49126 = cls;
        this.f49114 = cls2;
        this.f49121 = type;
        this.f49127 = null;
        this.f49124 = field;
        this.f49113 = i;
        this.f49119 = i2;
        this.f49120 = cls2.isEnum() && !InterfaceC8028.class.isAssignableFrom(cls2);
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f49115 = true;
            this.f49122 = Modifier.isTransient(modifiers);
        } else {
            this.f49115 = false;
            this.f49122 = false;
        }
        this.f49116 = false;
        long j = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            j = (j ^ str.charAt(i3)) * 1099511628211L;
        }
        this.f49117 = j;
        this.f49118 = null;
        this.f49125 = new String[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0124, code lost:
    
        r10 = r4.f49126.getTypeParameters();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
    
        if (r1 >= r10.length) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0134, code lost:
    
        if (r13.equals(r10[r1]) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
    
        r11 = r0[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15896(java.lang.String r5, java.lang.reflect.Method r6, java.lang.reflect.Field r7, java.lang.Class r8, java.lang.reflect.Type r9, int r10, int r11, l.InterfaceC12966 r12, l.InterfaceC12966 r13) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15896.<init>(java.lang.String, java.lang.reflect.Method, java.lang.reflect.Field, java.lang.Class, java.lang.reflect.Type, int, int, l.۬۟ۡ, l.۬۟ۡ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Type m37670(Class cls, Type type, Type type2) {
        TypeVariable[] typeVariableArr;
        ParameterizedType parameterizedType;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type m37670 = m37670(cls, type, genericComponentType);
                return genericComponentType != m37670 ? Array.newInstance((Class<?>) C19426.m44730(m37670), 0).getClass() : type2;
            }
            if (C19426.m44761(type)) {
                if (type2 instanceof TypeVariable) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) C19426.m44756(type);
                    Class m44730 = C19426.m44730((Type) parameterizedType2);
                    TypeVariable typeVariable = (TypeVariable) type2;
                    for (int i = 0; i < m44730.getTypeParameters().length; i++) {
                        if (m44730.getTypeParameters()[i].getName().equals(typeVariable.getName())) {
                            return parameterizedType2.getActualTypeArguments()[i];
                        }
                    }
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType3 = (ParameterizedType) type2;
                    Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                    Type[] typeArr = null;
                    if (type instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) type;
                        typeVariableArr = cls.getTypeParameters();
                    } else if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
                        typeVariableArr = cls.getSuperclass().getTypeParameters();
                    } else {
                        typeVariableArr = null;
                        parameterizedType = null;
                    }
                    boolean z = false;
                    for (int i2 = 0; i2 < actualTypeArguments.length && parameterizedType != null; i2++) {
                        Type type3 = actualTypeArguments[i2];
                        if (type3 instanceof TypeVariable) {
                            TypeVariable typeVariable2 = (TypeVariable) type3;
                            for (int i3 = 0; i3 < typeVariableArr.length; i3++) {
                                if (typeVariableArr[i3].getName().equals(typeVariable2.getName())) {
                                    if (typeArr == null) {
                                        typeArr = parameterizedType.getActualTypeArguments();
                                    }
                                    actualTypeArguments[i2] = typeArr[i3];
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        return new C18720(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                    }
                }
            }
        }
        return type2;
    }

    public final String toString() {
        return this.f49123;
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C15896 c15896) {
        int i = c15896.f49113;
        int i2 = this.f49113;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f49123.compareTo(c15896.f49123);
    }
}
