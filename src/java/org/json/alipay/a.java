package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import l.C18307;

/* compiled from: N673 */
/* loaded from: classes2.dex */
public class a {
    public ArrayList a;

    public a() {
        this.a = new ArrayList();
    }

    public a(Object obj) {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            a(Array.get(obj, i));
        }
    }

    public a(String str) {
        this(new c(str));
    }

    public a(Collection collection) {
        this.a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(c cVar) {
        this();
        char c;
        ArrayList arrayList;
        Object d;
        char c2 = cVar.c();
        if (c2 == '[') {
            c = ']';
        } else {
            if (c2 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c3 = cVar.c();
            cVar.a();
            if (c3 == ',') {
                arrayList = this.a;
                d = null;
            } else {
                arrayList = this.a;
                d = cVar.d();
            }
            arrayList.add(d);
            char c4 = cVar.c();
            if (c4 != ')') {
                if (c4 != ',' && c4 != ';') {
                    if (c4 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c == c4) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c) + "'");
        } while (cVar.c() != ']');
    }

    public int a() {
        return this.a.size();
    }

    public Object a(int i) {
        Object b = b(i);
        if (b != null) {
            return b;
        }
        throw new JSONException(C18307.m42645(i, "JSONArray[", "] not found."));
    }

    public String a(String str) {
        int a = a();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < a; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.b(this.a.get(i)));
        }
        return stringBuffer.toString();
    }

    public a a(Object obj) {
        this.a.add(obj);
        return this;
    }

    public Object b(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return this.a.get(i);
    }

    public String toString() {
        try {
            return "[" + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }
}
