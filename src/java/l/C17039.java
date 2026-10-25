package l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: KAVD */
/* renamed from: l.ܿ֫ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17039 implements InterfaceC19157 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17039 f52222 = new C17039();

    @Override // l.InterfaceC19157
    /* renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        C7322 c7322 = c11556.f34488;
        if (type != C21434.class) {
            if (c7322.f22491 == 8) {
                c7322.m19641(16);
                return null;
            }
            Map m40001 = m40001(type);
            C14216 c14216 = c11556.f34496;
            try {
                c11556.m28437(c14216, m40001, obj);
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type type2 = parameterizedType.getActualTypeArguments()[0];
                    Type type3 = parameterizedType.getActualTypeArguments()[1];
                    if (String.class == type2) {
                        return m40002(c11556, obj, type3, m40001);
                    }
                    return m40000(c11556, m40001, type2, type3);
                }
                return c11556.m28446(m40001, obj);
            } finally {
                c11556.m28444(c14216);
            }
        }
        return (C21434) c11556.m28446((c7322.f22495 & EnumC13671.OrderedField.f40811) != 0 ? new C21434(new LinkedHashMap()) : new C21434(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x011f, code lost:
    
        return r14;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map m40002(l.C11556 r11, java.lang.Object r12, java.lang.reflect.Type r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17039.m40002(l.ۨ۟ۡ, java.lang.Object, java.lang.reflect.Type, java.util.Map):java.util.Map");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m40000(C11556 c11556, Map map, Type type, Type type2) {
        Object obj;
        C7322 c7322 = c11556.f34488;
        C23389 c23389 = c11556.f34495;
        int i = c7322.f22491;
        if (i != 12 && i != 16) {
            throw new C15082("syntax error, expect {, actual ".concat(C19993.m46101(i)));
        }
        InterfaceC19157 m51838 = c23389.m51838(type);
        InterfaceC19157 m518382 = c23389.m51838(type2);
        c7322.m19638();
        C14216 c14216 = c11556.f34496;
        while (true) {
            try {
                int i2 = c7322.f22491;
                if (i2 == 13) {
                    c7322.m19641(16);
                    return map;
                }
                if (i2 == 4 && c7322.f22501 == 4 && c7322.f22489.startsWith("$ref", c7322.f22487 + 1) && !c7322.m19624(EnumC13671.DisableSpecialKeyDetect)) {
                    c7322.m19635();
                    if (c7322.f22491 != 4) {
                        throw new C15082("illegal ref, " + C19993.m46101(i2));
                    }
                    String m19634 = c7322.m19634();
                    if ("..".equals(m19634)) {
                        obj = c14216.f42886.f42885;
                    } else if ("$".equals(m19634)) {
                        C14216 c142162 = c14216;
                        while (true) {
                            C14216 c142163 = c142162.f42886;
                            if (c142163 == null) {
                                break;
                            }
                            c142162 = c142163;
                        }
                        obj = c142162.f42885;
                    } else {
                        c11556.m28443(new C5911(c14216, m19634));
                        c11556.f34490 = 1;
                        obj = null;
                    }
                    c7322.m19641(13);
                    if (c7322.f22491 != 13) {
                        throw new C15082("illegal ref");
                    }
                    c7322.m19641(16);
                    return obj;
                }
                if (map.size() == 0 && i2 == 4 && "@type".equals(c7322.m19634()) && !c7322.m19624(EnumC13671.DisableSpecialKeyDetect)) {
                    c7322.m19635();
                    c7322.m19641(16);
                    if (c7322.f22491 == 13) {
                        c7322.m19638();
                        return map;
                    }
                    c7322.m19638();
                }
                Object mo5204 = m51838.mo5204(c11556, type, null);
                if (c7322.f22491 != 17) {
                    throw new C15082("syntax error, expect :, actual " + c7322.f22491);
                }
                c7322.m19638();
                Object mo52042 = m518382.mo5204(c11556, type2, mo5204);
                if (c11556.f34490 == 1) {
                    c11556.m28442(map, mo5204);
                }
                map.put(mo5204, mo52042);
                if (c7322.f22491 == 16) {
                    c7322.m19638();
                }
            } finally {
                c11556.m28444(c14216);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map m40001(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentMapC10942.class) {
            return new ConcurrentMapC10942();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type == C21434.class) {
            return new C21434();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            if (EnumMap.class.equals(rawType)) {
                return new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]);
            }
            return m40001(rawType);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new C15082("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new C15082("unsupport type " + type, (Throwable) e);
        }
    }
}
