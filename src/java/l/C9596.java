package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: E55J */
/* renamed from: l.ۢ۬, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9596 extends C19474 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Method f29124;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Method f29125;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Class f29126;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Constructor f29127;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f29127 = constructor;
        f29126 = cls;
        f29124 = method2;
        f29125 = method;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24532() {
        return f29124 != null;
    }

    @Override // l.C19474
    /* renamed from: ֫ */
    public final Typeface mo8053(Context context, C9308 c9308, Resources resources, int i) {
        Object obj;
        int i2;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        try {
            obj = f29127.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C8602[] m23893 = c9308.m23893();
            int length = m23893.length;
            while (i2 < length) {
                C8602 c8602 = m23893[i2];
                int m22349 = c8602.m22349();
                File m1946 = C0422.m1946(context);
                if (m1946 != null) {
                    try {
                        if (C0422.m1949(m1946, resources, m22349)) {
                            try {
                                fileInputStream = new FileInputStream(m1946);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                                mappedByteBuffer = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, convertMaybeLegacyFileChannelFromLibrary.size());
                                fileInputStream.close();
                                i2 = (mappedByteBuffer == null && m24533(obj, mappedByteBuffer, c8602.m22351(), c8602.m22352(), c8602.m22350())) ? i2 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        m1946.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer == null) {
                }
            }
            return m24531(obj);
        }
        return null;
    }

    @Override // l.C19474
    /* renamed from: ֫ */
    public final Typeface mo8054(Context context, C17275[] c17275Arr, int i) {
        Object obj;
        try {
            obj = f29127.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C3432 c3432 = new C3432();
            int length = c17275Arr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    C17275 c17275 = c17275Arr[i2];
                    Uri m40565 = c17275.m40565();
                    ByteBuffer byteBuffer = (ByteBuffer) c3432.getOrDefault(m40565, null);
                    if (byteBuffer == null) {
                        byteBuffer = C0422.m1947(context, m40565);
                        c3432.put(m40565, byteBuffer);
                    }
                    if (byteBuffer == null || !m24533(obj, byteBuffer, c17275.m40564(), c17275.m40567(), c17275.m40566())) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface m24531 = m24531(obj);
                    if (m24531 != null) {
                        return Typeface.create(m24531, i);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24533(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f29124.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m24531(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f29126, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f29125.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
