package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: L541 */
/* renamed from: l.᩷۬, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20885 extends C19474 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Method f67579;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f67580;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Class f67581;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f67582;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Constructor f67583;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47717() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f67582) {
            return;
        }
        f67582 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f67583 = constructor;
        f67581 = cls;
        f67579 = method2;
        f67580 = method;
    }

    @Override // l.C19474
    /* renamed from: ֫ */
    public Typeface mo8053(Context context, C9308 c9308, Resources resources, int i) {
        m47717();
        try {
            Object newInstance = f67583.newInstance(null);
            for (C8602 c8602 : c9308.m23893()) {
                File m1946 = C0422.m1946(context);
                if (m1946 == null) {
                    return null;
                }
                try {
                    if (!C0422.m1949(m1946, resources, c8602.m22349())) {
                        return null;
                    }
                    if (!m47718(newInstance, m1946.getPath(), c8602.m22352(), c8602.m22350())) {
                        return null;
                    }
                    m1946.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    m1946.delete();
                }
            }
            m47717();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f67581, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f67580.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47718(Object obj, String str, int i, boolean z) {
        m47717();
        try {
            return ((Boolean) f67579.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.C19474
    /* renamed from: ֫ */
    public Typeface mo8054(Context context, C17275[] c17275Arr, int i) {
        File file;
        String readlink;
        if (c17275Arr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo8055(i, c17275Arr).m40565(), "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } catch (ErrnoException unused) {
                        }
                        try {
                            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                                file = new File(readlink);
                                if (file != null && file.canRead()) {
                                    Typeface createFromFile = Typeface.createFromFile(file);
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                                Typeface mo8052 = mo8052(context, fileInputStream);
                                fileInputStream.close();
                                openFileDescriptor.close();
                                return mo8052;
                            }
                            Typeface mo80522 = mo8052(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return mo80522;
                        } finally {
                        }
                        file = null;
                        if (file != null) {
                            Typeface createFromFile2 = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile2;
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    } finally {
                    }
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
