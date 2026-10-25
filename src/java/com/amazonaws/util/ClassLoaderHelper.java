package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public enum ClassLoaderHelper {
    ;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static URL m753(String str, Class... clsArr) {
        return m752(str, false, clsArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static URL m752(String str, boolean z, Class... clsArr) {
        URL m751;
        if (z) {
            m751 = m758(str, clsArr);
            if (m751 == null) {
                m751 = m751(str);
            }
        } else {
            m751 = m751(str);
            if (m751 == null) {
                m751 = m758(str, clsArr);
            }
        }
        return m751 == null ? ClassLoaderHelper.class.getResource(str) : m751;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static URL m758(String str, Class[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        for (Class cls : clsArr) {
            URL resource = cls.getResource(str);
            if (resource != null) {
                return resource;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static URL m751(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        return contextClassLoader.getResource(str);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Class m759(String str, Class[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        for (Class cls : clsArr) {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                try {
                    return classLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Class m756(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        try {
            return contextClassLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Class m760(String str, Class... clsArr) {
        return m757(str, true, clsArr);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Class m757(String str, boolean z, Class... clsArr) {
        Class m756;
        if (z) {
            m756 = m759(str, clsArr);
            if (m756 == null) {
                m756 = m756(str);
            }
        } else {
            m756 = m756(str);
            if (m756 == null) {
                m756 = m759(str, clsArr);
            }
        }
        return m756 == null ? Class.forName(str) : m756;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InputStream m755(String str, Class... clsArr) {
        return m754(str, false, clsArr);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InputStream m754(String str, boolean z, Class... clsArr) {
        URL m752 = m752(str, z, clsArr);
        if (m752 != null) {
            try {
                return m752.openStream();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
