package org.json.alipay;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l.C15472;

/* compiled from: N673 */
/* loaded from: classes2.dex */
public class b {
    public static final Object a = new a();
    public Map b;

    /* compiled from: N673 */
    public final class a {
        public a() {
        }

        public final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public String toString() {
            return "null";
        }
    }

    public b() {
        this.b = new HashMap();
    }

    public b(String str) {
        this(new c(str));
    }

    public b(Map map) {
        this.b = map == null ? new HashMap() : map;
    }

    public b(c cVar) {
        this();
        if (cVar.c() != '{') {
            throw cVar.a("A JSONObject text must begin with '{'");
        }
        while (true) {
            char c = cVar.c();
            if (c == 0) {
                throw cVar.a("A JSONObject text must end with '}'");
            }
            if (c == '}') {
                return;
            }
            cVar.a();
            String obj = cVar.d().toString();
            char c2 = cVar.c();
            if (c2 == '=') {
                if (cVar.b() != '>') {
                    cVar.a();
                }
            } else if (c2 != ':') {
                throw cVar.a("Expected a ':' after a key");
            }
            a(obj, cVar.d());
            char c3 = cVar.c();
            if (c3 != ',' && c3 != ';') {
                if (c3 != '}') {
                    throw cVar.a("Expected a ',' or '}'");
                }
                return;
            } else if (cVar.c() == '}') {
                return;
            } else {
                cVar.a();
            }
        }
    }

    public static String a(Number number) {
        if (number == null) {
            throw new JSONException("Null pointer");
        }
        a((Object) number);
        String obj = number.toString();
        if (obj.indexOf(46) <= 0 || obj.indexOf(101) >= 0 || obj.indexOf(69) >= 0) {
            return obj;
        }
        while (obj.endsWith("0")) {
            obj = C15472.m36561(1, 0, obj);
        }
        return obj.endsWith(".") ? C15472.m36561(1, 0, obj) : obj;
    }

    public static void a(Object obj) {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (d.isInfinite() || d.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
                return;
            }
            if (obj instanceof Float) {
                Float f = (Float) obj;
                if (f.isInfinite() || f.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    public static String b(Object obj) {
        return (obj == null || obj.equals(null)) ? "null" : obj instanceof Number ? a((Number) obj) : ((obj instanceof Boolean) || (obj instanceof b) || (obj instanceof org.json.alipay.a)) ? obj.toString() : obj instanceof Map ? new b((Map) obj).toString() : obj instanceof Collection ? new org.json.alipay.a((Collection) obj).toString() : obj.getClass().isArray() ? new org.json.alipay.a(obj).toString() : d(obj.toString());
    }

    public Object a(String str) {
        Object c = c(str);
        if (c != null) {
            return c;
        }
        throw new JSONException("JSONObject[" + d(str) + "] not found.");
    }

    public Iterator a() {
        return this.b.keySet().iterator();
    }

    public b a(String str, Object obj) {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        if (obj == null) {
            e(str);
            return this;
        }
        a(obj);
        this.b.put(str, obj);
        return this;
    }

    public boolean b(String str) {
        return this.b.containsKey(str);
    }

    public Object c(String str) {
        if (str == null) {
            return null;
        }
        return this.b.get(str);
    }

    public Object e(String str) {
        return this.b.remove(str);
    }

    public String toString() {
        try {
            Iterator a2 = a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (a2.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = a2.next();
                stringBuffer.append(d(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(b(this.b.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if (r4 == '<') goto L35;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0034. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(java.lang.String r8) {
        /*
            if (r8 == 0) goto L98
            int r0 = r8.length()
            if (r0 != 0) goto La
            goto L98
        La:
            int r0 = r8.length()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            int r2 = r0 + 4
            r1.<init>(r2)
            r2 = 34
            r1.append(r2)
            r3 = 0
            r4 = 0
        L1c:
            if (r3 >= r0) goto L90
            char r5 = r8.charAt(r3)
            r6 = 12
            if (r5 == r6) goto L87
            r6 = 13
            if (r5 == r6) goto L84
            r6 = 92
            if (r5 == r2) goto L7d
            r7 = 47
            if (r5 == r7) goto L79
            if (r5 == r6) goto L7d
            switch(r5) {
                case 8: goto L4a;
                case 9: goto L47;
                case 10: goto L44;
                default: goto L37;
            }
        L37:
            r4 = 32
            if (r5 < r4) goto L55
            r4 = 128(0x80, float:1.8E-43)
            if (r5 < r4) goto L4d
            r4 = 160(0xa0, float:2.24E-43)
            if (r5 < r4) goto L55
            goto L4d
        L44:
            java.lang.String r4 = "\\n"
            goto L89
        L47:
            java.lang.String r4 = "\\t"
            goto L89
        L4a:
            java.lang.String r4 = "\\b"
            goto L89
        L4d:
            r4 = 8192(0x2000, float:1.148E-41)
            if (r5 < r4) goto L80
            r4 = 8448(0x2100, float:1.1838E-41)
            if (r5 >= r4) goto L80
        L55:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "000"
            r4.<init>(r6)
            java.lang.String r4 = l.C13540.m32584(r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "\\u"
            r6.<init>(r7)
            int r7 = r4.length()
            int r7 = r7 + (-4)
            java.lang.String r4 = r4.substring(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            goto L89
        L79:
            r7 = 60
            if (r4 != r7) goto L80
        L7d:
            r1.append(r6)
        L80:
            r1.append(r5)
            goto L8c
        L84:
            java.lang.String r4 = "\\r"
            goto L89
        L87:
            java.lang.String r4 = "\\f"
        L89:
            r1.append(r4)
        L8c:
            int r3 = r3 + 1
            r4 = r5
            goto L1c
        L90:
            r1.append(r2)
            java.lang.String r8 = r1.toString()
            return r8
        L98:
            java.lang.String r8 = "\"\""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.b.d(java.lang.String):java.lang.String");
    }
}
