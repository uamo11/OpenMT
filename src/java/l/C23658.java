package l;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractSequentialList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: TAVS */
/* renamed from: l.᩻ۧܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23658 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C23658 f76648 = new C23658();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3903 f76649;

    public C23658() {
        C3903 c3903 = new C3903();
        this.f76649 = c3903;
        c3903.m11901(C21274.f68621, Boolean.class);
        C7162 c7162 = C7162.f21961;
        c3903.m11901(c7162, Character.class);
        C12101 c12101 = C12101.f36173;
        c3903.m11901(c12101, Byte.class);
        c3903.m11901(c12101, Short.class);
        c3903.m11901(c12101, Integer.class);
        c3903.m11901(c12101, Long.class);
        C10959 c10959 = C10959.f32992;
        c3903.m11901(c10959, Float.class);
        c3903.m11901(c10959, Double.class);
        c3903.m11901(c10959, Number.class);
        C14922 c14922 = C14922.f45499;
        c3903.m11901(c14922, BigDecimal.class);
        c3903.m11901(c14922, BigInteger.class);
        c3903.m11901(C9548.f28964, String.class);
        c3903.m11901(C5045.f15871, Object[].class);
        c3903.m11901(c7162, Class.class);
        c3903.m11901(c7162, SimpleDateFormat.class);
        c3903.m11901(c7162, Locale.class);
        c3903.m11901(c7162, Currency.class);
        c3903.m11901(c7162, TimeZone.class);
        c3903.m11901(c7162, UUID.class);
        c3903.m11901(c7162, URI.class);
        c3903.m11901(c7162, URL.class);
        c3903.m11901(c7162, Pattern.class);
        c3903.m11901(c7162, Charset.class);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16602 m52187(Class cls) {
        Class superclass;
        boolean z;
        C3903 c3903 = this.f76649;
        InterfaceC16602 interfaceC16602 = (InterfaceC16602) c3903.m11900(cls);
        if (interfaceC16602 == null) {
            if (Map.class.isAssignableFrom(cls)) {
                C13511 c13511 = new C13511();
                c3903.m11901(c13511, cls);
                interfaceC16602 = c13511;
            } else {
                boolean isAssignableFrom = AbstractSequentialList.class.isAssignableFrom(cls);
                InterfaceC16602 interfaceC166022 = C21979.f70383;
                if (isAssignableFrom) {
                    c3903.m11901(interfaceC166022, cls);
                } else if (List.class.isAssignableFrom(cls)) {
                    C22684 c22684 = new C22684();
                    c3903.m11901(c22684, cls);
                    interfaceC16602 = c22684;
                } else if (Collection.class.isAssignableFrom(cls)) {
                    c3903.m11901(interfaceC166022, cls);
                } else if (Date.class.isAssignableFrom(cls)) {
                    C19863 c19863 = C19863.f64142;
                    c3903.m11901(c19863, cls);
                    interfaceC16602 = c19863;
                } else {
                    boolean isAssignableFrom2 = InterfaceC8028.class.isAssignableFrom(cls);
                    interfaceC166022 = C7162.f21961;
                    if (isAssignableFrom2) {
                        c3903.m11901(interfaceC166022, cls);
                    } else if (InterfaceC9985.class.isAssignableFrom(cls)) {
                        c3903.m11901(interfaceC166022, cls);
                    } else if (InterfaceC22139.class.isAssignableFrom(cls)) {
                        c3903.m11901(interfaceC166022, cls);
                    } else if (cls.isEnum() || ((superclass = cls.getSuperclass()) != null && superclass != Object.class && superclass.isEnum())) {
                        C4340 c4340 = new C4340();
                        c3903.m11901(c4340, cls);
                        interfaceC16602 = c4340;
                    } else if (cls.isArray()) {
                        Class<?> componentType = cls.getComponentType();
                        C0811 c0811 = new C0811(componentType, m52187(componentType));
                        c3903.m11901(c0811, cls);
                        interfaceC16602 = c0811;
                    } else if (Throwable.class.isAssignableFrom(cls)) {
                        C11396 c11396 = new C11396(cls);
                        c11396.f34092 |= EnumC20837.WriteClassName.f67472;
                        c3903.m11901(c11396, cls);
                        interfaceC16602 = c11396;
                    } else if (TimeZone.class.isAssignableFrom(cls)) {
                        c3903.m11901(interfaceC166022, cls);
                    } else if (Charset.class.isAssignableFrom(cls)) {
                        c3903.m11901(interfaceC166022, cls);
                    } else if (Enumeration.class.isAssignableFrom(cls)) {
                        c3903.m11901(interfaceC166022, cls);
                    } else if (Calendar.class.isAssignableFrom(cls)) {
                        C19863 c198632 = C19863.f64142;
                        c3903.m11901(c198632, cls);
                        interfaceC16602 = c198632;
                    } else {
                        boolean z2 = false;
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            z = true;
                            if (cls2.getName().equals("net.sf.cglib.proxy.Factory") || cls2.getName().equals("org.springframework.cglib.proxy.Factory")) {
                                z2 = true;
                                break;
                            }
                            if (cls2.getName().equals("javassist.util.proxy.ProxyObject")) {
                                break;
                            }
                        }
                        z = false;
                        if (z2 || z) {
                            InterfaceC16602 m52187 = m52187(cls.getSuperclass());
                            c3903.m11901(m52187, cls);
                            return m52187;
                        }
                        if (!cls.getName().startsWith("android.net.Uri$")) {
                            interfaceC166022 = new C11396(cls);
                        }
                        c3903.m11901(interfaceC166022, cls);
                    }
                }
                interfaceC16602 = interfaceC166022;
            }
            if (interfaceC16602 == null) {
                return (InterfaceC16602) c3903.m11900(cls);
            }
        }
        return interfaceC16602;
    }
}
