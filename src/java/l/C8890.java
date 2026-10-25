package l;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: 14P2 */
/* renamed from: l.ۡ۬, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C8890 extends C20885 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Method f27049;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Constructor f27050;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Class f27051;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f27052;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Method f27053;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f27054;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f27055;

    public C8890() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = m22962((Class) cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = mo22965((Class) cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f27051 = cls;
        this.f27050 = constructor;
        this.f27055 = method2;
        this.f27049 = method3;
        this.f27053 = method4;
        this.f27052 = method5;
        this.f27054 = method;
    }

    @Override // l.C19474
    /* renamed from: ֫ */
    public final Typeface mo8051(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (this.f27055 != null) {
            try {
                obj = this.f27050.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!m22961(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.f27052.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m22963(obj)) {
                    return mo22964(obj);
                }
            }
            return null;
        }
        return super.mo8051(context, resources, i, str, i2);
    }

    @Override // l.C20885, l.C19474
    /* renamed from: ֫ */
    public final Typeface mo8053(Context context, C9308 c9308, Resources resources, int i) {
        Object obj;
        if (this.f27055 != null) {
            try {
                obj = this.f27050.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                C8602[] m23893 = c9308.m23893();
                int length = m23893.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        C8602 c8602 = m23893[i2];
                        if (m22961(context, obj, c8602.m22348(), c8602.m22351(), c8602.m22352(), c8602.m22350() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c8602.m22353()))) {
                            i2++;
                        } else {
                            try {
                                this.f27052.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (m22963(obj)) {
                        return mo22964(obj);
                    }
                }
            }
            return null;
        }
        return super.mo8053(context, c9308, resources, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m22961(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f27055.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Typeface mo22964(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f27051, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f27054.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m22963(Object obj) {
        try {
            return ((Boolean) this.f27053.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C20885, l.C19474
    /* renamed from: ֫ */
    public final Typeface mo8054(Context context, C17275[] c17275Arr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        Object obj;
        Typeface mo22964;
        boolean z;
        Object[] objArr = null;
        if (c17275Arr.length >= 1) {
            if (this.f27055 != null) {
                HashMap hashMap = new HashMap();
                for (C17275 c17275 : c17275Arr) {
                    if (c17275.m40563() == 0) {
                        Uri m40565 = c17275.m40565();
                        if (!hashMap.containsKey(m40565)) {
                            hashMap.put(m40565, C0422.m1947(context, m40565));
                        }
                    }
                }
                Map unmodifiableMap = C20195.unmodifiableMap(hashMap);
                try {
                    obj = this.f27050.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    obj = null;
                }
                if (obj != null) {
                    int length = c17275Arr.length;
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        Method method = this.f27052;
                        if (i2 < length) {
                            C17275 c172752 = c17275Arr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c172752.m40565());
                            if (byteBuffer != null) {
                                try {
                                    z = ((Boolean) this.f27049.invoke(obj, byteBuffer, Integer.valueOf(c172752.m40564()), null, Integer.valueOf(c172752.m40567()), Integer.valueOf(c172752.m40566() ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    z = false;
                                }
                                if (!z) {
                                    objArr = null;
                                    method.invoke(obj, null);
                                    break;
                                }
                                objArr = null;
                                z2 = true;
                            }
                            try {
                                i2++;
                            } catch (IllegalAccessException | InvocationTargetException unused3) {
                            }
                        } else if (!z2) {
                            method.invoke(obj, objArr);
                        } else if (m22963(obj) && (mo22964 = mo22964(obj)) != null) {
                            return Typeface.create(mo22964, i);
                        }
                    }
                }
            } else {
                C17275 mo8055 = mo8055(i, c17275Arr);
                try {
                    try {
                        openFileDescriptor = context.getContentResolver().openFileDescriptor(mo8055.m40565(), "r", null);
                    } catch (IOException unused4) {
                    }
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                        return null;
                    }
                    try {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo8055.m40567()).setItalic(mo8055.m40566()).build();
                        openFileDescriptor.close();
                        return build;
                    } finally {
                    }
                } catch (IOException unused5) {
                }
            }
            return null;
        }
        return objArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method m22962(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Method mo22965(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
