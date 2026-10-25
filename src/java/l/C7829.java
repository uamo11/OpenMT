package l;

import java.lang.reflect.Array;

/* compiled from: 64NM */
/* renamed from: l.۠֡ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7829 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object[] f24229 = new Object[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object[] f24228 = new Object[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object[] m20927(int i, int i2, Object[] objArr) {
        Object[] objArr2;
        Class<?> cls = objArr.getClass();
        if (cls == Object[].class) {
            objArr2 = i == 0 ? f24229 : new Object[i];
        } else {
            objArr2 = (Object[]) Array.newInstance(cls.getComponentType(), i);
        }
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }
}
