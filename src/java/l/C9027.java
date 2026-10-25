package l;

import java.util.ArrayList;

/* compiled from: WAJD */
/* renamed from: l.ۡܿܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9027 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22911 m23275(C22453 c22453, C16081 c16081) {
        C5978 m5000;
        C12512 m50378 = c22453.m50378();
        C13985 m50383 = c22453.m50383();
        C22911 m23274 = m23274(m50383);
        C3197 c3197 = (C3197) m50383.m33465("EnclosingMethod");
        C5978 c5978 = null;
        if (c3197 == null) {
            m5000 = null;
        } else {
            C12512 m9829 = c3197.m9829();
            C20274 m9830 = c3197.m9830();
            if (m9830 == null) {
                m5000 = C1453.m4996(m9829);
            } else {
                m5000 = C1453.m5000(new C22390(m9829, m9830));
            }
        }
        try {
            C22911 m23273 = m23273(m50378, m50383, m5000 == null);
            if (m23273 != null) {
                C22911 c22911 = new C22911();
                c22911.m50996(m23274);
                c22911.m50996(m23273);
                c22911.mo20349();
                m23274 = c22911;
            }
        } catch (C1307 e) {
            c16081.f49566.println("warning: " + e.getMessage());
        }
        if (m5000 != null) {
            m23274 = C22911.m50994(m23274, m5000);
        }
        if ((c22453.m50376() & 8192) == 0) {
            return m23274;
        }
        C12512 m503782 = c22453.m50378();
        C18199 m50382 = c22453.m50382();
        int size = m50382.size();
        C5978 c59782 = new C5978(m503782, EnumC11623.EMBEDDED);
        boolean z = false;
        for (int i = 0; i < size; i++) {
            InterfaceC11870 m40998get = m50382.m40998get(i);
            C15190 c15190 = (C15190) m40998get.getAttributes().m33465("AnnotationDefault");
            if (c15190 != null) {
                c59782.m16776(new C7389(m40998get.mo10264().getName(), c15190.m35922()));
                z = true;
            }
        }
        if (z) {
            c59782.mo20349();
            c5978 = C1453.m4995(c59782);
        }
        return c5978 != null ? C22911.m50994(m23274, c5978) : m23274;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22911 m23274(C13985 c13985) {
        C22911 c22911;
        C7430 c7430 = (C7430) c13985.m33465("RuntimeVisibleAnnotations");
        C22952 c22952 = (C22952) c13985.m33465("RuntimeInvisibleAnnotations");
        if (c7430 == null) {
            if (c22952 == null) {
                c22911 = C22911.f73848;
            } else {
                c22911 = c22952.m34939();
            }
        } else if (c22952 == null) {
            c22911 = c7430.m34939();
        } else {
            C22911 m34939 = c7430.m34939();
            C22911 m349392 = c22952.m34939();
            C22911 c229112 = new C22911();
            c229112.m50996(m34939);
            c229112.m50996(m349392);
            c229112.mo20349();
            c22911 = c229112;
        }
        C11123 c11123 = (C11123) c13985.m33465("Signature");
        C5978 m4997 = c11123 == null ? null : C1453.m4997(c11123.m27603());
        C16766 c16766 = (C16766) c13985.m33465("SourceDebugExtension");
        C5978 m5003 = c16766 != null ? C1453.m5003(c16766.m39445()) : null;
        if (m4997 != null) {
            c22911 = C22911.m50994(c22911, m4997);
        }
        return m5003 != null ? C22911.m50994(c22911, m5003) : c22911;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22911 m23273(C12512 c12512, C13985 c13985, boolean z) {
        C12369 c12369 = (C12369) c13985.m33465("InnerClasses");
        if (c12369 != null) {
            C9006 m30084 = c12369.m30084();
            int size = m30084.size();
            ArrayList arrayList = new ArrayList();
            C9712 c9712 = null;
            for (int i = 0; i < size; i++) {
                C9712 m40996get = m30084.m40996get(i);
                C12512 m24682 = m40996get.m24682();
                if (m24682.equals(c12512)) {
                    c9712 = m40996get;
                } else if (c12512.equals(m40996get.m24684())) {
                    arrayList.add(m24682.m30696());
                }
            }
            int size2 = arrayList.size();
            if (c9712 != null || size2 != 0) {
                C22911 c22911 = new C22911();
                if (c9712 != null) {
                    c22911.m50995(C1453.m4998(c9712.m24683(), c9712.m24681()));
                    if (z) {
                        if (c9712.m24684() == null) {
                            throw new C1307("Ignoring InnerClasses attribute for an anonymous inner class\n(" + c12512.mo2463() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                        }
                        c22911.m50995(C1453.m4996(c9712.m24684()));
                    }
                }
                if (size2 != 0) {
                    C13922 c13922 = new C13922(size2);
                    for (int i2 = 0; i2 < size2; i2++) {
                        c13922.m40983(i2, (C7573) arrayList.get(i2));
                    }
                    c13922.mo20349();
                    c22911.m50995(C1453.m4999(c13922));
                }
                c22911.mo20349();
                return c22911;
            }
        }
        return null;
    }
}
