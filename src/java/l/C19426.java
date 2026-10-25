package l;

import com.alipay.sdk.m.y.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 95VI */
/* renamed from: l.᩵ۧܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19426 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f62834 = 0;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f62835 = true;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static volatile Method f62836;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f62837;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static volatile Class f62838;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile HashMap f62839;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static volatile Constructor f62840;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f62841;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f62842;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f62843;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f62844;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile Method f62845;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static volatile Method f62846;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m44757(Class cls) {
        if (f62838 == null && !f62837) {
            try {
                f62838 = InterfaceC9470.class;
            } catch (Throwable unused) {
                f62837 = true;
            }
        }
        if (f62838 == null) {
            return false;
        }
        return cls.isAnnotationPresent(f62838);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String[] m44752(Class cls) {
        if (f62840 == null && !f62844) {
            try {
                Class<?> cls2 = Class.forName("kotlin.reflect.jvm.internal.KClassImpl");
                f62840 = cls2.getConstructor(Class.class);
                f62846 = cls2.getMethod("getConstructors", null);
                f62836 = InterfaceC6293.class.getMethod("getParameters", null);
                f62845 = InterfaceC11938.class.getMethod("getName", null);
            } catch (Throwable unused) {
                f62844 = true;
            }
        }
        if (f62840 == null || f62843) {
            return null;
        }
        try {
            Iterator it = ((Iterable) f62846.invoke(f62840.newInstance(cls), null)).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) f62836.invoke(next, null);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            List list2 = (List) f62836.invoke(obj, null);
            String[] strArr = new String[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                strArr[i] = (String) f62845.invoke(list2.get(i), null);
            }
            return strArr;
        } catch (Throwable unused2) {
            f62843 = true;
            return null;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Byte m44759(Object obj) {
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to byte, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Short m44746(Object obj) {
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to short, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final BigDecimal m44738(Object obj) {
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2)) {
            return null;
        }
        return new BigDecimal(obj2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final BigInteger m44751(Object obj) {
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2)) {
            return null;
        }
        return new BigInteger(obj2);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Float m44763(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to float, value : "));
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(obj2));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Double m44753(Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to double, value : "));
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2) || "NULL".equals(obj2)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(obj2));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Date m44758(Object obj) {
        long j;
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int scale = bigDecimal.scale();
            j = (scale < -100 || scale > 100) ? bigDecimal.longValueExact() : bigDecimal.longValue();
        } else if (obj instanceof Number) {
            j = ((Number) obj).longValue();
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (str.indexOf(45) != -1) {
                int length = str.length();
                String str2 = AbstractC5206.f16310;
                if (length != str2.length()) {
                    str2 = str.length() == 10 ? "yyyy-MM-dd" : str.length() == 19 ? "yyyy-MM-dd HH:mm:ss" : (str.length() == 29 && str.charAt(26) == ':' && str.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : "yyyy-MM-dd HH:mm:ss.SSS";
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, AbstractC5206.f16309);
                simpleDateFormat.setTimeZone(AbstractC5206.f16308);
                try {
                    return simpleDateFormat.parse(str);
                } catch (ParseException unused) {
                    throw new C15082("can not cast to Date, value : ".concat(str));
                }
            }
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            j = Long.parseLong(str);
        } else {
            j = -1;
        }
        if (j >= 0) {
            return new Date(j);
        }
        throw new C15082(C5368.m15337(obj, "can not cast to Date, value : "));
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Long m44762(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int scale = bigDecimal.scale();
            return (scale < -100 || scale > 100) ? Long.valueOf(bigDecimal.longValueExact()) : Long.valueOf(bigDecimal.longValue());
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                C7322 c7322 = new C7322(str);
                Calendar calendar = c7322.m19643(false) ? c7322.f22494 : null;
                c7322.m19640();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        throw new C15082(C5368.m15337(obj, "can not cast to long, value : "));
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Integer m44745(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int scale = bigDecimal.scale();
            return (scale < -100 || scale > 100) ? Integer.valueOf(bigDecimal.intValueExact()) : Integer.valueOf(bigDecimal.intValue());
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to int, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Boolean m44754(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof BigDecimal) {
            return Boolean.valueOf(((BigDecimal) obj).intValueExact() == 1);
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new C15082(C5368.m15337(obj, "can not cast to int, value : "));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m44735(Map map, Class cls, C23389 c23389) {
        return m44732((Object) map, cls, c23389);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m44732(Object obj, Class cls, C23389 c23389) {
        Calendar calendar;
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            throw new IllegalArgumentException("clazz is null");
        }
        if (cls != obj.getClass()) {
            if (!(obj instanceof Map)) {
                int i = 0;
                if (cls.isArray()) {
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        Object newInstance = Array.newInstance(cls.getComponentType(), collection.size());
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            Array.set(newInstance, i, m44732(it.next(), (Class) cls.getComponentType(), c23389));
                            i++;
                        }
                        return newInstance;
                    }
                    if (cls == byte[].class) {
                        if (obj instanceof byte[]) {
                            return (byte[]) obj;
                        }
                        if (!(obj instanceof String)) {
                            throw new C15082(C5368.m15337(obj, "can not cast to int, value : "));
                        }
                        String str = (String) obj;
                        return C7322.m19609(0, str.length(), str);
                    }
                }
                if (!cls.isAssignableFrom(obj.getClass())) {
                    if (cls == Boolean.TYPE || cls == Boolean.class) {
                        return m44754(obj);
                    }
                    if (cls == Byte.TYPE || cls == Byte.class) {
                        return m44759(obj);
                    }
                    if ((cls == Character.TYPE || cls == Character.class) && (obj instanceof String)) {
                        String str2 = (String) obj;
                        if (str2.length() == 1) {
                            return Character.valueOf(str2.charAt(0));
                        }
                    }
                    if (cls == Short.TYPE || cls == Short.class) {
                        return m44746(obj);
                    }
                    if (cls == Integer.TYPE || cls == Integer.class) {
                        return m44745(obj);
                    }
                    if (cls == Long.TYPE || cls == Long.class) {
                        return m44762(obj);
                    }
                    if (cls == Float.TYPE || cls == Float.class) {
                        return m44763(obj);
                    }
                    if (cls == Double.TYPE || cls == Double.class) {
                        return m44753(obj);
                    }
                    if (cls == String.class) {
                        return obj.toString();
                    }
                    if (cls == BigDecimal.class) {
                        return m44738(obj);
                    }
                    if (cls == BigInteger.class) {
                        return m44751(obj);
                    }
                    if (cls == Date.class) {
                        return m44758(obj);
                    }
                    if (cls.isEnum()) {
                        try {
                            if (obj instanceof String) {
                                String str3 = (String) obj;
                                if (str3.length() == 0) {
                                    return null;
                                }
                                return Enum.valueOf(cls, str3);
                            }
                            if ((obj instanceof Integer) || (obj instanceof Long)) {
                                int intValue = ((Number) obj).intValue();
                                Object[] enumConstants = cls.getEnumConstants();
                                if (intValue < enumConstants.length) {
                                    return enumConstants[intValue];
                                }
                            }
                            throw new C15082("can not cast to : ".concat(cls.getName()));
                        } catch (Exception e) {
                            throw new C15082("can not cast to : ".concat(cls.getName()), (Throwable) e);
                        }
                    }
                    if (Calendar.class.isAssignableFrom(cls)) {
                        Date m44758 = m44758(obj);
                        if (cls == Calendar.class) {
                            calendar = Calendar.getInstance(AbstractC5206.f16308, AbstractC5206.f16309);
                        } else {
                            try {
                                calendar = (Calendar) cls.newInstance();
                            } catch (Exception e2) {
                                throw new C15082("can not cast to : ".concat(cls.getName()), (Throwable) e2);
                            }
                        }
                        calendar.setTime(m44758);
                        return calendar;
                    }
                    if (obj instanceof String) {
                        String str4 = (String) obj;
                        if (str4.length() == 0 || "null".equals(str4)) {
                            return null;
                        }
                        if (cls == Currency.class) {
                            return Currency.getInstance(str4);
                        }
                    }
                    throw new C15082("can not cast to : ".concat(cls.getName()));
                }
            } else if (cls != Map.class) {
                Map map = (Map) obj;
                if (cls != Object.class || map.containsKey("@type")) {
                    return m44748(map, cls, c23389);
                }
            }
        }
        return obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m44734(Object obj, Type type, C23389 c23389) {
        if (obj == null) {
            return null;
        }
        if (type instanceof Class) {
            return m44732(obj, (Class) type, c23389);
        }
        if (type instanceof ParameterizedType) {
            return m44733(obj, (ParameterizedType) type, c23389);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        throw new C15082("can not cast to : " + type);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m44733(Object obj, ParameterizedType parameterizedType, C23389 c23389) {
        Object m44734;
        Collection hashSet;
        Object m447342;
        if (obj == null) {
            return obj;
        }
        Type rawType = parameterizedType.getRawType();
        if (rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    if (type instanceof Class) {
                        if (obj2 != null && obj2.getClass() == C21434.class) {
                            m44734 = ((C21434) obj2).m48548((Class) type, c23389);
                        } else {
                            m44734 = m44732(obj2, (Class) type, c23389);
                        }
                    } else {
                        m44734 = m44734(obj2, type, c23389);
                    }
                    arrayList.add(m44734);
                }
                return arrayList;
            }
        }
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == List.class || rawType == ArrayList.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                if (rawType != Set.class && rawType != HashSet.class) {
                    if (rawType == TreeSet.class) {
                        hashSet = new TreeSet();
                    } else {
                        hashSet = new ArrayList();
                    }
                } else {
                    hashSet = new HashSet();
                }
                for (Object obj3 : (Iterable) obj) {
                    if (type2 instanceof Class) {
                        if (obj3 != null && obj3.getClass() == C21434.class) {
                            m447342 = ((C21434) obj3).m48548((Class) type2, c23389);
                        } else {
                            m447342 = m44732(obj3, (Class) type2, c23389);
                        }
                    } else {
                        m447342 = m44734(obj3, type2, c23389);
                    }
                    hashSet.add(m447342);
                }
                return hashSet;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    hashMap.put(m44734(entry.getKey(), type3, c23389), m44734(entry.getValue(), type4, c23389));
                }
                return hashMap;
            }
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return m44734(obj, rawType, c23389);
        }
        throw new C15082("can not cast to : " + parameterizedType);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object m44748(Map map, Class cls, C23389 c23389) {
        C21434 c21434;
        int i = 0;
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get("className");
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                if (number != null) {
                    if (number instanceof BigDecimal) {
                        i = ((BigDecimal) number).intValueExact();
                    } else {
                        i = number.intValue();
                    }
                }
                return new StackTraceElement(str, str2, str3, i);
            }
            Object obj = map.get("@type");
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (c23389 == null) {
                    c23389 = C23389.f75137;
                }
                Class m51836 = c23389.m51836(str4, 0, null);
                if (m51836 == null) {
                    throw new ClassNotFoundException(str4.concat(" not found"));
                }
                if (!m51836.equals(cls)) {
                    return m44748(map, m51836, c23389);
                }
            }
            if (cls.isInterface()) {
                if (map instanceof C21434) {
                    c21434 = (C21434) map;
                } else {
                    c21434 = new C21434(map);
                }
                if (c23389 == null) {
                    c23389 = C23389.f75137;
                }
                if (c23389.m51838((Type) cls) == null) {
                    return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, c21434);
                }
                C11556 c11556 = new C11556(AbstractC5206.m14985(c21434), C23389.f75137, AbstractC5206.f16312);
                Object m28435 = c11556.m28435((String) null, cls);
                c11556.m28450();
                c11556.close();
                return m28435;
            }
            if (cls == String.class && (map instanceof C21434)) {
                return map.toString();
            }
            if (c23389 == null) {
                c23389 = C23389.f75137;
            }
            InterfaceC19157 m51838 = c23389.m51838((Type) cls);
            C1517 c1517 = m51838 instanceof C1517 ? (C1517) m51838 : null;
            if (c1517 == null) {
                throw new C15082("can not get javaBeanDeserializer");
            }
            return c1517.m5202(map, c23389);
        } catch (Exception e) {
            throw new C15082(e.getMessage(), (Throwable) e);
        }
    }

    static {
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942(36, 0.75f, 1);
        f62841 = concurrentMapC10942;
        concurrentMapC10942.put(ClassTransform.BYTE, Byte.TYPE);
        concurrentMapC10942.put(ClassTransform.SHORT, Short.TYPE);
        concurrentMapC10942.put(ClassTransform.INTEGER, Integer.TYPE);
        concurrentMapC10942.put(ClassTransform.LONG, Long.TYPE);
        concurrentMapC10942.put(ClassTransform.FLOAT, Float.TYPE);
        concurrentMapC10942.put(ClassTransform.DOUBLE, Double.TYPE);
        concurrentMapC10942.put(ClassTransform.BOOLEAN, Boolean.TYPE);
        concurrentMapC10942.put(ClassTransform.CHARACTER, Character.TYPE);
        concurrentMapC10942.put("[byte", byte[].class);
        concurrentMapC10942.put("[short", short[].class);
        concurrentMapC10942.put("[int", int[].class);
        concurrentMapC10942.put("[long", long[].class);
        concurrentMapC10942.put("[float", float[].class);
        concurrentMapC10942.put("[double", double[].class);
        concurrentMapC10942.put("[boolean", boolean[].class);
        concurrentMapC10942.put("[char", char[].class);
        concurrentMapC10942.put("[B", byte[].class);
        concurrentMapC10942.put("[S", short[].class);
        concurrentMapC10942.put("[I", int[].class);
        concurrentMapC10942.put("[J", long[].class);
        concurrentMapC10942.put("[F", float[].class);
        concurrentMapC10942.put("[D", double[].class);
        concurrentMapC10942.put("[C", char[].class);
        concurrentMapC10942.put("[Z", boolean[].class);
        concurrentMapC10942.put("java.util.HashMap", HashMap.class);
        concurrentMapC10942.put("java.util.TreeMap", TreeMap.class);
        concurrentMapC10942.put("java.util.Date", Date.class);
        concurrentMapC10942.put("com.alibaba.fastjson.JSONObject", C21434.class);
        concurrentMapC10942.put("java.util.concurrent.ConcurrentHashMap", ConcurrentMapC10942.class);
        concurrentMapC10942.put("java.text.SimpleDateFormat", SimpleDateFormat.class);
        concurrentMapC10942.put("java.lang.StackTraceElement", StackTraceElement.class);
        concurrentMapC10942.put("java.lang.RuntimeException", RuntimeException.class);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Class m44755(String str) {
        return (Class) f62841.get(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Class m44760(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() >= 256) {
            throw new C15082("className too long. ".concat(str));
        }
        ConcurrentMapC10942 concurrentMapC10942 = f62841;
        Class<?> cls = (Class) concurrentMapC10942.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.charAt(0) == '[') {
            Class m44760 = m44760(str.substring(1));
            if (m44760 == null) {
                return null;
            }
            return Array.newInstance((Class<?>) m44760, 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(l.b)) {
            return m44760(str.substring(1, str.length() - 1));
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
        } catch (Exception unused) {
        }
        try {
            cls = Class.forName(str);
            concurrentMapC10942.put(str, cls);
            return cls;
        } catch (Exception unused2) {
            return cls;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x015d A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161 A[ADDED_TO_REGION] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m44739(java.lang.Class r39, int r40, l.InterfaceC12261 r41, boolean r42, l.EnumC4500 r43) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19426.m44739(java.lang.Class, int, l.۫۟ۡ, boolean, l.ۙ۟ۡ):java.util.ArrayList");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC12966 m44740(Method method, Class cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Method method2 : cls2.getMethods()) {
                if (method2.getName().equals(method.getName())) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes.length != parameterTypes2.length) {
                        continue;
                    } else {
                        int i = 0;
                        while (true) {
                            if (i < parameterTypes.length) {
                                if (!parameterTypes[i].equals(parameterTypes2[i])) {
                                    break;
                                }
                                i++;
                            } else {
                                InterfaceC12966 interfaceC12966 = (InterfaceC12966) method2.getAnnotation(InterfaceC12966.class);
                                if (interfaceC12966 != null) {
                                    return interfaceC12966;
                                }
                            }
                        }
                    }
                }
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || !Modifier.isAbstract(superclass.getModifiers())) {
            return null;
        }
        Class<?>[] parameterTypes3 = method.getParameterTypes();
        for (Method method3 : superclass.getMethods()) {
            Class<?>[] parameterTypes4 = method3.getParameterTypes();
            if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                int i2 = 0;
                while (true) {
                    if (i2 < parameterTypes3.length) {
                        if (!parameterTypes4[i2].equals(parameterTypes3[i2])) {
                            break;
                        }
                        i2++;
                    } else {
                        InterfaceC12966 interfaceC129662 = (InterfaceC12966) method3.getAnnotation(InterfaceC12966.class);
                        if (interfaceC129662 != null) {
                            return interfaceC129662;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44743(Class cls, InterfaceC12261 interfaceC12261, String str) {
        if (interfaceC12261 != null && interfaceC12261.ignores() != null) {
            for (String str2 : interfaceC12261.ignores()) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        Class superclass = cls.getSuperclass();
        return (superclass == Object.class || superclass == null || !m44743(superclass, (InterfaceC12261) superclass.getAnnotation(InterfaceC12261.class), str)) ? false : true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m44761(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        return (type instanceof Class) && (genericSuperclass = ((Class) type).getGenericSuperclass()) != Object.class && m44761(genericSuperclass);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Type m44756(Type type) {
        return type instanceof Class ? m44756(((Class) type).getGenericSuperclass()) : type;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class m44730(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m44730(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            return (Class) ((TypeVariable) type).getBounds()[0];
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m44730(upperBounds[0]);
            }
            return Object.class;
        }
        return Object.class;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44736(String str) {
        if (str == null || str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44742(Class cls, Member member, int i) {
        if (member == 0 || !f62835) {
            return;
        }
        Class superclass = cls.getSuperclass();
        if ((superclass != null && superclass != Object.class) || (member.getModifiers() & 1) == 0 || (i & 1) == 0) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (AccessControlException unused) {
                f62835 = false;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Field m44737(Class cls, String str, Field[] fieldArr, HashMap hashMap) {
        Field m44749 = m44749(cls, str, fieldArr, hashMap);
        if (m44749 == null) {
            m44749 = m44749(cls, C20094.m46315("_", str), fieldArr, hashMap);
        }
        if (m44749 == null) {
            m44749 = m44749(cls, C20094.m46315("m_", str), fieldArr, hashMap);
        }
        if (m44749 != null) {
            return m44749;
        }
        return m44749(cls, "m" + str.substring(0, 1).toUpperCase() + str.substring(1), fieldArr, hashMap);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Field m44749(Class cls, String str, Field[] fieldArr, HashMap hashMap) {
        char charAt;
        char charAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name) || (str.length() > 2 && (charAt = str.charAt(0)) >= 'a' && charAt <= 'z' && (charAt2 = str.charAt(1)) >= 'A' && charAt2 <= 'Z' && str.equalsIgnoreCase(name))) {
                return field;
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        Field[] fieldArr2 = (Field[]) hashMap.get(superclass);
        if (fieldArr2 == null) {
            fieldArr2 = superclass.getDeclaredFields();
            hashMap.put(superclass, fieldArr2);
        }
        return m44737(superclass, str, fieldArr2, hashMap);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Type m44750(Type type) {
        Type type2;
        if (type instanceof ParameterizedType) {
            type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                if (upperBounds.length == 1) {
                    type2 = upperBounds[0];
                }
            }
        } else {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (!cls.getName().startsWith("java.")) {
                    type2 = m44750(cls.getGenericSuperclass());
                }
            }
            type2 = null;
        }
        return type2 == null ? Object.class : type2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m44731(Class cls) {
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        return cls == Character.TYPE ? '0' : null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44744(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < typeArr.length; i++) {
            Type type = typeArr[i];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (m44744(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i] = new C18720(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
                    z = true;
                }
            } else if (type instanceof TypeVariable) {
                for (int i2 = 0; i2 < typeVariableArr.length; i2++) {
                    if (type.equals(typeVariableArr[i2])) {
                        typeArr[i] = typeArr2[i2];
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m44747(String str) {
        if (str == null) {
            return 0L;
        }
        long j = -3750763034362895579L;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '_' && charAt != '-') {
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                }
                j = (j ^ charAt) * 1099511628211L;
            }
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44741(Class cls, String str) {
        f62841.put(str, cls);
    }
}
